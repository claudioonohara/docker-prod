package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "SDTCRServidorEfetivoAtualiza", namespace ="ProjetoPratico", propOrder={"se_matricula", "pes_nome", "pes_data_nascimento", "pes_sexo", "pes_mae", "pes_pai", "pes_idade", "endereco"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtSDTCRServidorEfetivoAtualiza_RESTInterface extends GxGenericCollectionItem<com.projetopratico.SdtSDTCRServidorEfetivoAtualiza>
{
   public SdtSDTCRServidorEfetivoAtualiza_RESTInterface( )
   {
      super(new com.projetopratico.SdtSDTCRServidorEfetivoAtualiza ());
   }

   public SdtSDTCRServidorEfetivoAtualiza_RESTInterface( com.projetopratico.SdtSDTCRServidorEfetivoAtualiza psdt )
   {
      super(psdt);
   }

   @JsonProperty("se_matricula")
   public String getgxTv_SdtSDTCRServidorEfetivoAtualiza_Se_matricula( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTCRServidorEfetivoAtualiza)getSdt()).getgxTv_SdtSDTCRServidorEfetivoAtualiza_Se_matricula()) ;
   }

   @JsonProperty("se_matricula")
   public void setgxTv_SdtSDTCRServidorEfetivoAtualiza_Se_matricula(  String Value )
   {
      ((com.projetopratico.SdtSDTCRServidorEfetivoAtualiza)getSdt()).setgxTv_SdtSDTCRServidorEfetivoAtualiza_Se_matricula(Value);
   }


   @JsonProperty("pes_nome")
   public String getgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_nome( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTCRServidorEfetivoAtualiza)getSdt()).getgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_nome()) ;
   }

   @JsonProperty("pes_nome")
   public void setgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_nome(  String Value )
   {
      ((com.projetopratico.SdtSDTCRServidorEfetivoAtualiza)getSdt()).setgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_nome(Value);
   }


   @JsonProperty("pes_data_nascimento")
   public String getgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento( )
   {
      return GXutil.dateToCharREST( sdt.getgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento()) ;
   }

   @JsonProperty("pes_data_nascimento")
   public void setgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento(  String Value )
   {
      sdt.setgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento( GXutil.charToDateREST( Value) );
   }


   @JsonProperty("pes_sexo")
   public String getgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_sexo( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTCRServidorEfetivoAtualiza)getSdt()).getgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_sexo()) ;
   }

   @JsonProperty("pes_sexo")
   public void setgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_sexo(  String Value )
   {
      ((com.projetopratico.SdtSDTCRServidorEfetivoAtualiza)getSdt()).setgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_sexo(Value);
   }


   @JsonProperty("pes_mae")
   public String getgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_mae( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTCRServidorEfetivoAtualiza)getSdt()).getgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_mae()) ;
   }

   @JsonProperty("pes_mae")
   public void setgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_mae(  String Value )
   {
      ((com.projetopratico.SdtSDTCRServidorEfetivoAtualiza)getSdt()).setgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_mae(Value);
   }


   @JsonProperty("pes_pai")
   public String getgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_pai( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTCRServidorEfetivoAtualiza)getSdt()).getgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_pai()) ;
   }

   @JsonProperty("pes_pai")
   public void setgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_pai(  String Value )
   {
      ((com.projetopratico.SdtSDTCRServidorEfetivoAtualiza)getSdt()).setgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_pai(Value);
   }


   @JsonProperty("pes_idade")
   public Short getgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_idade( )
   {
      return ((com.projetopratico.SdtSDTCRServidorEfetivoAtualiza)getSdt()).getgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_idade() ;
   }

   @JsonProperty("pes_idade")
   public void setgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_idade(  Short Value )
   {
      ((com.projetopratico.SdtSDTCRServidorEfetivoAtualiza)getSdt()).setgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_idade(Value);
   }


   @JsonProperty("endereco")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem_RESTInterface> getgxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco( )
   {
      return SdtSDTCRServidorEfetivoAtualiza_enderecoItem_RESTInterfacefromGXObjectCollection(((com.projetopratico.SdtSDTCRServidorEfetivoAtualiza)getSdt()).getgxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco()) ;
   }

   @JsonProperty("endereco")
   public void setgxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco(  Vector<com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem_RESTInterface> Value )
   {
      ((com.projetopratico.SdtSDTCRServidorEfetivoAtualiza)getSdt()).setgxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco(SDTCRServidorEfetivoAtualiza_enderecoItemtoGXObjectCollection(Value));
   }


   int remoteHandle = -1;
   private GXBaseCollection<com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem> SDTCRServidorEfetivoAtualiza_enderecoItemtoGXObjectCollection( Vector<com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem_RESTInterface> collection )
   {
      GXBaseCollection<com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem> result = new GXBaseCollection<com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem>(com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem.class, "SDTCRServidorEfetivoAtualiza.enderecoItem", "ProjetoPratico.SDTCRServidorEfetivoAtualiza", remoteHandle);
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.add((com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem)collection.elementAt(i).getSdt());
      }
      return result ;
   }

   private Vector<com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem_RESTInterface> SdtSDTCRServidorEfetivoAtualiza_enderecoItem_RESTInterfacefromGXObjectCollection( GXBaseCollection<com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem> collection )
   {
      Vector<com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem_RESTInterface> result = new Vector<com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem_RESTInterface>();
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.addElement(new com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem_RESTInterface((com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem)collection.elementAt(i)));
      }
      return result ;
   }

}

