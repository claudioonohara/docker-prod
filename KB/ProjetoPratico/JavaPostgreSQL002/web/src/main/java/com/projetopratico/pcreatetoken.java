package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcreatetoken extends GXProcedure
{
   public pcreatetoken( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcreatetoken.class ), "" );
   }

   public pcreatetoken( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( long aP0 ,
                             String aP1 ,
                             String aP2 )
   {
      pcreatetoken.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( long aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( long aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 )
   {
      pcreatetoken.this.AV14TokenSecondsDuration = aP0;
      pcreatetoken.this.AV15sub = aP1;
      pcreatetoken.this.AV16PERFIL = aP2;
      pcreatetoken.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      GXv_SdtJWTOptions1[0] = AV9JWTOptions;
      GXv_SdtPrivateClaims2[0] = AV10PrivateClaims;
      new com.projetopratico.ptokenparams(remoteHandle, context).execute( GXv_SdtJWTOptions1, GXv_SdtPrivateClaims2) ;
      AV9JWTOptions = GXv_SdtJWTOptions1[0];
      AV10PrivateClaims = GXv_SdtPrivateClaims2[0];
      AV12TokenExpiresInDateTime = GXutil.DateTimeToUTC(GXutil.dtadd( GXutil.now( ), AV14TokenSecondsDuration)) ;
      GXv_char3[0] = AV13TokenExpiresInDateTimeFormatted ;
      new com.projetopratico.pfomatadatatoken(remoteHandle, context).execute( AV12TokenExpiresInDateTime, GXv_char3) ;
      pcreatetoken.this.AV13TokenExpiresInDateTimeFormatted = GXv_char3[0] ;
      AV9JWTOptions.addcustomtimevalidationclaim("exp", AV13TokenExpiresInDateTimeFormatted, "0");
      AV9JWTOptions.addregisteredclaim("sub", AV15sub);
      AV10PrivateClaims.setclaim("PERFIL", AV16PERFIL);
      AV11token = AV8JWTCreator.docreate("HS256", AV10PrivateClaims, AV9JWTOptions) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = pcreatetoken.this.AV11token;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11token = "" ;
      AV9JWTOptions = new com.securityapi.genexusjwt.SdtJWTOptions(remoteHandle, context);
      GXv_SdtJWTOptions1 = new com.securityapi.genexusjwt.SdtJWTOptions[1] ;
      AV10PrivateClaims = new com.securityapi.genexusjwt.SdtPrivateClaims(remoteHandle, context);
      GXv_SdtPrivateClaims2 = new com.securityapi.genexusjwt.SdtPrivateClaims[1] ;
      AV12TokenExpiresInDateTime = GXutil.resetTime( GXutil.nullDate() );
      AV13TokenExpiresInDateTimeFormatted = "" ;
      GXv_char3 = new String[1] ;
      AV8JWTCreator = new com.securityapi.genexusjwt.SdtJWTCreator(remoteHandle, context);
      /* GeneXus formulas. */
   }

   private long AV14TokenSecondsDuration ;
   private String AV16PERFIL ;
   private String GXv_char3[] ;
   private java.util.Date AV12TokenExpiresInDateTime ;
   private String AV11token ;
   private String AV15sub ;
   private String AV13TokenExpiresInDateTimeFormatted ;
   private String[] aP3 ;
   private com.securityapi.genexusjwt.SdtJWTOptions AV9JWTOptions ;
   private com.securityapi.genexusjwt.SdtJWTOptions GXv_SdtJWTOptions1[] ;
   private com.securityapi.genexusjwt.SdtPrivateClaims AV10PrivateClaims ;
   private com.securityapi.genexusjwt.SdtPrivateClaims GXv_SdtPrivateClaims2[] ;
   private com.securityapi.genexusjwt.SdtJWTCreator AV8JWTCreator ;
}

