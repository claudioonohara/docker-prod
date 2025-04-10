package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "pfotopessoa_RESTInterfaceOUT", namespace ="ProjetoPratico")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class pfotopessoa_RESTInterfaceOUT
{
   String AV9foto;
   @JsonProperty("foto")
   public String getfoto( )
   {
      return AV9foto ;
   }

   @JsonProperty("foto")
   public void setfoto(  String Value )
   {
      AV9foto= Value;
   }


}

