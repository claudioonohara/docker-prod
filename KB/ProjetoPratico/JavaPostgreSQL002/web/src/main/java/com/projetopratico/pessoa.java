package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/com.projetopratico.pessoa", "/com.projetopratico.pessoa"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pessoa extends GXWebPanelStub
{
   public pessoa( )
   {
   }

   public pessoa( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pessoa.class ));
   }

   public pessoa( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pessoa_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pessoa_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "pessoa";
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

