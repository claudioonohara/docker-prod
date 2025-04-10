package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "apifotopessoa_fotopessoa__post_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class apifotopessoa_fotopessoa__post_RESTInterfaceIN
{
   String AV10pes_id;
   @JsonProperty("pes_id")
   public String getpes_id( )
   {
      return AV10pes_id ;
   }

   @JsonProperty("pes_id")
   public void setpes_id(  String Value )
   {
      AV10pes_id= Value;
   }


   String AV18fp_data;
   @JsonProperty("fp_data")
   public String getfp_data( )
   {
      return AV18fp_data ;
   }

   @JsonProperty("fp_data")
   public void setfp_data(  String Value )
   {
      AV18fp_data= Value;
   }


   String AV21fp_foto;
   @JsonProperty("fp_foto")
   public String getfp_foto( )
   {
      return AV21fp_foto ;
   }

   @JsonProperty("fp_foto")
   public void setfp_foto(  String Value )
   {
      AV21fp_foto= Value;
   }


}

