package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "apiauth_auth_RESTInterfaceOUT", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class apiauth_auth_RESTInterfaceOUT
{
   String AV9token;
   @JsonProperty("token")
   public String gettoken( )
   {
      return AV9token ;
   }

   @JsonProperty("token")
   public void settoken(  String Value )
   {
      AV9token= Value;
   }


   String AV10refreshToken;
   @JsonProperty("refreshToken")
   public String getrefreshToken( )
   {
      return AV10refreshToken ;
   }

   @JsonProperty("refreshToken")
   public void setrefreshToken(  String Value )
   {
      AV10refreshToken= Value;
   }


   Vector<com.genexus.SdtMessages_Message_RESTInterface> AV6Messages ;
   @JsonProperty("Messages")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<com.genexus.SdtMessages_Message_RESTInterface> getMessages( )
   {
      return AV6Messages ;
   }

   @JsonProperty("Messages")
   public void setMessages(  Vector<com.genexus.SdtMessages_Message_RESTInterface> Value )
   {
      AV6Messages= Value;
   }


}

