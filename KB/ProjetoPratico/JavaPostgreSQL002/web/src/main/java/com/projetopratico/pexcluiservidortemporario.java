package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexcluiservidortemporario extends GXProcedure
{
   public pexcluiservidortemporario( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexcluiservidortemporario.class ), "" );
   }

   public pexcluiservidortemporario( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int[] aP0 ,
                                                                        java.util.Date[] aP1 ,
                                                                        java.util.Date[] aP2 )
   {
      pexcluiservidortemporario.this.aP3 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( int[] aP0 ,
                        java.util.Date[] aP1 ,
                        java.util.Date[] aP2 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( int[] aP0 ,
                             java.util.Date[] aP1 ,
                             java.util.Date[] aP2 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 )
   {
      pexcluiservidortemporario.this.AV12pes_id = aP0[0];
      this.aP0 = aP0;
      pexcluiservidortemporario.this.AV13st_data_admissao = aP1[0];
      this.aP1 = aP1;
      pexcluiservidortemporario.this.AV14st_data_demissao = aP2[0];
      this.aP2 = aP2;
      pexcluiservidortemporario.this.AV8Messages = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV8Messages.clear();
      AV11servidor_temporario.Load(AV12pes_id, AV13st_data_admissao, AV14st_data_demissao);
      AV11servidor_temporario.Delete();
      if ( AV11servidor_temporario.Fail() )
      {
         AV8Messages = AV11servidor_temporario.GetMessages() ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexcluiservidortemporario.this.AV12pes_id;
      this.aP1[0] = pexcluiservidortemporario.this.AV13st_data_admissao;
      this.aP2[0] = pexcluiservidortemporario.this.AV14st_data_demissao;
      this.aP3[0] = pexcluiservidortemporario.this.AV8Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11servidor_temporario = new com.projetopratico.Sdtservidor_temporario(remoteHandle);
      /* GeneXus formulas. */
   }

   private int AV12pes_id ;
   private java.util.Date AV13st_data_admissao ;
   private java.util.Date AV14st_data_demissao ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 ;
   private int[] aP0 ;
   private java.util.Date[] aP1 ;
   private java.util.Date[] aP2 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV8Messages ;
   private com.projetopratico.Sdtservidor_temporario AV11servidor_temporario ;
}

