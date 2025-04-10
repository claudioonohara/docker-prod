package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbuscacidade extends GXProcedure
{
   public pbuscacidade( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbuscacidade.class ), "" );
   }

   public pbuscacidade( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( int[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pbuscacidade.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( int[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( int[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pbuscacidade.this.AV8cid_id = aP0[0];
      this.aP0 = aP0;
      pbuscacidade.this.AV9encontrado_cid_id = aP1[0];
      this.aP1 = aP1;
      pbuscacidade.this.AV10cid_nome = aP2[0];
      this.aP2 = aP2;
      pbuscacidade.this.AV11cid_uf = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      /* Using cursor P001F2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV8cid_id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14cid_id = P001F2_A14cid_id[0] ;
         A15cid_nome = P001F2_A15cid_nome[0] ;
         A16cid_uf = P001F2_A16cid_uf[0] ;
         AV9encontrado_cid_id = A14cid_id ;
         AV10cid_nome = A15cid_nome ;
         AV11cid_uf = A16cid_uf ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbuscacidade.this.AV8cid_id;
      this.aP1[0] = pbuscacidade.this.AV9encontrado_cid_id;
      this.aP2[0] = pbuscacidade.this.AV10cid_nome;
      this.aP3[0] = pbuscacidade.this.AV11cid_uf;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      P001F2_A14cid_id = new int[1] ;
      P001F2_A15cid_nome = new String[] {""} ;
      P001F2_A16cid_uf = new String[] {""} ;
      A15cid_nome = "" ;
      A16cid_uf = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pbuscacidade__default(),
         new Object[] {
             new Object[] {
            P001F2_A14cid_id, P001F2_A15cid_nome, P001F2_A16cid_uf
            }
         }
      );
      /* GeneXus formulas. */
   }

   private int AV8cid_id ;
   private int AV9encontrado_cid_id ;
   private int A14cid_id ;
   private String AV11cid_uf ;
   private String A16cid_uf ;
   private String AV10cid_nome ;
   private String A15cid_nome ;
   private String[] aP3 ;
   private int[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private int[] P001F2_A14cid_id ;
   private String[] P001F2_A15cid_nome ;
   private String[] P001F2_A16cid_uf ;
}

final  class pbuscacidade__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001F2", "SELECT cid_id, cid_nome, cid_uf FROM cidade WHERE cid_id = ? ORDER BY cid_id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
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

