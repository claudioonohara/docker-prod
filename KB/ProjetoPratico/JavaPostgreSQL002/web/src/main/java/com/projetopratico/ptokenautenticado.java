package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptokenautenticado extends GXProcedure
{
   public ptokenautenticado( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptokenautenticado.class ), "" );
   }

   public ptokenautenticado( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( String aP0 )
   {
      ptokenautenticado.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      ptokenautenticado.this.AV21tokenRecebido = aP0;
      ptokenautenticado.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      if ( GXutil.strcmp(GXutil.substring( AV21tokenRecebido, 1, 7), "Bearer ") == 0 )
      {
         AV16token = GXutil.substring( AV21tokenRecebido, 8, GXutil.len( AV8AuthorizationHeader)-7) ;
      }
      else
      {
         AV12Message.setgxTv_SdtMessages_Message_Description( "Nao autorizado" );
         AV13Messages.add(AV12Message, 0);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14payload = AV10JWTCreator.getpayload(AV16token) ;
      GXv_char1[0] = AV22Pgmname + " &payload --->" + AV14payload ;
      new com.projetopratico.pgeralog(remoteHandle, context).execute( GXv_char1) ;
      if ( ! GXutil.contains( AV14payload, "token") )
      {
         AV12Message.setgxTv_SdtMessages_Message_Description( "Token invalido" );
         AV13Messages.add(AV12Message, 0);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXv_objcol_SdtMessages_Message2[0] = AV13Messages ;
      new com.projetopratico.ptokenverify(remoteHandle, context).execute( AV16token, GXv_objcol_SdtMessages_Message2) ;
      AV13Messages = GXv_objcol_SdtMessages_Message2[0] ;
      GXv_char1[0] = AV22Pgmname + " validou token --->" + AV13Messages.toxml(false, true, "Messages", "GeneXus") ;
      new com.projetopratico.pgeralog(remoteHandle, context).execute( GXv_char1) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = ptokenautenticado.this.AV13Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV16token = "" ;
      AV8AuthorizationHeader = "" ;
      AV12Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV14payload = "" ;
      AV10JWTCreator = new com.securityapi.genexusjwt.SdtJWTCreator(remoteHandle, context);
      AV22Pgmname = "" ;
      GXv_char1 = new String[1] ;
      AV22Pgmname = "PTokenAutenticado" ;
      /* GeneXus formulas. */
      AV22Pgmname = "PTokenAutenticado" ;
      initializeGenerics();
   }

   @SuppressWarnings("unchecked")
   private void initializeGenerics( )
   {
      GXv_objcol_SdtMessages_Message2 = new GXBaseCollection[1] ;
   }

   private String AV22Pgmname ;
   private String GXv_char1[] ;
   private boolean returnInSub ;
   private String AV14payload ;
   private String AV21tokenRecebido ;
   private String AV16token ;
   private String AV8AuthorizationHeader ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV13Messages ;
   private com.genexus.SdtMessages_Message AV12Message ;
   private com.securityapi.genexusjwt.SdtJWTCreator AV10JWTCreator ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message2[] ;
}

