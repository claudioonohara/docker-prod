package com.projetopratico ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTServidorEfetivoEnderecoFuncional.servidorItem.lotacaoItem.enderecoItem", namespace ="ProjetoPratico")
public final  class StructSdtColSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem( )
   {
      this( -1, new ModelContext( StructSdtColSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem.class ));
   }

   public StructSdtColSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem( int remoteHandle ,
                                                                                                 ModelContext context )
   {
   }

   public  StructSdtColSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem( java.util.Vector<StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTServidorEfetivoEnderecoFuncional.servidorItem.lotacaoItem.enderecoItem",namespace="ProjetoPratico")
   public java.util.Vector<StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem> item = new java.util.Vector<>();
}

