package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "apiservidortemporario_servidortemporario__post_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class apiservidortemporario_servidortemporario__post_RESTInterfaceIN
{
   com.projetopratico.SdtSDTCRServidorTemporario_RESTInterface AV22SDTCRServidorTemporario;
   @JsonProperty("SDTCRServidorTemporario")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public com.projetopratico.SdtSDTCRServidorTemporario_RESTInterface getSDTCRServidorTemporario( )
   {
      return AV22SDTCRServidorTemporario ;
   }

   @JsonProperty("SDTCRServidorTemporario")
   public void setSDTCRServidorTemporario(  com.projetopratico.SdtSDTCRServidorTemporario_RESTInterface Value )
   {
      AV22SDTCRServidorTemporario= Value;
   }


}

