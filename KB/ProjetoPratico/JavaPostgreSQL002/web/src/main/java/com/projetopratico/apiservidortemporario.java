package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class apiservidortemporario extends GXProcedure
{
   public apiservidortemporario( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apiservidortemporario.class ), "" );
   }

   public apiservidortemporario( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      cleanup();
   }

   public void e11032( )
   {
      /* Servidortemporario_After Routine */
      returnInSub = false ;
      GXv_int1[0] = Gx_restcode ;
      new com.projetopratico.pstatuscode(remoteHandle, context).execute( AV5Messages, GXv_int1) ;
      this.Gx_restcode = GXv_int1[0] ;
   }

   public void e12032( )
   {
      /* Servidortemporario_Before Routine */
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

   public void gxep_servidortemporario__post( com.projetopratico.SdtSDTCRServidorTemporario in_AV22SDTCRServidorTemporario ,
                                              com.projetopratico.SdtSDTCRServidorTemporario [] arr_AV23RetornoSDTCRServidorTemporario ,
                                              GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      this.AV22SDTCRServidorTemporario = in_AV22SDTCRServidorTemporario;
      AV23RetornoSDTCRServidorTemporario = new com.projetopratico.SdtSDTCRServidorTemporario(remoteHandle, context);
      AV5Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV23RetornoSDTCRServidorTemporario[0] = this.AV23RetornoSDTCRServidorTemporario;
      arr_AV5Messages[0] = this.AV5Messages;
      e12032 ();
      if ( returnInSub )
      {
         arr_AV23RetornoSDTCRServidorTemporario[0] = this.AV23RetornoSDTCRServidorTemporario;
         arr_AV5Messages[0] = this.AV5Messages;
         return;
      }
      /* servidorTemporario__post Constructor */
      GXv_SdtSDTCRServidorTemporario3[0] = AV23RetornoSDTCRServidorTemporario;
      GXv_objcol_SdtMessages_Message2[0] = AV5Messages ;
      new com.projetopratico.pcrservidortemporariopost(remoteHandle, context).execute( AV22SDTCRServidorTemporario, GXv_SdtSDTCRServidorTemporario3, GXv_objcol_SdtMessages_Message2) ;
      AV23RetornoSDTCRServidorTemporario = GXv_SdtSDTCRServidorTemporario3[0];
      AV5Messages = GXv_objcol_SdtMessages_Message2[0] ;
      e11032 ();
      if ( returnInSub )
      {
         arr_AV23RetornoSDTCRServidorTemporario[0] = this.AV23RetornoSDTCRServidorTemporario;
         arr_AV5Messages[0] = this.AV5Messages;
         return;
      }
      arr_AV23RetornoSDTCRServidorTemporario[0] = this.AV23RetornoSDTCRServidorTemporario;
      arr_AV5Messages[0] = this.AV5Messages;
   }

   public void gxep_servidortemporario__put( int in_AV6pes_id ,
                                             java.util.Date in_AV17st_data_admissao ,
                                             java.util.Date in_AV18st_data_demissao ,
                                             com.projetopratico.SdtSDTCRServidorTemporarioAtualiza in_AV24SDTCRServidorTemporarioAtualiza ,
                                             com.projetopratico.SdtSDTCRServidorTemporario [] arr_AV23RetornoSDTCRServidorTemporario ,
                                             GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      this.AV6pes_id = in_AV6pes_id;
      this.AV17st_data_admissao = in_AV17st_data_admissao;
      this.AV18st_data_demissao = in_AV18st_data_demissao;
      this.AV24SDTCRServidorTemporarioAtualiza = in_AV24SDTCRServidorTemporarioAtualiza;
      AV23RetornoSDTCRServidorTemporario = new com.projetopratico.SdtSDTCRServidorTemporario(remoteHandle, context);
      AV5Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV23RetornoSDTCRServidorTemporario[0] = this.AV23RetornoSDTCRServidorTemporario;
      arr_AV5Messages[0] = this.AV5Messages;
      e12032 ();
      if ( returnInSub )
      {
         arr_AV23RetornoSDTCRServidorTemporario[0] = this.AV23RetornoSDTCRServidorTemporario;
         arr_AV5Messages[0] = this.AV5Messages;
         return;
      }
      /* servidorTemporario__put Constructor */
      GXv_SdtSDTCRServidorTemporario3[0] = AV23RetornoSDTCRServidorTemporario;
      GXv_objcol_SdtMessages_Message2[0] = AV5Messages ;
      new com.projetopratico.pcrservidortemporarioput(remoteHandle, context).execute( AV6pes_id, AV17st_data_admissao, AV18st_data_demissao, AV24SDTCRServidorTemporarioAtualiza, GXv_SdtSDTCRServidorTemporario3, GXv_objcol_SdtMessages_Message2) ;
      AV23RetornoSDTCRServidorTemporario = GXv_SdtSDTCRServidorTemporario3[0];
      AV5Messages = GXv_objcol_SdtMessages_Message2[0] ;
      e11032 ();
      if ( returnInSub )
      {
         arr_AV23RetornoSDTCRServidorTemporario[0] = this.AV23RetornoSDTCRServidorTemporario;
         arr_AV5Messages[0] = this.AV5Messages;
         return;
      }
      arr_AV23RetornoSDTCRServidorTemporario[0] = this.AV23RetornoSDTCRServidorTemporario;
      arr_AV5Messages[0] = this.AV5Messages;
   }

   public void gxep_servidortemporario__get( int in_AV6pes_id ,
                                             java.util.Date in_AV17st_data_admissao ,
                                             java.util.Date in_AV18st_data_demissao ,
                                             com.projetopratico.SdtSDTCRServidorTemporario [] arr_AV23RetornoSDTCRServidorTemporario ,
                                             GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      this.AV6pes_id = in_AV6pes_id;
      this.AV17st_data_admissao = in_AV17st_data_admissao;
      this.AV18st_data_demissao = in_AV18st_data_demissao;
      AV23RetornoSDTCRServidorTemporario = new com.projetopratico.SdtSDTCRServidorTemporario(remoteHandle, context);
      AV5Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV23RetornoSDTCRServidorTemporario[0] = this.AV23RetornoSDTCRServidorTemporario;
      arr_AV5Messages[0] = this.AV5Messages;
      e12032 ();
      if ( returnInSub )
      {
         arr_AV23RetornoSDTCRServidorTemporario[0] = this.AV23RetornoSDTCRServidorTemporario;
         arr_AV5Messages[0] = this.AV5Messages;
         return;
      }
      /* servidorTemporario__get Constructor */
      GXv_SdtSDTCRServidorTemporario3[0] = AV23RetornoSDTCRServidorTemporario;
      GXv_objcol_SdtMessages_Message2[0] = AV5Messages ;
      new com.projetopratico.pbuscacrservidortemporario(remoteHandle, context).execute( AV6pes_id, AV17st_data_admissao, AV18st_data_demissao, GXv_SdtSDTCRServidorTemporario3, GXv_objcol_SdtMessages_Message2) ;
      AV23RetornoSDTCRServidorTemporario = GXv_SdtSDTCRServidorTemporario3[0];
      AV5Messages = GXv_objcol_SdtMessages_Message2[0] ;
      e11032 ();
      if ( returnInSub )
      {
         arr_AV23RetornoSDTCRServidorTemporario[0] = this.AV23RetornoSDTCRServidorTemporario;
         arr_AV5Messages[0] = this.AV5Messages;
         return;
      }
      arr_AV23RetornoSDTCRServidorTemporario[0] = this.AV23RetornoSDTCRServidorTemporario;
      arr_AV5Messages[0] = this.AV5Messages;
   }

   public void gxep_servidortemporario__delete( int in_AV6pes_id ,
                                                java.util.Date in_AV17st_data_admissao ,
                                                java.util.Date in_AV18st_data_demissao ,
                                                GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      this.AV6pes_id = in_AV6pes_id;
      this.AV17st_data_admissao = in_AV17st_data_admissao;
      this.AV18st_data_demissao = in_AV18st_data_demissao;
      AV5Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV5Messages[0] = this.AV5Messages;
      e12032 ();
      if ( returnInSub )
      {
         arr_AV5Messages[0] = this.AV5Messages;
         return;
      }
      /* servidorTemporario__delete Constructor */
      GXv_objcol_SdtMessages_Message2[0] = AV5Messages ;
      new com.projetopratico.pcrservidortemporariodelete(remoteHandle, context).execute( AV6pes_id, AV17st_data_admissao, AV18st_data_demissao, GXv_objcol_SdtMessages_Message2) ;
      AV5Messages = GXv_objcol_SdtMessages_Message2[0] ;
      e11032 ();
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
      AV23RetornoSDTCRServidorTemporario = new com.projetopratico.SdtSDTCRServidorTemporario(remoteHandle, context);
      GXv_SdtSDTCRServidorTemporario3 = new com.projetopratico.SdtSDTCRServidorTemporario[1] ;
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
   protected int AV6pes_id ;
   protected java.util.Date AV17st_data_admissao ;
   protected java.util.Date AV18st_data_demissao ;
   protected boolean returnInSub ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> AV5Messages ;
   protected com.projetopratico.SdtSDTCRServidorTemporario AV22SDTCRServidorTemporario ;
   protected com.projetopratico.SdtSDTCRServidorTemporario AV23RetornoSDTCRServidorTemporario ;
   protected com.projetopratico.SdtSDTCRServidorTemporario[] arr_AV23RetornoSDTCRServidorTemporario ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message>[] arr_AV5Messages ;
   protected com.projetopratico.SdtSDTCRServidorTemporarioAtualiza AV24SDTCRServidorTemporarioAtualiza ;
   protected com.projetopratico.SdtSDTCRServidorTemporario GXv_SdtSDTCRServidorTemporario3[] ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message2[] ;
}

