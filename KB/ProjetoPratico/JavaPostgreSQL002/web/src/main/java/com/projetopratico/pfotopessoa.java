package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/com.projetopratico.pfotopessoa", "/com.projetopratico.pfotopessoa"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pfotopessoa extends GXWebObjectStub
{
   public pfotopessoa( )
   {
   }

   public pfotopessoa( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pfotopessoa.class ));
   }

   public pfotopessoa( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pfotopessoa_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pfotopessoa_impl(context).cleanup();
   }

   public void execute( int aP0 ,
                        String[] aP1 )
   {
      new pfotopessoa_impl(remoteHandle, context).execute_int(aP0, aP1);
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( int aP0 )
   {
      String[] aP1 = new String[] {""};
      execute(aP0, aP1);
      return aP1[0];
   }

   public String getServletInfo( )
   {
      return "PFoto Pessoa";
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

