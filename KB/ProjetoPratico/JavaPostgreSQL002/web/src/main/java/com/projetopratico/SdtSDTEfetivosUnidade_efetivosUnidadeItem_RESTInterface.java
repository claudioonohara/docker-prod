package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "SDTEfetivosUnidade.efetivosUnidadeItem", namespace ="ProjetoPratico", propOrder={"nome", "idade", "unidadedelotacao", "fotografias"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtSDTEfetivosUnidade_efetivosUnidadeItem_RESTInterface extends GxGenericCollectionItem<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem>
{
   public SdtSDTEfetivosUnidade_efetivosUnidadeItem_RESTInterface( )
   {
      super(new com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem ());
   }

   public SdtSDTEfetivosUnidade_efetivosUnidadeItem_RESTInterface( com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem psdt )
   {
      super(psdt);
   }

   @JsonProperty("nome")
   public String getgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Nome( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem)getSdt()).getgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Nome()) ;
   }

   @JsonProperty("nome")
   public void setgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Nome(  String Value )
   {
      ((com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem)getSdt()).setgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Nome(Value);
   }


   @JsonProperty("idade")
   public Short getgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Idade( )
   {
      return ((com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem)getSdt()).getgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Idade() ;
   }

   @JsonProperty("idade")
   public void setgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Idade(  Short Value )
   {
      ((com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem)getSdt()).setgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Idade(Value);
   }


   @JsonProperty("unidadeDeLotacao")
   public String getgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Unidadedelotacao( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem)getSdt()).getgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Unidadedelotacao()) ;
   }

   @JsonProperty("unidadeDeLotacao")
   public void setgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Unidadedelotacao(  String Value )
   {
      ((com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem)getSdt()).setgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Unidadedelotacao(Value);
   }


   @JsonProperty("fotografias")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem_RESTInterface> getgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias( )
   {
      return SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem_RESTInterfacefromGXObjectCollection(((com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem)getSdt()).getgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias()) ;
   }

   @JsonProperty("fotografias")
   public void setgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias(  Vector<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem_RESTInterface> Value )
   {
      ((com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem)getSdt()).setgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias(SDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItemtoGXObjectCollection(Value));
   }


   int remoteHandle = -1;
   private GXBaseCollection<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem> SDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItemtoGXObjectCollection( Vector<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem_RESTInterface> collection )
   {
      GXBaseCollection<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem> result = new GXBaseCollection<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem>(com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem.class, "SDTEfetivosUnidade.efetivosUnidadeItem.fotografiasItem", "ProjetoPratico.SDTEfetivosUnidade.efetivosUnidadeItem", remoteHandle);
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.add((com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem)collection.elementAt(i).getSdt());
      }
      return result ;
   }

   private Vector<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem_RESTInterface> SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem_RESTInterfacefromGXObjectCollection( GXBaseCollection<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem> collection )
   {
      Vector<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem_RESTInterface> result = new Vector<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem_RESTInterface>();
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.addElement(new com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem_RESTInterface((com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem)collection.elementAt(i)));
      }
      return result ;
   }

}

