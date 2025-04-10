package com.projetopratico ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTCRUnidade.enderecoItem", namespace ="ProjetoPratico")
public final  class StructSdtColSDTCRUnidade_enderecoItem implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTCRUnidade_enderecoItem( )
   {
      this( -1, new ModelContext( StructSdtColSDTCRUnidade_enderecoItem.class ));
   }

   public StructSdtColSDTCRUnidade_enderecoItem( int remoteHandle ,
                                                 ModelContext context )
   {
   }

   public  StructSdtColSDTCRUnidade_enderecoItem( java.util.Vector<StructSdtSDTCRUnidade_enderecoItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTCRUnidade.enderecoItem",namespace="ProjetoPratico")
   public java.util.Vector<StructSdtSDTCRUnidade_enderecoItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTCRUnidade_enderecoItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTCRUnidade_enderecoItem> item = new java.util.Vector<>();
}

