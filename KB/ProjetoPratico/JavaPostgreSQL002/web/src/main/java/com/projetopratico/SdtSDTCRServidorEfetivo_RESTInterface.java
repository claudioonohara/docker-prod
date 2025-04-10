package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "SDTCRServidorEfetivo", namespace ="ProjetoPratico", propOrder={"pes_id", "se_matricula", "pes_nome", "pes_data_nascimento", "pes_sexo", "pes_mae", "pes_pai", "pes_idade", "endereco"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtSDTCRServidorEfetivo_RESTInterface extends GxGenericCollectionItem<com.projetopratico.SdtSDTCRServidorEfetivo>
{
   public SdtSDTCRServidorEfetivo_RESTInterface( )
   {
      super(new com.projetopratico.SdtSDTCRServidorEfetivo ());
   }

   public SdtSDTCRServidorEfetivo_RESTInterface( com.projetopratico.SdtSDTCRServidorEfetivo psdt )
   {
      super(psdt);
   }

   @JsonProperty("pes_id")
   public String getgxTv_SdtSDTCRServidorEfetivo_Pes_id( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDTCRServidorEfetivo_Pes_id(), 8, 0)) ;
   }

   @JsonProperty("pes_id")
   public void setgxTv_SdtSDTCRServidorEfetivo_Pes_id(  String Value )
   {
      sdt.setgxTv_SdtSDTCRServidorEfetivo_Pes_id( (int)(GXutil.lval( Value)) );
   }


   @JsonProperty("se_matricula")
   public String getgxTv_SdtSDTCRServidorEfetivo_Se_matricula( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTCRServidorEfetivo)getSdt()).getgxTv_SdtSDTCRServidorEfetivo_Se_matricula()) ;
   }

   @JsonProperty("se_matricula")
   public void setgxTv_SdtSDTCRServidorEfetivo_Se_matricula(  String Value )
   {
      ((com.projetopratico.SdtSDTCRServidorEfetivo)getSdt()).setgxTv_SdtSDTCRServidorEfetivo_Se_matricula(Value);
   }


   @JsonProperty("pes_nome")
   public String getgxTv_SdtSDTCRServidorEfetivo_Pes_nome( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTCRServidorEfetivo)getSdt()).getgxTv_SdtSDTCRServidorEfetivo_Pes_nome()) ;
   }

   @JsonProperty("pes_nome")
   public void setgxTv_SdtSDTCRServidorEfetivo_Pes_nome(  String Value )
   {
      ((com.projetopratico.SdtSDTCRServidorEfetivo)getSdt()).setgxTv_SdtSDTCRServidorEfetivo_Pes_nome(Value);
   }


   @JsonProperty("pes_data_nascimento")
   public String getgxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento( )
   {
      return GXutil.dateToCharREST( sdt.getgxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento()) ;
   }

   @JsonProperty("pes_data_nascimento")
   public void setgxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento(  String Value )
   {
      sdt.setgxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento( GXutil.charToDateREST( Value) );
   }


   @JsonProperty("pes_sexo")
   public String getgxTv_SdtSDTCRServidorEfetivo_Pes_sexo( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTCRServidorEfetivo)getSdt()).getgxTv_SdtSDTCRServidorEfetivo_Pes_sexo()) ;
   }

   @JsonProperty("pes_sexo")
   public void setgxTv_SdtSDTCRServidorEfetivo_Pes_sexo(  String Value )
   {
      ((com.projetopratico.SdtSDTCRServidorEfetivo)getSdt()).setgxTv_SdtSDTCRServidorEfetivo_Pes_sexo(Value);
   }


   @JsonProperty("pes_mae")
   public String getgxTv_SdtSDTCRServidorEfetivo_Pes_mae( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTCRServidorEfetivo)getSdt()).getgxTv_SdtSDTCRServidorEfetivo_Pes_mae()) ;
   }

   @JsonProperty("pes_mae")
   public void setgxTv_SdtSDTCRServidorEfetivo_Pes_mae(  String Value )
   {
      ((com.projetopratico.SdtSDTCRServidorEfetivo)getSdt()).setgxTv_SdtSDTCRServidorEfetivo_Pes_mae(Value);
   }


   @JsonProperty("pes_pai")
   public String getgxTv_SdtSDTCRServidorEfetivo_Pes_pai( )
   {
      return GXutil.rtrim(((com.projetopratico.SdtSDTCRServidorEfetivo)getSdt()).getgxTv_SdtSDTCRServidorEfetivo_Pes_pai()) ;
   }

   @JsonProperty("pes_pai")
   public void setgxTv_SdtSDTCRServidorEfetivo_Pes_pai(  String Value )
   {
      ((com.projetopratico.SdtSDTCRServidorEfetivo)getSdt()).setgxTv_SdtSDTCRServidorEfetivo_Pes_pai(Value);
   }


   @JsonProperty("pes_idade")
   public Short getgxTv_SdtSDTCRServidorEfetivo_Pes_idade( )
   {
      return ((com.projetopratico.SdtSDTCRServidorEfetivo)getSdt()).getgxTv_SdtSDTCRServidorEfetivo_Pes_idade() ;
   }

   @JsonProperty("pes_idade")
   public void setgxTv_SdtSDTCRServidorEfetivo_Pes_idade(  Short Value )
   {
      ((com.projetopratico.SdtSDTCRServidorEfetivo)getSdt()).setgxTv_SdtSDTCRServidorEfetivo_Pes_idade(Value);
   }


   @JsonProperty("endereco")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem_RESTInterface> getgxTv_SdtSDTCRServidorEfetivo_Endereco( )
   {
      return SdtSDTCRServidorEfetivo_enderecoItem_RESTInterfacefromGXObjectCollection(((com.projetopratico.SdtSDTCRServidorEfetivo)getSdt()).getgxTv_SdtSDTCRServidorEfetivo_Endereco()) ;
   }

   @JsonProperty("endereco")
   public void setgxTv_SdtSDTCRServidorEfetivo_Endereco(  Vector<com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem_RESTInterface> Value )
   {
      ((com.projetopratico.SdtSDTCRServidorEfetivo)getSdt()).setgxTv_SdtSDTCRServidorEfetivo_Endereco(SDTCRServidorEfetivo_enderecoItemtoGXObjectCollection(Value));
   }


   int remoteHandle = -1;
   private GXBaseCollection<com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem> SDTCRServidorEfetivo_enderecoItemtoGXObjectCollection( Vector<com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem_RESTInterface> collection )
   {
      GXBaseCollection<com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem> result = new GXBaseCollection<com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem>(com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem.class, "SDTCRServidorEfetivo.enderecoItem", "ProjetoPratico.SDTCRServidorEfetivo", remoteHandle);
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.add((com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem)collection.elementAt(i).getSdt());
      }
      return result ;
   }

   private Vector<com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem_RESTInterface> SdtSDTCRServidorEfetivo_enderecoItem_RESTInterfacefromGXObjectCollection( GXBaseCollection<com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem> collection )
   {
      Vector<com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem_RESTInterface> result = new Vector<com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem_RESTInterface>();
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.addElement(new com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem_RESTInterface((com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem)collection.elementAt(i)));
      }
      return result ;
   }

}

