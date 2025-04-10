package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "SDTFotoPessoa", namespace ="ProjetoPratico", propOrder={"fp_id", "pes_id", "fp_data", "fp_bucket", "fp_hash", "fp_foto_link"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtSDTFotoPessoa_RESTInterface extends GxGenericCollectionItem<com.projetopratico.SdtSDTFotoPessoa>
{
   public SdtSDTFotoPessoa_RESTInterface( )
   {
      super(new com.projetopratico.SdtSDTFotoPessoa ());
   }

   public SdtSDTFotoPessoa_RESTInterface( com.projetopratico.SdtSDTFotoPessoa psdt )
   {
      super(psdt);
   }

   @JsonProperty("fp_id")
   public String getgxTv_SdtSDTFotoPessoa_Fp_id( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTFotoPessoa_Fp_id(), 8, 0)) ;
   }

   @JsonProperty("fp_id")
   public void setgxTv_SdtSDTFotoPessoa_Fp_id(  String Value )
   {
      sdt.setgxTv_SdtSDTFotoPessoa_Fp_id( (int)(GXutil.lval( Value)) );
   }


   @JsonProperty("pes_id")
   public String getgxTv_SdtSDTFotoPessoa_Pes_id( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTFotoPessoa_Pes_id(), 8, 0)) ;
   }

   @JsonProperty("pes_id")
   public void setgxTv_SdtSDTFotoPessoa_Pes_id(  String Value )
   {
      sdt.setgxTv_SdtSDTFotoPessoa_Pes_id( (int)(GXutil.lval( Value)) );
   }


   @JsonProperty("fp_data")
   public String getgxTv_SdtSDTFotoPessoa_Fp_data( )
   {
      return GXutil.dateToCharREST( sdt.getgxTv_SdtSDTFotoPessoa_Fp_data()) ;
   }

   @JsonProperty("fp_data")
   public void setgxTv_SdtSDTFotoPessoa_Fp_data(  String Value )
   {
      sdt.setgxTv_SdtSDTFotoPessoa_Fp_data( GXutil.charToDateREST( Value) );
   }


   @JsonProperty("fp_bucket")
   public String getgxTv_SdtSDTFotoPessoa_Fp_bucket( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTFotoPessoa)getSdt()).getgxTv_SdtSDTFotoPessoa_Fp_bucket()) ;
   }

   @JsonProperty("fp_bucket")
   public void setgxTv_SdtSDTFotoPessoa_Fp_bucket(  String Value )
   {
      ((com.projetopratico.SdtSDTFotoPessoa)getSdt()).setgxTv_SdtSDTFotoPessoa_Fp_bucket(Value);
   }


   @JsonProperty("fp_hash")
   public String getgxTv_SdtSDTFotoPessoa_Fp_hash( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTFotoPessoa)getSdt()).getgxTv_SdtSDTFotoPessoa_Fp_hash()) ;
   }

   @JsonProperty("fp_hash")
   public void setgxTv_SdtSDTFotoPessoa_Fp_hash(  String Value )
   {
      ((com.projetopratico.SdtSDTFotoPessoa)getSdt()).setgxTv_SdtSDTFotoPessoa_Fp_hash(Value);
   }


   @JsonProperty("fp_foto_link")
   public String getgxTv_SdtSDTFotoPessoa_Fp_foto_link( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTFotoPessoa)getSdt()).getgxTv_SdtSDTFotoPessoa_Fp_foto_link()) ;
   }

   @JsonProperty("fp_foto_link")
   public void setgxTv_SdtSDTFotoPessoa_Fp_foto_link(  String Value )
   {
      ((com.projetopratico.SdtSDTFotoPessoa)getSdt()).setgxTv_SdtSDTFotoPessoa_Fp_foto_link(Value);
   }


   int remoteHandle = -1;
}

