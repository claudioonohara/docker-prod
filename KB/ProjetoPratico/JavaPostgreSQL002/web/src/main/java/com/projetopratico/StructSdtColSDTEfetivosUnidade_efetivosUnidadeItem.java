package com.projetopratico ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTEfetivosUnidade.efetivosUnidadeItem", namespace ="ProjetoPratico")
public final  class StructSdtColSDTEfetivosUnidade_efetivosUnidadeItem implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTEfetivosUnidade_efetivosUnidadeItem( )
   {
      this( -1, new ModelContext( StructSdtColSDTEfetivosUnidade_efetivosUnidadeItem.class ));
   }

   public StructSdtColSDTEfetivosUnidade_efetivosUnidadeItem( int remoteHandle ,
                                                              ModelContext context )
   {
   }

   public  StructSdtColSDTEfetivosUnidade_efetivosUnidadeItem( java.util.Vector<StructSdtSDTEfetivosUnidade_efetivosUnidadeItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTEfetivosUnidade.efetivosUnidadeItem",namespace="ProjetoPratico")
   public java.util.Vector<StructSdtSDTEfetivosUnidade_efetivosUnidadeItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTEfetivosUnidade_efetivosUnidadeItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTEfetivosUnidade_efetivosUnidadeItem> item = new java.util.Vector<>();
}

