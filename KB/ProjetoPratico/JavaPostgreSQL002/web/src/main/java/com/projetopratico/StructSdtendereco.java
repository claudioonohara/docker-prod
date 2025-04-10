package com.projetopratico ;
import com.genexus.*;

public final  class StructSdtendereco implements Cloneable, java.io.Serializable
{
   public StructSdtendereco( )
   {
      this( -1, new ModelContext( StructSdtendereco.class ));
   }

   public StructSdtendereco( int remoteHandle ,
                             ModelContext context )
   {
      gxTv_Sdtendereco_End_tipo_logradouro = "" ;
      gxTv_Sdtendereco_End_logradouro = "" ;
      gxTv_Sdtendereco_End_bairro = "" ;
      gxTv_Sdtendereco_Mode = "" ;
      gxTv_Sdtendereco_End_tipo_logradouro_Z = "" ;
      gxTv_Sdtendereco_End_logradouro_Z = "" ;
      gxTv_Sdtendereco_End_bairro_Z = "" ;
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

   public int getEnd_id( )
   {
      return gxTv_Sdtendereco_End_id ;
   }

   public void setEnd_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtendereco_End_id = value ;
   }

   public String getEnd_tipo_logradouro( )
   {
      return gxTv_Sdtendereco_End_tipo_logradouro ;
   }

   public void setEnd_tipo_logradouro( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtendereco_End_tipo_logradouro = value ;
   }

   public String getEnd_logradouro( )
   {
      return gxTv_Sdtendereco_End_logradouro ;
   }

   public void setEnd_logradouro( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtendereco_End_logradouro = value ;
   }

   public int getEnd_numero( )
   {
      return gxTv_Sdtendereco_End_numero ;
   }

   public void setEnd_numero( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtendereco_End_numero = value ;
   }

   public String getEnd_bairro( )
   {
      return gxTv_Sdtendereco_End_bairro ;
   }

   public void setEnd_bairro( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtendereco_End_bairro = value ;
   }

   public int getCid_id( )
   {
      return gxTv_Sdtendereco_Cid_id ;
   }

   public void setCid_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtendereco_Cid_id = value ;
   }

   public String getMode( )
   {
      return gxTv_Sdtendereco_Mode ;
   }

   public void setMode( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtendereco_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_Sdtendereco_Initialized ;
   }

   public void setInitialized( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtendereco_Initialized = value ;
   }

   public int getEnd_id_Z( )
   {
      return gxTv_Sdtendereco_End_id_Z ;
   }

   public void setEnd_id_Z( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtendereco_End_id_Z = value ;
   }

   public String getEnd_tipo_logradouro_Z( )
   {
      return gxTv_Sdtendereco_End_tipo_logradouro_Z ;
   }

   public void setEnd_tipo_logradouro_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtendereco_End_tipo_logradouro_Z = value ;
   }

   public String getEnd_logradouro_Z( )
   {
      return gxTv_Sdtendereco_End_logradouro_Z ;
   }

   public void setEnd_logradouro_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtendereco_End_logradouro_Z = value ;
   }

   public int getEnd_numero_Z( )
   {
      return gxTv_Sdtendereco_End_numero_Z ;
   }

   public void setEnd_numero_Z( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtendereco_End_numero_Z = value ;
   }

   public String getEnd_bairro_Z( )
   {
      return gxTv_Sdtendereco_End_bairro_Z ;
   }

   public void setEnd_bairro_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtendereco_End_bairro_Z = value ;
   }

   public int getCid_id_Z( )
   {
      return gxTv_Sdtendereco_Cid_id_Z ;
   }

   public void setCid_id_Z( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtendereco_Cid_id_Z = value ;
   }

   private byte sdtIsNull ;
   protected short gxTv_Sdtendereco_Initialized ;
   protected int gxTv_Sdtendereco_End_id ;
   protected int gxTv_Sdtendereco_End_numero ;
   protected int gxTv_Sdtendereco_Cid_id ;
   protected int gxTv_Sdtendereco_End_id_Z ;
   protected int gxTv_Sdtendereco_End_numero_Z ;
   protected int gxTv_Sdtendereco_Cid_id_Z ;
   protected String gxTv_Sdtendereco_Mode ;
   protected String gxTv_Sdtendereco_End_tipo_logradouro ;
   protected String gxTv_Sdtendereco_End_logradouro ;
   protected String gxTv_Sdtendereco_End_bairro ;
   protected String gxTv_Sdtendereco_End_tipo_logradouro_Z ;
   protected String gxTv_Sdtendereco_End_logradouro_Z ;
   protected String gxTv_Sdtendereco_End_bairro_Z ;
}

