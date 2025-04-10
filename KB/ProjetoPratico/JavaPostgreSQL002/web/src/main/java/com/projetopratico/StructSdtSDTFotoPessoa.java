package com.projetopratico ;
import com.genexus.*;

public final  class StructSdtSDTFotoPessoa implements Cloneable, java.io.Serializable
{
   public StructSdtSDTFotoPessoa( )
   {
      this( -1, new ModelContext( StructSdtSDTFotoPessoa.class ));
   }

   public StructSdtSDTFotoPessoa( int remoteHandle ,
                                  ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTFotoPessoa_Fp_data = cal.getTime() ;
      gxTv_SdtSDTFotoPessoa_Fp_bucket = "" ;
      gxTv_SdtSDTFotoPessoa_Fp_hash = "" ;
      gxTv_SdtSDTFotoPessoa_Fp_foto_link = "" ;
      gxTv_SdtSDTFotoPessoa_Fp_data_N = (byte)(1) ;
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   public int getFp_id( )
   {
      return gxTv_SdtSDTFotoPessoa_Fp_id ;
   }

   public void setFp_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTFotoPessoa_Fp_id = value ;
   }

   public int getPes_id( )
   {
      return gxTv_SdtSDTFotoPessoa_Pes_id ;
   }

   public void setPes_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTFotoPessoa_Pes_id = value ;
   }

   public java.util.Date getFp_data( )
   {
      return gxTv_SdtSDTFotoPessoa_Fp_data ;
   }

   public void setFp_data( java.util.Date value )
   {
      gxTv_SdtSDTFotoPessoa_Fp_data_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTFotoPessoa_Fp_data = value ;
   }

   public String getFp_bucket( )
   {
      return gxTv_SdtSDTFotoPessoa_Fp_bucket ;
   }

   public void setFp_bucket( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTFotoPessoa_Fp_bucket = value ;
   }

   public String getFp_hash( )
   {
      return gxTv_SdtSDTFotoPessoa_Fp_hash ;
   }

   public void setFp_hash( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTFotoPessoa_Fp_hash = value ;
   }

   public String getFp_foto_link( )
   {
      return gxTv_SdtSDTFotoPessoa_Fp_foto_link ;
   }

   public void setFp_foto_link( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTFotoPessoa_Fp_foto_link = value ;
   }

   protected byte gxTv_SdtSDTFotoPessoa_Fp_data_N ;
   protected byte sdtIsNull ;
   protected int gxTv_SdtSDTFotoPessoa_Fp_id ;
   protected int gxTv_SdtSDTFotoPessoa_Pes_id ;
   protected String gxTv_SdtSDTFotoPessoa_Fp_bucket ;
   protected String gxTv_SdtSDTFotoPessoa_Fp_hash ;
   protected String gxTv_SdtSDTFotoPessoa_Fp_foto_link ;
   protected java.util.Date gxTv_SdtSDTFotoPessoa_Fp_data ;
}

