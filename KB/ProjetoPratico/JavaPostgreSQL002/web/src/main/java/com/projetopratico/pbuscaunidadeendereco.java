package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbuscaunidadeendereco extends GXProcedure
{
   public pbuscaunidadeendereco( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbuscaunidadeendereco.class ), "" );
   }

   public pbuscaunidadeendereco( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( int[] aP0 ,
                              int[] aP1 )
   {
      pbuscaunidadeendereco.this.aP2 = new boolean[] {false};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( int[] aP0 ,
                        int[] aP1 ,
                        boolean[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( int[] aP0 ,
                             int[] aP1 ,
                             boolean[] aP2 )
   {
      pbuscaunidadeendereco.this.AV15unid_id = aP0[0];
      this.aP0 = aP0;
      pbuscaunidadeendereco.this.AV8end_id = aP1[0];
      this.aP1 = aP1;
      pbuscaunidadeendereco.this.AV17existe_unidade_endereco = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV17existe_unidade_endereco = false ;
      /* Using cursor P001N2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV15unid_id), Integer.valueOf(AV8end_id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A17end_id = P001N2_A17end_id[0] ;
         A7unid_id = P001N2_A7unid_id[0] ;
         AV17existe_unidade_endereco = true ;
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
      this.aP0[0] = pbuscaunidadeendereco.this.AV15unid_id;
      this.aP1[0] = pbuscaunidadeendereco.this.AV8end_id;
      this.aP2[0] = pbuscaunidadeendereco.this.AV17existe_unidade_endereco;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      P001N2_A17end_id = new int[1] ;
      P001N2_A7unid_id = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pbuscaunidadeendereco__default(),
         new Object[] {
             new Object[] {
            P001N2_A17end_id, P001N2_A7unid_id
            }
         }
      );
      /* GeneXus formulas. */
   }

   private int AV15unid_id ;
   private int AV8end_id ;
   private int A17end_id ;
   private int A7unid_id ;
   private boolean AV17existe_unidade_endereco ;
   private boolean[] aP2 ;
   private int[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private int[] P001N2_A17end_id ;
   private int[] P001N2_A7unid_id ;
}

final  class pbuscaunidadeendereco__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001N2", "SELECT end_id, unid_id FROM unidade_endereco WHERE unid_id = ? and end_id = ? ORDER BY unid_id, end_id  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

