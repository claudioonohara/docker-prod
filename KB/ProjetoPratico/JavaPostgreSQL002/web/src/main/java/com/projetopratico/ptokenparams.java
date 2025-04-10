package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptokenparams extends GXProcedure
{
   public ptokenparams( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptokenparams.class ), "" );
   }

   public ptokenparams( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public com.securityapi.genexusjwt.SdtPrivateClaims executeUdp( com.securityapi.genexusjwt.SdtJWTOptions[] aP0 )
   {
      ptokenparams.this.aP1 = new com.securityapi.genexusjwt.SdtPrivateClaims[] {new com.securityapi.genexusjwt.SdtPrivateClaims()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( com.securityapi.genexusjwt.SdtJWTOptions[] aP0 ,
                        com.securityapi.genexusjwt.SdtPrivateClaims[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( com.securityapi.genexusjwt.SdtJWTOptions[] aP0 ,
                             com.securityapi.genexusjwt.SdtPrivateClaims[] aP1 )
   {
      ptokenparams.this.aP0 = aP0;
      ptokenparams.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV24symmetricKey = "000cd13a76a1a23db3d0458acc09f7b94069a77d05ae5dfc13594cb8016653b2" ;
      AV19JWTOptions.setsecret(AV24symmetricKey);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptokenparams.this.AV19JWTOptions;
      this.aP1[0] = ptokenparams.this.AV23PrivateClaims;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV19JWTOptions = new com.securityapi.genexusjwt.SdtJWTOptions(remoteHandle, context);
      AV23PrivateClaims = new com.securityapi.genexusjwt.SdtPrivateClaims(remoteHandle, context);
      AV24symmetricKey = "" ;
      /* GeneXus formulas. */
   }

   private String AV24symmetricKey ;
   private com.securityapi.genexusjwt.SdtPrivateClaims[] aP1 ;
   private com.securityapi.genexusjwt.SdtJWTOptions[] aP0 ;
   private com.securityapi.genexusjwt.SdtJWTOptions AV19JWTOptions ;
   private com.securityapi.genexusjwt.SdtPrivateClaims AV23PrivateClaims ;
}

