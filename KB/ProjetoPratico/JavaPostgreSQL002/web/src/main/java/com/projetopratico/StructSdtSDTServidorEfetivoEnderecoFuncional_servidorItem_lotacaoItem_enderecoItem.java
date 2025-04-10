package com.projetopratico ;
import com.genexus.*;

public final  class StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem( )
   {
      this( -1, new ModelContext( StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem.class ));
   }

   public StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem( int remoteHandle ,
                                                                                              ModelContext context )
   {
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_logradouro = "" ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_bairro = "" ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_nome = "" ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_uf = "" ;
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
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_id ;
   }

   public void setEnd_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_id = value ;
   }

   public String getEnd_logradouro( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_logradouro ;
   }

   public void setEnd_logradouro( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_logradouro = value ;
   }

   public int getEnd_numero( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_numero ;
   }

   public void setEnd_numero( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_numero = value ;
   }

   public String getEnd_bairro( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_bairro ;
   }

   public void setEnd_bairro( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_bairro = value ;
   }

   public int getCid_id( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_id ;
   }

   public void setCid_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_id = value ;
   }

   public String getCid_nome( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_nome ;
   }

   public void setCid_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_nome = value ;
   }

   public String getCid_uf( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_uf ;
   }

   public void setCid_uf( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_uf = value ;
   }

   protected byte sdtIsNull ;
   protected int gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_id ;
   protected int gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_numero ;
   protected int gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_id ;
   protected String gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_uf ;
   protected String gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_logradouro ;
   protected String gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_bairro ;
   protected String gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_nome ;
}

