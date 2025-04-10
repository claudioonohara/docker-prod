package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class storageapisample extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(com.projetopratico.GXcfg.class);
      storageapisample pgm = new storageapisample (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public storageapisample( )
   {
      super( -1 , new ModelContext( storageapisample.class ), "" );
      Application.init(com.projetopratico.GXcfg.class);
   }

   public storageapisample( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( storageapisample.class ), "" );
   }

   public storageapisample( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      new com.projetopratico.astorageapisample(remoteHandle, context).execute(  );
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(storageapisample.class);
      return new com.projetopratico.GXcfg();
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

