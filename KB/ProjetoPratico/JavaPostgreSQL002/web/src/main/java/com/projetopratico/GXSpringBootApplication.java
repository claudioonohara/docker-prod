package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.Application;
import com.genexus.ApplicationContext;
import com.genexus.springboot.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.*;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

@Configuration
@SpringBootApplication
@ServletComponentScan
@Import({GXServletContextInitializer.class, GXMultiCall.class, GXImportSelector.class, GXConfig.class})
public class GXSpringBootApplication
{
   public static void main( String [] args )
   {
      SpringApplication.run(GXSpringBootApplication.class, args);
      Application.init(GXcfg.class);
      ApplicationContext.getInstance().setSpringBootApp(true);
   }

   @Bean
   public ServerEndpointExporter serverEndpointExporter( )
   {
      return new ServerEndpointExporter();
   }

}

