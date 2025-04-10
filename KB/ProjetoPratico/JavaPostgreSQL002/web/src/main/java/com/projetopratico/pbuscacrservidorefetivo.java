package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbuscacrservidorefetivo extends GXProcedure
{
   public pbuscacrservidorefetivo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbuscacrservidorefetivo.class ), "" );
   }

   public pbuscacrservidorefetivo( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int aP0 ,
                                                                        String aP1 ,
                                                                        com.projetopratico.SdtSDTCRServidorEfetivo[] aP2 )
   {
      pbuscacrservidorefetivo.this.aP3 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( int aP0 ,
                        String aP1 ,
                        com.projetopratico.SdtSDTCRServidorEfetivo[] aP2 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( int aP0 ,
                             String aP1 ,
                             com.projetopratico.SdtSDTCRServidorEfetivo[] aP2 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 )
   {
      pbuscacrservidorefetivo.this.AV10pes_id = aP0;
      pbuscacrservidorefetivo.this.AV17se_matricula = aP1;
      pbuscacrservidorefetivo.this.aP2 = aP2;
      pbuscacrservidorefetivo.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV16SDTCRServidorEfetivo = (com.projetopratico.SdtSDTCRServidorEfetivo)new com.projetopratico.SdtSDTCRServidorEfetivo(remoteHandle, context);
      AV19GXLvl2 = (byte)(0) ;
      /* Using cursor P002K2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV10pes_id), AV17se_matricula});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A24se_matricula = P002K2_A24se_matricula[0] ;
         A1pes_id = P002K2_A1pes_id[0] ;
         A2pes_nome = P002K2_A2pes_nome[0] ;
         A3pes_data_nascimento = P002K2_A3pes_data_nascimento[0] ;
         A4pes_sexo = P002K2_A4pes_sexo[0] ;
         A5pes_mae = P002K2_A5pes_mae[0] ;
         A6pes_pai = P002K2_A6pes_pai[0] ;
         A2pes_nome = P002K2_A2pes_nome[0] ;
         A3pes_data_nascimento = P002K2_A3pes_data_nascimento[0] ;
         A4pes_sexo = P002K2_A4pes_sexo[0] ;
         A5pes_mae = P002K2_A5pes_mae[0] ;
         A6pes_pai = P002K2_A6pes_pai[0] ;
         AV19GXLvl2 = (byte)(1) ;
         AV16SDTCRServidorEfetivo.setgxTv_SdtSDTCRServidorEfetivo_Pes_id( A1pes_id );
         AV16SDTCRServidorEfetivo.setgxTv_SdtSDTCRServidorEfetivo_Se_matricula( A24se_matricula );
         AV16SDTCRServidorEfetivo.setgxTv_SdtSDTCRServidorEfetivo_Pes_nome( A2pes_nome );
         AV16SDTCRServidorEfetivo.setgxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento( A3pes_data_nascimento );
         AV16SDTCRServidorEfetivo.setgxTv_SdtSDTCRServidorEfetivo_Pes_sexo( A4pes_sexo );
         AV16SDTCRServidorEfetivo.setgxTv_SdtSDTCRServidorEfetivo_Pes_mae( A5pes_mae );
         AV16SDTCRServidorEfetivo.setgxTv_SdtSDTCRServidorEfetivo_Pes_pai( A6pes_pai );
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
      if ( AV19GXLvl2 == 0 )
      {
         AV8Message.setgxTv_SdtMessages_Message_Description( "Servidor Efetivo com pes_id "+GXutil.trim( GXutil.str( AV10pes_id, 8, 0))+" com matricula "+GXutil.trim( AV17se_matricula)+" nao encontrado" );
         AV8Message.setgxTv_SdtMessages_Message_Type( (byte)(0) );
         AV9Messages.add(AV8Message, 0);
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'BUSCAENDERECOSERVIDOR' Routine */
      returnInSub = false ;
      /* Using cursor P002K3 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV10pes_id)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A1pes_id = P002K3_A1pes_id[0] ;
         A17end_id = P002K3_A17end_id[0] ;
         A18end_tipo_logradouro = P002K3_A18end_tipo_logradouro[0] ;
         A19end_logradouro = P002K3_A19end_logradouro[0] ;
         A20end_numero = P002K3_A20end_numero[0] ;
         A21end_bairro = P002K3_A21end_bairro[0] ;
         A14cid_id = P002K3_A14cid_id[0] ;
         A15cid_nome = P002K3_A15cid_nome[0] ;
         A16cid_uf = P002K3_A16cid_uf[0] ;
         A18end_tipo_logradouro = P002K3_A18end_tipo_logradouro[0] ;
         A19end_logradouro = P002K3_A19end_logradouro[0] ;
         A20end_numero = P002K3_A20end_numero[0] ;
         A21end_bairro = P002K3_A21end_bairro[0] ;
         A14cid_id = P002K3_A14cid_id[0] ;
         A15cid_nome = P002K3_A15cid_nome[0] ;
         A16cid_uf = P002K3_A16cid_uf[0] ;
         AV18SDTCRServidorEfetivoEnd = (com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem)new com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem(remoteHandle, context);
         AV18SDTCRServidorEfetivoEnd.setgxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_id( A17end_id );
         AV18SDTCRServidorEfetivoEnd.setgxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_tipo_logradouro( A18end_tipo_logradouro );
         AV18SDTCRServidorEfetivoEnd.setgxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_logradouro( A19end_logradouro );
         AV18SDTCRServidorEfetivoEnd.setgxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_numero( A20end_numero );
         AV18SDTCRServidorEfetivoEnd.setgxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_bairro( A21end_bairro );
         AV18SDTCRServidorEfetivoEnd.setgxTv_SdtSDTCRServidorEfetivo_enderecoItem_Cid_id( A14cid_id );
         AV18SDTCRServidorEfetivoEnd.setgxTv_SdtSDTCRServidorEfetivo_enderecoItem_Cid_nome( A15cid_nome );
         AV18SDTCRServidorEfetivoEnd.setgxTv_SdtSDTCRServidorEfetivo_enderecoItem_Cid_uf( A16cid_uf );
         AV16SDTCRServidorEfetivo.getgxTv_SdtSDTCRServidorEfetivo_Endereco().add(AV18SDTCRServidorEfetivoEnd, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP2[0] = pbuscacrservidorefetivo.this.AV16SDTCRServidorEfetivo;
      this.aP3[0] = pbuscacrservidorefetivo.this.AV9Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16SDTCRServidorEfetivo = new com.projetopratico.SdtSDTCRServidorEfetivo(remoteHandle, context);
      AV9Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      P002K2_A24se_matricula = new String[] {""} ;
      P002K2_A1pes_id = new int[1] ;
      P002K2_A2pes_nome = new String[] {""} ;
      P002K2_A3pes_data_nascimento = new java.util.Date[] {GXutil.nullDate()} ;
      P002K2_A4pes_sexo = new String[] {""} ;
      P002K2_A5pes_mae = new String[] {""} ;
      P002K2_A6pes_pai = new String[] {""} ;
      A24se_matricula = "" ;
      A2pes_nome = "" ;
      A3pes_data_nascimento = GXutil.nullDate() ;
      A4pes_sexo = "" ;
      A5pes_mae = "" ;
      A6pes_pai = "" ;
      AV8Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      P002K3_A1pes_id = new int[1] ;
      P002K3_A17end_id = new int[1] ;
      P002K3_A18end_tipo_logradouro = new String[] {""} ;
      P002K3_A19end_logradouro = new String[] {""} ;
      P002K3_A20end_numero = new int[1] ;
      P002K3_A21end_bairro = new String[] {""} ;
      P002K3_A14cid_id = new int[1] ;
      P002K3_A15cid_nome = new String[] {""} ;
      P002K3_A16cid_uf = new String[] {""} ;
      A18end_tipo_logradouro = "" ;
      A19end_logradouro = "" ;
      A21end_bairro = "" ;
      A15cid_nome = "" ;
      A16cid_uf = "" ;
      AV18SDTCRServidorEfetivoEnd = new com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pbuscacrservidorefetivo__default(),
         new Object[] {
             new Object[] {
            P002K2_A24se_matricula, P002K2_A1pes_id, P002K2_A2pes_nome, P002K2_A3pes_data_nascimento, P002K2_A4pes_sexo, P002K2_A5pes_mae, P002K2_A6pes_pai
            }
            , new Object[] {
            P002K3_A1pes_id, P002K3_A17end_id, P002K3_A18end_tipo_logradouro, P002K3_A19end_logradouro, P002K3_A20end_numero, P002K3_A21end_bairro, P002K3_A14cid_id, P002K3_A15cid_nome, P002K3_A16cid_uf
            }
         }
      );
      /* GeneXus formulas. */
   }

   private byte AV19GXLvl2 ;
   private int AV10pes_id ;
   private int A1pes_id ;
   private int A17end_id ;
   private int A20end_numero ;
   private int A14cid_id ;
   private String A16cid_uf ;
   private java.util.Date A3pes_data_nascimento ;
   private boolean returnInSub ;
   private String AV17se_matricula ;
   private String A24se_matricula ;
   private String A2pes_nome ;
   private String A4pes_sexo ;
   private String A5pes_mae ;
   private String A6pes_pai ;
   private String A18end_tipo_logradouro ;
   private String A19end_logradouro ;
   private String A21end_bairro ;
   private String A15cid_nome ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 ;
   private com.projetopratico.SdtSDTCRServidorEfetivo[] aP2 ;
   private com.projetopratico.SdtSDTCRServidorEfetivo AV16SDTCRServidorEfetivo ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV9Messages ;
   private IDataStoreProvider pr_default ;
   private String[] P002K2_A24se_matricula ;
   private int[] P002K2_A1pes_id ;
   private String[] P002K2_A2pes_nome ;
   private java.util.Date[] P002K2_A3pes_data_nascimento ;
   private String[] P002K2_A4pes_sexo ;
   private String[] P002K2_A5pes_mae ;
   private String[] P002K2_A6pes_pai ;
   private com.genexus.SdtMessages_Message AV8Message ;
   private int[] P002K3_A1pes_id ;
   private int[] P002K3_A17end_id ;
   private String[] P002K3_A18end_tipo_logradouro ;
   private String[] P002K3_A19end_logradouro ;
   private int[] P002K3_A20end_numero ;
   private String[] P002K3_A21end_bairro ;
   private int[] P002K3_A14cid_id ;
   private String[] P002K3_A15cid_nome ;
   private String[] P002K3_A16cid_uf ;
   private com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem AV18SDTCRServidorEfetivoEnd ;
}

final  class pbuscacrservidorefetivo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002K2", "SELECT T1.se_matricula, T1.pes_id, T2.pes_nome, T2.pes_data_nascimento, T2.pes_sexo, T2.pes_mae, T2.pes_pai FROM (servidor_efetivo T1 INNER JOIN pessoa T2 ON T2.pes_id = T1.pes_id) WHERE T1.pes_id = ? and T1.se_matricula = ( ?) ORDER BY T1.pes_id, T1.se_matricula ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P002K3", "SELECT T1.pes_id, T1.end_id, T2.end_tipo_logradouro, T2.end_logradouro, T2.end_numero, T2.end_bairro, T2.cid_id, T3.cid_nome, T3.cid_uf FROM ((pessoa_endereco T1 INNER JOIN endereco T2 ON T2.end_id = T1.end_id) INNER JOIN cidade T3 ON T3.cid_id = T2.cid_id) WHERE T1.pes_id = ? ORDER BY T1.pes_id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
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
               stmt.setVarchar(2, (String)parms[1], 20);
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

