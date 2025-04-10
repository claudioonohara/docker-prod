package com.projetopratico ;
import com.genexus.*;

public final  class StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem( )
   {
      this( -1, new ModelContext( StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem.class ));
   }

   public StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem( int remoteHandle ,
                                                                                 ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao = cal.getTime() ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao = cal.getTime() ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_nome = "" ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_sigla = "" ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao_N = (byte)(1) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao_N = (byte)(1) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco_N = (byte)(1) ;
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

   public int getLot_id( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_id ;
   }

   public void setLot_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_id = value ;
   }

   public java.util.Date getLot_data_lotacao( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao ;
   }

   public void setLot_data_lotacao( java.util.Date value )
   {
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao = value ;
   }

   public java.util.Date getLot_data_remocao( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao ;
   }

   public void setLot_data_remocao( java.util.Date value )
   {
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao = value ;
   }

   public int getUnid_id( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_id ;
   }

   public void setUnid_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_id = value ;
   }

   public String getUnid_nome( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_nome ;
   }

   public void setUnid_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_nome = value ;
   }

   public String getUnid_sigla( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_sigla ;
   }

   public void setUnid_sigla( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_sigla = value ;
   }

   public java.util.Vector<com.projetopratico.StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem> getEndereco( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco ;
   }

   public void setEndereco( java.util.Vector<com.projetopratico.StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem> value )
   {
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco = value ;
   }

   protected byte gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao_N ;
   protected byte gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao_N ;
   protected byte gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco_N ;
   protected byte sdtIsNull ;
   protected int gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_id ;
   protected int gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_id ;
   protected String gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_nome ;
   protected String gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_sigla ;
   protected java.util.Date gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao ;
   protected java.util.Date gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao ;
   protected java.util.Vector<com.projetopratico.StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem> gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco=null ;
}

