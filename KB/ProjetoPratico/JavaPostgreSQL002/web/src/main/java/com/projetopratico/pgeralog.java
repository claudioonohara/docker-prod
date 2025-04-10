package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgeralog extends GXProcedure
{
   public pgeralog( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgeralog.class ), "" );
   }

   public pgeralog( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( )
   {
      pgeralog.this.aP0 = new String[] {""};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( String[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String[] aP0 )
   {
      pgeralog.this.AV9TextToAppend = aP0[0];
      this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV8File.setSource( "C:\\log\\log.txt" );
      AV9TextToAppend += GXutil.newLine( ) ;
      AV8File.appendAllText(localUtil.ttoc( GXutil.now( ), 10, 8, 1, 1, "/", ":", " ")+" "+AV9TextToAppend, "");
      AV8File.close();
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pgeralog.this.AV9TextToAppend;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8File = new com.genexus.util.GXFile();
      /* GeneXus formulas. */
   }

   private String AV9TextToAppend ;
   private com.genexus.util.GXFile AV8File ;
   private String[] aP0 ;
}

