package com.projetopratico ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTCRServidorEfetivo.enderecoItem", namespace ="ProjetoPratico")
public final  class StructSdtColSDTCRServidorEfetivo_enderecoItem implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTCRServidorEfetivo_enderecoItem( )
   {
      this( -1, new ModelContext( StructSdtColSDTCRServidorEfetivo_enderecoItem.class ));
   }

   public StructSdtColSDTCRServidorEfetivo_enderecoItem( int remoteHandle ,
                                                         ModelContext context )
   {
   }

   public  StructSdtColSDTCRServidorEfetivo_enderecoItem( java.util.Vector<StructSdtSDTCRServidorEfetivo_enderecoItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTCRServidorEfetivo.enderecoItem",namespace="ProjetoPratico")
   public java.util.Vector<StructSdtSDTCRServidorEfetivo_enderecoItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTCRServidorEfetivo_enderecoItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTCRServidorEfetivo_enderecoItem> item = new java.util.Vector<>();
}

