package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinsereatualizaunidade extends GXProcedure
{
   public pinsereatualizaunidade( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinsereatualizaunidade.class ), "" );
   }

   public pinsereatualizaunidade( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int[] aP0 ,
                                                                        String[] aP1 ,
                                                                        String[] aP2 )
   {
      pinsereatualizaunidade.this.aP3 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
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
      pinsereatualizaunidade.this.AV32unid_id = aP0[0];
      this.aP0 = aP0;
      pinsereatualizaunidade.this.AV33unid_nome = aP1[0];
      this.aP1 = aP1;
      pinsereatualizaunidade.this.AV34unid_sigla = aP2[0];
      this.aP2 = aP2;
      pinsereatualizaunidade.this.AV17Messages = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV17Messages.clear();
      if ( (0==AV32unid_id) )
      {
         AV39unidade = (com.projetopratico.Sdtunidade)new com.projetopratico.Sdtunidade( remoteHandle, context);
      }
      else
      {
         GXv_int1[0] = AV32unid_id ;
         GXv_int2[0] = AV31encontrado_unid_id ;
         GXv_char3[0] = AV37unid_nome1 ;
         GXv_char4[0] = AV38unid_sigla1 ;
         new com.projetopratico.pbuscaunidade(remoteHandle, context).execute( GXv_int1, GXv_int2, GXv_char3, GXv_char4) ;
         pinsereatualizaunidade.this.AV32unid_id = GXv_int1[0] ;
         pinsereatualizaunidade.this.AV31encontrado_unid_id = GXv_int2[0] ;
         pinsereatualizaunidade.this.AV37unid_nome1 = GXv_char3[0] ;
         pinsereatualizaunidade.this.AV38unid_sigla1 = GXv_char4[0] ;
         if ( (0==AV31encontrado_unid_id) )
         {
            AV16Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
            AV16Message.setgxTv_SdtMessages_Message_Description( "O id "+GXutil.trim( GXutil.str( AV32unid_id, 8, 0))+" da unidade nao foi encontrado" );
            AV17Messages.add(AV16Message, 0);
            Application.rollbackDataStores(context, remoteHandle, pr_default, "pinsereatualizaunidade");
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         else
         {
            AV39unidade.Load(AV32unid_id);
         }
      }
      AV39unidade.setgxTv_Sdtunidade_Unid_nome( AV33unid_nome );
      AV39unidade.setgxTv_Sdtunidade_Unid_sigla( AV34unid_sigla );
      AV39unidade.Save();
      if ( AV39unidade.Fail() )
      {
         AV17Messages = AV39unidade.GetMessages() ;
         Application.rollbackDataStores(context, remoteHandle, pr_default, "pinsereatualizaunidade");
      }
      AV32unid_id = AV39unidade.getgxTv_Sdtunidade_Unid_id() ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinsereatualizaunidade.this.AV32unid_id;
      this.aP1[0] = pinsereatualizaunidade.this.AV33unid_nome;
      this.aP2[0] = pinsereatualizaunidade.this.AV34unid_sigla;
      this.aP3[0] = pinsereatualizaunidade.this.AV17Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV39unidade = new com.projetopratico.Sdtunidade(remoteHandle);
      GXv_int1 = new int[1] ;
      GXv_int2 = new int[1] ;
      AV37unid_nome1 = "" ;
      GXv_char3 = new String[1] ;
      AV38unid_sigla1 = "" ;
      GXv_char4 = new String[1] ;
      AV16Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pinsereatualizaunidade__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
   }

   private int AV32unid_id ;
   private int GXv_int1[] ;
   private int AV31encontrado_unid_id ;
   private int GXv_int2[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private boolean returnInSub ;
   private String AV33unid_nome ;
   private String AV34unid_sigla ;
   private String AV37unid_nome1 ;
   private String AV38unid_sigla1 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 ;
   private int[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV17Messages ;
   private com.projetopratico.Sdtunidade AV39unidade ;
   private com.genexus.SdtMessages_Message AV16Message ;
   private IDataStoreProvider pr_default ;
}

final  class pinsereatualizaunidade__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

