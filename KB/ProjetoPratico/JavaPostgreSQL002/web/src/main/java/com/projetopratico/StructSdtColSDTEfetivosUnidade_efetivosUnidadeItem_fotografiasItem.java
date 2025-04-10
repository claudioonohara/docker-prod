package com.projetopratico ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTEfetivosUnidade.efetivosUnidadeItem.fotografiasItem", namespace ="ProjetoPratico")
public final  class StructSdtColSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem( )
   {
      this( -1, new ModelContext( StructSdtColSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem.class ));
   }

   public StructSdtColSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem( int remoteHandle ,
                                                                              ModelContext context )
   {
   }

   public  StructSdtColSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem( java.util.Vector<StructSdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem> value )
   {
      item = value;
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTEfetivosUnidade.efetivosUnidadeItem.fotografiasItem",namespace="ProjetoPratico")
   public java.util.Vector<StructSdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem> item = new java.util.Vector<>();
}

