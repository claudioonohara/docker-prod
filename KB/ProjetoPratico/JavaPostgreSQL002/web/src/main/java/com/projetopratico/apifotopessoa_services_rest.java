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

@RestController(" APIFotoPessoa ")
@RequestMapping(value = {"/APIFotoPessoa", "/rest/APIFotoPessoa"})
public final  class apifotopessoa_services_rest extends GxSpringBootRestService
{
   public static  class Gxep_fotopessoa__postparm
   {
      public String  pes_id ;
      public String  fp_data ;
      public String  fp_foto ;
   }

   @PostMapping(value = {"/fotoPessoa", "/rest/fotoPessoa"}, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity gxep_fotopessoa__post( @RequestBody com.projetopratico.apifotopessoa_fotopessoa__post_RESTInterfaceIN gxep_fotopessoa__postparm ) throws Exception
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
      if ( ! processHeaders("apifotopessoa",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = ResponseEntity.status(HttpStatus.NOT_MODIFIED);
         cleanup();
         return builder.build() ;
      }
      int AV10pes_id;
      AV10pes_id = (int)(GXutil.lval( gxep_fotopessoa__postparm.getpes_id())) ;
      java.util.Date AV18fp_data;
      AV18fp_data = GXutil.charToDateREST( gxep_fotopessoa__postparm.getfp_data()) ;
      String AV21fp_foto;
      AV21fp_foto = gxep_fotopessoa__postparm.getfp_foto() ;
      com.projetopratico.SdtSDTFotoPessoa [] AV23SDTFotoPessoa = new com.projetopratico.SdtSDTFotoPessoa[] { new com.projetopratico.SdtSDTFotoPessoa() };
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV8Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.projetopratico.apifotopessoa worker = new com.projetopratico.apifotopessoa(remoteHandle, context);
         worker.gxep_fotopessoa__post(AV10pes_id,AV18fp_data,AV21fp_foto,AV23SDTFotoPessoa,AV8Messages );
         com.projetopratico.apifotopessoa_fotopessoa__post_RESTInterfaceOUT data = new com.projetopratico.apifotopessoa_fotopessoa__post_RESTInterfaceOUT();
         if ( AV23SDTFotoPessoa[0].isNull() == 0 )
         {
            data.setSDTFotoPessoa(new com.projetopratico.SdtSDTFotoPessoa_RESTInterface(AV23SDTFotoPessoa[0]));
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

   @RequestMapping(value = {"/fotoPessoa", "/rest/fotoPessoa"}, method = RequestMethod.OPTIONS)
   public ResponseEntity GetOptionsfotoPessoa__post( ) throws Exception
   {
      super.init( "OPTIONS" );
      return ResponseEntity.ok().allow(HttpMethod.OPTIONS, HttpMethod.HEAD, HttpMethod.POST,HttpMethod.GET).build() ;
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

   @GetMapping(value = {"/fotoPessoa/{fp_id}", "/rest/fotoPessoa/{fp_id}"}, produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity gxep_fotopessoa__get( @PathVariable(value = "fp_id") String sAV5fp_id ) throws Exception
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
      if ( ! processHeaders("apifotopessoa",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = ResponseEntity.status(HttpStatus.NOT_MODIFIED);
         cleanup();
         return builder.build() ;
      }
      int AV5fp_id;
      AV5fp_id = (int)(GXutil.lval( sAV5fp_id)) ;
      com.projetopratico.SdtSDTFotoPessoa [] AV7fotoPessoa = new com.projetopratico.SdtSDTFotoPessoa[] { new com.projetopratico.SdtSDTFotoPessoa() };
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV8Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.projetopratico.apifotopessoa worker = new com.projetopratico.apifotopessoa(remoteHandle, context);
         worker.gxep_fotopessoa__get(AV5fp_id,AV7fotoPessoa,AV8Messages );
         com.projetopratico.apifotopessoa_fotopessoa__get_RESTInterfaceOUT data = new com.projetopratico.apifotopessoa_fotopessoa__get_RESTInterfaceOUT();
         if ( AV7fotoPessoa[0].isNull() == 0 )
         {
            data.setfotoPessoa(new com.projetopratico.SdtSDTFotoPessoa_RESTInterface(AV7fotoPessoa[0]));
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

   @RequestMapping(value = {"/fotoPessoa/{fp_id}", "/rest/fotoPessoa/{fp_id}"}, method = RequestMethod.OPTIONS)
   public ResponseEntity GetOptionsfotoPessoa__get( ) throws Exception
   {
      super.init( "OPTIONS" );
      return ResponseEntity.ok().allow(HttpMethod.OPTIONS, HttpMethod.HEAD, HttpMethod.GET,HttpMethod.POST).build() ;
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   @PostMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
   @RequestMapping(value = {"gxobject", "/restgxobject"})
   public ResponseEntity Upload( ) throws Exception
   {
      super.init( "POST" );
      ResponseEntity.BodyBuilder builder = null;
      try
      {
         com.genexus.webpanels.GXObjectUploadServices gxObjectUpload = new com.genexus.webpanels.GXObjectUploadServices();
         String data = gxObjectUpload.doInternalRestExecute(restHttpContext);
         cleanup();
         builder = ResponseEntity.status(HttpStatus.CREATED);
         builder.header("GeneXus-Object-Id", gxObjectUpload.getKeyId());
         return builder.body(data) ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

}

