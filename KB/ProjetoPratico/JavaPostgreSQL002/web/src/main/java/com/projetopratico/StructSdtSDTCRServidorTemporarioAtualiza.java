package com.projetopratico ;
import com.genexus.*;

public final  class StructSdtSDTCRServidorTemporarioAtualiza implements Cloneable, java.io.Serializable
{
   public StructSdtSDTCRServidorTemporarioAtualiza( )
   {
      this( -1, new ModelContext( StructSdtSDTCRServidorTemporarioAtualiza.class ));
   }

   public StructSdtSDTCRServidorTemporarioAtualiza( int remoteHandle ,
                                                    ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao = cal.getTime() ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao = cal.getTime() ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_nome = "" ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento = cal.getTime() ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_sexo = "" ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_mae = "" ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_pai = "" ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao_N = (byte)(1) ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao_N = (byte)(1) ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento_N = (byte)(1) ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco_N = (byte)(1) ;
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

   public java.util.Date getSt_data_admissao( )
   {
      return gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao ;
   }

   public void setSt_data_admissao( java.util.Date value )
   {
      gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao = value ;
   }

   public java.util.Date getSt_data_demissao( )
   {
      return gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao ;
   }

   public void setSt_data_demissao( java.util.Date value )
   {
      gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao = value ;
   }

   public String getPes_nome( )
   {
      return gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_nome ;
   }

   public void setPes_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_nome = value ;
   }

   public java.util.Date getPes_data_nascimento( )
   {
      return gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento ;
   }

   public void setPes_data_nascimento( java.util.Date value )
   {
      gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento = value ;
   }

   public String getPes_sexo( )
   {
      return gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_sexo ;
   }

   public void setPes_sexo( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_sexo = value ;
   }

   public String getPes_mae( )
   {
      return gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_mae ;
   }

   public void setPes_mae( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_mae = value ;
   }

   public String getPes_pai( )
   {
      return gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_pai ;
   }

   public void setPes_pai( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_pai = value ;
   }

   public java.util.Vector<com.projetopratico.StructSdtSDTCRServidorTemporarioAtualiza_enderecoItem> getEndereco( )
   {
      return gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco ;
   }

   public void setEndereco( java.util.Vector<com.projetopratico.StructSdtSDTCRServidorTemporarioAtualiza_enderecoItem> value )
   {
      gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco = value ;
   }

   protected byte gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao_N ;
   protected byte gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao_N ;
   protected byte gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento_N ;
   protected byte gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco_N ;
   protected byte sdtIsNull ;
   protected String gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_nome ;
   protected String gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_sexo ;
   protected String gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_mae ;
   protected String gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_pai ;
   protected java.util.Date gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao ;
   protected java.util.Date gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao ;
   protected java.util.Date gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento ;
   protected java.util.Vector<com.projetopratico.StructSdtSDTCRServidorTemporarioAtualiza_enderecoItem> gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco=null ;
}

