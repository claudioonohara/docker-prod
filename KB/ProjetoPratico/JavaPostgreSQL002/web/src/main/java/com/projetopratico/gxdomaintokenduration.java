package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;

public final  class gxdomaintokenduration
{
   private static java.util.TreeMap<Integer, String> domain = new java.util.TreeMap<>();
   static
   {
      domain.put((int)300, "LOGIN");
      domain.put((int)7200, "REFRESH");
   }

   public static String getDescription( com.genexus.internet.HttpContext httpContext ,
                                        int key )
   {
      if (domain.containsKey( key ))
      {
         return domain.get( key );
      }
      else
      {
         return "";
      }
   }

   public static GXSimpleCollection<Integer> getValues( )
   {
      GXSimpleCollection<Integer> value = new GXSimpleCollection<Integer>(Integer.class, "internal", "");
      java.util.Iterator itr = domain.keySet().iterator();
      while(itr.hasNext())
      {
         value.add((Integer) itr.next());
      }
      return value;
   }

}

