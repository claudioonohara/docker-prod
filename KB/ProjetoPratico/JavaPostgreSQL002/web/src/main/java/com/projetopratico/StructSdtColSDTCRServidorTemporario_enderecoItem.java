package com.projetopratico ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTCRServidorTemporario.enderecoItem", namespace ="ProjetoPratico")
public final  class StructSdtColSDTCRServidorTemporario_enderecoItem implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTCRServidorTemporario_enderecoItem( )
   {
      this( -1, new ModelContext( StructSdtColSDTCRServidorTemporario_enderecoItem.class ));
   }

   public StructSdtColSDTCRServidorTemporario_enderecoItem( int remoteHandle ,
                                                            ModelContext context )
   {
   }

   public  StructSdtColSDTCRServidorTemporario_enderecoItem( java.util.Vector<StructSdtSDTCRServidorTemporario_enderecoItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTCRServidorTemporario.enderecoItem",namespace="ProjetoPratico")
   public java.util.Vector<StructSdtSDTCRServidorTemporario_enderecoItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTCRServidorTemporario_enderecoItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTCRServidorTemporario_enderecoItem> item = new java.util.Vector<>();
}

