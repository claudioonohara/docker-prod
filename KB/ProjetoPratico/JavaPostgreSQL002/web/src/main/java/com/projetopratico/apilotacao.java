package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class apilotacao extends GXProcedure
{
   public apilotacao( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apilotacao.class ), "" );
   }

   public apilotacao( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      cleanup();
   }

   public void e11062( )
   {
      /* Lotacao_After Routine */
      returnInSub = false ;
      GXv_int1[0] = Gx_restcode ;
      new com.projetopratico.pstatuscode(remoteHandle, context).execute( AV8Messages, GXv_int1) ;
      this.Gx_restcode = GXv_int1[0] ;
   }

   public void e12062( )
   {
      /* Lotacao_Before Routine */
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

   public void gxep_lotacao__post( com.projetopratico.SdtSDTCRLotacao in_AV18SDTCRLotacao ,
                                   com.projetopratico.SdtSDTCRLotacao [] arr_AV19RetornoSDTCRLotacao ,
                                   GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV8Messages )
   {
      this.AV18SDTCRLotacao = in_AV18SDTCRLotacao;
      AV19RetornoSDTCRLotacao = new com.projetopratico.SdtSDTCRLotacao(remoteHandle, context);
      AV8Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV19RetornoSDTCRLotacao[0] = this.AV19RetornoSDTCRLotacao;
      arr_AV8Messages[0] = this.AV8Messages;
      e12062 ();
      if ( returnInSub )
      {
         arr_AV19RetornoSDTCRLotacao[0] = this.AV19RetornoSDTCRLotacao;
         arr_AV8Messages[0] = this.AV8Messages;
         return;
      }
      /* lotacao__post Constructor */
      GXv_SdtSDTCRLotacao3[0] = AV19RetornoSDTCRLotacao;
      GXv_objcol_SdtMessages_Message2[0] = AV8Messages ;
      new com.projetopratico.pcrlotacaopost(remoteHandle, context).execute( AV18SDTCRLotacao, GXv_SdtSDTCRLotacao3, GXv_objcol_SdtMessages_Message2) ;
      AV19RetornoSDTCRLotacao = GXv_SdtSDTCRLotacao3[0];
      AV8Messages = GXv_objcol_SdtMessages_Message2[0] ;
      e11062 ();
      if ( returnInSub )
      {
         arr_AV19RetornoSDTCRLotacao[0] = this.AV19RetornoSDTCRLotacao;
         arr_AV8Messages[0] = this.AV8Messages;
         return;
      }
      arr_AV19RetornoSDTCRLotacao[0] = this.AV19RetornoSDTCRLotacao;
      arr_AV8Messages[0] = this.AV8Messages;
   }

   public void gxep_lotacao__put( int in_AV11lot_id ,
                                  com.projetopratico.SdtSDTCRLotacao in_AV18SDTCRLotacao ,
                                  com.projetopratico.SdtSDTCRLotacao [] arr_AV19RetornoSDTCRLotacao ,
                                  GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV8Messages )
   {
      this.AV11lot_id = in_AV11lot_id;
      this.AV18SDTCRLotacao = in_AV18SDTCRLotacao;
      AV19RetornoSDTCRLotacao = new com.projetopratico.SdtSDTCRLotacao(remoteHandle, context);
      AV8Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV19RetornoSDTCRLotacao[0] = this.AV19RetornoSDTCRLotacao;
      arr_AV8Messages[0] = this.AV8Messages;
      e12062 ();
      if ( returnInSub )
      {
         arr_AV19RetornoSDTCRLotacao[0] = this.AV19RetornoSDTCRLotacao;
         arr_AV8Messages[0] = this.AV8Messages;
         return;
      }
      /* lotacao__put Constructor */
      GXv_SdtSDTCRLotacao3[0] = AV19RetornoSDTCRLotacao;
      GXv_objcol_SdtMessages_Message2[0] = AV8Messages ;
      new com.projetopratico.pcrlotacaoput(remoteHandle, context).execute( AV11lot_id, AV18SDTCRLotacao, GXv_SdtSDTCRLotacao3, GXv_objcol_SdtMessages_Message2) ;
      AV19RetornoSDTCRLotacao = GXv_SdtSDTCRLotacao3[0];
      AV8Messages = GXv_objcol_SdtMessages_Message2[0] ;
      e11062 ();
      if ( returnInSub )
      {
         arr_AV19RetornoSDTCRLotacao[0] = this.AV19RetornoSDTCRLotacao;
         arr_AV8Messages[0] = this.AV8Messages;
         return;
      }
      arr_AV19RetornoSDTCRLotacao[0] = this.AV19RetornoSDTCRLotacao;
      arr_AV8Messages[0] = this.AV8Messages;
   }

   public void gxep_lotacao__get( int in_AV11lot_id ,
                                  com.projetopratico.SdtSDTCRLotacao [] arr_AV18SDTCRLotacao ,
                                  GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV8Messages )
   {
      this.AV11lot_id = in_AV11lot_id;
      AV18SDTCRLotacao = new com.projetopratico.SdtSDTCRLotacao(remoteHandle, context);
      AV8Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV18SDTCRLotacao[0] = this.AV18SDTCRLotacao;
      arr_AV8Messages[0] = this.AV8Messages;
      e12062 ();
      if ( returnInSub )
      {
         arr_AV18SDTCRLotacao[0] = this.AV18SDTCRLotacao;
         arr_AV8Messages[0] = this.AV8Messages;
         return;
      }
      /* lotacao__get Constructor */
      GXv_SdtSDTCRLotacao3[0] = AV18SDTCRLotacao;
      GXv_objcol_SdtMessages_Message2[0] = AV8Messages ;
      new com.projetopratico.pbuscacrlotacao(remoteHandle, context).execute( AV11lot_id, GXv_SdtSDTCRLotacao3, GXv_objcol_SdtMessages_Message2) ;
      AV18SDTCRLotacao = GXv_SdtSDTCRLotacao3[0];
      AV8Messages = GXv_objcol_SdtMessages_Message2[0] ;
      e11062 ();
      if ( returnInSub )
      {
         arr_AV18SDTCRLotacao[0] = this.AV18SDTCRLotacao;
         arr_AV8Messages[0] = this.AV8Messages;
         return;
      }
      arr_AV18SDTCRLotacao[0] = this.AV18SDTCRLotacao;
      arr_AV8Messages[0] = this.AV8Messages;
   }

   public void gxep_lotacao__delete( int in_AV11lot_id ,
                                     GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV8Messages )
   {
      this.AV11lot_id = in_AV11lot_id;
      AV8Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV8Messages[0] = this.AV8Messages;
      e12062 ();
      if ( returnInSub )
      {
         arr_AV8Messages[0] = this.AV8Messages;
         return;
      }
      /* lotacao__delete Constructor */
      GXv_objcol_SdtMessages_Message2[0] = AV8Messages ;
      new com.projetopratico.pcrlotacaodelete(remoteHandle, context).execute( AV11lot_id, GXv_objcol_SdtMessages_Message2) ;
      AV8Messages = GXv_objcol_SdtMessages_Message2[0] ;
      e11062 ();
      if ( returnInSub )
      {
         arr_AV8Messages[0] = this.AV8Messages;
         return;
      }
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
      AV19RetornoSDTCRLotacao = new com.projetopratico.SdtSDTCRLotacao(remoteHandle, context);
      GXv_SdtSDTCRLotacao3 = new com.projetopratico.SdtSDTCRLotacao[1] ;
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
   protected int AV11lot_id ;
   protected boolean returnInSub ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> AV8Messages ;
   protected com.projetopratico.SdtSDTCRLotacao AV18SDTCRLotacao ;
   protected com.projetopratico.SdtSDTCRLotacao AV19RetornoSDTCRLotacao ;
   protected com.projetopratico.SdtSDTCRLotacao[] arr_AV19RetornoSDTCRLotacao ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message>[] arr_AV8Messages ;
   protected com.projetopratico.SdtSDTCRLotacao[] arr_AV18SDTCRLotacao ;
   protected com.projetopratico.SdtSDTCRLotacao GXv_SdtSDTCRLotacao3[] ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message2[] ;
}

