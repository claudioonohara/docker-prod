package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcrservidorefetivopost extends GXProcedure
{
   public pcrservidorefetivopost( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcrservidorefetivopost.class ), "" );
   }

   public pcrservidorefetivopost( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( com.projetopratico.SdtSDTCRServidorEfetivo aP0 ,
                                                                        com.projetopratico.SdtSDTCRServidorEfetivo[] aP1 )
   {
      pcrservidorefetivopost.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( com.projetopratico.SdtSDTCRServidorEfetivo aP0 ,
                        com.projetopratico.SdtSDTCRServidorEfetivo[] aP1 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( com.projetopratico.SdtSDTCRServidorEfetivo aP0 ,
                             com.projetopratico.SdtSDTCRServidorEfetivo[] aP1 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      pcrservidorefetivopost.this.AV18SDTCRServidorEfetivo = aP0;
      pcrservidorefetivopost.this.aP1 = aP1;
      pcrservidorefetivopost.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV12pes_id = AV18SDTCRServidorEfetivo.getgxTv_SdtSDTCRServidorEfetivo_Pes_id() ;
      GXv_int1[0] = AV12pes_id ;
      GXv_char2[0] = AV18SDTCRServidorEfetivo.getgxTv_SdtSDTCRServidorEfetivo_Pes_nome() ;
      GXv_date3[0] = AV18SDTCRServidorEfetivo.getgxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento() ;
      GXv_char4[0] = AV18SDTCRServidorEfetivo.getgxTv_SdtSDTCRServidorEfetivo_Pes_sexo() ;
      GXv_char5[0] = AV18SDTCRServidorEfetivo.getgxTv_SdtSDTCRServidorEfetivo_Pes_mae() ;
      GXv_char6[0] = AV18SDTCRServidorEfetivo.getgxTv_SdtSDTCRServidorEfetivo_Pes_pai() ;
      GXv_objcol_SdtMessages_Message7[0] = AV11Messages ;
      new com.projetopratico.pinsereatualizapessoa(remoteHandle, context).execute( GXv_int1, GXv_char2, GXv_date3, GXv_char4, GXv_char5, GXv_char6, GXv_objcol_SdtMessages_Message7) ;
      pcrservidorefetivopost.this.AV12pes_id = GXv_int1[0] ;
      AV18SDTCRServidorEfetivo.setgxTv_SdtSDTCRServidorEfetivo_Pes_nome( GXv_char2[0] );
      AV18SDTCRServidorEfetivo.setgxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento( GXv_date3[0] );
      AV18SDTCRServidorEfetivo.setgxTv_SdtSDTCRServidorEfetivo_Pes_sexo( GXv_char4[0] );
      AV18SDTCRServidorEfetivo.setgxTv_SdtSDTCRServidorEfetivo_Pes_mae( GXv_char5[0] );
      AV18SDTCRServidorEfetivo.setgxTv_SdtSDTCRServidorEfetivo_Pes_pai( GXv_char6[0] );
      AV11Messages = GXv_objcol_SdtMessages_Message7[0] ;
      /* Execute user subroutine: 'TERMINACOMERRO' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV19se_matricula = AV18SDTCRServidorEfetivo.getgxTv_SdtSDTCRServidorEfetivo_Se_matricula() ;
      GXv_int1[0] = AV12pes_id ;
      GXv_char6[0] = AV18SDTCRServidorEfetivo.getgxTv_SdtSDTCRServidorEfetivo_Se_matricula() ;
      GXv_objcol_SdtMessages_Message7[0] = AV11Messages ;
      new com.projetopratico.pinsereservidorefetivo(remoteHandle, context).execute( GXv_int1, GXv_char6, GXv_objcol_SdtMessages_Message7) ;
      pcrservidorefetivopost.this.AV12pes_id = GXv_int1[0] ;
      AV18SDTCRServidorEfetivo.setgxTv_SdtSDTCRServidorEfetivo_Se_matricula( GXv_char6[0] );
      AV11Messages = GXv_objcol_SdtMessages_Message7[0] ;
      /* Execute user subroutine: 'TERMINACOMERRO' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV22GXV1 = 1 ;
      while ( AV22GXV1 <= AV18SDTCRServidorEfetivo.getgxTv_SdtSDTCRServidorEfetivo_Endereco().size() )
      {
         AV20SDTCRServidorEfetivoEndItem = (com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem)((com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem)AV18SDTCRServidorEfetivo.getgxTv_SdtSDTCRServidorEfetivo_Endereco().elementAt(-1+AV22GXV1));
         AV9cid_id = AV20SDTCRServidorEfetivoEndItem.getgxTv_SdtSDTCRServidorEfetivo_enderecoItem_Cid_id() ;
         GXv_int1[0] = AV9cid_id ;
         GXv_char6[0] = AV20SDTCRServidorEfetivoEndItem.getgxTv_SdtSDTCRServidorEfetivo_enderecoItem_Cid_nome() ;
         GXv_char5[0] = AV20SDTCRServidorEfetivoEndItem.getgxTv_SdtSDTCRServidorEfetivo_enderecoItem_Cid_uf() ;
         GXv_objcol_SdtMessages_Message7[0] = AV11Messages ;
         new com.projetopratico.pinsereatualizacidade(remoteHandle, context).execute( GXv_int1, GXv_char6, GXv_char5, GXv_objcol_SdtMessages_Message7) ;
         pcrservidorefetivopost.this.AV9cid_id = GXv_int1[0] ;
         AV20SDTCRServidorEfetivoEndItem.setgxTv_SdtSDTCRServidorEfetivo_enderecoItem_Cid_nome( GXv_char6[0] );
         AV20SDTCRServidorEfetivoEndItem.setgxTv_SdtSDTCRServidorEfetivo_enderecoItem_Cid_uf( GXv_char5[0] );
         AV11Messages = GXv_objcol_SdtMessages_Message7[0] ;
         /* Execute user subroutine: 'TERMINACOMERRO' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV10end_id = AV20SDTCRServidorEfetivoEndItem.getgxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_id() ;
         GXv_int1[0] = AV10end_id ;
         GXv_char6[0] = AV20SDTCRServidorEfetivoEndItem.getgxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_tipo_logradouro() ;
         GXv_char5[0] = AV20SDTCRServidorEfetivoEndItem.getgxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_logradouro() ;
         GXv_int8[0] = AV20SDTCRServidorEfetivoEndItem.getgxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_numero() ;
         GXv_char4[0] = AV20SDTCRServidorEfetivoEndItem.getgxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_bairro() ;
         GXv_int9[0] = AV9cid_id ;
         GXv_objcol_SdtMessages_Message7[0] = AV11Messages ;
         new com.projetopratico.pinsereatualizaendereco(remoteHandle, context).execute( GXv_int1, GXv_char6, GXv_char5, GXv_int8, GXv_char4, GXv_int9, GXv_objcol_SdtMessages_Message7) ;
         pcrservidorefetivopost.this.AV10end_id = GXv_int1[0] ;
         AV20SDTCRServidorEfetivoEndItem.setgxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_tipo_logradouro( GXv_char6[0] );
         AV20SDTCRServidorEfetivoEndItem.setgxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_logradouro( GXv_char5[0] );
         AV20SDTCRServidorEfetivoEndItem.setgxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_numero( GXv_int8[0] );
         AV20SDTCRServidorEfetivoEndItem.setgxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_bairro( GXv_char4[0] );
         pcrservidorefetivopost.this.AV9cid_id = GXv_int9[0] ;
         AV11Messages = GXv_objcol_SdtMessages_Message7[0] ;
         /* Execute user subroutine: 'TERMINACOMERRO' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         GXv_int9[0] = AV10end_id ;
         GXv_int8[0] = AV12pes_id ;
         GXv_objcol_SdtMessages_Message7[0] = AV11Messages ;
         new com.projetopratico.pvinculapessoaendereco(remoteHandle, context).execute( GXv_int9, GXv_int8, GXv_objcol_SdtMessages_Message7) ;
         pcrservidorefetivopost.this.AV10end_id = GXv_int9[0] ;
         pcrservidorefetivopost.this.AV12pes_id = GXv_int8[0] ;
         AV11Messages = GXv_objcol_SdtMessages_Message7[0] ;
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
      Application.commitDataStores(context, remoteHandle, pr_default, "pcrservidorefetivopost");
      GXv_SdtSDTCRServidorEfetivo10[0] = AV21RetornoSDTCRServidorEfetivo;
      GXv_objcol_SdtMessages_Message7[0] = AV11Messages ;
      new com.projetopratico.pbuscacrservidorefetivo(remoteHandle, context).execute( AV12pes_id, AV19se_matricula, GXv_SdtSDTCRServidorEfetivo10, GXv_objcol_SdtMessages_Message7) ;
      AV21RetornoSDTCRServidorEfetivo = GXv_SdtSDTCRServidorEfetivo10[0];
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

   protected void cleanup( )
   {
      this.aP1[0] = pcrservidorefetivopost.this.AV21RetornoSDTCRServidorEfetivo;
      this.aP2[0] = pcrservidorefetivopost.this.AV11Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV21RetornoSDTCRServidorEfetivo = new com.projetopratico.SdtSDTCRServidorEfetivo(remoteHandle, context);
      AV11Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_char2 = new String[1] ;
      GXv_date3 = new java.util.Date[1] ;
      AV19se_matricula = "" ;
      AV20SDTCRServidorEfetivoEndItem = new com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem(remoteHandle, context);
      GXv_int1 = new int[1] ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_int8 = new int[1] ;
      GXv_SdtSDTCRServidorEfetivo10 = new com.projetopratico.SdtSDTCRServidorEfetivo[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pcrservidorefetivopost__default(),
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
   private int AV22GXV1 ;
   private int AV9cid_id ;
   private int AV10end_id ;
   private int GXv_int1[] ;
   private int GXv_int9[] ;
   private int GXv_int8[] ;
   private String GXv_char2[] ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private java.util.Date GXv_date3[] ;
   private boolean returnInSub ;
   private String AV19se_matricula ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ;
   private com.projetopratico.SdtSDTCRServidorEfetivo AV18SDTCRServidorEfetivo ;
   private com.projetopratico.SdtSDTCRServidorEfetivo[] aP1 ;
   private com.projetopratico.SdtSDTCRServidorEfetivo AV21RetornoSDTCRServidorEfetivo ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV11Messages ;
   private com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem AV20SDTCRServidorEfetivoEndItem ;
   private IDataStoreProvider pr_default ;
   private com.projetopratico.SdtSDTCRServidorEfetivo GXv_SdtSDTCRServidorEfetivo10[] ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message7[] ;
}

final  class pcrservidorefetivopost__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

