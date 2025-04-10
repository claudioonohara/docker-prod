package com.projetopratico ;
import com.genexus.*;

public final  class StructSdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem( )
   {
      this( -1, new ModelContext( StructSdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem.class ));
   }

   public StructSdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem( int remoteHandle ,
                                                                           ModelContext context )
   {
      gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem_Fotografia = "" ;
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

   public String getFotografia( )
   {
      return gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem_Fotografia ;
   }

   public void setFotografia( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem_Fotografia = value ;
   }

   protected byte sdtIsNull ;
   protected String gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem_Fotografia ;
}

