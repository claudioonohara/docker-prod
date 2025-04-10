package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/com.projetopratico.pwebfoto", "/com.projetopratico.pwebfoto"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pwebfoto extends GXWebObjectStub
{
   public pwebfoto( )
   {
   }

   public pwebfoto( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pwebfoto.class ));
   }

   public pwebfoto( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pwebfoto_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pwebfoto_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PWeb Foto";
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

