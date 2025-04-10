package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "SDTCRServidorEfetivoAtualiza.enderecoItem", namespace ="ProjetoPratico", propOrder={"end_id", "end_tipo_logradouro", "end_logradouro", "end_numero", "end_bairro", "cid_id", "cid_nome", "cid_uf"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtSDTCRServidorEfetivoAtualiza_enderecoItem_RESTInterface extends GxGenericCollectionItem<com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem>
{
   public SdtSDTCRServidorEfetivoAtualiza_enderecoItem_RESTInterface( )
   {
      super(new com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem ());
   }

   public SdtSDTCRServidorEfetivoAtualiza_enderecoItem_RESTInterface( com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem psdt )
   {
      super(psdt);
   }

   @JsonProperty("end_id")
   public String getgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_id( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_id(), 8, 0)) ;
   }

   @JsonProperty("end_id")
   public void setgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_id(  String Value )
   {
      sdt.setgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_id( (int)(GXutil.lval( Value)) );
   }


   @JsonProperty("end_tipo_logradouro")
   public String getgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_tipo_logradouro( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem)getSdt()).getgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_tipo_logradouro()) ;
   }

   @JsonProperty("end_tipo_logradouro")
   public void setgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_tipo_logradouro(  String Value )
   {
      ((com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem)getSdt()).setgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_tipo_logradouro(Value);
   }


   @JsonProperty("end_logradouro")
   public String getgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_logradouro( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem)getSdt()).getgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_logradouro()) ;
   }

   @JsonProperty("end_logradouro")
   public void setgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_logradouro(  String Value )
   {
      ((com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem)getSdt()).setgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_logradouro(Value);
   }


   @JsonProperty("end_numero")
   public String getgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_numero( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_numero(), 8, 0)) ;
   }

   @JsonProperty("end_numero")
   public void setgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_numero(  String Value )
   {
      sdt.setgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_numero( (int)(GXutil.lval( Value)) );
   }


   @JsonProperty("end_bairro")
   public String getgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_bairro( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem)getSdt()).getgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_bairro()) ;
   }

   @JsonProperty("end_bairro")
   public void setgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_bairro(  String Value )
   {
      ((com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem)getSdt()).setgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_End_bairro(Value);
   }


   @JsonProperty("cid_id")
   public String getgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_Cid_id( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_Cid_id(), 8, 0)) ;
   }

   @JsonProperty("cid_id")
   public void setgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_Cid_id(  String Value )
   {
      sdt.setgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_Cid_id( (int)(GXutil.lval( Value)) );
   }


   @JsonProperty("cid_nome")
   public String getgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_Cid_nome( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem)getSdt()).getgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_Cid_nome()) ;
   }

   @JsonProperty("cid_nome")
   public void setgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_Cid_nome(  String Value )
   {
      ((com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem)getSdt()).setgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_Cid_nome(Value);
   }


   @JsonProperty("cid_uf")
   public String getgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_Cid_uf( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem)getSdt()).getgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_Cid_uf()) ;
   }

   @JsonProperty("cid_uf")
   public void setgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_Cid_uf(  String Value )
   {
      ((com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem)getSdt()).setgxTv_SdtSDTCRServidorEfetivoAtualiza_enderecoItem_Cid_uf(Value);
   }


   int remoteHandle = -1;
}

