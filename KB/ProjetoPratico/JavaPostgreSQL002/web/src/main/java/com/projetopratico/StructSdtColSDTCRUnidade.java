package com.projetopratico ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTCRUnidade", namespace ="ProjetoPratico")
public final  class StructSdtColSDTCRUnidade implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTCRUnidade( )
   {
      this( -1, new ModelContext( StructSdtColSDTCRUnidade.class ));
   }

   public StructSdtColSDTCRUnidade( int remoteHandle ,
                                    ModelContext context )
   {
   }

   public  StructSdtColSDTCRUnidade( java.util.Vector<StructSdtSDTCRUnidade> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTCRUnidade",namespace="ProjetoPratico")
   public java.util.Vector<StructSdtSDTCRUnidade> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTCRUnidade> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTCRUnidade> item = new java.util.Vector<>();
}

