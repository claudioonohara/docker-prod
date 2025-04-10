package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class apiservidorefetivo extends GXProcedure
{
   public apiservidorefetivo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apiservidorefetivo.class ), "" );
   }

   public apiservidorefetivo( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      cleanup();
   }

   public void e11012( )
   {
      /* Servidorefetivo_After Routine */
      returnInSub = false ;
      GXv_int1[0] = Gx_restcode ;
      new com.projetopratico.pstatuscode(remoteHandle, context).execute( AV6Messages, GXv_int1) ;
      this.Gx_restcode = GXv_int1[0] ;
   }

   public void e12012( )
   {
      /* Servidorefetivo_Before Routine */
      returnInSub = false ;
      GXv_objcol_SdtMessages_Message2[0] = AV6Messages ;
      new com.projetopratico.pcors(remoteHandle, context).execute( GXv_objcol_SdtMessages_Message2) ;
      AV6Messages = GXv_objcol_SdtMessages_Message2[0] ;
      if ( AV6Messages.size() > 0 )
      {
         Gx_restcode = (short)(403) ;
         returnInSub = true;
         return;
      }
      GXv_objcol_SdtMessages_Message2[0] = AV6Messages ;
      new com.projetopratico.pestaautenticado(remoteHandle, context).execute( GXv_objcol_SdtMessages_Message2) ;
      AV6Messages = GXv_objcol_SdtMessages_Message2[0] ;
      if ( AV6Messages.size() > 0 )
      {
         Gx_restcode = (short)(401) ;
         returnInSub = true;
         return;
      }
   }

   public void gxep_servidorefetivo__post( com.projetopratico.SdtSDTCRServidorEfetivo in_AV22SDTCRServidorEfetivo ,
                                           com.projetopratico.SdtSDTCRServidorEfetivo [] arr_AV23RetornoSDTCRServidorEfetivo ,
                                           GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV6Messages )
   {
      this.AV22SDTCRServidorEfetivo = in_AV22SDTCRServidorEfetivo;
      AV23RetornoSDTCRServidorEfetivo = new com.projetopratico.SdtSDTCRServidorEfetivo(remoteHandle, context);
      AV6Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV23RetornoSDTCRServidorEfetivo[0] = this.AV23RetornoSDTCRServidorEfetivo;
      arr_AV6Messages[0] = this.AV6Messages;
      e12012 ();
      if ( returnInSub )
      {
         arr_AV23RetornoSDTCRServidorEfetivo[0] = this.AV23RetornoSDTCRServidorEfetivo;
         arr_AV6Messages[0] = this.AV6Messages;
         return;
      }
      /* servidorEfetivo__post Constructor */
      GXv_SdtSDTCRServidorEfetivo3[0] = AV23RetornoSDTCRServidorEfetivo;
      GXv_objcol_SdtMessages_Message2[0] = AV6Messages ;
      new com.projetopratico.pcrservidorefetivopost(remoteHandle, context).execute( AV22SDTCRServidorEfetivo, GXv_SdtSDTCRServidorEfetivo3, GXv_objcol_SdtMessages_Message2) ;
      AV23RetornoSDTCRServidorEfetivo = GXv_SdtSDTCRServidorEfetivo3[0];
      AV6Messages = GXv_objcol_SdtMessages_Message2[0] ;
      e11012 ();
      if ( returnInSub )
      {
         arr_AV23RetornoSDTCRServidorEfetivo[0] = this.AV23RetornoSDTCRServidorEfetivo;
         arr_AV6Messages[0] = this.AV6Messages;
         return;
      }
      arr_AV23RetornoSDTCRServidorEfetivo[0] = this.AV23RetornoSDTCRServidorEfetivo;
      arr_AV6Messages[0] = this.AV6Messages;
   }

   public void gxep_servidorefetivo__put( int in_AV7pes_id ,
                                          String in_AV9se_matricula ,
                                          com.projetopratico.SdtSDTCRServidorEfetivoAtualiza in_AV24SDTCRServidorEfetivoAtualiza ,
                                          com.projetopratico.SdtSDTCRServidorEfetivo [] arr_AV23RetornoSDTCRServidorEfetivo ,
                                          GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV6Messages )
   {
      this.AV7pes_id = in_AV7pes_id;
      this.AV9se_matricula = in_AV9se_matricula;
      this.AV24SDTCRServidorEfetivoAtualiza = in_AV24SDTCRServidorEfetivoAtualiza;
      AV23RetornoSDTCRServidorEfetivo = new com.projetopratico.SdtSDTCRServidorEfetivo(remoteHandle, context);
      AV6Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV23RetornoSDTCRServidorEfetivo[0] = this.AV23RetornoSDTCRServidorEfetivo;
      arr_AV6Messages[0] = this.AV6Messages;
      e12012 ();
      if ( returnInSub )
      {
         arr_AV23RetornoSDTCRServidorEfetivo[0] = this.AV23RetornoSDTCRServidorEfetivo;
         arr_AV6Messages[0] = this.AV6Messages;
         return;
      }
      /* servidorEfetivo__put Constructor */
      GXv_SdtSDTCRServidorEfetivo3[0] = AV23RetornoSDTCRServidorEfetivo;
      GXv_objcol_SdtMessages_Message2[0] = AV6Messages ;
      new com.projetopratico.pcrservidorefetivoput(remoteHandle, context).execute( AV7pes_id, AV9se_matricula, AV24SDTCRServidorEfetivoAtualiza, GXv_SdtSDTCRServidorEfetivo3, GXv_objcol_SdtMessages_Message2) ;
      AV23RetornoSDTCRServidorEfetivo = GXv_SdtSDTCRServidorEfetivo3[0];
      AV6Messages = GXv_objcol_SdtMessages_Message2[0] ;
      e11012 ();
      if ( returnInSub )
      {
         arr_AV23RetornoSDTCRServidorEfetivo[0] = this.AV23RetornoSDTCRServidorEfetivo;
         arr_AV6Messages[0] = this.AV6Messages;
         return;
      }
      arr_AV23RetornoSDTCRServidorEfetivo[0] = this.AV23RetornoSDTCRServidorEfetivo;
      arr_AV6Messages[0] = this.AV6Messages;
   }

   public void gxep_servidorefetivo__get( int in_AV7pes_id ,
                                          String in_AV9se_matricula ,
                                          com.projetopratico.SdtSDTCRServidorEfetivo [] arr_AV22SDTCRServidorEfetivo ,
                                          GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV6Messages )
   {
      this.AV7pes_id = in_AV7pes_id;
      this.AV9se_matricula = in_AV9se_matricula;
      AV22SDTCRServidorEfetivo = new com.projetopratico.SdtSDTCRServidorEfetivo(remoteHandle, context);
      AV6Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV22SDTCRServidorEfetivo[0] = this.AV22SDTCRServidorEfetivo;
      arr_AV6Messages[0] = this.AV6Messages;
      e12012 ();
      if ( returnInSub )
      {
         arr_AV22SDTCRServidorEfetivo[0] = this.AV22SDTCRServidorEfetivo;
         arr_AV6Messages[0] = this.AV6Messages;
         return;
      }
      /* servidorEfetivo__get Constructor */
      GXv_SdtSDTCRServidorEfetivo3[0] = AV22SDTCRServidorEfetivo;
      GXv_objcol_SdtMessages_Message2[0] = AV6Messages ;
      new com.projetopratico.pbuscacrservidorefetivo(remoteHandle, context).execute( AV7pes_id, AV9se_matricula, GXv_SdtSDTCRServidorEfetivo3, GXv_objcol_SdtMessages_Message2) ;
      AV22SDTCRServidorEfetivo = GXv_SdtSDTCRServidorEfetivo3[0];
      AV6Messages = GXv_objcol_SdtMessages_Message2[0] ;
      e11012 ();
      if ( returnInSub )
      {
         arr_AV22SDTCRServidorEfetivo[0] = this.AV22SDTCRServidorEfetivo;
         arr_AV6Messages[0] = this.AV6Messages;
         return;
      }
      arr_AV22SDTCRServidorEfetivo[0] = this.AV22SDTCRServidorEfetivo;
      arr_AV6Messages[0] = this.AV6Messages;
   }

   public void gxep_servidorefetivo__delete( int in_AV7pes_id ,
                                             String in_AV9se_matricula ,
                                             GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV6Messages )
   {
      this.AV7pes_id = in_AV7pes_id;
      this.AV9se_matricula = in_AV9se_matricula;
      AV6Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV6Messages[0] = this.AV6Messages;
      e12012 ();
      if ( returnInSub )
      {
         arr_AV6Messages[0] = this.AV6Messages;
         return;
      }
      /* servidorEfetivo__delete Constructor */
      GXv_objcol_SdtMessages_Message2[0] = AV6Messages ;
      new com.projetopratico.pcrservidorefetivodelete(remoteHandle, context).execute( AV7pes_id, AV9se_matricula, GXv_objcol_SdtMessages_Message2) ;
      AV6Messages = GXv_objcol_SdtMessages_Message2[0] ;
      e11012 ();
      if ( returnInSub )
      {
         arr_AV6Messages[0] = this.AV6Messages;
         return;
      }
      arr_AV6Messages[0] = this.AV6Messages;
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
      AV6Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_int1 = new short[1] ;
      AV23RetornoSDTCRServidorEfetivo = new com.projetopratico.SdtSDTCRServidorEfetivo(remoteHandle, context);
      GXv_SdtSDTCRServidorEfetivo3 = new com.projetopratico.SdtSDTCRServidorEfetivo[1] ;
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
   protected int AV7pes_id ;
   protected boolean returnInSub ;
   protected String AV9se_matricula ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> AV6Messages ;
   protected com.projetopratico.SdtSDTCRServidorEfetivo AV22SDTCRServidorEfetivo ;
   protected com.projetopratico.SdtSDTCRServidorEfetivo AV23RetornoSDTCRServidorEfetivo ;
   protected com.projetopratico.SdtSDTCRServidorEfetivo[] arr_AV23RetornoSDTCRServidorEfetivo ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message>[] arr_AV6Messages ;
   protected com.projetopratico.SdtSDTCRServidorEfetivoAtualiza AV24SDTCRServidorEfetivoAtualiza ;
   protected com.projetopratico.SdtSDTCRServidorEfetivo[] arr_AV22SDTCRServidorEfetivo ;
   protected com.projetopratico.SdtSDTCRServidorEfetivo GXv_SdtSDTCRServidorEfetivo3[] ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message2[] ;
}

