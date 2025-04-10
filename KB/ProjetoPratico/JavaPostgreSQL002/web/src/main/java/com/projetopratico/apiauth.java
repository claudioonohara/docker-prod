package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class apiauth extends GXProcedure
{
   public apiauth( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apiauth.class ), "" );
   }

   public apiauth( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      cleanup();
   }

   public void e11072( )
   {
      /* Auth_Before Routine */
      returnInSub = false ;
      GXv_objcol_SdtMessages_Message1[0] = AV6Messages ;
      new com.projetopratico.pcors(remoteHandle, context).execute( GXv_objcol_SdtMessages_Message1) ;
      AV6Messages = GXv_objcol_SdtMessages_Message1[0] ;
      if ( AV6Messages.size() > 0 )
      {
         Gx_restcode = (short)(403) ;
         returnInSub = true;
         return;
      }
   }

   public void e12072( )
   {
      /* Refresh_Before Routine */
      returnInSub = false ;
      GXv_objcol_SdtMessages_Message1[0] = AV6Messages ;
      new com.projetopratico.pcors(remoteHandle, context).execute( GXv_objcol_SdtMessages_Message1) ;
      AV6Messages = GXv_objcol_SdtMessages_Message1[0] ;
      if ( AV6Messages.size() > 0 )
      {
         Gx_restcode = (short)(403) ;
         returnInSub = true;
         return;
      }
   }

   public void gxep_auth( String in_AV7username ,
                          String in_AV8password ,
                          String [] arr_AV9token ,
                          String [] arr_AV10refreshToken ,
                          GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV6Messages )
   {
      this.AV7username = in_AV7username;
      this.AV8password = in_AV8password;
      AV6Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV9token[0] = this.AV9token;
      arr_AV10refreshToken[0] = this.AV10refreshToken;
      arr_AV6Messages[0] = this.AV6Messages;
      e11072 ();
      if ( returnInSub )
      {
         arr_AV9token[0] = this.AV9token;
         arr_AV10refreshToken[0] = this.AV10refreshToken;
         arr_AV6Messages[0] = this.AV6Messages;
         return;
      }
      /* auth Constructor */
      GXv_char2[0] = AV9token ;
      GXv_char3[0] = AV10refreshToken ;
      GXv_objcol_SdtMessages_Message1[0] = AV6Messages ;
      new com.projetopratico.plogin(remoteHandle, context).execute( AV7username, AV8password, GXv_char2, GXv_char3, GXv_objcol_SdtMessages_Message1) ;
      this.AV9token = GXv_char2[0] ;
      this.AV10refreshToken = GXv_char3[0] ;
      AV6Messages = GXv_objcol_SdtMessages_Message1[0] ;
      arr_AV9token[0] = this.AV9token;
      arr_AV10refreshToken[0] = this.AV10refreshToken;
      arr_AV6Messages[0] = this.AV6Messages;
   }

   public void gxep_refresh( String in_AV10refreshToken ,
                             String [] arr_AV9token ,
                             GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV6Messages )
   {
      this.AV10refreshToken = in_AV10refreshToken;
      AV6Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV9token[0] = this.AV9token;
      arr_AV6Messages[0] = this.AV6Messages;
      e12072 ();
      if ( returnInSub )
      {
         arr_AV9token[0] = this.AV9token;
         arr_AV6Messages[0] = this.AV6Messages;
         return;
      }
      /* refresh Constructor */
      GXv_char3[0] = AV9token ;
      GXv_objcol_SdtMessages_Message1[0] = AV6Messages ;
      new com.projetopratico.prefreshtoken(remoteHandle, context).execute( AV10refreshToken, GXv_char3, GXv_objcol_SdtMessages_Message1) ;
      this.AV9token = GXv_char3[0] ;
      AV6Messages = GXv_objcol_SdtMessages_Message1[0] ;
      arr_AV9token[0] = this.AV9token;
      arr_AV6Messages[0] = this.AV6Messages;
   }

   public short getrestcode( )
   {
      return Gx_restcode ;
   }

   protected void cleanup( )
   {
      if ( initialized != 1 )
      {
      }
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV6Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV9token = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      /* GeneXus formulas. */
      initializeGenerics();
   }

   @SuppressWarnings("unchecked")
   private void initializeGenerics( )
   {
      GXv_objcol_SdtMessages_Message1 = new GXBaseCollection[1] ;
   }

   protected short Gx_restcode ;
   protected short initialized ;
   protected String GXv_char2[] ;
   protected String GXv_char3[] ;
   protected boolean returnInSub ;
   protected String AV9token ;
   protected String AV10refreshToken ;
   protected String AV7username ;
   protected String AV8password ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> AV6Messages ;
   protected String[] arr_AV9token ;
   protected String[] arr_AV10refreshToken ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message>[] arr_AV6Messages ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message1[] ;
}

