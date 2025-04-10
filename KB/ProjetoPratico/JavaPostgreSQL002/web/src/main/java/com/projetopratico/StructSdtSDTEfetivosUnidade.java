package com.projetopratico ;
import com.genexus.*;

public final  class StructSdtSDTEfetivosUnidade implements Cloneable, java.io.Serializable
{
   public StructSdtSDTEfetivosUnidade( )
   {
      this( -1, new ModelContext( StructSdtSDTEfetivosUnidade.class ));
   }

   public StructSdtSDTEfetivosUnidade( int remoteHandle ,
                                       ModelContext context )
   {
      gxTv_SdtSDTEfetivosUnidade_Efetivosunidade_N = (byte)(1) ;
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

   public int getPaginaatual( )
   {
      return gxTv_SdtSDTEfetivosUnidade_Paginaatual ;
   }

   public void setPaginaatual( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTEfetivosUnidade_Paginaatual = value ;
   }

   public int getNroporpagina( )
   {
      return gxTv_SdtSDTEfetivosUnidade_Nroporpagina ;
   }

   public void setNroporpagina( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTEfetivosUnidade_Nroporpagina = value ;
   }

   public int getTotalitens( )
   {
      return gxTv_SdtSDTEfetivosUnidade_Totalitens ;
   }

   public void setTotalitens( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTEfetivosUnidade_Totalitens = value ;
   }

   public int getTotalpaginas( )
   {
      return gxTv_SdtSDTEfetivosUnidade_Totalpaginas ;
   }

   public void setTotalpaginas( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTEfetivosUnidade_Totalpaginas = value ;
   }

   public java.util.Vector<com.projetopratico.StructSdtSDTEfetivosUnidade_efetivosUnidadeItem> getEfetivosunidade( )
   {
      return gxTv_SdtSDTEfetivosUnidade_Efetivosunidade ;
   }

   public void setEfetivosunidade( java.util.Vector<com.projetopratico.StructSdtSDTEfetivosUnidade_efetivosUnidadeItem> value )
   {
      gxTv_SdtSDTEfetivosUnidade_Efetivosunidade_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTEfetivosUnidade_Efetivosunidade = value ;
   }

   protected byte gxTv_SdtSDTEfetivosUnidade_Efetivosunidade_N ;
   protected byte sdtIsNull ;
   protected int gxTv_SdtSDTEfetivosUnidade_Paginaatual ;
   protected int gxTv_SdtSDTEfetivosUnidade_Nroporpagina ;
   protected int gxTv_SdtSDTEfetivosUnidade_Totalitens ;
   protected int gxTv_SdtSDTEfetivosUnidade_Totalpaginas ;
   protected java.util.Vector<com.projetopratico.StructSdtSDTEfetivosUnidade_efetivosUnidadeItem> gxTv_SdtSDTEfetivosUnidade_Efetivosunidade=null ;
}

