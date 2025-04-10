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

@RestController(" PFotoPessoa ")
@RequestMapping(value = {"/PFotoPessoa", "/rest/PFotoPessoa"})
public final  class pfotopessoa_services_rest extends GxSpringBootRestService
{
   @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity execute( @RequestBody com.projetopratico.pfotopessoa_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      ResponseEntity.BodyBuilder builder = null;
      int AV8pes_id;
      AV8pes_id = (int)(GXutil.lval( entity.getpes_id())) ;
      String [] AV9foto = new String[] { "" };
      AV9foto[0] = entity.getfoto() ;
      if ( ! processHeaders("pfotopessoa",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = ResponseEntity.status(HttpStatus.NOT_MODIFIED);
         cleanup();
         return builder.build() ;
      }
      try
      {
         com.projetopratico.pfotopessoa_impl worker = new com.projetopratico.pfotopessoa_impl(remoteHandle, context);
         worker.execute_int(AV8pes_id,AV9foto );
         com.projetopratico.pfotopessoa_RESTInterfaceOUT data = new com.projetopratico.pfotopessoa_RESTInterfaceOUT();
         data.setfoto(AV9foto[0]);
         builder = ResponseEntity.ok();
         cleanup();
         return builder.body(data) ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
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

   @RequestMapping(value = "", method = RequestMethod.OPTIONS)
   public ResponseEntity optionsMethod( ) throws Exception
   {
      super.init( "OPTIONS" );
      return ResponseEntity.ok().allow(HttpMethod.OPTIONS, HttpMethod.POST).build() ;
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

