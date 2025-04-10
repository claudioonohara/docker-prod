package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcrservidortemporarioput extends GXProcedure
{
   public pcrservidortemporarioput( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcrservidortemporarioput.class ), "" );
   }

   public pcrservidortemporarioput( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int aP0 ,
                                                                        java.util.Date aP1 ,
                                                                        java.util.Date aP2 ,
                                                                        com.projetopratico.SdtSDTCRServidorTemporarioAtualiza aP3 ,
                                                                        com.projetopratico.SdtSDTCRServidorTemporario[] aP4 )
   {
      pcrservidortemporarioput.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( int aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 ,
                        com.projetopratico.SdtSDTCRServidorTemporarioAtualiza aP3 ,
                        com.projetopratico.SdtSDTCRServidorTemporario[] aP4 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( int aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             com.projetopratico.SdtSDTCRServidorTemporarioAtualiza aP3 ,
                             com.projetopratico.SdtSDTCRServidorTemporario[] aP4 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP5 )
   {
      pcrservidortemporarioput.this.AV12pes_id = aP0;
      pcrservidortemporarioput.this.AV16st_data_admissao = aP1;
      pcrservidortemporarioput.this.AV17st_data_demissao = aP2;
      pcrservidortemporarioput.this.AV18SDTCRServidorTemporarioAtualiza = aP3;
      pcrservidortemporarioput.this.aP4 = aP4;
      pcrservidortemporarioput.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      GXv_int1[0] = AV12pes_id ;
      GXv_char2[0] = AV18SDTCRServidorTemporarioAtualiza.getgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_nome() ;
      GXv_date3[0] = AV18SDTCRServidorTemporarioAtualiza.getgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento() ;
      GXv_char4[0] = AV18SDTCRServidorTemporarioAtualiza.getgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_sexo() ;
      GXv_char5[0] = AV18SDTCRServidorTemporarioAtualiza.getgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_mae() ;
      GXv_char6[0] = AV18SDTCRServidorTemporarioAtualiza.getgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_pai() ;
      GXv_objcol_SdtMessages_Message7[0] = AV11Messages ;
      new com.projetopratico.pinsereatualizapessoa(remoteHandle, context).execute( GXv_int1, GXv_char2, GXv_date3, GXv_char4, GXv_char5, GXv_char6, GXv_objcol_SdtMessages_Message7) ;
      pcrservidortemporarioput.this.AV12pes_id = GXv_int1[0] ;
      AV18SDTCRServidorTemporarioAtualiza.setgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_nome( GXv_char2[0] );
      AV18SDTCRServidorTemporarioAtualiza.setgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento( GXv_date3[0] );
      AV18SDTCRServidorTemporarioAtualiza.setgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_sexo( GXv_char4[0] );
      AV18SDTCRServidorTemporarioAtualiza.setgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_mae( GXv_char5[0] );
      AV18SDTCRServidorTemporarioAtualiza.setgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_pai( GXv_char6[0] );
      AV11Messages = GXv_objcol_SdtMessages_Message7[0] ;
      /* Execute user subroutine: 'TERMINACOMERRO' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXv_int1[0] = AV12pes_id ;
      GXv_date3[0] = AV16st_data_admissao ;
      GXv_date8[0] = AV17st_data_demissao ;
      GXv_date9[0] = AV18SDTCRServidorTemporarioAtualiza.getgxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao() ;
      GXv_date10[0] = AV18SDTCRServidorTemporarioAtualiza.getgxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao() ;
      GXv_objcol_SdtMessages_Message7[0] = AV11Messages ;
      new com.projetopratico.patualizaservidortemporario(remoteHandle, context).execute( GXv_int1, GXv_date3, GXv_date8, GXv_date9, GXv_date10, GXv_objcol_SdtMessages_Message7) ;
      pcrservidortemporarioput.this.AV12pes_id = GXv_int1[0] ;
      pcrservidortemporarioput.this.AV16st_data_admissao = GXv_date3[0] ;
      pcrservidortemporarioput.this.AV17st_data_demissao = GXv_date8[0] ;
      AV18SDTCRServidorTemporarioAtualiza.setgxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao( GXv_date9[0] );
      AV18SDTCRServidorTemporarioAtualiza.setgxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao( GXv_date10[0] );
      AV11Messages = GXv_objcol_SdtMessages_Message7[0] ;
      /* Execute user subroutine: 'TERMINACOMERRO' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'DESVINCULAPESSOAENDERECO' */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV24GXV1 = 1 ;
      while ( AV24GXV1 <= AV18SDTCRServidorTemporarioAtualiza.getgxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco().size() )
      {
         AV20SDTCRServidorTemporarioAtualizaEndItem = (com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem)((com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem)AV18SDTCRServidorTemporarioAtualiza.getgxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco().elementAt(-1+AV24GXV1));
         AV9cid_id = AV20SDTCRServidorTemporarioAtualizaEndItem.getgxTv_SdtSDTCRServidorTemporarioAtualiza_enderecoItem_Cid_id() ;
         GXv_int1[0] = AV9cid_id ;
         GXv_char6[0] = AV20SDTCRServidorTemporarioAtualizaEndItem.getgxTv_SdtSDTCRServidorTemporarioAtualiza_enderecoItem_Cid_nome() ;
         GXv_char5[0] = AV20SDTCRServidorTemporarioAtualizaEndItem.getgxTv_SdtSDTCRServidorTemporarioAtualiza_enderecoItem_Cid_uf() ;
         GXv_objcol_SdtMessages_Message7[0] = AV11Messages ;
         new com.projetopratico.pinsereatualizacidade(remoteHandle, context).execute( GXv_int1, GXv_char6, GXv_char5, GXv_objcol_SdtMessages_Message7) ;
         pcrservidortemporarioput.this.AV9cid_id = GXv_int1[0] ;
         AV20SDTCRServidorTemporarioAtualizaEndItem.setgxTv_SdtSDTCRServidorTemporarioAtualiza_enderecoItem_Cid_nome( GXv_char6[0] );
         AV20SDTCRServidorTemporarioAtualizaEndItem.setgxTv_SdtSDTCRServidorTemporarioAtualiza_enderecoItem_Cid_uf( GXv_char5[0] );
         AV11Messages = GXv_objcol_SdtMessages_Message7[0] ;
         /* Execute user subroutine: 'TERMINACOMERRO' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV10end_id = AV20SDTCRServidorTemporarioAtualizaEndItem.getgxTv_SdtSDTCRServidorTemporarioAtualiza_enderecoItem_End_id() ;
         GXv_int1[0] = AV10end_id ;
         GXv_char6[0] = AV20SDTCRServidorTemporarioAtualizaEndItem.getgxTv_SdtSDTCRServidorTemporarioAtualiza_enderecoItem_End_tipo_logradouro() ;
         GXv_char5[0] = AV20SDTCRServidorTemporarioAtualizaEndItem.getgxTv_SdtSDTCRServidorTemporarioAtualiza_enderecoItem_End_logradouro() ;
         GXv_int11[0] = AV20SDTCRServidorTemporarioAtualizaEndItem.getgxTv_SdtSDTCRServidorTemporarioAtualiza_enderecoItem_End_numero() ;
         GXv_char4[0] = AV20SDTCRServidorTemporarioAtualizaEndItem.getgxTv_SdtSDTCRServidorTemporarioAtualiza_enderecoItem_End_bairro() ;
         GXv_int12[0] = AV9cid_id ;
         GXv_objcol_SdtMessages_Message7[0] = AV11Messages ;
         new com.projetopratico.pinsereatualizaendereco(remoteHandle, context).execute( GXv_int1, GXv_char6, GXv_char5, GXv_int11, GXv_char4, GXv_int12, GXv_objcol_SdtMessages_Message7) ;
         pcrservidortemporarioput.this.AV10end_id = GXv_int1[0] ;
         AV20SDTCRServidorTemporarioAtualizaEndItem.setgxTv_SdtSDTCRServidorTemporarioAtualiza_enderecoItem_End_tipo_logradouro( GXv_char6[0] );
         AV20SDTCRServidorTemporarioAtualizaEndItem.setgxTv_SdtSDTCRServidorTemporarioAtualiza_enderecoItem_End_logradouro( GXv_char5[0] );
         AV20SDTCRServidorTemporarioAtualizaEndItem.setgxTv_SdtSDTCRServidorTemporarioAtualiza_enderecoItem_End_numero( GXv_int11[0] );
         AV20SDTCRServidorTemporarioAtualizaEndItem.setgxTv_SdtSDTCRServidorTemporarioAtualiza_enderecoItem_End_bairro( GXv_char4[0] );
         pcrservidortemporarioput.this.AV9cid_id = GXv_int12[0] ;
         AV11Messages = GXv_objcol_SdtMessages_Message7[0] ;
         /* Execute user subroutine: 'TERMINACOMERRO' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         GXv_int12[0] = AV10end_id ;
         GXv_int11[0] = AV12pes_id ;
         GXv_objcol_SdtMessages_Message7[0] = AV11Messages ;
         new com.projetopratico.pvinculapessoaendereco(remoteHandle, context).execute( GXv_int12, GXv_int11, GXv_objcol_SdtMessages_Message7) ;
         pcrservidortemporarioput.this.AV10end_id = GXv_int12[0] ;
         pcrservidortemporarioput.this.AV12pes_id = GXv_int11[0] ;
         AV11Messages = GXv_objcol_SdtMessages_Message7[0] ;
         /* Execute user subroutine: 'TERMINACOMERRO' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV24GXV1 = (int)(AV24GXV1+1) ;
      }
      Application.commitDataStores(context, remoteHandle, pr_default, "pcrservidortemporarioput");
      GXv_SdtSDTCRServidorTemporario13[0] = AV8RetornoSDTCRServidorTemporario;
      GXv_objcol_SdtMessages_Message7[0] = AV11Messages ;
      new com.projetopratico.pbuscacrservidortemporario(remoteHandle, context).execute( AV12pes_id, AV18SDTCRServidorTemporarioAtualiza.getgxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao(), AV18SDTCRServidorTemporarioAtualiza.getgxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao(), GXv_SdtSDTCRServidorTemporario13, GXv_objcol_SdtMessages_Message7) ;
      AV8RetornoSDTCRServidorTemporario = GXv_SdtSDTCRServidorTemporario13[0];
      AV11Messages = GXv_objcol_SdtMessages_Message7[0] ;
      cleanup();
   }

   public void S111( )
   {
      /* 'TERMINACOMERRO' Routine */
      returnInSub = false ;
      if ( AV11Messages.size() > 0 )
      {
         returnInSub = true;
         if (true) return;
      }
   }

   public void S121( )
   {
      /* 'DESVINCULAPESSOAENDERECO' Routine */
      returnInSub = false ;
      GXv_SdtSDTCRServidorTemporario13[0] = AV21ExclusaoSDTCRServidorTemporario;
      GXv_objcol_SdtMessages_Message7[0] = AV11Messages ;
      new com.projetopratico.pbuscacrservidortemporario(remoteHandle, context).execute( AV12pes_id, AV18SDTCRServidorTemporarioAtualiza.getgxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao(), AV18SDTCRServidorTemporarioAtualiza.getgxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao(), GXv_SdtSDTCRServidorTemporario13, GXv_objcol_SdtMessages_Message7) ;
      AV21ExclusaoSDTCRServidorTemporario = GXv_SdtSDTCRServidorTemporario13[0];
      AV11Messages = GXv_objcol_SdtMessages_Message7[0] ;
      AV25GXV2 = 1 ;
      while ( AV25GXV2 <= AV21ExclusaoSDTCRServidorTemporario.getgxTv_SdtSDTCRServidorTemporario_Endereco().size() )
      {
         AV23ExclusaoSDTCRServidorTemporarioItem = (com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem)((com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem)AV21ExclusaoSDTCRServidorTemporario.getgxTv_SdtSDTCRServidorTemporario_Endereco().elementAt(-1+AV25GXV2));
         AV22DesvincularEndereco = true ;
         AV26GXV3 = 1 ;
         while ( AV26GXV3 <= AV18SDTCRServidorTemporarioAtualiza.getgxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco().size() )
         {
            AV19SDTCRServidorTemporarioAtualizaItem = (com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem)((com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem)AV18SDTCRServidorTemporarioAtualiza.getgxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco().elementAt(-1+AV26GXV3));
            if ( AV23ExclusaoSDTCRServidorTemporarioItem.getgxTv_SdtSDTCRServidorTemporario_enderecoItem_End_id() == AV19SDTCRServidorTemporarioAtualizaItem.getgxTv_SdtSDTCRServidorTemporarioAtualiza_enderecoItem_End_id() )
            {
               AV22DesvincularEndereco = false ;
               if (true) break;
            }
            AV26GXV3 = (int)(AV26GXV3+1) ;
         }
         if ( AV22DesvincularEndereco )
         {
            GXv_int12[0] = AV23ExclusaoSDTCRServidorTemporarioItem.getgxTv_SdtSDTCRServidorTemporario_enderecoItem_End_id() ;
            GXv_int11[0] = AV12pes_id ;
            GXv_objcol_SdtMessages_Message7[0] = new GXBaseCollection<com.genexus.SdtMessages_Message>() ;
            new com.projetopratico.pdesvinculapessoaendereco(remoteHandle, context).execute( GXv_int12, GXv_int11, GXv_objcol_SdtMessages_Message7) ;
            AV23ExclusaoSDTCRServidorTemporarioItem.setgxTv_SdtSDTCRServidorTemporario_enderecoItem_End_id( GXv_int12[0] );
            pcrservidortemporarioput.this.AV12pes_id = GXv_int11[0] ;
            /* Execute user subroutine: 'TERMINACOMERRO' */
            S111 ();
            if (returnInSub) return;
         }
         AV25GXV2 = (int)(AV25GXV2+1) ;
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = pcrservidortemporarioput.this.AV8RetornoSDTCRServidorTemporario;
      this.aP5[0] = pcrservidortemporarioput.this.AV11Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8RetornoSDTCRServidorTemporario = new com.projetopratico.SdtSDTCRServidorTemporario(remoteHandle, context);
      AV11Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_char2 = new String[1] ;
      GXv_date3 = new java.util.Date[1] ;
      GXv_date8 = new java.util.Date[1] ;
      GXv_date9 = new java.util.Date[1] ;
      GXv_date10 = new java.util.Date[1] ;
      AV20SDTCRServidorTemporarioAtualizaEndItem = new com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem(remoteHandle, context);
      GXv_int1 = new int[1] ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      AV21ExclusaoSDTCRServidorTemporario = new com.projetopratico.SdtSDTCRServidorTemporario(remoteHandle, context);
      GXv_SdtSDTCRServidorTemporario13 = new com.projetopratico.SdtSDTCRServidorTemporario[1] ;
      AV23ExclusaoSDTCRServidorTemporarioItem = new com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem(remoteHandle, context);
      AV19SDTCRServidorTemporarioAtualizaItem = new com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem(remoteHandle, context);
      GXv_int12 = new int[1] ;
      GXv_int11 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pcrservidortemporarioput__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
      initializeGenerics();
   }

   @SuppressWarnings("unchecked")
   private void initializeGenerics( )
   {
      GXv_objcol_SdtMessages_Message7 = new GXBaseCollection[1] ;
   }

   private int AV12pes_id ;
   private int AV24GXV1 ;
   private int AV9cid_id ;
   private int AV10end_id ;
   private int GXv_int1[] ;
   private int AV25GXV2 ;
   private int AV26GXV3 ;
   private int GXv_int12[] ;
   private int GXv_int11[] ;
   private String GXv_char2[] ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private java.util.Date AV16st_data_admissao ;
   private java.util.Date AV17st_data_demissao ;
   private java.util.Date GXv_date3[] ;
   private java.util.Date GXv_date8[] ;
   private java.util.Date GXv_date9[] ;
   private java.util.Date GXv_date10[] ;
   private boolean returnInSub ;
   private boolean AV22DesvincularEndereco ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP5 ;
   private com.projetopratico.SdtSDTCRServidorTemporarioAtualiza AV18SDTCRServidorTemporarioAtualiza ;
   private com.projetopratico.SdtSDTCRServidorTemporario[] aP4 ;
   private com.projetopratico.SdtSDTCRServidorTemporario AV8RetornoSDTCRServidorTemporario ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV11Messages ;
   private com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem AV20SDTCRServidorTemporarioAtualizaEndItem ;
   private IDataStoreProvider pr_default ;
   private com.projetopratico.SdtSDTCRServidorTemporario AV21ExclusaoSDTCRServidorTemporario ;
   private com.projetopratico.SdtSDTCRServidorTemporario GXv_SdtSDTCRServidorTemporario13[] ;
   private com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem AV23ExclusaoSDTCRServidorTemporarioItem ;
   private com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem AV19SDTCRServidorTemporarioAtualizaItem ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message7[] ;
}

final  class pcrservidortemporarioput__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

