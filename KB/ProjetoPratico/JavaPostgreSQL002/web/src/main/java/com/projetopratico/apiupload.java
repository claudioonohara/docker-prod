package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class apiupload extends GXProcedure
{
   public apiupload( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apiupload.class ), "" );
   }

   public apiupload( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      cleanup();
   }

   public void gxep_uploadfoto( )
   {
      initialize();
      initialized = (short)(1) ;
      /* uploadFoto Constructor */
      new com.projetopratico.pstorageprovider(remoteHandle, context).execute( ) ;
   }

   protected void cleanup( )
   {
      if ( initialized != 1 )
      {
      }
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      /* GeneXus formulas. */
   }

   protected short initialized ;
}

