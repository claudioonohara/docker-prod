package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfotopessoapost extends GXProcedure
{
   public pfotopessoapost( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfotopessoapost.class ), "" );
   }

   public pfotopessoapost( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int aP0 ,
                                                                        java.util.Date aP1 ,
                                                                        String aP2 ,
                                                                        com.projetopratico.SdtSDTFotoPessoa[] aP3 )
   {
      pfotopessoapost.this.aP4 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( int aP0 ,
                        java.util.Date aP1 ,
                        String aP2 ,
                        com.projetopratico.SdtSDTFotoPessoa[] aP3 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( int aP0 ,
                             java.util.Date aP1 ,
                             String aP2 ,
                             com.projetopratico.SdtSDTFotoPessoa[] aP3 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 )
   {
      pfotopessoapost.this.AV13pes_id = aP0;
      pfotopessoapost.this.AV14fp_data = aP1;
      pfotopessoapost.this.AV17fp_foto = aP2;
      pfotopessoapost.this.aP3 = aP3;
      pfotopessoapost.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV12Messages.clear();
      AV8foto_pessoa.setgxTv_Sdtfoto_pessoa_Pes_id( AV13pes_id );
      AV8foto_pessoa.setgxTv_Sdtfoto_pessoa_Fp_data( AV14fp_data );
      AV8foto_pessoa.setgxTv_Sdtfoto_pessoa_Fp_foto( AV17fp_foto );
      AV8foto_pessoa.setgxTv_Sdtfoto_pessoa_Fp_foto_gxi( AV18Fp_foto_GXI );
      AV8foto_pessoa.Save();
      if ( AV8foto_pessoa.Success() )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pfotopessoapost");
         GXv_SdtSDTFotoPessoa1[0] = AV11SDTFotoPessoa;
         GXv_objcol_SdtMessages_Message2[0] = AV12Messages ;
         new com.projetopratico.pfotopessoaget(remoteHandle, context).execute( AV8foto_pessoa.getgxTv_Sdtfoto_pessoa_Fp_id(), GXv_SdtSDTFotoPessoa1, GXv_objcol_SdtMessages_Message2) ;
         AV11SDTFotoPessoa = GXv_SdtSDTFotoPessoa1[0];
         AV12Messages = GXv_objcol_SdtMessages_Message2[0] ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "pfotopessoapost");
         AV12Messages = AV8foto_pessoa.GetMessages() ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = pfotopessoapost.this.AV11SDTFotoPessoa;
      this.aP4[0] = pfotopessoapost.this.AV12Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11SDTFotoPessoa = new com.projetopratico.SdtSDTFotoPessoa(remoteHandle, context);
      AV12Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV8foto_pessoa = new com.projetopratico.Sdtfoto_pessoa(remoteHandle);
      AV18Fp_foto_GXI = "" ;
      GXv_SdtSDTFotoPessoa1 = new com.projetopratico.SdtSDTFotoPessoa[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pfotopessoapost__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
      initializeGenerics();
   }

   @SuppressWarnings("unchecked")
   private void initializeGenerics( )
   {
      GXv_objcol_SdtMessages_Message2 = new GXBaseCollection[1] ;
   }

   private int AV13pes_id ;
   private java.util.Date AV14fp_data ;
   private String AV18Fp_foto_GXI ;
   private String AV17fp_foto ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 ;
   private com.projetopratico.SdtSDTFotoPessoa[] aP3 ;
   private com.projetopratico.SdtSDTFotoPessoa AV11SDTFotoPessoa ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV12Messages ;
   private com.projetopratico.Sdtfoto_pessoa AV8foto_pessoa ;
   private IDataStoreProvider pr_default ;
   private com.projetopratico.SdtSDTFotoPessoa GXv_SdtSDTFotoPessoa1[] ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message2[] ;
}

final  class pfotopessoapost__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

