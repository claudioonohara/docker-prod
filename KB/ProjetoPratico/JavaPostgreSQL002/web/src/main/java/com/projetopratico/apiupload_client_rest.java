package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class apiupload_client_rest extends GXProcedure
{
   public apiupload_client_rest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apiupload_client_rest.class ), "" );
      initialize();
      gxProperties = new com.genexus.properties.GXObjectProperties() ;
   }

   public apiupload_client_rest( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
      initialize();
      gxProperties = new com.genexus.properties.GXObjectProperties() ;
   }

   public apiupload_client_rest( int remoteHandle ,
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
      restLocation.setBaseURL( "ProjetoPraticoJavaPostgreSQL/APIUpload" );
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


   public void gxep_uploadfoto( )
   {
      restCliuploadFoto = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "uploadFoto" );
      restCliuploadFoto.setLocation( restLocation );
      restCliuploadFoto.setHttpMethod( "POST" );
      restCliuploadFoto.RestExecute();
      if ( restCliuploadFoto.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliuploadFoto.getErrorCode() );
         gxProperties.setErrorMessage( restCliuploadFoto.getErrorMessage() );
         gxProperties.setStatusCode( restCliuploadFoto.getStatusCode() );
      }
      else
      {
      }
      /* uploadFoto Constructor */
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
      restCliuploadFoto = new com.genexus.internet.GXRestAPIClient();
   }

   protected short initialized ;
   protected com.genexus.internet.Location restLocation ;
   protected com.genexus.internet.GXRestAPIClient restCliuploadFoto ;
   protected com.genexus.properties.GXObjectProperties gxProperties ;
}

