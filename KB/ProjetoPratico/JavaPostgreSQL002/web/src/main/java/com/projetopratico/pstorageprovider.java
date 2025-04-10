package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pstorageprovider extends GXProcedure
{
   public pstorageprovider( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pstorageprovider.class ), "" );
   }

   public pstorageprovider( int remoteHandle ,
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
      GXv_char1[0] = AV18Pgmname + " Directory.ApplicationDataPath --->" + com.genexus.util.GXDirectory.applicationdatapath() ;
      new com.projetopratico.pgeralog(remoteHandle, context).execute( GXv_char1) ;
      GXv_char1[0] = AV18Pgmname + " Directory.TemporaryFilesPath --->" + com.genexus.util.GXDirectory.temporaryfilespath() ;
      new com.projetopratico.pgeralog(remoteHandle, context).execute( GXv_char1) ;
      GXv_char1[0] = AV18Pgmname + " Directory.ExternalFilesPath --->" + com.genexus.util.GXDirectory.externalfilespath() ;
      new com.projetopratico.pgeralog(remoteHandle, context).execute( GXv_char1) ;
      GXv_char1[0] = AV18Pgmname + " Directory.CacheFilesPath --->" + com.genexus.util.GXDirectory.cachefilespath() ;
      new com.projetopratico.pgeralog(remoteHandle, context).execute( GXv_char1) ;
      /* User Code */
       AV14str =  System.getProperty("file.separator");
      GXv_char1[0] = AV18Pgmname + " &str --->" + AV14str ;
      new com.projetopratico.pgeralog(remoteHandle, context).execute( GXv_char1) ;
      AV15filePath = com.genexus.util.GXDirectory.temporaryfilespath() + "teste2.txt" ;
      AV10File.setSource( AV15filePath );
      AV10File.create();
      AV10File.open("");
      AV10File.appendAllText("teste", "");
      AV10File.close();
      GXv_char1[0] = AV18Pgmname + " &filePath --->" + AV15filePath ;
      new com.projetopratico.pgeralog(remoteHandle, context).execute( GXv_char1) ;
      AV16Properties = (com.genexus.util.GXProperties)new com.genexus.util.GXProperties();
      AV16Properties.set("STORAGE_PROVIDER_ACCESSKEYID", "admin123");
      AV16Properties.set("STORAGE_PROVIDER_SECRETACCESSKEY", "admin123");
      AV16Properties.set("BUCKET_NAME", "fotoabc");
      AV16Properties.set("FOLDER_NAME", "Content");
      AV16Properties.set("STORAGE_PROVIDER_DEFAULT_ACL", "Default");
      AV16Properties.set("STORAGE_PROVIDER_DEFAULT_EXPIRATION", "600");
      AV16Properties.set("STORAGE_PROVIDER_REGION", "us-east-1");
      AV16Properties.set("STORAGE_ENDPOINT", "custom");
      AV16Properties.set("STORAGE_CUSTOM_ENDPOINT", "http://minioprod:9000");
      GXv_storageprovider2[0] = AV8StorageProvider ;
      GXv_objcol_SdtMessages_Message3[0] = AV12Messages ;
      if ( AV17ExternalStorage.create("AMAZONS3", AV16Properties, GXv_storageprovider2, GXv_objcol_SdtMessages_Message3) )
      {
         AV8StorageProvider = (com.genexus.util.GXStorageProvider)GXv_storageprovider2[0];
         AV12Messages = GXv_objcol_SdtMessages_Message3[0] ;
         AV8StorageProvider.upload(AV15filePath, "teste2.txt", AV11SentFile, AV12Messages);
      }
      GXv_char1[0] = AV18Pgmname + " &Messages --->" + AV12Messages.toxml(false, true, "Messages", "GeneXus") ;
      new com.projetopratico.pgeralog(remoteHandle, context).execute( GXv_char1) ;
      cleanup();
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
      AV18Pgmname = "" ;
      AV14str = "" ;
      AV15filePath = "" ;
      AV10File = new com.genexus.util.GXFile();
      AV16Properties = new com.genexus.util.GXProperties();
      AV8StorageProvider = new com.genexus.util.GXStorageProvider();
      GXv_storageprovider2 = new com.genexus.util.GXStorageProvider[1] ;
      AV12Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV17ExternalStorage = new com.genexuscore.genexus.common.configuration.SdtExternalStorage(remoteHandle, context);
      AV11SentFile = new com.genexus.util.GXFile();
      GXv_char1 = new String[1] ;
      AV18Pgmname = "PStorageProvider" ;
      /* GeneXus formulas. */
      AV18Pgmname = "PStorageProvider" ;
      initializeGenerics();
   }

   @SuppressWarnings("unchecked")
   private void initializeGenerics( )
   {
      GXv_objcol_SdtMessages_Message3 = new GXBaseCollection[1] ;
   }

   private String AV18Pgmname ;
   private String AV14str ;
   private String GXv_char1[] ;
   private String AV15filePath ;
   private com.genexus.util.GXStorageProvider GXv_storageprovider2[] ;
   private com.genexus.util.GXFile AV10File ;
   private com.genexus.util.GXStorageProvider AV8StorageProvider ;
   private com.genexus.util.GXFile AV11SentFile ;
   private com.genexus.util.GXProperties AV16Properties ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV12Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message3[] ;
   private com.genexuscore.genexus.common.configuration.SdtExternalStorage AV17ExternalStorage ;
}

