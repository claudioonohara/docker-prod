package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/com.projetopratico.gx0030", "/com.projetopratico.gx0030"})
@jakarta.servlet.annotation.MultipartConfig
public final  class gx0030 extends GXWebPanelStub
{
   public gx0030( )
   {
   }

   public gx0030( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( gx0030.class ));
   }

   public gx0030( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new gx0030_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new gx0030_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selection List foto_pessoa";
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

