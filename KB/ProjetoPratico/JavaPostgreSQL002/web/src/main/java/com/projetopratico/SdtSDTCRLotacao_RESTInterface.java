package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "SDTCRLotacao", namespace ="ProjetoPratico", propOrder={"lot_id", "pes_id", "unid_id", "lot_data_lotacao", "lot_data_remocao", "lot_portaria", "pes_nome", "pes_data_nascimento", "pes_sexo", "pes_mae", "pes_pai", "unid_nome", "unid_sigla"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtSDTCRLotacao_RESTInterface extends GxGenericCollectionItem<com.projetopratico.SdtSDTCRLotacao>
{
   public SdtSDTCRLotacao_RESTInterface( )
   {
      super(new com.projetopratico.SdtSDTCRLotacao ());
   }

   public SdtSDTCRLotacao_RESTInterface( com.projetopratico.SdtSDTCRLotacao psdt )
   {
      super(psdt);
   }

   @JsonProperty("lot_id")
   public String getgxTv_SdtSDTCRLotacao_Lot_id( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTCRLotacao_Lot_id(), 8, 0)) ;
   }

   @JsonProperty("lot_id")
   public void setgxTv_SdtSDTCRLotacao_Lot_id(  String Value )
   {
      sdt.setgxTv_SdtSDTCRLotacao_Lot_id( (int)(GXutil.lval( Value)) );
   }


   @JsonProperty("pes_id")
   public String getgxTv_SdtSDTCRLotacao_Pes_id( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTCRLotacao_Pes_id(), 8, 0)) ;
   }

   @JsonProperty("pes_id")
   public void setgxTv_SdtSDTCRLotacao_Pes_id(  String Value )
   {
      sdt.setgxTv_SdtSDTCRLotacao_Pes_id( (int)(GXutil.lval( Value)) );
   }


   @JsonProperty("unid_id")
   public String getgxTv_SdtSDTCRLotacao_Unid_id( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTCRLotacao_Unid_id(), 8, 0)) ;
   }

   @JsonProperty("unid_id")
   public void setgxTv_SdtSDTCRLotacao_Unid_id(  String Value )
   {
      sdt.setgxTv_SdtSDTCRLotacao_Unid_id( (int)(GXutil.lval( Value)) );
   }


   @JsonProperty("lot_data_lotacao")
   public String getgxTv_SdtSDTCRLotacao_Lot_data_lotacao( )
   {
      return GXutil.dateToCharREST( sdt.getgxTv_SdtSDTCRLotacao_Lot_data_lotacao()) ;
   }

   @JsonProperty("lot_data_lotacao")
   public void setgxTv_SdtSDTCRLotacao_Lot_data_lotacao(  String Value )
   {
      sdt.setgxTv_SdtSDTCRLotacao_Lot_data_lotacao( GXutil.charToDateREST( Value) );
   }


   @JsonProperty("lot_data_remocao")
   public String getgxTv_SdtSDTCRLotacao_Lot_data_remocao( )
   {
      return GXutil.dateToCharREST( sdt.getgxTv_SdtSDTCRLotacao_Lot_data_remocao()) ;
   }

   @JsonProperty("lot_data_remocao")
   public void setgxTv_SdtSDTCRLotacao_Lot_data_remocao(  String Value )
   {
      sdt.setgxTv_SdtSDTCRLotacao_Lot_data_remocao( GXutil.charToDateREST( Value) );
   }


   @JsonProperty("lot_portaria")
   public String getgxTv_SdtSDTCRLotacao_Lot_portaria( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTCRLotacao)getSdt()).getgxTv_SdtSDTCRLotacao_Lot_portaria()) ;
   }

   @JsonProperty("lot_portaria")
   public void setgxTv_SdtSDTCRLotacao_Lot_portaria(  String Value )
   {
      ((com.projetopratico.SdtSDTCRLotacao)getSdt()).setgxTv_SdtSDTCRLotacao_Lot_portaria(Value);
   }


   @JsonProperty("pes_nome")
   public String getgxTv_SdtSDTCRLotacao_Pes_nome( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTCRLotacao)getSdt()).getgxTv_SdtSDTCRLotacao_Pes_nome()) ;
   }

   @JsonProperty("pes_nome")
   public void setgxTv_SdtSDTCRLotacao_Pes_nome(  String Value )
   {
      ((com.projetopratico.SdtSDTCRLotacao)getSdt()).setgxTv_SdtSDTCRLotacao_Pes_nome(Value);
   }


   @JsonProperty("pes_data_nascimento")
   public String getgxTv_SdtSDTCRLotacao_Pes_data_nascimento( )
   {
      return GXutil.dateToCharREST( sdt.getgxTv_SdtSDTCRLotacao_Pes_data_nascimento()) ;
   }

   @JsonProperty("pes_data_nascimento")
   public void setgxTv_SdtSDTCRLotacao_Pes_data_nascimento(  String Value )
   {
      sdt.setgxTv_SdtSDTCRLotacao_Pes_data_nascimento( GXutil.charToDateREST( Value) );
   }


   @JsonProperty("pes_sexo")
   public String getgxTv_SdtSDTCRLotacao_Pes_sexo( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTCRLotacao)getSdt()).getgxTv_SdtSDTCRLotacao_Pes_sexo()) ;
   }

   @JsonProperty("pes_sexo")
   public void setgxTv_SdtSDTCRLotacao_Pes_sexo(  String Value )
   {
      ((com.projetopratico.SdtSDTCRLotacao)getSdt()).setgxTv_SdtSDTCRLotacao_Pes_sexo(Value);
   }


   @JsonProperty("pes_mae")
   public String getgxTv_SdtSDTCRLotacao_Pes_mae( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTCRLotacao)getSdt()).getgxTv_SdtSDTCRLotacao_Pes_mae()) ;
   }

   @JsonProperty("pes_mae")
   public void setgxTv_SdtSDTCRLotacao_Pes_mae(  String Value )
   {
      ((com.projetopratico.SdtSDTCRLotacao)getSdt()).setgxTv_SdtSDTCRLotacao_Pes_mae(Value);
   }


   @JsonProperty("pes_pai")
   public String getgxTv_SdtSDTCRLotacao_Pes_pai( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTCRLotacao)getSdt()).getgxTv_SdtSDTCRLotacao_Pes_pai()) ;
   }

   @JsonProperty("pes_pai")
   public void setgxTv_SdtSDTCRLotacao_Pes_pai(  String Value )
   {
      ((com.projetopratico.SdtSDTCRLotacao)getSdt()).setgxTv_SdtSDTCRLotacao_Pes_pai(Value);
   }


   @JsonProperty("unid_nome")
   public String getgxTv_SdtSDTCRLotacao_Unid_nome( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTCRLotacao)getSdt()).getgxTv_SdtSDTCRLotacao_Unid_nome()) ;
   }

   @JsonProperty("unid_nome")
   public void setgxTv_SdtSDTCRLotacao_Unid_nome(  String Value )
   {
      ((com.projetopratico.SdtSDTCRLotacao)getSdt()).setgxTv_SdtSDTCRLotacao_Unid_nome(Value);
   }


   @JsonProperty("unid_sigla")
   public String getgxTv_SdtSDTCRLotacao_Unid_sigla( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTCRLotacao)getSdt()).getgxTv_SdtSDTCRLotacao_Unid_sigla()) ;
   }

   @JsonProperty("unid_sigla")
   public void setgxTv_SdtSDTCRLotacao_Unid_sigla(  String Value )
   {
      ((com.projetopratico.SdtSDTCRLotacao)getSdt()).setgxTv_SdtSDTCRLotacao_Unid_sigla(Value);
   }


   int remoteHandle = -1;
}

