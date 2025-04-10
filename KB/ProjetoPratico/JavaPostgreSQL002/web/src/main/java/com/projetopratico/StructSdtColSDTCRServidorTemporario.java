package com.projetopratico ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTCRServidorTemporario", namespace ="ProjetoPratico")
public final  class StructSdtColSDTCRServidorTemporario implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTCRServidorTemporario( )
   {
      this( -1, new ModelContext( StructSdtColSDTCRServidorTemporario.class ));
   }

   public StructSdtColSDTCRServidorTemporario( int remoteHandle ,
                                               ModelContext context )
   {
   }

   public  StructSdtColSDTCRServidorTemporario( java.util.Vector<StructSdtSDTCRServidorTemporario> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTCRServidorTemporario",namespace="ProjetoPratico")
   public java.util.Vector<StructSdtSDTCRServidorTemporario> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTCRServidorTemporario> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTCRServidorTemporario> item = new java.util.Vector<>();
}

