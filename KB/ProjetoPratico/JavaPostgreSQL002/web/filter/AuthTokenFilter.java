package com.projetopratico.filter;

import com.projetopratico.*;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.springboot.GxSpringBootRestService;
import com.genexus.ws.rs.core.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

public class AuthTokenFilter implements Filter {
    private final TokenValidator tokenValidator;
    private final List<String> excludedPaths = Arrays.asList("/auth", "/refresh");

    public AuthTokenFilter() {
        // Initialize the TokenValidator object
        this.tokenValidator = new TokenValidator();
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        // Get the request URI without the context path
        String requestURI = req.getRequestURI().substring(req.getContextPath().length());

        // Skip validation for excluded paths
        if (excludedPaths.contains(requestURI)) {
            chain.doFilter(request, response);
            return;
        }

        String token = req.getHeader("Authorization");

        // Prepare parameters for pvalidtoken
        String[] errorMessage = new String[1]; // To capture the error message
        boolean isValid = tokenValidator.validate(token, errorMessage);

        if (!isValid) {
            // Send the error message in the response
            res.sendError(401, errorMessage[0] != null ? errorMessage[0] : "Unauthorized");
            return;
        }

        chain.doFilter(request, response);
    }
}