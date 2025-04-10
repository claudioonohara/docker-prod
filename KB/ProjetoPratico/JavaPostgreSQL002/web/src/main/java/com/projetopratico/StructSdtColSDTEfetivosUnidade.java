package com.projetopratico ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTEfetivosUnidade", namespace ="ProjetoPratico")
public final  class StructSdtColSDTEfetivosUnidade implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTEfetivosUnidade( )
   {
      this( -1, new ModelContext( StructSdtColSDTEfetivosUnidade.class ));
   }

   public StructSdtColSDTEfetivosUnidade( int remoteHandle ,
                                          ModelContext context )
   {
   }

   public  StructSdtColSDTEfetivosUnidade( java.util.Vector<StructSdtSDTEfetivosUnidade> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTEfetivosUnidade",namespace="ProjetoPratico")
   public java.util.Vector<StructSdtSDTEfetivosUnidade> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTEfetivosUnidade> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTEfetivosUnidade> item = new java.util.Vector<>();
}

