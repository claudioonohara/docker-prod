package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvariavel extends GXProcedure
{
   public pvariavel( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvariavel.class ), "" );
   }

   public pvariavel( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( String aP0 ,
                                                                        String aP1 ,
                                                                        String[] aP2 )
   {
      pvariavel.this.aP3 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String[] aP2 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String[] aP2 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 )
   {
      pvariavel.this.AV8variavel = aP0;
      pvariavel.this.AV10filename = aP1;
      pvariavel.this.aP2 = aP2;
      pvariavel.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      if ( new com.genexuscore.genexus.common.configuration.SdtConfigurationManager(remoteHandle, context).hasvalue(AV8variavel, AV10filename) )
      {
         AV9resultado = AV8variavel + " <- VALOR : " + new com.genexuscore.genexus.common.configuration.SdtConfigurationManager(remoteHandle, context).getvalue(AV8variavel, AV10filename) ;
      }
      else
      {
         AV9resultado = "variavel: " + AV8variavel + " filename: " + AV10filename + " <- NAO CONFIGURADA " ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pvariavel.this.AV9resultado;
      this.aP3[0] = pvariavel.this.AV11Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9resultado = "" ;
      AV11Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      /* GeneXus formulas. */
   }

   private String AV8variavel ;
   private String AV10filename ;
   private String AV9resultado ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 ;
   private String[] aP2 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV11Messages ;
}

