package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/com.projetopratico.gx0020", "/com.projetopratico.gx0020"})
@jakarta.servlet.annotation.MultipartConfig
public final  class gx0020 extends GXWebPanelStub
{
   public gx0020( )
   {
   }

   public gx0020( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( gx0020.class ));
   }

   public gx0020( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new gx0020_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new gx0020_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selection List unidade";
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

