package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "apiauth_refresh_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class apiauth_refresh_RESTInterfaceIN
{
   String AV10refreshToken;
   @JsonProperty("refreshToken")
   public String getrefreshToken( )
   {
      if ( GXutil.strcmp(AV10refreshToken, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV10refreshToken ;
      }
   }

   @JsonProperty("refreshToken")
   public void setrefreshToken(  String Value )
   {
      if ( Value == null )
      {
         AV10refreshToken = "" ;
      }
      else
      {
         AV10refreshToken= Value;
      }
   }


}

