package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "apiconsulta_efetivosunidade_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class apiconsulta_efetivosunidade_RESTInterfaceIN
{
   short AV14unidid;
   @JsonProperty("unidid")
   public short getunidid( )
   {
      return AV14unidid ;
   }

   @JsonProperty("unidid")
   public void setunidid(  short Value )
   {
      AV14unidid= Value;
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

