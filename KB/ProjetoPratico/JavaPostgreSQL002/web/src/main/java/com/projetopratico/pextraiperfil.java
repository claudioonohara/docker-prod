package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pextraiperfil extends GXProcedure
{
   public pextraiperfil( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pextraiperfil.class ), "" );
   }

   public pextraiperfil( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 )
   {
      pextraiperfil.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 )
   {
      pextraiperfil.this.AV14payload = aP0;
      pextraiperfil.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV25perfilChar = "" ;
      AV22payloadElements = new GXSimpleCollection<String>(String.class, "internal", "", GxRegex.Split(AV14payload,",")) ;
      AV26GXV1 = 1 ;
      while ( AV26GXV1 <= AV22payloadElements.size() )
      {
         AV23elementPayLoad = (String)AV22payloadElements.elementAt(-1+AV26GXV1) ;
         AV24posicaoPerfil = (byte)(GXutil.strSearch( AV23elementPayLoad, "PERFIL", 1)) ;
         if ( AV24posicaoPerfil > 0 )
         {
            AV25perfilChar = GXutil.substring( AV23elementPayLoad, GXutil.len( AV23elementPayLoad)-1, 1) ;
         }
         AV26GXV1 = (int)(AV26GXV1+1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pextraiperfil.this.AV25perfilChar;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV25perfilChar = "" ;
      AV22payloadElements = new GXSimpleCollection<String>(String.class, "internal", "");
      AV23elementPayLoad = "" ;
      /* GeneXus formulas. */
   }

   private byte AV24posicaoPerfil ;
   private int AV26GXV1 ;
   private String AV25perfilChar ;
   private String AV14payload ;
   private String AV23elementPayLoad ;
   private String[] aP1 ;
   private GXSimpleCollection<String> AV22payloadElements ;
}

