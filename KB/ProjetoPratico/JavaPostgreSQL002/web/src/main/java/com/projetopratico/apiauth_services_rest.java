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

@RestController(" APIAuth ")
@RequestMapping(value = {"/", "/rest/"})
public final  class apiauth_services_rest extends GxSpringBootRestService
{
   public static  class Gxep_authparm
   {
      public String  username ;
      public String  password ;
   }

   @PostMapping(value = {"/auth", "/rest/auth"}, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity gxep_auth( @RequestBody com.projetopratico.apiauth_auth_RESTInterfaceIN gxep_authparm ) throws Exception
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
      if ( ! processHeaders("apiauth",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = ResponseEntity.status(HttpStatus.NOT_MODIFIED);
         cleanup();
         return builder.build() ;
      }
      String AV7username;
      AV7username = gxep_authparm.getusername() ;
      String AV8password;
      AV8password = gxep_authparm.getpassword() ;
      String [] AV9token = new String[] { "" };
      String [] AV10refreshToken = new String[] { "" };
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV6Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.projetopratico.apiauth worker = new com.projetopratico.apiauth(remoteHandle, context);
         worker.gxep_auth(AV7username,AV8password,AV9token,AV10refreshToken,AV6Messages );
         com.projetopratico.apiauth_auth_RESTInterfaceOUT data = new com.projetopratico.apiauth_auth_RESTInterfaceOUT();
         data.settoken(AV9token[0]);
         data.setrefreshToken(AV10refreshToken[0]);
         data.setMessages(SdtMessages_Message_RESTInterfacefromGXObjectCollection(AV6Messages[0]));
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

   @RequestMapping(value = {"/auth", "/rest/auth"}, method = RequestMethod.OPTIONS)
   public ResponseEntity GetOptionsauth( ) throws Exception
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

   public static  class Gxep_refreshparm
   {
      public String  refreshToken ;
   }

   @PostMapping(value = {"/refresh", "/rest/refresh"}, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity gxep_refresh( @RequestBody com.projetopratico.apiauth_refresh_RESTInterfaceIN gxep_refreshparm ) throws Exception
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
      if ( ! processHeaders("apiauth",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = ResponseEntity.status(HttpStatus.NOT_MODIFIED);
         cleanup();
         return builder.build() ;
      }
      String AV10refreshToken;
      AV10refreshToken = gxep_refreshparm.getrefreshToken() ;
      String [] AV9token = new String[] { "" };
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV6Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.projetopratico.apiauth worker = new com.projetopratico.apiauth(remoteHandle, context);
         worker.gxep_refresh(AV10refreshToken,AV9token,AV6Messages );
         com.projetopratico.apiauth_refresh_RESTInterfaceOUT data = new com.projetopratico.apiauth_refresh_RESTInterfaceOUT();
         data.settoken(AV9token[0]);
         data.setMessages(SdtMessages_Message_RESTInterfacefromGXObjectCollection(AV6Messages[0]));
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

   @RequestMapping(value = {"/refresh", "/rest/refresh"}, method = RequestMethod.OPTIONS)
   public ResponseEntity GetOptionsrefresh( ) throws Exception
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

