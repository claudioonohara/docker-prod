package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class apilotacao_client_rest extends GXProcedure
{
   public apilotacao_client_rest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apilotacao_client_rest.class ), "" );
      initialize();
      gxProperties = new com.genexus.properties.GXObjectProperties() ;
   }

   public apilotacao_client_rest( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
      initialize();
      gxProperties = new com.genexus.properties.GXObjectProperties() ;
   }

   public apilotacao_client_rest( int remoteHandle ,
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


   public void gxep_lotacao__post( com.projetopratico.SdtSDTCRLotacao in_AV18SDTCRLotacao ,
                                   com.projetopratico.SdtSDTCRLotacao [] arr_AV19RetornoSDTCRLotacao ,
                                   GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV8Messages )
   {
      restClilotacao__post = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "lotacao" );
      restClilotacao__post.setLocation( restLocation );
      restClilotacao__post.setHttpMethod( "POST" );
      restClilotacao__post.addBodyVar("SDTCRLotacao", in_AV18SDTCRLotacao);
      restClilotacao__post.RestExecute();
      if ( restClilotacao__post.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restClilotacao__post.getErrorCode() );
         gxProperties.setErrorMessage( restClilotacao__post.getErrorMessage() );
         gxProperties.setStatusCode( restClilotacao__post.getStatusCode() );
      }
      else
      {
         arr_AV19RetornoSDTCRLotacao[0] = restClilotacao__post.getBodyObj("RetornoSDTCRLotacao",com.projetopratico.SdtSDTCRLotacao.class );
         arr_AV8Messages[0] = restClilotacao__post.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* lotacao__post Constructor */
   }

   public void gxep_lotacao__put( int in_AV11lot_id ,
                                  com.projetopratico.SdtSDTCRLotacao in_AV18SDTCRLotacao ,
                                  com.projetopratico.SdtSDTCRLotacao [] arr_AV19RetornoSDTCRLotacao ,
                                  GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV8Messages )
   {
      restClilotacao__put = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "lotacao/"+GXutil.URLEncode(GXutil.ltrimstr(in_AV11lot_id,8,0)) );
      restClilotacao__put.setLocation( restLocation );
      restClilotacao__put.setHttpMethod( "PUT" );
      restClilotacao__put.addBodyVar("SDTCRLotacao", in_AV18SDTCRLotacao);
      restClilotacao__put.RestExecute();
      if ( restClilotacao__put.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restClilotacao__put.getErrorCode() );
         gxProperties.setErrorMessage( restClilotacao__put.getErrorMessage() );
         gxProperties.setStatusCode( restClilotacao__put.getStatusCode() );
      }
      else
      {
         arr_AV19RetornoSDTCRLotacao[0] = restClilotacao__put.getBodyObj("RetornoSDTCRLotacao",com.projetopratico.SdtSDTCRLotacao.class );
         arr_AV8Messages[0] = restClilotacao__put.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* lotacao__put Constructor */
   }

   public void gxep_lotacao__get( int in_AV11lot_id ,
                                  com.projetopratico.SdtSDTCRLotacao [] arr_AV18SDTCRLotacao ,
                                  GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV8Messages )
   {
      restClilotacao__get = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "lotacao/"+GXutil.URLEncode(GXutil.ltrimstr(in_AV11lot_id,8,0)) );
      restClilotacao__get.setLocation( restLocation );
      restClilotacao__get.setHttpMethod( "GET" );
      restClilotacao__get.RestExecute();
      if ( restClilotacao__get.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restClilotacao__get.getErrorCode() );
         gxProperties.setErrorMessage( restClilotacao__get.getErrorMessage() );
         gxProperties.setStatusCode( restClilotacao__get.getStatusCode() );
      }
      else
      {
         arr_AV18SDTCRLotacao[0] = restClilotacao__get.getBodyObj("SDTCRLotacao",com.projetopratico.SdtSDTCRLotacao.class );
         arr_AV8Messages[0] = restClilotacao__get.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* lotacao__get Constructor */
   }

   public void gxep_lotacao__delete( int in_AV11lot_id ,
                                     GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV8Messages )
   {
      restClilotacao__delete = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "lotacao/"+GXutil.URLEncode(GXutil.ltrimstr(in_AV11lot_id,8,0)) );
      restClilotacao__delete.setLocation( restLocation );
      restClilotacao__delete.setHttpMethod( "DELETE" );
      restClilotacao__delete.RestExecute();
      if ( restClilotacao__delete.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restClilotacao__delete.getErrorCode() );
         gxProperties.setErrorMessage( restClilotacao__delete.getErrorMessage() );
         gxProperties.setStatusCode( restClilotacao__delete.getStatusCode() );
      }
      else
      {
         arr_AV8Messages[0] = restClilotacao__delete.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* lotacao__delete Constructor */
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
      restClilotacao__post = new com.genexus.internet.GXRestAPIClient();
      restClilotacao__put = new com.genexus.internet.GXRestAPIClient();
      restClilotacao__get = new com.genexus.internet.GXRestAPIClient();
      restClilotacao__delete = new com.genexus.internet.GXRestAPIClient();
   }

   protected short initialized ;
   protected com.genexus.internet.Location restLocation ;
   protected com.genexus.internet.GXRestAPIClient restClilotacao__post ;
   protected com.genexus.internet.GXRestAPIClient restClilotacao__put ;
   protected com.genexus.internet.GXRestAPIClient restClilotacao__get ;
   protected com.genexus.internet.GXRestAPIClient restClilotacao__delete ;
   protected com.genexus.properties.GXObjectProperties gxProperties ;
}

