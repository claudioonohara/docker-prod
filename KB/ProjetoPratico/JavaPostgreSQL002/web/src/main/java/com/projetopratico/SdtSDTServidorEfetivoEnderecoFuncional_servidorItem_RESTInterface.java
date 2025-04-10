package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "SDTServidorEfetivoEnderecoFuncional.servidorItem", namespace ="ProjetoPratico", propOrder={"pes_id", "pes_nome", "se_matricula", "lotacao"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_RESTInterface extends GxGenericCollectionItem<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem>
{
   public SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_RESTInterface( )
   {
      super(new com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem ());
   }

   public SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_RESTInterface( com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem psdt )
   {
      super(psdt);
   }

   @JsonProperty("pes_id")
   public String getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_id( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_id(), 8, 0)) ;
   }

   @JsonProperty("pes_id")
   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_id(  String Value )
   {
      sdt.setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_id( (int)(GXutil.lval( Value)) );
   }


   @JsonProperty("pes_nome")
   public String getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_nome( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem)getSdt()).getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_nome()) ;
   }

   @JsonProperty("pes_nome")
   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_nome(  String Value )
   {
      ((com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem)getSdt()).setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_nome(Value);
   }


   @JsonProperty("se_matricula")
   public String getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Se_matricula( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem)getSdt()).getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Se_matricula()) ;
   }

   @JsonProperty("se_matricula")
   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Se_matricula(  String Value )
   {
      ((com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem)getSdt()).setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Se_matricula(Value);
   }


   @JsonProperty("lotacao")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_RESTInterface> getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao( )
   {
      return SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_RESTInterfacefromGXObjectCollection(((com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem)getSdt()).getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao()) ;
   }

   @JsonProperty("lotacao")
   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao(  Vector<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_RESTInterface> Value )
   {
      ((com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem)getSdt()).setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao(SDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItemtoGXObjectCollection(Value));
   }


   int remoteHandle = -1;
   private GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem> SDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItemtoGXObjectCollection( Vector<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_RESTInterface> collection )
   {
      GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem> result = new GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem>(com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem.class, "SDTServidorEfetivoEnderecoFuncional.servidorItem.lotacaoItem", "ProjetoPratico.SDTServidorEfetivoEnderecoFuncional.servidorItem", remoteHandle);
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.add((com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem)collection.elementAt(i).getSdt());
      }
      return result ;
   }

   private Vector<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_RESTInterface> SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_RESTInterfacefromGXObjectCollection( GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem> collection )
   {
      Vector<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_RESTInterface> result = new Vector<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_RESTInterface>();
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.addElement(new com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_RESTInterface((com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem)collection.elementAt(i)));
      }
      return result ;
   }

}

