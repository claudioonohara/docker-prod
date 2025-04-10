package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfomatadatatoken extends GXProcedure
{
   public pfomatadatatoken( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfomatadatatoken.class ), "" );
   }

   public pfomatadatatoken( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( java.util.Date aP0 )
   {
      pfomatadatatoken.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( java.util.Date aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( java.util.Date aP0 ,
                             String[] aP1 )
   {
      pfomatadatatoken.this.AV27TokenExpiresInDateTime = aP0;
      pfomatadatatoken.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV28TokenExpiresInDateTimeFormatted += GXutil.str( GXutil.year( AV27TokenExpiresInDateTime), 10, 0) ;
      AV28TokenExpiresInDateTimeFormatted += "/" ;
      AV28TokenExpiresInDateTimeFormatted += GXutil.padl( GXutil.str( GXutil.month( AV27TokenExpiresInDateTime), 10, 0), (short)(2), "0") ;
      AV28TokenExpiresInDateTimeFormatted += "/" ;
      AV28TokenExpiresInDateTimeFormatted += GXutil.padl( GXutil.str( GXutil.day( AV27TokenExpiresInDateTime), 10, 0), (short)(2), "0") ;
      AV28TokenExpiresInDateTimeFormatted += " " ;
      AV28TokenExpiresInDateTimeFormatted += GXutil.padl( GXutil.str( GXutil.hour( AV27TokenExpiresInDateTime), 10, 0), (short)(2), "0") ;
      AV28TokenExpiresInDateTimeFormatted += ":" ;
      AV28TokenExpiresInDateTimeFormatted += GXutil.padl( GXutil.str( GXutil.minute( AV27TokenExpiresInDateTime), 10, 0), (short)(2), "0") ;
      AV28TokenExpiresInDateTimeFormatted += ":" ;
      AV28TokenExpiresInDateTimeFormatted += GXutil.padl( GXutil.str( GXutil.second( AV27TokenExpiresInDateTime), 10, 0), (short)(2), "0") ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pfomatadatatoken.this.AV28TokenExpiresInDateTimeFormatted;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV28TokenExpiresInDateTimeFormatted = "" ;
      /* GeneXus formulas. */
   }

   private java.util.Date AV27TokenExpiresInDateTime ;
   private String AV28TokenExpiresInDateTimeFormatted ;
   private String[] aP1 ;
}

