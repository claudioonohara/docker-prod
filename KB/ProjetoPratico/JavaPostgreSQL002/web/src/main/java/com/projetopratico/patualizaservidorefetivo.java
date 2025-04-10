package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class patualizaservidorefetivo extends GXProcedure
{
   public patualizaservidorefetivo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( patualizaservidorefetivo.class ), "" );
   }

   public patualizaservidorefetivo( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int[] aP0 ,
                                                                        String[] aP1 ,
                                                                        String[] aP2 )
   {
      patualizaservidorefetivo.this.aP3 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
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
      patualizaservidorefetivo.this.AV11pes_id = aP0[0];
      this.aP0 = aP0;
      patualizaservidorefetivo.this.AV18se_matricula = aP1[0];
      this.aP1 = aP1;
      patualizaservidorefetivo.this.AV20atualizar_se_matricula = aP2[0];
      this.aP2 = aP2;
      patualizaservidorefetivo.this.AV10Messages = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV10Messages.clear();
      GXv_int1[0] = AV11pes_id ;
      GXv_char2[0] = AV18se_matricula ;
      GXv_boolean3[0] = AV17existe_servidor_efetivo ;
      new com.projetopratico.pbuscaservidorefetivo(remoteHandle, context).execute( GXv_int1, GXv_char2, GXv_boolean3) ;
      patualizaservidorefetivo.this.AV11pes_id = GXv_int1[0] ;
      patualizaservidorefetivo.this.AV18se_matricula = GXv_char2[0] ;
      patualizaservidorefetivo.this.AV17existe_servidor_efetivo = GXv_boolean3[0] ;
      if ( ! AV17existe_servidor_efetivo )
      {
         AV9Message.setgxTv_SdtMessages_Message_Description( "Servidor Efetivo nao encontrado" );
         AV10Messages.add(AV9Message, 0);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      else
      {
         GXv_int1[0] = AV11pes_id ;
         GXv_char2[0] = AV18se_matricula ;
         GXv_objcol_SdtMessages_Message4[0] = AV10Messages ;
         new com.projetopratico.pexcluiservidorefetivo(remoteHandle, context).execute( GXv_int1, GXv_char2, GXv_objcol_SdtMessages_Message4) ;
         patualizaservidorefetivo.this.AV11pes_id = GXv_int1[0] ;
         patualizaservidorefetivo.this.AV18se_matricula = GXv_char2[0] ;
         AV10Messages = GXv_objcol_SdtMessages_Message4[0] ;
         if ( AV10Messages.size() == 0 )
         {
            AV19servidor_efetivo = (com.projetopratico.Sdtservidor_efetivo)new com.projetopratico.Sdtservidor_efetivo( remoteHandle, context);
            AV19servidor_efetivo.setgxTv_Sdtservidor_efetivo_Pes_id( AV11pes_id );
            AV19servidor_efetivo.setgxTv_Sdtservidor_efetivo_Se_matricula( AV20atualizar_se_matricula );
            AV19servidor_efetivo.Save();
            if ( AV19servidor_efetivo.Fail() )
            {
               Application.rollbackDataStores(context, remoteHandle, pr_default, "patualizaservidorefetivo");
               AV10Messages = AV19servidor_efetivo.GetMessages() ;
            }
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = patualizaservidorefetivo.this.AV11pes_id;
      this.aP1[0] = patualizaservidorefetivo.this.AV18se_matricula;
      this.aP2[0] = patualizaservidorefetivo.this.AV20atualizar_se_matricula;
      this.aP3[0] = patualizaservidorefetivo.this.AV10Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_boolean3 = new boolean[1] ;
      AV9Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      GXv_int1 = new int[1] ;
      GXv_char2 = new String[1] ;
      AV19servidor_efetivo = new com.projetopratico.Sdtservidor_efetivo(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.patualizaservidorefetivo__default(),
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

   private int AV11pes_id ;
   private int GXv_int1[] ;
   private String GXv_char2[] ;
   private boolean AV17existe_servidor_efetivo ;
   private boolean GXv_boolean3[] ;
   private boolean returnInSub ;
   private String AV18se_matricula ;
   private String AV20atualizar_se_matricula ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 ;
   private int[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV10Messages ;
   private com.genexus.SdtMessages_Message AV9Message ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message4[] ;
   private com.projetopratico.Sdtservidor_efetivo AV19servidor_efetivo ;
   private IDataStoreProvider pr_default ;
}

final  class patualizaservidorefetivo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

