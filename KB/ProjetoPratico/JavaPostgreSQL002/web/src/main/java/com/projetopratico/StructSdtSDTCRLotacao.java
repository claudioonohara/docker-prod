package com.projetopratico ;
import com.genexus.*;

public final  class StructSdtSDTCRLotacao implements Cloneable, java.io.Serializable
{
   public StructSdtSDTCRLotacao( )
   {
      this( -1, new ModelContext( StructSdtSDTCRLotacao.class ));
   }

   public StructSdtSDTCRLotacao( int remoteHandle ,
                                 ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTCRLotacao_Lot_data_lotacao = cal.getTime() ;
      gxTv_SdtSDTCRLotacao_Lot_data_remocao = cal.getTime() ;
      gxTv_SdtSDTCRLotacao_Lot_portaria = "" ;
      gxTv_SdtSDTCRLotacao_Pes_nome = "" ;
      gxTv_SdtSDTCRLotacao_Pes_data_nascimento = cal.getTime() ;
      gxTv_SdtSDTCRLotacao_Pes_sexo = "" ;
      gxTv_SdtSDTCRLotacao_Pes_mae = "" ;
      gxTv_SdtSDTCRLotacao_Pes_pai = "" ;
      gxTv_SdtSDTCRLotacao_Unid_nome = "" ;
      gxTv_SdtSDTCRLotacao_Unid_sigla = "" ;
      gxTv_SdtSDTCRLotacao_Lot_data_lotacao_N = (byte)(1) ;
      gxTv_SdtSDTCRLotacao_Lot_data_remocao_N = (byte)(1) ;
      gxTv_SdtSDTCRLotacao_Pes_data_nascimento_N = (byte)(1) ;
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

   public int getLot_id( )
   {
      return gxTv_SdtSDTCRLotacao_Lot_id ;
   }

   public void setLot_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRLotacao_Lot_id = value ;
   }

   public int getPes_id( )
   {
      return gxTv_SdtSDTCRLotacao_Pes_id ;
   }

   public void setPes_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRLotacao_Pes_id = value ;
   }

   public int getUnid_id( )
   {
      return gxTv_SdtSDTCRLotacao_Unid_id ;
   }

   public void setUnid_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRLotacao_Unid_id = value ;
   }

   public java.util.Date getLot_data_lotacao( )
   {
      return gxTv_SdtSDTCRLotacao_Lot_data_lotacao ;
   }

   public void setLot_data_lotacao( java.util.Date value )
   {
      gxTv_SdtSDTCRLotacao_Lot_data_lotacao_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRLotacao_Lot_data_lotacao = value ;
   }

   public java.util.Date getLot_data_remocao( )
   {
      return gxTv_SdtSDTCRLotacao_Lot_data_remocao ;
   }

   public void setLot_data_remocao( java.util.Date value )
   {
      gxTv_SdtSDTCRLotacao_Lot_data_remocao_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRLotacao_Lot_data_remocao = value ;
   }

   public String getLot_portaria( )
   {
      return gxTv_SdtSDTCRLotacao_Lot_portaria ;
   }

   public void setLot_portaria( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRLotacao_Lot_portaria = value ;
   }

   public String getPes_nome( )
   {
      return gxTv_SdtSDTCRLotacao_Pes_nome ;
   }

   public void setPes_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRLotacao_Pes_nome = value ;
   }

   public java.util.Date getPes_data_nascimento( )
   {
      return gxTv_SdtSDTCRLotacao_Pes_data_nascimento ;
   }

   public void setPes_data_nascimento( java.util.Date value )
   {
      gxTv_SdtSDTCRLotacao_Pes_data_nascimento_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRLotacao_Pes_data_nascimento = value ;
   }

   public String getPes_sexo( )
   {
      return gxTv_SdtSDTCRLotacao_Pes_sexo ;
   }

   public void setPes_sexo( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRLotacao_Pes_sexo = value ;
   }

   public String getPes_mae( )
   {
      return gxTv_SdtSDTCRLotacao_Pes_mae ;
   }

   public void setPes_mae( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRLotacao_Pes_mae = value ;
   }

   public String getPes_pai( )
   {
      return gxTv_SdtSDTCRLotacao_Pes_pai ;
   }

   public void setPes_pai( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRLotacao_Pes_pai = value ;
   }

   public String getUnid_nome( )
   {
      return gxTv_SdtSDTCRLotacao_Unid_nome ;
   }

   public void setUnid_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRLotacao_Unid_nome = value ;
   }

   public String getUnid_sigla( )
   {
      return gxTv_SdtSDTCRLotacao_Unid_sigla ;
   }

   public void setUnid_sigla( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRLotacao_Unid_sigla = value ;
   }

   protected byte gxTv_SdtSDTCRLotacao_Lot_data_lotacao_N ;
   protected byte gxTv_SdtSDTCRLotacao_Lot_data_remocao_N ;
   protected byte gxTv_SdtSDTCRLotacao_Pes_data_nascimento_N ;
   protected byte sdtIsNull ;
   protected int gxTv_SdtSDTCRLotacao_Lot_id ;
   protected int gxTv_SdtSDTCRLotacao_Pes_id ;
   protected int gxTv_SdtSDTCRLotacao_Unid_id ;
   protected String gxTv_SdtSDTCRLotacao_Lot_portaria ;
   protected String gxTv_SdtSDTCRLotacao_Pes_nome ;
   protected String gxTv_SdtSDTCRLotacao_Pes_sexo ;
   protected String gxTv_SdtSDTCRLotacao_Pes_mae ;
   protected String gxTv_SdtSDTCRLotacao_Pes_pai ;
   protected String gxTv_SdtSDTCRLotacao_Unid_nome ;
   protected String gxTv_SdtSDTCRLotacao_Unid_sigla ;
   protected java.util.Date gxTv_SdtSDTCRLotacao_Lot_data_lotacao ;
   protected java.util.Date gxTv_SdtSDTCRLotacao_Lot_data_remocao ;
   protected java.util.Date gxTv_SdtSDTCRLotacao_Pes_data_nascimento ;
}

