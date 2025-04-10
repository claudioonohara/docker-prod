package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcrunidadedelete extends GXProcedure
{
   public pcrunidadedelete( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcrunidadedelete.class ), "" );
   }

   public pcrunidadedelete( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int aP0 )
   {
      pcrunidadedelete.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
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
      pcrunidadedelete.this.AV29unid_id = aP0;
      pcrunidadedelete.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV9Messages.clear();
      GXv_SdtSDTUnidade1[0] = AV37SDTUnidade;
      GXv_objcol_SdtMessages_Message2[0] = AV9Messages ;
      new com.projetopratico.punidadeget(remoteHandle, context).execute( AV29unid_id, GXv_SdtSDTUnidade1, GXv_objcol_SdtMessages_Message2) ;
      AV37SDTUnidade = GXv_SdtSDTUnidade1[0];
      AV9Messages = GXv_objcol_SdtMessages_Message2[0] ;
      /* Execute user subroutine: 'TERMINACOMERRO' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXv_SdtSDTCRUnidade3[0] = AV30ExclusaoSDTCRUnidade;
      GXv_objcol_SdtMessages_Message2[0] = new GXBaseCollection<com.genexus.SdtMessages_Message>() ;
      new com.projetopratico.pbuscacrunidade(remoteHandle, context).execute( AV29unid_id, GXv_SdtSDTCRUnidade3, GXv_objcol_SdtMessages_Message2) ;
      AV30ExclusaoSDTCRUnidade = GXv_SdtSDTCRUnidade3[0];
      AV38GXV1 = 1 ;
      while ( AV38GXV1 <= AV30ExclusaoSDTCRUnidade.getgxTv_SdtSDTCRUnidade_Endereco().size() )
      {
         AV31ExclusaoSDTCRUnidadeItem = (com.projetopratico.SdtSDTCRUnidade_enderecoItem)((com.projetopratico.SdtSDTCRUnidade_enderecoItem)AV30ExclusaoSDTCRUnidade.getgxTv_SdtSDTCRUnidade_Endereco().elementAt(-1+AV38GXV1));
         GXv_int4[0] = AV31ExclusaoSDTCRUnidadeItem.getgxTv_SdtSDTCRUnidade_enderecoItem_End_id() ;
         GXv_int5[0] = AV29unid_id ;
         GXv_objcol_SdtMessages_Message2[0] = new GXBaseCollection<com.genexus.SdtMessages_Message>() ;
         new com.projetopratico.pdesvinculaunidadeendereco(remoteHandle, context).execute( GXv_int4, GXv_int5, GXv_objcol_SdtMessages_Message2) ;
         AV31ExclusaoSDTCRUnidadeItem.setgxTv_SdtSDTCRUnidade_enderecoItem_End_id( GXv_int4[0] );
         pcrunidadedelete.this.AV29unid_id = GXv_int5[0] ;
         /* Execute user subroutine: 'TERMINACOMERRO' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV38GXV1 = (int)(AV38GXV1+1) ;
      }
      GXv_int5[0] = AV29unid_id ;
      GXv_objcol_SdtMessages_Message2[0] = AV9Messages ;
      new com.projetopratico.pexcluiunidade(remoteHandle, context).execute( GXv_int5, GXv_objcol_SdtMessages_Message2) ;
      pcrunidadedelete.this.AV29unid_id = GXv_int5[0] ;
      AV9Messages = GXv_objcol_SdtMessages_Message2[0] ;
      /* Execute user subroutine: 'TERMINACOMERRO' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      Application.commitDataStores(context, remoteHandle, pr_default, "pcrunidadedelete");
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
      this.aP1[0] = pcrunidadedelete.this.AV9Messages;
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
      AV37SDTUnidade = new com.projetopratico.SdtSDTUnidade(remoteHandle, context);
      GXv_SdtSDTUnidade1 = new com.projetopratico.SdtSDTUnidade[1] ;
      AV30ExclusaoSDTCRUnidade = new com.projetopratico.SdtSDTCRUnidade(remoteHandle, context);
      GXv_SdtSDTCRUnidade3 = new com.projetopratico.SdtSDTCRUnidade[1] ;
      AV31ExclusaoSDTCRUnidadeItem = new com.projetopratico.SdtSDTCRUnidade_enderecoItem(remoteHandle, context);
      GXv_int4 = new int[1] ;
      GXv_int5 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pcrunidadedelete__default(),
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

   private int AV29unid_id ;
   private int AV38GXV1 ;
   private int GXv_int4[] ;
   private int GXv_int5[] ;
   private boolean returnInSub ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV9Messages ;
   private com.projetopratico.SdtSDTUnidade AV37SDTUnidade ;
   private com.projetopratico.SdtSDTUnidade GXv_SdtSDTUnidade1[] ;
   private com.projetopratico.SdtSDTCRUnidade AV30ExclusaoSDTCRUnidade ;
   private com.projetopratico.SdtSDTCRUnidade GXv_SdtSDTCRUnidade3[] ;
   private com.projetopratico.SdtSDTCRUnidade_enderecoItem AV31ExclusaoSDTCRUnidadeItem ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message2[] ;
   private IDataStoreProvider pr_default ;
}

final  class pcrunidadedelete__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

