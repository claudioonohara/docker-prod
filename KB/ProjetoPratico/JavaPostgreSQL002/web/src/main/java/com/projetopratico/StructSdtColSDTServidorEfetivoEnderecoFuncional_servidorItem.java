package com.projetopratico ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTServidorEfetivoEnderecoFuncional.servidorItem", namespace ="ProjetoPratico")
public final  class StructSdtColSDTServidorEfetivoEnderecoFuncional_servidorItem implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTServidorEfetivoEnderecoFuncional_servidorItem( )
   {
      this( -1, new ModelContext( StructSdtColSDTServidorEfetivoEnderecoFuncional_servidorItem.class ));
   }

   public StructSdtColSDTServidorEfetivoEnderecoFuncional_servidorItem( int remoteHandle ,
                                                                        ModelContext context )
   {
   }

   public  StructSdtColSDTServidorEfetivoEnderecoFuncional_servidorItem( java.util.Vector<StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTServidorEfetivoEnderecoFuncional.servidorItem",namespace="ProjetoPratico")
   public java.util.Vector<StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem> item = new java.util.Vector<>();
}

