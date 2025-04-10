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

@RestController(" APIVariavel ")
@RequestMapping(value = {"/APIVariavel", "/rest/APIVariavel"})
public final  class apivariavel_services_rest extends GxSpringBootRestService
{
   public static  class Gxep_variavelparm
   {
      public String  variavel ;
      public String  filename ;
   }

   @PostMapping(value = {"/variavel", "/rest/variavel"}, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity gxep_variavel( @RequestBody com.projetopratico.apivariavel_variavel_RESTInterfaceIN gxep_variavelparm ) throws Exception
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
      if ( ! processHeaders("apivariavel",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = ResponseEntity.status(HttpStatus.NOT_MODIFIED);
         cleanup();
         return builder.build() ;
      }
      String AV5variavel;
      AV5variavel = gxep_variavelparm.getvariavel() ;
      String AV7filename;
      AV7filename = gxep_variavelparm.getfilename() ;
      String [] AV6resultado = new String[] { "" };
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV8Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.projetopratico.apivariavel worker = new com.projetopratico.apivariavel(remoteHandle, context);
         worker.gxep_variavel(AV5variavel,AV7filename,AV6resultado,AV8Messages );
         com.projetopratico.apivariavel_variavel_RESTInterfaceOUT data = new com.projetopratico.apivariavel_variavel_RESTInterfaceOUT();
         data.setresultado(AV6resultado[0]);
         data.setMessages(SdtMessages_Message_RESTInterfacefromGXObjectCollection(AV8Messages[0]));
         builder = ResponseEntity.ok();
         if ( worker.getrestcode() != 0 )
         {
            builder = ResponseEntity.status(worker.getrestcode());
         }
         cleanup();
         return builder.body(data) ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

   @RequestMapping(value = {"/variavel", "/rest/variavel"}, method = RequestMethod.OPTIONS)
   public ResponseEntity GetOptionsvariavel( ) throws Exception
   {
      super.init( "OPTIONS" );
      return ResponseEntity.ok().allow(HttpMethod.OPTIONS, HttpMethod.HEAD, HttpMethod.POST).build() ;
   }

   private Vector<com.genexus.SdtMessages_Message_RESTInterface> SdtMessages_Message_RESTInterfacefromGXObjectCollection( @RequestBody GXBaseCollection<com.genexus.SdtMessages_Message> collection )
   {
      Vector<com.genexus.SdtMessages_Message_RESTInterface> result = new Vector<com.genexus.SdtMessages_Message_RESTInterface>();
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.addElement(new com.genexus.SdtMessages_Message_RESTInterface((com.genexus.SdtMessages_Message)collection.elementAt(i)));
      }
      return result ;
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

