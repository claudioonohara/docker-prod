package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "SDTEfetivosUnidade.efetivosUnidadeItem.fotografiasItem", namespace ="ProjetoPratico", propOrder={"fotografia"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem_RESTInterface extends GxGenericCollectionItem<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem>
{
   public SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem_RESTInterface( )
   {
      super(new com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem ());
   }

   public SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem_RESTInterface( com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem psdt )
   {
      super(psdt);
   }

   @JsonProperty("fotografia")
   public String getgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem_Fotografia( )
   {
      return ((com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem)getSdt()).getgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem_Fotografia() ;
   }

   @JsonProperty("fotografia")
   public void setgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem_Fotografia(  String Value )
   {
      ((com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem)getSdt()).setgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem_Fotografia(Value);
   }


   int remoteHandle = -1;
}

