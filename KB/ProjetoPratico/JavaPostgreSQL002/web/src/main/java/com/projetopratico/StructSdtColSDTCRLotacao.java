package com.projetopratico ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTCRLotacao", namespace ="ProjetoPratico")
public final  class StructSdtColSDTCRLotacao implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTCRLotacao( )
   {
      this( -1, new ModelContext( StructSdtColSDTCRLotacao.class ));
   }

   public StructSdtColSDTCRLotacao( int remoteHandle ,
                                    ModelContext context )
   {
   }

   public  StructSdtColSDTCRLotacao( java.util.Vector<StructSdtSDTCRLotacao> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTCRLotacao",namespace="ProjetoPratico")
   public java.util.Vector<StructSdtSDTCRLotacao> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTCRLotacao> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTCRLotacao> item = new java.util.Vector<>();
}

