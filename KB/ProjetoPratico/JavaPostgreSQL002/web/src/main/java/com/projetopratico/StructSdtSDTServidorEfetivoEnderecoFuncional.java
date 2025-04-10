package com.projetopratico ;
import com.genexus.*;

public final  class StructSdtSDTServidorEfetivoEnderecoFuncional implements Cloneable, java.io.Serializable
{
   public StructSdtSDTServidorEfetivoEnderecoFuncional( )
   {
      this( -1, new ModelContext( StructSdtSDTServidorEfetivoEnderecoFuncional.class ));
   }

   public StructSdtSDTServidorEfetivoEnderecoFuncional( int remoteHandle ,
                                                        ModelContext context )
   {
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor_N = (byte)(1) ;
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

   public java.util.Vector<com.projetopratico.StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem> getServidor( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor ;
   }

   public void setServidor( java.util.Vector<com.projetopratico.StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem> value )
   {
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor = value ;
   }

   public int getPaginaatual( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Paginaatual ;
   }

   public void setPaginaatual( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Paginaatual = value ;
   }

   public int getTotalpaginas( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalpaginas ;
   }

   public void setTotalpaginas( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalpaginas = value ;
   }

   public int getTotalitens( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalitens ;
   }

   public void setTotalitens( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalitens = value ;
   }

   public int getNroporpagina( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Nroporpagina ;
   }

   public void setNroporpagina( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Nroporpagina = value ;
   }

   protected byte gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor_N ;
   protected byte sdtIsNull ;
   protected int gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Paginaatual ;
   protected int gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalpaginas ;
   protected int gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalitens ;
   protected int gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Nroporpagina ;
   protected java.util.Vector<com.projetopratico.StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem> gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor=null ;
}

