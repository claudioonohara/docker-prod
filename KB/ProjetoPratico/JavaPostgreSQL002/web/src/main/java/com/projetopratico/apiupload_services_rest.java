package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.springboot.GxSpringBootRestService;
import com.genexus.ws.rs.core.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController(" APIUpload ")
@RequestMapping(value = {"/APIUpload", "/rest/APIUpload"})
public final  class apiupload_services_rest extends GxSpringBootRestService
{
   public static  class Gxep_uploadfotoparm
   {
   }

   @PostMapping(value = {"/uploadFoto", "/rest/uploadFoto"}, produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity gxep_uploadfoto( ) throws Exception
   {
      super.init( "POST" );
      ResponseEntity.BodyBuilder builder = null;
      permissionPrefix = "";
      if ( ! isAuthenticated(myServletRequestWrapper) )
      {
         if ( forbidden )
         {
            builder = ResponseEntity.status(HttpStatus.FORBIDDEN);
         }
         else
         {
            setWWWAuthHeader(myServletRequestWrapper, myServletResponseWrapper);
            builder = ResponseEntity.status(HttpStatus.UNAUTHORIZED);
         }
         builder.contentType(MediaType.APPLICATION_JSON);
         cleanup();
         return builder.body(errorJson.toString()) ;
      }
      if ( ! processHeaders("apiupload",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = ResponseEntity.status(HttpStatus.NOT_MODIFIED);
         cleanup();
         return builder.build() ;
      }
      try
      {
         com.projetopratico.apiupload worker = new com.projetopratico.apiupload(remoteHandle, context);
         worker.gxep_uploadfoto( );
         cleanup();
         return ResponseEntity.ok().build() ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

   @RequestMapping(value = {"/uploadFoto", "/rest/uploadFoto"}, method = RequestMethod.OPTIONS)
   public ResponseEntity GetOptionsuploadFoto( ) throws Exception
   {
      super.init( "OPTIONS" );
      return ResponseEntity.ok().allow(HttpMethod.OPTIONS, HttpMethod.HEAD, HttpMethod.POST).build() ;
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

}

