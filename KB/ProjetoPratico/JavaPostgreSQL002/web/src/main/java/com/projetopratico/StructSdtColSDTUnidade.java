package com.projetopratico ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTUnidade", namespace ="ProjetoPratico")
public final  class StructSdtColSDTUnidade implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTUnidade( )
   {
      this( -1, new ModelContext( StructSdtColSDTUnidade.class ));
   }

   public StructSdtColSDTUnidade( int remoteHandle ,
                                  ModelContext context )
   {
   }

   public  StructSdtColSDTUnidade( java.util.Vector<StructSdtSDTUnidade> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTUnidade",namespace="ProjetoPratico")
   public java.util.Vector<StructSdtSDTUnidade> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTUnidade> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTUnidade> item = new java.util.Vector<>();
}

