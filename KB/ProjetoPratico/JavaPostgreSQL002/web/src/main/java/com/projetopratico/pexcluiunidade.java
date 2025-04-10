package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexcluiunidade extends GXProcedure
{
   public pexcluiunidade( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexcluiunidade.class ), "" );
   }

   public pexcluiunidade( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int[] aP0 )
   {
      pexcluiunidade.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
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
      pexcluiunidade.this.AV11unid_id = aP0[0];
      this.aP0 = aP0;
      pexcluiunidade.this.AV10Messages = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV10Messages.clear();
      AV16unidade.Load(AV11unid_id);
      AV16unidade.Delete();
      if ( AV16unidade.Fail() )
      {
         AV10Messages = AV16unidade.GetMessages() ;
      }
      AV11unid_id = AV16unidade.getgxTv_Sdtunidade_Unid_id() ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexcluiunidade.this.AV11unid_id;
      this.aP1[0] = pexcluiunidade.this.AV10Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16unidade = new com.projetopratico.Sdtunidade(remoteHandle);
      /* GeneXus formulas. */
   }

   private int AV11unid_id ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 ;
   private int[] aP0 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV10Messages ;
   private com.projetopratico.Sdtunidade AV16unidade ;
}

