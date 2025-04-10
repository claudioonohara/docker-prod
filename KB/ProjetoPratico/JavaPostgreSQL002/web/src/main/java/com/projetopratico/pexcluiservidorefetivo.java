package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexcluiservidorefetivo extends GXProcedure
{
   public pexcluiservidorefetivo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexcluiservidorefetivo.class ), "" );
   }

   public pexcluiservidorefetivo( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int[] aP0 ,
                                                                        String[] aP1 )
   {
      pexcluiservidorefetivo.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
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
      pexcluiservidorefetivo.this.AV9pes_id = aP0[0];
      this.aP0 = aP0;
      pexcluiservidorefetivo.this.AV14se_matricula = aP1[0];
      this.aP1 = aP1;
      pexcluiservidorefetivo.this.AV8Messages = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV8Messages.clear();
      AV13servidor_efetivo.Load(AV9pes_id, AV14se_matricula);
      AV13servidor_efetivo.Delete();
      if ( AV13servidor_efetivo.Fail() )
      {
         AV8Messages = AV13servidor_efetivo.GetMessages() ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexcluiservidorefetivo.this.AV9pes_id;
      this.aP1[0] = pexcluiservidorefetivo.this.AV14se_matricula;
      this.aP2[0] = pexcluiservidorefetivo.this.AV8Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13servidor_efetivo = new com.projetopratico.Sdtservidor_efetivo(remoteHandle);
      /* GeneXus formulas. */
   }

   private int AV9pes_id ;
   private String AV14se_matricula ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ;
   private int[] aP0 ;
   private String[] aP1 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV8Messages ;
   private com.projetopratico.Sdtservidor_efetivo AV13servidor_efetivo ;
}

