package com.projetopratico ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTCRServidorTemporarioAtualiza", namespace ="ProjetoPratico")
public final  class StructSdtColSDTCRServidorTemporarioAtualiza implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTCRServidorTemporarioAtualiza( )
   {
      this( -1, new ModelContext( StructSdtColSDTCRServidorTemporarioAtualiza.class ));
   }

   public StructSdtColSDTCRServidorTemporarioAtualiza( int remoteHandle ,
                                                       ModelContext context )
   {
   }

   public  StructSdtColSDTCRServidorTemporarioAtualiza( java.util.Vector<StructSdtSDTCRServidorTemporarioAtualiza> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTCRServidorTemporarioAtualiza",namespace="ProjetoPratico")
   public java.util.Vector<StructSdtSDTCRServidorTemporarioAtualiza> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTCRServidorTemporarioAtualiza> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTCRServidorTemporarioAtualiza> item = new java.util.Vector<>();
}

