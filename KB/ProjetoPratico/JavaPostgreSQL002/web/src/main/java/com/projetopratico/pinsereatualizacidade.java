package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinsereatualizacidade extends GXProcedure
{
   public pinsereatualizacidade( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinsereatualizacidade.class ), "" );
   }

   public pinsereatualizacidade( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int[] aP0 ,
                                                                        String[] aP1 ,
                                                                        String[] aP2 )
   {
      pinsereatualizacidade.this.aP3 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( int[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( int[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 )
   {
      pinsereatualizacidade.this.AV14cid_id = aP0[0];
      this.aP0 = aP0;
      pinsereatualizacidade.this.AV26cid_nome = aP1[0];
      this.aP1 = aP1;
      pinsereatualizacidade.this.AV27cid_uf = aP2[0];
      this.aP2 = aP2;
      pinsereatualizacidade.this.AV17Messages = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV17Messages.clear();
      if ( (0==AV14cid_id) )
      {
         AV24cidade = (com.projetopratico.Sdtcidade)new com.projetopratico.Sdtcidade( remoteHandle, context);
      }
      else
      {
         GXv_int1[0] = AV14cid_id ;
         GXv_int2[0] = AV25encontrado_cid_id ;
         GXv_char3[0] = AV28b_cid_nome ;
         GXv_char4[0] = AV29b_cid_uf ;
         new com.projetopratico.pbuscacidade(remoteHandle, context).execute( GXv_int1, GXv_int2, GXv_char3, GXv_char4) ;
         pinsereatualizacidade.this.AV14cid_id = GXv_int1[0] ;
         pinsereatualizacidade.this.AV25encontrado_cid_id = GXv_int2[0] ;
         pinsereatualizacidade.this.AV28b_cid_nome = GXv_char3[0] ;
         pinsereatualizacidade.this.AV29b_cid_uf = GXv_char4[0] ;
         if ( (0==AV25encontrado_cid_id) )
         {
            AV16Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
            AV16Message.setgxTv_SdtMessages_Message_Description( "O id "+GXutil.trim( GXutil.str( AV14cid_id, 8, 0))+" da cidade nao foi encontrado" );
            AV17Messages.add(AV16Message, 0);
            Application.rollbackDataStores(context, remoteHandle, pr_default, "pinsereatualizacidade");
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         else
         {
            AV24cidade.Load(AV14cid_id);
         }
      }
      AV24cidade.setgxTv_Sdtcidade_Cid_nome( AV26cid_nome );
      AV24cidade.setgxTv_Sdtcidade_Cid_uf( AV27cid_uf );
      AV24cidade.Save();
      if ( AV24cidade.Fail() )
      {
         AV17Messages = AV24cidade.GetMessages() ;
         Application.rollbackDataStores(context, remoteHandle, pr_default, "pinsereatualizacidade");
      }
      AV14cid_id = AV24cidade.getgxTv_Sdtcidade_Cid_id() ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinsereatualizacidade.this.AV14cid_id;
      this.aP1[0] = pinsereatualizacidade.this.AV26cid_nome;
      this.aP2[0] = pinsereatualizacidade.this.AV27cid_uf;
      this.aP3[0] = pinsereatualizacidade.this.AV17Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24cidade = new com.projetopratico.Sdtcidade(remoteHandle);
      GXv_int1 = new int[1] ;
      GXv_int2 = new int[1] ;
      AV28b_cid_nome = "" ;
      GXv_char3 = new String[1] ;
      AV29b_cid_uf = "" ;
      GXv_char4 = new String[1] ;
      AV16Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pinsereatualizacidade__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
   }

   private int AV14cid_id ;
   private int GXv_int1[] ;
   private int AV25encontrado_cid_id ;
   private int GXv_int2[] ;
   private String AV27cid_uf ;
   private String GXv_char3[] ;
   private String AV29b_cid_uf ;
   private String GXv_char4[] ;
   private boolean returnInSub ;
   private String AV26cid_nome ;
   private String AV28b_cid_nome ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 ;
   private int[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV17Messages ;
   private com.projetopratico.Sdtcidade AV24cidade ;
   private com.genexus.SdtMessages_Message AV16Message ;
   private IDataStoreProvider pr_default ;
}

final  class pinsereatualizacidade__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

