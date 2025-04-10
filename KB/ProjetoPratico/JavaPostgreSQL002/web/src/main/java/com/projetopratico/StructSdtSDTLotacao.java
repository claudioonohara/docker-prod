package com.projetopratico ;
import com.genexus.*;

public final  class StructSdtSDTLotacao implements Cloneable, java.io.Serializable
{
   public StructSdtSDTLotacao( )
   {
      this( -1, new ModelContext( StructSdtSDTLotacao.class ));
   }

   public StructSdtSDTLotacao( int remoteHandle ,
                               ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTLotacao_Lot_data_lotacao = cal.getTime() ;
      gxTv_SdtSDTLotacao_Lot_data_remocao = cal.getTime() ;
      gxTv_SdtSDTLotacao_Lot_portaria = "" ;
      gxTv_SdtSDTLotacao_Lot_data_lotacao_N = (byte)(1) ;
      gxTv_SdtSDTLotacao_Lot_data_remocao_N = (byte)(1) ;
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
      return gxTv_SdtSDTLotacao_Lot_id ;
   }

   public void setLot_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTLotacao_Lot_id = value ;
   }

   public int getPes_id( )
   {
      return gxTv_SdtSDTLotacao_Pes_id ;
   }

   public void setPes_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTLotacao_Pes_id = value ;
   }

   public int getUnid_id( )
   {
      return gxTv_SdtSDTLotacao_Unid_id ;
   }

   public void setUnid_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTLotacao_Unid_id = value ;
   }

   public java.util.Date getLot_data_lotacao( )
   {
      return gxTv_SdtSDTLotacao_Lot_data_lotacao ;
   }

   public void setLot_data_lotacao( java.util.Date value )
   {
      gxTv_SdtSDTLotacao_Lot_data_lotacao_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTLotacao_Lot_data_lotacao = value ;
   }

   public java.util.Date getLot_data_remocao( )
   {
      return gxTv_SdtSDTLotacao_Lot_data_remocao ;
   }

   public void setLot_data_remocao( java.util.Date value )
   {
      gxTv_SdtSDTLotacao_Lot_data_remocao_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTLotacao_Lot_data_remocao = value ;
   }

   public String getLot_portaria( )
   {
      return gxTv_SdtSDTLotacao_Lot_portaria ;
   }

   public void setLot_portaria( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTLotacao_Lot_portaria = value ;
   }

   protected byte gxTv_SdtSDTLotacao_Lot_data_lotacao_N ;
   protected byte gxTv_SdtSDTLotacao_Lot_data_remocao_N ;
   protected byte sdtIsNull ;
   protected int gxTv_SdtSDTLotacao_Lot_id ;
   protected int gxTv_SdtSDTLotacao_Pes_id ;
   protected int gxTv_SdtSDTLotacao_Unid_id ;
   protected String gxTv_SdtSDTLotacao_Lot_portaria ;
   protected java.util.Date gxTv_SdtSDTLotacao_Lot_data_lotacao ;
   protected java.util.Date gxTv_SdtSDTLotacao_Lot_data_remocao ;
}

