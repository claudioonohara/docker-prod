package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvalidtoken extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(com.projetopratico.GXcfg.class);
      pvalidtoken pgm = new pvalidtoken (-1);
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

   public pvalidtoken( )
   {
      super( -1 , new ModelContext( pvalidtoken.class ), "" );
      Application.init(com.projetopratico.GXcfg.class);
   }

   public pvalidtoken( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvalidtoken.class ), "" );
   }

   public pvalidtoken( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String aP0 ,
                              String[] aP1 )
   {
      boolean[] aP2 = new boolean[] {false};
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
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      new com.projetopratico.apvalidtoken(remoteHandle, context).execute( aP0, aP1, aP2 );
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      Application.cleanup(context, this, remoteHandle);
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      /* GeneXus formulas. */
   }

}

