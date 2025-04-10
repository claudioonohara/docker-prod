package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "apiconsulta_enderecofuncional_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class apiconsulta_enderecofuncional_RESTInterfaceIN
{
   String AV11pes_nome;
   @JsonProperty("pes_nome")
   public String getpes_nome( )
   {
      if ( GXutil.strcmp(AV11pes_nome, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV11pes_nome ;
      }
   }

   @JsonProperty("pes_nome")
   public void setpes_nome(  String Value )
   {
      if ( Value == null )
      {
         AV11pes_nome = "" ;
      }
      else
      {
         AV11pes_nome= Value;
      }
   }


   String AV15PaginaAtual;
   @JsonProperty("PaginaAtual")
   public String getPaginaAtual( )
   {
      return AV15PaginaAtual ;
   }

   @JsonProperty("PaginaAtual")
   public void setPaginaAtual(  String Value )
   {
      AV15PaginaAtual= Value;
   }


   String AV16nroPorPagina;
   @JsonProperty("nroPorPagina")
   public String getnroPorPagina( )
   {
      return AV16nroPorPagina ;
   }

   @JsonProperty("nroPorPagina")
   public void setnroPorPagina(  String Value )
   {
      AV16nroPorPagina= Value;
   }


}

