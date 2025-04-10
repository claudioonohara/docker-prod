package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbuscaservidortemporario extends GXProcedure
{
   public pbuscaservidortemporario( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbuscaservidortemporario.class ), "" );
   }

   public pbuscaservidortemporario( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( int[] aP0 ,
                              java.util.Date[] aP1 ,
                              java.util.Date[] aP2 )
   {
      pbuscaservidortemporario.this.aP3 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( int[] aP0 ,
                        java.util.Date[] aP1 ,
                        java.util.Date[] aP2 ,
                        boolean[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( int[] aP0 ,
                             java.util.Date[] aP1 ,
                             java.util.Date[] aP2 ,
                             boolean[] aP3 )
   {
      pbuscaservidortemporario.this.AV12pes_id = aP0[0];
      this.aP0 = aP0;
      pbuscaservidortemporario.this.AV13st_data_admissao = aP1[0];
      this.aP1 = aP1;
      pbuscaservidortemporario.this.AV14st_data_demissao = aP2[0];
      this.aP2 = aP2;
      pbuscaservidortemporario.this.AV15existe_servidor_temporario = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV15existe_servidor_temporario = false ;
      /* Using cursor P00242 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV12pes_id), AV13st_data_admissao, AV14st_data_demissao});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A23st_data_demissao = P00242_A23st_data_demissao[0] ;
         A22st_data_admissao = P00242_A22st_data_admissao[0] ;
         A1pes_id = P00242_A1pes_id[0] ;
         AV15existe_servidor_temporario = true ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbuscaservidortemporario.this.AV12pes_id;
      this.aP1[0] = pbuscaservidortemporario.this.AV13st_data_admissao;
      this.aP2[0] = pbuscaservidortemporario.this.AV14st_data_demissao;
      this.aP3[0] = pbuscaservidortemporario.this.AV15existe_servidor_temporario;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      P00242_A23st_data_demissao = new java.util.Date[] {GXutil.nullDate()} ;
      P00242_A22st_data_admissao = new java.util.Date[] {GXutil.nullDate()} ;
      P00242_A1pes_id = new int[1] ;
      A23st_data_demissao = GXutil.nullDate() ;
      A22st_data_admissao = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pbuscaservidortemporario__default(),
         new Object[] {
             new Object[] {
            P00242_A23st_data_demissao, P00242_A22st_data_admissao, P00242_A1pes_id
            }
         }
      );
      /* GeneXus formulas. */
   }

   private int AV12pes_id ;
   private int A1pes_id ;
   private java.util.Date AV13st_data_admissao ;
   private java.util.Date AV14st_data_demissao ;
   private java.util.Date A23st_data_demissao ;
   private java.util.Date A22st_data_admissao ;
   private boolean AV15existe_servidor_temporario ;
   private boolean[] aP3 ;
   private int[] aP0 ;
   private java.util.Date[] aP1 ;
   private java.util.Date[] aP2 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P00242_A23st_data_demissao ;
   private java.util.Date[] P00242_A22st_data_admissao ;
   private int[] P00242_A1pes_id ;
}

final  class pbuscaservidortemporario__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00242", "SELECT st_data_demissao, st_data_admissao, pes_id FROM servidor_temporario WHERE pes_id = ? and st_data_admissao = ? and st_data_demissao = ? ORDER BY pes_id, st_data_admissao, st_data_demissao  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
      }
   }

}

