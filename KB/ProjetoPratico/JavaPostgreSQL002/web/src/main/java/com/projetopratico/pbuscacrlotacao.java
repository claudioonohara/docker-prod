package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbuscacrlotacao extends GXProcedure
{
   public pbuscacrlotacao( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbuscacrlotacao.class ), "" );
   }

   public pbuscacrlotacao( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int aP0 ,
                                                                        com.projetopratico.SdtSDTCRLotacao[] aP1 )
   {
      pbuscacrlotacao.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( int aP0 ,
                        com.projetopratico.SdtSDTCRLotacao[] aP1 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( int aP0 ,
                             com.projetopratico.SdtSDTCRLotacao[] aP1 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      pbuscacrlotacao.this.AV14lot_id = aP0;
      pbuscacrlotacao.this.aP1 = aP1;
      pbuscacrlotacao.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV13SDTCRLotacao = (com.projetopratico.SdtSDTCRLotacao)new com.projetopratico.SdtSDTCRLotacao(remoteHandle, context);
      AV15GXLvl2 = (byte)(0) ;
      /* Using cursor P001Y2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV14lot_id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A25lot_id = P001Y2_A25lot_id[0] ;
         A1pes_id = P001Y2_A1pes_id[0] ;
         A7unid_id = P001Y2_A7unid_id[0] ;
         A26lot_data_lotacao = P001Y2_A26lot_data_lotacao[0] ;
         A27lot_data_remocao = P001Y2_A27lot_data_remocao[0] ;
         A28lot_portaria = P001Y2_A28lot_portaria[0] ;
         A2pes_nome = P001Y2_A2pes_nome[0] ;
         A3pes_data_nascimento = P001Y2_A3pes_data_nascimento[0] ;
         A4pes_sexo = P001Y2_A4pes_sexo[0] ;
         A5pes_mae = P001Y2_A5pes_mae[0] ;
         A6pes_pai = P001Y2_A6pes_pai[0] ;
         A8unid_nome = P001Y2_A8unid_nome[0] ;
         A9unid_sigla = P001Y2_A9unid_sigla[0] ;
         A2pes_nome = P001Y2_A2pes_nome[0] ;
         A3pes_data_nascimento = P001Y2_A3pes_data_nascimento[0] ;
         A4pes_sexo = P001Y2_A4pes_sexo[0] ;
         A5pes_mae = P001Y2_A5pes_mae[0] ;
         A6pes_pai = P001Y2_A6pes_pai[0] ;
         A8unid_nome = P001Y2_A8unid_nome[0] ;
         A9unid_sigla = P001Y2_A9unid_sigla[0] ;
         AV15GXLvl2 = (byte)(1) ;
         AV13SDTCRLotacao.setgxTv_SdtSDTCRLotacao_Lot_id( A25lot_id );
         AV13SDTCRLotacao.setgxTv_SdtSDTCRLotacao_Pes_id( A1pes_id );
         AV13SDTCRLotacao.setgxTv_SdtSDTCRLotacao_Unid_id( A7unid_id );
         AV13SDTCRLotacao.setgxTv_SdtSDTCRLotacao_Lot_data_lotacao( A26lot_data_lotacao );
         AV13SDTCRLotacao.setgxTv_SdtSDTCRLotacao_Lot_data_remocao( A27lot_data_remocao );
         AV13SDTCRLotacao.setgxTv_SdtSDTCRLotacao_Lot_portaria( A28lot_portaria );
         AV13SDTCRLotacao.setgxTv_SdtSDTCRLotacao_Pes_nome( A2pes_nome );
         AV13SDTCRLotacao.setgxTv_SdtSDTCRLotacao_Pes_data_nascimento( A3pes_data_nascimento );
         AV13SDTCRLotacao.setgxTv_SdtSDTCRLotacao_Pes_sexo( A4pes_sexo );
         AV13SDTCRLotacao.setgxTv_SdtSDTCRLotacao_Pes_mae( A5pes_mae );
         AV13SDTCRLotacao.setgxTv_SdtSDTCRLotacao_Pes_pai( A6pes_pai );
         AV13SDTCRLotacao.setgxTv_SdtSDTCRLotacao_Unid_nome( A8unid_nome );
         AV13SDTCRLotacao.setgxTv_SdtSDTCRLotacao_Unid_sigla( A9unid_sigla );
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV15GXLvl2 == 0 )
      {
         AV11Message.setgxTv_SdtMessages_Message_Description( "Lotacao com id "+GXutil.trim( GXutil.str( AV14lot_id, 8, 0))+" nao encontrada" );
         AV11Message.setgxTv_SdtMessages_Message_Type( (byte)(0) );
         AV12Messages.add(AV11Message, 0);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pbuscacrlotacao.this.AV13SDTCRLotacao;
      this.aP2[0] = pbuscacrlotacao.this.AV12Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13SDTCRLotacao = new com.projetopratico.SdtSDTCRLotacao(remoteHandle, context);
      AV12Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      P001Y2_A25lot_id = new int[1] ;
      P001Y2_A1pes_id = new int[1] ;
      P001Y2_A7unid_id = new int[1] ;
      P001Y2_A26lot_data_lotacao = new java.util.Date[] {GXutil.nullDate()} ;
      P001Y2_A27lot_data_remocao = new java.util.Date[] {GXutil.nullDate()} ;
      P001Y2_A28lot_portaria = new String[] {""} ;
      P001Y2_A2pes_nome = new String[] {""} ;
      P001Y2_A3pes_data_nascimento = new java.util.Date[] {GXutil.nullDate()} ;
      P001Y2_A4pes_sexo = new String[] {""} ;
      P001Y2_A5pes_mae = new String[] {""} ;
      P001Y2_A6pes_pai = new String[] {""} ;
      P001Y2_A8unid_nome = new String[] {""} ;
      P001Y2_A9unid_sigla = new String[] {""} ;
      A26lot_data_lotacao = GXutil.nullDate() ;
      A27lot_data_remocao = GXutil.nullDate() ;
      A28lot_portaria = "" ;
      A2pes_nome = "" ;
      A3pes_data_nascimento = GXutil.nullDate() ;
      A4pes_sexo = "" ;
      A5pes_mae = "" ;
      A6pes_pai = "" ;
      A8unid_nome = "" ;
      A9unid_sigla = "" ;
      AV11Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pbuscacrlotacao__default(),
         new Object[] {
             new Object[] {
            P001Y2_A25lot_id, P001Y2_A1pes_id, P001Y2_A7unid_id, P001Y2_A26lot_data_lotacao, P001Y2_A27lot_data_remocao, P001Y2_A28lot_portaria, P001Y2_A2pes_nome, P001Y2_A3pes_data_nascimento, P001Y2_A4pes_sexo, P001Y2_A5pes_mae,
            P001Y2_A6pes_pai, P001Y2_A8unid_nome, P001Y2_A9unid_sigla
            }
         }
      );
      /* GeneXus formulas. */
   }

   private byte AV15GXLvl2 ;
   private int AV14lot_id ;
   private int A25lot_id ;
   private int A1pes_id ;
   private int A7unid_id ;
   private java.util.Date A26lot_data_lotacao ;
   private java.util.Date A27lot_data_remocao ;
   private java.util.Date A3pes_data_nascimento ;
   private String A28lot_portaria ;
   private String A2pes_nome ;
   private String A4pes_sexo ;
   private String A5pes_mae ;
   private String A6pes_pai ;
   private String A8unid_nome ;
   private String A9unid_sigla ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ;
   private com.projetopratico.SdtSDTCRLotacao[] aP1 ;
   private com.projetopratico.SdtSDTCRLotacao AV13SDTCRLotacao ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV12Messages ;
   private IDataStoreProvider pr_default ;
   private int[] P001Y2_A25lot_id ;
   private int[] P001Y2_A1pes_id ;
   private int[] P001Y2_A7unid_id ;
   private java.util.Date[] P001Y2_A26lot_data_lotacao ;
   private java.util.Date[] P001Y2_A27lot_data_remocao ;
   private String[] P001Y2_A28lot_portaria ;
   private String[] P001Y2_A2pes_nome ;
   private java.util.Date[] P001Y2_A3pes_data_nascimento ;
   private String[] P001Y2_A4pes_sexo ;
   private String[] P001Y2_A5pes_mae ;
   private String[] P001Y2_A6pes_pai ;
   private String[] P001Y2_A8unid_nome ;
   private String[] P001Y2_A9unid_sigla ;
   private com.genexus.SdtMessages_Message AV11Message ;
}

final  class pbuscacrlotacao__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001Y2", "SELECT T1.lot_id, T1.pes_id, T1.unid_id, T1.lot_data_lotacao, T1.lot_data_remocao, T1.lot_portaria, T2.pes_nome, T2.pes_data_nascimento, T2.pes_sexo, T2.pes_mae, T2.pes_pai, T3.unid_nome, T3.unid_sigla FROM ((lotacao T1 INNER JOIN pessoa T2 ON T2.pes_id = T1.pes_id) INNER JOIN unidade T3 ON T3.unid_id = T1.unid_id) WHERE T1.lot_id = ? ORDER BY T1.lot_id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
               ((String[]) buf[9])[0] = rslt.getVarchar(10);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
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
      }
   }

}

