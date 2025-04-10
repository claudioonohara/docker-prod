package com.projetopratico ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTServidorEfetivoEnderecoFuncional", namespace ="ProjetoPratico")
public final  class StructSdtColSDTServidorEfetivoEnderecoFuncional implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTServidorEfetivoEnderecoFuncional( )
   {
      this( -1, new ModelContext( StructSdtColSDTServidorEfetivoEnderecoFuncional.class ));
   }

   public StructSdtColSDTServidorEfetivoEnderecoFuncional( int remoteHandle ,
                                                           ModelContext context )
   {
   }

   public  StructSdtColSDTServidorEfetivoEnderecoFuncional( java.util.Vector<StructSdtSDTServidorEfetivoEnderecoFuncional> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTServidorEfetivoEnderecoFuncional",namespace="ProjetoPratico")
   public java.util.Vector<StructSdtSDTServidorEfetivoEnderecoFuncional> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTServidorEfetivoEnderecoFuncional> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTServidorEfetivoEnderecoFuncional> item = new java.util.Vector<>();
}

