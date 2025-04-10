package com.projetopratico ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTServidorEfetivoEnderecoFuncional.servidorItem.lotacaoItem", namespace ="ProjetoPratico")
public final  class StructSdtColSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem( )
   {
      this( -1, new ModelContext( StructSdtColSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem.class ));
   }

   public StructSdtColSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem( int remoteHandle ,
                                                                                    ModelContext context )
   {
   }

   public  StructSdtColSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem( java.util.Vector<StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTServidorEfetivoEnderecoFuncional.servidorItem.lotacaoItem",namespace="ProjetoPratico")
   public java.util.Vector<StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem> item = new java.util.Vector<>();
}

