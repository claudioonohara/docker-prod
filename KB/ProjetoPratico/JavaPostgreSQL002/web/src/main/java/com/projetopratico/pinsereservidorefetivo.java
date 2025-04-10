package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinsereservidorefetivo extends GXProcedure
{
   public pinsereservidorefetivo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinsereservidorefetivo.class ), "" );
   }

   public pinsereservidorefetivo( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int[] aP0 ,
                                                                        String[] aP1 )
   {
      pinsereservidorefetivo.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( int[] aP0 ,
                        String[] aP1 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( int[] aP0 ,
                             String[] aP1 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      pinsereservidorefetivo.this.AV11pes_id = aP0[0];
      this.aP0 = aP0;
      pinsereservidorefetivo.this.AV12se_matricula = aP1[0];
      this.aP1 = aP1;
      pinsereservidorefetivo.this.AV10Messages = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV10Messages.clear();
      GXv_int1[0] = AV11pes_id ;
      GXv_char2[0] = AV12se_matricula ;
      GXv_boolean3[0] = AV8existe_servidor_efetivo ;
      new com.projetopratico.pbuscaservidorefetivo(remoteHandle, context).execute( GXv_int1, GXv_char2, GXv_boolean3) ;
      pinsereservidorefetivo.this.AV11pes_id = GXv_int1[0] ;
      pinsereservidorefetivo.this.AV12se_matricula = GXv_char2[0] ;
      pinsereservidorefetivo.this.AV8existe_servidor_efetivo = GXv_boolean3[0] ;
      if ( AV8existe_servidor_efetivo )
      {
         AV9Message.setgxTv_SdtMessages_Message_Description( "Ja existe servidor efetivo com matricula informada" );
         AV10Messages.add(AV9Message, 0);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      else
      {
         AV13servidor_efetivo = (com.projetopratico.Sdtservidor_efetivo)new com.projetopratico.Sdtservidor_efetivo( remoteHandle, context);
         AV13servidor_efetivo.setgxTv_Sdtservidor_efetivo_Pes_id( AV11pes_id );
         AV13servidor_efetivo.setgxTv_Sdtservidor_efetivo_Se_matricula( AV12se_matricula );
         AV13servidor_efetivo.Save();
         if ( AV13servidor_efetivo.Fail() )
         {
            Application.rollbackDataStores(context, remoteHandle, pr_default, "pinsereservidorefetivo");
            AV10Messages = AV13servidor_efetivo.GetMessages() ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinsereservidorefetivo.this.AV11pes_id;
      this.aP1[0] = pinsereservidorefetivo.this.AV12se_matricula;
      this.aP2[0] = pinsereservidorefetivo.this.AV10Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_boolean3 = new boolean[1] ;
      AV9Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV13servidor_efetivo = new com.projetopratico.Sdtservidor_efetivo(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pinsereservidorefetivo__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
   }

   private int AV11pes_id ;
   private int GXv_int1[] ;
   private String GXv_char2[] ;
   private boolean AV8existe_servidor_efetivo ;
   private boolean GXv_boolean3[] ;
   private boolean returnInSub ;
   private String AV12se_matricula ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ;
   private int[] aP0 ;
   private String[] aP1 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV10Messages ;
   private com.genexus.SdtMessages_Message AV9Message ;
   private com.projetopratico.Sdtservidor_efetivo AV13servidor_efetivo ;
   private IDataStoreProvider pr_default ;
}

final  class pinsereservidorefetivo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

