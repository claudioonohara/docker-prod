package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plogin extends GXProcedure
{
   public plogin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plogin.class ), "" );
   }

   public plogin( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( String aP0 ,
                                                                        String aP1 ,
                                                                        String[] aP2 ,
                                                                        String[] aP3 )
   {
      plogin.this.aP4 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 )
   {
      plogin.this.AV8username = aP0;
      plogin.this.AV9password = aP1;
      plogin.this.aP2 = aP2;
      plogin.this.aP3 = aP3;
      plogin.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      if ( ( ( GXutil.strcmp(AV8username, "admin") == 0 ) && ( GXutil.strcmp(AV9password, "123") == 0 ) ) || ( ( GXutil.strcmp(AV8username, "guest") == 0 ) && ( GXutil.strcmp(AV9password, "321") == 0 ) ) )
      {
         AV26tokenDuration = 300 ;
         if ( GXutil.strcmp(AV8username, "admin") == 0 )
         {
            AV27PERFIL = "A" ;
         }
         else if ( GXutil.strcmp(AV8username, "guest") == 0 )
         {
            AV27PERFIL = "G" ;
         }
         GXv_char1[0] = AV10token ;
         new com.projetopratico.pcreatetoken(remoteHandle, context).execute( 300, "token", AV27PERFIL, GXv_char1) ;
         plogin.this.AV10token = GXv_char1[0] ;
         GXv_char1[0] = AV25refreshToken ;
         new com.projetopratico.pcreatetoken(remoteHandle, context).execute( 7200, "refresh", AV27PERFIL, GXv_char1) ;
         plogin.this.AV25refreshToken = GXv_char1[0] ;
      }
      else
      {
         AV17Message.setgxTv_SdtMessages_Message_Description( "Usuario ou senha invalidos" );
         AV18Messages.add(AV17Message, 0);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = plogin.this.AV10token;
      this.aP3[0] = plogin.this.AV25refreshToken;
      this.aP4[0] = plogin.this.AV18Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10token = "" ;
      AV25refreshToken = "" ;
      AV18Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV27PERFIL = "" ;
      GXv_char1 = new String[1] ;
      AV17Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      /* GeneXus formulas. */
   }

   private long AV26tokenDuration ;
   private String AV27PERFIL ;
   private String GXv_char1[] ;
   private String AV10token ;
   private String AV25refreshToken ;
   private String AV8username ;
   private String AV9password ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV18Messages ;
   private com.genexus.SdtMessages_Message AV17Message ;
}

