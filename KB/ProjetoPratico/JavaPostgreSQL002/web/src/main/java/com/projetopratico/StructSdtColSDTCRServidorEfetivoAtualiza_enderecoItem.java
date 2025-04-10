package com.projetopratico ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTCRServidorEfetivoAtualiza.enderecoItem", namespace ="ProjetoPratico")
public final  class StructSdtColSDTCRServidorEfetivoAtualiza_enderecoItem implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTCRServidorEfetivoAtualiza_enderecoItem( )
   {
      this( -1, new ModelContext( StructSdtColSDTCRServidorEfetivoAtualiza_enderecoItem.class ));
   }

   public StructSdtColSDTCRServidorEfetivoAtualiza_enderecoItem( int remoteHandle ,
                                                                 ModelContext context )
   {
   }

   public  StructSdtColSDTCRServidorEfetivoAtualiza_enderecoItem( java.util.Vector<StructSdtSDTCRServidorEfetivoAtualiza_enderecoItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTCRServidorEfetivoAtualiza.enderecoItem",namespace="ProjetoPratico")
   public java.util.Vector<StructSdtSDTCRServidorEfetivoAtualiza_enderecoItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTCRServidorEfetivoAtualiza_enderecoItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTCRServidorEfetivoAtualiza_enderecoItem> item = new java.util.Vector<>();
}

