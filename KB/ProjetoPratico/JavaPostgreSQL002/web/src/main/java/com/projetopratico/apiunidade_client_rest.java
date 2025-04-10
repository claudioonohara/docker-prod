package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class apiunidade_client_rest extends GXProcedure
{
   public apiunidade_client_rest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apiunidade_client_rest.class ), "" );
      initialize();
      gxProperties = new com.genexus.properties.GXObjectProperties() ;
   }

   public apiunidade_client_rest( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
      initialize();
      gxProperties = new com.genexus.properties.GXObjectProperties() ;
   }

   public apiunidade_client_rest( int remoteHandle ,
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
      restLocation.setBaseURL( "ProjetoPraticoJavaPostgreSQL/" );
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


   public void gxep_unidade__post( com.projetopratico.SdtSDTCRUnidade in_AV27SDTCRUnidade ,
                                   com.projetopratico.SdtSDTCRUnidade [] arr_AV31RetornoSDTCRUnidade ,
                                   GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      restCliunidade__post = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "unidade" );
      restCliunidade__post.setLocation( restLocation );
      restCliunidade__post.setHttpMethod( "POST" );
      restCliunidade__post.addBodyVar("SDTCRUnidade", in_AV27SDTCRUnidade);
      restCliunidade__post.RestExecute();
      if ( restCliunidade__post.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliunidade__post.getErrorCode() );
         gxProperties.setErrorMessage( restCliunidade__post.getErrorMessage() );
         gxProperties.setStatusCode( restCliunidade__post.getStatusCode() );
      }
      else
      {
         arr_AV31RetornoSDTCRUnidade[0] = restCliunidade__post.getBodyObj("RetornoSDTCRUnidade",com.projetopratico.SdtSDTCRUnidade.class );
         arr_AV5Messages[0] = restCliunidade__post.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* unidade__post Constructor */
   }

   public void gxep_unidade__put( int in_AV21unid_id ,
                                  com.projetopratico.SdtSDTCRUnidade in_AV27SDTCRUnidade ,
                                  com.projetopratico.SdtSDTCRUnidade [] arr_AV31RetornoSDTCRUnidade ,
                                  GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      restCliunidade__put = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "unidade/"+GXutil.URLEncode(GXutil.ltrimstr(in_AV21unid_id,8,0)) );
      restCliunidade__put.setLocation( restLocation );
      restCliunidade__put.setHttpMethod( "PUT" );
      restCliunidade__put.addBodyVar("SDTCRUnidade", in_AV27SDTCRUnidade);
      restCliunidade__put.RestExecute();
      if ( restCliunidade__put.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliunidade__put.getErrorCode() );
         gxProperties.setErrorMessage( restCliunidade__put.getErrorMessage() );
         gxProperties.setStatusCode( restCliunidade__put.getStatusCode() );
      }
      else
      {
         arr_AV31RetornoSDTCRUnidade[0] = restCliunidade__put.getBodyObj("RetornoSDTCRUnidade",com.projetopratico.SdtSDTCRUnidade.class );
         arr_AV5Messages[0] = restCliunidade__put.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* unidade__put Constructor */
   }

   public void gxep_unidade__get( int in_AV21unid_id ,
                                  com.projetopratico.SdtSDTCRUnidade [] arr_AV27SDTCRUnidade ,
                                  GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      restCliunidade__get = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "unidade/"+GXutil.URLEncode(GXutil.ltrimstr(in_AV21unid_id,8,0)) );
      restCliunidade__get.setLocation( restLocation );
      restCliunidade__get.setHttpMethod( "GET" );
      restCliunidade__get.RestExecute();
      if ( restCliunidade__get.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliunidade__get.getErrorCode() );
         gxProperties.setErrorMessage( restCliunidade__get.getErrorMessage() );
         gxProperties.setStatusCode( restCliunidade__get.getStatusCode() );
      }
      else
      {
         arr_AV27SDTCRUnidade[0] = restCliunidade__get.getBodyObj("SDTCRUnidade",com.projetopratico.SdtSDTCRUnidade.class );
         arr_AV5Messages[0] = restCliunidade__get.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* unidade__get Constructor */
   }

   public void gxep_unidade__delete( int in_AV21unid_id ,
                                     GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      restCliunidade__delete = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "unidade/"+GXutil.URLEncode(GXutil.ltrimstr(in_AV21unid_id,8,0)) );
      restCliunidade__delete.setLocation( restLocation );
      restCliunidade__delete.setHttpMethod( "DELETE" );
      restCliunidade__delete.RestExecute();
      if ( restCliunidade__delete.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliunidade__delete.getErrorCode() );
         gxProperties.setErrorMessage( restCliunidade__delete.getErrorMessage() );
         gxProperties.setStatusCode( restCliunidade__delete.getStatusCode() );
      }
      else
      {
         arr_AV5Messages[0] = restCliunidade__delete.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* unidade__delete Constructor */
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
      restCliunidade__post = new com.genexus.internet.GXRestAPIClient();
      restCliunidade__put = new com.genexus.internet.GXRestAPIClient();
      restCliunidade__get = new com.genexus.internet.GXRestAPIClient();
      restCliunidade__delete = new com.genexus.internet.GXRestAPIClient();
   }

   protected short initialized ;
   protected com.genexus.internet.Location restLocation ;
   protected com.genexus.internet.GXRestAPIClient restCliunidade__post ;
   protected com.genexus.internet.GXRestAPIClient restCliunidade__put ;
   protected com.genexus.internet.GXRestAPIClient restCliunidade__get ;
   protected com.genexus.internet.GXRestAPIClient restCliunidade__delete ;
   protected com.genexus.properties.GXObjectProperties gxProperties ;
}

