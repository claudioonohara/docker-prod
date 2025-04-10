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

@RestController(" APIServidorEfetivo ")
@RequestMapping(value = {"/", "/rest/"})
public final  class apiservidorefetivo_services_rest extends GxSpringBootRestService
{
   public static  class Gxep_servidorefetivo__postparm
   {
      public String  SDTCRServidorEfetivo ;
   }

   @PostMapping(value = {"/servidorEfetivo", "/rest/servidorEfetivo"}, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity gxep_servidorefetivo__post( @RequestBody com.projetopratico.apiservidorefetivo_servidorefetivo__post_RESTInterfaceIN gxep_servidorefetivo__postparm ) throws Exception
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
      if ( ! processHeaders("apiservidorefetivo",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = ResponseEntity.status(HttpStatus.NOT_MODIFIED);
         cleanup();
         return builder.build() ;
      }
      com.projetopratico.SdtSDTCRServidorEfetivo AV22SDTCRServidorEfetivo = new com.projetopratico.SdtSDTCRServidorEfetivo(remoteHandle, context);
      AV22SDTCRServidorEfetivo = (com.projetopratico.SdtSDTCRServidorEfetivo)gxep_servidorefetivo__postparm.getSDTCRServidorEfetivo().getSdt();
      com.projetopratico.SdtSDTCRServidorEfetivo [] AV23RetornoSDTCRServidorEfetivo = new com.projetopratico.SdtSDTCRServidorEfetivo[] { new com.projetopratico.SdtSDTCRServidorEfetivo() };
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV6Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.projetopratico.apiservidorefetivo worker = new com.projetopratico.apiservidorefetivo(remoteHandle, context);
         worker.gxep_servidorefetivo__post(AV22SDTCRServidorEfetivo,AV23RetornoSDTCRServidorEfetivo,AV6Messages );
         com.projetopratico.apiservidorefetivo_servidorefetivo__post_RESTInterfaceOUT data = new com.projetopratico.apiservidorefetivo_servidorefetivo__post_RESTInterfaceOUT();
         if ( AV23RetornoSDTCRServidorEfetivo[0].isNull() == 0 )
         {
            data.setRetornoSDTCRServidorEfetivo(new com.projetopratico.SdtSDTCRServidorEfetivo_RESTInterface(AV23RetornoSDTCRServidorEfetivo[0]));
         }
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

   @RequestMapping(value = {"/servidorEfetivo", "/rest/servidorEfetivo"}, method = RequestMethod.OPTIONS)
   public ResponseEntity GetOptionsservidorEfetivo__post( ) throws Exception
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

   public static  class Gxep_servidorefetivo__putparm
   {
      public String  pes_id ;
      public String  se_matricula ;
      public String  SDTCRServidorEfetivoAtualiza ;
   }

   @PutMapping(value = {"/servidorEfetivo/{pes_id}/{se_matricula}", "/rest/servidorEfetivo/{pes_id}/{se_matricula}"}, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity gxep_servidorefetivo__put( @PathVariable(value = "pes_id") String sAV7pes_id ,
                                                    @PathVariable(value = "se_matricula") String sAV9se_matricula ,
                                                    @RequestBody com.projetopratico.apiservidorefetivo_servidorefetivo__put_RESTInterfaceIN gxep_servidorefetivo__putparm ) throws Exception
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
      if ( ! processHeaders("apiservidorefetivo",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = ResponseEntity.status(HttpStatus.NOT_MODIFIED);
         cleanup();
         return builder.build() ;
      }
      int AV7pes_id;
      AV7pes_id = (int)(GXutil.lval( sAV7pes_id)) ;
      String AV9se_matricula;
      AV9se_matricula = sAV9se_matricula ;
      com.projetopratico.SdtSDTCRServidorEfetivoAtualiza AV24SDTCRServidorEfetivoAtualiza = new com.projetopratico.SdtSDTCRServidorEfetivoAtualiza(remoteHandle, context);
      AV24SDTCRServidorEfetivoAtualiza = (com.projetopratico.SdtSDTCRServidorEfetivoAtualiza)gxep_servidorefetivo__putparm.getSDTCRServidorEfetivoAtualiza().getSdt();
      com.projetopratico.SdtSDTCRServidorEfetivo [] AV23RetornoSDTCRServidorEfetivo = new com.projetopratico.SdtSDTCRServidorEfetivo[] { new com.projetopratico.SdtSDTCRServidorEfetivo() };
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV6Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.projetopratico.apiservidorefetivo worker = new com.projetopratico.apiservidorefetivo(remoteHandle, context);
         worker.gxep_servidorefetivo__put(AV7pes_id,AV9se_matricula,AV24SDTCRServidorEfetivoAtualiza,AV23RetornoSDTCRServidorEfetivo,AV6Messages );
         com.projetopratico.apiservidorefetivo_servidorefetivo__put_RESTInterfaceOUT data = new com.projetopratico.apiservidorefetivo_servidorefetivo__put_RESTInterfaceOUT();
         if ( AV23RetornoSDTCRServidorEfetivo[0].isNull() == 0 )
         {
            data.setRetornoSDTCRServidorEfetivo(new com.projetopratico.SdtSDTCRServidorEfetivo_RESTInterface(AV23RetornoSDTCRServidorEfetivo[0]));
         }
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

   @RequestMapping(value = {"/servidorEfetivo/{pes_id}/{se_matricula}", "/rest/servidorEfetivo/{pes_id}/{se_matricula}"}, method = RequestMethod.OPTIONS)
   public ResponseEntity GetOptionsservidorEfetivo__put( ) throws Exception
   {
      super.init( "OPTIONS" );
      return ResponseEntity.ok().allow(HttpMethod.OPTIONS, HttpMethod.HEAD, HttpMethod.PUT,HttpMethod.GET,HttpMethod.DELETE,HttpMethod.POST).build() ;
   }

   @GetMapping(value = {"/servidorEfetivo/{pes_id}/{se_matricula}", "/rest/servidorEfetivo/{pes_id}/{se_matricula}"}, produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity gxep_servidorefetivo__get( @PathVariable(value = "pes_id") String sAV7pes_id ,
                                                    @PathVariable(value = "se_matricula") String sAV9se_matricula ) throws Exception
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
      if ( ! processHeaders("apiservidorefetivo",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = ResponseEntity.status(HttpStatus.NOT_MODIFIED);
         cleanup();
         return builder.build() ;
      }
      int AV7pes_id;
      AV7pes_id = (int)(GXutil.lval( sAV7pes_id)) ;
      String AV9se_matricula;
      AV9se_matricula = sAV9se_matricula ;
      com.projetopratico.SdtSDTCRServidorEfetivo [] AV22SDTCRServidorEfetivo = new com.projetopratico.SdtSDTCRServidorEfetivo[] { new com.projetopratico.SdtSDTCRServidorEfetivo() };
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV6Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.projetopratico.apiservidorefetivo worker = new com.projetopratico.apiservidorefetivo(remoteHandle, context);
         worker.gxep_servidorefetivo__get(AV7pes_id,AV9se_matricula,AV22SDTCRServidorEfetivo,AV6Messages );
         com.projetopratico.apiservidorefetivo_servidorefetivo__get_RESTInterfaceOUT data = new com.projetopratico.apiservidorefetivo_servidorefetivo__get_RESTInterfaceOUT();
         if ( AV22SDTCRServidorEfetivo[0].isNull() == 0 )
         {
            data.setSDTCRServidorEfetivo(new com.projetopratico.SdtSDTCRServidorEfetivo_RESTInterface(AV22SDTCRServidorEfetivo[0]));
         }
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

   @DeleteMapping(value = {"/servidorEfetivo/{pes_id}/{se_matricula}", "/rest/servidorEfetivo/{pes_id}/{se_matricula}"}, produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity gxep_servidorefetivo__delete( @PathVariable(value = "pes_id") String sAV7pes_id ,
                                                       @PathVariable(value = "se_matricula") String sAV9se_matricula ) throws Exception
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
      if ( ! processHeaders("apiservidorefetivo",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = ResponseEntity.status(HttpStatus.NOT_MODIFIED);
         cleanup();
         return builder.build() ;
      }
      int AV7pes_id;
      AV7pes_id = (int)(GXutil.lval( sAV7pes_id)) ;
      String AV9se_matricula;
      AV9se_matricula = sAV9se_matricula ;
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV6Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.projetopratico.apiservidorefetivo worker = new com.projetopratico.apiservidorefetivo(remoteHandle, context);
         worker.gxep_servidorefetivo__delete(AV7pes_id,AV9se_matricula,AV6Messages );
         com.projetopratico.apiservidorefetivo_servidorefetivo__delete_RESTInterfaceOUT data = new com.projetopratico.apiservidorefetivo_servidorefetivo__delete_RESTInterfaceOUT();
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

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

}

