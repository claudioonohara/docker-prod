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

@RestController(" APIUnidade ")
@RequestMapping(value = {"/", "/rest/"})
public final  class apiunidade_services_rest extends GxSpringBootRestService
{
   public static  class Gxep_unidade__postparm
   {
      public String  SDTCRUnidade ;
   }

   @PostMapping(value = {"/unidade", "/rest/unidade"}, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity gxep_unidade__post( @RequestBody com.projetopratico.apiunidade_unidade__post_RESTInterfaceIN gxep_unidade__postparm ) throws Exception
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
      if ( ! processHeaders("apiunidade",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = ResponseEntity.status(HttpStatus.NOT_MODIFIED);
         cleanup();
         return builder.build() ;
      }
      com.projetopratico.SdtSDTCRUnidade AV27SDTCRUnidade = new com.projetopratico.SdtSDTCRUnidade(remoteHandle, context);
      AV27SDTCRUnidade = (com.projetopratico.SdtSDTCRUnidade)gxep_unidade__postparm.getSDTCRUnidade().getSdt();
      com.projetopratico.SdtSDTCRUnidade [] AV31RetornoSDTCRUnidade = new com.projetopratico.SdtSDTCRUnidade[] { new com.projetopratico.SdtSDTCRUnidade() };
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV5Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.projetopratico.apiunidade worker = new com.projetopratico.apiunidade(remoteHandle, context);
         worker.gxep_unidade__post(AV27SDTCRUnidade,AV31RetornoSDTCRUnidade,AV5Messages );
         com.projetopratico.apiunidade_unidade__post_RESTInterfaceOUT data = new com.projetopratico.apiunidade_unidade__post_RESTInterfaceOUT();
         if ( AV31RetornoSDTCRUnidade[0].isNull() == 0 )
         {
            data.setRetornoSDTCRUnidade(new com.projetopratico.SdtSDTCRUnidade_RESTInterface(AV31RetornoSDTCRUnidade[0]));
         }
         data.setMessages(SdtMessages_Message_RESTInterfacefromGXObjectCollection(AV5Messages[0]));
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

   @RequestMapping(value = {"/unidade", "/rest/unidade"}, method = RequestMethod.OPTIONS)
   public ResponseEntity GetOptionsunidade__post( ) throws Exception
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

   public static  class Gxep_unidade__putparm
   {
      public String  unid_id ;
      public String  SDTCRUnidade ;
   }

   @PutMapping(value = {"/unidade/{unid_id}", "/rest/unidade/{unid_id}"}, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity gxep_unidade__put( @PathVariable(value = "unid_id") String sAV21unid_id ,
                                            @RequestBody com.projetopratico.apiunidade_unidade__put_RESTInterfaceIN gxep_unidade__putparm ) throws Exception
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
      if ( ! processHeaders("apiunidade",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = ResponseEntity.status(HttpStatus.NOT_MODIFIED);
         cleanup();
         return builder.build() ;
      }
      int AV21unid_id;
      AV21unid_id = (int)(GXutil.lval( sAV21unid_id)) ;
      com.projetopratico.SdtSDTCRUnidade AV27SDTCRUnidade = new com.projetopratico.SdtSDTCRUnidade(remoteHandle, context);
      AV27SDTCRUnidade = (com.projetopratico.SdtSDTCRUnidade)gxep_unidade__putparm.getSDTCRUnidade().getSdt();
      com.projetopratico.SdtSDTCRUnidade [] AV31RetornoSDTCRUnidade = new com.projetopratico.SdtSDTCRUnidade[] { new com.projetopratico.SdtSDTCRUnidade() };
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV5Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.projetopratico.apiunidade worker = new com.projetopratico.apiunidade(remoteHandle, context);
         worker.gxep_unidade__put(AV21unid_id,AV27SDTCRUnidade,AV31RetornoSDTCRUnidade,AV5Messages );
         com.projetopratico.apiunidade_unidade__put_RESTInterfaceOUT data = new com.projetopratico.apiunidade_unidade__put_RESTInterfaceOUT();
         if ( AV31RetornoSDTCRUnidade[0].isNull() == 0 )
         {
            data.setRetornoSDTCRUnidade(new com.projetopratico.SdtSDTCRUnidade_RESTInterface(AV31RetornoSDTCRUnidade[0]));
         }
         data.setMessages(SdtMessages_Message_RESTInterfacefromGXObjectCollection(AV5Messages[0]));
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

   @RequestMapping(value = {"/unidade/{unid_id}", "/rest/unidade/{unid_id}"}, method = RequestMethod.OPTIONS)
   public ResponseEntity GetOptionsunidade__put( ) throws Exception
   {
      super.init( "OPTIONS" );
      return ResponseEntity.ok().allow(HttpMethod.OPTIONS, HttpMethod.HEAD, HttpMethod.PUT,HttpMethod.GET,HttpMethod.DELETE,HttpMethod.POST).build() ;
   }

   @GetMapping(value = {"/unidade/{unid_id}", "/rest/unidade/{unid_id}"}, produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity gxep_unidade__get( @PathVariable(value = "unid_id") String sAV21unid_id ) throws Exception
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
      if ( ! processHeaders("apiunidade",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = ResponseEntity.status(HttpStatus.NOT_MODIFIED);
         cleanup();
         return builder.build() ;
      }
      int AV21unid_id;
      AV21unid_id = (int)(GXutil.lval( sAV21unid_id)) ;
      com.projetopratico.SdtSDTCRUnidade [] AV27SDTCRUnidade = new com.projetopratico.SdtSDTCRUnidade[] { new com.projetopratico.SdtSDTCRUnidade() };
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV5Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.projetopratico.apiunidade worker = new com.projetopratico.apiunidade(remoteHandle, context);
         worker.gxep_unidade__get(AV21unid_id,AV27SDTCRUnidade,AV5Messages );
         com.projetopratico.apiunidade_unidade__get_RESTInterfaceOUT data = new com.projetopratico.apiunidade_unidade__get_RESTInterfaceOUT();
         if ( AV27SDTCRUnidade[0].isNull() == 0 )
         {
            data.setSDTCRUnidade(new com.projetopratico.SdtSDTCRUnidade_RESTInterface(AV27SDTCRUnidade[0]));
         }
         data.setMessages(SdtMessages_Message_RESTInterfacefromGXObjectCollection(AV5Messages[0]));
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

   @DeleteMapping(value = {"/unidade/{unid_id}", "/rest/unidade/{unid_id}"}, produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity gxep_unidade__delete( @PathVariable(value = "unid_id") String sAV21unid_id ) throws Exception
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
      if ( ! processHeaders("apiunidade",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = ResponseEntity.status(HttpStatus.NOT_MODIFIED);
         cleanup();
         return builder.build() ;
      }
      int AV21unid_id;
      AV21unid_id = (int)(GXutil.lval( sAV21unid_id)) ;
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV5Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.projetopratico.apiunidade worker = new com.projetopratico.apiunidade(remoteHandle, context);
         worker.gxep_unidade__delete(AV21unid_id,AV5Messages );
         com.projetopratico.apiunidade_unidade__delete_RESTInterfaceOUT data = new com.projetopratico.apiunidade_unidade__delete_RESTInterfaceOUT();
         data.setMessages(SdtMessages_Message_RESTInterfacefromGXObjectCollection(AV5Messages[0]));
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

