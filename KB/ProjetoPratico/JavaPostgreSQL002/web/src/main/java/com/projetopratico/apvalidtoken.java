package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apvalidtoken extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(com.projetopratico.GXcfg.class);
      apvalidtoken pgm = new apvalidtoken (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String aP0 = "";
      String[] aP1 = new String[] {""};
      boolean[] aP2 = new boolean[] {false};

      try
      {
         aP0 = (String) args[0];
         aP1[0] = (String) args[1];
         aP2[0] = (boolean) GXutil.boolval( args[2]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2);
   }

   public apvalidtoken( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apvalidtoken.class ), "" );
   }

   public apvalidtoken( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String aP0 ,
                              String[] aP1 )
   {
      apvalidtoken.this.aP2 = new boolean[] {false};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 ,
                        boolean[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 ,
                             boolean[] aP2 )
   {
      apvalidtoken.this.AV10token = aP0;
      apvalidtoken.this.aP1 = aP1;
      apvalidtoken.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV9valid = true ;
      GXv_objcol_SdtMessages_Message1[0] = AV8Messages ;
      new com.projetopratico.ptokenautenticado(remoteHandle, context).execute( AV10token, GXv_objcol_SdtMessages_Message1) ;
      AV8Messages = GXv_objcol_SdtMessages_Message1[0] ;
      GXv_char2[0] = AV14Pgmname + " chamou -------" ;
      new com.projetopratico.pgeralog(remoteHandle, context).execute( GXv_char2) ;
      if ( AV8Messages.size() > 0 )
      {
         AV9valid = false ;
         AV15GXV1 = 1 ;
         while ( AV15GXV1 <= AV8Messages.size() )
         {
            AV12Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV8Messages.elementAt(-1+AV15GXV1));
            if ( GXutil.contains( AV12Message.getgxTv_SdtMessages_Message_Description(), "expired") )
            {
               AV13errorMessage += "The Token has expired" ;
            }
            else
            {
               AV13errorMessage += AV12Message.getgxTv_SdtMessages_Message_Description() ;
            }
            AV15GXV1 = (int)(AV15GXV1+1) ;
         }
      }
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pvalidtoken.class);
      return new com.projetopratico.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP1[0] = apvalidtoken.this.AV13errorMessage;
      this.aP2[0] = apvalidtoken.this.AV9valid;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13errorMessage = "" ;
      AV8Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_char2 = new String[1] ;
      AV14Pgmname = "" ;
      AV12Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV14Pgmname = "APValidToken" ;
      /* GeneXus formulas. */
      AV14Pgmname = "APValidToken" ;
      initializeGenerics();
   }

   @SuppressWarnings("unchecked")
   private void initializeGenerics( )
   {
      GXv_objcol_SdtMessages_Message1 = new GXBaseCollection[1] ;
   }

   private int AV15GXV1 ;
   private String GXv_char2[] ;
   private String AV14Pgmname ;
   private boolean AV9valid ;
   private String AV10token ;
   private String AV13errorMessage ;
   private boolean[] aP2 ;
   private String[] aP1 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV8Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message1[] ;
   private com.genexus.SdtMessages_Message AV12Message ;
}

