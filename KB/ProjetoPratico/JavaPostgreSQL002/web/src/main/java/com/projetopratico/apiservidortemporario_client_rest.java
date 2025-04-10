package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class apiservidortemporario_client_rest extends GXProcedure
{
   public apiservidortemporario_client_rest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apiservidortemporario_client_rest.class ), "" );
      initialize();
      gxProperties = new com.genexus.properties.GXObjectProperties() ;
   }

   public apiservidortemporario_client_rest( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle , context, "" );
      initialize();
      gxProperties = new com.genexus.properties.GXObjectProperties() ;
   }

   public apiservidortemporario_client_rest( int remoteHandle ,
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


   public void gxep_servidortemporario__post( com.projetopratico.SdtSDTCRServidorTemporario in_AV22SDTCRServidorTemporario ,
                                              com.projetopratico.SdtSDTCRServidorTemporario [] arr_AV23RetornoSDTCRServidorTemporario ,
                                              GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      restCliservidorTemporario__post = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "servidorTemporario" );
      restCliservidorTemporario__post.setLocation( restLocation );
      restCliservidorTemporario__post.setHttpMethod( "POST" );
      restCliservidorTemporario__post.addBodyVar("SDTCRServidorTemporario", in_AV22SDTCRServidorTemporario);
      restCliservidorTemporario__post.RestExecute();
      if ( restCliservidorTemporario__post.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliservidorTemporario__post.getErrorCode() );
         gxProperties.setErrorMessage( restCliservidorTemporario__post.getErrorMessage() );
         gxProperties.setStatusCode( restCliservidorTemporario__post.getStatusCode() );
      }
      else
      {
         arr_AV23RetornoSDTCRServidorTemporario[0] = restCliservidorTemporario__post.getBodyObj("RetornoSDTCRServidorTemporario",com.projetopratico.SdtSDTCRServidorTemporario.class );
         arr_AV5Messages[0] = restCliservidorTemporario__post.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* servidorTemporario__post Constructor */
   }

   public void gxep_servidortemporario__put( int in_AV6pes_id ,
                                             java.util.Date in_AV17st_data_admissao ,
                                             java.util.Date in_AV18st_data_demissao ,
                                             com.projetopratico.SdtSDTCRServidorTemporarioAtualiza in_AV24SDTCRServidorTemporarioAtualiza ,
                                             com.projetopratico.SdtSDTCRServidorTemporario [] arr_AV23RetornoSDTCRServidorTemporario ,
                                             GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      restCliservidorTemporario__put = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "servidorTemporario/"+GXutil.URLEncode(GXutil.ltrimstr(in_AV6pes_id,8,0))+"/"+GXutil.URLEncode(GXutil.dateToCharREST(in_AV17st_data_admissao))+"/"+GXutil.URLEncode(GXutil.dateToCharREST(in_AV18st_data_demissao)) );
      restCliservidorTemporario__put.setLocation( restLocation );
      restCliservidorTemporario__put.setHttpMethod( "PUT" );
      restCliservidorTemporario__put.addBodyVar("SDTCRServidorTemporarioAtualiza", in_AV24SDTCRServidorTemporarioAtualiza);
      restCliservidorTemporario__put.RestExecute();
      if ( restCliservidorTemporario__put.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliservidorTemporario__put.getErrorCode() );
         gxProperties.setErrorMessage( restCliservidorTemporario__put.getErrorMessage() );
         gxProperties.setStatusCode( restCliservidorTemporario__put.getStatusCode() );
      }
      else
      {
         arr_AV23RetornoSDTCRServidorTemporario[0] = restCliservidorTemporario__put.getBodyObj("RetornoSDTCRServidorTemporario",com.projetopratico.SdtSDTCRServidorTemporario.class );
         arr_AV5Messages[0] = restCliservidorTemporario__put.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* servidorTemporario__put Constructor */
   }

   public void gxep_servidortemporario__get( int in_AV6pes_id ,
                                             java.util.Date in_AV17st_data_admissao ,
                                             java.util.Date in_AV18st_data_demissao ,
                                             com.projetopratico.SdtSDTCRServidorTemporario [] arr_AV23RetornoSDTCRServidorTemporario ,
                                             GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      restCliservidorTemporario__get = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "servidorTemporario/"+GXutil.URLEncode(GXutil.ltrimstr(in_AV6pes_id,8,0))+"/"+GXutil.URLEncode(GXutil.dateToCharREST(in_AV17st_data_admissao))+"/"+GXutil.URLEncode(GXutil.dateToCharREST(in_AV18st_data_demissao)) );
      restCliservidorTemporario__get.setLocation( restLocation );
      restCliservidorTemporario__get.setHttpMethod( "GET" );
      restCliservidorTemporario__get.RestExecute();
      if ( restCliservidorTemporario__get.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliservidorTemporario__get.getErrorCode() );
         gxProperties.setErrorMessage( restCliservidorTemporario__get.getErrorMessage() );
         gxProperties.setStatusCode( restCliservidorTemporario__get.getStatusCode() );
      }
      else
      {
         arr_AV23RetornoSDTCRServidorTemporario[0] = restCliservidorTemporario__get.getBodyObj("RetornoSDTCRServidorTemporario",com.projetopratico.SdtSDTCRServidorTemporario.class );
         arr_AV5Messages[0] = restCliservidorTemporario__get.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* servidorTemporario__get Constructor */
   }

   public void gxep_servidortemporario__delete( int in_AV6pes_id ,
                                                java.util.Date in_AV17st_data_admissao ,
                                                java.util.Date in_AV18st_data_demissao ,
                                                GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      restCliservidorTemporario__delete = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "servidorTemporario/"+GXutil.URLEncode(GXutil.ltrimstr(in_AV6pes_id,8,0))+"/"+GXutil.URLEncode(GXutil.dateToCharREST(in_AV17st_data_admissao))+"/"+GXutil.URLEncode(GXutil.dateToCharREST(in_AV18st_data_demissao)) );
      restCliservidorTemporario__delete.setLocation( restLocation );
      restCliservidorTemporario__delete.setHttpMethod( "DELETE" );
      restCliservidorTemporario__delete.RestExecute();
      if ( restCliservidorTemporario__delete.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliservidorTemporario__delete.getErrorCode() );
         gxProperties.setErrorMessage( restCliservidorTemporario__delete.getErrorMessage() );
         gxProperties.setStatusCode( restCliservidorTemporario__delete.getStatusCode() );
      }
      else
      {
         arr_AV5Messages[0] = restCliservidorTemporario__delete.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* servidorTemporario__delete Constructor */
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
      restCliservidorTemporario__post = new com.genexus.internet.GXRestAPIClient();
      restCliservidorTemporario__put = new com.genexus.internet.GXRestAPIClient();
      restCliservidorTemporario__get = new com.genexus.internet.GXRestAPIClient();
      restCliservidorTemporario__delete = new com.genexus.internet.GXRestAPIClient();
   }

   protected short initialized ;
   protected com.genexus.internet.Location restLocation ;
   protected com.genexus.internet.GXRestAPIClient restCliservidorTemporario__post ;
   protected com.genexus.internet.GXRestAPIClient restCliservidorTemporario__put ;
   protected com.genexus.internet.GXRestAPIClient restCliservidorTemporario__get ;
   protected com.genexus.internet.GXRestAPIClient restCliservidorTemporario__delete ;
   protected com.genexus.properties.GXObjectProperties gxProperties ;
}

