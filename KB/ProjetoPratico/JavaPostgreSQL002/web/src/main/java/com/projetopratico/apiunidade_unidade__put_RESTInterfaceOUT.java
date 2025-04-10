package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "apiunidade_unidade__put_RESTInterfaceOUT", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class apiunidade_unidade__put_RESTInterfaceOUT
{
   com.projetopratico.SdtSDTCRUnidade_RESTInterface AV31RetornoSDTCRUnidade;
   @JsonProperty("RetornoSDTCRUnidade")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public com.projetopratico.SdtSDTCRUnidade_RESTInterface getRetornoSDTCRUnidade( )
   {
      return AV31RetornoSDTCRUnidade ;
   }

   @JsonProperty("RetornoSDTCRUnidade")
   public void setRetornoSDTCRUnidade(  com.projetopratico.SdtSDTCRUnidade_RESTInterface Value )
   {
      AV31RetornoSDTCRUnidade= Value;
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

