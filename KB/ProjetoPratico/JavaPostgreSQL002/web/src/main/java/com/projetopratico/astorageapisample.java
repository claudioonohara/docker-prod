package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class astorageapisample extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(com.projetopratico.GXcfg.class);
      astorageapisample pgm = new astorageapisample (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public astorageapisample( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( astorageapisample.class ), "" );
   }

   public astorageapisample( int remoteHandle ,
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
      privateExecute();
   }

   protected void privateExecute( )
   {
      System.out.println( "\\\\\\\\\\\\\\\\\\ EXTERNAL STORAGE Methods////////////" );
      System.out.println( "--------------------Upload image--------------------------" );
      AV18Storage = (com.genexus.util.GXStorageProvider)new com.genexus.util.GXStorageProvider();
      AV14File.setSource( "catToUpload.jpg" );
      AV15FileFullPath = AV14File.getAbsoluteName() ;
      AV19StorageObjectFullName = "petsFolder/cat.jpg" ;
      if ( AV18Storage.upload(AV15FileFullPath, AV19StorageObjectFullName, AV10UploadedFile, AV9Messages) )
      {
         System.out.println( GXutil.format( "URL of the uploaded file : %1", AV10UploadedFile.getAbsoluteName(), "", "", "", "", "", "", "", "") );
      }
      else
      {
         AV22GXV1 = 1 ;
         while ( AV22GXV1 <= AV9Messages.size() )
         {
            AV17Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV9Messages.elementAt(-1+AV22GXV1));
            System.out.println( AV17Message.getgxTv_SdtMessages_Message_Description() );
            AV22GXV1 = (int)(AV22GXV1+1) ;
         }
      }
      System.out.println( "--------------------Get URL external image--------------------------" );
      AV18Storage = (com.genexus.util.GXStorageProvider)new com.genexus.util.GXStorageProvider();
      AV19StorageObjectFullName = "petsFolder/cat.jpg" ;
      if ( AV18Storage.get(AV19StorageObjectFullName, AV8ExternalFile, AV9Messages) )
      {
         System.out.println( GXutil.format( "External image URI : %1", AV8ExternalFile.getAbsoluteName(), "", "", "", "", "", "", "", "") );
      }
      else
      {
         System.out.println( AV9Messages.toJSonString(false) );
      }
      System.out.println( "--------------------Download external image--------------------------" );
      AV18Storage = (com.genexus.util.GXStorageProvider)new com.genexus.util.GXStorageProvider();
      AV19StorageObjectFullName = "petsFolder/cat.jpg" ;
      AV16LocalFile.setSource( "catDownloadFromStorage.jpg" );
      if ( AV18Storage.download(AV19StorageObjectFullName, AV16LocalFile, AV9Messages) )
      {
         System.out.println( GXutil.format( "Image downloaded in : %1", AV16LocalFile.getAbsoluteName(), "", "", "", "", "", "", "", "") );
      }
      else
      {
         System.out.println( AV9Messages.toJSonString(false) );
      }
      System.out.println( "--------------------GetDirectory--------------------------" );
      AV18Storage = (com.genexus.util.GXStorageProvider)new com.genexus.util.GXStorageProvider();
      AV12DirectoryFullName = "petsFolder" ;
      if ( AV18Storage.getDirectory(AV12DirectoryFullName, AV13ExternalDirectory, AV9Messages) )
      {
         System.out.println( GXutil.format( "Directory path : %1", AV13ExternalDirectory.getAbsoluteName(), "", "", "", "", "", "", "", "") );
      }
      else
      {
         System.out.println( AV9Messages.toJSonString(false) );
      }
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
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18Storage = new com.genexus.util.GXStorageProvider();
      AV14File = new com.genexus.util.GXFile();
      AV15FileFullPath = "" ;
      AV19StorageObjectFullName = "" ;
      AV10UploadedFile = new com.genexus.util.GXFile();
      AV9Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV17Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV8ExternalFile = new com.genexus.util.GXFile();
      AV16LocalFile = new com.genexus.util.GXFile();
      AV12DirectoryFullName = "" ;
      AV13ExternalDirectory = new com.genexus.util.GXDirectory();
      /* GeneXus formulas. */
   }

   private int AV22GXV1 ;
   private String AV15FileFullPath ;
   private String AV19StorageObjectFullName ;
   private String AV12DirectoryFullName ;
   private com.genexus.util.GXFile AV14File ;
   private com.genexus.util.GXFile AV16LocalFile ;
   private com.genexus.util.GXStorageProvider AV18Storage ;
   private com.genexus.util.GXFile AV10UploadedFile ;
   private com.genexus.util.GXFile AV8ExternalFile ;
   private com.genexus.util.GXDirectory AV13ExternalDirectory ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV9Messages ;
   private com.genexus.SdtMessages_Message AV17Message ;
}

