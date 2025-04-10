package com.projetopratico ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTCRServidorTemporarioAtualiza.enderecoItem", namespace ="ProjetoPratico")
public final  class StructSdtColSDTCRServidorTemporarioAtualiza_enderecoItem implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTCRServidorTemporarioAtualiza_enderecoItem( )
   {
      this( -1, new ModelContext( StructSdtColSDTCRServidorTemporarioAtualiza_enderecoItem.class ));
   }

   public StructSdtColSDTCRServidorTemporarioAtualiza_enderecoItem( int remoteHandle ,
                                                                    ModelContext context )
   {
   }

   public  StructSdtColSDTCRServidorTemporarioAtualiza_enderecoItem( java.util.Vector<StructSdtSDTCRServidorTemporarioAtualiza_enderecoItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTCRServidorTemporarioAtualiza.enderecoItem",namespace="ProjetoPratico")
   public java.util.Vector<StructSdtSDTCRServidorTemporarioAtualiza_enderecoItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTCRServidorTemporarioAtualiza_enderecoItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTCRServidorTemporarioAtualiza_enderecoItem> item = new java.util.Vector<>();
}

