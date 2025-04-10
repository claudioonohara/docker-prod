package com.projetopratico ;
import com.genexus.*;

public final  class StructSdtSDTCRServidorEfetivoAtualiza_enderecoItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTCRServidorEfetivoAtualiza_enderecoItem( )
   {
      this( -1, new ModelContext( StructSdtSDTCRServidorEfetivoAtualiza_enderecoItem.class ));
   }

   public StructSdtSDTCRServidorEfetivoAtualiza_enderecoItem( int remoteHandle ,
                                                              ModelContext context )
   {
      gxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_tipo_logradouro = "" ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_logradouro = "" ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_bairro = "" ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_Cid_nome = "" ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_Cid_uf = "" ;
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
      return gxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_id ;
   }

   public void setEnd_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_id = value ;
   }

   public String getEnd_tipo_logradouro( )
   {
      return gxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_tipo_logradouro ;
   }

   public void setEnd_tipo_logradouro( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_tipo_logradouro = value ;
   }

   public String getEnd_logradouro( )
   {
      return gxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_logradouro ;
   }

   public void setEnd_logradouro( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_logradouro = value ;
   }

   public int getEnd_numero( )
   {
      return gxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_numero ;
   }

   public void setEnd_numero( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_numero = value ;
   }

   public String getEnd_bairro( )
   {
      return gxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_bairro ;
   }

   public void setEnd_bairro( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_bairro = value ;
   }

   public int getCid_id( )
   {
      return gxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_Cid_id ;
   }

   public void setCid_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_Cid_id = value ;
   }

   public String getCid_nome( )
   {
      return gxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_Cid_nome ;
   }

   public void setCid_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_Cid_nome = value ;
   }

   public String getCid_uf( )
   {
      return gxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_Cid_uf ;
   }

   public void setCid_uf( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_Cid_uf = value ;
   }

   protected byte sdtIsNull ;
   protected int gxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_id ;
   protected int gxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_numero ;
   protected int gxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_Cid_id ;
   protected String gxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_Cid_uf ;
   protected String gxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_tipo_logradouro ;
   protected String gxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_logradouro ;
   protected String gxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_bairro ;
   protected String gxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_Cid_nome ;
}

