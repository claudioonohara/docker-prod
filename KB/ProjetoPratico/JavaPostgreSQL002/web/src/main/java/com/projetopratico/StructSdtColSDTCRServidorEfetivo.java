package com.projetopratico ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTCRServidorEfetivo", namespace ="ProjetoPratico")
public final  class StructSdtColSDTCRServidorEfetivo implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTCRServidorEfetivo( )
   {
      this( -1, new ModelContext( StructSdtColSDTCRServidorEfetivo.class ));
   }

   public StructSdtColSDTCRServidorEfetivo( int remoteHandle ,
                                            ModelContext context )
   {
   }

   public  StructSdtColSDTCRServidorEfetivo( java.util.Vector<StructSdtSDTCRServidorEfetivo> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTCRServidorEfetivo",namespace="ProjetoPratico")
   public java.util.Vector<StructSdtSDTCRServidorEfetivo> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTCRServidorEfetivo> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTCRServidorEfetivo> item = new java.util.Vector<>();
}

