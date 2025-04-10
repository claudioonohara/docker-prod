package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/com.projetopratico.gx00a0", "/com.projetopratico.gx00a0"})
@jakarta.servlet.annotation.MultipartConfig
public final  class gx00a0 extends GXWebPanelStub
{
   public gx00a0( )
   {
   }

   public gx00a0( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( gx00a0.class ));
   }

   public gx00a0( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new gx00a0_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new gx00a0_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selection List servidor_temporario";
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

}

