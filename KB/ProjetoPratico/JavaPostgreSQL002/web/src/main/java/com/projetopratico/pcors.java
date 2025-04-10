package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcors extends GXProcedure
{
   public pcors( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcors.class ), "" );
   }

   public pcors( int remoteHandle ,
                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( )
   {
      pcors.this.aP0 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( GXBaseCollection<com.genexus.SdtMessages_Message>[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( GXBaseCollection<com.genexus.SdtMessages_Message>[] aP0 )
   {
      pcors.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV8url_permitida = "" ;
      if ( new com.genexuscore.genexus.common.configuration.SdtConfigurationManager(remoteHandle, context).hasvalue("CORS_ALLOW_ORIGIN") )
      {
         AV8url_permitida = new com.genexuscore.genexus.common.configuration.SdtConfigurationManager(remoteHandle, context).getvalue("CORS_ALLOW_ORIGIN") ;
      }
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info(AV13Pgmname+" &OriginHeader --->"+AV9OriginHeader) ;
      httpContext.GX_msglist.addItem(AV8url_permitida);
      AV9OriginHeader = AV10HttpRequest.getHeader("Origin") ;
      if ( ! (GXutil.strcmp("", AV8url_permitida)==0) )
      {
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info(AV13Pgmname+" &OriginHeader --->"+AV9OriginHeader) ;
         httpContext.GX_msglist.addItem(AV9OriginHeader);
         if ( GXutil.strcmp(GXutil.upper( GXutil.trim( AV8url_permitida)), GXutil.upper( GXutil.trim( AV9OriginHeader))) != 0 )
         {
            AV11Message.setgxTv_SdtMessages_Message_Description( "403 Forbidden" );
            AV12Messages.add(AV11Message, 0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcors.this.AV12Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV8url_permitida = "" ;
      AV13Pgmname = "" ;
      AV9OriginHeader = "" ;
      AV10HttpRequest = httpContext.getHttpRequest();
      AV11Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV13Pgmname = "PCors" ;
      /* GeneXus formulas. */
      AV13Pgmname = "PCors" ;
   }

   private String AV13Pgmname ;
   private boolean returnInSub ;
   private String AV8url_permitida ;
   private String AV9OriginHeader ;
   private com.genexus.internet.HttpRequest AV10HttpRequest ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP0 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV12Messages ;
   private com.genexus.SdtMessages_Message AV11Message ;
}

