package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/com.projetopratico.gx0070", "/com.projetopratico.gx0070"})
@jakarta.servlet.annotation.MultipartConfig
public final  class gx0070 extends GXWebPanelStub
{
   public gx0070( )
   {
   }

   public gx0070( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( gx0070.class ));
   }

   public gx0070( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new gx0070_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new gx0070_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selection List lotacao";
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

