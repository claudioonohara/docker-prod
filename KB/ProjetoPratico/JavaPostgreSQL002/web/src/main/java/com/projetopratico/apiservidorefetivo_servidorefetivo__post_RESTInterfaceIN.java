package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "apiservidorefetivo_servidorefetivo__post_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class apiservidorefetivo_servidorefetivo__post_RESTInterfaceIN
{
   com.projetopratico.SdtSDTCRServidorEfetivo_RESTInterface AV22SDTCRServidorEfetivo;
   @JsonProperty("SDTCRServidorEfetivo")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public com.projetopratico.SdtSDTCRServidorEfetivo_RESTInterface getSDTCRServidorEfetivo( )
   {
      return AV22SDTCRServidorEfetivo ;
   }

   @JsonProperty("SDTCRServidorEfetivo")
   public void setSDTCRServidorEfetivo(  com.projetopratico.SdtSDTCRServidorEfetivo_RESTInterface Value )
   {
      AV22SDTCRServidorEfetivo= Value;
   }


}

