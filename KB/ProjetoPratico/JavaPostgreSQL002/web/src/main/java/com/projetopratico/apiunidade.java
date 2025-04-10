package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class apiunidade extends GXProcedure
{
   public apiunidade( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apiunidade.class ), "" );
   }

   public apiunidade( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      cleanup();
   }

   public void e11052( )
   {
      /* Unidade_After Routine */
      returnInSub = false ;
      GXv_int1[0] = Gx_restcode ;
      new com.projetopratico.pstatuscode(remoteHandle, context).execute( AV5Messages, GXv_int1) ;
      this.Gx_restcode = GXv_int1[0] ;
   }

   public void e12052( )
   {
      /* Unidade_Before Routine */
      returnInSub = false ;
      GXv_objcol_SdtMessages_Message2[0] = AV5Messages ;
      new com.projetopratico.pcors(remoteHandle, context).execute( GXv_objcol_SdtMessages_Message2) ;
      AV5Messages = GXv_objcol_SdtMessages_Message2[0] ;
      if ( AV5Messages.size() > 0 )
      {
         Gx_restcode = (short)(403) ;
         returnInSub = true;
         return;
      }
      GXv_objcol_SdtMessages_Message2[0] = AV5Messages ;
      new com.projetopratico.pestaautenticado(remoteHandle, context).execute( GXv_objcol_SdtMessages_Message2) ;
      AV5Messages = GXv_objcol_SdtMessages_Message2[0] ;
      if ( AV5Messages.size() > 0 )
      {
         Gx_restcode = (short)(401) ;
         returnInSub = true;
         return;
      }
   }

   public void gxep_unidade__post( com.projetopratico.SdtSDTCRUnidade in_AV27SDTCRUnidade ,
                                   com.projetopratico.SdtSDTCRUnidade [] arr_AV31RetornoSDTCRUnidade ,
                                   GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      this.AV27SDTCRUnidade = in_AV27SDTCRUnidade;
      AV31RetornoSDTCRUnidade = new com.projetopratico.SdtSDTCRUnidade(remoteHandle, context);
      AV5Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV31RetornoSDTCRUnidade[0] = this.AV31RetornoSDTCRUnidade;
      arr_AV5Messages[0] = this.AV5Messages;
      e12052 ();
      if ( returnInSub )
      {
         arr_AV31RetornoSDTCRUnidade[0] = this.AV31RetornoSDTCRUnidade;
         arr_AV5Messages[0] = this.AV5Messages;
         return;
      }
      /* unidade__post Constructor */
      GXv_SdtSDTCRUnidade3[0] = AV31RetornoSDTCRUnidade;
      GXv_objcol_SdtMessages_Message2[0] = AV5Messages ;
      new com.projetopratico.pcrunidadepost(remoteHandle, context).execute( AV27SDTCRUnidade, GXv_SdtSDTCRUnidade3, GXv_objcol_SdtMessages_Message2) ;
      AV31RetornoSDTCRUnidade = GXv_SdtSDTCRUnidade3[0];
      AV5Messages = GXv_objcol_SdtMessages_Message2[0] ;
      e11052 ();
      if ( returnInSub )
      {
         arr_AV31RetornoSDTCRUnidade[0] = this.AV31RetornoSDTCRUnidade;
         arr_AV5Messages[0] = this.AV5Messages;
         return;
      }
      arr_AV31RetornoSDTCRUnidade[0] = this.AV31RetornoSDTCRUnidade;
      arr_AV5Messages[0] = this.AV5Messages;
   }

   public void gxep_unidade__put( int in_AV21unid_id ,
                                  com.projetopratico.SdtSDTCRUnidade in_AV27SDTCRUnidade ,
                                  com.projetopratico.SdtSDTCRUnidade [] arr_AV31RetornoSDTCRUnidade ,
                                  GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      this.AV21unid_id = in_AV21unid_id;
      this.AV27SDTCRUnidade = in_AV27SDTCRUnidade;
      AV31RetornoSDTCRUnidade = new com.projetopratico.SdtSDTCRUnidade(remoteHandle, context);
      AV5Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV31RetornoSDTCRUnidade[0] = this.AV31RetornoSDTCRUnidade;
      arr_AV5Messages[0] = this.AV5Messages;
      e12052 ();
      if ( returnInSub )
      {
         arr_AV31RetornoSDTCRUnidade[0] = this.AV31RetornoSDTCRUnidade;
         arr_AV5Messages[0] = this.AV5Messages;
         return;
      }
      /* unidade__put Constructor */
      GXv_SdtSDTCRUnidade3[0] = AV31RetornoSDTCRUnidade;
      GXv_objcol_SdtMessages_Message2[0] = AV5Messages ;
      new com.projetopratico.pcrunidadeput(remoteHandle, context).execute( AV21unid_id, AV27SDTCRUnidade, GXv_SdtSDTCRUnidade3, GXv_objcol_SdtMessages_Message2) ;
      AV31RetornoSDTCRUnidade = GXv_SdtSDTCRUnidade3[0];
      AV5Messages = GXv_objcol_SdtMessages_Message2[0] ;
      e11052 ();
      if ( returnInSub )
      {
         arr_AV31RetornoSDTCRUnidade[0] = this.AV31RetornoSDTCRUnidade;
         arr_AV5Messages[0] = this.AV5Messages;
         return;
      }
      arr_AV31RetornoSDTCRUnidade[0] = this.AV31RetornoSDTCRUnidade;
      arr_AV5Messages[0] = this.AV5Messages;
   }

   public void gxep_unidade__get( int in_AV21unid_id ,
                                  com.projetopratico.SdtSDTCRUnidade [] arr_AV27SDTCRUnidade ,
                                  GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      this.AV21unid_id = in_AV21unid_id;
      AV27SDTCRUnidade = new com.projetopratico.SdtSDTCRUnidade(remoteHandle, context);
      AV5Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV27SDTCRUnidade[0] = this.AV27SDTCRUnidade;
      arr_AV5Messages[0] = this.AV5Messages;
      e12052 ();
      if ( returnInSub )
      {
         arr_AV27SDTCRUnidade[0] = this.AV27SDTCRUnidade;
         arr_AV5Messages[0] = this.AV5Messages;
         return;
      }
      /* unidade__get Constructor */
      GXv_SdtSDTCRUnidade3[0] = AV27SDTCRUnidade;
      GXv_objcol_SdtMessages_Message2[0] = AV5Messages ;
      new com.projetopratico.pbuscacrunidade(remoteHandle, context).execute( AV21unid_id, GXv_SdtSDTCRUnidade3, GXv_objcol_SdtMessages_Message2) ;
      AV27SDTCRUnidade = GXv_SdtSDTCRUnidade3[0];
      AV5Messages = GXv_objcol_SdtMessages_Message2[0] ;
      e11052 ();
      if ( returnInSub )
      {
         arr_AV27SDTCRUnidade[0] = this.AV27SDTCRUnidade;
         arr_AV5Messages[0] = this.AV5Messages;
         return;
      }
      arr_AV27SDTCRUnidade[0] = this.AV27SDTCRUnidade;
      arr_AV5Messages[0] = this.AV5Messages;
   }

   public void gxep_unidade__delete( int in_AV21unid_id ,
                                     GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      this.AV21unid_id = in_AV21unid_id;
      AV5Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV5Messages[0] = this.AV5Messages;
      e12052 ();
      if ( returnInSub )
      {
         arr_AV5Messages[0] = this.AV5Messages;
         return;
      }
      /* unidade__delete Constructor */
      GXv_objcol_SdtMessages_Message2[0] = AV5Messages ;
      new com.projetopratico.pcrunidadedelete(remoteHandle, context).execute( AV21unid_id, GXv_objcol_SdtMessages_Message2) ;
      AV5Messages = GXv_objcol_SdtMessages_Message2[0] ;
      e11052 ();
      if ( returnInSub )
      {
         arr_AV5Messages[0] = this.AV5Messages;
         return;
      }
      arr_AV5Messages[0] = this.AV5Messages;
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
      AV5Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_int1 = new short[1] ;
      AV31RetornoSDTCRUnidade = new com.projetopratico.SdtSDTCRUnidade(remoteHandle, context);
      GXv_SdtSDTCRUnidade3 = new com.projetopratico.SdtSDTCRUnidade[1] ;
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
   protected int AV21unid_id ;
   protected boolean returnInSub ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> AV5Messages ;
   protected com.projetopratico.SdtSDTCRUnidade AV27SDTCRUnidade ;
   protected com.projetopratico.SdtSDTCRUnidade AV31RetornoSDTCRUnidade ;
   protected com.projetopratico.SdtSDTCRUnidade[] arr_AV31RetornoSDTCRUnidade ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message>[] arr_AV5Messages ;
   protected com.projetopratico.SdtSDTCRUnidade[] arr_AV27SDTCRUnidade ;
   protected com.projetopratico.SdtSDTCRUnidade GXv_SdtSDTCRUnidade3[] ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message2[] ;
}

