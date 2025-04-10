package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcrlotacaodelete extends GXProcedure
{
   public pcrlotacaodelete( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcrlotacaodelete.class ), "" );
   }

   public pcrlotacaodelete( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int aP0 )
   {
      pcrlotacaodelete.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( int aP0 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( int aP0 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      pcrlotacaodelete.this.AV38lot_id = aP0;
      pcrlotacaodelete.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV9Messages.clear();
      GXv_SdtSDTLotacao1[0] = AV39SDTLotacao;
      GXv_objcol_SdtMessages_Message2[0] = AV9Messages ;
      new com.projetopratico.plotacaoget(remoteHandle, context).execute( AV38lot_id, GXv_SdtSDTLotacao1, GXv_objcol_SdtMessages_Message2) ;
      AV39SDTLotacao = GXv_SdtSDTLotacao1[0];
      AV9Messages = GXv_objcol_SdtMessages_Message2[0] ;
      /* Execute user subroutine: 'TERMINACOMERRO' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXv_int3[0] = AV38lot_id ;
      GXv_objcol_SdtMessages_Message2[0] = AV9Messages ;
      new com.projetopratico.pexcluilotacao(remoteHandle, context).execute( GXv_int3, GXv_objcol_SdtMessages_Message2) ;
      pcrlotacaodelete.this.AV38lot_id = GXv_int3[0] ;
      AV9Messages = GXv_objcol_SdtMessages_Message2[0] ;
      /* Execute user subroutine: 'TERMINACOMERRO' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      Application.commitDataStores(context, remoteHandle, pr_default, "pcrlotacaodelete");
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
      this.aP1[0] = pcrlotacaodelete.this.AV9Messages;
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
      AV39SDTLotacao = new com.projetopratico.SdtSDTLotacao(remoteHandle, context);
      GXv_SdtSDTLotacao1 = new com.projetopratico.SdtSDTLotacao[1] ;
      GXv_int3 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pcrlotacaodelete__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
      initializeGenerics();
   }

   @SuppressWarnings("unchecked")
   private void initializeGenerics( )
   {
      GXv_objcol_SdtMessages_Message2 = new GXBaseCollection[1] ;
   }

   private int AV38lot_id ;
   private int GXv_int3[] ;
   private boolean returnInSub ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV9Messages ;
   private com.projetopratico.SdtSDTLotacao AV39SDTLotacao ;
   private com.projetopratico.SdtSDTLotacao GXv_SdtSDTLotacao1[] ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message2[] ;
   private IDataStoreProvider pr_default ;
}

final  class pcrlotacaodelete__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

