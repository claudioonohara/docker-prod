package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "apiauth_auth_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class apiauth_auth_RESTInterfaceIN
{
   String AV7username;
   @JsonProperty("username")
   public String getusername( )
   {
      if ( GXutil.strcmp(AV7username, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV7username ;
      }
   }

   @JsonProperty("username")
   public void setusername(  String Value )
   {
      if ( Value == null )
      {
         AV7username = "" ;
      }
      else
      {
         AV7username= Value;
      }
   }


   String AV8password;
   @JsonProperty("password")
   public String getpassword( )
   {
      if ( GXutil.strcmp(AV8password, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV8password ;
      }
   }

   @JsonProperty("password")
   public void setpassword(  String Value )
   {
      if ( Value == null )
      {
         AV8password = "" ;
      }
      else
      {
         AV8password= Value;
      }
   }


}

