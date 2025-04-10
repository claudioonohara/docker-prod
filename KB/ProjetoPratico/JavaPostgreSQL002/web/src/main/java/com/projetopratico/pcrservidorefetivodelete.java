package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcrservidorefetivodelete extends GXProcedure
{
   public pcrservidorefetivodelete( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcrservidorefetivodelete.class ), "" );
   }

   public pcrservidorefetivodelete( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int aP0 ,
                                                                        String aP1 )
   {
      pcrservidorefetivodelete.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( int aP0 ,
                        String aP1 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( int aP0 ,
                             String aP1 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      pcrservidorefetivodelete.this.AV13pes_id = aP0;
      pcrservidorefetivodelete.this.AV17se_matricula = aP1;
      pcrservidorefetivodelete.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV12Messages.clear();
      GXv_int1[0] = AV13pes_id ;
      GXv_char2[0] = AV17se_matricula ;
      GXv_boolean3[0] = AV16existe_servidor_efetivo ;
      new com.projetopratico.pbuscaservidorefetivo(remoteHandle, context).execute( GXv_int1, GXv_char2, GXv_boolean3) ;
      pcrservidorefetivodelete.this.AV13pes_id = GXv_int1[0] ;
      pcrservidorefetivodelete.this.AV17se_matricula = GXv_char2[0] ;
      pcrservidorefetivodelete.this.AV16existe_servidor_efetivo = GXv_boolean3[0] ;
      if ( ! AV16existe_servidor_efetivo )
      {
         AV11Message.setgxTv_SdtMessages_Message_Description( "Servidor Efetivo nao encontrado" );
         AV12Messages.add(AV11Message, 0);
      }
      /* Execute user subroutine: 'TERMINACOMERRO' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXv_SdtSDTCRServidorEfetivo4[0] = AV18ExclusaoSDTCRServidorefetivo;
      GXv_objcol_SdtMessages_Message5[0] = AV12Messages ;
      new com.projetopratico.pbuscacrservidorefetivo(remoteHandle, context).execute( AV13pes_id, AV17se_matricula, GXv_SdtSDTCRServidorEfetivo4, GXv_objcol_SdtMessages_Message5) ;
      AV18ExclusaoSDTCRServidorefetivo = GXv_SdtSDTCRServidorEfetivo4[0];
      AV12Messages = GXv_objcol_SdtMessages_Message5[0] ;
      AV20GXV1 = 1 ;
      while ( AV20GXV1 <= AV18ExclusaoSDTCRServidorefetivo.getgxTv_SdtSDTCRServidorEfetivo_Endereco().size() )
      {
         AV19ExclusaoSDTCRServidorefetivoItem = (com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem)((com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem)AV18ExclusaoSDTCRServidorefetivo.getgxTv_SdtSDTCRServidorEfetivo_Endereco().elementAt(-1+AV20GXV1));
         GXv_int1[0] = AV19ExclusaoSDTCRServidorefetivoItem.getgxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_id() ;
         GXv_int6[0] = AV13pes_id ;
         GXv_objcol_SdtMessages_Message5[0] = new GXBaseCollection<com.genexus.SdtMessages_Message>() ;
         new com.projetopratico.pdesvinculapessoaendereco(remoteHandle, context).execute( GXv_int1, GXv_int6, GXv_objcol_SdtMessages_Message5) ;
         AV19ExclusaoSDTCRServidorefetivoItem.setgxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_id( GXv_int1[0] );
         pcrservidorefetivodelete.this.AV13pes_id = GXv_int6[0] ;
         /* Execute user subroutine: 'TERMINACOMERRO' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV20GXV1 = (int)(AV20GXV1+1) ;
      }
      GXv_int6[0] = AV13pes_id ;
      GXv_char2[0] = AV17se_matricula ;
      GXv_objcol_SdtMessages_Message5[0] = AV12Messages ;
      new com.projetopratico.pexcluiservidorefetivo(remoteHandle, context).execute( GXv_int6, GXv_char2, GXv_objcol_SdtMessages_Message5) ;
      pcrservidorefetivodelete.this.AV13pes_id = GXv_int6[0] ;
      pcrservidorefetivodelete.this.AV17se_matricula = GXv_char2[0] ;
      AV12Messages = GXv_objcol_SdtMessages_Message5[0] ;
      /* Execute user subroutine: 'TERMINACOMERRO' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      Application.commitDataStores(context, remoteHandle, pr_default, "pcrservidorefetivodelete");
      cleanup();
   }

   public void S111( )
   {
      /* 'TERMINACOMERRO' Routine */
      returnInSub = false ;
      if ( AV12Messages.size() > 0 )
      {
         returnInSub = true;
         if (true) return;
      }
   }

   protected void cleanup( )
   {
      this.aP2[0] = pcrservidorefetivodelete.this.AV12Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_boolean3 = new boolean[1] ;
      AV11Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV18ExclusaoSDTCRServidorefetivo = new com.projetopratico.SdtSDTCRServidorEfetivo(remoteHandle, context);
      GXv_SdtSDTCRServidorEfetivo4 = new com.projetopratico.SdtSDTCRServidorEfetivo[1] ;
      AV19ExclusaoSDTCRServidorefetivoItem = new com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem(remoteHandle, context);
      GXv_int1 = new int[1] ;
      GXv_int6 = new int[1] ;
      GXv_char2 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pcrservidorefetivodelete__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
      initializeGenerics();
   }

   @SuppressWarnings("unchecked")
   private void initializeGenerics( )
   {
      GXv_objcol_SdtMessages_Message5 = new GXBaseCollection[1] ;
   }

   private int AV13pes_id ;
   private int AV20GXV1 ;
   private int GXv_int1[] ;
   private int GXv_int6[] ;
   private String GXv_char2[] ;
   private boolean AV16existe_servidor_efetivo ;
   private boolean GXv_boolean3[] ;
   private boolean returnInSub ;
   private String AV17se_matricula ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV12Messages ;
   private com.genexus.SdtMessages_Message AV11Message ;
   private com.projetopratico.SdtSDTCRServidorEfetivo AV18ExclusaoSDTCRServidorefetivo ;
   private com.projetopratico.SdtSDTCRServidorEfetivo GXv_SdtSDTCRServidorEfetivo4[] ;
   private com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem AV19ExclusaoSDTCRServidorefetivoItem ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message5[] ;
   private IDataStoreProvider pr_default ;
}

final  class pcrservidorefetivodelete__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

