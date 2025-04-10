package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pefetivosunidade extends GXProcedure
{
   public pefetivosunidade( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pefetivosunidade.class ), "" );
   }

   public pefetivosunidade( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int aP0 ,
                                                                        int aP1 ,
                                                                        int aP2 ,
                                                                        com.projetopratico.SdtSDTEfetivosUnidade[] aP3 )
   {
      pefetivosunidade.this.aP4 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( int aP0 ,
                        int aP1 ,
                        int aP2 ,
                        com.projetopratico.SdtSDTEfetivosUnidade[] aP3 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( int aP0 ,
                             int aP1 ,
                             int aP2 ,
                             com.projetopratico.SdtSDTEfetivosUnidade[] aP3 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 )
   {
      pefetivosunidade.this.AV28unidid = aP0;
      pefetivosunidade.this.AV29PaginaAtual = aP1;
      pefetivosunidade.this.AV30nroPorPagina = aP2;
      pefetivosunidade.this.aP3 = aP3;
      pefetivosunidade.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV10TotalItens = 0 ;
      /* Using cursor P00152 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1pes_id = P00152_A1pes_id[0] ;
         A24se_matricula = P00152_A24se_matricula[0] ;
         /* Optimized group. */
         /* Using cursor P00153 */
         pr_default.execute(1, new Object[] {Integer.valueOf(AV28unidid), Integer.valueOf(A1pes_id)});
         cV10TotalItens = P00153_AV10TotalItens[0] ;
         pr_default.close(1);
         AV10TotalItens = (int)(AV10TotalItens+cV10TotalItens*1) ;
         /* End optimized group. */
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV29PaginaAtual <= 0 )
      {
         AV11Pagina = 1 ;
      }
      else
      {
         AV11Pagina = AV29PaginaAtual ;
      }
      if ( AV30nroPorPagina <= 0 )
      {
         AV12ItensPorPagina = 10 ;
      }
      else
      {
         AV12ItensPorPagina = AV30nroPorPagina ;
      }
      AV24NumeroPaginas = DecimalUtil.doubleToDec(AV10TotalItens).divide(DecimalUtil.doubleToDec(AV12ItensPorPagina), java.math.MathContext.DECIMAL128) ;
      AV16TotalPaginas = (int)(GXutil.Int( DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV10TotalItens).divide(DecimalUtil.doubleToDec(AV12ItensPorPagina), java.math.MathContext.DECIMAL128)))) ;
      if ( AV24NumeroPaginas.doubleValue() > AV16TotalPaginas )
      {
         AV16TotalPaginas = (int)(AV16TotalPaginas+1) ;
      }
      AV14Skip = (short)((AV11Pagina-1)*AV12ItensPorPagina) ;
      AV20SDTEfetivosUnidade = (com.projetopratico.SdtSDTEfetivosUnidade)new com.projetopratico.SdtSDTEfetivosUnidade(remoteHandle, context);
      AV20SDTEfetivosUnidade.setgxTv_SdtSDTEfetivosUnidade_Paginaatual( AV11Pagina );
      AV20SDTEfetivosUnidade.setgxTv_SdtSDTEfetivosUnidade_Nroporpagina( AV12ItensPorPagina );
      AV20SDTEfetivosUnidade.setgxTv_SdtSDTEfetivosUnidade_Totalitens( AV10TotalItens );
      AV20SDTEfetivosUnidade.setgxTv_SdtSDTEfetivosUnidade_Totalpaginas( AV16TotalPaginas );
      /* Using cursor P00154 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A1pes_id = P00154_A1pes_id[0] ;
         A2pes_nome = P00154_A2pes_nome[0] ;
         A3pes_data_nascimento = P00154_A3pes_data_nascimento[0] ;
         A24se_matricula = P00154_A24se_matricula[0] ;
         A2pes_nome = P00154_A2pes_nome[0] ;
         A3pes_data_nascimento = P00154_A3pes_data_nascimento[0] ;
         GXt_dtime1 = GXutil.resetTime( A3pes_data_nascimento );
         A30pes_idade = (short)(GXutil.age( GXt_dtime1, GXutil.now( ))) ;
         GXPagingFrom5 = AV14Skip ;
         GXPagingTo5 = AV12ItensPorPagina ;
         /* Using cursor P00155 */
         pr_default.execute(3, new Object[] {Integer.valueOf(A1pes_id), Integer.valueOf(AV28unidid), Integer.valueOf(GXPagingFrom5), Integer.valueOf(GXPagingTo5), Integer.valueOf(GXPagingTo5)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A7unid_id = P00155_A7unid_id[0] ;
            A8unid_nome = P00155_A8unid_nome[0] ;
            A25lot_id = P00155_A25lot_id[0] ;
            A8unid_nome = P00155_A8unid_nome[0] ;
            AV22SDTEfetivosUnidadeItem = (com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem)new com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem(remoteHandle, context);
            AV22SDTEfetivosUnidadeItem.setgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Nome( A2pes_nome );
            AV22SDTEfetivosUnidadeItem.setgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Idade( A30pes_idade );
            AV22SDTEfetivosUnidadeItem.setgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Unidadedelotacao( A8unid_nome );
            AV21pes_id = A1pes_id ;
            /* Execute user subroutine: 'BUSCAPESSOAFOTOGRAFIA' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(3);
               pr_default.close(3);
               pr_default.close(3);
               pr_default.close(2);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV20SDTEfetivosUnidade.getgxTv_SdtSDTEfetivosUnidade_Efetivosunidade().add(AV22SDTEfetivosUnidadeItem, 0);
            pr_default.readNext(3);
         }
         pr_default.close(3);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      cleanup();
   }

   public void S111( )
   {
      /* 'BUSCAPESSOAFOTOGRAFIA' Routine */
      returnInSub = false ;
      /* Using cursor P00156 */
      pr_default.execute(4, new Object[] {Integer.valueOf(AV21pes_id)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A1pes_id = P00156_A1pes_id[0] ;
         A40000fp_foto_GXI = P00156_A40000fp_foto_GXI[0] ;
         A10fp_id = P00156_A10fp_id[0] ;
         AV23SDTEfetivosUnidadeItemFoto = (com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem)new com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem(remoteHandle, context);
         GXt_char2 = "" ;
         GXv_char3[0] = GXt_char2 ;
         new com.projetopratico.pgetlinktemporario(remoteHandle, context).execute( A40000fp_foto_GXI, GXv_char3) ;
         pefetivosunidade.this.GXt_char2 = GXv_char3[0] ;
         AV23SDTEfetivosUnidadeItemFoto.setgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem_Fotografia( GXt_char2 );
         AV22SDTEfetivosUnidadeItem.getgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias().add(AV23SDTEfetivosUnidadeItemFoto, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = pefetivosunidade.this.AV20SDTEfetivosUnidade;
      this.aP4[0] = pefetivosunidade.this.AV15Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20SDTEfetivosUnidade = new com.projetopratico.SdtSDTEfetivosUnidade(remoteHandle, context);
      AV15Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      P00152_A1pes_id = new int[1] ;
      P00152_A24se_matricula = new String[] {""} ;
      A24se_matricula = "" ;
      P00153_AV10TotalItens = new int[1] ;
      AV24NumeroPaginas = DecimalUtil.ZERO ;
      P00154_A1pes_id = new int[1] ;
      P00154_A2pes_nome = new String[] {""} ;
      P00154_A3pes_data_nascimento = new java.util.Date[] {GXutil.nullDate()} ;
      P00154_A24se_matricula = new String[] {""} ;
      A2pes_nome = "" ;
      A3pes_data_nascimento = GXutil.nullDate() ;
      GXt_dtime1 = GXutil.resetTime( GXutil.nullDate() );
      P00155_A1pes_id = new int[1] ;
      P00155_A7unid_id = new int[1] ;
      P00155_A8unid_nome = new String[] {""} ;
      P00155_A2pes_nome = new String[] {""} ;
      P00155_A25lot_id = new int[1] ;
      A8unid_nome = "" ;
      AV22SDTEfetivosUnidadeItem = new com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem(remoteHandle, context);
      P00156_A1pes_id = new int[1] ;
      P00156_A40000fp_foto_GXI = new String[] {""} ;
      P00156_A10fp_id = new int[1] ;
      A40000fp_foto_GXI = "" ;
      AV23SDTEfetivosUnidadeItemFoto = new com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem(remoteHandle, context);
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pefetivosunidade__default(),
         new Object[] {
             new Object[] {
            P00152_A1pes_id, P00152_A24se_matricula
            }
            , new Object[] {
            P00153_AV10TotalItens
            }
            , new Object[] {
            P00154_A1pes_id, P00154_A2pes_nome, P00154_A3pes_data_nascimento, P00154_A24se_matricula
            }
            , new Object[] {
            P00155_A1pes_id, P00155_A7unid_id, P00155_A8unid_nome, P00155_A2pes_nome, P00155_A25lot_id
            }
            , new Object[] {
            P00156_A1pes_id, P00156_A40000fp_foto_GXI, P00156_A10fp_id
            }
         }
      );
      /* GeneXus formulas. */
   }

   private short AV14Skip ;
   private short A30pes_idade ;
   private int AV28unidid ;
   private int AV29PaginaAtual ;
   private int AV30nroPorPagina ;
   private int AV10TotalItens ;
   private int A1pes_id ;
   private int cV10TotalItens ;
   private int AV11Pagina ;
   private int AV12ItensPorPagina ;
   private int AV16TotalPaginas ;
   private int GXPagingFrom5 ;
   private int GXPagingTo5 ;
   private int A7unid_id ;
   private int A25lot_id ;
   private int AV21pes_id ;
   private int A10fp_id ;
   private java.math.BigDecimal AV24NumeroPaginas ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date GXt_dtime1 ;
   private java.util.Date A3pes_data_nascimento ;
   private boolean returnInSub ;
   private String A24se_matricula ;
   private String A2pes_nome ;
   private String A8unid_nome ;
   private String A40000fp_foto_GXI ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 ;
   private com.projetopratico.SdtSDTEfetivosUnidade[] aP3 ;
   private com.projetopratico.SdtSDTEfetivosUnidade AV20SDTEfetivosUnidade ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV15Messages ;
   private IDataStoreProvider pr_default ;
   private int[] P00152_A1pes_id ;
   private String[] P00152_A24se_matricula ;
   private int[] P00153_AV10TotalItens ;
   private int[] P00154_A1pes_id ;
   private String[] P00154_A2pes_nome ;
   private java.util.Date[] P00154_A3pes_data_nascimento ;
   private String[] P00154_A24se_matricula ;
   private int[] P00155_A1pes_id ;
   private int[] P00155_A7unid_id ;
   private String[] P00155_A8unid_nome ;
   private String[] P00155_A2pes_nome ;
   private int[] P00155_A25lot_id ;
   private com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem AV22SDTEfetivosUnidadeItem ;
   private int[] P00156_A1pes_id ;
   private String[] P00156_A40000fp_foto_GXI ;
   private int[] P00156_A10fp_id ;
   private com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem AV23SDTEfetivosUnidadeItemFoto ;
}

final  class pefetivosunidade__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00152", "SELECT pes_id, se_matricula FROM servidor_efetivo ORDER BY pes_id, se_matricula ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00153", "SELECT COUNT(*) FROM lotacao WHERE (unid_id = ?) AND (pes_id = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00154", "SELECT T1.pes_id, T2.pes_nome, T2.pes_data_nascimento, T1.se_matricula FROM (servidor_efetivo T1 INNER JOIN pessoa T2 ON T2.pes_id = T1.pes_id) ORDER BY T1.pes_id, T1.se_matricula ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00155", "SELECT T1.pes_id, T1.unid_id, T3.unid_nome, T2.pes_nome, T1.lot_id FROM ((lotacao T1 INNER JOIN pessoa T2 ON T2.pes_id = T1.pes_id) INNER JOIN unidade T3 ON T3.unid_id = T1.unid_id) WHERE (T1.pes_id = ?) AND (T1.unid_id = ?) ORDER BY T2.pes_nome, T1.lot_id  OFFSET ? LIMIT CASE WHEN ? > 0 THEN ? ELSE 1e9 END",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00156", "SELECT pes_id, fp_foto_GXI, fp_id FROM foto_pessoa WHERE pes_id = ? ORDER BY pes_id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getMultimediaUri(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 4 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

