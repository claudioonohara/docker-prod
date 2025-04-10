package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pconsultaenderecofuncional extends GXProcedure
{
   public pconsultaenderecofuncional( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pconsultaenderecofuncional.class ), "" );
   }

   public pconsultaenderecofuncional( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( String aP0 ,
                                                                        int aP1 ,
                                                                        int aP2 ,
                                                                        com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional[] aP3 )
   {
      pconsultaenderecofuncional.this.aP4 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional[] aP3 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional[] aP3 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 )
   {
      pconsultaenderecofuncional.this.AV13pes_nome = aP0;
      pconsultaenderecofuncional.this.AV24PaginaAtual = aP1;
      pconsultaenderecofuncional.this.AV25nroPorPagina = aP2;
      pconsultaenderecofuncional.this.aP3 = aP3;
      pconsultaenderecofuncional.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV19TotalItens = 0 ;
      /* Optimized group. */
      lV13pes_nome = GXutil.concat( GXutil.rtrim( AV13pes_nome), "%", "") ;
      /* Using cursor P002R2 */
      pr_default.execute(0, new Object[] {lV13pes_nome});
      cV19TotalItens = P002R2_AV19TotalItens[0] ;
      pr_default.close(0);
      AV19TotalItens = (int)(AV19TotalItens+cV19TotalItens*1) ;
      /* End optimized group. */
      if ( AV24PaginaAtual <= 0 )
      {
         AV11Pagina = 1 ;
      }
      else
      {
         AV11Pagina = AV24PaginaAtual ;
      }
      if ( AV25nroPorPagina <= 0 )
      {
         AV8ItensPorPagina = 10 ;
      }
      else
      {
         AV8ItensPorPagina = AV25nroPorPagina ;
      }
      AV21NumeroPaginas = DecimalUtil.doubleToDec(AV19TotalItens).divide(DecimalUtil.doubleToDec(AV8ItensPorPagina), java.math.MathContext.DECIMAL128) ;
      AV20TotalPaginas = (int)(GXutil.Int( DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV19TotalItens).divide(DecimalUtil.doubleToDec(AV8ItensPorPagina), java.math.MathContext.DECIMAL128)))) ;
      if ( AV21NumeroPaginas.doubleValue() > AV20TotalPaginas )
      {
         AV20TotalPaginas = (int)(AV20TotalPaginas+1) ;
      }
      AV18Skip = (short)((AV11Pagina-1)*AV8ItensPorPagina) ;
      AV14SDTServidorEfetivoEnderecoFuncional = (com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional)new com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional(remoteHandle, context);
      AV14SDTServidorEfetivoEnderecoFuncional.setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Nroporpagina( AV8ItensPorPagina );
      AV14SDTServidorEfetivoEnderecoFuncional.setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Paginaatual( AV11Pagina );
      AV14SDTServidorEfetivoEnderecoFuncional.setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalitens( AV19TotalItens );
      AV14SDTServidorEfetivoEnderecoFuncional.setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalpaginas( AV20TotalPaginas );
      GXPagingFrom3 = AV18Skip ;
      GXPagingTo3 = AV8ItensPorPagina ;
      lV13pes_nome = GXutil.concat( GXutil.rtrim( AV13pes_nome), "%", "") ;
      /* Using cursor P002R3 */
      pr_default.execute(1, new Object[] {lV13pes_nome, Integer.valueOf(GXPagingFrom3), Integer.valueOf(GXPagingTo3), Integer.valueOf(GXPagingTo3)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A1pes_id = P002R3_A1pes_id[0] ;
         A2pes_nome = P002R3_A2pes_nome[0] ;
         A24se_matricula = P002R3_A24se_matricula[0] ;
         A2pes_nome = P002R3_A2pes_nome[0] ;
         AV17SDTServidorEfetivoEnderecoFuncionalItemServidor = (com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem)new com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem(remoteHandle, context);
         AV17SDTServidorEfetivoEnderecoFuncionalItemServidor.setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_id( A1pes_id );
         AV17SDTServidorEfetivoEnderecoFuncionalItemServidor.setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_nome( A2pes_nome );
         AV17SDTServidorEfetivoEnderecoFuncionalItemServidor.setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Se_matricula( A24se_matricula );
         /* Using cursor P002R4 */
         pr_default.execute(2, new Object[] {Integer.valueOf(A1pes_id)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A7unid_id = P002R4_A7unid_id[0] ;
            A25lot_id = P002R4_A25lot_id[0] ;
            A26lot_data_lotacao = P002R4_A26lot_data_lotacao[0] ;
            A27lot_data_remocao = P002R4_A27lot_data_remocao[0] ;
            A8unid_nome = P002R4_A8unid_nome[0] ;
            A9unid_sigla = P002R4_A9unid_sigla[0] ;
            A8unid_nome = P002R4_A8unid_nome[0] ;
            A9unid_sigla = P002R4_A9unid_sigla[0] ;
            AV16SDTServidorEfetivoEnderecoFuncionalItemLotacao = (com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem)new com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem(remoteHandle, context);
            AV16SDTServidorEfetivoEnderecoFuncionalItemLotacao.setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_id( A25lot_id );
            AV16SDTServidorEfetivoEnderecoFuncionalItemLotacao.setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao( A26lot_data_lotacao );
            AV16SDTServidorEfetivoEnderecoFuncionalItemLotacao.setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao( A27lot_data_remocao );
            AV16SDTServidorEfetivoEnderecoFuncionalItemLotacao.setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_id( A7unid_id );
            AV16SDTServidorEfetivoEnderecoFuncionalItemLotacao.setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_nome( A8unid_nome );
            AV16SDTServidorEfetivoEnderecoFuncionalItemLotacao.setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_sigla( A9unid_sigla );
            /* Using cursor P002R5 */
            pr_default.execute(3, new Object[] {Integer.valueOf(A7unid_id)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A17end_id = P002R5_A17end_id[0] ;
               A19end_logradouro = P002R5_A19end_logradouro[0] ;
               A20end_numero = P002R5_A20end_numero[0] ;
               A21end_bairro = P002R5_A21end_bairro[0] ;
               A14cid_id = P002R5_A14cid_id[0] ;
               A15cid_nome = P002R5_A15cid_nome[0] ;
               A16cid_uf = P002R5_A16cid_uf[0] ;
               A19end_logradouro = P002R5_A19end_logradouro[0] ;
               A20end_numero = P002R5_A20end_numero[0] ;
               A21end_bairro = P002R5_A21end_bairro[0] ;
               A14cid_id = P002R5_A14cid_id[0] ;
               A15cid_nome = P002R5_A15cid_nome[0] ;
               A16cid_uf = P002R5_A16cid_uf[0] ;
               AV15SDTServidorEfetivoEnderecoFuncionalItemEndereco = (com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem)new com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem(remoteHandle, context);
               AV15SDTServidorEfetivoEnderecoFuncionalItemEndereco.setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_id( A17end_id );
               AV15SDTServidorEfetivoEnderecoFuncionalItemEndereco.setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_logradouro( A19end_logradouro );
               AV15SDTServidorEfetivoEnderecoFuncionalItemEndereco.setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_numero( A20end_numero );
               AV15SDTServidorEfetivoEnderecoFuncionalItemEndereco.setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_bairro( A21end_bairro );
               AV15SDTServidorEfetivoEnderecoFuncionalItemEndereco.setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_id( A14cid_id );
               AV15SDTServidorEfetivoEnderecoFuncionalItemEndereco.setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_nome( A15cid_nome );
               AV15SDTServidorEfetivoEnderecoFuncionalItemEndereco.setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_uf( A16cid_uf );
               AV16SDTServidorEfetivoEnderecoFuncionalItemLotacao.getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco().add(AV15SDTServidorEfetivoEnderecoFuncionalItemEndereco, 0);
               pr_default.readNext(3);
            }
            pr_default.close(3);
            AV17SDTServidorEfetivoEnderecoFuncionalItemServidor.getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao().add(AV16SDTServidorEfetivoEnderecoFuncionalItemLotacao, 0);
            pr_default.readNext(2);
         }
         pr_default.close(2);
         AV14SDTServidorEfetivoEnderecoFuncional.getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor().add(AV17SDTServidorEfetivoEnderecoFuncionalItemServidor, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = pconsultaenderecofuncional.this.AV14SDTServidorEfetivoEnderecoFuncional;
      this.aP4[0] = pconsultaenderecofuncional.this.AV10Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14SDTServidorEfetivoEnderecoFuncional = new com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional(remoteHandle, context);
      AV10Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      lV13pes_nome = "" ;
      P002R2_AV19TotalItens = new int[1] ;
      AV21NumeroPaginas = DecimalUtil.ZERO ;
      P002R3_A1pes_id = new int[1] ;
      P002R3_A2pes_nome = new String[] {""} ;
      P002R3_A24se_matricula = new String[] {""} ;
      A2pes_nome = "" ;
      A24se_matricula = "" ;
      AV17SDTServidorEfetivoEnderecoFuncionalItemServidor = new com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem(remoteHandle, context);
      P002R4_A1pes_id = new int[1] ;
      P002R4_A7unid_id = new int[1] ;
      P002R4_A25lot_id = new int[1] ;
      P002R4_A26lot_data_lotacao = new java.util.Date[] {GXutil.nullDate()} ;
      P002R4_A27lot_data_remocao = new java.util.Date[] {GXutil.nullDate()} ;
      P002R4_A8unid_nome = new String[] {""} ;
      P002R4_A9unid_sigla = new String[] {""} ;
      A26lot_data_lotacao = GXutil.nullDate() ;
      A27lot_data_remocao = GXutil.nullDate() ;
      A8unid_nome = "" ;
      A9unid_sigla = "" ;
      AV16SDTServidorEfetivoEnderecoFuncionalItemLotacao = new com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem(remoteHandle, context);
      P002R5_A7unid_id = new int[1] ;
      P002R5_A17end_id = new int[1] ;
      P002R5_A19end_logradouro = new String[] {""} ;
      P002R5_A20end_numero = new int[1] ;
      P002R5_A21end_bairro = new String[] {""} ;
      P002R5_A14cid_id = new int[1] ;
      P002R5_A15cid_nome = new String[] {""} ;
      P002R5_A16cid_uf = new String[] {""} ;
      A19end_logradouro = "" ;
      A21end_bairro = "" ;
      A15cid_nome = "" ;
      A16cid_uf = "" ;
      AV15SDTServidorEfetivoEnderecoFuncionalItemEndereco = new com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pconsultaenderecofuncional__default(),
         new Object[] {
             new Object[] {
            P002R2_AV19TotalItens
            }
            , new Object[] {
            P002R3_A1pes_id, P002R3_A2pes_nome, P002R3_A24se_matricula
            }
            , new Object[] {
            P002R4_A1pes_id, P002R4_A7unid_id, P002R4_A25lot_id, P002R4_A26lot_data_lotacao, P002R4_A27lot_data_remocao, P002R4_A8unid_nome, P002R4_A9unid_sigla
            }
            , new Object[] {
            P002R5_A7unid_id, P002R5_A17end_id, P002R5_A19end_logradouro, P002R5_A20end_numero, P002R5_A21end_bairro, P002R5_A14cid_id, P002R5_A15cid_nome, P002R5_A16cid_uf
            }
         }
      );
      /* GeneXus formulas. */
   }

   private short AV18Skip ;
   private int AV24PaginaAtual ;
   private int AV25nroPorPagina ;
   private int AV19TotalItens ;
   private int cV19TotalItens ;
   private int AV11Pagina ;
   private int AV8ItensPorPagina ;
   private int AV20TotalPaginas ;
   private int GXPagingFrom3 ;
   private int GXPagingTo3 ;
   private int A1pes_id ;
   private int A7unid_id ;
   private int A25lot_id ;
   private int A17end_id ;
   private int A20end_numero ;
   private int A14cid_id ;
   private java.math.BigDecimal AV21NumeroPaginas ;
   private String A16cid_uf ;
   private java.util.Date A26lot_data_lotacao ;
   private java.util.Date A27lot_data_remocao ;
   private String AV13pes_nome ;
   private String lV13pes_nome ;
   private String A2pes_nome ;
   private String A24se_matricula ;
   private String A8unid_nome ;
   private String A9unid_sigla ;
   private String A19end_logradouro ;
   private String A21end_bairro ;
   private String A15cid_nome ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 ;
   private com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional[] aP3 ;
   private com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional AV14SDTServidorEfetivoEnderecoFuncional ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV10Messages ;
   private IDataStoreProvider pr_default ;
   private int[] P002R2_AV19TotalItens ;
   private int[] P002R3_A1pes_id ;
   private String[] P002R3_A2pes_nome ;
   private String[] P002R3_A24se_matricula ;
   private com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem AV17SDTServidorEfetivoEnderecoFuncionalItemServidor ;
   private int[] P002R4_A1pes_id ;
   private int[] P002R4_A7unid_id ;
   private int[] P002R4_A25lot_id ;
   private java.util.Date[] P002R4_A26lot_data_lotacao ;
   private java.util.Date[] P002R4_A27lot_data_remocao ;
   private String[] P002R4_A8unid_nome ;
   private String[] P002R4_A9unid_sigla ;
   private com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem AV16SDTServidorEfetivoEnderecoFuncionalItemLotacao ;
   private int[] P002R5_A7unid_id ;
   private int[] P002R5_A17end_id ;
   private String[] P002R5_A19end_logradouro ;
   private int[] P002R5_A20end_numero ;
   private String[] P002R5_A21end_bairro ;
   private int[] P002R5_A14cid_id ;
   private String[] P002R5_A15cid_nome ;
   private String[] P002R5_A16cid_uf ;
   private com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem AV15SDTServidorEfetivoEnderecoFuncionalItemEndereco ;
}

final  class pconsultaenderecofuncional__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002R2", "SELECT COUNT(*) FROM (servidor_efetivo T1 INNER JOIN pessoa T2 ON T2.pes_id = T1.pes_id) WHERE UPPER(T2.pes_nome) like '%' || UPPER(?) || '%' ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002R3", "SELECT T1.pes_id, T2.pes_nome, T1.se_matricula FROM (servidor_efetivo T1 INNER JOIN pessoa T2 ON T2.pes_id = T1.pes_id) WHERE UPPER(T2.pes_nome) like '%' || UPPER(?) || '%' ORDER BY T1.pes_id, T1.se_matricula  OFFSET ? LIMIT CASE WHEN ? > 0 THEN ? ELSE 1e9 END",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002R4", "SELECT T1.pes_id, T1.unid_id, T1.lot_id, T1.lot_data_lotacao, T1.lot_data_remocao, T2.unid_nome, T2.unid_sigla FROM (lotacao T1 INNER JOIN unidade T2 ON T2.unid_id = T1.unid_id) WHERE T1.pes_id = ? ORDER BY T1.pes_id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002R5", "SELECT T1.unid_id, T1.end_id, T2.end_logradouro, T2.end_numero, T2.end_bairro, T2.cid_id, T3.cid_nome, T3.cid_uf FROM ((unidade_endereco T1 INNER JOIN endereco T2 ON T2.end_id = T1.end_id) INNER JOIN cidade T3 ON T3.cid_id = T2.cid_id) WHERE T1.unid_id = ? ORDER BY T1.unid_id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 2);
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
               stmt.setVarchar(1, (String)parms[0], 200);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 200);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

