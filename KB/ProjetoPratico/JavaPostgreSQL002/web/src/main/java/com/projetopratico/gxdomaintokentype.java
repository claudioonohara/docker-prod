package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;

public final  class gxdomaintokentype
{
   private static java.util.TreeMap<String, String> domain = new java.util.TreeMap<>();
   static
   {
      domain.put("token", "token");
      domain.put("refresh", "refresh");
   }

   public static String getDescription( com.genexus.internet.HttpContext httpContext ,
                                        String key )
   {
      if (domain.containsKey( key.trim() ))
      {
         return domain.get( key.trim() );
      }
      else
      {
         return "";
      }
   }

   public static GXSimpleCollection<String> getValues( )
   {
      GXSimpleCollection<String> value = new GXSimpleCollection<String>(String.class, "internal", "");
      java.util.Iterator itr = domain.keySet().iterator();
      while(itr.hasNext())
      {
         value.add((String) itr.next());
      }
      return value;
   }

}

