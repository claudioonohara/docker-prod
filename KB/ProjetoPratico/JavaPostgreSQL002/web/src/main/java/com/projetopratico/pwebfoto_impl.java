package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pwebfoto_impl extends GXWebProcedure
{
   public pwebfoto_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetFirstPar( "pes_id") ;
      if ( ! entryPointCalled )
      {
         AV8pes_id = (int)(GXutil.lval( gxfirstwebparm)) ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV11Blob = httpContext.GetPar( "Blob") ;
            AV10FileSavedName = httpContext.GetPar( "FileSavedName") ;
         }
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      GXv_char1[0] = AV12Pgmname + " &pes_id --->" + GXutil.str( AV8pes_id, 8, 0) ;
      new com.projetopratico.pgeralog(remoteHandle, context).execute( GXv_char1) ;
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      AV11Blob = "" ;
      AV10FileSavedName = "" ;
      GXv_char1 = new String[1] ;
      AV12Pgmname = "" ;
      AV12Pgmname = "PWebFoto" ;
      /* GeneXus formulas. */
      AV12Pgmname = "PWebFoto" ;
   }

   private short gxcookieaux ;
   private int AV8pes_id ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String GXv_char1[] ;
   private String AV12Pgmname ;
   private boolean entryPointCalled ;
   private String AV10FileSavedName ;
   private String AV11Blob ;
}

