package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdesvinculapessoaendereco extends GXProcedure
{
   public pdesvinculapessoaendereco( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdesvinculapessoaendereco.class ), "" );
   }

   public pdesvinculapessoaendereco( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int[] aP0 ,
                                                                        int[] aP1 )
   {
      pdesvinculapessoaendereco.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
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
      pdesvinculapessoaendereco.this.AV10end_id = aP0[0];
      this.aP0 = aP0;
      pdesvinculapessoaendereco.this.AV14pes_id = aP1[0];
      this.aP1 = aP1;
      pdesvinculapessoaendereco.this.AV11Messages = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV11Messages.clear();
      if ( ! (0==AV10end_id) && ! (0==AV14pes_id) )
      {
         GXv_int1[0] = AV14pes_id ;
         GXv_int2[0] = AV10end_id ;
         GXv_boolean3[0] = AV15endereco_pessoa_vinculado ;
         new com.projetopratico.pbuscapessoaendereco(remoteHandle, context).execute( GXv_int1, GXv_int2, GXv_boolean3) ;
         pdesvinculapessoaendereco.this.AV14pes_id = GXv_int1[0] ;
         pdesvinculapessoaendereco.this.AV10end_id = GXv_int2[0] ;
         pdesvinculapessoaendereco.this.AV15endereco_pessoa_vinculado = GXv_boolean3[0] ;
         if ( AV15endereco_pessoa_vinculado )
         {
            AV16pessoa_endereco.Load(AV14pes_id, AV10end_id);
            AV16pessoa_endereco.Delete();
            if ( AV16pessoa_endereco.Fail() )
            {
               AV11Messages = AV16pessoa_endereco.GetMessages() ;
               Application.rollbackDataStores(context, remoteHandle, pr_default, "pdesvinculapessoaendereco");
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
      this.aP0[0] = pdesvinculapessoaendereco.this.AV10end_id;
      this.aP1[0] = pdesvinculapessoaendereco.this.AV14pes_id;
      this.aP2[0] = pdesvinculapessoaendereco.this.AV11Messages;
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
      AV16pessoa_endereco = new com.projetopratico.Sdtpessoa_endereco(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pdesvinculapessoaendereco__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
   }

   private int AV10end_id ;
   private int AV14pes_id ;
   private int GXv_int1[] ;
   private int GXv_int2[] ;
   private boolean AV15endereco_pessoa_vinculado ;
   private boolean GXv_boolean3[] ;
   private boolean returnInSub ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ;
   private int[] aP0 ;
   private int[] aP1 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV11Messages ;
   private com.projetopratico.Sdtpessoa_endereco AV16pessoa_endereco ;
   private IDataStoreProvider pr_default ;
}

final  class pdesvinculapessoaendereco__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

