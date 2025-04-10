package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "SDTServidorEfetivoEnderecoFuncional", namespace ="ProjetoPratico", propOrder={"servidor", "paginaatual", "totalpaginas", "totalitens", "nroporpagina"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtSDTServidorEfetivoEnderecoFuncional_RESTInterface extends GxGenericCollectionItem<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional>
{
   public SdtSDTServidorEfetivoEnderecoFuncional_RESTInterface( )
   {
      super(new com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional ());
   }

   public SdtSDTServidorEfetivoEnderecoFuncional_RESTInterface( com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional psdt )
   {
      super(psdt);
   }

   @JsonProperty("servidor")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_RESTInterface> getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor( )
   {
      return SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_RESTInterfacefromGXObjectCollection(((com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional)getSdt()).getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor()) ;
   }

   @JsonProperty("servidor")
   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor(  Vector<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_RESTInterface> Value )
   {
      ((com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional)getSdt()).setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor(SDTServidorEfetivoEnderecoFuncional_servidorItemtoGXObjectCollection(Value));
   }


   @JsonProperty("PaginaAtual")
   public String getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Paginaatual( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Paginaatual(), 8, 0)) ;
   }

   @JsonProperty("PaginaAtual")
   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Paginaatual(  String Value )
   {
      sdt.setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Paginaatual( (int)(GXutil.lval( Value)) );
   }


   @JsonProperty("TotalPaginas")
   public String getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalpaginas( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalpaginas(), 8, 0)) ;
   }

   @JsonProperty("TotalPaginas")
   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalpaginas(  String Value )
   {
      sdt.setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalpaginas( (int)(GXutil.lval( Value)) );
   }


   @JsonProperty("TotalItens")
   public String getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalitens( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalitens(), 8, 0)) ;
   }

   @JsonProperty("TotalItens")
   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalitens(  String Value )
   {
      sdt.setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalitens( (int)(GXutil.lval( Value)) );
   }


   @JsonProperty("NroPorPagina")
   public String getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Nroporpagina( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Nroporpagina(), 8, 0)) ;
   }

   @JsonProperty("NroPorPagina")
   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Nroporpagina(  String Value )
   {
      sdt.setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Nroporpagina( (int)(GXutil.lval( Value)) );
   }


   int remoteHandle = -1;
   private GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem> SDTServidorEfetivoEnderecoFuncional_servidorItemtoGXObjectCollection( Vector<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_RESTInterface> collection )
   {
      GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem> result = new GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem>(com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem.class, "SDTServidorEfetivoEnderecoFuncional.servidorItem", "ProjetoPratico.SDTServidorEfetivoEnderecoFuncional", remoteHandle);
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.add((com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem)collection.elementAt(i).getSdt());
      }
      return result ;
   }

   private Vector<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_RESTInterface> SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_RESTInterfacefromGXObjectCollection( GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem> collection )
   {
      Vector<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_RESTInterface> result = new Vector<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_RESTInterface>();
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.addElement(new com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_RESTInterface((com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem)collection.elementAt(i)));
      }
      return result ;
   }

}

