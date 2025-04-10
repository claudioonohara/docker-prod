package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcrservidorefetivoput extends GXProcedure
{
   public pcrservidorefetivoput( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcrservidorefetivoput.class ), "" );
   }

   public pcrservidorefetivoput( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int aP0 ,
                                                                        String aP1 ,
                                                                        com.projetopratico.SdtSDTCRServidorEfetivoAtualiza aP2 ,
                                                                        com.projetopratico.SdtSDTCRServidorEfetivo[] aP3 )
   {
      pcrservidorefetivoput.this.aP4 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( int aP0 ,
                        String aP1 ,
                        com.projetopratico.SdtSDTCRServidorEfetivoAtualiza aP2 ,
                        com.projetopratico.SdtSDTCRServidorEfetivo[] aP3 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( int aP0 ,
                             String aP1 ,
                             com.projetopratico.SdtSDTCRServidorEfetivoAtualiza aP2 ,
                             com.projetopratico.SdtSDTCRServidorEfetivo[] aP3 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 )
   {
      pcrservidorefetivoput.this.AV12pes_id = aP0;
      pcrservidorefetivoput.this.AV30se_matricula = aP1;
      pcrservidorefetivoput.this.AV24SDTCRServidorEfetivoAtualiza = aP2;
      pcrservidorefetivoput.this.aP3 = aP3;
      pcrservidorefetivoput.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      GXv_int1[0] = AV12pes_id ;
      GXv_char2[0] = AV24SDTCRServidorEfetivoAtualiza.getgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_nome() ;
      GXv_date3[0] = AV24SDTCRServidorEfetivoAtualiza.getgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento() ;
      GXv_char4[0] = AV24SDTCRServidorEfetivoAtualiza.getgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_sexo() ;
      GXv_char5[0] = AV24SDTCRServidorEfetivoAtualiza.getgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_mae() ;
      GXv_char6[0] = AV24SDTCRServidorEfetivoAtualiza.getgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_pai() ;
      GXv_objcol_SdtMessages_Message7[0] = AV11Messages ;
      new com.projetopratico.pinsereatualizapessoa(remoteHandle, context).execute( GXv_int1, GXv_char2, GXv_date3, GXv_char4, GXv_char5, GXv_char6, GXv_objcol_SdtMessages_Message7) ;
      pcrservidorefetivoput.this.AV12pes_id = GXv_int1[0] ;
      AV24SDTCRServidorEfetivoAtualiza.setgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_nome( GXv_char2[0] );
      AV24SDTCRServidorEfetivoAtualiza.setgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento( GXv_date3[0] );
      AV24SDTCRServidorEfetivoAtualiza.setgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_sexo( GXv_char4[0] );
      AV24SDTCRServidorEfetivoAtualiza.setgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_mae( GXv_char5[0] );
      AV24SDTCRServidorEfetivoAtualiza.setgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_pai( GXv_char6[0] );
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
      GXv_char6[0] = AV30se_matricula ;
      GXv_char5[0] = AV24SDTCRServidorEfetivoAtualiza.getgxTv_SdtSDTCRServidorEfetivoAtualiza_Se_matricula() ;
      GXv_objcol_SdtMessages_Message7[0] = AV11Messages ;
      new com.projetopratico.patualizaservidorefetivo(remoteHandle, context).execute( GXv_int1, GXv_char6, GXv_char5, GXv_objcol_SdtMessages_Message7) ;
      pcrservidorefetivoput.this.AV12pes_id = GXv_int1[0] ;
      pcrservidorefetivoput.this.AV30se_matricula = GXv_char6[0] ;
      AV24SDTCRServidorEfetivoAtualiza.setgxTv_SdtSDTCRServidorEfetivoAtualiza_Se_matricula( GXv_char5[0] );
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
      AV31GXV1 = 1 ;
      while ( AV31GXV1 <= AV24SDTCRServidorEfetivoAtualiza.getgxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco().size() )
      {
         AV25SDTCRServidorEfetivoAtualizaEndItem = (com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem)((com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem)AV24SDTCRServidorEfetivoAtualiza.getgxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco().elementAt(-1+AV31GXV1));
         AV9cid_id = AV25SDTCRServidorEfetivoAtualizaEndItem.getgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_Cid_id() ;
         GXv_int1[0] = AV9cid_id ;
         GXv_char6[0] = AV25SDTCRServidorEfetivoAtualizaEndItem.getgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_Cid_nome() ;
         GXv_char5[0] = AV25SDTCRServidorEfetivoAtualizaEndItem.getgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_Cid_uf() ;
         GXv_objcol_SdtMessages_Message7[0] = AV11Messages ;
         new com.projetopratico.pinsereatualizacidade(remoteHandle, context).execute( GXv_int1, GXv_char6, GXv_char5, GXv_objcol_SdtMessages_Message7) ;
         pcrservidorefetivoput.this.AV9cid_id = GXv_int1[0] ;
         AV25SDTCRServidorEfetivoAtualizaEndItem.setgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_Cid_nome( GXv_char6[0] );
         AV25SDTCRServidorEfetivoAtualizaEndItem.setgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_Cid_uf( GXv_char5[0] );
         AV11Messages = GXv_objcol_SdtMessages_Message7[0] ;
         /* Execute user subroutine: 'TERMINACOMERRO' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV10end_id = AV25SDTCRServidorEfetivoAtualizaEndItem.getgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_id() ;
         GXv_int1[0] = AV10end_id ;
         GXv_char6[0] = AV25SDTCRServidorEfetivoAtualizaEndItem.getgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_tipo_logradouro() ;
         GXv_char5[0] = AV25SDTCRServidorEfetivoAtualizaEndItem.getgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_logradouro() ;
         GXv_int8[0] = AV25SDTCRServidorEfetivoAtualizaEndItem.getgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_numero() ;
         GXv_char4[0] = AV25SDTCRServidorEfetivoAtualizaEndItem.getgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_bairro() ;
         GXv_int9[0] = AV9cid_id ;
         GXv_objcol_SdtMessages_Message7[0] = AV11Messages ;
         new com.projetopratico.pinsereatualizaendereco(remoteHandle, context).execute( GXv_int1, GXv_char6, GXv_char5, GXv_int8, GXv_char4, GXv_int9, GXv_objcol_SdtMessages_Message7) ;
         pcrservidorefetivoput.this.AV10end_id = GXv_int1[0] ;
         AV25SDTCRServidorEfetivoAtualizaEndItem.setgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_tipo_logradouro( GXv_char6[0] );
         AV25SDTCRServidorEfetivoAtualizaEndItem.setgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_logradouro( GXv_char5[0] );
         AV25SDTCRServidorEfetivoAtualizaEndItem.setgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_numero( GXv_int8[0] );
         AV25SDTCRServidorEfetivoAtualizaEndItem.setgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_bairro( GXv_char4[0] );
         pcrservidorefetivoput.this.AV9cid_id = GXv_int9[0] ;
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
         pcrservidorefetivoput.this.AV10end_id = GXv_int9[0] ;
         pcrservidorefetivoput.this.AV12pes_id = GXv_int8[0] ;
         AV11Messages = GXv_objcol_SdtMessages_Message7[0] ;
         /* Execute user subroutine: 'TERMINACOMERRO' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV31GXV1 = (int)(AV31GXV1+1) ;
      }
      Application.commitDataStores(context, remoteHandle, pr_default, "pcrservidorefetivoput");
      GXv_SdtSDTCRServidorEfetivo10[0] = AV26RetornoSDTCRServidorEfetivo;
      GXv_objcol_SdtMessages_Message7[0] = AV11Messages ;
      new com.projetopratico.pbuscacrservidorefetivo(remoteHandle, context).execute( AV12pes_id, AV24SDTCRServidorEfetivoAtualiza.getgxTv_SdtSDTCRServidorEfetivoAtualiza_Se_matricula(), GXv_SdtSDTCRServidorEfetivo10, GXv_objcol_SdtMessages_Message7) ;
      AV26RetornoSDTCRServidorEfetivo = GXv_SdtSDTCRServidorEfetivo10[0];
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
      GXv_SdtSDTCRServidorEfetivo10[0] = AV27ExclusaoSDTCRServidorEfetivo;
      GXv_objcol_SdtMessages_Message7[0] = AV11Messages ;
      new com.projetopratico.pbuscacrservidorefetivo(remoteHandle, context).execute( AV12pes_id, AV24SDTCRServidorEfetivoAtualiza.getgxTv_SdtSDTCRServidorEfetivoAtualiza_Se_matricula(), GXv_SdtSDTCRServidorEfetivo10, GXv_objcol_SdtMessages_Message7) ;
      AV27ExclusaoSDTCRServidorEfetivo = GXv_SdtSDTCRServidorEfetivo10[0];
      AV11Messages = GXv_objcol_SdtMessages_Message7[0] ;
      AV32GXV2 = 1 ;
      while ( AV32GXV2 <= AV27ExclusaoSDTCRServidorEfetivo.getgxTv_SdtSDTCRServidorEfetivo_Endereco().size() )
      {
         AV28ExclusaoSDTCRServidorEfetivoItem = (com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem)((com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem)AV27ExclusaoSDTCRServidorEfetivo.getgxTv_SdtSDTCRServidorEfetivo_Endereco().elementAt(-1+AV32GXV2));
         AV22DesvincularEndereco = true ;
         AV33GXV3 = 1 ;
         while ( AV33GXV3 <= AV24SDTCRServidorEfetivoAtualiza.getgxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco().size() )
         {
            AV29SDTCRServidorEfetivoAtualizaItem = (com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem)((com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem)AV24SDTCRServidorEfetivoAtualiza.getgxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco().elementAt(-1+AV33GXV3));
            if ( AV28ExclusaoSDTCRServidorEfetivoItem.getgxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_id() == AV29SDTCRServidorEfetivoAtualizaItem.getgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_id() )
            {
               AV22DesvincularEndereco = false ;
               if (true) break;
            }
            AV33GXV3 = (int)(AV33GXV3+1) ;
         }
         if ( AV22DesvincularEndereco )
         {
            GXv_int9[0] = AV28ExclusaoSDTCRServidorEfetivoItem.getgxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_id() ;
            GXv_int8[0] = AV12pes_id ;
            GXv_objcol_SdtMessages_Message7[0] = new GXBaseCollection<com.genexus.SdtMessages_Message>() ;
            new com.projetopratico.pdesvinculapessoaendereco(remoteHandle, context).execute( GXv_int9, GXv_int8, GXv_objcol_SdtMessages_Message7) ;
            AV28ExclusaoSDTCRServidorEfetivoItem.setgxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_id( GXv_int9[0] );
            pcrservidorefetivoput.this.AV12pes_id = GXv_int8[0] ;
            /* Execute user subroutine: 'TERMINACOMERRO' */
            S111 ();
            if (returnInSub) return;
         }
         AV32GXV2 = (int)(AV32GXV2+1) ;
      }
   }

   protected void cleanup( )
   {
      this.aP3[0] = pcrservidorefetivoput.this.AV26RetornoSDTCRServidorEfetivo;
      this.aP4[0] = pcrservidorefetivoput.this.AV11Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV26RetornoSDTCRServidorEfetivo = new com.projetopratico.SdtSDTCRServidorEfetivo(remoteHandle, context);
      AV11Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_char2 = new String[1] ;
      GXv_date3 = new java.util.Date[1] ;
      AV25SDTCRServidorEfetivoAtualizaEndItem = new com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem(remoteHandle, context);
      GXv_int1 = new int[1] ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      AV27ExclusaoSDTCRServidorEfetivo = new com.projetopratico.SdtSDTCRServidorEfetivo(remoteHandle, context);
      GXv_SdtSDTCRServidorEfetivo10 = new com.projetopratico.SdtSDTCRServidorEfetivo[1] ;
      AV28ExclusaoSDTCRServidorEfetivoItem = new com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem(remoteHandle, context);
      AV29SDTCRServidorEfetivoAtualizaItem = new com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem(remoteHandle, context);
      GXv_int9 = new int[1] ;
      GXv_int8 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pcrservidorefetivoput__default(),
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
   private int AV31GXV1 ;
   private int AV9cid_id ;
   private int AV10end_id ;
   private int GXv_int1[] ;
   private int AV32GXV2 ;
   private int AV33GXV3 ;
   private int GXv_int9[] ;
   private int GXv_int8[] ;
   private String GXv_char2[] ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private java.util.Date GXv_date3[] ;
   private boolean returnInSub ;
   private boolean AV22DesvincularEndereco ;
   private String AV30se_matricula ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 ;
   private com.projetopratico.SdtSDTCRServidorEfetivoAtualiza AV24SDTCRServidorEfetivoAtualiza ;
   private com.projetopratico.SdtSDTCRServidorEfetivo[] aP3 ;
   private com.projetopratico.SdtSDTCRServidorEfetivo AV26RetornoSDTCRServidorEfetivo ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV11Messages ;
   private com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem AV25SDTCRServidorEfetivoAtualizaEndItem ;
   private IDataStoreProvider pr_default ;
   private com.projetopratico.SdtSDTCRServidorEfetivo AV27ExclusaoSDTCRServidorEfetivo ;
   private com.projetopratico.SdtSDTCRServidorEfetivo GXv_SdtSDTCRServidorEfetivo10[] ;
   private com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem AV28ExclusaoSDTCRServidorEfetivoItem ;
   private com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem AV29SDTCRServidorEfetivoAtualizaItem ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message7[] ;
}

final  class pcrservidorefetivoput__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

