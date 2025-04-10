package com.projetopratico ;
import com.genexus.*;

public final  class StructSdtSDTCRUnidade implements Cloneable, java.io.Serializable
{
   public StructSdtSDTCRUnidade( )
   {
      this( -1, new ModelContext( StructSdtSDTCRUnidade.class ));
   }

   public StructSdtSDTCRUnidade( int remoteHandle ,
                                 ModelContext context )
   {
      gxTv_SdtSDTCRUnidade_Unid_nome = "" ;
      gxTv_SdtSDTCRUnidade_Unid_sigla = "" ;
      gxTv_SdtSDTCRUnidade_Endereco_N = (byte)(1) ;
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

   public int getUnid_id( )
   {
      return gxTv_SdtSDTCRUnidade_Unid_id ;
   }

   public void setUnid_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRUnidade_Unid_id = value ;
   }

   public String getUnid_nome( )
   {
      return gxTv_SdtSDTCRUnidade_Unid_nome ;
   }

   public void setUnid_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRUnidade_Unid_nome = value ;
   }

   public String getUnid_sigla( )
   {
      return gxTv_SdtSDTCRUnidade_Unid_sigla ;
   }

   public void setUnid_sigla( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRUnidade_Unid_sigla = value ;
   }

   public java.util.Vector<com.projetopratico.StructSdtSDTCRUnidade_enderecoItem> getEndereco( )
   {
      return gxTv_SdtSDTCRUnidade_Endereco ;
   }

   public void setEndereco( java.util.Vector<com.projetopratico.StructSdtSDTCRUnidade_enderecoItem> value )
   {
      gxTv_SdtSDTCRUnidade_Endereco_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRUnidade_Endereco = value ;
   }

   protected byte gxTv_SdtSDTCRUnidade_Endereco_N ;
   protected byte sdtIsNull ;
   protected int gxTv_SdtSDTCRUnidade_Unid_id ;
   protected String gxTv_SdtSDTCRUnidade_Unid_nome ;
   protected String gxTv_SdtSDTCRUnidade_Unid_sigla ;
   protected java.util.Vector<com.projetopratico.StructSdtSDTCRUnidade_enderecoItem> gxTv_SdtSDTCRUnidade_Endereco=null ;
}

