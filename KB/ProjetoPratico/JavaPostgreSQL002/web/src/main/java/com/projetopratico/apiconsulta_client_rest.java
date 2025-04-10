package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class apiconsulta_client_rest extends GXProcedure
{
   public apiconsulta_client_rest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apiconsulta_client_rest.class ), "" );
      initialize();
      gxProperties = new com.genexus.properties.GXObjectProperties() ;
   }

   public apiconsulta_client_rest( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
      initialize();
      gxProperties = new com.genexus.properties.GXObjectProperties() ;
   }

   public apiconsulta_client_rest( int remoteHandle ,
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
      restLocation.setBaseURL( "ProjetoPraticoJavaPostgreSQL/consulta" );
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


   public void gxep_efetivosunidade( short in_AV14unidid ,
                                     int in_AV15PaginaAtual ,
                                     int in_AV16nroPorPagina ,
                                     com.projetopratico.SdtSDTEfetivosUnidade [] arr_AV7SDTEfetivosUnidade ,
                                     GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      restCliefetivosUnidade = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "efetivosUnidade" );
      restCliefetivosUnidade.setLocation( restLocation );
      restCliefetivosUnidade.setHttpMethod( "GET" );
      restCliefetivosUnidade.addQueryVar("Unidid", in_AV14unidid);
      restCliefetivosUnidade.addQueryVar("Paginaatual", in_AV15PaginaAtual);
      restCliefetivosUnidade.addQueryVar("Nroporpagina", in_AV16nroPorPagina);
      restCliefetivosUnidade.RestExecute();
      if ( restCliefetivosUnidade.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliefetivosUnidade.getErrorCode() );
         gxProperties.setErrorMessage( restCliefetivosUnidade.getErrorMessage() );
         gxProperties.setStatusCode( restCliefetivosUnidade.getStatusCode() );
      }
      else
      {
         arr_AV7SDTEfetivosUnidade[0] = restCliefetivosUnidade.getBodyObj("SDTEfetivosUnidade",com.projetopratico.SdtSDTEfetivosUnidade.class );
         arr_AV5Messages[0] = restCliefetivosUnidade.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* efetivosUnidade Constructor */
   }

   public void gxep_enderecofuncional( String in_AV11pes_nome ,
                                       int in_AV15PaginaAtual ,
                                       int in_AV16nroPorPagina ,
                                       com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional [] arr_AV13SDTServidorEfetivoEnderecoFuncional ,
                                       GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      restClienderecoFuncional = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "enderecoFuncional" );
      restClienderecoFuncional.setLocation( restLocation );
      restClienderecoFuncional.setHttpMethod( "GET" );
      restClienderecoFuncional.addQueryVar("Pes_nome", in_AV11pes_nome);
      restClienderecoFuncional.addQueryVar("Paginaatual", in_AV15PaginaAtual);
      restClienderecoFuncional.addQueryVar("Nroporpagina", in_AV16nroPorPagina);
      restClienderecoFuncional.RestExecute();
      if ( restClienderecoFuncional.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restClienderecoFuncional.getErrorCode() );
         gxProperties.setErrorMessage( restClienderecoFuncional.getErrorMessage() );
         gxProperties.setStatusCode( restClienderecoFuncional.getStatusCode() );
      }
      else
      {
         arr_AV13SDTServidorEfetivoEnderecoFuncional[0] = restClienderecoFuncional.getBodyObj("SDTServidorEfetivoEnderecoFuncional",com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional.class );
         arr_AV5Messages[0] = restClienderecoFuncional.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* enderecoFuncional Constructor */
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
      restCliefetivosUnidade = new com.genexus.internet.GXRestAPIClient();
      restClienderecoFuncional = new com.genexus.internet.GXRestAPIClient();
   }

   protected short initialized ;
   protected com.genexus.internet.Location restLocation ;
   protected com.genexus.internet.GXRestAPIClient restCliefetivosUnidade ;
   protected com.genexus.internet.GXRestAPIClient restClienderecoFuncional ;
   protected com.genexus.properties.GXObjectProperties gxProperties ;
}

