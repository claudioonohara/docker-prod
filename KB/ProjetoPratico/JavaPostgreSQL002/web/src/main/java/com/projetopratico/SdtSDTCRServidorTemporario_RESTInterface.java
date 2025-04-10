package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "SDTCRServidorTemporario", namespace ="ProjetoPratico", propOrder={"pes_id", "st_data_admissao", "st_data_demissao", "pes_nome", "pes_data_nascimento", "pes_sexo", "pes_mae", "pes_pai", "endereco"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtSDTCRServidorTemporario_RESTInterface extends GxGenericCollectionItem<com.projetopratico.SdtSDTCRServidorTemporario>
{
   public SdtSDTCRServidorTemporario_RESTInterface( )
   {
      super(new com.projetopratico.SdtSDTCRServidorTemporario ());
   }

   public SdtSDTCRServidorTemporario_RESTInterface( com.projetopratico.SdtSDTCRServidorTemporario psdt )
   {
      super(psdt);
   }

   @JsonProperty("pes_id")
   public String getgxTv_SdtSDTCRServidorTemporario_Pes_id( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTCRServidorTemporario_Pes_id(), 8, 0)) ;
   }

   @JsonProperty("pes_id")
   public void setgxTv_SdtSDTCRServidorTemporario_Pes_id(  String Value )
   {
      sdt.setgxTv_SdtSDTCRServidorTemporario_Pes_id( (int)(GXutil.lval( Value)) );
   }


   @JsonProperty("st_data_admissao")
   public String getgxTv_SdtSDTCRServidorTemporario_St_data_admissao( )
   {
      return GXutil.dateToCharREST( sdt.getgxTv_SdtSDTCRServidorTemporario_St_data_admissao()) ;
   }

   @JsonProperty("st_data_admissao")
   public void setgxTv_SdtSDTCRServidorTemporario_St_data_admissao(  String Value )
   {
      sdt.setgxTv_SdtSDTCRServidorTemporario_St_data_admissao( GXutil.charToDateREST( Value) );
   }


   @JsonProperty("st_data_demissao")
   public String getgxTv_SdtSDTCRServidorTemporario_St_data_demissao( )
   {
      return GXutil.dateToCharREST( sdt.getgxTv_SdtSDTCRServidorTemporario_St_data_demissao()) ;
   }

   @JsonProperty("st_data_demissao")
   public void setgxTv_SdtSDTCRServidorTemporario_St_data_demissao(  String Value )
   {
      sdt.setgxTv_SdtSDTCRServidorTemporario_St_data_demissao( GXutil.charToDateREST( Value) );
   }


   @JsonProperty("pes_nome")
   public String getgxTv_SdtSDTCRServidorTemporario_Pes_nome( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTCRServidorTemporario)getSdt()).getgxTv_SdtSDTCRServidorTemporario_Pes_nome()) ;
   }

   @JsonProperty("pes_nome")
   public void setgxTv_SdtSDTCRServidorTemporario_Pes_nome(  String Value )
   {
      ((com.projetopratico.SdtSDTCRServidorTemporario)getSdt()).setgxTv_SdtSDTCRServidorTemporario_Pes_nome(Value);
   }


   @JsonProperty("pes_data_nascimento")
   public String getgxTv_SdtSDTCRServidorTemporario_Pes_data_nascimento( )
   {
      return GXutil.dateToCharREST( sdt.getgxTv_SdtSDTCRServidorTemporario_Pes_data_nascimento()) ;
   }

   @JsonProperty("pes_data_nascimento")
   public void setgxTv_SdtSDTCRServidorTemporario_Pes_data_nascimento(  String Value )
   {
      sdt.setgxTv_SdtSDTCRServidorTemporario_Pes_data_nascimento( GXutil.charToDateREST( Value) );
   }


   @JsonProperty("pes_sexo")
   public String getgxTv_SdtSDTCRServidorTemporario_Pes_sexo( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTCRServidorTemporario)getSdt()).getgxTv_SdtSDTCRServidorTemporario_Pes_sexo()) ;
   }

   @JsonProperty("pes_sexo")
   public void setgxTv_SdtSDTCRServidorTemporario_Pes_sexo(  String Value )
   {
      ((com.projetopratico.SdtSDTCRServidorTemporario)getSdt()).setgxTv_SdtSDTCRServidorTemporario_Pes_sexo(Value);
   }


   @JsonProperty("pes_mae")
   public String getgxTv_SdtSDTCRServidorTemporario_Pes_mae( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTCRServidorTemporario)getSdt()).getgxTv_SdtSDTCRServidorTemporario_Pes_mae()) ;
   }

   @JsonProperty("pes_mae")
   public void setgxTv_SdtSDTCRServidorTemporario_Pes_mae(  String Value )
   {
      ((com.projetopratico.SdtSDTCRServidorTemporario)getSdt()).setgxTv_SdtSDTCRServidorTemporario_Pes_mae(Value);
   }


   @JsonProperty("pes_pai")
   public String getgxTv_SdtSDTCRServidorTemporario_Pes_pai( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTCRServidorTemporario)getSdt()).getgxTv_SdtSDTCRServidorTemporario_Pes_pai()) ;
   }

   @JsonProperty("pes_pai")
   public void setgxTv_SdtSDTCRServidorTemporario_Pes_pai(  String Value )
   {
      ((com.projetopratico.SdtSDTCRServidorTemporario)getSdt()).setgxTv_SdtSDTCRServidorTemporario_Pes_pai(Value);
   }


   @JsonProperty("endereco")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem_RESTInterface> getgxTv_SdtSDTCRServidorTemporario_Endereco( )
   {
      return SdtSDTCRServidorTemporario_enderecoItem_RESTInterfacefromGXObjectCollection(((com.projetopratico.SdtSDTCRServidorTemporario)getSdt()).getgxTv_SdtSDTCRServidorTemporario_Endereco()) ;
   }

   @JsonProperty("endereco")
   public void setgxTv_SdtSDTCRServidorTemporario_Endereco(  Vector<com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem_RESTInterface> Value )
   {
      ((com.projetopratico.SdtSDTCRServidorTemporario)getSdt()).setgxTv_SdtSDTCRServidorTemporario_Endereco(SDTCRServidorTemporario_enderecoItemtoGXObjectCollection(Value));
   }


   int remoteHandle = -1;
   private GXBaseCollection<com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem> SDTCRServidorTemporario_enderecoItemtoGXObjectCollection( Vector<com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem_RESTInterface> collection )
   {
      GXBaseCollection<com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem> result = new GXBaseCollection<com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem>(com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem.class, "SDTCRServidorTemporario.enderecoItem", "ProjetoPratico.SDTCRServidorTemporario", remoteHandle);
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.add((com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem)collection.elementAt(i).getSdt());
      }
      return result ;
   }

   private Vector<com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem_RESTInterface> SdtSDTCRServidorTemporario_enderecoItem_RESTInterfacefromGXObjectCollection( GXBaseCollection<com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem> collection )
   {
      Vector<com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem_RESTInterface> result = new Vector<com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem_RESTInterface>();
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.addElement(new com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem_RESTInterface((com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem)collection.elementAt(i)));
      }
      return result ;
   }

}

