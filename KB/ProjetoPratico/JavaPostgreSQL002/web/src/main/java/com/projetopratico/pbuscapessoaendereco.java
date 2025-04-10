package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbuscapessoaendereco extends GXProcedure
{
   public pbuscapessoaendereco( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbuscapessoaendereco.class ), "" );
   }

   public pbuscapessoaendereco( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( int[] aP0 ,
                              int[] aP1 )
   {
      pbuscapessoaendereco.this.aP2 = new boolean[] {false};
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
      pbuscapessoaendereco.this.AV13pes_id = aP0[0];
      this.aP0 = aP0;
      pbuscapessoaendereco.this.AV10end_id = aP1[0];
      this.aP1 = aP1;
      pbuscapessoaendereco.this.AV14endereco_pessoa_vinculado = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV14endereco_pessoa_vinculado = false ;
      /* Using cursor P00282 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV13pes_id), Integer.valueOf(AV10end_id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A17end_id = P00282_A17end_id[0] ;
         A1pes_id = P00282_A1pes_id[0] ;
         AV14endereco_pessoa_vinculado = true ;
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
      this.aP0[0] = pbuscapessoaendereco.this.AV13pes_id;
      this.aP1[0] = pbuscapessoaendereco.this.AV10end_id;
      this.aP2[0] = pbuscapessoaendereco.this.AV14endereco_pessoa_vinculado;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      P00282_A17end_id = new int[1] ;
      P00282_A1pes_id = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pbuscapessoaendereco__default(),
         new Object[] {
             new Object[] {
            P00282_A17end_id, P00282_A1pes_id
            }
         }
      );
      /* GeneXus formulas. */
   }

   private int AV13pes_id ;
   private int AV10end_id ;
   private int A17end_id ;
   private int A1pes_id ;
   private boolean AV14endereco_pessoa_vinculado ;
   private boolean[] aP2 ;
   private int[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private int[] P00282_A17end_id ;
   private int[] P00282_A1pes_id ;
}

final  class pbuscapessoaendereco__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00282", "SELECT end_id, pes_id FROM pessoa_endereco WHERE pes_id = ? and end_id = ? ORDER BY pes_id, end_id  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

