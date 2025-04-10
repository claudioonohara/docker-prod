package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pstatuscode extends GXProcedure
{
   public pstatuscode( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pstatuscode.class ), "" );
   }

   public pstatuscode( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( GXBaseCollection<com.genexus.SdtMessages_Message> aP0 )
   {
      pstatuscode.this.aP1 = new short[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( GXBaseCollection<com.genexus.SdtMessages_Message> aP0 ,
                        short[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( GXBaseCollection<com.genexus.SdtMessages_Message> aP0 ,
                             short[] aP1 )
   {
      pstatuscode.this.AV9Messages = aP0;
      pstatuscode.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV11GXV1 = 1 ;
      while ( AV11GXV1 <= AV9Messages.size() )
      {
         AV8Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV9Messages.elementAt(-1+AV11GXV1));
         if ( (0==AV8Message.getgxTv_SdtMessages_Message_Type()) )
         {
            Gx_restcode = (short)(404) ;
         }
         else
         {
            Gx_restcode = (short)(400) ;
         }
         AV11GXV1 = (int)(AV11GXV1+1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pstatuscode.this.Gx_restcode;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      /* GeneXus formulas. */
   }

   private short Gx_restcode ;
   private int AV11GXV1 ;
   private short[] aP1 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV9Messages ;
   private com.genexus.SdtMessages_Message AV8Message ;
}

