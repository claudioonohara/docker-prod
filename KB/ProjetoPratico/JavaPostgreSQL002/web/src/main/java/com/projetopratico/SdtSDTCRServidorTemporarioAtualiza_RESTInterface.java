package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "SDTCRServidorTemporarioAtualiza", namespace ="ProjetoPratico", propOrder={"st_data_admissao", "st_data_demissao", "pes_nome", "pes_data_nascimento", "pes_sexo", "pes_mae", "pes_pai", "endereco"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtSDTCRServidorTemporarioAtualiza_RESTInterface extends GxGenericCollectionItem<com.projetopratico.SdtSDTCRServidorTemporarioAtualiza>
{
   public SdtSDTCRServidorTemporarioAtualiza_RESTInterface( )
   {
      super(new com.projetopratico.SdtSDTCRServidorTemporarioAtualiza ());
   }

   public SdtSDTCRServidorTemporarioAtualiza_RESTInterface( com.projetopratico.SdtSDTCRServidorTemporarioAtualiza psdt )
   {
      super(psdt);
   }

   @JsonProperty("st_data_admissao")
   public String getgxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao( )
   {
      return GXutil.dateToCharREST( sdt.getgxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao()) ;
   }

   @JsonProperty("st_data_admissao")
   public void setgxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao(  String Value )
   {
      sdt.setgxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao( GXutil.charToDateREST( Value) );
   }


   @JsonProperty("st_data_demissao")
   public String getgxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao( )
   {
      return GXutil.dateToCharREST( sdt.getgxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao()) ;
   }

   @JsonProperty("st_data_demissao")
   public void setgxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao(  String Value )
   {
      sdt.setgxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao( GXutil.charToDateREST( Value) );
   }


   @JsonProperty("pes_nome")
   public String getgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_nome( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTCRServidorTemporarioAtualiza)getSdt()).getgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_nome()) ;
   }

   @JsonProperty("pes_nome")
   public void setgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_nome(  String Value )
   {
      ((com.projetopratico.SdtSDTCRServidorTemporarioAtualiza)getSdt()).setgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_nome(Value);
   }


   @JsonProperty("pes_data_nascimento")
   public String getgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento( )
   {
      return GXutil.dateToCharREST( sdt.getgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento()) ;
   }

   @JsonProperty("pes_data_nascimento")
   public void setgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento(  String Value )
   {
      sdt.setgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento( GXutil.charToDateREST( Value) );
   }


   @JsonProperty("pes_sexo")
   public String getgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_sexo( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTCRServidorTemporarioAtualiza)getSdt()).getgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_sexo()) ;
   }

   @JsonProperty("pes_sexo")
   public void setgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_sexo(  String Value )
   {
      ((com.projetopratico.SdtSDTCRServidorTemporarioAtualiza)getSdt()).setgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_sexo(Value);
   }


   @JsonProperty("pes_mae")
   public String getgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_mae( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTCRServidorTemporarioAtualiza)getSdt()).getgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_mae()) ;
   }

   @JsonProperty("pes_mae")
   public void setgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_mae(  String Value )
   {
      ((com.projetopratico.SdtSDTCRServidorTemporarioAtualiza)getSdt()).setgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_mae(Value);
   }


   @JsonProperty("pes_pai")
   public String getgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_pai( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTCRServidorTemporarioAtualiza)getSdt()).getgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_pai()) ;
   }

   @JsonProperty("pes_pai")
   public void setgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_pai(  String Value )
   {
      ((com.projetopratico.SdtSDTCRServidorTemporarioAtualiza)getSdt()).setgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_pai(Value);
   }


   @JsonProperty("endereco")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem_RESTInterface> getgxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco( )
   {
      return SdtSDTCRServidorTemporarioAtualiza_enderecoItem_RESTInterfacefromGXObjectCollection(((com.projetopratico.SdtSDTCRServidorTemporarioAtualiza)getSdt()).getgxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco()) ;
   }

   @JsonProperty("endereco")
   public void setgxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco(  Vector<com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem_RESTInterface> Value )
   {
      ((com.projetopratico.SdtSDTCRServidorTemporarioAtualiza)getSdt()).setgxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco(SDTCRServidorTemporarioAtualiza_enderecoItemtoGXObjectCollection(Value));
   }


   int remoteHandle = -1;
   private GXBaseCollection<com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem> SDTCRServidorTemporarioAtualiza_enderecoItemtoGXObjectCollection( Vector<com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem_RESTInterface> collection )
   {
      GXBaseCollection<com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem> result = new GXBaseCollection<com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem>(com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem.class, "SDTCRServidorTemporarioAtualiza.enderecoItem", "ProjetoPratico.SDTCRServidorTemporarioAtualiza", remoteHandle);
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.add((com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem)collection.elementAt(i).getSdt());
      }
      return result ;
   }

   private Vector<com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem_RESTInterface> SdtSDTCRServidorTemporarioAtualiza_enderecoItem_RESTInterfacefromGXObjectCollection( GXBaseCollection<com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem> collection )
   {
      Vector<com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem_RESTInterface> result = new Vector<com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem_RESTInterface>();
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.addElement(new com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem_RESTInterface((com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem)collection.elementAt(i)));
      }
      return result ;
   }

}

