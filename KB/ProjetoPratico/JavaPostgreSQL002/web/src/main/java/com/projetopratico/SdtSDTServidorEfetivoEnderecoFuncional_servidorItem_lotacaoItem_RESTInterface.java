package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "SDTServidorEfetivoEnderecoFuncional.servidorItem.lotacaoItem", namespace ="ProjetoPratico", propOrder={"lot_id", "lot_data_lotacao", "lot_data_remocao", "unid_id", "unid_nome", "unid_sigla", "endereco"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_RESTInterface extends GxGenericCollectionItem<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem>
{
   public SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_RESTInterface( )
   {
      super(new com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem ());
   }

   public SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_RESTInterface( com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem psdt )
   {
      super(psdt);
   }

   @JsonProperty("lot_id")
   public String getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_id( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_id(), 8, 0)) ;
   }

   @JsonProperty("lot_id")
   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_id(  String Value )
   {
      sdt.setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_id( (int)(GXutil.lval( Value)) );
   }


   @JsonProperty("lot_data_lotacao")
   public String getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao( )
   {
      return GXutil.dateToCharREST( sdt.getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao()) ;
   }

   @JsonProperty("lot_data_lotacao")
   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao(  String Value )
   {
      sdt.setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao( GXutil.charToDateREST( Value) );
   }


   @JsonProperty("lot_data_remocao")
   public String getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao( )
   {
      return GXutil.dateToCharREST( sdt.getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao()) ;
   }

   @JsonProperty("lot_data_remocao")
   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao(  String Value )
   {
      sdt.setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao( GXutil.charToDateREST( Value) );
   }


   @JsonProperty("unid_id")
   public String getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_id( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_id(), 8, 0)) ;
   }

   @JsonProperty("unid_id")
   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_id(  String Value )
   {
      sdt.setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_id( (int)(GXutil.lval( Value)) );
   }


   @JsonProperty("unid_nome")
   public String getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_nome( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem)getSdt()).getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_nome()) ;
   }

   @JsonProperty("unid_nome")
   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_nome(  String Value )
   {
      ((com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem)getSdt()).setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_nome(Value);
   }


   @JsonProperty("unid_sigla")
   public String getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_sigla( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem)getSdt()).getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_sigla()) ;
   }

   @JsonProperty("unid_sigla")
   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_sigla(  String Value )
   {
      ((com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem)getSdt()).setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_sigla(Value);
   }


   @JsonProperty("endereco")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_RESTInterface> getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco( )
   {
      return SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_RESTInterfacefromGXObjectCollection(((com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem)getSdt()).getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco()) ;
   }

   @JsonProperty("endereco")
   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco(  Vector<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_RESTInterface> Value )
   {
      ((com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem)getSdt()).setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco(SDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItemtoGXObjectCollection(Value));
   }


   int remoteHandle = -1;
   private GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem> SDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItemtoGXObjectCollection( Vector<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_RESTInterface> collection )
   {
      GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem> result = new GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem>(com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem.class, "SDTServidorEfetivoEnderecoFuncional.servidorItem.lotacaoItem.enderecoItem", "ProjetoPratico.SDTServidorEfetivoEnderecoFuncional.servidorItem.lotacaoItem", remoteHandle);
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.add((com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem)collection.elementAt(i).getSdt());
      }
      return result ;
   }

   private Vector<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_RESTInterface> SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_RESTInterfacefromGXObjectCollection( GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem> collection )
   {
      Vector<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_RESTInterface> result = new Vector<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_RESTInterface>();
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.addElement(new com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_RESTInterface((com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem)collection.elementAt(i)));
      }
      return result ;
   }

}

