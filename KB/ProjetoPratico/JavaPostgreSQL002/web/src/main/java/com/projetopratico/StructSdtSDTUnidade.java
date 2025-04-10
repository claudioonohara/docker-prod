package com.projetopratico ;
import com.genexus.*;

public final  class StructSdtSDTUnidade implements Cloneable, java.io.Serializable
{
   public StructSdtSDTUnidade( )
   {
      this( -1, new ModelContext( StructSdtSDTUnidade.class ));
   }

   public StructSdtSDTUnidade( int remoteHandle ,
                               ModelContext context )
   {
      gxTv_SdtSDTUnidade_Unid_nome = "" ;
      gxTv_SdtSDTUnidade_Unid_sigla = "" ;
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

   public int getUnid_id( )
   {
      return gxTv_SdtSDTUnidade_Unid_id ;
   }

   public void setUnid_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTUnidade_Unid_id = value ;
   }

   public String getUnid_nome( )
   {
      return gxTv_SdtSDTUnidade_Unid_nome ;
   }

   public void setUnid_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTUnidade_Unid_nome = value ;
   }

   public String getUnid_sigla( )
   {
      return gxTv_SdtSDTUnidade_Unid_sigla ;
   }

   public void setUnid_sigla( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTUnidade_Unid_sigla = value ;
   }

   protected byte sdtIsNull ;
   protected int gxTv_SdtSDTUnidade_Unid_id ;
   protected String gxTv_SdtSDTUnidade_Unid_nome ;
   protected String gxTv_SdtSDTUnidade_Unid_sigla ;
}

