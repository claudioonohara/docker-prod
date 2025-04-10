package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcrservidortemporariopost extends GXProcedure
{
   public pcrservidortemporariopost( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcrservidortemporariopost.class ), "" );
   }

   public pcrservidortemporariopost( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( com.projetopratico.SdtSDTCRServidorTemporario aP0 ,
                                                                        com.projetopratico.SdtSDTCRServidorTemporario[] aP1 )
   {
      pcrservidortemporariopost.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( com.projetopratico.SdtSDTCRServidorTemporario aP0 ,
                        com.projetopratico.SdtSDTCRServidorTemporario[] aP1 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( com.projetopratico.SdtSDTCRServidorTemporario aP0 ,
                             com.projetopratico.SdtSDTCRServidorTemporario[] aP1 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      pcrservidortemporariopost.this.AV9SDTCRServidorTemporario = aP0;
      pcrservidortemporariopost.this.aP1 = aP1;
      pcrservidortemporariopost.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV15pes_id = AV9SDTCRServidorTemporario.getgxTv_SdtSDTCRServidorTemporario_Pes_id() ;
      GXv_int1[0] = AV15pes_id ;
      GXv_char2[0] = AV9SDTCRServidorTemporario.getgxTv_SdtSDTCRServidorTemporario_Pes_nome() ;
      GXv_date3[0] = AV9SDTCRServidorTemporario.getgxTv_SdtSDTCRServidorTemporario_Pes_data_nascimento() ;
      GXv_char4[0] = AV9SDTCRServidorTemporario.getgxTv_SdtSDTCRServidorTemporario_Pes_sexo() ;
      GXv_char5[0] = AV9SDTCRServidorTemporario.getgxTv_SdtSDTCRServidorTemporario_Pes_mae() ;
      GXv_char6[0] = AV9SDTCRServidorTemporario.getgxTv_SdtSDTCRServidorTemporario_Pes_pai() ;
      GXv_objcol_SdtMessages_Message7[0] = AV14Messages ;
      new com.projetopratico.pinsereatualizapessoa(remoteHandle, context).execute( GXv_int1, GXv_char2, GXv_date3, GXv_char4, GXv_char5, GXv_char6, GXv_objcol_SdtMessages_Message7) ;
      pcrservidortemporariopost.this.AV15pes_id = GXv_int1[0] ;
      AV9SDTCRServidorTemporario.setgxTv_SdtSDTCRServidorTemporario_Pes_nome( GXv_char2[0] );
      AV9SDTCRServidorTemporario.setgxTv_SdtSDTCRServidorTemporario_Pes_data_nascimento( GXv_date3[0] );
      AV9SDTCRServidorTemporario.setgxTv_SdtSDTCRServidorTemporario_Pes_sexo( GXv_char4[0] );
      AV9SDTCRServidorTemporario.setgxTv_SdtSDTCRServidorTemporario_Pes_mae( GXv_char5[0] );
      AV9SDTCRServidorTemporario.setgxTv_SdtSDTCRServidorTemporario_Pes_pai( GXv_char6[0] );
      AV14Messages = GXv_objcol_SdtMessages_Message7[0] ;
      /* Execute user subroutine: 'TERMINACOMERRO' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV10st_data_admissao = AV9SDTCRServidorTemporario.getgxTv_SdtSDTCRServidorTemporario_St_data_admissao() ;
      AV11st_data_demissao = AV9SDTCRServidorTemporario.getgxTv_SdtSDTCRServidorTemporario_St_data_demissao() ;
      GXv_int1[0] = AV15pes_id ;
      GXv_date3[0] = AV9SDTCRServidorTemporario.getgxTv_SdtSDTCRServidorTemporario_St_data_admissao() ;
      GXv_date8[0] = AV9SDTCRServidorTemporario.getgxTv_SdtSDTCRServidorTemporario_St_data_demissao() ;
      GXv_objcol_SdtMessages_Message7[0] = AV14Messages ;
      new com.projetopratico.pinsereservidortemporario(remoteHandle, context).execute( GXv_int1, GXv_date3, GXv_date8, GXv_objcol_SdtMessages_Message7) ;
      pcrservidortemporariopost.this.AV15pes_id = GXv_int1[0] ;
      AV9SDTCRServidorTemporario.setgxTv_SdtSDTCRServidorTemporario_St_data_admissao( GXv_date3[0] );
      AV9SDTCRServidorTemporario.setgxTv_SdtSDTCRServidorTemporario_St_data_demissao( GXv_date8[0] );
      AV14Messages = GXv_objcol_SdtMessages_Message7[0] ;
      /* Execute user subroutine: 'TERMINACOMERRO' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV22GXV1 = 1 ;
      while ( AV22GXV1 <= AV9SDTCRServidorTemporario.getgxTv_SdtSDTCRServidorTemporario_Endereco().size() )
      {
         AV18SDTCRServidorTemporarioEndItem = (com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem)((com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem)AV9SDTCRServidorTemporario.getgxTv_SdtSDTCRServidorTemporario_Endereco().elementAt(-1+AV22GXV1));
         AV12cid_id = AV20SDTCRServidorTemporarioItem.getgxTv_SdtSDTCRServidorTemporario_enderecoItem_Cid_id() ;
         GXv_int1[0] = AV12cid_id ;
         GXv_char6[0] = AV18SDTCRServidorTemporarioEndItem.getgxTv_SdtSDTCRServidorTemporario_enderecoItem_Cid_nome() ;
         GXv_char5[0] = AV18SDTCRServidorTemporarioEndItem.getgxTv_SdtSDTCRServidorTemporario_enderecoItem_Cid_uf() ;
         GXv_objcol_SdtMessages_Message7[0] = AV14Messages ;
         new com.projetopratico.pinsereatualizacidade(remoteHandle, context).execute( GXv_int1, GXv_char6, GXv_char5, GXv_objcol_SdtMessages_Message7) ;
         pcrservidortemporariopost.this.AV12cid_id = GXv_int1[0] ;
         AV18SDTCRServidorTemporarioEndItem.setgxTv_SdtSDTCRServidorTemporario_enderecoItem_Cid_nome( GXv_char6[0] );
         AV18SDTCRServidorTemporarioEndItem.setgxTv_SdtSDTCRServidorTemporario_enderecoItem_Cid_uf( GXv_char5[0] );
         AV14Messages = GXv_objcol_SdtMessages_Message7[0] ;
         /* Execute user subroutine: 'TERMINACOMERRO' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV8end_id = AV18SDTCRServidorTemporarioEndItem.getgxTv_SdtSDTCRServidorTemporario_enderecoItem_End_id() ;
         GXv_int1[0] = AV8end_id ;
         GXv_char6[0] = AV18SDTCRServidorTemporarioEndItem.getgxTv_SdtSDTCRServidorTemporario_enderecoItem_End_tipo_logradouro() ;
         GXv_char5[0] = AV18SDTCRServidorTemporarioEndItem.getgxTv_SdtSDTCRServidorTemporario_enderecoItem_End_logradouro() ;
         GXv_int9[0] = AV18SDTCRServidorTemporarioEndItem.getgxTv_SdtSDTCRServidorTemporario_enderecoItem_End_numero() ;
         GXv_char4[0] = AV18SDTCRServidorTemporarioEndItem.getgxTv_SdtSDTCRServidorTemporario_enderecoItem_End_bairro() ;
         GXv_int10[0] = AV12cid_id ;
         GXv_objcol_SdtMessages_Message7[0] = AV14Messages ;
         new com.projetopratico.pinsereatualizaendereco(remoteHandle, context).execute( GXv_int1, GXv_char6, GXv_char5, GXv_int9, GXv_char4, GXv_int10, GXv_objcol_SdtMessages_Message7) ;
         pcrservidortemporariopost.this.AV8end_id = GXv_int1[0] ;
         AV18SDTCRServidorTemporarioEndItem.setgxTv_SdtSDTCRServidorTemporario_enderecoItem_End_tipo_logradouro( GXv_char6[0] );
         AV18SDTCRServidorTemporarioEndItem.setgxTv_SdtSDTCRServidorTemporario_enderecoItem_End_logradouro( GXv_char5[0] );
         AV18SDTCRServidorTemporarioEndItem.setgxTv_SdtSDTCRServidorTemporario_enderecoItem_End_numero( GXv_int9[0] );
         AV18SDTCRServidorTemporarioEndItem.setgxTv_SdtSDTCRServidorTemporario_enderecoItem_End_bairro( GXv_char4[0] );
         pcrservidortemporariopost.this.AV12cid_id = GXv_int10[0] ;
         AV14Messages = GXv_objcol_SdtMessages_Message7[0] ;
         /* Execute user subroutine: 'TERMINACOMERRO' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         GXv_int10[0] = AV8end_id ;
         GXv_int9[0] = AV15pes_id ;
         GXv_objcol_SdtMessages_Message7[0] = AV14Messages ;
         new com.projetopratico.pvinculapessoaendereco(remoteHandle, context).execute( GXv_int10, GXv_int9, GXv_objcol_SdtMessages_Message7) ;
         pcrservidortemporariopost.this.AV8end_id = GXv_int10[0] ;
         pcrservidortemporariopost.this.AV15pes_id = GXv_int9[0] ;
         AV14Messages = GXv_objcol_SdtMessages_Message7[0] ;
         /* Execute user subroutine: 'TERMINACOMERRO' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV22GXV1 = (int)(AV22GXV1+1) ;
      }
      Application.commitDataStores(context, remoteHandle, pr_default, "pcrservidortemporariopost");
      GXv_SdtSDTCRServidorTemporario11[0] = AV21RetornoSDTCRServidorTemporario;
      GXv_objcol_SdtMessages_Message7[0] = AV14Messages ;
      new com.projetopratico.pbuscacrservidortemporario(remoteHandle, context).execute( AV15pes_id, AV10st_data_admissao, AV11st_data_demissao, GXv_SdtSDTCRServidorTemporario11, GXv_objcol_SdtMessages_Message7) ;
      AV21RetornoSDTCRServidorTemporario = GXv_SdtSDTCRServidorTemporario11[0];
      AV14Messages = GXv_objcol_SdtMessages_Message7[0] ;
      cleanup();
   }

   public void S111( )
   {
      /* 'TERMINACOMERRO' Routine */
      returnInSub = false ;
      if ( AV14Messages.size() > 0 )
      {
         returnInSub = true;
         if (true) return;
      }
   }

   protected void cleanup( )
   {
      this.aP1[0] = pcrservidortemporariopost.this.AV21RetornoSDTCRServidorTemporario;
      this.aP2[0] = pcrservidortemporariopost.this.AV14Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV21RetornoSDTCRServidorTemporario = new com.projetopratico.SdtSDTCRServidorTemporario(remoteHandle, context);
      AV14Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_char2 = new String[1] ;
      AV10st_data_admissao = GXutil.nullDate() ;
      AV11st_data_demissao = GXutil.nullDate() ;
      GXv_date3 = new java.util.Date[1] ;
      GXv_date8 = new java.util.Date[1] ;
      AV18SDTCRServidorTemporarioEndItem = new com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem(remoteHandle, context);
      AV20SDTCRServidorTemporarioItem = new com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem(remoteHandle, context);
      GXv_int1 = new int[1] ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int9 = new int[1] ;
      GXv_SdtSDTCRServidorTemporario11 = new com.projetopratico.SdtSDTCRServidorTemporario[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pcrservidortemporariopost__default(),
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

   private int AV15pes_id ;
   private int AV22GXV1 ;
   private int AV12cid_id ;
   private int AV8end_id ;
   private int GXv_int1[] ;
   private int GXv_int10[] ;
   private int GXv_int9[] ;
   private String GXv_char2[] ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private java.util.Date AV10st_data_admissao ;
   private java.util.Date AV11st_data_demissao ;
   private java.util.Date GXv_date3[] ;
   private java.util.Date GXv_date8[] ;
   private boolean returnInSub ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ;
   private com.projetopratico.SdtSDTCRServidorTemporario AV9SDTCRServidorTemporario ;
   private com.projetopratico.SdtSDTCRServidorTemporario[] aP1 ;
   private com.projetopratico.SdtSDTCRServidorTemporario AV21RetornoSDTCRServidorTemporario ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV14Messages ;
   private com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem AV18SDTCRServidorTemporarioEndItem ;
   private com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem AV20SDTCRServidorTemporarioItem ;
   private IDataStoreProvider pr_default ;
   private com.projetopratico.SdtSDTCRServidorTemporario GXv_SdtSDTCRServidorTemporario11[] ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message7[] ;
}

final  class pcrservidortemporariopost__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

