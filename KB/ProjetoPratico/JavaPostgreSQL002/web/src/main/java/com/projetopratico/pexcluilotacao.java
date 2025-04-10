package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexcluilotacao extends GXProcedure
{
   public pexcluilotacao( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexcluilotacao.class ), "" );
   }

   public pexcluilotacao( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int[] aP0 )
   {
      pexcluilotacao.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( int[] aP0 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( int[] aP0 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      pexcluilotacao.this.AV17lot_id = aP0[0];
      this.aP0 = aP0;
      pexcluilotacao.this.AV10Messages = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV10Messages.clear();
      AV18lotacao.Load(AV17lot_id);
      AV18lotacao.Delete();
      if ( AV18lotacao.Fail() )
      {
         AV10Messages = AV18lotacao.GetMessages() ;
         Application.rollbackDataStores(context, remoteHandle, pr_default, "pexcluilotacao");
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexcluilotacao.this.AV17lot_id;
      this.aP1[0] = pexcluilotacao.this.AV10Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18lotacao = new com.projetopratico.Sdtlotacao(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pexcluilotacao__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
   }

   private int AV17lot_id ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 ;
   private int[] aP0 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV10Messages ;
   private com.projetopratico.Sdtlotacao AV18lotacao ;
   private IDataStoreProvider pr_default ;
}

final  class pexcluilotacao__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

