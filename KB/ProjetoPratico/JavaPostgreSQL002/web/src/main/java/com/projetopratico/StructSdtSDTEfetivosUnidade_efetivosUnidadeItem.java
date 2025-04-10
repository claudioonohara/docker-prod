package com.projetopratico ;
import com.genexus.*;

public final  class StructSdtSDTEfetivosUnidade_efetivosUnidadeItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTEfetivosUnidade_efetivosUnidadeItem( )
   {
      this( -1, new ModelContext( StructSdtSDTEfetivosUnidade_efetivosUnidadeItem.class ));
   }

   public StructSdtSDTEfetivosUnidade_efetivosUnidadeItem( int remoteHandle ,
                                                           ModelContext context )
   {
      gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Nome = "" ;
      gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Unidadedelotacao = "" ;
      gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias_N = (byte)(1) ;
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

   public String getNome( )
   {
      return gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Nome ;
   }

   public void setNome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Nome = value ;
   }

   public short getIdade( )
   {
      return gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Idade ;
   }

   public void setIdade( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Idade = value ;
   }

   public String getUnidadedelotacao( )
   {
      return gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Unidadedelotacao ;
   }

   public void setUnidadedelotacao( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Unidadedelotacao = value ;
   }

   public java.util.Vector<com.projetopratico.StructSdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem> getFotografias( )
   {
      return gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias ;
   }

   public void setFotografias( java.util.Vector<com.projetopratico.StructSdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem> value )
   {
      gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias = value ;
   }

   protected byte gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias_N ;
   protected byte sdtIsNull ;
   protected short gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Idade ;
   protected String gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Nome ;
   protected String gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Unidadedelotacao ;
   protected java.util.Vector<com.projetopratico.StructSdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem> gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias=null ;
}

