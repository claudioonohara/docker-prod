package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinsereatualizaendereco extends GXProcedure
{
   public pinsereatualizaendereco( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinsereatualizaendereco.class ), "" );
   }

   public pinsereatualizaendereco( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int[] aP0 ,
                                                                        String[] aP1 ,
                                                                        String[] aP2 ,
                                                                        int[] aP3 ,
                                                                        String[] aP4 ,
                                                                        int[] aP5 )
   {
      pinsereatualizaendereco.this.aP6 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( int[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( int[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP6 )
   {
      pinsereatualizaendereco.this.AV8end_id = aP0[0];
      this.aP0 = aP0;
      pinsereatualizaendereco.this.AV10end_tipo_logradouro = aP1[0];
      this.aP1 = aP1;
      pinsereatualizaendereco.this.AV11end_logradouro = aP2[0];
      this.aP2 = aP2;
      pinsereatualizaendereco.this.AV12end_numero = aP3[0];
      this.aP3 = aP3;
      pinsereatualizaendereco.this.AV13end_bairro = aP4[0];
      this.aP4 = aP4;
      pinsereatualizaendereco.this.AV14cid_id = aP5[0];
      this.aP5 = aP5;
      pinsereatualizaendereco.this.AV17Messages = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV17Messages.clear();
      if ( (0==AV8end_id) )
      {
         AV9endereco = (com.projetopratico.Sdtendereco)new com.projetopratico.Sdtendereco( remoteHandle, context);
      }
      else
      {
         GXv_int1[0] = AV8end_id ;
         GXv_int2[0] = (short)(AV15encontrado_end_id) ;
         GXv_char3[0] = AV22b_end_tipo_logradouro ;
         GXv_char4[0] = AV21b_end_logradouro ;
         GXv_int5[0] = AV20b_end_numero ;
         GXv_char6[0] = AV19b_end_bairro ;
         GXv_int7[0] = AV18b_cid_id ;
         new com.projetopratico.pbuscaendereco(remoteHandle, context).execute( GXv_int1, GXv_int2, GXv_char3, GXv_char4, GXv_int5, GXv_char6, GXv_int7) ;
         pinsereatualizaendereco.this.AV8end_id = GXv_int1[0] ;
         pinsereatualizaendereco.this.AV15encontrado_end_id = GXv_int2[0] ;
         pinsereatualizaendereco.this.AV22b_end_tipo_logradouro = GXv_char3[0] ;
         pinsereatualizaendereco.this.AV21b_end_logradouro = GXv_char4[0] ;
         pinsereatualizaendereco.this.AV20b_end_numero = GXv_int5[0] ;
         pinsereatualizaendereco.this.AV19b_end_bairro = GXv_char6[0] ;
         pinsereatualizaendereco.this.AV18b_cid_id = GXv_int7[0] ;
         if ( (0==AV15encontrado_end_id) )
         {
            AV16Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
            AV16Message.setgxTv_SdtMessages_Message_Description( "O id "+GXutil.trim( GXutil.str( AV8end_id, 8, 0))+" do endereco nao foi encontrado" );
            AV17Messages.add(AV16Message, 0);
            Application.rollbackDataStores(context, remoteHandle, pr_default, "pinsereatualizaendereco");
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         else
         {
            AV9endereco.Load(AV8end_id);
         }
      }
      AV9endereco.setgxTv_Sdtendereco_End_tipo_logradouro( AV10end_tipo_logradouro );
      AV9endereco.setgxTv_Sdtendereco_End_logradouro( AV11end_logradouro );
      AV9endereco.setgxTv_Sdtendereco_End_numero( AV12end_numero );
      AV9endereco.setgxTv_Sdtendereco_End_bairro( AV13end_bairro );
      AV9endereco.setgxTv_Sdtendereco_Cid_id( AV14cid_id );
      AV9endereco.Save();
      if ( AV9endereco.Fail() )
      {
         AV17Messages = AV9endereco.GetMessages() ;
         Application.rollbackDataStores(context, remoteHandle, pr_default, "pinsereatualizaendereco");
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV8end_id = AV9endereco.getgxTv_Sdtendereco_End_id() ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinsereatualizaendereco.this.AV8end_id;
      this.aP1[0] = pinsereatualizaendereco.this.AV10end_tipo_logradouro;
      this.aP2[0] = pinsereatualizaendereco.this.AV11end_logradouro;
      this.aP3[0] = pinsereatualizaendereco.this.AV12end_numero;
      this.aP4[0] = pinsereatualizaendereco.this.AV13end_bairro;
      this.aP5[0] = pinsereatualizaendereco.this.AV14cid_id;
      this.aP6[0] = pinsereatualizaendereco.this.AV17Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9endereco = new com.projetopratico.Sdtendereco(remoteHandle);
      GXv_int1 = new int[1] ;
      GXv_int2 = new short[1] ;
      AV22b_end_tipo_logradouro = "" ;
      GXv_char3 = new String[1] ;
      AV21b_end_logradouro = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      AV19b_end_bairro = "" ;
      GXv_char6 = new String[1] ;
      GXv_int7 = new int[1] ;
      AV16Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pinsereatualizaendereco__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
   }

   private short GXv_int2[] ;
   private int AV8end_id ;
   private int AV12end_numero ;
   private int AV14cid_id ;
   private int GXv_int1[] ;
   private int AV15encontrado_end_id ;
   private int AV20b_end_numero ;
   private int GXv_int5[] ;
   private int AV18b_cid_id ;
   private int GXv_int7[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String GXv_char6[] ;
   private boolean returnInSub ;
   private String AV10end_tipo_logradouro ;
   private String AV11end_logradouro ;
   private String AV13end_bairro ;
   private String AV22b_end_tipo_logradouro ;
   private String AV21b_end_logradouro ;
   private String AV19b_end_bairro ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP6 ;
   private int[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV17Messages ;
   private com.projetopratico.Sdtendereco AV9endereco ;
   private com.genexus.SdtMessages_Message AV16Message ;
   private IDataStoreProvider pr_default ;
}

final  class pinsereatualizaendereco__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

