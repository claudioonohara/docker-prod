package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class apivariavel_client_rest extends GXProcedure
{
   public apivariavel_client_rest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apivariavel_client_rest.class ), "" );
      initialize();
      gxProperties = new com.genexus.properties.GXObjectProperties() ;
   }

   public apivariavel_client_rest( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
      initialize();
      gxProperties = new com.genexus.properties.GXObjectProperties() ;
   }

   public apivariavel_client_rest( int remoteHandle ,
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
      restLocation.setBaseURL( "ProjetoPraticoJavaPostgreSQL/APIVariavel" );
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


   public void gxep_variavel( String in_AV5variavel ,
                              String in_AV7filename ,
                              String [] arr_AV6resultado ,
                              GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV8Messages )
   {
      restClivariavel = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "variavel" );
      restClivariavel.setLocation( restLocation );
      restClivariavel.setHttpMethod( "POST" );
      restClivariavel.addBodyVar("variavel", in_AV5variavel);
      restClivariavel.addBodyVar("filename", in_AV7filename);
      restClivariavel.RestExecute();
      if ( restClivariavel.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restClivariavel.getErrorCode() );
         gxProperties.setErrorMessage( restClivariavel.getErrorMessage() );
         gxProperties.setStatusCode( restClivariavel.getStatusCode() );
      }
      else
      {
         arr_AV6resultado[0] = restClivariavel.getBodyString("resultado");
         arr_AV8Messages[0] = restClivariavel.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* variavel Constructor */
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
      restClivariavel = new com.genexus.internet.GXRestAPIClient();
   }

   protected short initialized ;
   protected com.genexus.internet.Location restLocation ;
   protected com.genexus.internet.GXRestAPIClient restClivariavel ;
   protected com.genexus.properties.GXObjectProperties gxProperties ;
}

