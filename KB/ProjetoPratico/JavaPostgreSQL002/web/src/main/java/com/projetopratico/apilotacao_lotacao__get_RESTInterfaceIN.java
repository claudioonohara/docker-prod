package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "apilotacao_lotacao__get_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class apilotacao_lotacao__get_RESTInterfaceIN
{
   String AV11lot_id;
   @JsonProperty("lot_id")
   public String getlot_id( )
   {
      return AV11lot_id ;
   }

   @JsonProperty("lot_id")
   public void setlot_id(  String Value )
   {
      AV11lot_id= Value;
   }


}

