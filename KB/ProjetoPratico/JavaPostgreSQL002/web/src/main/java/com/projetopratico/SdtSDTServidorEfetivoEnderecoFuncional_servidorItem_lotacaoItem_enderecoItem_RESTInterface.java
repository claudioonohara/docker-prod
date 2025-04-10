package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "SDTServidorEfetivoEnderecoFuncional.servidorItem.lotacaoItem.enderecoItem", namespace ="ProjetoPratico", propOrder={"end_id", "end_logradouro", "end_numero", "end_bairro", "cid_id", "cid_nome", "cid_uf"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_RESTInterface extends GxGenericCollectionItem<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem>
{
   public SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_RESTInterface( )
   {
      super(new com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem ());
   }

   public SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_RESTInterface( com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem psdt )
   {
      super(psdt);
   }

   @JsonProperty("end_id")
   public String getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_id( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_id(), 8, 0)) ;
   }

   @JsonProperty("end_id")
   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_id(  String Value )
   {
      sdt.setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_id( (int)(GXutil.lval( Value)) );
   }


   @JsonProperty("end_logradouro")
   public String getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_logradouro( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem)getSdt()).getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_logradouro()) ;
   }

   @JsonProperty("end_logradouro")
   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_logradouro(  String Value )
   {
      ((com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem)getSdt()).setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_logradouro(Value);
   }


   @JsonProperty("end_numero")
   public String getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_numero( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_numero(), 8, 0)) ;
   }

   @JsonProperty("end_numero")
   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_numero(  String Value )
   {
      sdt.setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_numero( (int)(GXutil.lval( Value)) );
   }


   @JsonProperty("end_bairro")
   public String getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_bairro( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem)getSdt()).getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_bairro()) ;
   }

   @JsonProperty("end_bairro")
   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_bairro(  String Value )
   {
      ((com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem)getSdt()).setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_bairro(Value);
   }


   @JsonProperty("cid_id")
   public String getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_id( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_id(), 8, 0)) ;
   }

   @JsonProperty("cid_id")
   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_id(  String Value )
   {
      sdt.setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_id( (int)(GXutil.lval( Value)) );
   }


   @JsonProperty("cid_nome")
   public String getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_nome( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem)getSdt()).getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_nome()) ;
   }

   @JsonProperty("cid_nome")
   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_nome(  String Value )
   {
      ((com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem)getSdt()).setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_nome(Value);
   }


   @JsonProperty("cid_uf")
   public String getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_uf( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem)getSdt()).getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_uf()) ;
   }

   @JsonProperty("cid_uf")
   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_uf(  String Value )
   {
      ((com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem)getSdt()).setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_uf(Value);
   }


   int remoteHandle = -1;
}

