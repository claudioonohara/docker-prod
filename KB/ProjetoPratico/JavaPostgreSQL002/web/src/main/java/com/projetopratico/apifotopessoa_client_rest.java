package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class apifotopessoa_client_rest extends GXProcedure
{
   public apifotopessoa_client_rest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apifotopessoa_client_rest.class ), "" );
      initialize();
      gxProperties = new com.genexus.properties.GXObjectProperties() ;
   }

   public apifotopessoa_client_rest( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
      initialize();
      gxProperties = new com.genexus.properties.GXObjectProperties() ;
   }

   public apifotopessoa_client_rest( int remoteHandle ,
                                     ModelContext context ,
                                     com.genexus.properties.GXObjectProperties objectProperties )
   {
      super( remoteHandle , context, "" );
      initialize();
      this.setObjProperties(objectProperties);
      restLocation = gxProperties.getLocation();
   }

   public void execute( )
   {
      cleanup();
   }

   public void InitLocation( )
   {
      restLocation = new com.genexus.internet.Location() ;
      restLocation.setHost( "localhost" );
      restLocation.setPort( 8080 );
      restLocation.setBaseURL( "ProjetoPraticoJavaPostgreSQL/APIFotoPessoa" );
      gxProperties = new com.genexus.properties.GXObjectProperties() ;
   }

   public com.genexus.properties.GXObjectProperties getObjProperties( )
   {
      return gxProperties ;
   }

   public void setObjProperties(  com.genexus.properties.GXObjectProperties Value )
   {
      gxProperties = Value ;
   }


   public void gxep_fotopessoa__post( int in_AV10pes_id ,
                                      java.util.Date in_AV18fp_data ,
                                      String in_AV21fp_foto ,
                                      com.projetopratico.SdtSDTFotoPessoa [] arr_AV23SDTFotoPessoa ,
                                      GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV8Messages )
   {
      restClifotoPessoa__post = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restClifotoPessoa__post.addUploadFile(in_AV21fp_foto, in_AV21fp_foto);
      restLocation.setResourceName( "gxobject" );
      restClifotoPessoa__post.setLocation( restLocation );
      restClifotoPessoa__post.setHttpMethod( "POST" );
      restClifotoPessoa__post.RestExecute();
      if ( restClifotoPessoa__post.getErrorCode() == 0 )
      {
         aP2 = restClifotoPessoa__post.getBodyString("object_id");
      }
      restClifotoPessoa__post = new com.genexus.internet.GXRestAPIClient() ;
      restLocation.setResourceName( "fotoPessoa" );
      restClifotoPessoa__post.setLocation( restLocation );
      restClifotoPessoa__post.setHttpMethod( "POST" );
      restClifotoPessoa__post.addBodyVar("pes_id", in_AV10pes_id);
      restClifotoPessoa__post.addBodyVar("fp_data", in_AV18fp_data);
      restClifotoPessoa__post.addBodyVar("fp_foto", aP2);
      restClifotoPessoa__post.RestExecute();
      if ( restClifotoPessoa__post.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restClifotoPessoa__post.getErrorCode() );
         gxProperties.setErrorMessage( restClifotoPessoa__post.getErrorMessage() );
         gxProperties.setStatusCode( restClifotoPessoa__post.getStatusCode() );
      }
      else
      {
         arr_AV23SDTFotoPessoa[0] = restClifotoPessoa__post.getBodyObj("SDTFotoPessoa",com.projetopratico.SdtSDTFotoPessoa.class );
         arr_AV8Messages[0] = restClifotoPessoa__post.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* fotoPessoa__post Constructor */
   }

   public void gxep_fotopessoa__get( int in_AV5fp_id ,
                                     com.projetopratico.SdtSDTFotoPessoa [] arr_AV7fotoPessoa ,
                                     GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV8Messages )
   {
      restClifotoPessoa__get = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "fotoPessoa/"+GXutil.URLEncode(GXutil.ltrimstr(in_AV5fp_id,8,0)) );
      restClifotoPessoa__get.setLocation( restLocation );
      restClifotoPessoa__get.setHttpMethod( "GET" );
      restClifotoPessoa__get.RestExecute();
      if ( restClifotoPessoa__get.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restClifotoPessoa__get.getErrorCode() );
         gxProperties.setErrorMessage( restClifotoPessoa__get.getErrorMessage() );
         gxProperties.setStatusCode( restClifotoPessoa__get.getStatusCode() );
      }
      else
      {
         arr_AV7fotoPessoa[0] = restClifotoPessoa__get.getBodyObj("fotoPessoa",com.projetopratico.SdtSDTFotoPessoa.class );
         arr_AV8Messages[0] = restClifotoPessoa__get.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* fotoPessoa__get Constructor */
   }

   protected void cleanup( )
   {
      if ( initialized != 1 )
      {
      }
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      gxProperties = new com.genexus.properties.GXObjectProperties();
      restClifotoPessoa__post = new com.genexus.internet.GXRestAPIClient();
      aP2 = "" ;
      restClifotoPessoa__get = new com.genexus.internet.GXRestAPIClient();
   }

   protected short initialized ;
   protected String aP2 ;
   protected com.genexus.internet.Location restLocation ;
   protected com.genexus.internet.GXRestAPIClient restClifotoPessoa__post ;
   protected com.genexus.internet.GXRestAPIClient restClifotoPessoa__get ;
   protected com.genexus.properties.GXObjectProperties gxProperties ;
}

