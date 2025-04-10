package com.projetopratico ;
import com.genexus.*;

public final  class StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem( )
   {
      this( -1, new ModelContext( StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem.class ));
   }

   public StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem( int remoteHandle ,
                                                                     ModelContext context )
   {
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_nome = "" ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Se_matricula = "" ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao_N = (byte)(1) ;
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

   public int getPes_id( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_id ;
   }

   public void setPes_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_id = value ;
   }

   public String getPes_nome( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_nome ;
   }

   public void setPes_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_nome = value ;
   }

   public String getSe_matricula( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Se_matricula ;
   }

   public void setSe_matricula( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Se_matricula = value ;
   }

   public java.util.Vector<com.projetopratico.StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem> getLotacao( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao ;
   }

   public void setLotacao( java.util.Vector<com.projetopratico.StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem> value )
   {
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao = value ;
   }

   protected byte gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao_N ;
   protected byte sdtIsNull ;
   protected int gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_id ;
   protected String gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_nome ;
   protected String gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Se_matricula ;
   protected java.util.Vector<com.projetopratico.StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem> gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao=null ;
}

