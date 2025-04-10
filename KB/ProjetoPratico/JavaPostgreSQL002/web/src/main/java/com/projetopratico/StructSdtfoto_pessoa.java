package com.projetopratico ;
import com.genexus.*;

public final  class StructSdtfoto_pessoa implements Cloneable, java.io.Serializable
{
   public StructSdtfoto_pessoa( )
   {
      this( -1, new ModelContext( StructSdtfoto_pessoa.class ));
   }

   public StructSdtfoto_pessoa( int remoteHandle ,
                                ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_Sdtfoto_pessoa_Fp_data = cal.getTime() ;
      gxTv_Sdtfoto_pessoa_Fp_bucket = "" ;
      gxTv_Sdtfoto_pessoa_Fp_hash = "" ;
      gxTv_Sdtfoto_pessoa_Fp_foto = "" ;
      gxTv_Sdtfoto_pessoa_Fp_foto_gxi = "" ;
      gxTv_Sdtfoto_pessoa_Mode = "" ;
      gxTv_Sdtfoto_pessoa_Fp_data_Z = cal.getTime() ;
      gxTv_Sdtfoto_pessoa_Fp_bucket_Z = "" ;
      gxTv_Sdtfoto_pessoa_Fp_hash_Z = "" ;
      gxTv_Sdtfoto_pessoa_Fp_foto_gxi_Z = "" ;
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
      return gxTv_Sdtfoto_pessoa_Fp_id ;
   }

   public void setFp_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtfoto_pessoa_Fp_id = value ;
   }

   public int getPes_id( )
   {
      return gxTv_Sdtfoto_pessoa_Pes_id ;
   }

   public void setPes_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtfoto_pessoa_Pes_id = value ;
   }

   public java.util.Date getFp_data( )
   {
      return gxTv_Sdtfoto_pessoa_Fp_data ;
   }

   public void setFp_data( java.util.Date value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtfoto_pessoa_Fp_data = value ;
   }

   public String getFp_bucket( )
   {
      return gxTv_Sdtfoto_pessoa_Fp_bucket ;
   }

   public void setFp_bucket( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtfoto_pessoa_Fp_bucket = value ;
   }

   public String getFp_hash( )
   {
      return gxTv_Sdtfoto_pessoa_Fp_hash ;
   }

   public void setFp_hash( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtfoto_pessoa_Fp_hash = value ;
   }

   public String getFp_foto( )
   {
      return gxTv_Sdtfoto_pessoa_Fp_foto ;
   }

   public void setFp_foto( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtfoto_pessoa_Fp_foto = value ;
   }

   public String getFp_foto_gxi( )
   {
      return gxTv_Sdtfoto_pessoa_Fp_foto_gxi ;
   }

   public void setFp_foto_gxi( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtfoto_pessoa_Fp_foto_gxi = value ;
   }

   public String getMode( )
   {
      return gxTv_Sdtfoto_pessoa_Mode ;
   }

   public void setMode( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtfoto_pessoa_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_Sdtfoto_pessoa_Initialized ;
   }

   public void setInitialized( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtfoto_pessoa_Initialized = value ;
   }

   public int getFp_id_Z( )
   {
      return gxTv_Sdtfoto_pessoa_Fp_id_Z ;
   }

   public void setFp_id_Z( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtfoto_pessoa_Fp_id_Z = value ;
   }

   public int getPes_id_Z( )
   {
      return gxTv_Sdtfoto_pessoa_Pes_id_Z ;
   }

   public void setPes_id_Z( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtfoto_pessoa_Pes_id_Z = value ;
   }

   public java.util.Date getFp_data_Z( )
   {
      return gxTv_Sdtfoto_pessoa_Fp_data_Z ;
   }

   public void setFp_data_Z( java.util.Date value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtfoto_pessoa_Fp_data_Z = value ;
   }

   public String getFp_bucket_Z( )
   {
      return gxTv_Sdtfoto_pessoa_Fp_bucket_Z ;
   }

   public void setFp_bucket_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtfoto_pessoa_Fp_bucket_Z = value ;
   }

   public String getFp_hash_Z( )
   {
      return gxTv_Sdtfoto_pessoa_Fp_hash_Z ;
   }

   public void setFp_hash_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtfoto_pessoa_Fp_hash_Z = value ;
   }

   public String getFp_foto_gxi_Z( )
   {
      return gxTv_Sdtfoto_pessoa_Fp_foto_gxi_Z ;
   }

   public void setFp_foto_gxi_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtfoto_pessoa_Fp_foto_gxi_Z = value ;
   }

   private byte sdtIsNull ;
   protected short gxTv_Sdtfoto_pessoa_Initialized ;
   protected int gxTv_Sdtfoto_pessoa_Fp_id ;
   protected int gxTv_Sdtfoto_pessoa_Pes_id ;
   protected int gxTv_Sdtfoto_pessoa_Fp_id_Z ;
   protected int gxTv_Sdtfoto_pessoa_Pes_id_Z ;
   protected String gxTv_Sdtfoto_pessoa_Mode ;
   protected String gxTv_Sdtfoto_pessoa_Fp_bucket ;
   protected String gxTv_Sdtfoto_pessoa_Fp_hash ;
   protected String gxTv_Sdtfoto_pessoa_Fp_foto_gxi ;
   protected String gxTv_Sdtfoto_pessoa_Fp_bucket_Z ;
   protected String gxTv_Sdtfoto_pessoa_Fp_hash_Z ;
   protected String gxTv_Sdtfoto_pessoa_Fp_foto_gxi_Z ;
   protected String gxTv_Sdtfoto_pessoa_Fp_foto ;
   protected java.util.Date gxTv_Sdtfoto_pessoa_Fp_data ;
   protected java.util.Date gxTv_Sdtfoto_pessoa_Fp_data_Z ;
}

