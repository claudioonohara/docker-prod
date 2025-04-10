package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "apiservidortemporario_servidortemporario__delete_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class apiservidortemporario_servidortemporario__delete_RESTInterfaceIN
{
   String AV6pes_id;
   @JsonProperty("pes_id")
   public String getpes_id( )
   {
      return AV6pes_id ;
   }

   @JsonProperty("pes_id")
   public void setpes_id(  String Value )
   {
      AV6pes_id= Value;
   }


   String AV17st_data_admissao;
   @JsonProperty("st_data_admissao")
   public String getst_data_admissao( )
   {
      return AV17st_data_admissao ;
   }

   @JsonProperty("st_data_admissao")
   public void setst_data_admissao(  String Value )
   {
      AV17st_data_admissao= Value;
   }


   String AV18st_data_demissao;
   @JsonProperty("st_data_demissao")
   public String getst_data_demissao( )
   {
      return AV18st_data_demissao ;
   }

   @JsonProperty("st_data_demissao")
   public void setst_data_demissao(  String Value )
   {
      AV18st_data_demissao= Value;
   }


}

