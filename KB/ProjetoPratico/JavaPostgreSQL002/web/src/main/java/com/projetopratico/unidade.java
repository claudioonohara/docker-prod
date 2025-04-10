package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/com.projetopratico.unidade", "/com.projetopratico.unidade"})
@jakarta.servlet.annotation.MultipartConfig
public final  class unidade extends GXWebPanelStub
{
   public unidade( )
   {
   }

   public unidade( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( unidade.class ));
   }

   public unidade( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new unidade_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new unidade_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "unidade";
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

