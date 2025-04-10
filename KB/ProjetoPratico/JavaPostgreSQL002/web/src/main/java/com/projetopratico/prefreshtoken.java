package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prefreshtoken extends GXProcedure
{
   public prefreshtoken( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prefreshtoken.class ), "" );
   }

   public prefreshtoken( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( String aP0 ,
                                                                        String[] aP1 )
   {
      prefreshtoken.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      prefreshtoken.this.AV25refreshToken = aP0;
      prefreshtoken.this.aP1 = aP1;
      prefreshtoken.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV15payload = AV11JWTCreator.getpayload(AV25refreshToken) ;
      if ( ! GXutil.contains( AV15payload, "refresh") )
      {
         AV13Message.setgxTv_SdtMessages_Message_Description( "Token invalido" );
         AV8Messages.add(AV13Message, 0);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXv_objcol_SdtMessages_Message1[0] = AV8Messages ;
      new com.projetopratico.ptokenverify(remoteHandle, context).execute( AV25refreshToken, GXv_objcol_SdtMessages_Message1) ;
      AV8Messages = GXv_objcol_SdtMessages_Message1[0] ;
      if ( AV8Messages.size() > 0 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      else
      {
         GXv_char2[0] = AV26perfilChar ;
         new com.projetopratico.pextraiperfil(remoteHandle, context).execute( AV15payload, GXv_char2) ;
         prefreshtoken.this.AV26perfilChar = GXv_char2[0] ;
         if ( GXutil.strcmp(AV26perfilChar, "A") == 0 )
         {
            GXv_char2[0] = AV19token ;
            new com.projetopratico.pcreatetoken(remoteHandle, context).execute( 300, "token", "A", GXv_char2) ;
            prefreshtoken.this.AV19token = GXv_char2[0] ;
         }
         else if ( GXutil.strcmp(AV26perfilChar, "G") == 0 )
         {
            GXv_char2[0] = AV19token ;
            new com.projetopratico.pcreatetoken(remoteHandle, context).execute( 300, "token", "G", GXv_char2) ;
            prefreshtoken.this.AV19token = GXv_char2[0] ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = prefreshtoken.this.AV19token;
      this.aP2[0] = prefreshtoken.this.AV8Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV19token = "" ;
      AV8Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV15payload = "" ;
      AV11JWTCreator = new com.securityapi.genexusjwt.SdtJWTCreator(remoteHandle, context);
      AV13Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV26perfilChar = "" ;
      GXv_char2 = new String[1] ;
      /* GeneXus formulas. */
      initializeGenerics();
   }

   @SuppressWarnings("unchecked")
   private void initializeGenerics( )
   {
      GXv_objcol_SdtMessages_Message1 = new GXBaseCollection[1] ;
   }

   private String AV26perfilChar ;
   private String GXv_char2[] ;
   private boolean returnInSub ;
   private String AV25refreshToken ;
   private String AV19token ;
   private String AV15payload ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ;
   private String[] aP1 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV8Messages ;
   private com.securityapi.genexusjwt.SdtJWTCreator AV11JWTCreator ;
   private com.genexus.SdtMessages_Message AV13Message ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message1[] ;
}

