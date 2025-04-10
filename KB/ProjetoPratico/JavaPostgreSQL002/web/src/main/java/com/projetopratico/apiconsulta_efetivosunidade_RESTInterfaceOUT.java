package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "apiconsulta_efetivosunidade_RESTInterfaceOUT", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class apiconsulta_efetivosunidade_RESTInterfaceOUT
{
   com.projetopratico.SdtSDTEfetivosUnidade_RESTInterface AV7SDTEfetivosUnidade;
   @JsonProperty("SDTEfetivosUnidade")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public com.projetopratico.SdtSDTEfetivosUnidade_RESTInterface getSDTEfetivosUnidade( )
   {
      return AV7SDTEfetivosUnidade ;
   }

   @JsonProperty("SDTEfetivosUnidade")
   public void setSDTEfetivosUnidade(  com.projetopratico.SdtSDTEfetivosUnidade_RESTInterface Value )
   {
      AV7SDTEfetivosUnidade= Value;
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

