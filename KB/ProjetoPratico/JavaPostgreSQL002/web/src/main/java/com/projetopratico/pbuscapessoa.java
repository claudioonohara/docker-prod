package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbuscapessoa extends GXProcedure
{
   public pbuscapessoa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbuscapessoa.class ), "" );
   }

   public pbuscapessoa( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( int[] aP0 ,
                            int[] aP1 ,
                            String[] aP2 ,
                            java.util.Date[] aP3 ,
                            String[] aP4 ,
                            String[] aP5 ,
                            String[] aP6 )
   {
      pbuscapessoa.this.aP7 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( int[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        java.util.Date[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        short[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( int[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.util.Date[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             short[] aP7 )
   {
      pbuscapessoa.this.AV14pes_id = aP0[0];
      this.aP0 = aP0;
      pbuscapessoa.this.AV19encontrado_pes_id = aP1[0];
      this.aP1 = aP1;
      pbuscapessoa.this.AV25pes_nome = aP2[0];
      this.aP2 = aP2;
      pbuscapessoa.this.AV24pes_data_nascimento = aP3[0];
      this.aP3 = aP3;
      pbuscapessoa.this.AV23pes_sexo = aP4[0];
      this.aP4 = aP4;
      pbuscapessoa.this.AV22pes_mae = aP5[0];
      this.aP5 = aP5;
      pbuscapessoa.this.AV21pes_pai = aP6[0];
      this.aP6 = aP6;
      pbuscapessoa.this.AV20pes_idade = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      /* Using cursor P001W2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV14pes_id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1pes_id = P001W2_A1pes_id[0] ;
         A2pes_nome = P001W2_A2pes_nome[0] ;
         A4pes_sexo = P001W2_A4pes_sexo[0] ;
         A5pes_mae = P001W2_A5pes_mae[0] ;
         A6pes_pai = P001W2_A6pes_pai[0] ;
         A3pes_data_nascimento = P001W2_A3pes_data_nascimento[0] ;
         GXt_dtime1 = GXutil.resetTime( A3pes_data_nascimento );
         A30pes_idade = (short)(GXutil.age( GXt_dtime1, GXutil.now( ))) ;
         AV19encontrado_pes_id = A1pes_id ;
         AV25pes_nome = A2pes_nome ;
         AV24pes_data_nascimento = A3pes_data_nascimento ;
         AV23pes_sexo = A4pes_sexo ;
         AV22pes_mae = A5pes_mae ;
         AV21pes_pai = A6pes_pai ;
         AV20pes_idade = A30pes_idade ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbuscapessoa.this.AV14pes_id;
      this.aP1[0] = pbuscapessoa.this.AV19encontrado_pes_id;
      this.aP2[0] = pbuscapessoa.this.AV25pes_nome;
      this.aP3[0] = pbuscapessoa.this.AV24pes_data_nascimento;
      this.aP4[0] = pbuscapessoa.this.AV23pes_sexo;
      this.aP5[0] = pbuscapessoa.this.AV22pes_mae;
      this.aP6[0] = pbuscapessoa.this.AV21pes_pai;
      this.aP7[0] = pbuscapessoa.this.AV20pes_idade;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      P001W2_A1pes_id = new int[1] ;
      P001W2_A2pes_nome = new String[] {""} ;
      P001W2_A4pes_sexo = new String[] {""} ;
      P001W2_A5pes_mae = new String[] {""} ;
      P001W2_A6pes_pai = new String[] {""} ;
      P001W2_A3pes_data_nascimento = new java.util.Date[] {GXutil.nullDate()} ;
      A2pes_nome = "" ;
      A4pes_sexo = "" ;
      A5pes_mae = "" ;
      A6pes_pai = "" ;
      A3pes_data_nascimento = GXutil.nullDate() ;
      GXt_dtime1 = GXutil.resetTime( GXutil.nullDate() );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pbuscapessoa__default(),
         new Object[] {
             new Object[] {
            P001W2_A1pes_id, P001W2_A2pes_nome, P001W2_A4pes_sexo, P001W2_A5pes_mae, P001W2_A6pes_pai, P001W2_A3pes_data_nascimento
            }
         }
      );
      /* GeneXus formulas. */
   }

   private short AV20pes_idade ;
   private short A30pes_idade ;
   private int AV14pes_id ;
   private int AV19encontrado_pes_id ;
   private int A1pes_id ;
   private java.util.Date GXt_dtime1 ;
   private java.util.Date AV24pes_data_nascimento ;
   private java.util.Date A3pes_data_nascimento ;
   private String AV25pes_nome ;
   private String AV23pes_sexo ;
   private String AV22pes_mae ;
   private String AV21pes_pai ;
   private String A2pes_nome ;
   private String A4pes_sexo ;
   private String A5pes_mae ;
   private String A6pes_pai ;
   private short[] aP7 ;
   private int[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private java.util.Date[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private int[] P001W2_A1pes_id ;
   private String[] P001W2_A2pes_nome ;
   private String[] P001W2_A4pes_sexo ;
   private String[] P001W2_A5pes_mae ;
   private String[] P001W2_A6pes_pai ;
   private java.util.Date[] P001W2_A3pes_data_nascimento ;
}

final  class pbuscapessoa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001W2", "SELECT pes_id, pes_nome, pes_sexo, pes_mae, pes_pai, pes_data_nascimento FROM pessoa WHERE pes_id = ? ORDER BY pes_id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
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

