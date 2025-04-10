package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "apiservidorefetivo_servidorefetivo__delete_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class apiservidorefetivo_servidorefetivo__delete_RESTInterfaceIN
{
   String AV7pes_id;
   @JsonProperty("pes_id")
   public String getpes_id( )
   {
      return AV7pes_id ;
   }

   @JsonProperty("pes_id")
   public void setpes_id(  String Value )
   {
      AV7pes_id= Value;
   }


   String AV9se_matricula;
   @JsonProperty("se_matricula")
   public String getse_matricula( )
   {
      if ( GXutil.strcmp(AV9se_matricula, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV9se_matricula ;
      }
   }

   @JsonProperty("se_matricula")
   public void setse_matricula(  String Value )
   {
      if ( Value == null )
      {
         AV9se_matricula = "" ;
      }
      else
      {
         AV9se_matricula= Value;
      }
   }


}

