package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbuscalotacao extends GXProcedure
{
   public pbuscalotacao( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbuscalotacao.class ), "" );
   }

   public pbuscalotacao( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( int[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             java.util.Date[] aP4 ,
                             java.util.Date[] aP5 )
   {
      pbuscalotacao.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( int[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        java.util.Date[] aP4 ,
                        java.util.Date[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( int[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             java.util.Date[] aP4 ,
                             java.util.Date[] aP5 ,
                             String[] aP6 )
   {
      pbuscalotacao.this.AV12lot_id = aP0[0];
      this.aP0 = aP0;
      pbuscalotacao.this.AV13encontrado_lot_id = aP1[0];
      this.aP1 = aP1;
      pbuscalotacao.this.AV14pes_id = aP2[0];
      this.aP2 = aP2;
      pbuscalotacao.this.AV15unid_id = aP3[0];
      this.aP3 = aP3;
      pbuscalotacao.this.AV16lot_data_lotacao = aP4[0];
      this.aP4 = aP4;
      pbuscalotacao.this.AV17lot_data_remocao = aP5[0];
      this.aP5 = aP5;
      pbuscalotacao.this.AV18lot_portaria = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      /* Using cursor P001U2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV12lot_id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A25lot_id = P001U2_A25lot_id[0] ;
         A1pes_id = P001U2_A1pes_id[0] ;
         A7unid_id = P001U2_A7unid_id[0] ;
         A26lot_data_lotacao = P001U2_A26lot_data_lotacao[0] ;
         A27lot_data_remocao = P001U2_A27lot_data_remocao[0] ;
         A28lot_portaria = P001U2_A28lot_portaria[0] ;
         AV13encontrado_lot_id = A25lot_id ;
         AV14pes_id = A1pes_id ;
         AV15unid_id = A7unid_id ;
         AV16lot_data_lotacao = A26lot_data_lotacao ;
         AV17lot_data_remocao = A27lot_data_remocao ;
         AV18lot_portaria = A28lot_portaria ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbuscalotacao.this.AV12lot_id;
      this.aP1[0] = pbuscalotacao.this.AV13encontrado_lot_id;
      this.aP2[0] = pbuscalotacao.this.AV14pes_id;
      this.aP3[0] = pbuscalotacao.this.AV15unid_id;
      this.aP4[0] = pbuscalotacao.this.AV16lot_data_lotacao;
      this.aP5[0] = pbuscalotacao.this.AV17lot_data_remocao;
      this.aP6[0] = pbuscalotacao.this.AV18lot_portaria;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      P001U2_A25lot_id = new int[1] ;
      P001U2_A1pes_id = new int[1] ;
      P001U2_A7unid_id = new int[1] ;
      P001U2_A26lot_data_lotacao = new java.util.Date[] {GXutil.nullDate()} ;
      P001U2_A27lot_data_remocao = new java.util.Date[] {GXutil.nullDate()} ;
      P001U2_A28lot_portaria = new String[] {""} ;
      A26lot_data_lotacao = GXutil.nullDate() ;
      A27lot_data_remocao = GXutil.nullDate() ;
      A28lot_portaria = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pbuscalotacao__default(),
         new Object[] {
             new Object[] {
            P001U2_A25lot_id, P001U2_A1pes_id, P001U2_A7unid_id, P001U2_A26lot_data_lotacao, P001U2_A27lot_data_remocao, P001U2_A28lot_portaria
            }
         }
      );
      /* GeneXus formulas. */
   }

   private int AV12lot_id ;
   private int AV13encontrado_lot_id ;
   private int AV14pes_id ;
   private int AV15unid_id ;
   private int A25lot_id ;
   private int A1pes_id ;
   private int A7unid_id ;
   private java.util.Date AV16lot_data_lotacao ;
   private java.util.Date AV17lot_data_remocao ;
   private java.util.Date A26lot_data_lotacao ;
   private java.util.Date A27lot_data_remocao ;
   private String AV18lot_portaria ;
   private String A28lot_portaria ;
   private String[] aP6 ;
   private int[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private java.util.Date[] aP4 ;
   private java.util.Date[] aP5 ;
   private IDataStoreProvider pr_default ;
   private int[] P001U2_A25lot_id ;
   private int[] P001U2_A1pes_id ;
   private int[] P001U2_A7unid_id ;
   private java.util.Date[] P001U2_A26lot_data_lotacao ;
   private java.util.Date[] P001U2_A27lot_data_remocao ;
   private String[] P001U2_A28lot_portaria ;
}

final  class pbuscalotacao__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001U2", "SELECT lot_id, pes_id, unid_id, lot_data_lotacao, lot_data_remocao, lot_portaria FROM lotacao WHERE lot_id = ? ORDER BY lot_id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

