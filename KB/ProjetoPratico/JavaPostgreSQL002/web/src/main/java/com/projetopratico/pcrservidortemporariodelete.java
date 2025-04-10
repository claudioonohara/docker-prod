package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcrservidortemporariodelete extends GXProcedure
{
   public pcrservidortemporariodelete( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcrservidortemporariodelete.class ), "" );
   }

   public pcrservidortemporariodelete( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int aP0 ,
                                                                        java.util.Date aP1 ,
                                                                        java.util.Date aP2 )
   {
      pcrservidortemporariodelete.this.aP3 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( int aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( int aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 )
   {
      pcrservidortemporariodelete.this.AV39pes_id = aP0;
      pcrservidortemporariodelete.this.AV40st_data_admissao = aP1;
      pcrservidortemporariodelete.this.AV38st_data_demissao = aP2;
      pcrservidortemporariodelete.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV9Messages.clear();
      GXv_int1[0] = AV39pes_id ;
      GXv_date2[0] = AV40st_data_admissao ;
      GXv_date3[0] = AV38st_data_demissao ;
      GXv_boolean4[0] = AV41existe_servidor_temporario ;
      new com.projetopratico.pbuscaservidortemporario(remoteHandle, context).execute( GXv_int1, GXv_date2, GXv_date3, GXv_boolean4) ;
      pcrservidortemporariodelete.this.AV39pes_id = GXv_int1[0] ;
      pcrservidortemporariodelete.this.AV40st_data_admissao = GXv_date2[0] ;
      pcrservidortemporariodelete.this.AV38st_data_demissao = GXv_date3[0] ;
      pcrservidortemporariodelete.this.AV41existe_servidor_temporario = GXv_boolean4[0] ;
      if ( ! AV41existe_servidor_temporario )
      {
         AV23Message.setgxTv_SdtMessages_Message_Description( "Servidor Tempoario nao encontrado" );
         AV9Messages.add(AV23Message, 0);
      }
      /* Execute user subroutine: 'TERMINACOMERRO' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXv_SdtSDTCRServidorTemporario5[0] = AV42ExclusaoSDTCRServidorTemporario;
      GXv_objcol_SdtMessages_Message6[0] = AV9Messages ;
      new com.projetopratico.pbuscacrservidortemporario(remoteHandle, context).execute( AV39pes_id, AV40st_data_admissao, AV38st_data_demissao, GXv_SdtSDTCRServidorTemporario5, GXv_objcol_SdtMessages_Message6) ;
      AV42ExclusaoSDTCRServidorTemporario = GXv_SdtSDTCRServidorTemporario5[0];
      AV9Messages = GXv_objcol_SdtMessages_Message6[0] ;
      AV44GXV1 = 1 ;
      while ( AV44GXV1 <= AV42ExclusaoSDTCRServidorTemporario.getgxTv_SdtSDTCRServidorTemporario_Endereco().size() )
      {
         AV43ExclusaoSDTCRServidorTemporarioItem = (com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem)((com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem)AV42ExclusaoSDTCRServidorTemporario.getgxTv_SdtSDTCRServidorTemporario_Endereco().elementAt(-1+AV44GXV1));
         GXv_int1[0] = AV43ExclusaoSDTCRServidorTemporarioItem.getgxTv_SdtSDTCRServidorTemporario_enderecoItem_End_id() ;
         GXv_int7[0] = AV39pes_id ;
         GXv_objcol_SdtMessages_Message6[0] = new GXBaseCollection<com.genexus.SdtMessages_Message>() ;
         new com.projetopratico.pdesvinculapessoaendereco(remoteHandle, context).execute( GXv_int1, GXv_int7, GXv_objcol_SdtMessages_Message6) ;
         AV43ExclusaoSDTCRServidorTemporarioItem.setgxTv_SdtSDTCRServidorTemporario_enderecoItem_End_id( GXv_int1[0] );
         pcrservidortemporariodelete.this.AV39pes_id = GXv_int7[0] ;
         /* Execute user subroutine: 'TERMINACOMERRO' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV44GXV1 = (int)(AV44GXV1+1) ;
      }
      GXv_int7[0] = AV39pes_id ;
      GXv_date3[0] = AV40st_data_admissao ;
      GXv_date2[0] = AV38st_data_demissao ;
      GXv_objcol_SdtMessages_Message6[0] = AV9Messages ;
      new com.projetopratico.pexcluiservidortemporario(remoteHandle, context).execute( GXv_int7, GXv_date3, GXv_date2, GXv_objcol_SdtMessages_Message6) ;
      pcrservidortemporariodelete.this.AV39pes_id = GXv_int7[0] ;
      pcrservidortemporariodelete.this.AV40st_data_admissao = GXv_date3[0] ;
      pcrservidortemporariodelete.this.AV38st_data_demissao = GXv_date2[0] ;
      AV9Messages = GXv_objcol_SdtMessages_Message6[0] ;
      /* Execute user subroutine: 'TERMINACOMERRO' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      Application.commitDataStores(context, remoteHandle, pr_default, "pcrservidortemporariodelete");
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

   protected void cleanup( )
   {
      this.aP3[0] = pcrservidortemporariodelete.this.AV9Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_boolean4 = new boolean[1] ;
      AV23Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV42ExclusaoSDTCRServidorTemporario = new com.projetopratico.SdtSDTCRServidorTemporario(remoteHandle, context);
      GXv_SdtSDTCRServidorTemporario5 = new com.projetopratico.SdtSDTCRServidorTemporario[1] ;
      AV43ExclusaoSDTCRServidorTemporarioItem = new com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem(remoteHandle, context);
      GXv_int1 = new int[1] ;
      GXv_int7 = new int[1] ;
      GXv_date3 = new java.util.Date[1] ;
      GXv_date2 = new java.util.Date[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pcrservidortemporariodelete__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
      initializeGenerics();
   }

   @SuppressWarnings("unchecked")
   private void initializeGenerics( )
   {
      GXv_objcol_SdtMessages_Message6 = new GXBaseCollection[1] ;
   }

   private int AV39pes_id ;
   private int AV44GXV1 ;
   private int GXv_int1[] ;
   private int GXv_int7[] ;
   private java.util.Date AV40st_data_admissao ;
   private java.util.Date AV38st_data_demissao ;
   private java.util.Date GXv_date3[] ;
   private java.util.Date GXv_date2[] ;
   private boolean AV41existe_servidor_temporario ;
   private boolean GXv_boolean4[] ;
   private boolean returnInSub ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV9Messages ;
   private com.genexus.SdtMessages_Message AV23Message ;
   private com.projetopratico.SdtSDTCRServidorTemporario AV42ExclusaoSDTCRServidorTemporario ;
   private com.projetopratico.SdtSDTCRServidorTemporario GXv_SdtSDTCRServidorTemporario5[] ;
   private com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem AV43ExclusaoSDTCRServidorTemporarioItem ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message6[] ;
   private IDataStoreProvider pr_default ;
}

final  class pcrservidortemporariodelete__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

