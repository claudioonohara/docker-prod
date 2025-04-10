package com.projetopratico ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTCRServidorEfetivoAtualiza", namespace ="ProjetoPratico")
public final  class StructSdtColSDTCRServidorEfetivoAtualiza implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTCRServidorEfetivoAtualiza( )
   {
      this( -1, new ModelContext( StructSdtColSDTCRServidorEfetivoAtualiza.class ));
   }

   public StructSdtColSDTCRServidorEfetivoAtualiza( int remoteHandle ,
                                                    ModelContext context )
   {
   }

   public  StructSdtColSDTCRServidorEfetivoAtualiza( java.util.Vector<StructSdtSDTCRServidorEfetivoAtualiza> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTCRServidorEfetivoAtualiza",namespace="ProjetoPratico")
   public java.util.Vector<StructSdtSDTCRServidorEfetivoAtualiza> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTCRServidorEfetivoAtualiza> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTCRServidorEfetivoAtualiza> item = new java.util.Vector<>();
}

