package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class apifotopessoa extends GXProcedure
{
   public apifotopessoa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apifotopessoa.class ), "" );
   }

   public apifotopessoa( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      cleanup();
   }

   public void e11092( )
   {
      /* Fotopessoa_After Routine */
      returnInSub = false ;
      GXv_int1[0] = Gx_restcode ;
      new com.projetopratico.pstatuscode(remoteHandle, context).execute( AV8Messages, GXv_int1) ;
      this.Gx_restcode = GXv_int1[0] ;
   }

   public void e12092( )
   {
      /* Fotopessoa_Before Routine */
      returnInSub = false ;
      GXv_objcol_SdtMessages_Message2[0] = AV8Messages ;
      new com.projetopratico.pcors(remoteHandle, context).execute( GXv_objcol_SdtMessages_Message2) ;
      AV8Messages = GXv_objcol_SdtMessages_Message2[0] ;
      if ( AV8Messages.size() > 0 )
      {
         Gx_restcode = (short)(403) ;
         returnInSub = true;
         return;
      }
      GXv_objcol_SdtMessages_Message2[0] = AV8Messages ;
      new com.projetopratico.pestaautenticado(remoteHandle, context).execute( GXv_objcol_SdtMessages_Message2) ;
      AV8Messages = GXv_objcol_SdtMessages_Message2[0] ;
      if ( AV8Messages.size() > 0 )
      {
         Gx_restcode = (short)(401) ;
         returnInSub = true;
         return;
      }
   }

   public void gxep_fotopessoa__post( int in_AV10pes_id ,
                                      java.util.Date in_AV18fp_data ,
                                      String in_AV21fp_foto ,
                                      com.projetopratico.SdtSDTFotoPessoa [] arr_AV23SDTFotoPessoa ,
                                      GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV8Messages )
   {
      this.AV10pes_id = in_AV10pes_id;
      this.AV18fp_data = in_AV18fp_data;
      this.AV21fp_foto = in_AV21fp_foto;
      AV23SDTFotoPessoa = new com.projetopratico.SdtSDTFotoPessoa(remoteHandle, context);
      AV8Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV23SDTFotoPessoa[0] = this.AV23SDTFotoPessoa;
      arr_AV8Messages[0] = this.AV8Messages;
      e12092 ();
      if ( returnInSub )
      {
         arr_AV23SDTFotoPessoa[0] = this.AV23SDTFotoPessoa;
         arr_AV8Messages[0] = this.AV8Messages;
         return;
      }
      /* fotoPessoa__post Constructor */
      GXv_SdtSDTFotoPessoa3[0] = AV23SDTFotoPessoa;
      GXv_objcol_SdtMessages_Message2[0] = AV8Messages ;
      new com.projetopratico.pfotopessoapost(remoteHandle, context).execute( AV10pes_id, AV18fp_data, AV21fp_foto, GXv_SdtSDTFotoPessoa3, GXv_objcol_SdtMessages_Message2) ;
      AV23SDTFotoPessoa = GXv_SdtSDTFotoPessoa3[0];
      AV8Messages = GXv_objcol_SdtMessages_Message2[0] ;
      e11092 ();
      if ( returnInSub )
      {
         arr_AV23SDTFotoPessoa[0] = this.AV23SDTFotoPessoa;
         arr_AV8Messages[0] = this.AV8Messages;
         return;
      }
      arr_AV23SDTFotoPessoa[0] = this.AV23SDTFotoPessoa;
      arr_AV8Messages[0] = this.AV8Messages;
   }

   public void gxep_fotopessoa__get( int in_AV5fp_id ,
                                     com.projetopratico.SdtSDTFotoPessoa [] arr_AV7fotoPessoa ,
                                     GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV8Messages )
   {
      this.AV5fp_id = in_AV5fp_id;
      AV7fotoPessoa = new com.projetopratico.SdtSDTFotoPessoa(remoteHandle, context);
      AV8Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV7fotoPessoa[0] = this.AV7fotoPessoa;
      arr_AV8Messages[0] = this.AV8Messages;
      e12092 ();
      if ( returnInSub )
      {
         arr_AV7fotoPessoa[0] = this.AV7fotoPessoa;
         arr_AV8Messages[0] = this.AV8Messages;
         return;
      }
      /* fotoPessoa__get Constructor */
      GXv_SdtSDTFotoPessoa3[0] = AV7fotoPessoa;
      GXv_objcol_SdtMessages_Message2[0] = AV8Messages ;
      new com.projetopratico.pfotopessoaget(remoteHandle, context).execute( AV5fp_id, GXv_SdtSDTFotoPessoa3, GXv_objcol_SdtMessages_Message2) ;
      AV7fotoPessoa = GXv_SdtSDTFotoPessoa3[0];
      AV8Messages = GXv_objcol_SdtMessages_Message2[0] ;
      e11092 ();
      if ( returnInSub )
      {
         arr_AV7fotoPessoa[0] = this.AV7fotoPessoa;
         arr_AV8Messages[0] = this.AV8Messages;
         return;
      }
      arr_AV7fotoPessoa[0] = this.AV7fotoPessoa;
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
      GXv_int1 = new short[1] ;
      AV23SDTFotoPessoa = new com.projetopratico.SdtSDTFotoPessoa(remoteHandle, context);
      AV7fotoPessoa = new com.projetopratico.SdtSDTFotoPessoa(remoteHandle, context);
      GXv_SdtSDTFotoPessoa3 = new com.projetopratico.SdtSDTFotoPessoa[1] ;
      /* GeneXus formulas. */
      initializeGenerics();
   }

   @SuppressWarnings("unchecked")
   private void initializeGenerics( )
   {
      GXv_objcol_SdtMessages_Message2 = new GXBaseCollection[1] ;
   }

   protected short Gx_restcode ;
   protected short GXv_int1[] ;
   protected short initialized ;
   protected int AV10pes_id ;
   protected int AV5fp_id ;
   protected java.util.Date AV18fp_data ;
   protected boolean returnInSub ;
   protected String AV21fp_foto ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> AV8Messages ;
   protected com.projetopratico.SdtSDTFotoPessoa AV23SDTFotoPessoa ;
   protected com.projetopratico.SdtSDTFotoPessoa[] arr_AV23SDTFotoPessoa ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message>[] arr_AV8Messages ;
   protected com.projetopratico.SdtSDTFotoPessoa AV7fotoPessoa ;
   protected com.projetopratico.SdtSDTFotoPessoa[] arr_AV7fotoPessoa ;
   protected com.projetopratico.SdtSDTFotoPessoa GXv_SdtSDTFotoPessoa3[] ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message2[] ;
}

