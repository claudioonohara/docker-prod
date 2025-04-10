package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class punidadeget extends GXProcedure
{
   public punidadeget( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( punidadeget.class ), "" );
   }

   public punidadeget( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int aP0 ,
                                                                        com.projetopratico.SdtSDTUnidade[] aP1 )
   {
      punidadeget.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( int aP0 ,
                        com.projetopratico.SdtSDTUnidade[] aP1 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( int aP0 ,
                             com.projetopratico.SdtSDTUnidade[] aP1 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      punidadeget.this.AV12unid_id = aP0;
      punidadeget.this.aP1 = aP1;
      punidadeget.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV14GXLvl1 = (byte)(0) ;
      /* Using cursor P000K2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV12unid_id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7unid_id = P000K2_A7unid_id[0] ;
         A8unid_nome = P000K2_A8unid_nome[0] ;
         A9unid_sigla = P000K2_A9unid_sigla[0] ;
         AV14GXLvl1 = (byte)(1) ;
         AV13SDTUnidade.setgxTv_SdtSDTUnidade_Unid_id( A7unid_id );
         AV13SDTUnidade.setgxTv_SdtSDTUnidade_Unid_nome( A8unid_nome );
         AV13SDTUnidade.setgxTv_SdtSDTUnidade_Unid_sigla( A9unid_sigla );
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV14GXLvl1 == 0 )
      {
         AV9Message.setgxTv_SdtMessages_Message_Description( "Unidade com id "+GXutil.trim( GXutil.str( AV12unid_id, 8, 0))+" nao encontrada" );
         AV9Message.setgxTv_SdtMessages_Message_Type( (byte)(0) );
         AV10Messages.add(AV9Message, 0);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = punidadeget.this.AV13SDTUnidade;
      this.aP2[0] = punidadeget.this.AV10Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13SDTUnidade = new com.projetopratico.SdtSDTUnidade(remoteHandle, context);
      AV10Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      P000K2_A7unid_id = new int[1] ;
      P000K2_A8unid_nome = new String[] {""} ;
      P000K2_A9unid_sigla = new String[] {""} ;
      A8unid_nome = "" ;
      A9unid_sigla = "" ;
      AV9Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.punidadeget__default(),
         new Object[] {
             new Object[] {
            P000K2_A7unid_id, P000K2_A8unid_nome, P000K2_A9unid_sigla
            }
         }
      );
      /* GeneXus formulas. */
   }

   private byte AV14GXLvl1 ;
   private int AV12unid_id ;
   private int A7unid_id ;
   private String A8unid_nome ;
   private String A9unid_sigla ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ;
   private com.projetopratico.SdtSDTUnidade[] aP1 ;
   private com.projetopratico.SdtSDTUnidade AV13SDTUnidade ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV10Messages ;
   private IDataStoreProvider pr_default ;
   private int[] P000K2_A7unid_id ;
   private String[] P000K2_A8unid_nome ;
   private String[] P000K2_A9unid_sigla ;
   private com.genexus.SdtMessages_Message AV9Message ;
}

final  class punidadeget__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000K2", "SELECT unid_id, unid_nome, unid_sigla FROM unidade WHERE unid_id = ? ORDER BY unid_id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

