package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class apiauth_client_rest extends GXProcedure
{
   public apiauth_client_rest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apiauth_client_rest.class ), "" );
      initialize();
      gxProperties = new com.genexus.properties.GXObjectProperties() ;
   }

   public apiauth_client_rest( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
      initialize();
      gxProperties = new com.genexus.properties.GXObjectProperties() ;
   }

   public apiauth_client_rest( int remoteHandle ,
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


   public void gxep_auth( String in_AV7username ,
                          String in_AV8password ,
                          String [] arr_AV9token ,
                          String [] arr_AV10refreshToken ,
                          GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV6Messages )
   {
      restCliauth = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "auth" );
      restCliauth.setLocation( restLocation );
      restCliauth.setHttpMethod( "POST" );
      restCliauth.addBodyVar("username", in_AV7username);
      restCliauth.addBodyVar("password", in_AV8password);
      restCliauth.RestExecute();
      if ( restCliauth.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliauth.getErrorCode() );
         gxProperties.setErrorMessage( restCliauth.getErrorMessage() );
         gxProperties.setStatusCode( restCliauth.getStatusCode() );
      }
      else
      {
         arr_AV9token[0] = restCliauth.getBodyString("token");
         arr_AV10refreshToken[0] = restCliauth.getBodyString("refreshToken");
         arr_AV6Messages[0] = restCliauth.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* auth Constructor */
   }

   public void gxep_refresh( String in_AV10refreshToken ,
                             String [] arr_AV9token ,
                             GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV6Messages )
   {
      restClirefresh = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "refresh" );
      restClirefresh.setLocation( restLocation );
      restClirefresh.setHttpMethod( "POST" );
      restClirefresh.addBodyVar("refreshToken", in_AV10refreshToken);
      restClirefresh.RestExecute();
      if ( restClirefresh.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restClirefresh.getErrorCode() );
         gxProperties.setErrorMessage( restClirefresh.getErrorMessage() );
         gxProperties.setStatusCode( restClirefresh.getStatusCode() );
      }
      else
      {
         arr_AV9token[0] = restClirefresh.getBodyString("token");
         arr_AV6Messages[0] = restClirefresh.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* refresh Constructor */
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
      restCliauth = new com.genexus.internet.GXRestAPIClient();
      restClirefresh = new com.genexus.internet.GXRestAPIClient();
   }

   protected short initialized ;
   protected com.genexus.internet.Location restLocation ;
   protected com.genexus.internet.GXRestAPIClient restCliauth ;
   protected com.genexus.internet.GXRestAPIClient restClirefresh ;
   protected com.genexus.properties.GXObjectProperties gxProperties ;
}

