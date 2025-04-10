package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbuscaunidade extends GXProcedure
{
   public pbuscaunidade( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbuscaunidade.class ), "" );
   }

   public pbuscaunidade( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( int[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pbuscaunidade.this.aP3 = new String[] {""};
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
      pbuscaunidade.this.AV12unid_id = aP0[0];
      this.aP0 = aP0;
      pbuscaunidade.this.AV14encontrado_unid_id = aP1[0];
      this.aP1 = aP1;
      pbuscaunidade.this.AV13unid_nome = aP2[0];
      this.aP2 = aP2;
      pbuscaunidade.this.AV15unid_sigla = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      /* Using cursor P001L2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV12unid_id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7unid_id = P001L2_A7unid_id[0] ;
         A8unid_nome = P001L2_A8unid_nome[0] ;
         A9unid_sigla = P001L2_A9unid_sigla[0] ;
         AV14encontrado_unid_id = A7unid_id ;
         AV13unid_nome = A8unid_nome ;
         AV15unid_sigla = A9unid_sigla ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbuscaunidade.this.AV12unid_id;
      this.aP1[0] = pbuscaunidade.this.AV14encontrado_unid_id;
      this.aP2[0] = pbuscaunidade.this.AV13unid_nome;
      this.aP3[0] = pbuscaunidade.this.AV15unid_sigla;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      P001L2_A7unid_id = new int[1] ;
      P001L2_A8unid_nome = new String[] {""} ;
      P001L2_A9unid_sigla = new String[] {""} ;
      A8unid_nome = "" ;
      A9unid_sigla = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pbuscaunidade__default(),
         new Object[] {
             new Object[] {
            P001L2_A7unid_id, P001L2_A8unid_nome, P001L2_A9unid_sigla
            }
         }
      );
      /* GeneXus formulas. */
   }

   private int AV12unid_id ;
   private int AV14encontrado_unid_id ;
   private int A7unid_id ;
   private String AV13unid_nome ;
   private String AV15unid_sigla ;
   private String A8unid_nome ;
   private String A9unid_sigla ;
   private String[] aP3 ;
   private int[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private int[] P001L2_A7unid_id ;
   private String[] P001L2_A8unid_nome ;
   private String[] P001L2_A9unid_sigla ;
}

final  class pbuscaunidade__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001L2", "SELECT unid_id, unid_nome, unid_sigla FROM unidade WHERE unid_id = ? ORDER BY unid_id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

