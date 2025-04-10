package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class apiservidorefetivo_client_rest extends GXProcedure
{
   public apiservidorefetivo_client_rest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apiservidorefetivo_client_rest.class ), "" );
      initialize();
      gxProperties = new com.genexus.properties.GXObjectProperties() ;
   }

   public apiservidorefetivo_client_rest( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context, "" );
      initialize();
      gxProperties = new com.genexus.properties.GXObjectProperties() ;
   }

   public apiservidorefetivo_client_rest( int remoteHandle ,
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


   public void gxep_servidorefetivo__post( com.projetopratico.SdtSDTCRServidorEfetivo in_AV22SDTCRServidorEfetivo ,
                                           com.projetopratico.SdtSDTCRServidorEfetivo [] arr_AV23RetornoSDTCRServidorEfetivo ,
                                           GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV6Messages )
   {
      restCliservidorEfetivo__post = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "servidorEfetivo" );
      restCliservidorEfetivo__post.setLocation( restLocation );
      restCliservidorEfetivo__post.setHttpMethod( "POST" );
      restCliservidorEfetivo__post.addBodyVar("SDTCRServidorEfetivo", in_AV22SDTCRServidorEfetivo);
      restCliservidorEfetivo__post.RestExecute();
      if ( restCliservidorEfetivo__post.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliservidorEfetivo__post.getErrorCode() );
         gxProperties.setErrorMessage( restCliservidorEfetivo__post.getErrorMessage() );
         gxProperties.setStatusCode( restCliservidorEfetivo__post.getStatusCode() );
      }
      else
      {
         arr_AV23RetornoSDTCRServidorEfetivo[0] = restCliservidorEfetivo__post.getBodyObj("RetornoSDTCRServidorEfetivo",com.projetopratico.SdtSDTCRServidorEfetivo.class );
         arr_AV6Messages[0] = restCliservidorEfetivo__post.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* servidorEfetivo__post Constructor */
   }

   public void gxep_servidorefetivo__put( int in_AV7pes_id ,
                                          String in_AV9se_matricula ,
                                          com.projetopratico.SdtSDTCRServidorEfetivoAtualiza in_AV24SDTCRServidorEfetivoAtualiza ,
                                          com.projetopratico.SdtSDTCRServidorEfetivo [] arr_AV23RetornoSDTCRServidorEfetivo ,
                                          GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV6Messages )
   {
      restCliservidorEfetivo__put = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "servidorEfetivo/"+GXutil.URLEncode(GXutil.ltrimstr(in_AV7pes_id,8,0))+"/"+GXutil.URLEncode(GXutil.rtrim(in_AV9se_matricula)) );
      restCliservidorEfetivo__put.setLocation( restLocation );
      restCliservidorEfetivo__put.setHttpMethod( "PUT" );
      restCliservidorEfetivo__put.addBodyVar("SDTCRServidorEfetivoAtualiza", in_AV24SDTCRServidorEfetivoAtualiza);
      restCliservidorEfetivo__put.RestExecute();
      if ( restCliservidorEfetivo__put.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliservidorEfetivo__put.getErrorCode() );
         gxProperties.setErrorMessage( restCliservidorEfetivo__put.getErrorMessage() );
         gxProperties.setStatusCode( restCliservidorEfetivo__put.getStatusCode() );
      }
      else
      {
         arr_AV23RetornoSDTCRServidorEfetivo[0] = restCliservidorEfetivo__put.getBodyObj("RetornoSDTCRServidorEfetivo",com.projetopratico.SdtSDTCRServidorEfetivo.class );
         arr_AV6Messages[0] = restCliservidorEfetivo__put.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* servidorEfetivo__put Constructor */
   }

   public void gxep_servidorefetivo__get( int in_AV7pes_id ,
                                          String in_AV9se_matricula ,
                                          com.projetopratico.SdtSDTCRServidorEfetivo [] arr_AV22SDTCRServidorEfetivo ,
                                          GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV6Messages )
   {
      restCliservidorEfetivo__get = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "servidorEfetivo/"+GXutil.URLEncode(GXutil.ltrimstr(in_AV7pes_id,8,0))+"/"+GXutil.URLEncode(GXutil.rtrim(in_AV9se_matricula)) );
      restCliservidorEfetivo__get.setLocation( restLocation );
      restCliservidorEfetivo__get.setHttpMethod( "GET" );
      restCliservidorEfetivo__get.RestExecute();
      if ( restCliservidorEfetivo__get.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliservidorEfetivo__get.getErrorCode() );
         gxProperties.setErrorMessage( restCliservidorEfetivo__get.getErrorMessage() );
         gxProperties.setStatusCode( restCliservidorEfetivo__get.getStatusCode() );
      }
      else
      {
         arr_AV22SDTCRServidorEfetivo[0] = restCliservidorEfetivo__get.getBodyObj("SDTCRServidorEfetivo",com.projetopratico.SdtSDTCRServidorEfetivo.class );
         arr_AV6Messages[0] = restCliservidorEfetivo__get.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* servidorEfetivo__get Constructor */
   }

   public void gxep_servidorefetivo__delete( int in_AV7pes_id ,
                                             String in_AV9se_matricula ,
                                             GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV6Messages )
   {
      restCliservidorEfetivo__delete = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "servidorEfetivo/"+GXutil.URLEncode(GXutil.ltrimstr(in_AV7pes_id,8,0))+"/"+GXutil.URLEncode(GXutil.rtrim(in_AV9se_matricula)) );
      restCliservidorEfetivo__delete.setLocation( restLocation );
      restCliservidorEfetivo__delete.setHttpMethod( "DELETE" );
      restCliservidorEfetivo__delete.RestExecute();
      if ( restCliservidorEfetivo__delete.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliservidorEfetivo__delete.getErrorCode() );
         gxProperties.setErrorMessage( restCliservidorEfetivo__delete.getErrorMessage() );
         gxProperties.setStatusCode( restCliservidorEfetivo__delete.getStatusCode() );
      }
      else
      {
         arr_AV6Messages[0] = restCliservidorEfetivo__delete.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* servidorEfetivo__delete Constructor */
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
      restCliservidorEfetivo__post = new com.genexus.internet.GXRestAPIClient();
      restCliservidorEfetivo__put = new com.genexus.internet.GXRestAPIClient();
      restCliservidorEfetivo__get = new com.genexus.internet.GXRestAPIClient();
      restCliservidorEfetivo__delete = new com.genexus.internet.GXRestAPIClient();
   }

   protected short initialized ;
   protected com.genexus.internet.Location restLocation ;
   protected com.genexus.internet.GXRestAPIClient restCliservidorEfetivo__post ;
   protected com.genexus.internet.GXRestAPIClient restCliservidorEfetivo__put ;
   protected com.genexus.internet.GXRestAPIClient restCliservidorEfetivo__get ;
   protected com.genexus.internet.GXRestAPIClient restCliservidorEfetivo__delete ;
   protected com.genexus.properties.GXObjectProperties gxProperties ;
}

