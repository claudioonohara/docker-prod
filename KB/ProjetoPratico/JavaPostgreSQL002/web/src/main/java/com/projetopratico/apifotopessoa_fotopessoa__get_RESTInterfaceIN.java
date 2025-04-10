package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "apifotopessoa_fotopessoa__get_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class apifotopessoa_fotopessoa__get_RESTInterfaceIN
{
   String AV5fp_id;
   @JsonProperty("fp_id")
   public String getfp_id( )
   {
      return AV5fp_id ;
   }

   @JsonProperty("fp_id")
   public void setfp_id(  String Value )
   {
      AV5fp_id= Value;
   }


}

