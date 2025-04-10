package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class apiconsulta extends GXProcedure
{
   public apiconsulta( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apiconsulta.class ), "" );
   }

   public apiconsulta( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      cleanup();
   }

   public void e11082( )
   {
      /* Efetivosunidade_After Routine */
      returnInSub = false ;
      GXv_int1[0] = Gx_restcode ;
      new com.projetopratico.pstatuscode(remoteHandle, context).execute( AV5Messages, GXv_int1) ;
      this.Gx_restcode = GXv_int1[0] ;
   }

   public void e12082( )
   {
      /* Enderecofuncional_After Routine */
      returnInSub = false ;
      GXv_int1[0] = Gx_restcode ;
      new com.projetopratico.pstatuscode(remoteHandle, context).execute( AV5Messages, GXv_int1) ;
      this.Gx_restcode = GXv_int1[0] ;
   }

   public void e13082( )
   {
      /* Efetivosunidade_Before Routine */
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

   public void e14082( )
   {
      /* Enderecofuncional_Before Routine */
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

   public void gxep_efetivosunidade( short in_AV14unidid ,
                                     int in_AV15PaginaAtual ,
                                     int in_AV16nroPorPagina ,
                                     com.projetopratico.SdtSDTEfetivosUnidade [] arr_AV7SDTEfetivosUnidade ,
                                     GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      this.AV14unidid = in_AV14unidid;
      this.AV15PaginaAtual = in_AV15PaginaAtual;
      this.AV16nroPorPagina = in_AV16nroPorPagina;
      AV7SDTEfetivosUnidade = new com.projetopratico.SdtSDTEfetivosUnidade(remoteHandle, context);
      AV5Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV7SDTEfetivosUnidade[0] = this.AV7SDTEfetivosUnidade;
      arr_AV5Messages[0] = this.AV5Messages;
      e13082 ();
      if ( returnInSub )
      {
         arr_AV7SDTEfetivosUnidade[0] = this.AV7SDTEfetivosUnidade;
         arr_AV5Messages[0] = this.AV5Messages;
         return;
      }
      /* efetivosUnidade Constructor */
      GXv_SdtSDTEfetivosUnidade3[0] = AV7SDTEfetivosUnidade;
      GXv_objcol_SdtMessages_Message2[0] = AV5Messages ;
      new com.projetopratico.pefetivosunidade(remoteHandle, context).execute( AV14unidid, AV15PaginaAtual, AV16nroPorPagina, GXv_SdtSDTEfetivosUnidade3, GXv_objcol_SdtMessages_Message2) ;
      AV7SDTEfetivosUnidade = GXv_SdtSDTEfetivosUnidade3[0];
      AV5Messages = GXv_objcol_SdtMessages_Message2[0] ;
      e11082 ();
      if ( returnInSub )
      {
         arr_AV7SDTEfetivosUnidade[0] = this.AV7SDTEfetivosUnidade;
         arr_AV5Messages[0] = this.AV5Messages;
         return;
      }
      arr_AV7SDTEfetivosUnidade[0] = this.AV7SDTEfetivosUnidade;
      arr_AV5Messages[0] = this.AV5Messages;
   }

   public void gxep_enderecofuncional( String in_AV11pes_nome ,
                                       int in_AV15PaginaAtual ,
                                       int in_AV16nroPorPagina ,
                                       com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional [] arr_AV13SDTServidorEfetivoEnderecoFuncional ,
                                       GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      this.AV11pes_nome = in_AV11pes_nome;
      this.AV15PaginaAtual = in_AV15PaginaAtual;
      this.AV16nroPorPagina = in_AV16nroPorPagina;
      AV13SDTServidorEfetivoEnderecoFuncional = new com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional(remoteHandle, context);
      AV5Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV13SDTServidorEfetivoEnderecoFuncional[0] = this.AV13SDTServidorEfetivoEnderecoFuncional;
      arr_AV5Messages[0] = this.AV5Messages;
      e14082 ();
      if ( returnInSub )
      {
         arr_AV13SDTServidorEfetivoEnderecoFuncional[0] = this.AV13SDTServidorEfetivoEnderecoFuncional;
         arr_AV5Messages[0] = this.AV5Messages;
         return;
      }
      /* enderecoFuncional Constructor */
      GXv_SdtSDTServidorEfetivoEnderecoFuncional4[0] = AV13SDTServidorEfetivoEnderecoFuncional;
      GXv_objcol_SdtMessages_Message2[0] = AV5Messages ;
      new com.projetopratico.pconsultaenderecofuncional(remoteHandle, context).execute( AV11pes_nome, AV15PaginaAtual, AV16nroPorPagina, GXv_SdtSDTServidorEfetivoEnderecoFuncional4, GXv_objcol_SdtMessages_Message2) ;
      AV13SDTServidorEfetivoEnderecoFuncional = GXv_SdtSDTServidorEfetivoEnderecoFuncional4[0];
      AV5Messages = GXv_objcol_SdtMessages_Message2[0] ;
      e12082 ();
      if ( returnInSub )
      {
         arr_AV13SDTServidorEfetivoEnderecoFuncional[0] = this.AV13SDTServidorEfetivoEnderecoFuncional;
         arr_AV5Messages[0] = this.AV5Messages;
         return;
      }
      arr_AV13SDTServidorEfetivoEnderecoFuncional[0] = this.AV13SDTServidorEfetivoEnderecoFuncional;
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
      AV7SDTEfetivosUnidade = new com.projetopratico.SdtSDTEfetivosUnidade(remoteHandle, context);
      GXv_SdtSDTEfetivosUnidade3 = new com.projetopratico.SdtSDTEfetivosUnidade[1] ;
      AV13SDTServidorEfetivoEnderecoFuncional = new com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional(remoteHandle, context);
      GXv_SdtSDTServidorEfetivoEnderecoFuncional4 = new com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional[1] ;
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
   protected short AV14unidid ;
   protected short initialized ;
   protected int AV15PaginaAtual ;
   protected int AV16nroPorPagina ;
   protected boolean returnInSub ;
   protected String AV11pes_nome ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> AV5Messages ;
   protected com.projetopratico.SdtSDTEfetivosUnidade AV7SDTEfetivosUnidade ;
   protected com.projetopratico.SdtSDTEfetivosUnidade[] arr_AV7SDTEfetivosUnidade ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message>[] arr_AV5Messages ;
   protected com.projetopratico.SdtSDTEfetivosUnidade GXv_SdtSDTEfetivosUnidade3[] ;
   protected com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional AV13SDTServidorEfetivoEnderecoFuncional ;
   protected com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional[] arr_AV13SDTServidorEfetivoEnderecoFuncional ;
   protected com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional GXv_SdtSDTServidorEfetivoEnderecoFuncional4[] ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message2[] ;
}

