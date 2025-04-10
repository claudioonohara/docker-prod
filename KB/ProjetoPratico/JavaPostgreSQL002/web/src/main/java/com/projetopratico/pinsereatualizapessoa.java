package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinsereatualizapessoa extends GXProcedure
{
   public pinsereatualizapessoa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinsereatualizapessoa.class ), "" );
   }

   public pinsereatualizapessoa( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int[] aP0 ,
                                                                        String[] aP1 ,
                                                                        java.util.Date[] aP2 ,
                                                                        String[] aP3 ,
                                                                        String[] aP4 ,
                                                                        String[] aP5 )
   {
      pinsereatualizapessoa.this.aP6 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( int[] aP0 ,
                        String[] aP1 ,
                        java.util.Date[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( int[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP6 )
   {
      pinsereatualizapessoa.this.AV16pes_id = aP0[0];
      this.aP0 = aP0;
      pinsereatualizapessoa.this.AV29pes_nome = aP1[0];
      this.aP1 = aP1;
      pinsereatualizapessoa.this.AV25pes_data_nascimento = aP2[0];
      this.aP2 = aP2;
      pinsereatualizapessoa.this.AV31pes_sexo = aP3[0];
      this.aP3 = aP3;
      pinsereatualizapessoa.this.AV28pes_mae = aP4[0];
      this.aP4 = aP4;
      pinsereatualizapessoa.this.AV30pes_pai = aP5[0];
      this.aP5 = aP5;
      pinsereatualizapessoa.this.AV11Messages = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV11Messages.clear();
      if ( (0==AV16pes_id) )
      {
         AV23pessoa = (com.projetopratico.Sdtpessoa)new com.projetopratico.Sdtpessoa( remoteHandle, context);
      }
      else
      {
         GXv_int1[0] = AV16pes_id ;
         GXv_int2[0] = AV24encontrado_pes_id ;
         GXv_char3[0] = AV37pes_nome1 ;
         GXv_date4[0] = AV33pes_data_nascimento1 ;
         GXv_char5[0] = AV39pes_sexo1 ;
         GXv_char6[0] = AV36pes_mae1 ;
         GXv_char7[0] = AV38pes_pai1 ;
         GXv_int8[0] = AV35pes_idade1 ;
         new com.projetopratico.pbuscapessoa(remoteHandle, context).execute( GXv_int1, GXv_int2, GXv_char3, GXv_date4, GXv_char5, GXv_char6, GXv_char7, GXv_int8) ;
         pinsereatualizapessoa.this.AV16pes_id = GXv_int1[0] ;
         pinsereatualizapessoa.this.AV24encontrado_pes_id = GXv_int2[0] ;
         pinsereatualizapessoa.this.AV37pes_nome1 = GXv_char3[0] ;
         pinsereatualizapessoa.this.AV33pes_data_nascimento1 = GXv_date4[0] ;
         pinsereatualizapessoa.this.AV39pes_sexo1 = GXv_char5[0] ;
         pinsereatualizapessoa.this.AV36pes_mae1 = GXv_char6[0] ;
         pinsereatualizapessoa.this.AV38pes_pai1 = GXv_char7[0] ;
         pinsereatualizapessoa.this.AV35pes_idade1 = GXv_int8[0] ;
         if ( (0==AV24encontrado_pes_id) )
         {
            AV10Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
            AV10Message.setgxTv_SdtMessages_Message_Description( "O id "+GXutil.trim( GXutil.str( AV16pes_id, 8, 0))+" da pessoa nao foi encontrado" );
            AV11Messages.add(AV10Message, 0);
            Application.rollbackDataStores(context, remoteHandle, pr_default, "pinsereatualizapessoa");
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         else
         {
            AV23pessoa.Load(AV16pes_id);
         }
      }
      AV23pessoa.setgxTv_Sdtpessoa_Pes_nome( AV29pes_nome );
      AV23pessoa.setgxTv_Sdtpessoa_Pes_data_nascimento( AV25pes_data_nascimento );
      AV23pessoa.setgxTv_Sdtpessoa_Pes_sexo( AV31pes_sexo );
      AV23pessoa.setgxTv_Sdtpessoa_Pes_mae( AV28pes_mae );
      AV23pessoa.setgxTv_Sdtpessoa_Pes_pai( AV30pes_pai );
      AV23pessoa.Save();
      if ( AV23pessoa.Fail() )
      {
         AV11Messages = AV23pessoa.GetMessages() ;
         Application.rollbackDataStores(context, remoteHandle, pr_default, "pinsereatualizapessoa");
      }
      AV16pes_id = AV23pessoa.getgxTv_Sdtpessoa_Pes_id() ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinsereatualizapessoa.this.AV16pes_id;
      this.aP1[0] = pinsereatualizapessoa.this.AV29pes_nome;
      this.aP2[0] = pinsereatualizapessoa.this.AV25pes_data_nascimento;
      this.aP3[0] = pinsereatualizapessoa.this.AV31pes_sexo;
      this.aP4[0] = pinsereatualizapessoa.this.AV28pes_mae;
      this.aP5[0] = pinsereatualizapessoa.this.AV30pes_pai;
      this.aP6[0] = pinsereatualizapessoa.this.AV11Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV23pessoa = new com.projetopratico.Sdtpessoa(remoteHandle);
      GXv_int1 = new int[1] ;
      GXv_int2 = new int[1] ;
      AV37pes_nome1 = "" ;
      GXv_char3 = new String[1] ;
      AV33pes_data_nascimento1 = GXutil.nullDate() ;
      GXv_date4 = new java.util.Date[1] ;
      AV39pes_sexo1 = "" ;
      GXv_char5 = new String[1] ;
      AV36pes_mae1 = "" ;
      GXv_char6 = new String[1] ;
      AV38pes_pai1 = "" ;
      GXv_char7 = new String[1] ;
      GXv_int8 = new short[1] ;
      AV10Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pinsereatualizapessoa__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
   }

   private short AV35pes_idade1 ;
   private short GXv_int8[] ;
   private int AV16pes_id ;
   private int GXv_int1[] ;
   private int AV24encontrado_pes_id ;
   private int GXv_int2[] ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String GXv_char7[] ;
   private java.util.Date AV25pes_data_nascimento ;
   private java.util.Date AV33pes_data_nascimento1 ;
   private java.util.Date GXv_date4[] ;
   private boolean returnInSub ;
   private String AV29pes_nome ;
   private String AV31pes_sexo ;
   private String AV28pes_mae ;
   private String AV30pes_pai ;
   private String AV37pes_nome1 ;
   private String AV39pes_sexo1 ;
   private String AV36pes_mae1 ;
   private String AV38pes_pai1 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP6 ;
   private int[] aP0 ;
   private String[] aP1 ;
   private java.util.Date[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV11Messages ;
   private com.projetopratico.Sdtpessoa AV23pessoa ;
   private com.genexus.SdtMessages_Message AV10Message ;
   private IDataStoreProvider pr_default ;
}

final  class pinsereatualizapessoa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

