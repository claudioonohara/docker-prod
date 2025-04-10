package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptokenverify extends GXProcedure
{
   public ptokenverify( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptokenverify.class ), "" );
   }

   public ptokenverify( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( String aP0 )
   {
      ptokenverify.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
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
      ptokenverify.this.AV16token = aP0;
      ptokenverify.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      GXv_SdtJWTOptions1[0] = AV11JWTOptions;
      GXv_SdtPrivateClaims2[0] = AV15PrivateClaims;
      new com.projetopratico.ptokenparams(remoteHandle, context).execute( GXv_SdtJWTOptions1, GXv_SdtPrivateClaims2) ;
      AV11JWTOptions = GXv_SdtJWTOptions1[0];
      AV15PrivateClaims = GXv_SdtPrivateClaims2[0];
      AV17verification = AV10JWTCreator.doverify(AV16token, "HS256", AV15PrivateClaims, AV11JWTOptions) ;
      if ( AV10JWTCreator.haserror() )
      {
         AV12Message.setgxTv_SdtMessages_Message_Description( AV10JWTCreator.geterrordescription() );
         AV12Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
         AV13Messages.add(AV12Message, 0);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = ptokenverify.this.AV13Messages;
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
      AV11JWTOptions = new com.securityapi.genexusjwt.SdtJWTOptions(remoteHandle, context);
      GXv_SdtJWTOptions1 = new com.securityapi.genexusjwt.SdtJWTOptions[1] ;
      AV15PrivateClaims = new com.securityapi.genexusjwt.SdtPrivateClaims(remoteHandle, context);
      GXv_SdtPrivateClaims2 = new com.securityapi.genexusjwt.SdtPrivateClaims[1] ;
      AV10JWTCreator = new com.securityapi.genexusjwt.SdtJWTCreator(remoteHandle, context);
      AV12Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      /* GeneXus formulas. */
   }

   private boolean AV17verification ;
   private String AV16token ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV13Messages ;
   private com.securityapi.genexusjwt.SdtJWTOptions AV11JWTOptions ;
   private com.securityapi.genexusjwt.SdtJWTOptions GXv_SdtJWTOptions1[] ;
   private com.securityapi.genexusjwt.SdtPrivateClaims AV15PrivateClaims ;
   private com.securityapi.genexusjwt.SdtPrivateClaims GXv_SdtPrivateClaims2[] ;
   private com.securityapi.genexusjwt.SdtJWTCreator AV10JWTCreator ;
   private com.genexus.SdtMessages_Message AV12Message ;
}

