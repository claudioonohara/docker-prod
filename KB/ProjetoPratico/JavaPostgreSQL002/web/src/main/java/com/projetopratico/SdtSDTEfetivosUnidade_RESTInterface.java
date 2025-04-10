package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "SDTEfetivosUnidade", namespace ="ProjetoPratico", propOrder={"paginaatual", "nroporpagina", "totalitens", "totalpaginas", "efetivosunidade"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtSDTEfetivosUnidade_RESTInterface extends GxGenericCollectionItem<com.projetopratico.SdtSDTEfetivosUnidade>
{
   public SdtSDTEfetivosUnidade_RESTInterface( )
   {
      super(new com.projetopratico.SdtSDTEfetivosUnidade ());
   }

   public SdtSDTEfetivosUnidade_RESTInterface( com.projetopratico.SdtSDTEfetivosUnidade psdt )
   {
      super(psdt);
   }

   @JsonProperty("PaginaAtual")
   public String getgxTv_SdtSDTEfetivosUnidade_Paginaatual( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTEfetivosUnidade_Paginaatual(), 8, 0)) ;
   }

   @JsonProperty("PaginaAtual")
   public void setgxTv_SdtSDTEfetivosUnidade_Paginaatual(  String Value )
   {
      sdt.setgxTv_SdtSDTEfetivosUnidade_Paginaatual( (int)(GXutil.lval( Value)) );
   }


   @JsonProperty("NroPorPagina")
   public String getgxTv_SdtSDTEfetivosUnidade_Nroporpagina( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTEfetivosUnidade_Nroporpagina(), 8, 0)) ;
   }

   @JsonProperty("NroPorPagina")
   public void setgxTv_SdtSDTEfetivosUnidade_Nroporpagina(  String Value )
   {
      sdt.setgxTv_SdtSDTEfetivosUnidade_Nroporpagina( (int)(GXutil.lval( Value)) );
   }


   @JsonProperty("TotalItens")
   public String getgxTv_SdtSDTEfetivosUnidade_Totalitens( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTEfetivosUnidade_Totalitens(), 8, 0)) ;
   }

   @JsonProperty("TotalItens")
   public void setgxTv_SdtSDTEfetivosUnidade_Totalitens(  String Value )
   {
      sdt.setgxTv_SdtSDTEfetivosUnidade_Totalitens( (int)(GXutil.lval( Value)) );
   }


   @JsonProperty("TotalPaginas")
   public String getgxTv_SdtSDTEfetivosUnidade_Totalpaginas( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTEfetivosUnidade_Totalpaginas(), 8, 0)) ;
   }

   @JsonProperty("TotalPaginas")
   public void setgxTv_SdtSDTEfetivosUnidade_Totalpaginas(  String Value )
   {
      sdt.setgxTv_SdtSDTEfetivosUnidade_Totalpaginas( (int)(GXutil.lval( Value)) );
   }


   @JsonProperty("efetivosUnidade")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_RESTInterface> getgxTv_SdtSDTEfetivosUnidade_Efetivosunidade( )
   {
      return SdtSDTEfetivosUnidade_efetivosUnidadeItem_RESTInterfacefromGXObjectCollection(((com.projetopratico.SdtSDTEfetivosUnidade)getSdt()).getgxTv_SdtSDTEfetivosUnidade_Efetivosunidade()) ;
   }

   @JsonProperty("efetivosUnidade")
   public void setgxTv_SdtSDTEfetivosUnidade_Efetivosunidade(  Vector<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_RESTInterface> Value )
   {
      ((com.projetopratico.SdtSDTEfetivosUnidade)getSdt()).setgxTv_SdtSDTEfetivosUnidade_Efetivosunidade(SDTEfetivosUnidade_efetivosUnidadeItemtoGXObjectCollection(Value));
   }


   int remoteHandle = -1;
   private GXBaseCollection<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem> SDTEfetivosUnidade_efetivosUnidadeItemtoGXObjectCollection( Vector<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_RESTInterface> collection )
   {
      GXBaseCollection<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem> result = new GXBaseCollection<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem>(com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem.class, "SDTEfetivosUnidade.efetivosUnidadeItem", "ProjetoPratico.SDTEfetivosUnidade", remoteHandle);
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.add((com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem)collection.elementAt(i).getSdt());
      }
      return result ;
   }

   private Vector<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_RESTInterface> SdtSDTEfetivosUnidade_efetivosUnidadeItem_RESTInterfacefromGXObjectCollection( GXBaseCollection<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem> collection )
   {
      Vector<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_RESTInterface> result = new Vector<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_RESTInterface>();
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.addElement(new com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_RESTInterface((com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem)collection.elementAt(i)));
      }
      return result ;
   }

}

