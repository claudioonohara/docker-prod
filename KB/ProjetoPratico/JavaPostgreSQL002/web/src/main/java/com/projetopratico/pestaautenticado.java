package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pestaautenticado extends GXProcedure
{
   public pestaautenticado( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pestaautenticado.class ), "" );
   }

   public pestaautenticado( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( )
   {
      pestaautenticado.this.aP0 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( GXBaseCollection<com.genexus.SdtMessages_Message>[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( GXBaseCollection<com.genexus.SdtMessages_Message>[] aP0 )
   {
      pestaautenticado.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV8Messages.clear();
      AV35AuthorizationHeader = AV36HttpRequest.getHeader("Authorization") ;
      AV48HttpMethod = AV36HttpRequest.getMethod() ;
      if ( GXutil.strcmp(GXutil.substring( AV35AuthorizationHeader, 1, 7), "Bearer ") == 0 )
      {
         AV9token = GXutil.substring( AV35AuthorizationHeader, 8, GXutil.len( AV35AuthorizationHeader)-7) ;
      }
      else
      {
         AV23Message.setgxTv_SdtMessages_Message_Description( "Nao autorizado" );
         AV8Messages.add(AV23Message, 0);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV25payload = AV10JWTCreator.getpayload(AV9token) ;
      AV41payloadElements = new GXSimpleCollection<String>(String.class, "internal", "", GxRegex.Split(AV25payload,",")) ;
      AV49GXV1 = 1 ;
      while ( AV49GXV1 <= AV41payloadElements.size() )
      {
         AV42elementPayLoad = (String)AV41payloadElements.elementAt(-1+AV49GXV1) ;
         AV44posicaoPerfil = (byte)(GXutil.strSearch( AV42elementPayLoad, "PERFIL", 1)) ;
         if ( AV44posicaoPerfil > 0 )
         {
            AV45perfilChar = GXutil.substring( AV42elementPayLoad, GXutil.len( AV42elementPayLoad)-1, 1) ;
            if ( GXutil.strcmp(AV45perfilChar, "G") == 0 )
            {
               if ( GXutil.strcmp(AV48HttpMethod, "GET") != 0 )
               {
                  AV23Message.setgxTv_SdtMessages_Message_Description( "Nao autorizado" );
                  AV8Messages.add(AV23Message, 0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
         }
         AV49GXV1 = (int)(AV49GXV1+1) ;
      }
      if ( ! GXutil.contains( AV25payload, "token") )
      {
         AV23Message.setgxTv_SdtMessages_Message_Description( "Token invalido" );
         AV8Messages.add(AV23Message, 0);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXv_objcol_SdtMessages_Message1[0] = AV8Messages ;
      new com.projetopratico.ptokenverify(remoteHandle, context).execute( AV9token, GXv_objcol_SdtMessages_Message1) ;
      AV8Messages = GXv_objcol_SdtMessages_Message1[0] ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pestaautenticado.this.AV8Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV35AuthorizationHeader = "" ;
      AV36HttpRequest = httpContext.getHttpRequest();
      AV48HttpMethod = "" ;
      AV9token = "" ;
      AV23Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV25payload = "" ;
      AV10JWTCreator = new com.securityapi.genexusjwt.SdtJWTCreator(remoteHandle, context);
      AV41payloadElements = new GXSimpleCollection<String>(String.class, "internal", "");
      AV42elementPayLoad = "" ;
      AV45perfilChar = "" ;
      /* GeneXus formulas. */
      initializeGenerics();
   }

   @SuppressWarnings("unchecked")
   private void initializeGenerics( )
   {
      GXv_objcol_SdtMessages_Message1 = new GXBaseCollection[1] ;
   }

   private byte AV44posicaoPerfil ;
   private int AV49GXV1 ;
   private String AV48HttpMethod ;
   private String AV45perfilChar ;
   private boolean returnInSub ;
   private String AV25payload ;
   private String AV35AuthorizationHeader ;
   private String AV9token ;
   private String AV42elementPayLoad ;
   private com.genexus.internet.HttpRequest AV36HttpRequest ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP0 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV8Messages ;
   private com.genexus.SdtMessages_Message AV23Message ;
   private com.securityapi.genexusjwt.SdtJWTCreator AV10JWTCreator ;
   private GXSimpleCollection<String> AV41payloadElements ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message1[] ;
}

