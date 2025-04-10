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

@RestController(" APILotacao ")
@RequestMapping(value = {"/", "/rest/"})
public final  class apilotacao_services_rest extends GxSpringBootRestService
{
   public static  class Gxep_lotacao__postparm
   {
      public String  SDTCRLotacao ;
   }

   @PostMapping(value = {"/lotacao", "/rest/lotacao"}, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity gxep_lotacao__post( @RequestBody com.projetopratico.apilotacao_lotacao__post_RESTInterfaceIN gxep_lotacao__postparm ) throws Exception
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
      if ( ! processHeaders("apilotacao",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = ResponseEntity.status(HttpStatus.NOT_MODIFIED);
         cleanup();
         return builder.build() ;
      }
      com.projetopratico.SdtSDTCRLotacao AV18SDTCRLotacao = new com.projetopratico.SdtSDTCRLotacao(remoteHandle, context);
      AV18SDTCRLotacao = (com.projetopratico.SdtSDTCRLotacao)gxep_lotacao__postparm.getSDTCRLotacao().getSdt();
      com.projetopratico.SdtSDTCRLotacao [] AV19RetornoSDTCRLotacao = new com.projetopratico.SdtSDTCRLotacao[] { new com.projetopratico.SdtSDTCRLotacao() };
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV8Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.projetopratico.apilotacao worker = new com.projetopratico.apilotacao(remoteHandle, context);
         worker.gxep_lotacao__post(AV18SDTCRLotacao,AV19RetornoSDTCRLotacao,AV8Messages );
         com.projetopratico.apilotacao_lotacao__post_RESTInterfaceOUT data = new com.projetopratico.apilotacao_lotacao__post_RESTInterfaceOUT();
         if ( AV19RetornoSDTCRLotacao[0].isNull() == 0 )
         {
            data.setRetornoSDTCRLotacao(new com.projetopratico.SdtSDTCRLotacao_RESTInterface(AV19RetornoSDTCRLotacao[0]));
         }
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

   @RequestMapping(value = {"/lotacao", "/rest/lotacao"}, method = RequestMethod.OPTIONS)
   public ResponseEntity GetOptionslotacao__post( ) throws Exception
   {
      super.init( "OPTIONS" );
      return ResponseEntity.ok().allow(HttpMethod.OPTIONS, HttpMethod.HEAD, HttpMethod.POST,HttpMethod.PUT,HttpMethod.GET,HttpMethod.DELETE).build() ;
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

   public static  class Gxep_lotacao__putparm
   {
      public String  lot_id ;
      public String  SDTCRLotacao ;
   }

   @PutMapping(value = {"/lotacao/{lot_id}", "/rest/lotacao/{lot_id}"}, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity gxep_lotacao__put( @PathVariable(value = "lot_id") String sAV11lot_id ,
                                            @RequestBody com.projetopratico.apilotacao_lotacao__put_RESTInterfaceIN gxep_lotacao__putparm ) throws Exception
   {
      super.init( "PUT" );
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
      if ( ! processHeaders("apilotacao",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = ResponseEntity.status(HttpStatus.NOT_MODIFIED);
         cleanup();
         return builder.build() ;
      }
      int AV11lot_id;
      AV11lot_id = (int)(GXutil.lval( sAV11lot_id)) ;
      com.projetopratico.SdtSDTCRLotacao AV18SDTCRLotacao = new com.projetopratico.SdtSDTCRLotacao(remoteHandle, context);
      AV18SDTCRLotacao = (com.projetopratico.SdtSDTCRLotacao)gxep_lotacao__putparm.getSDTCRLotacao().getSdt();
      com.projetopratico.SdtSDTCRLotacao [] AV19RetornoSDTCRLotacao = new com.projetopratico.SdtSDTCRLotacao[] { new com.projetopratico.SdtSDTCRLotacao() };
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV8Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.projetopratico.apilotacao worker = new com.projetopratico.apilotacao(remoteHandle, context);
         worker.gxep_lotacao__put(AV11lot_id,AV18SDTCRLotacao,AV19RetornoSDTCRLotacao,AV8Messages );
         com.projetopratico.apilotacao_lotacao__put_RESTInterfaceOUT data = new com.projetopratico.apilotacao_lotacao__put_RESTInterfaceOUT();
         if ( AV19RetornoSDTCRLotacao[0].isNull() == 0 )
         {
            data.setRetornoSDTCRLotacao(new com.projetopratico.SdtSDTCRLotacao_RESTInterface(AV19RetornoSDTCRLotacao[0]));
         }
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

   @RequestMapping(value = {"/lotacao/{lot_id}", "/rest/lotacao/{lot_id}"}, method = RequestMethod.OPTIONS)
   public ResponseEntity GetOptionslotacao__put( ) throws Exception
   {
      super.init( "OPTIONS" );
      return ResponseEntity.ok().allow(HttpMethod.OPTIONS, HttpMethod.HEAD, HttpMethod.PUT,HttpMethod.GET,HttpMethod.DELETE,HttpMethod.POST).build() ;
   }

   @GetMapping(value = {"/lotacao/{lot_id}", "/rest/lotacao/{lot_id}"}, produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity gxep_lotacao__get( @PathVariable(value = "lot_id") String sAV11lot_id ) throws Exception
   {
      super.init( "GET" );
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
      if ( ! processHeaders("apilotacao",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = ResponseEntity.status(HttpStatus.NOT_MODIFIED);
         cleanup();
         return builder.build() ;
      }
      int AV11lot_id;
      AV11lot_id = (int)(GXutil.lval( sAV11lot_id)) ;
      com.projetopratico.SdtSDTCRLotacao [] AV18SDTCRLotacao = new com.projetopratico.SdtSDTCRLotacao[] { new com.projetopratico.SdtSDTCRLotacao() };
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV8Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.projetopratico.apilotacao worker = new com.projetopratico.apilotacao(remoteHandle, context);
         worker.gxep_lotacao__get(AV11lot_id,AV18SDTCRLotacao,AV8Messages );
         com.projetopratico.apilotacao_lotacao__get_RESTInterfaceOUT data = new com.projetopratico.apilotacao_lotacao__get_RESTInterfaceOUT();
         if ( AV18SDTCRLotacao[0].isNull() == 0 )
         {
            data.setSDTCRLotacao(new com.projetopratico.SdtSDTCRLotacao_RESTInterface(AV18SDTCRLotacao[0]));
         }
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

   @DeleteMapping(value = {"/lotacao/{lot_id}", "/rest/lotacao/{lot_id}"}, produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity gxep_lotacao__delete( @PathVariable(value = "lot_id") String sAV11lot_id ) throws Exception
   {
      super.init( "DELETE" );
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
      if ( ! processHeaders("apilotacao",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = ResponseEntity.status(HttpStatus.NOT_MODIFIED);
         cleanup();
         return builder.build() ;
      }
      int AV11lot_id;
      AV11lot_id = (int)(GXutil.lval( sAV11lot_id)) ;
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV8Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.projetopratico.apilotacao worker = new com.projetopratico.apilotacao(remoteHandle, context);
         worker.gxep_lotacao__delete(AV11lot_id,AV8Messages );
         com.projetopratico.apilotacao_lotacao__delete_RESTInterfaceOUT data = new com.projetopratico.apilotacao_lotacao__delete_RESTInterfaceOUT();
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

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

}

