package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinsereservidortemporario extends GXProcedure
{
   public pinsereservidortemporario( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinsereservidortemporario.class ), "" );
   }

   public pinsereservidortemporario( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int[] aP0 ,
                                                                        java.util.Date[] aP1 ,
                                                                        java.util.Date[] aP2 )
   {
      pinsereservidortemporario.this.aP3 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( int[] aP0 ,
                        java.util.Date[] aP1 ,
                        java.util.Date[] aP2 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( int[] aP0 ,
                             java.util.Date[] aP1 ,
                             java.util.Date[] aP2 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 )
   {
      pinsereservidortemporario.this.AV17pes_id = aP0[0];
      this.aP0 = aP0;
      pinsereservidortemporario.this.AV28st_data_admissao = aP1[0];
      this.aP1 = aP1;
      pinsereservidortemporario.this.AV29st_data_demissao = aP2[0];
      this.aP2 = aP2;
      pinsereservidortemporario.this.AV10Messages = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV10Messages.clear();
      GXv_int1[0] = AV17pes_id ;
      GXv_date2[0] = AV28st_data_admissao ;
      GXv_date3[0] = AV29st_data_demissao ;
      GXv_boolean4[0] = AV26existe_servidor_temporario ;
      new com.projetopratico.pbuscaservidortemporario(remoteHandle, context).execute( GXv_int1, GXv_date2, GXv_date3, GXv_boolean4) ;
      pinsereservidortemporario.this.AV17pes_id = GXv_int1[0] ;
      pinsereservidortemporario.this.AV28st_data_admissao = GXv_date2[0] ;
      pinsereservidortemporario.this.AV29st_data_demissao = GXv_date3[0] ;
      pinsereservidortemporario.this.AV26existe_servidor_temporario = GXv_boolean4[0] ;
      if ( AV26existe_servidor_temporario )
      {
         AV9Message.setgxTv_SdtMessages_Message_Description( "Ja existe servidor temporario com data de admissao e demissao informadas" );
         AV10Messages.add(AV9Message, 0);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      else
      {
         AV27servidor_temporario = (com.projetopratico.Sdtservidor_temporario)new com.projetopratico.Sdtservidor_temporario( remoteHandle, context);
         AV27servidor_temporario.setgxTv_Sdtservidor_temporario_Pes_id( AV17pes_id );
         AV27servidor_temporario.setgxTv_Sdtservidor_temporario_St_data_admissao( AV28st_data_admissao );
         AV27servidor_temporario.setgxTv_Sdtservidor_temporario_St_data_demissao( AV29st_data_demissao );
         AV27servidor_temporario.Save();
         if ( AV27servidor_temporario.Fail() )
         {
            Application.rollbackDataStores(context, remoteHandle, pr_default, "pinsereservidortemporario");
            AV10Messages = AV27servidor_temporario.GetMessages() ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinsereservidortemporario.this.AV17pes_id;
      this.aP1[0] = pinsereservidortemporario.this.AV28st_data_admissao;
      this.aP2[0] = pinsereservidortemporario.this.AV29st_data_demissao;
      this.aP3[0] = pinsereservidortemporario.this.AV10Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new int[1] ;
      GXv_date2 = new java.util.Date[1] ;
      GXv_date3 = new java.util.Date[1] ;
      GXv_boolean4 = new boolean[1] ;
      AV9Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV27servidor_temporario = new com.projetopratico.Sdtservidor_temporario(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pinsereservidortemporario__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
   }

   private int AV17pes_id ;
   private int GXv_int1[] ;
   private java.util.Date AV28st_data_admissao ;
   private java.util.Date AV29st_data_demissao ;
   private java.util.Date GXv_date2[] ;
   private java.util.Date GXv_date3[] ;
   private boolean AV26existe_servidor_temporario ;
   private boolean GXv_boolean4[] ;
   private boolean returnInSub ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 ;
   private int[] aP0 ;
   private java.util.Date[] aP1 ;
   private java.util.Date[] aP2 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV10Messages ;
   private com.genexus.SdtMessages_Message AV9Message ;
   private com.projetopratico.Sdtservidor_temporario AV27servidor_temporario ;
   private IDataStoreProvider pr_default ;
}

final  class pinsereservidortemporario__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

