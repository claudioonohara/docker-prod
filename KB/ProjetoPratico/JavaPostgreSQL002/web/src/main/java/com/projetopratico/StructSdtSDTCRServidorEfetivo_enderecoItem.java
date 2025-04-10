package com.projetopratico ;
import com.genexus.*;

public final  class StructSdtSDTCRServidorEfetivo_enderecoItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTCRServidorEfetivo_enderecoItem( )
   {
      this( -1, new ModelContext( StructSdtSDTCRServidorEfetivo_enderecoItem.class ));
   }

   public StructSdtSDTCRServidorEfetivo_enderecoItem( int remoteHandle ,
                                                      ModelContext context )
   {
      gxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_tipo_logradouro = "" ;
      gxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_logradouro = "" ;
      gxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_bairro = "" ;
      gxTv_SdtSDTCRServidorEfetivo_enderecoItem_Cid_nome = "" ;
      gxTv_SdtSDTCRServidorEfetivo_enderecoItem_Cid_uf = "" ;
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
      return gxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_id ;
   }

   public void setEnd_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_id = value ;
   }

   public String getEnd_tipo_logradouro( )
   {
      return gxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_tipo_logradouro ;
   }

   public void setEnd_tipo_logradouro( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_tipo_logradouro = value ;
   }

   public String getEnd_logradouro( )
   {
      return gxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_logradouro ;
   }

   public void setEnd_logradouro( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_logradouro = value ;
   }

   public int getEnd_numero( )
   {
      return gxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_numero ;
   }

   public void setEnd_numero( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_numero = value ;
   }

   public String getEnd_bairro( )
   {
      return gxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_bairro ;
   }

   public void setEnd_bairro( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_bairro = value ;
   }

   public int getCid_id( )
   {
      return gxTv_SdtSDTCRServidorEfetivo_enderecoItem_Cid_id ;
   }

   public void setCid_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivo_enderecoItem_Cid_id = value ;
   }

   public String getCid_nome( )
   {
      return gxTv_SdtSDTCRServidorEfetivo_enderecoItem_Cid_nome ;
   }

   public void setCid_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivo_enderecoItem_Cid_nome = value ;
   }

   public String getCid_uf( )
   {
      return gxTv_SdtSDTCRServidorEfetivo_enderecoItem_Cid_uf ;
   }

   public void setCid_uf( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivo_enderecoItem_Cid_uf = value ;
   }

   protected byte sdtIsNull ;
   protected int gxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_id ;
   protected int gxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_numero ;
   protected int gxTv_SdtSDTCRServidorEfetivo_enderecoItem_Cid_id ;
   protected String gxTv_SdtSDTCRServidorEfetivo_enderecoItem_Cid_uf ;
   protected String gxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_tipo_logradouro ;
   protected String gxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_logradouro ;
   protected String gxTv_SdtSDTCRServidorEfetivo_enderecoItem_End_bairro ;
   protected String gxTv_SdtSDTCRServidorEfetivo_enderecoItem_Cid_nome ;
}

