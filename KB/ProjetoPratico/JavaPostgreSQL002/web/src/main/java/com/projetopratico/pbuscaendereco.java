package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbuscaendereco extends GXProcedure
{
   public pbuscaendereco( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbuscaendereco.class ), "" );
   }

   public pbuscaendereco( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( int[] aP0 ,
                          short[] aP1 ,
                          String[] aP2 ,
                          String[] aP3 ,
                          int[] aP4 ,
                          String[] aP5 )
   {
      pbuscaendereco.this.aP6 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( int[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( int[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 )
   {
      pbuscaendereco.this.AV8end_id = aP0[0];
      this.aP0 = aP0;
      pbuscaendereco.this.AV9encontrado_end_id = aP1[0];
      this.aP1 = aP1;
      pbuscaendereco.this.AV10end_tipo_logradouro = aP2[0];
      this.aP2 = aP2;
      pbuscaendereco.this.AV11end_logradouro = aP3[0];
      this.aP3 = aP3;
      pbuscaendereco.this.AV14end_numero = aP4[0];
      this.aP4 = aP4;
      pbuscaendereco.this.AV13end_bairro = aP5[0];
      this.aP5 = aP5;
      pbuscaendereco.this.AV12cid_id = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      /* Using cursor P001E2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV8end_id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A17end_id = P001E2_A17end_id[0] ;
         A18end_tipo_logradouro = P001E2_A18end_tipo_logradouro[0] ;
         A19end_logradouro = P001E2_A19end_logradouro[0] ;
         A20end_numero = P001E2_A20end_numero[0] ;
         A21end_bairro = P001E2_A21end_bairro[0] ;
         A14cid_id = P001E2_A14cid_id[0] ;
         AV9encontrado_end_id = (short)(A17end_id) ;
         AV10end_tipo_logradouro = A18end_tipo_logradouro ;
         AV11end_logradouro = A19end_logradouro ;
         AV14end_numero = A20end_numero ;
         AV13end_bairro = A21end_bairro ;
         AV12cid_id = A14cid_id ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbuscaendereco.this.AV8end_id;
      this.aP1[0] = pbuscaendereco.this.AV9encontrado_end_id;
      this.aP2[0] = pbuscaendereco.this.AV10end_tipo_logradouro;
      this.aP3[0] = pbuscaendereco.this.AV11end_logradouro;
      this.aP4[0] = pbuscaendereco.this.AV14end_numero;
      this.aP5[0] = pbuscaendereco.this.AV13end_bairro;
      this.aP6[0] = pbuscaendereco.this.AV12cid_id;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      P001E2_A17end_id = new int[1] ;
      P001E2_A18end_tipo_logradouro = new String[] {""} ;
      P001E2_A19end_logradouro = new String[] {""} ;
      P001E2_A20end_numero = new int[1] ;
      P001E2_A21end_bairro = new String[] {""} ;
      P001E2_A14cid_id = new int[1] ;
      A18end_tipo_logradouro = "" ;
      A19end_logradouro = "" ;
      A21end_bairro = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pbuscaendereco__default(),
         new Object[] {
             new Object[] {
            P001E2_A17end_id, P001E2_A18end_tipo_logradouro, P001E2_A19end_logradouro, P001E2_A20end_numero, P001E2_A21end_bairro, P001E2_A14cid_id
            }
         }
      );
      /* GeneXus formulas. */
   }

   private short AV9encontrado_end_id ;
   private int AV8end_id ;
   private int AV14end_numero ;
   private int AV12cid_id ;
   private int A17end_id ;
   private int A20end_numero ;
   private int A14cid_id ;
   private String AV10end_tipo_logradouro ;
   private String AV11end_logradouro ;
   private String AV13end_bairro ;
   private String A18end_tipo_logradouro ;
   private String A19end_logradouro ;
   private String A21end_bairro ;
   private int[] aP6 ;
   private int[] aP0 ;
   private short[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private int[] P001E2_A17end_id ;
   private String[] P001E2_A18end_tipo_logradouro ;
   private String[] P001E2_A19end_logradouro ;
   private int[] P001E2_A20end_numero ;
   private String[] P001E2_A21end_bairro ;
   private int[] P001E2_A14cid_id ;
}

final  class pbuscaendereco__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001E2", "SELECT end_id, end_tipo_logradouro, end_logradouro, end_numero, end_bairro, cid_id FROM endereco WHERE end_id = ? ORDER BY end_id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
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

