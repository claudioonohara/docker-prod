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

@RestController(" APIServidorTemporario ")
@RequestMapping(value = {"/", "/rest/"})
public final  class apiservidortemporario_services_rest extends GxSpringBootRestService
{
   public static  class Gxep_servidortemporario__postparm
   {
      public String  SDTCRServidorTemporario ;
   }

   @PostMapping(value = {"/servidorTemporario", "/rest/servidorTemporario"}, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity gxep_servidortemporario__post( @RequestBody com.projetopratico.apiservidortemporario_servidortemporario__post_RESTInterfaceIN gxep_servidortemporario__postparm ) throws Exception
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
      if ( ! processHeaders("apiservidortemporario",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = ResponseEntity.status(HttpStatus.NOT_MODIFIED);
         cleanup();
         return builder.build() ;
      }
      com.projetopratico.SdtSDTCRServidorTemporario AV22SDTCRServidorTemporario = new com.projetopratico.SdtSDTCRServidorTemporario(remoteHandle, context);
      AV22SDTCRServidorTemporario = (com.projetopratico.SdtSDTCRServidorTemporario)gxep_servidortemporario__postparm.getSDTCRServidorTemporario().getSdt();
      com.projetopratico.SdtSDTCRServidorTemporario [] AV23RetornoSDTCRServidorTemporario = new com.projetopratico.SdtSDTCRServidorTemporario[] { new com.projetopratico.SdtSDTCRServidorTemporario() };
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV5Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.projetopratico.apiservidortemporario worker = new com.projetopratico.apiservidortemporario(remoteHandle, context);
         worker.gxep_servidortemporario__post(AV22SDTCRServidorTemporario,AV23RetornoSDTCRServidorTemporario,AV5Messages );
         com.projetopratico.apiservidortemporario_servidortemporario__post_RESTInterfaceOUT data = new com.projetopratico.apiservidortemporario_servidortemporario__post_RESTInterfaceOUT();
         if ( AV23RetornoSDTCRServidorTemporario[0].isNull() == 0 )
         {
            data.setRetornoSDTCRServidorTemporario(new com.projetopratico.SdtSDTCRServidorTemporario_RESTInterface(AV23RetornoSDTCRServidorTemporario[0]));
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

   @RequestMapping(value = {"/servidorTemporario", "/rest/servidorTemporario"}, method = RequestMethod.OPTIONS)
   public ResponseEntity GetOptionsservidorTemporario__post( ) throws Exception
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

   public static  class Gxep_servidortemporario__putparm
   {
      public String  pes_id ;
      public String  st_data_admissao ;
      public String  st_data_demissao ;
      public String  SDTCRServidorTemporarioAtualiza ;
   }

   @PutMapping(value = {"/servidorTemporario/{pes_id}/{st_data_admissao}/{st_data_demissao}", "/rest/servidorTemporario/{pes_id}/{st_data_admissao}/{st_data_demissao}"}, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity gxep_servidortemporario__put( @PathVariable(value = "pes_id") String sAV6pes_id ,
                                                       @PathVariable(value = "st_data_admissao") String sAV17st_data_admissao ,
                                                       @PathVariable(value = "st_data_demissao") String sAV18st_data_demissao ,
                                                       @RequestBody com.projetopratico.apiservidortemporario_servidortemporario__put_RESTInterfaceIN gxep_servidortemporario__putparm ) throws Exception
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
      if ( ! processHeaders("apiservidortemporario",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = ResponseEntity.status(HttpStatus.NOT_MODIFIED);
         cleanup();
         return builder.build() ;
      }
      int AV6pes_id;
      AV6pes_id = (int)(GXutil.lval( sAV6pes_id)) ;
      java.util.Date AV17st_data_admissao;
      AV17st_data_admissao = GXutil.charToDateREST( sAV17st_data_admissao) ;
      java.util.Date AV18st_data_demissao;
      AV18st_data_demissao = GXutil.charToDateREST( sAV18st_data_demissao) ;
      com.projetopratico.SdtSDTCRServidorTemporarioAtualiza AV24SDTCRServidorTemporarioAtualiza = new com.projetopratico.SdtSDTCRServidorTemporarioAtualiza(remoteHandle, context);
      AV24SDTCRServidorTemporarioAtualiza = (com.projetopratico.SdtSDTCRServidorTemporarioAtualiza)gxep_servidortemporario__putparm.getSDTCRServidorTemporarioAtualiza().getSdt();
      com.projetopratico.SdtSDTCRServidorTemporario [] AV23RetornoSDTCRServidorTemporario = new com.projetopratico.SdtSDTCRServidorTemporario[] { new com.projetopratico.SdtSDTCRServidorTemporario() };
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV5Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.projetopratico.apiservidortemporario worker = new com.projetopratico.apiservidortemporario(remoteHandle, context);
         worker.gxep_servidortemporario__put(AV6pes_id,AV17st_data_admissao,AV18st_data_demissao,AV24SDTCRServidorTemporarioAtualiza,AV23RetornoSDTCRServidorTemporario,AV5Messages );
         com.projetopratico.apiservidortemporario_servidortemporario__put_RESTInterfaceOUT data = new com.projetopratico.apiservidortemporario_servidortemporario__put_RESTInterfaceOUT();
         if ( AV23RetornoSDTCRServidorTemporario[0].isNull() == 0 )
         {
            data.setRetornoSDTCRServidorTemporario(new com.projetopratico.SdtSDTCRServidorTemporario_RESTInterface(AV23RetornoSDTCRServidorTemporario[0]));
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

   @RequestMapping(value = {"/servidorTemporario/{pes_id}/{st_data_admissao}/{st_data_demissao}", "/rest/servidorTemporario/{pes_id}/{st_data_admissao}/{st_data_demissao}"}, method = RequestMethod.OPTIONS)
   public ResponseEntity GetOptionsservidorTemporario__put( ) throws Exception
   {
      super.init( "OPTIONS" );
      return ResponseEntity.ok().allow(HttpMethod.OPTIONS, HttpMethod.HEAD, HttpMethod.PUT,HttpMethod.GET,HttpMethod.DELETE,HttpMethod.POST).build() ;
   }

   @GetMapping(value = {"/servidorTemporario/{pes_id}/{st_data_admissao}/{st_data_demissao}", "/rest/servidorTemporario/{pes_id}/{st_data_admissao}/{st_data_demissao}"}, produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity gxep_servidortemporario__get( @PathVariable(value = "pes_id") String sAV6pes_id ,
                                                       @PathVariable(value = "st_data_admissao") String sAV17st_data_admissao ,
                                                       @PathVariable(value = "st_data_demissao") String sAV18st_data_demissao ) throws Exception
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
      if ( ! processHeaders("apiservidortemporario",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = ResponseEntity.status(HttpStatus.NOT_MODIFIED);
         cleanup();
         return builder.build() ;
      }
      int AV6pes_id;
      AV6pes_id = (int)(GXutil.lval( sAV6pes_id)) ;
      java.util.Date AV17st_data_admissao;
      AV17st_data_admissao = GXutil.charToDateREST( sAV17st_data_admissao) ;
      java.util.Date AV18st_data_demissao;
      AV18st_data_demissao = GXutil.charToDateREST( sAV18st_data_demissao) ;
      com.projetopratico.SdtSDTCRServidorTemporario [] AV23RetornoSDTCRServidorTemporario = new com.projetopratico.SdtSDTCRServidorTemporario[] { new com.projetopratico.SdtSDTCRServidorTemporario() };
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV5Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.projetopratico.apiservidortemporario worker = new com.projetopratico.apiservidortemporario(remoteHandle, context);
         worker.gxep_servidortemporario__get(AV6pes_id,AV17st_data_admissao,AV18st_data_demissao,AV23RetornoSDTCRServidorTemporario,AV5Messages );
         com.projetopratico.apiservidortemporario_servidortemporario__get_RESTInterfaceOUT data = new com.projetopratico.apiservidortemporario_servidortemporario__get_RESTInterfaceOUT();
         if ( AV23RetornoSDTCRServidorTemporario[0].isNull() == 0 )
         {
            data.setRetornoSDTCRServidorTemporario(new com.projetopratico.SdtSDTCRServidorTemporario_RESTInterface(AV23RetornoSDTCRServidorTemporario[0]));
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

   @DeleteMapping(value = {"/servidorTemporario/{pes_id}/{st_data_admissao}/{st_data_demissao}", "/rest/servidorTemporario/{pes_id}/{st_data_admissao}/{st_data_demissao}"}, produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity gxep_servidortemporario__delete( @PathVariable(value = "pes_id") String sAV6pes_id ,
                                                          @PathVariable(value = "st_data_admissao") String sAV17st_data_admissao ,
                                                          @PathVariable(value = "st_data_demissao") String sAV18st_data_demissao ) throws Exception
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
      if ( ! processHeaders("apiservidortemporario",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = ResponseEntity.status(HttpStatus.NOT_MODIFIED);
         cleanup();
         return builder.build() ;
      }
      int AV6pes_id;
      AV6pes_id = (int)(GXutil.lval( sAV6pes_id)) ;
      java.util.Date AV17st_data_admissao;
      AV17st_data_admissao = GXutil.charToDateREST( sAV17st_data_admissao) ;
      java.util.Date AV18st_data_demissao;
      AV18st_data_demissao = GXutil.charToDateREST( sAV18st_data_demissao) ;
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV5Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.projetopratico.apiservidortemporario worker = new com.projetopratico.apiservidortemporario(remoteHandle, context);
         worker.gxep_servidortemporario__delete(AV6pes_id,AV17st_data_admissao,AV18st_data_demissao,AV5Messages );
         com.projetopratico.apiservidortemporario_servidortemporario__delete_RESTInterfaceOUT data = new com.projetopratico.apiservidortemporario_servidortemporario__delete_RESTInterfaceOUT();
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

