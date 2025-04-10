package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "apivariavel_variavel_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class apivariavel_variavel_RESTInterfaceIN
{
   String AV5variavel;
   @JsonProperty("variavel")
   public String getvariavel( )
   {
      if ( GXutil.strcmp(AV5variavel, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV5variavel ;
      }
   }

   @JsonProperty("variavel")
   public void setvariavel(  String Value )
   {
      if ( Value == null )
      {
         AV5variavel = "" ;
      }
      else
      {
         AV5variavel= Value;
      }
   }


   String AV7filename;
   @JsonProperty("filename")
   public String getfilename( )
   {
      if ( GXutil.strcmp(AV7filename, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV7filename ;
      }
   }

   @JsonProperty("filename")
   public void setfilename(  String Value )
   {
      if ( Value == null )
      {
         AV7filename = "" ;
      }
      else
      {
         AV7filename= Value;
      }
   }


}

