package com.projetopratico ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTFotoPessoa", namespace ="ProjetoPratico")
public final  class StructSdtColSDTFotoPessoa implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTFotoPessoa( )
   {
      this( -1, new ModelContext( StructSdtColSDTFotoPessoa.class ));
   }

   public StructSdtColSDTFotoPessoa( int remoteHandle ,
                                     ModelContext context )
   {
   }

   public  StructSdtColSDTFotoPessoa( java.util.Vector<StructSdtSDTFotoPessoa> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTFotoPessoa",namespace="ProjetoPratico")
   public java.util.Vector<StructSdtSDTFotoPessoa> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTFotoPessoa> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTFotoPessoa> item = new java.util.Vector<>();
}

