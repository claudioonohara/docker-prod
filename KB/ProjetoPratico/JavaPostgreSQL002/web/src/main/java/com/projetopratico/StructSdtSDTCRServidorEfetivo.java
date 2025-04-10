package com.projetopratico ;
import com.genexus.*;

public final  class StructSdtSDTCRServidorEfetivo implements Cloneable, java.io.Serializable
{
   public StructSdtSDTCRServidorEfetivo( )
   {
      this( -1, new ModelContext( StructSdtSDTCRServidorEfetivo.class ));
   }

   public StructSdtSDTCRServidorEfetivo( int remoteHandle ,
                                         ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTCRServidorEfetivo_Se_matricula = "" ;
      gxTv_SdtSDTCRServidorEfetivo_Pes_nome = "" ;
      gxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento = cal.getTime() ;
      gxTv_SdtSDTCRServidorEfetivo_Pes_sexo = "" ;
      gxTv_SdtSDTCRServidorEfetivo_Pes_mae = "" ;
      gxTv_SdtSDTCRServidorEfetivo_Pes_pai = "" ;
      gxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento_N = (byte)(1) ;
      gxTv_SdtSDTCRServidorEfetivo_Endereco_N = (byte)(1) ;
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

   public int getPes_id( )
   {
      return gxTv_SdtSDTCRServidorEfetivo_Pes_id ;
   }

   public void setPes_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivo_Pes_id = value ;
   }

   public String getSe_matricula( )
   {
      return gxTv_SdtSDTCRServidorEfetivo_Se_matricula ;
   }

   public void setSe_matricula( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivo_Se_matricula = value ;
   }

   public String getPes_nome( )
   {
      return gxTv_SdtSDTCRServidorEfetivo_Pes_nome ;
   }

   public void setPes_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivo_Pes_nome = value ;
   }

   public java.util.Date getPes_data_nascimento( )
   {
      return gxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento ;
   }

   public void setPes_data_nascimento( java.util.Date value )
   {
      gxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento = value ;
   }

   public String getPes_sexo( )
   {
      return gxTv_SdtSDTCRServidorEfetivo_Pes_sexo ;
   }

   public void setPes_sexo( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivo_Pes_sexo = value ;
   }

   public String getPes_mae( )
   {
      return gxTv_SdtSDTCRServidorEfetivo_Pes_mae ;
   }

   public void setPes_mae( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivo_Pes_mae = value ;
   }

   public String getPes_pai( )
   {
      return gxTv_SdtSDTCRServidorEfetivo_Pes_pai ;
   }

   public void setPes_pai( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivo_Pes_pai = value ;
   }

   public short getPes_idade( )
   {
      return gxTv_SdtSDTCRServidorEfetivo_Pes_idade ;
   }

   public void setPes_idade( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivo_Pes_idade = value ;
   }

   public java.util.Vector<com.projetopratico.StructSdtSDTCRServidorEfetivo_enderecoItem> getEndereco( )
   {
      return gxTv_SdtSDTCRServidorEfetivo_Endereco ;
   }

   public void setEndereco( java.util.Vector<com.projetopratico.StructSdtSDTCRServidorEfetivo_enderecoItem> value )
   {
      gxTv_SdtSDTCRServidorEfetivo_Endereco_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivo_Endereco = value ;
   }

   protected byte gxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento_N ;
   protected byte gxTv_SdtSDTCRServidorEfetivo_Endereco_N ;
   protected byte sdtIsNull ;
   protected short gxTv_SdtSDTCRServidorEfetivo_Pes_idade ;
   protected int gxTv_SdtSDTCRServidorEfetivo_Pes_id ;
   protected String gxTv_SdtSDTCRServidorEfetivo_Se_matricula ;
   protected String gxTv_SdtSDTCRServidorEfetivo_Pes_nome ;
   protected String gxTv_SdtSDTCRServidorEfetivo_Pes_sexo ;
   protected String gxTv_SdtSDTCRServidorEfetivo_Pes_mae ;
   protected String gxTv_SdtSDTCRServidorEfetivo_Pes_pai ;
   protected java.util.Date gxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento ;
   protected java.util.Vector<com.projetopratico.StructSdtSDTCRServidorEfetivo_enderecoItem> gxTv_SdtSDTCRServidorEfetivo_Endereco=null ;
}

