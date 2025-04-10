package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfotopessoaget extends GXProcedure
{
   public pfotopessoaget( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfotopessoaget.class ), "" );
   }

   public pfotopessoaget( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int aP0 ,
                                                                        com.projetopratico.SdtSDTFotoPessoa[] aP1 )
   {
      pfotopessoaget.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( int aP0 ,
                        com.projetopratico.SdtSDTFotoPessoa[] aP1 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( int aP0 ,
                             com.projetopratico.SdtSDTFotoPessoa[] aP1 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      pfotopessoaget.this.AV8fp_id = aP0;
      pfotopessoaget.this.aP1 = aP1;
      pfotopessoaget.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV17GXLvl1 = (byte)(0) ;
      /* Using cursor P00162 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV8fp_id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10fp_id = P00162_A10fp_id[0] ;
         A1pes_id = P00162_A1pes_id[0] ;
         A11fp_data = P00162_A11fp_data[0] ;
         A12fp_bucket = P00162_A12fp_bucket[0] ;
         A13fp_hash = P00162_A13fp_hash[0] ;
         A40000fp_foto_GXI = P00162_A40000fp_foto_GXI[0] ;
         AV17GXLvl1 = (byte)(1) ;
         AV16SDTFotoPessoa.setgxTv_SdtSDTFotoPessoa_Fp_id( AV8fp_id );
         AV16SDTFotoPessoa.setgxTv_SdtSDTFotoPessoa_Pes_id( A1pes_id );
         AV16SDTFotoPessoa.setgxTv_SdtSDTFotoPessoa_Fp_data( A11fp_data );
         AV16SDTFotoPessoa.setgxTv_SdtSDTFotoPessoa_Fp_bucket( A12fp_bucket );
         AV16SDTFotoPessoa.setgxTv_SdtSDTFotoPessoa_Fp_hash( A13fp_hash );
         GXt_char1 = "" ;
         GXv_char2[0] = GXt_char1 ;
         new com.projetopratico.pgetlinktemporario(remoteHandle, context).execute( A40000fp_foto_GXI, GXv_char2) ;
         pfotopessoaget.this.GXt_char1 = GXv_char2[0] ;
         AV16SDTFotoPessoa.setgxTv_SdtSDTFotoPessoa_Fp_foto_link( GXt_char1 );
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV17GXLvl1 == 0 )
      {
         AV14Message.setgxTv_SdtMessages_Message_Description( "Foto com id "+GXutil.trim( GXutil.str( AV8fp_id, 8, 0))+" nao encontrada" );
         AV14Message.setgxTv_SdtMessages_Message_Type( (byte)(0) );
         AV15Messages.add(AV14Message, 0);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pfotopessoaget.this.AV16SDTFotoPessoa;
      this.aP2[0] = pfotopessoaget.this.AV15Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16SDTFotoPessoa = new com.projetopratico.SdtSDTFotoPessoa(remoteHandle, context);
      AV15Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      P00162_A10fp_id = new int[1] ;
      P00162_A1pes_id = new int[1] ;
      P00162_A11fp_data = new java.util.Date[] {GXutil.nullDate()} ;
      P00162_A12fp_bucket = new String[] {""} ;
      P00162_A13fp_hash = new String[] {""} ;
      P00162_A40000fp_foto_GXI = new String[] {""} ;
      A11fp_data = GXutil.nullDate() ;
      A12fp_bucket = "" ;
      A13fp_hash = "" ;
      A40000fp_foto_GXI = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV14Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pfotopessoaget__default(),
         new Object[] {
             new Object[] {
            P00162_A10fp_id, P00162_A1pes_id, P00162_A11fp_data, P00162_A12fp_bucket, P00162_A13fp_hash, P00162_A40000fp_foto_GXI
            }
         }
      );
      /* GeneXus formulas. */
   }

   private byte AV17GXLvl1 ;
   private int AV8fp_id ;
   private int A10fp_id ;
   private int A1pes_id ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private java.util.Date A11fp_data ;
   private String A12fp_bucket ;
   private String A13fp_hash ;
   private String A40000fp_foto_GXI ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ;
   private com.projetopratico.SdtSDTFotoPessoa[] aP1 ;
   private com.projetopratico.SdtSDTFotoPessoa AV16SDTFotoPessoa ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV15Messages ;
   private IDataStoreProvider pr_default ;
   private int[] P00162_A10fp_id ;
   private int[] P00162_A1pes_id ;
   private java.util.Date[] P00162_A11fp_data ;
   private String[] P00162_A12fp_bucket ;
   private String[] P00162_A13fp_hash ;
   private String[] P00162_A40000fp_foto_GXI ;
   private com.genexus.SdtMessages_Message AV14Message ;
}

final  class pfotopessoaget__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00162", "SELECT fp_id, pes_id, fp_data, fp_bucket, fp_hash, fp_foto_GXI FROM foto_pessoa WHERE fp_id = ? ORDER BY fp_id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getMultimediaUri(6);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

