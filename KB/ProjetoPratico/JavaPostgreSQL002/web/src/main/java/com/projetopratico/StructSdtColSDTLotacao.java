package com.projetopratico ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTLotacao", namespace ="ProjetoPratico")
public final  class StructSdtColSDTLotacao implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTLotacao( )
   {
      this( -1, new ModelContext( StructSdtColSDTLotacao.class ));
   }

   public StructSdtColSDTLotacao( int remoteHandle ,
                                  ModelContext context )
   {
   }

   public  StructSdtColSDTLotacao( java.util.Vector<StructSdtSDTLotacao> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTLotacao",namespace="ProjetoPratico")
   public java.util.Vector<StructSdtSDTLotacao> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTLotacao> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTLotacao> item = new java.util.Vector<>();
}

