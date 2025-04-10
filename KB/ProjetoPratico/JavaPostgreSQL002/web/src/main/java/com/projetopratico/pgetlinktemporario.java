package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgetlinktemporario extends GXProcedure
{
   public pgetlinktemporario( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgetlinktemporario.class ), "" );
   }

   public pgetlinktemporario( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 )
   {
      pgetlinktemporario.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 )
   {
      pgetlinktemporario.this.AV8ImageUri = aP0;
      pgetlinktemporario.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV11bucketPath = GXutil.substring( AV8ImageUri, GXutil.strSearch( AV8ImageUri, "Content", 1), GXutil.len( AV8ImageUri)) ;
      AV12StorageProvider.getPrivate(AV11bucketPath, AV13File, (short)(5), new GXBaseCollection<com.genexus.SdtMessages_Message>());
      AV9GeradoImageUri = AV13File.getURI() ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pgetlinktemporario.this.AV9GeradoImageUri;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9GeradoImageUri = "" ;
      AV11bucketPath = "" ;
      AV12StorageProvider = new com.genexus.util.GXStorageProvider();
      AV13File = new com.genexus.util.GXFile();
      /* GeneXus formulas. */
   }

   private String AV8ImageUri ;
   private String AV9GeradoImageUri ;
   private String AV11bucketPath ;
   private com.genexus.util.GXStorageProvider AV12StorageProvider ;
   private com.genexus.util.GXFile AV13File ;
   private String[] aP1 ;
}

