package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "SDTCRUnidade", namespace ="ProjetoPratico", propOrder={"unid_id", "unid_nome", "unid_sigla", "endereco"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtSDTCRUnidade_RESTInterface extends GxGenericCollectionItem<com.projetopratico.SdtSDTCRUnidade>
{
   public SdtSDTCRUnidade_RESTInterface( )
   {
      super(new com.projetopratico.SdtSDTCRUnidade ());
   }

   public SdtSDTCRUnidade_RESTInterface( com.projetopratico.SdtSDTCRUnidade psdt )
   {
      super(psdt);
   }

   @JsonProperty("unid_id")
   public String getgxTv_SdtSDTCRUnidade_Unid_id( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTCRUnidade_Unid_id(), 8, 0)) ;
   }

   @JsonProperty("unid_id")
   public void setgxTv_SdtSDTCRUnidade_Unid_id(  String Value )
   {
      sdt.setgxTv_SdtSDTCRUnidade_Unid_id( (int)(GXutil.lval( Value)) );
   }


   @JsonProperty("unid_nome")
   public String getgxTv_SdtSDTCRUnidade_Unid_nome( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTCRUnidade)getSdt()).getgxTv_SdtSDTCRUnidade_Unid_nome()) ;
   }

   @JsonProperty("unid_nome")
   public void setgxTv_SdtSDTCRUnidade_Unid_nome(  String Value )
   {
      ((com.projetopratico.SdtSDTCRUnidade)getSdt()).setgxTv_SdtSDTCRUnidade_Unid_nome(Value);
   }


   @JsonProperty("unid_sigla")
   public String getgxTv_SdtSDTCRUnidade_Unid_sigla( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTCRUnidade)getSdt()).getgxTv_SdtSDTCRUnidade_Unid_sigla()) ;
   }

   @JsonProperty("unid_sigla")
   public void setgxTv_SdtSDTCRUnidade_Unid_sigla(  String Value )
   {
      ((com.projetopratico.SdtSDTCRUnidade)getSdt()).setgxTv_SdtSDTCRUnidade_Unid_sigla(Value);
   }


   @JsonProperty("endereco")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<com.projetopratico.SdtSDTCRUnidade_enderecoItem_RESTInterface> getgxTv_SdtSDTCRUnidade_Endereco( )
   {
      return SdtSDTCRUnidade_enderecoItem_RESTInterfacefromGXObjectCollection(((com.projetopratico.SdtSDTCRUnidade)getSdt()).getgxTv_SdtSDTCRUnidade_Endereco()) ;
   }

   @JsonProperty("endereco")
   public void setgxTv_SdtSDTCRUnidade_Endereco(  Vector<com.projetopratico.SdtSDTCRUnidade_enderecoItem_RESTInterface> Value )
   {
      ((com.projetopratico.SdtSDTCRUnidade)getSdt()).setgxTv_SdtSDTCRUnidade_Endereco(SDTCRUnidade_enderecoItemtoGXObjectCollection(Value));
   }


   int remoteHandle = -1;
   private GXBaseCollection<com.projetopratico.SdtSDTCRUnidade_enderecoItem> SDTCRUnidade_enderecoItemtoGXObjectCollection( Vector<com.projetopratico.SdtSDTCRUnidade_enderecoItem_RESTInterface> collection )
   {
      GXBaseCollection<com.projetopratico.SdtSDTCRUnidade_enderecoItem> result = new GXBaseCollection<com.projetopratico.SdtSDTCRUnidade_enderecoItem>(com.projetopratico.SdtSDTCRUnidade_enderecoItem.class, "SDTCRUnidade.enderecoItem", "ProjetoPratico.SDTCRUnidade", remoteHandle);
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.add((com.projetopratico.SdtSDTCRUnidade_enderecoItem)collection.elementAt(i).getSdt());
      }
      return result ;
   }

   private Vector<com.projetopratico.SdtSDTCRUnidade_enderecoItem_RESTInterface> SdtSDTCRUnidade_enderecoItem_RESTInterfacefromGXObjectCollection( GXBaseCollection<com.projetopratico.SdtSDTCRUnidade_enderecoItem> collection )
   {
      Vector<com.projetopratico.SdtSDTCRUnidade_enderecoItem_RESTInterface> result = new Vector<com.projetopratico.SdtSDTCRUnidade_enderecoItem_RESTInterface>();
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.addElement(new com.projetopratico.SdtSDTCRUnidade_enderecoItem_RESTInterface((com.projetopratico.SdtSDTCRUnidade_enderecoItem)collection.elementAt(i)));
      }
      return result ;
   }

}

