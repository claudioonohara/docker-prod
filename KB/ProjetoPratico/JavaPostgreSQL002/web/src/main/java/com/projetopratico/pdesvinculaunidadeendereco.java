package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdesvinculaunidadeendereco extends GXProcedure
{
   public pdesvinculaunidadeendereco( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdesvinculaunidadeendereco.class ), "" );
   }

   public pdesvinculaunidadeendereco( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int[] aP0 ,
                                                                        int[] aP1 )
   {
      pdesvinculaunidadeendereco.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( int[] aP0 ,
                        int[] aP1 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( int[] aP0 ,
                             int[] aP1 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      pdesvinculaunidadeendereco.this.AV10end_id = aP0[0];
      this.aP0 = aP0;
      pdesvinculaunidadeendereco.this.AV8unid_id = aP1[0];
      this.aP1 = aP1;
      pdesvinculaunidadeendereco.this.AV11Messages = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV11Messages.clear();
      if ( ! (0==AV10end_id) && ! (0==AV8unid_id) )
      {
         GXv_int1[0] = AV8unid_id ;
         GXv_int2[0] = AV10end_id ;
         GXv_boolean3[0] = AV14existe_unidade_endereco ;
         new com.projetopratico.pbuscaunidadeendereco(remoteHandle, context).execute( GXv_int1, GXv_int2, GXv_boolean3) ;
         pdesvinculaunidadeendereco.this.AV8unid_id = GXv_int1[0] ;
         pdesvinculaunidadeendereco.this.AV10end_id = GXv_int2[0] ;
         pdesvinculaunidadeendereco.this.AV14existe_unidade_endereco = GXv_boolean3[0] ;
         if ( AV14existe_unidade_endereco )
         {
            AV12unidade_endereco.Load(AV13encontrado_unid_id, AV9encontrado_end_id);
            AV12unidade_endereco.Delete();
            if ( AV12unidade_endereco.Fail() )
            {
               AV11Messages = AV12unidade_endereco.GetMessages() ;
               Application.rollbackDataStores(context, remoteHandle, pr_default, "pdesvinculaunidadeendereco");
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdesvinculaunidadeendereco.this.AV10end_id;
      this.aP1[0] = pdesvinculaunidadeendereco.this.AV8unid_id;
      this.aP2[0] = pdesvinculaunidadeendereco.this.AV11Messages;
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
      GXv_int2 = new int[1] ;
      GXv_boolean3 = new boolean[1] ;
      AV12unidade_endereco = new com.projetopratico.Sdtunidade_endereco(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pdesvinculaunidadeendereco__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
   }

   private int AV10end_id ;
   private int AV8unid_id ;
   private int GXv_int1[] ;
   private int GXv_int2[] ;
   private int AV13encontrado_unid_id ;
   private int AV9encontrado_end_id ;
   private boolean AV14existe_unidade_endereco ;
   private boolean GXv_boolean3[] ;
   private boolean returnInSub ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ;
   private int[] aP0 ;
   private int[] aP1 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV11Messages ;
   private com.projetopratico.Sdtunidade_endereco AV12unidade_endereco ;
   private IDataStoreProvider pr_default ;
}

final  class pdesvinculaunidadeendereco__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

