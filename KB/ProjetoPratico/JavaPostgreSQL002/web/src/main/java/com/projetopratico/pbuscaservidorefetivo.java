package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbuscaservidorefetivo extends GXProcedure
{
   public pbuscaservidorefetivo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbuscaservidorefetivo.class ), "" );
   }

   public pbuscaservidorefetivo( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( int[] aP0 ,
                              String[] aP1 )
   {
      pbuscaservidorefetivo.this.aP2 = new boolean[] {false};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( int[] aP0 ,
                        String[] aP1 ,
                        boolean[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( int[] aP0 ,
                             String[] aP1 ,
                             boolean[] aP2 )
   {
      pbuscaservidorefetivo.this.AV12pes_id = aP0[0];
      this.aP0 = aP0;
      pbuscaservidorefetivo.this.AV19se_matricula = aP1[0];
      this.aP1 = aP1;
      pbuscaservidorefetivo.this.AV18existe_servidor_efetivo = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV18existe_servidor_efetivo = false ;
      /* Using cursor P002J2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV12pes_id), AV19se_matricula});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A24se_matricula = P002J2_A24se_matricula[0] ;
         A1pes_id = P002J2_A1pes_id[0] ;
         AV18existe_servidor_efetivo = true ;
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
      this.aP0[0] = pbuscaservidorefetivo.this.AV12pes_id;
      this.aP1[0] = pbuscaservidorefetivo.this.AV19se_matricula;
      this.aP2[0] = pbuscaservidorefetivo.this.AV18existe_servidor_efetivo;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      P002J2_A24se_matricula = new String[] {""} ;
      P002J2_A1pes_id = new int[1] ;
      A24se_matricula = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pbuscaservidorefetivo__default(),
         new Object[] {
             new Object[] {
            P002J2_A24se_matricula, P002J2_A1pes_id
            }
         }
      );
      /* GeneXus formulas. */
   }

   private int AV12pes_id ;
   private int A1pes_id ;
   private boolean AV18existe_servidor_efetivo ;
   private String AV19se_matricula ;
   private String A24se_matricula ;
   private boolean[] aP2 ;
   private int[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P002J2_A24se_matricula ;
   private int[] P002J2_A1pes_id ;
}

final  class pbuscaservidorefetivo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002J2", "SELECT se_matricula, pes_id FROM servidor_efetivo WHERE pes_id = ? and se_matricula = ( ?) ORDER BY pes_id, se_matricula  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               stmt.setVarchar(2, (String)parms[1], 20);
               return;
      }
   }

}

