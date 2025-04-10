package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "apifotopessoa_fotopessoa__post_RESTInterfaceOUT", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class apifotopessoa_fotopessoa__post_RESTInterfaceOUT
{
   com.projetopratico.SdtSDTFotoPessoa_RESTInterface AV23SDTFotoPessoa;
   @JsonProperty("SDTFotoPessoa")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public com.projetopratico.SdtSDTFotoPessoa_RESTInterface getSDTFotoPessoa( )
   {
      return AV23SDTFotoPessoa ;
   }

   @JsonProperty("SDTFotoPessoa")
   public void setSDTFotoPessoa(  com.projetopratico.SdtSDTFotoPessoa_RESTInterface Value )
   {
      AV23SDTFotoPessoa= Value;
   }


   Vector<com.genexus.SdtMessages_Message_RESTInterface> AV8Messages ;
   @JsonProperty("Messages")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<com.genexus.SdtMessages_Message_RESTInterface> getMessages( )
   {
      return AV8Messages ;
   }

   @JsonProperty("Messages")
   public void setMessages(  Vector<com.genexus.SdtMessages_Message_RESTInterface> Value )
   {
      AV8Messages= Value;
   }


}

