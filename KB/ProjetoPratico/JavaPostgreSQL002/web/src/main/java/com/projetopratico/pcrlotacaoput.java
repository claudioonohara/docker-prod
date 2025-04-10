package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcrlotacaoput extends GXProcedure
{
   public pcrlotacaoput( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcrlotacaoput.class ), "" );
   }

   public pcrlotacaoput( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int aP0 ,
                                                                        com.projetopratico.SdtSDTCRLotacao aP1 ,
                                                                        com.projetopratico.SdtSDTCRLotacao[] aP2 )
   {
      pcrlotacaoput.this.aP3 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( int aP0 ,
                        com.projetopratico.SdtSDTCRLotacao aP1 ,
                        com.projetopratico.SdtSDTCRLotacao[] aP2 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( int aP0 ,
                             com.projetopratico.SdtSDTCRLotacao aP1 ,
                             com.projetopratico.SdtSDTCRLotacao[] aP2 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 )
   {
      pcrlotacaoput.this.AV8lot_id = aP0;
      pcrlotacaoput.this.AV11SDTCRLotacao = aP1;
      pcrlotacaoput.this.aP2 = aP2;
      pcrlotacaoput.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV13pes_id = AV11SDTCRLotacao.getgxTv_SdtSDTCRLotacao_Pes_id() ;
      GXv_int1[0] = AV13pes_id ;
      GXv_char2[0] = AV11SDTCRLotacao.getgxTv_SdtSDTCRLotacao_Pes_nome() ;
      GXv_date3[0] = AV11SDTCRLotacao.getgxTv_SdtSDTCRLotacao_Pes_data_nascimento() ;
      GXv_char4[0] = AV11SDTCRLotacao.getgxTv_SdtSDTCRLotacao_Pes_sexo() ;
      GXv_char5[0] = AV11SDTCRLotacao.getgxTv_SdtSDTCRLotacao_Pes_mae() ;
      GXv_char6[0] = AV11SDTCRLotacao.getgxTv_SdtSDTCRLotacao_Pes_pai() ;
      GXv_objcol_SdtMessages_Message7[0] = AV9Messages ;
      new com.projetopratico.pinsereatualizapessoa(remoteHandle, context).execute( GXv_int1, GXv_char2, GXv_date3, GXv_char4, GXv_char5, GXv_char6, GXv_objcol_SdtMessages_Message7) ;
      pcrlotacaoput.this.AV13pes_id = GXv_int1[0] ;
      AV11SDTCRLotacao.setgxTv_SdtSDTCRLotacao_Pes_nome( GXv_char2[0] );
      AV11SDTCRLotacao.setgxTv_SdtSDTCRLotacao_Pes_data_nascimento( GXv_date3[0] );
      AV11SDTCRLotacao.setgxTv_SdtSDTCRLotacao_Pes_sexo( GXv_char4[0] );
      AV11SDTCRLotacao.setgxTv_SdtSDTCRLotacao_Pes_mae( GXv_char5[0] );
      AV11SDTCRLotacao.setgxTv_SdtSDTCRLotacao_Pes_pai( GXv_char6[0] );
      AV9Messages = GXv_objcol_SdtMessages_Message7[0] ;
      /* Execute user subroutine: 'TERMINACOMERRO' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV12unid_id = AV11SDTCRLotacao.getgxTv_SdtSDTCRLotacao_Unid_id() ;
      GXv_int1[0] = AV12unid_id ;
      GXv_char6[0] = AV11SDTCRLotacao.getgxTv_SdtSDTCRLotacao_Unid_nome() ;
      GXv_char5[0] = AV11SDTCRLotacao.getgxTv_SdtSDTCRLotacao_Unid_sigla() ;
      GXv_objcol_SdtMessages_Message7[0] = AV9Messages ;
      new com.projetopratico.pinsereatualizaunidade(remoteHandle, context).execute( GXv_int1, GXv_char6, GXv_char5, GXv_objcol_SdtMessages_Message7) ;
      pcrlotacaoput.this.AV12unid_id = GXv_int1[0] ;
      AV11SDTCRLotacao.setgxTv_SdtSDTCRLotacao_Unid_nome( GXv_char6[0] );
      AV11SDTCRLotacao.setgxTv_SdtSDTCRLotacao_Unid_sigla( GXv_char5[0] );
      AV9Messages = GXv_objcol_SdtMessages_Message7[0] ;
      /* Execute user subroutine: 'TERMINACOMERRO' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXv_int1[0] = AV8lot_id ;
      GXv_int8[0] = AV13pes_id ;
      GXv_int9[0] = AV12unid_id ;
      GXv_date3[0] = AV11SDTCRLotacao.getgxTv_SdtSDTCRLotacao_Lot_data_lotacao() ;
      GXv_date10[0] = AV11SDTCRLotacao.getgxTv_SdtSDTCRLotacao_Lot_data_remocao() ;
      GXv_char6[0] = AV11SDTCRLotacao.getgxTv_SdtSDTCRLotacao_Lot_portaria() ;
      GXv_objcol_SdtMessages_Message7[0] = AV9Messages ;
      new com.projetopratico.pinsereatualizalotacao(remoteHandle, context).execute( GXv_int1, GXv_int8, GXv_int9, GXv_date3, GXv_date10, GXv_char6, GXv_objcol_SdtMessages_Message7) ;
      pcrlotacaoput.this.AV8lot_id = GXv_int1[0] ;
      pcrlotacaoput.this.AV13pes_id = GXv_int8[0] ;
      pcrlotacaoput.this.AV12unid_id = GXv_int9[0] ;
      AV11SDTCRLotacao.setgxTv_SdtSDTCRLotacao_Lot_data_lotacao( GXv_date3[0] );
      AV11SDTCRLotacao.setgxTv_SdtSDTCRLotacao_Lot_data_remocao( GXv_date10[0] );
      AV11SDTCRLotacao.setgxTv_SdtSDTCRLotacao_Lot_portaria( GXv_char6[0] );
      AV9Messages = GXv_objcol_SdtMessages_Message7[0] ;
      /* Execute user subroutine: 'TERMINACOMERRO' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      Application.commitDataStores(context, remoteHandle, pr_default, "pcrlotacaoput");
      GXv_SdtSDTCRLotacao11[0] = AV10RetornoSDTCRLotacao;
      GXv_objcol_SdtMessages_Message7[0] = AV9Messages ;
      new com.projetopratico.pbuscacrlotacao(remoteHandle, context).execute( AV8lot_id, GXv_SdtSDTCRLotacao11, GXv_objcol_SdtMessages_Message7) ;
      AV10RetornoSDTCRLotacao = GXv_SdtSDTCRLotacao11[0];
      AV9Messages = GXv_objcol_SdtMessages_Message7[0] ;
      cleanup();
   }

   public void S111( )
   {
      /* 'TERMINACOMERRO' Routine */
      returnInSub = false ;
      if ( AV9Messages.size() > 0 )
      {
         returnInSub = true;
         if (true) return;
      }
   }

   protected void cleanup( )
   {
      this.aP2[0] = pcrlotacaoput.this.AV10RetornoSDTCRLotacao;
      this.aP3[0] = pcrlotacaoput.this.AV9Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10RetornoSDTCRLotacao = new com.projetopratico.SdtSDTCRLotacao(remoteHandle, context);
      AV9Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_char2 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int1 = new int[1] ;
      GXv_int8 = new int[1] ;
      GXv_int9 = new int[1] ;
      GXv_date3 = new java.util.Date[1] ;
      GXv_date10 = new java.util.Date[1] ;
      GXv_char6 = new String[1] ;
      GXv_SdtSDTCRLotacao11 = new com.projetopratico.SdtSDTCRLotacao[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pcrlotacaoput__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
      initializeGenerics();
   }

   @SuppressWarnings("unchecked")
   private void initializeGenerics( )
   {
      GXv_objcol_SdtMessages_Message7 = new GXBaseCollection[1] ;
   }

   private int AV8lot_id ;
   private int AV13pes_id ;
   private int AV12unid_id ;
   private int GXv_int1[] ;
   private int GXv_int8[] ;
   private int GXv_int9[] ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private java.util.Date GXv_date3[] ;
   private java.util.Date GXv_date10[] ;
   private boolean returnInSub ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 ;
   private com.projetopratico.SdtSDTCRLotacao AV11SDTCRLotacao ;
   private com.projetopratico.SdtSDTCRLotacao[] aP2 ;
   private com.projetopratico.SdtSDTCRLotacao AV10RetornoSDTCRLotacao ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV9Messages ;
   private IDataStoreProvider pr_default ;
   private com.projetopratico.SdtSDTCRLotacao GXv_SdtSDTCRLotacao11[] ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message7[] ;
}

final  class pcrlotacaoput__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

