package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class apivariavel extends GXProcedure
{
   public apivariavel( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apivariavel.class ), "" );
   }

   public apivariavel( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      cleanup();
   }

   public void e110B2( )
   {
      /* Variavel_Before Routine */
      returnInSub = false ;
      GXv_objcol_SdtMessages_Message1[0] = AV8Messages ;
      new com.projetopratico.pcors(remoteHandle, context).execute( GXv_objcol_SdtMessages_Message1) ;
      AV8Messages = GXv_objcol_SdtMessages_Message1[0] ;
      if ( AV8Messages.size() > 0 )
      {
         Gx_restcode = (short)(403) ;
         returnInSub = true;
         return;
      }
   }

   public void gxep_variavel( String in_AV5variavel ,
                              String in_AV7filename ,
                              String [] arr_AV6resultado ,
                              GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV8Messages )
   {
      this.AV5variavel = in_AV5variavel;
      this.AV7filename = in_AV7filename;
      AV8Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV6resultado[0] = this.AV6resultado;
      arr_AV8Messages[0] = this.AV8Messages;
      e110B2 ();
      if ( returnInSub )
      {
         arr_AV6resultado[0] = this.AV6resultado;
         arr_AV8Messages[0] = this.AV8Messages;
         return;
      }
      /* variavel Constructor */
      GXv_char2[0] = AV6resultado ;
      GXv_objcol_SdtMessages_Message1[0] = AV8Messages ;
      new com.projetopratico.pvariavel(remoteHandle, context).execute( AV5variavel, AV7filename, GXv_char2, GXv_objcol_SdtMessages_Message1) ;
      this.AV6resultado = GXv_char2[0] ;
      AV8Messages = GXv_objcol_SdtMessages_Message1[0] ;
      arr_AV6resultado[0] = this.AV6resultado;
      arr_AV8Messages[0] = this.AV8Messages;
   }

   public short getrestcode( )
   {
      return Gx_restcode ;
   }

   protected void cleanup( )
   {
      if ( initialized != 1 )
      {
      }
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV6resultado = "" ;
      GXv_char2 = new String[1] ;
      /* GeneXus formulas. */
      initializeGenerics();
   }

   @SuppressWarnings("unchecked")
   private void initializeGenerics( )
   {
      GXv_objcol_SdtMessages_Message1 = new GXBaseCollection[1] ;
   }

   protected short Gx_restcode ;
   protected short initialized ;
   protected String GXv_char2[] ;
   protected boolean returnInSub ;
   protected String AV5variavel ;
   protected String AV7filename ;
   protected String AV6resultado ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> AV8Messages ;
   protected String[] arr_AV6resultado ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message>[] arr_AV8Messages ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message1[] ;
}

