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

@RestController(" APIConsulta ")
@RequestMapping(value = {"/consulta", "/rest/consulta"})
public final  class apiconsulta_services_rest extends GxSpringBootRestService
{
   @GetMapping(value = {"/efetivosUnidade", "/rest/efetivosUnidade"}, produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity gxep_efetivosunidade( @RequestParam(value = "Unidid", defaultValue = "") String sAV14unidid ,
                                               @RequestParam(value = "Paginaatual", defaultValue = "") String sAV15PaginaAtual ,
                                               @RequestParam(value = "Nroporpagina", defaultValue = "") String sAV16nroPorPagina ) throws Exception
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
      if ( ! processHeaders("apiconsulta",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = ResponseEntity.status(HttpStatus.NOT_MODIFIED);
         cleanup();
         return builder.build() ;
      }
      short AV14unidid;
      AV14unidid = (short)(GXutil.lval( sAV14unidid)) ;
      int AV15PaginaAtual;
      AV15PaginaAtual = (int)(GXutil.lval( sAV15PaginaAtual)) ;
      int AV16nroPorPagina;
      AV16nroPorPagina = (int)(GXutil.lval( sAV16nroPorPagina)) ;
      com.projetopratico.SdtSDTEfetivosUnidade [] AV7SDTEfetivosUnidade = new com.projetopratico.SdtSDTEfetivosUnidade[] { new com.projetopratico.SdtSDTEfetivosUnidade() };
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV5Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.projetopratico.apiconsulta worker = new com.projetopratico.apiconsulta(remoteHandle, context);
         worker.gxep_efetivosunidade(AV14unidid,AV15PaginaAtual,AV16nroPorPagina,AV7SDTEfetivosUnidade,AV5Messages );
         com.projetopratico.apiconsulta_efetivosunidade_RESTInterfaceOUT data = new com.projetopratico.apiconsulta_efetivosunidade_RESTInterfaceOUT();
         if ( AV7SDTEfetivosUnidade[0].isNull() == 0 )
         {
            data.setSDTEfetivosUnidade(new com.projetopratico.SdtSDTEfetivosUnidade_RESTInterface(AV7SDTEfetivosUnidade[0]));
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

   @RequestMapping(value = {"/efetivosUnidade", "/rest/efetivosUnidade"}, method = RequestMethod.OPTIONS)
   public ResponseEntity GetOptionsefetivosUnidade( ) throws Exception
   {
      super.init( "OPTIONS" );
      return ResponseEntity.ok().allow(HttpMethod.OPTIONS, HttpMethod.HEAD, HttpMethod.GET).build() ;
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

   @GetMapping(value = {"/enderecoFuncional", "/rest/enderecoFuncional"}, produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity gxep_enderecofuncional( @RequestParam(value = "Pes_nome", defaultValue = "") String sAV11pes_nome ,
                                                 @RequestParam(value = "Paginaatual", defaultValue = "") String sAV15PaginaAtual ,
                                                 @RequestParam(value = "Nroporpagina", defaultValue = "") String sAV16nroPorPagina ) throws Exception
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
      if ( ! processHeaders("apiconsulta",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = ResponseEntity.status(HttpStatus.NOT_MODIFIED);
         cleanup();
         return builder.build() ;
      }
      String AV11pes_nome;
      AV11pes_nome = sAV11pes_nome ;
      int AV15PaginaAtual;
      AV15PaginaAtual = (int)(GXutil.lval( sAV15PaginaAtual)) ;
      int AV16nroPorPagina;
      AV16nroPorPagina = (int)(GXutil.lval( sAV16nroPorPagina)) ;
      com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional [] AV13SDTServidorEfetivoEnderecoFuncional = new com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional[] { new com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional() };
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV5Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.projetopratico.apiconsulta worker = new com.projetopratico.apiconsulta(remoteHandle, context);
         worker.gxep_enderecofuncional(AV11pes_nome,AV15PaginaAtual,AV16nroPorPagina,AV13SDTServidorEfetivoEnderecoFuncional,AV5Messages );
         com.projetopratico.apiconsulta_enderecofuncional_RESTInterfaceOUT data = new com.projetopratico.apiconsulta_enderecofuncional_RESTInterfaceOUT();
         if ( AV13SDTServidorEfetivoEnderecoFuncional[0].isNull() == 0 )
         {
            data.setSDTServidorEfetivoEnderecoFuncional(new com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_RESTInterface(AV13SDTServidorEfetivoEnderecoFuncional[0]));
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

   @RequestMapping(value = {"/enderecoFuncional", "/rest/enderecoFuncional"}, method = RequestMethod.OPTIONS)
   public ResponseEntity GetOptionsenderecoFuncional( ) throws Exception
   {
      super.init( "OPTIONS" );
      return ResponseEntity.ok().allow(HttpMethod.OPTIONS, HttpMethod.HEAD, HttpMethod.GET).build() ;
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

