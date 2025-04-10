package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbuscacrunidade extends GXProcedure
{
   public pbuscacrunidade( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbuscacrunidade.class ), "" );
   }

   public pbuscacrunidade( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int aP0 ,
                                                                        com.projetopratico.SdtSDTCRUnidade[] aP1 )
   {
      pbuscacrunidade.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( int aP0 ,
                        com.projetopratico.SdtSDTCRUnidade[] aP1 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( int aP0 ,
                             com.projetopratico.SdtSDTCRUnidade[] aP1 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      pbuscacrunidade.this.AV8unid_id = aP0;
      pbuscacrunidade.this.aP1 = aP1;
      pbuscacrunidade.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV9SDTCRUnidade = (com.projetopratico.SdtSDTCRUnidade)new com.projetopratico.SdtSDTCRUnidade(remoteHandle, context);
      AV13GXLvl2 = (byte)(0) ;
      /* Using cursor P001O2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV8unid_id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7unid_id = P001O2_A7unid_id[0] ;
         A8unid_nome = P001O2_A8unid_nome[0] ;
         A9unid_sigla = P001O2_A9unid_sigla[0] ;
         AV13GXLvl2 = (byte)(1) ;
         AV9SDTCRUnidade.setgxTv_SdtSDTCRUnidade_Unid_id( A7unid_id );
         AV9SDTCRUnidade.setgxTv_SdtSDTCRUnidade_Unid_nome( A8unid_nome );
         AV9SDTCRUnidade.setgxTv_SdtSDTCRUnidade_Unid_sigla( A9unid_sigla );
         /* Execute user subroutine: 'BUSCAENDERECOSUNIDADE' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV13GXLvl2 == 0 )
      {
         AV11Message.setgxTv_SdtMessages_Message_Description( "Unidade com id "+GXutil.trim( GXutil.str( AV8unid_id, 8, 0))+" nao encontrada" );
         AV11Message.setgxTv_SdtMessages_Message_Type( (byte)(0) );
         AV12Messages.add(AV11Message, 0);
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'BUSCAENDERECOSUNIDADE' Routine */
      returnInSub = false ;
      /* Using cursor P001O3 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV8unid_id)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A7unid_id = P001O3_A7unid_id[0] ;
         A17end_id = P001O3_A17end_id[0] ;
         A18end_tipo_logradouro = P001O3_A18end_tipo_logradouro[0] ;
         A19end_logradouro = P001O3_A19end_logradouro[0] ;
         A20end_numero = P001O3_A20end_numero[0] ;
         A21end_bairro = P001O3_A21end_bairro[0] ;
         A14cid_id = P001O3_A14cid_id[0] ;
         A15cid_nome = P001O3_A15cid_nome[0] ;
         A16cid_uf = P001O3_A16cid_uf[0] ;
         A18end_tipo_logradouro = P001O3_A18end_tipo_logradouro[0] ;
         A19end_logradouro = P001O3_A19end_logradouro[0] ;
         A20end_numero = P001O3_A20end_numero[0] ;
         A21end_bairro = P001O3_A21end_bairro[0] ;
         A14cid_id = P001O3_A14cid_id[0] ;
         A15cid_nome = P001O3_A15cid_nome[0] ;
         A16cid_uf = P001O3_A16cid_uf[0] ;
         AV10SDTCRUnidadeItem = (com.projetopratico.SdtSDTCRUnidade_enderecoItem)new com.projetopratico.SdtSDTCRUnidade_enderecoItem(remoteHandle, context);
         AV10SDTCRUnidadeItem.setgxTv_SdtSDTCRUnidade_enderecoItem_End_id( A17end_id );
         AV10SDTCRUnidadeItem.setgxTv_SdtSDTCRUnidade_enderecoItem_End_tipo_logradouro( A18end_tipo_logradouro );
         AV10SDTCRUnidadeItem.setgxTv_SdtSDTCRUnidade_enderecoItem_End_logradouro( A19end_logradouro );
         AV10SDTCRUnidadeItem.setgxTv_SdtSDTCRUnidade_enderecoItem_End_numero( A20end_numero );
         AV10SDTCRUnidadeItem.setgxTv_SdtSDTCRUnidade_enderecoItem_End_bairro( A21end_bairro );
         AV10SDTCRUnidadeItem.setgxTv_SdtSDTCRUnidade_enderecoItem_Cid_id( A14cid_id );
         AV10SDTCRUnidadeItem.setgxTv_SdtSDTCRUnidade_enderecoItem_Cid_nome( A15cid_nome );
         AV10SDTCRUnidadeItem.setgxTv_SdtSDTCRUnidade_enderecoItem_Cid_uf( A16cid_uf );
         AV9SDTCRUnidade.getgxTv_SdtSDTCRUnidade_Endereco().add(AV10SDTCRUnidadeItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP1[0] = pbuscacrunidade.this.AV9SDTCRUnidade;
      this.aP2[0] = pbuscacrunidade.this.AV12Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9SDTCRUnidade = new com.projetopratico.SdtSDTCRUnidade(remoteHandle, context);
      AV12Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      P001O2_A7unid_id = new int[1] ;
      P001O2_A8unid_nome = new String[] {""} ;
      P001O2_A9unid_sigla = new String[] {""} ;
      A8unid_nome = "" ;
      A9unid_sigla = "" ;
      AV11Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      P001O3_A7unid_id = new int[1] ;
      P001O3_A17end_id = new int[1] ;
      P001O3_A18end_tipo_logradouro = new String[] {""} ;
      P001O3_A19end_logradouro = new String[] {""} ;
      P001O3_A20end_numero = new int[1] ;
      P001O3_A21end_bairro = new String[] {""} ;
      P001O3_A14cid_id = new int[1] ;
      P001O3_A15cid_nome = new String[] {""} ;
      P001O3_A16cid_uf = new String[] {""} ;
      A18end_tipo_logradouro = "" ;
      A19end_logradouro = "" ;
      A21end_bairro = "" ;
      A15cid_nome = "" ;
      A16cid_uf = "" ;
      AV10SDTCRUnidadeItem = new com.projetopratico.SdtSDTCRUnidade_enderecoItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pbuscacrunidade__default(),
         new Object[] {
             new Object[] {
            P001O2_A7unid_id, P001O2_A8unid_nome, P001O2_A9unid_sigla
            }
            , new Object[] {
            P001O3_A7unid_id, P001O3_A17end_id, P001O3_A18end_tipo_logradouro, P001O3_A19end_logradouro, P001O3_A20end_numero, P001O3_A21end_bairro, P001O3_A14cid_id, P001O3_A15cid_nome, P001O3_A16cid_uf
            }
         }
      );
      /* GeneXus formulas. */
   }

   private byte AV13GXLvl2 ;
   private int AV8unid_id ;
   private int A7unid_id ;
   private int A17end_id ;
   private int A20end_numero ;
   private int A14cid_id ;
   private String A16cid_uf ;
   private boolean returnInSub ;
   private String A8unid_nome ;
   private String A9unid_sigla ;
   private String A18end_tipo_logradouro ;
   private String A19end_logradouro ;
   private String A21end_bairro ;
   private String A15cid_nome ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ;
   private com.projetopratico.SdtSDTCRUnidade[] aP1 ;
   private com.projetopratico.SdtSDTCRUnidade AV9SDTCRUnidade ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV12Messages ;
   private IDataStoreProvider pr_default ;
   private int[] P001O2_A7unid_id ;
   private String[] P001O2_A8unid_nome ;
   private String[] P001O2_A9unid_sigla ;
   private com.genexus.SdtMessages_Message AV11Message ;
   private int[] P001O3_A7unid_id ;
   private int[] P001O3_A17end_id ;
   private String[] P001O3_A18end_tipo_logradouro ;
   private String[] P001O3_A19end_logradouro ;
   private int[] P001O3_A20end_numero ;
   private String[] P001O3_A21end_bairro ;
   private int[] P001O3_A14cid_id ;
   private String[] P001O3_A15cid_nome ;
   private String[] P001O3_A16cid_uf ;
   private com.projetopratico.SdtSDTCRUnidade_enderecoItem AV10SDTCRUnidadeItem ;
}

final  class pbuscacrunidade__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001O2", "SELECT unid_id, unid_nome, unid_sigla FROM unidade WHERE unid_id = ? ORDER BY unid_id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P001O3", "SELECT T1.unid_id, T1.end_id, T2.end_tipo_logradouro, T2.end_logradouro, T2.end_numero, T2.end_bairro, T2.cid_id, T3.cid_nome, T3.cid_uf FROM ((unidade_endereco T1 INNER JOIN endereco T2 ON T2.end_id = T1.end_id) INNER JOIN cidade T3 ON T3.cid_id = T2.cid_id) WHERE T1.unid_id = ? ORDER BY T1.unid_id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 2);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

