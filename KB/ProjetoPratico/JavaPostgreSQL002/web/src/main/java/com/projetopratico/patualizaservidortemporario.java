package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class patualizaservidortemporario extends GXProcedure
{
   public patualizaservidortemporario( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( patualizaservidortemporario.class ), "" );
   }

   public patualizaservidortemporario( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int[] aP0 ,
                                                                        java.util.Date[] aP1 ,
                                                                        java.util.Date[] aP2 ,
                                                                        java.util.Date[] aP3 ,
                                                                        java.util.Date[] aP4 )
   {
      patualizaservidortemporario.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( int[] aP0 ,
                        java.util.Date[] aP1 ,
                        java.util.Date[] aP2 ,
                        java.util.Date[] aP3 ,
                        java.util.Date[] aP4 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( int[] aP0 ,
                             java.util.Date[] aP1 ,
                             java.util.Date[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.util.Date[] aP4 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP5 )
   {
      patualizaservidortemporario.this.AV11pes_id = aP0[0];
      this.aP0 = aP0;
      patualizaservidortemporario.this.AV13st_data_admissao = aP1[0];
      this.aP1 = aP1;
      patualizaservidortemporario.this.AV14st_data_demissao = aP2[0];
      this.aP2 = aP2;
      patualizaservidortemporario.this.AV16atualizar_st_data_admissao = aP3[0];
      this.aP3 = aP3;
      patualizaservidortemporario.this.AV15atualizar_st_data_demissao = aP4[0];
      this.aP4 = aP4;
      patualizaservidortemporario.this.AV10Messages = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV10Messages.clear();
      GXv_int1[0] = AV11pes_id ;
      GXv_date2[0] = AV13st_data_admissao ;
      GXv_date3[0] = AV14st_data_demissao ;
      GXv_boolean4[0] = AV8existe_servidor_temporario ;
      new com.projetopratico.pbuscaservidortemporario(remoteHandle, context).execute( GXv_int1, GXv_date2, GXv_date3, GXv_boolean4) ;
      patualizaservidortemporario.this.AV11pes_id = GXv_int1[0] ;
      patualizaservidortemporario.this.AV13st_data_admissao = GXv_date2[0] ;
      patualizaservidortemporario.this.AV14st_data_demissao = GXv_date3[0] ;
      patualizaservidortemporario.this.AV8existe_servidor_temporario = GXv_boolean4[0] ;
      if ( ! AV8existe_servidor_temporario )
      {
         AV9Message.setgxTv_SdtMessages_Message_Description( "Servidor Tempoario nao encontrado" );
         AV10Messages.add(AV9Message, 0);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      else
      {
         GXv_int1[0] = AV11pes_id ;
         GXv_date3[0] = AV13st_data_admissao ;
         GXv_date2[0] = AV14st_data_demissao ;
         GXv_objcol_SdtMessages_Message5[0] = AV10Messages ;
         new com.projetopratico.pexcluiservidortemporario(remoteHandle, context).execute( GXv_int1, GXv_date3, GXv_date2, GXv_objcol_SdtMessages_Message5) ;
         patualizaservidortemporario.this.AV11pes_id = GXv_int1[0] ;
         patualizaservidortemporario.this.AV13st_data_admissao = GXv_date3[0] ;
         patualizaservidortemporario.this.AV14st_data_demissao = GXv_date2[0] ;
         AV10Messages = GXv_objcol_SdtMessages_Message5[0] ;
         if ( AV10Messages.size() == 0 )
         {
            AV12servidor_temporario = (com.projetopratico.Sdtservidor_temporario)new com.projetopratico.Sdtservidor_temporario( remoteHandle, context);
            AV12servidor_temporario.setgxTv_Sdtservidor_temporario_Pes_id( AV11pes_id );
            AV12servidor_temporario.setgxTv_Sdtservidor_temporario_St_data_admissao( AV16atualizar_st_data_admissao );
            AV12servidor_temporario.setgxTv_Sdtservidor_temporario_St_data_demissao( AV15atualizar_st_data_demissao );
            AV12servidor_temporario.Save();
            if ( AV12servidor_temporario.Fail() )
            {
               Application.rollbackDataStores(context, remoteHandle, pr_default, "patualizaservidortemporario");
               AV10Messages = AV12servidor_temporario.GetMessages() ;
            }
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = patualizaservidortemporario.this.AV11pes_id;
      this.aP1[0] = patualizaservidortemporario.this.AV13st_data_admissao;
      this.aP2[0] = patualizaservidortemporario.this.AV14st_data_demissao;
      this.aP3[0] = patualizaservidortemporario.this.AV16atualizar_st_data_admissao;
      this.aP4[0] = patualizaservidortemporario.this.AV15atualizar_st_data_demissao;
      this.aP5[0] = patualizaservidortemporario.this.AV10Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_boolean4 = new boolean[1] ;
      AV9Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      GXv_int1 = new int[1] ;
      GXv_date3 = new java.util.Date[1] ;
      GXv_date2 = new java.util.Date[1] ;
      AV12servidor_temporario = new com.projetopratico.Sdtservidor_temporario(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.patualizaservidortemporario__default(),
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

   private int AV11pes_id ;
   private int GXv_int1[] ;
   private java.util.Date AV13st_data_admissao ;
   private java.util.Date AV14st_data_demissao ;
   private java.util.Date AV16atualizar_st_data_admissao ;
   private java.util.Date AV15atualizar_st_data_demissao ;
   private java.util.Date GXv_date3[] ;
   private java.util.Date GXv_date2[] ;
   private boolean AV8existe_servidor_temporario ;
   private boolean GXv_boolean4[] ;
   private boolean returnInSub ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP5 ;
   private int[] aP0 ;
   private java.util.Date[] aP1 ;
   private java.util.Date[] aP2 ;
   private java.util.Date[] aP3 ;
   private java.util.Date[] aP4 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV10Messages ;
   private com.genexus.SdtMessages_Message AV9Message ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message5[] ;
   private com.projetopratico.Sdtservidor_temporario AV12servidor_temporario ;
   private IDataStoreProvider pr_default ;
}

final  class patualizaservidortemporario__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

