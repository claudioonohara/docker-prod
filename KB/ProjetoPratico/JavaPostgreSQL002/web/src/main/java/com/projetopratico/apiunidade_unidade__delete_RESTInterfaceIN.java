package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "apiunidade_unidade__delete_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class apiunidade_unidade__delete_RESTInterfaceIN
{
   String AV21unid_id;
   @JsonProperty("unid_id")
   public String getunid_id( )
   {
      return AV21unid_id ;
   }

   @JsonProperty("unid_id")
   public void setunid_id(  String Value )
   {
      AV21unid_id= Value;
   }


}

