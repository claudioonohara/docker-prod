package com.projetopratico ;
import com.genexus.*;

public final  class StructSdtSDTCRServidorEfetivoAtualiza implements Cloneable, java.io.Serializable
{
   public StructSdtSDTCRServidorEfetivoAtualiza( )
   {
      this( -1, new ModelContext( StructSdtSDTCRServidorEfetivoAtualiza.class ));
   }

   public StructSdtSDTCRServidorEfetivoAtualiza( int remoteHandle ,
                                                 ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Se_matricula = "" ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_nome = "" ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento = cal.getTime() ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_sexo = "" ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_mae = "" ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_pai = "" ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento_N = (byte)(1) ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco_N = (byte)(1) ;
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

   public String getSe_matricula( )
   {
      return gxTv_SdtSDTCRServidorEfetivoAtualiza_Se_matricula ;
   }

   public void setSe_matricula( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Se_matricula = value ;
   }

   public String getPes_nome( )
   {
      return gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_nome ;
   }

   public void setPes_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_nome = value ;
   }

   public java.util.Date getPes_data_nascimento( )
   {
      return gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento ;
   }

   public void setPes_data_nascimento( java.util.Date value )
   {
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento = value ;
   }

   public String getPes_sexo( )
   {
      return gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_sexo ;
   }

   public void setPes_sexo( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_sexo = value ;
   }

   public String getPes_mae( )
   {
      return gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_mae ;
   }

   public void setPes_mae( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_mae = value ;
   }

   public String getPes_pai( )
   {
      return gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_pai ;
   }

   public void setPes_pai( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_pai = value ;
   }

   public short getPes_idade( )
   {
      return gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_idade ;
   }

   public void setPes_idade( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_idade = value ;
   }

   public java.util.Vector<com.projetopratico.StructSdtSDTCRServidorEfetivoAtualiza_enderecoItem> getEndereco( )
   {
      return gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco ;
   }

   public void setEndereco( java.util.Vector<com.projetopratico.StructSdtSDTCRServidorEfetivoAtualiza_enderecoItem> value )
   {
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco = value ;
   }

   protected byte gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento_N ;
   protected byte gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco_N ;
   protected byte sdtIsNull ;
   protected short gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_idade ;
   protected String gxTv_SdtSDTCRServidorEfetivoAtualiza_Se_matricula ;
   protected String gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_nome ;
   protected String gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_sexo ;
   protected String gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_mae ;
   protected String gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_pai ;
   protected java.util.Date gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento ;
   protected java.util.Vector<com.projetopratico.StructSdtSDTCRServidorEfetivoAtualiza_enderecoItem> gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco=null ;
}

