package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbuscacrservidortemporario extends GXProcedure
{
   public pbuscacrservidortemporario( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbuscacrservidortemporario.class ), "" );
   }

   public pbuscacrservidortemporario( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int aP0 ,
                                                                        java.util.Date aP1 ,
                                                                        java.util.Date aP2 ,
                                                                        com.projetopratico.SdtSDTCRServidorTemporario[] aP3 )
   {
      pbuscacrservidortemporario.this.aP4 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( int aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 ,
                        com.projetopratico.SdtSDTCRServidorTemporario[] aP3 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( int aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             com.projetopratico.SdtSDTCRServidorTemporario[] aP3 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 )
   {
      pbuscacrservidortemporario.this.AV13pes_id = aP0;
      pbuscacrservidortemporario.this.AV15st_data_admissao = aP1;
      pbuscacrservidortemporario.this.AV14st_data_demissao = aP2;
      pbuscacrservidortemporario.this.aP3 = aP3;
      pbuscacrservidortemporario.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV12SDTCRServidorTemporario = (com.projetopratico.SdtSDTCRServidorTemporario)new com.projetopratico.SdtSDTCRServidorTemporario(remoteHandle, context);
      AV18GXLvl2 = (byte)(0) ;
      /* Using cursor P002B2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV13pes_id), AV15st_data_admissao, AV14st_data_demissao});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A23st_data_demissao = P002B2_A23st_data_demissao[0] ;
         A22st_data_admissao = P002B2_A22st_data_admissao[0] ;
         A1pes_id = P002B2_A1pes_id[0] ;
         A2pes_nome = P002B2_A2pes_nome[0] ;
         A3pes_data_nascimento = P002B2_A3pes_data_nascimento[0] ;
         A4pes_sexo = P002B2_A4pes_sexo[0] ;
         A5pes_mae = P002B2_A5pes_mae[0] ;
         A6pes_pai = P002B2_A6pes_pai[0] ;
         A2pes_nome = P002B2_A2pes_nome[0] ;
         A3pes_data_nascimento = P002B2_A3pes_data_nascimento[0] ;
         A4pes_sexo = P002B2_A4pes_sexo[0] ;
         A5pes_mae = P002B2_A5pes_mae[0] ;
         A6pes_pai = P002B2_A6pes_pai[0] ;
         AV18GXLvl2 = (byte)(1) ;
         AV12SDTCRServidorTemporario.setgxTv_SdtSDTCRServidorTemporario_Pes_id( A1pes_id );
         AV12SDTCRServidorTemporario.setgxTv_SdtSDTCRServidorTemporario_St_data_admissao( A22st_data_admissao );
         AV12SDTCRServidorTemporario.setgxTv_SdtSDTCRServidorTemporario_St_data_demissao( A23st_data_demissao );
         AV12SDTCRServidorTemporario.setgxTv_SdtSDTCRServidorTemporario_Pes_nome( A2pes_nome );
         AV12SDTCRServidorTemporario.setgxTv_SdtSDTCRServidorTemporario_Pes_data_nascimento( A3pes_data_nascimento );
         AV12SDTCRServidorTemporario.setgxTv_SdtSDTCRServidorTemporario_Pes_sexo( A4pes_sexo );
         AV12SDTCRServidorTemporario.setgxTv_SdtSDTCRServidorTemporario_Pes_mae( A5pes_mae );
         AV12SDTCRServidorTemporario.setgxTv_SdtSDTCRServidorTemporario_Pes_pai( A6pes_pai );
         /* Execute user subroutine: 'BUSCAENDERECOSERVIDOR' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV18GXLvl2 == 0 )
      {
         AV9Message.setgxTv_SdtMessages_Message_Description( "Servidor Temporario com pes_id "+GXutil.trim( GXutil.str( AV13pes_id, 8, 0))+" com admissao "+GXutil.trim( localUtil.dtoc( AV15st_data_admissao, 6, "/"))+" e demissao "+GXutil.trim( localUtil.dtoc( AV14st_data_demissao, 6, "/"))+" nao encontrado" );
         AV9Message.setgxTv_SdtMessages_Message_Type( (byte)(0) );
         AV10Messages.add(AV9Message, 0);
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'BUSCAENDERECOSERVIDOR' Routine */
      returnInSub = false ;
      /* Using cursor P002B3 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV13pes_id)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A1pes_id = P002B3_A1pes_id[0] ;
         A17end_id = P002B3_A17end_id[0] ;
         A18end_tipo_logradouro = P002B3_A18end_tipo_logradouro[0] ;
         A19end_logradouro = P002B3_A19end_logradouro[0] ;
         A20end_numero = P002B3_A20end_numero[0] ;
         A21end_bairro = P002B3_A21end_bairro[0] ;
         A14cid_id = P002B3_A14cid_id[0] ;
         A15cid_nome = P002B3_A15cid_nome[0] ;
         A16cid_uf = P002B3_A16cid_uf[0] ;
         A18end_tipo_logradouro = P002B3_A18end_tipo_logradouro[0] ;
         A19end_logradouro = P002B3_A19end_logradouro[0] ;
         A20end_numero = P002B3_A20end_numero[0] ;
         A21end_bairro = P002B3_A21end_bairro[0] ;
         A14cid_id = P002B3_A14cid_id[0] ;
         A15cid_nome = P002B3_A15cid_nome[0] ;
         A16cid_uf = P002B3_A16cid_uf[0] ;
         AV17SDTCRServidorTemporarioEnd = (com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem)new com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem(remoteHandle, context);
         AV17SDTCRServidorTemporarioEnd.setgxTv_SdtSDTCRServidorTemporario_enderecoItem_End_id( A17end_id );
         AV17SDTCRServidorTemporarioEnd.setgxTv_SdtSDTCRServidorTemporario_enderecoItem_End_tipo_logradouro( A18end_tipo_logradouro );
         AV17SDTCRServidorTemporarioEnd.setgxTv_SdtSDTCRServidorTemporario_enderecoItem_End_logradouro( A19end_logradouro );
         AV17SDTCRServidorTemporarioEnd.setgxTv_SdtSDTCRServidorTemporario_enderecoItem_End_numero( A20end_numero );
         AV17SDTCRServidorTemporarioEnd.setgxTv_SdtSDTCRServidorTemporario_enderecoItem_End_bairro( A21end_bairro );
         AV17SDTCRServidorTemporarioEnd.setgxTv_SdtSDTCRServidorTemporario_enderecoItem_Cid_id( A14cid_id );
         AV17SDTCRServidorTemporarioEnd.setgxTv_SdtSDTCRServidorTemporario_enderecoItem_Cid_nome( A15cid_nome );
         AV17SDTCRServidorTemporarioEnd.setgxTv_SdtSDTCRServidorTemporario_enderecoItem_Cid_uf( A16cid_uf );
         AV12SDTCRServidorTemporario.getgxTv_SdtSDTCRServidorTemporario_Endereco().add(AV17SDTCRServidorTemporarioEnd, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = pbuscacrservidortemporario.this.AV12SDTCRServidorTemporario;
      this.aP4[0] = pbuscacrservidortemporario.this.AV10Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12SDTCRServidorTemporario = new com.projetopratico.SdtSDTCRServidorTemporario(remoteHandle, context);
      AV10Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      P002B2_A23st_data_demissao = new java.util.Date[] {GXutil.nullDate()} ;
      P002B2_A22st_data_admissao = new java.util.Date[] {GXutil.nullDate()} ;
      P002B2_A1pes_id = new int[1] ;
      P002B2_A2pes_nome = new String[] {""} ;
      P002B2_A3pes_data_nascimento = new java.util.Date[] {GXutil.nullDate()} ;
      P002B2_A4pes_sexo = new String[] {""} ;
      P002B2_A5pes_mae = new String[] {""} ;
      P002B2_A6pes_pai = new String[] {""} ;
      A23st_data_demissao = GXutil.nullDate() ;
      A22st_data_admissao = GXutil.nullDate() ;
      A2pes_nome = "" ;
      A3pes_data_nascimento = GXutil.nullDate() ;
      A4pes_sexo = "" ;
      A5pes_mae = "" ;
      A6pes_pai = "" ;
      AV9Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      P002B3_A1pes_id = new int[1] ;
      P002B3_A17end_id = new int[1] ;
      P002B3_A18end_tipo_logradouro = new String[] {""} ;
      P002B3_A19end_logradouro = new String[] {""} ;
      P002B3_A20end_numero = new int[1] ;
      P002B3_A21end_bairro = new String[] {""} ;
      P002B3_A14cid_id = new int[1] ;
      P002B3_A15cid_nome = new String[] {""} ;
      P002B3_A16cid_uf = new String[] {""} ;
      A18end_tipo_logradouro = "" ;
      A19end_logradouro = "" ;
      A21end_bairro = "" ;
      A15cid_nome = "" ;
      A16cid_uf = "" ;
      AV17SDTCRServidorTemporarioEnd = new com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pbuscacrservidortemporario__default(),
         new Object[] {
             new Object[] {
            P002B2_A23st_data_demissao, P002B2_A22st_data_admissao, P002B2_A1pes_id, P002B2_A2pes_nome, P002B2_A3pes_data_nascimento, P002B2_A4pes_sexo, P002B2_A5pes_mae, P002B2_A6pes_pai
            }
            , new Object[] {
            P002B3_A1pes_id, P002B3_A17end_id, P002B3_A18end_tipo_logradouro, P002B3_A19end_logradouro, P002B3_A20end_numero, P002B3_A21end_bairro, P002B3_A14cid_id, P002B3_A15cid_nome, P002B3_A16cid_uf
            }
         }
      );
      /* GeneXus formulas. */
   }

   private byte AV18GXLvl2 ;
   private int AV13pes_id ;
   private int A1pes_id ;
   private int A17end_id ;
   private int A20end_numero ;
   private int A14cid_id ;
   private String A16cid_uf ;
   private java.util.Date AV15st_data_admissao ;
   private java.util.Date AV14st_data_demissao ;
   private java.util.Date A23st_data_demissao ;
   private java.util.Date A22st_data_admissao ;
   private java.util.Date A3pes_data_nascimento ;
   private boolean returnInSub ;
   private String A2pes_nome ;
   private String A4pes_sexo ;
   private String A5pes_mae ;
   private String A6pes_pai ;
   private String A18end_tipo_logradouro ;
   private String A19end_logradouro ;
   private String A21end_bairro ;
   private String A15cid_nome ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 ;
   private com.projetopratico.SdtSDTCRServidorTemporario[] aP3 ;
   private com.projetopratico.SdtSDTCRServidorTemporario AV12SDTCRServidorTemporario ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV10Messages ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P002B2_A23st_data_demissao ;
   private java.util.Date[] P002B2_A22st_data_admissao ;
   private int[] P002B2_A1pes_id ;
   private String[] P002B2_A2pes_nome ;
   private java.util.Date[] P002B2_A3pes_data_nascimento ;
   private String[] P002B2_A4pes_sexo ;
   private String[] P002B2_A5pes_mae ;
   private String[] P002B2_A6pes_pai ;
   private com.genexus.SdtMessages_Message AV9Message ;
   private int[] P002B3_A1pes_id ;
   private int[] P002B3_A17end_id ;
   private String[] P002B3_A18end_tipo_logradouro ;
   private String[] P002B3_A19end_logradouro ;
   private int[] P002B3_A20end_numero ;
   private String[] P002B3_A21end_bairro ;
   private int[] P002B3_A14cid_id ;
   private String[] P002B3_A15cid_nome ;
   private String[] P002B3_A16cid_uf ;
   private com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem AV17SDTCRServidorTemporarioEnd ;
}

final  class pbuscacrservidortemporario__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002B2", "SELECT T1.st_data_demissao, T1.st_data_admissao, T1.pes_id, T2.pes_nome, T2.pes_data_nascimento, T2.pes_sexo, T2.pes_mae, T2.pes_pai FROM (servidor_temporario T1 INNER JOIN pessoa T2 ON T2.pes_id = T1.pes_id) WHERE T1.pes_id = ? and T1.st_data_admissao = ? and T1.st_data_demissao = ? ORDER BY T1.pes_id, T1.st_data_admissao, T1.st_data_demissao ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P002B3", "SELECT T1.pes_id, T1.end_id, T2.end_tipo_logradouro, T2.end_logradouro, T2.end_numero, T2.end_bairro, T2.cid_id, T3.cid_nome, T3.cid_uf FROM ((pessoa_endereco T1 INNER JOIN endereco T2 ON T2.end_id = T1.end_id) INNER JOIN cidade T3 ON T3.cid_id = T2.cid_id) WHERE T1.pes_id = ? ORDER BY T1.pes_id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 2);
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
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

