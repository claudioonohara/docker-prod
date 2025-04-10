package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plotacaoget extends GXProcedure
{
   public plotacaoget( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plotacaoget.class ), "" );
   }

   public plotacaoget( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int aP0 ,
                                                                        com.projetopratico.SdtSDTLotacao[] aP1 )
   {
      plotacaoget.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( int aP0 ,
                        com.projetopratico.SdtSDTLotacao[] aP1 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( int aP0 ,
                             com.projetopratico.SdtSDTLotacao[] aP1 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      plotacaoget.this.AV13lot_id = aP0;
      plotacaoget.this.aP1 = aP1;
      plotacaoget.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV14GXLvl1 = (byte)(0) ;
      /* Using cursor P000N2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV13lot_id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A25lot_id = P000N2_A25lot_id[0] ;
         A1pes_id = P000N2_A1pes_id[0] ;
         A7unid_id = P000N2_A7unid_id[0] ;
         A26lot_data_lotacao = P000N2_A26lot_data_lotacao[0] ;
         A27lot_data_remocao = P000N2_A27lot_data_remocao[0] ;
         A28lot_portaria = P000N2_A28lot_portaria[0] ;
         AV14GXLvl1 = (byte)(1) ;
         AV12SDTLotacao.setgxTv_SdtSDTLotacao_Lot_id( A25lot_id );
         AV12SDTLotacao.setgxTv_SdtSDTLotacao_Pes_id( A1pes_id );
         AV12SDTLotacao.setgxTv_SdtSDTLotacao_Unid_id( A7unid_id );
         AV12SDTLotacao.setgxTv_SdtSDTLotacao_Lot_data_lotacao( A26lot_data_lotacao );
         AV12SDTLotacao.setgxTv_SdtSDTLotacao_Lot_data_remocao( A27lot_data_remocao );
         AV12SDTLotacao.setgxTv_SdtSDTLotacao_Lot_portaria( A28lot_portaria );
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV14GXLvl1 == 0 )
      {
         AV8Message.setgxTv_SdtMessages_Message_Description( "Lotacao com id "+GXutil.trim( GXutil.str( AV13lot_id, 8, 0))+" nao encontrada" );
         AV8Message.setgxTv_SdtMessages_Message_Type( (byte)(0) );
         AV9Messages.add(AV8Message, 0);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = plotacaoget.this.AV12SDTLotacao;
      this.aP2[0] = plotacaoget.this.AV9Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12SDTLotacao = new com.projetopratico.SdtSDTLotacao(remoteHandle, context);
      AV9Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      P000N2_A25lot_id = new int[1] ;
      P000N2_A1pes_id = new int[1] ;
      P000N2_A7unid_id = new int[1] ;
      P000N2_A26lot_data_lotacao = new java.util.Date[] {GXutil.nullDate()} ;
      P000N2_A27lot_data_remocao = new java.util.Date[] {GXutil.nullDate()} ;
      P000N2_A28lot_portaria = new String[] {""} ;
      A26lot_data_lotacao = GXutil.nullDate() ;
      A27lot_data_remocao = GXutil.nullDate() ;
      A28lot_portaria = "" ;
      AV8Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.plotacaoget__default(),
         new Object[] {
             new Object[] {
            P000N2_A25lot_id, P000N2_A1pes_id, P000N2_A7unid_id, P000N2_A26lot_data_lotacao, P000N2_A27lot_data_remocao, P000N2_A28lot_portaria
            }
         }
      );
      /* GeneXus formulas. */
   }

   private byte AV14GXLvl1 ;
   private int AV13lot_id ;
   private int A25lot_id ;
   private int A1pes_id ;
   private int A7unid_id ;
   private java.util.Date A26lot_data_lotacao ;
   private java.util.Date A27lot_data_remocao ;
   private String A28lot_portaria ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ;
   private com.projetopratico.SdtSDTLotacao[] aP1 ;
   private com.projetopratico.SdtSDTLotacao AV12SDTLotacao ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV9Messages ;
   private IDataStoreProvider pr_default ;
   private int[] P000N2_A25lot_id ;
   private int[] P000N2_A1pes_id ;
   private int[] P000N2_A7unid_id ;
   private java.util.Date[] P000N2_A26lot_data_lotacao ;
   private java.util.Date[] P000N2_A27lot_data_remocao ;
   private String[] P000N2_A28lot_portaria ;
   private com.genexus.SdtMessages_Message AV8Message ;
}

final  class plotacaoget__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000N2", "SELECT lot_id, pes_id, unid_id, lot_data_lotacao, lot_data_remocao, lot_portaria FROM lotacao WHERE lot_id = ? ORDER BY lot_id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

