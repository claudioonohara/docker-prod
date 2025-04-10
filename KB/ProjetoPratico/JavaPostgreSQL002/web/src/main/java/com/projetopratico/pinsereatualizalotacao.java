package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinsereatualizalotacao extends GXProcedure
{
   public pinsereatualizalotacao( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinsereatualizalotacao.class ), "" );
   }

   public pinsereatualizalotacao( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int[] aP0 ,
                                                                        int[] aP1 ,
                                                                        int[] aP2 ,
                                                                        java.util.Date[] aP3 ,
                                                                        java.util.Date[] aP4 ,
                                                                        String[] aP5 )
   {
      pinsereatualizalotacao.this.aP6 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( int[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        java.util.Date[] aP3 ,
                        java.util.Date[] aP4 ,
                        String[] aP5 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( int[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.util.Date[] aP4 ,
                             String[] aP5 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP6 )
   {
      pinsereatualizalotacao.this.AV30lot_id = aP0[0];
      this.aP0 = aP0;
      pinsereatualizalotacao.this.AV41pes_id = aP1[0];
      this.aP1 = aP1;
      pinsereatualizalotacao.this.AV42unid_id = aP2[0];
      this.aP2 = aP2;
      pinsereatualizalotacao.this.AV37lot_data_lotacao = aP3[0];
      this.aP3 = aP3;
      pinsereatualizalotacao.this.AV38lot_data_remocao = aP4[0];
      this.aP4 = aP4;
      pinsereatualizalotacao.this.AV40lot_portaria = aP5[0];
      this.aP5 = aP5;
      pinsereatualizalotacao.this.AV17Messages = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV17Messages.clear();
      if ( (0==AV30lot_id) )
      {
         AV31lotacao = (com.projetopratico.Sdtlotacao)new com.projetopratico.Sdtlotacao( remoteHandle, context);
      }
      else
      {
         GXv_int1[0] = AV30lot_id ;
         GXv_int2[0] = AV36encontrado_lot_id ;
         GXv_int3[0] = AV52pes_id1 ;
         GXv_int4[0] = AV53unid_id1 ;
         GXv_date5[0] = AV48lot_data_lotacao1 ;
         GXv_date6[0] = AV49lot_data_remocao1 ;
         GXv_char7[0] = AV51lot_portaria1 ;
         new com.projetopratico.pbuscalotacao(remoteHandle, context).execute( GXv_int1, GXv_int2, GXv_int3, GXv_int4, GXv_date5, GXv_date6, GXv_char7) ;
         pinsereatualizalotacao.this.AV30lot_id = GXv_int1[0] ;
         pinsereatualizalotacao.this.AV36encontrado_lot_id = GXv_int2[0] ;
         pinsereatualizalotacao.this.AV52pes_id1 = GXv_int3[0] ;
         pinsereatualizalotacao.this.AV53unid_id1 = GXv_int4[0] ;
         pinsereatualizalotacao.this.AV48lot_data_lotacao1 = GXv_date5[0] ;
         pinsereatualizalotacao.this.AV49lot_data_remocao1 = GXv_date6[0] ;
         pinsereatualizalotacao.this.AV51lot_portaria1 = GXv_char7[0] ;
         if ( (0==AV36encontrado_lot_id) )
         {
            AV16Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
            AV16Message.setgxTv_SdtMessages_Message_Description( "O id "+GXutil.trim( GXutil.str( AV30lot_id, 8, 0))+" da lotacao nao foi encontrado" );
            AV17Messages.add(AV16Message, 0);
            Application.rollbackDataStores(context, remoteHandle, pr_default, "pinsereatualizalotacao");
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         else
         {
            AV31lotacao.Load(AV30lot_id);
         }
      }
      AV31lotacao.setgxTv_Sdtlotacao_Pes_id( AV41pes_id );
      AV31lotacao.setgxTv_Sdtlotacao_Unid_id( AV42unid_id );
      AV31lotacao.setgxTv_Sdtlotacao_Lot_data_lotacao( AV37lot_data_lotacao );
      AV31lotacao.setgxTv_Sdtlotacao_Lot_data_remocao( AV38lot_data_remocao );
      AV31lotacao.setgxTv_Sdtlotacao_Lot_portaria( AV40lot_portaria );
      AV31lotacao.Save();
      if ( AV31lotacao.Fail() )
      {
         AV17Messages = AV31lotacao.GetMessages() ;
         Application.rollbackDataStores(context, remoteHandle, pr_default, "pinsereatualizalotacao");
      }
      AV30lot_id = AV31lotacao.getgxTv_Sdtlotacao_Lot_id() ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinsereatualizalotacao.this.AV30lot_id;
      this.aP1[0] = pinsereatualizalotacao.this.AV41pes_id;
      this.aP2[0] = pinsereatualizalotacao.this.AV42unid_id;
      this.aP3[0] = pinsereatualizalotacao.this.AV37lot_data_lotacao;
      this.aP4[0] = pinsereatualizalotacao.this.AV38lot_data_remocao;
      this.aP5[0] = pinsereatualizalotacao.this.AV40lot_portaria;
      this.aP6[0] = pinsereatualizalotacao.this.AV17Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV31lotacao = new com.projetopratico.Sdtlotacao(remoteHandle);
      GXv_int1 = new int[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new int[1] ;
      GXv_int4 = new int[1] ;
      AV48lot_data_lotacao1 = GXutil.nullDate() ;
      GXv_date5 = new java.util.Date[1] ;
      AV49lot_data_remocao1 = GXutil.nullDate() ;
      GXv_date6 = new java.util.Date[1] ;
      AV51lot_portaria1 = "" ;
      GXv_char7 = new String[1] ;
      AV16Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pinsereatualizalotacao__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
   }

   private int AV30lot_id ;
   private int AV41pes_id ;
   private int AV42unid_id ;
   private int GXv_int1[] ;
   private int AV36encontrado_lot_id ;
   private int GXv_int2[] ;
   private int AV52pes_id1 ;
   private int GXv_int3[] ;
   private int AV53unid_id1 ;
   private int GXv_int4[] ;
   private String GXv_char7[] ;
   private java.util.Date AV37lot_data_lotacao ;
   private java.util.Date AV38lot_data_remocao ;
   private java.util.Date AV48lot_data_lotacao1 ;
   private java.util.Date GXv_date5[] ;
   private java.util.Date AV49lot_data_remocao1 ;
   private java.util.Date GXv_date6[] ;
   private boolean returnInSub ;
   private String AV40lot_portaria ;
   private String AV51lot_portaria1 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP6 ;
   private int[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private java.util.Date[] aP3 ;
   private java.util.Date[] aP4 ;
   private String[] aP5 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV17Messages ;
   private com.projetopratico.Sdtlotacao AV31lotacao ;
   private com.genexus.SdtMessages_Message AV16Message ;
   private IDataStoreProvider pr_default ;
}

final  class pinsereatualizalotacao__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

