package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "apiconsulta_enderecofuncional_RESTInterfaceOUT", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class apiconsulta_enderecofuncional_RESTInterfaceOUT
{
   com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_RESTInterface AV13SDTServidorEfetivoEnderecoFuncional;
   @JsonProperty("SDTServidorEfetivoEnderecoFuncional")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_RESTInterface getSDTServidorEfetivoEnderecoFuncional( )
   {
      return AV13SDTServidorEfetivoEnderecoFuncional ;
   }

   @JsonProperty("SDTServidorEfetivoEnderecoFuncional")
   public void setSDTServidorEfetivoEnderecoFuncional(  com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_RESTInterface Value )
   {
      AV13SDTServidorEfetivoEnderecoFuncional= Value;
   }


   Vector<com.genexus.SdtMessages_Message_RESTInterface> AV5Messages ;
   @JsonProperty("Messages")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<com.genexus.SdtMessages_Message_RESTInterface> getMessages( )
   {
      return AV5Messages ;
   }

   @JsonProperty("Messages")
   public void setMessages(  Vector<com.genexus.SdtMessages_Message_RESTInterface> Value )
   {
      AV5Messages= Value;
   }


}

