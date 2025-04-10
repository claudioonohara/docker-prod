package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcrunidadeput extends GXProcedure
{
   public pcrunidadeput( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcrunidadeput.class ), "" );
   }

   public pcrunidadeput( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int aP0 ,
                                                                        com.projetopratico.SdtSDTCRUnidade aP1 ,
                                                                        com.projetopratico.SdtSDTCRUnidade[] aP2 )
   {
      pcrunidadeput.this.aP3 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( int aP0 ,
                        com.projetopratico.SdtSDTCRUnidade aP1 ,
                        com.projetopratico.SdtSDTCRUnidade[] aP2 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( int aP0 ,
                             com.projetopratico.SdtSDTCRUnidade aP1 ,
                             com.projetopratico.SdtSDTCRUnidade[] aP2 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 )
   {
      pcrunidadeput.this.AV29unid_id = aP0;
      pcrunidadeput.this.AV8SDTCRUnidade = aP1;
      pcrunidadeput.this.aP2 = aP2;
      pcrunidadeput.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      GXv_int1[0] = AV29unid_id ;
      GXv_char2[0] = AV8SDTCRUnidade.getgxTv_SdtSDTCRUnidade_Unid_nome() ;
      GXv_char3[0] = AV8SDTCRUnidade.getgxTv_SdtSDTCRUnidade_Unid_sigla() ;
      GXv_objcol_SdtMessages_Message4[0] = AV9Messages ;
      new com.projetopratico.pinsereatualizaunidade(remoteHandle, context).execute( GXv_int1, GXv_char2, GXv_char3, GXv_objcol_SdtMessages_Message4) ;
      pcrunidadeput.this.AV29unid_id = GXv_int1[0] ;
      AV8SDTCRUnidade.setgxTv_SdtSDTCRUnidade_Unid_nome( GXv_char2[0] );
      AV8SDTCRUnidade.setgxTv_SdtSDTCRUnidade_Unid_sigla( GXv_char3[0] );
      AV9Messages = GXv_objcol_SdtMessages_Message4[0] ;
      /* Execute user subroutine: 'TERMINACOMERRO' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'DESVINCULAENDERECO' */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV34GXV1 = 1 ;
      while ( AV34GXV1 <= AV8SDTCRUnidade.getgxTv_SdtSDTCRUnidade_Endereco().size() )
      {
         AV13SDTCRUnidadeItem = (com.projetopratico.SdtSDTCRUnidade_enderecoItem)((com.projetopratico.SdtSDTCRUnidade_enderecoItem)AV8SDTCRUnidade.getgxTv_SdtSDTCRUnidade_Endereco().elementAt(-1+AV34GXV1));
         AV20cid_id = AV13SDTCRUnidadeItem.getgxTv_SdtSDTCRUnidade_enderecoItem_Cid_id() ;
         GXv_int1[0] = AV20cid_id ;
         GXv_char3[0] = AV13SDTCRUnidadeItem.getgxTv_SdtSDTCRUnidade_enderecoItem_Cid_nome() ;
         GXv_char2[0] = AV13SDTCRUnidadeItem.getgxTv_SdtSDTCRUnidade_enderecoItem_Cid_uf() ;
         GXv_objcol_SdtMessages_Message4[0] = AV9Messages ;
         new com.projetopratico.pinsereatualizacidade(remoteHandle, context).execute( GXv_int1, GXv_char3, GXv_char2, GXv_objcol_SdtMessages_Message4) ;
         pcrunidadeput.this.AV20cid_id = GXv_int1[0] ;
         AV13SDTCRUnidadeItem.setgxTv_SdtSDTCRUnidade_enderecoItem_Cid_nome( GXv_char3[0] );
         AV13SDTCRUnidadeItem.setgxTv_SdtSDTCRUnidade_enderecoItem_Cid_uf( GXv_char2[0] );
         AV9Messages = GXv_objcol_SdtMessages_Message4[0] ;
         /* Execute user subroutine: 'TERMINACOMERRO' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV14end_id = AV13SDTCRUnidadeItem.getgxTv_SdtSDTCRUnidade_enderecoItem_End_id() ;
         GXv_int1[0] = AV14end_id ;
         GXv_char3[0] = AV13SDTCRUnidadeItem.getgxTv_SdtSDTCRUnidade_enderecoItem_End_tipo_logradouro() ;
         GXv_char2[0] = AV13SDTCRUnidadeItem.getgxTv_SdtSDTCRUnidade_enderecoItem_End_logradouro() ;
         GXv_int5[0] = AV13SDTCRUnidadeItem.getgxTv_SdtSDTCRUnidade_enderecoItem_End_numero() ;
         GXv_char6[0] = AV13SDTCRUnidadeItem.getgxTv_SdtSDTCRUnidade_enderecoItem_End_bairro() ;
         GXv_int7[0] = AV20cid_id ;
         GXv_objcol_SdtMessages_Message4[0] = AV9Messages ;
         new com.projetopratico.pinsereatualizaendereco(remoteHandle, context).execute( GXv_int1, GXv_char3, GXv_char2, GXv_int5, GXv_char6, GXv_int7, GXv_objcol_SdtMessages_Message4) ;
         pcrunidadeput.this.AV14end_id = GXv_int1[0] ;
         AV13SDTCRUnidadeItem.setgxTv_SdtSDTCRUnidade_enderecoItem_End_tipo_logradouro( GXv_char3[0] );
         AV13SDTCRUnidadeItem.setgxTv_SdtSDTCRUnidade_enderecoItem_End_logradouro( GXv_char2[0] );
         AV13SDTCRUnidadeItem.setgxTv_SdtSDTCRUnidade_enderecoItem_End_numero( GXv_int5[0] );
         AV13SDTCRUnidadeItem.setgxTv_SdtSDTCRUnidade_enderecoItem_End_bairro( GXv_char6[0] );
         pcrunidadeput.this.AV20cid_id = GXv_int7[0] ;
         AV9Messages = GXv_objcol_SdtMessages_Message4[0] ;
         /* Execute user subroutine: 'TERMINACOMERRO' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         GXv_int7[0] = AV14end_id ;
         GXv_int5[0] = AV29unid_id ;
         GXv_objcol_SdtMessages_Message4[0] = AV9Messages ;
         new com.projetopratico.pvinculaunidadeendereco(remoteHandle, context).execute( GXv_int7, GXv_int5, GXv_objcol_SdtMessages_Message4) ;
         pcrunidadeput.this.AV14end_id = GXv_int7[0] ;
         pcrunidadeput.this.AV29unid_id = GXv_int5[0] ;
         AV9Messages = GXv_objcol_SdtMessages_Message4[0] ;
         /* Execute user subroutine: 'TERMINACOMERRO' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV34GXV1 = (int)(AV34GXV1+1) ;
      }
      Application.commitDataStores(context, remoteHandle, pr_default, "pcrunidadeput");
      GXv_SdtSDTCRUnidade8[0] = AV11RetornoSDTCRUnidade;
      GXv_objcol_SdtMessages_Message4[0] = AV9Messages ;
      new com.projetopratico.pbuscacrunidade(remoteHandle, context).execute( AV29unid_id, GXv_SdtSDTCRUnidade8, GXv_objcol_SdtMessages_Message4) ;
      AV11RetornoSDTCRUnidade = GXv_SdtSDTCRUnidade8[0];
      AV9Messages = GXv_objcol_SdtMessages_Message4[0] ;
      cleanup();
   }

   public void S111( )
   {
      /* 'TERMINACOMERRO' Routine */
      returnInSub = false ;
      if ( AV9Messages.size() > 0 )
      {
         returnInSub = true;
         if (true) return;
      }
   }

   public void S121( )
   {
      /* 'DESVINCULAENDERECO' Routine */
      returnInSub = false ;
      GXv_SdtSDTCRUnidade8[0] = AV30ExclusaoSDTCRUnidade;
      GXv_objcol_SdtMessages_Message4[0] = new GXBaseCollection<com.genexus.SdtMessages_Message>() ;
      new com.projetopratico.pbuscacrunidade(remoteHandle, context).execute( AV29unid_id, GXv_SdtSDTCRUnidade8, GXv_objcol_SdtMessages_Message4) ;
      AV30ExclusaoSDTCRUnidade = GXv_SdtSDTCRUnidade8[0];
      AV35GXV2 = 1 ;
      while ( AV35GXV2 <= AV30ExclusaoSDTCRUnidade.getgxTv_SdtSDTCRUnidade_Endereco().size() )
      {
         AV31ExclusaoSDTCRUnidadeItem = (com.projetopratico.SdtSDTCRUnidade_enderecoItem)((com.projetopratico.SdtSDTCRUnidade_enderecoItem)AV30ExclusaoSDTCRUnidade.getgxTv_SdtSDTCRUnidade_Endereco().elementAt(-1+AV35GXV2));
         AV33DesvincularEndereco = true ;
         AV36GXV3 = 1 ;
         while ( AV36GXV3 <= AV8SDTCRUnidade.getgxTv_SdtSDTCRUnidade_Endereco().size() )
         {
            AV13SDTCRUnidadeItem = (com.projetopratico.SdtSDTCRUnidade_enderecoItem)((com.projetopratico.SdtSDTCRUnidade_enderecoItem)AV8SDTCRUnidade.getgxTv_SdtSDTCRUnidade_Endereco().elementAt(-1+AV36GXV3));
            if ( AV31ExclusaoSDTCRUnidadeItem.getgxTv_SdtSDTCRUnidade_enderecoItem_End_id() == AV13SDTCRUnidadeItem.getgxTv_SdtSDTCRUnidade_enderecoItem_End_id() )
            {
               AV33DesvincularEndereco = false ;
               if (true) break;
            }
            AV36GXV3 = (int)(AV36GXV3+1) ;
         }
         if ( AV33DesvincularEndereco )
         {
            GXv_int7[0] = AV31ExclusaoSDTCRUnidadeItem.getgxTv_SdtSDTCRUnidade_enderecoItem_End_id() ;
            GXv_int5[0] = AV29unid_id ;
            GXv_objcol_SdtMessages_Message4[0] = new GXBaseCollection<com.genexus.SdtMessages_Message>() ;
            new com.projetopratico.pdesvinculaunidadeendereco(remoteHandle, context).execute( GXv_int7, GXv_int5, GXv_objcol_SdtMessages_Message4) ;
            AV31ExclusaoSDTCRUnidadeItem.setgxTv_SdtSDTCRUnidade_enderecoItem_End_id( GXv_int7[0] );
            pcrunidadeput.this.AV29unid_id = GXv_int5[0] ;
            /* Execute user subroutine: 'TERMINACOMERRO' */
            S111 ();
            if (returnInSub) return;
         }
         AV35GXV2 = (int)(AV35GXV2+1) ;
      }
   }

   protected void cleanup( )
   {
      this.aP2[0] = pcrunidadeput.this.AV11RetornoSDTCRUnidade;
      this.aP3[0] = pcrunidadeput.this.AV9Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11RetornoSDTCRUnidade = new com.projetopratico.SdtSDTCRUnidade(remoteHandle, context);
      AV9Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV13SDTCRUnidadeItem = new com.projetopratico.SdtSDTCRUnidade_enderecoItem(remoteHandle, context);
      GXv_int1 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char6 = new String[1] ;
      AV30ExclusaoSDTCRUnidade = new com.projetopratico.SdtSDTCRUnidade(remoteHandle, context);
      GXv_SdtSDTCRUnidade8 = new com.projetopratico.SdtSDTCRUnidade[1] ;
      AV31ExclusaoSDTCRUnidadeItem = new com.projetopratico.SdtSDTCRUnidade_enderecoItem(remoteHandle, context);
      GXv_int7 = new int[1] ;
      GXv_int5 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pcrunidadeput__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
      initializeGenerics();
   }

   @SuppressWarnings("unchecked")
   private void initializeGenerics( )
   {
      GXv_objcol_SdtMessages_Message4 = new GXBaseCollection[1] ;
   }

   private int AV29unid_id ;
   private int AV34GXV1 ;
   private int AV20cid_id ;
   private int AV14end_id ;
   private int GXv_int1[] ;
   private int AV35GXV2 ;
   private int AV36GXV3 ;
   private int GXv_int7[] ;
   private int GXv_int5[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char6[] ;
   private boolean returnInSub ;
   private boolean AV33DesvincularEndereco ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 ;
   private com.projetopratico.SdtSDTCRUnidade AV8SDTCRUnidade ;
   private com.projetopratico.SdtSDTCRUnidade[] aP2 ;
   private com.projetopratico.SdtSDTCRUnidade AV11RetornoSDTCRUnidade ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV9Messages ;
   private com.projetopratico.SdtSDTCRUnidade_enderecoItem AV13SDTCRUnidadeItem ;
   private IDataStoreProvider pr_default ;
   private com.projetopratico.SdtSDTCRUnidade AV30ExclusaoSDTCRUnidade ;
   private com.projetopratico.SdtSDTCRUnidade GXv_SdtSDTCRUnidade8[] ;
   private com.projetopratico.SdtSDTCRUnidade_enderecoItem AV31ExclusaoSDTCRUnidadeItem ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message4[] ;
}

final  class pcrunidadeput__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

