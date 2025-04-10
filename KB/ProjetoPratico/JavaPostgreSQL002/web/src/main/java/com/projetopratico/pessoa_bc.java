package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pessoa_bc extends GXWebProcedure implements IGxSilentTrn
{
   public pessoa_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public pessoa_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pessoa_bc.class ));
   }

   public pessoa_bc( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow011( ) ;
      standaloneNotModal( ) ;
      initializeNonKey011( ) ;
      standaloneModal( ) ;
      addRow011( ) ;
      Gx_mode = "INS" ;
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         if ( ! (GXutil.strcmp("", endTrnMsgTxt)==0) )
         {
            httpContext.GX_msglist.addItem(endTrnMsgTxt, endTrnMsgCod, 0, "", true);
         }
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            Z1pes_id = A1pes_id ;
            SetMode( "UPD") ;
         }
      }
      endTrnMsgTxt = "" ;
   }

   public String toString( )
   {
      return "" ;
   }

   public GXContentInfo getContentInfo( )
   {
      return (GXContentInfo)(null) ;
   }

   public boolean Reindex( )
   {
      return true ;
   }

   public void confirm_010( )
   {
      beforeValidate011( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls011( ) ;
         }
         else
         {
            checkExtendedTable011( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors011( ) ;
         }
      }
      if ( AnyError == 0 )
      {
      }
   }

   public void zm011( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         Z2pes_nome = A2pes_nome ;
         Z3pes_data_nascimento = A3pes_data_nascimento ;
         Z4pes_sexo = A4pes_sexo ;
         Z5pes_mae = A5pes_mae ;
         Z6pes_pai = A6pes_pai ;
         Z30pes_idade = A30pes_idade ;
      }
      if ( GX_JID == -2 )
      {
         Z1pes_id = A1pes_id ;
         Z2pes_nome = A2pes_nome ;
         Z3pes_data_nascimento = A3pes_data_nascimento ;
         Z4pes_sexo = A4pes_sexo ;
         Z5pes_mae = A5pes_mae ;
         Z6pes_pai = A6pes_pai ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load011( )
   {
      /* Using cursor BC00014 */
      pr_default.execute(2, new Object[] {Integer.valueOf(A1pes_id)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A2pes_nome = BC00014_A2pes_nome[0] ;
         A3pes_data_nascimento = BC00014_A3pes_data_nascimento[0] ;
         A4pes_sexo = BC00014_A4pes_sexo[0] ;
         A5pes_mae = BC00014_A5pes_mae[0] ;
         A6pes_pai = BC00014_A6pes_pai[0] ;
         zm011( -2) ;
      }
      pr_default.close(2);
      onLoadActions011( ) ;
   }

   public void onLoadActions011( )
   {
      GXt_dtime1 = GXutil.resetTime( A3pes_data_nascimento );
      A30pes_idade = (short)(GXutil.age( GXt_dtime1, GXutil.now( ))) ;
   }

   public void checkExtendedTable011( )
   {
      standaloneModal( ) ;
      GXt_dtime1 = GXutil.resetTime( A3pes_data_nascimento );
      A30pes_idade = (short)(GXutil.age( GXt_dtime1, GXutil.now( ))) ;
   }

   public void closeExtendedTableCursors011( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey011( )
   {
      /* Using cursor BC00015 */
      pr_default.execute(3, new Object[] {Integer.valueOf(A1pes_id)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1 = (short)(1) ;
      }
      else
      {
         RcdFound1 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00016 */
      pr_default.execute(4, new Object[] {Integer.valueOf(A1pes_id)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm011( 2) ;
         RcdFound1 = (short)(1) ;
         A1pes_id = BC00016_A1pes_id[0] ;
         A2pes_nome = BC00016_A2pes_nome[0] ;
         A3pes_data_nascimento = BC00016_A3pes_data_nascimento[0] ;
         A4pes_sexo = BC00016_A4pes_sexo[0] ;
         A5pes_mae = BC00016_A5pes_mae[0] ;
         A6pes_pai = BC00016_A6pes_pai[0] ;
         Z1pes_id = A1pes_id ;
         sMode1 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load011( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1 = (short)(0) ;
            initializeNonKey011( ) ;
         }
         Gx_mode = sMode1 ;
      }
      else
      {
         RcdFound1 = (short)(0) ;
         initializeNonKey011( ) ;
         sMode1 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode1 ;
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey011( ) ;
      if ( RcdFound1 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
      }
      getByPrimaryKey( ) ;
   }

   public void insert_check( )
   {
      confirm_010( ) ;
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void checkOptimisticConcurrency011( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC00017 */
         pr_default.execute(5, new Object[] {Integer.valueOf(A1pes_id)});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"pessoa"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(5) == 101) || ( GXutil.strcmp(Z2pes_nome, BC00017_A2pes_nome[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z3pes_data_nascimento), GXutil.resetTime(BC00017_A3pes_data_nascimento[0])) ) || ( GXutil.strcmp(Z4pes_sexo, BC00017_A4pes_sexo[0]) != 0 ) || ( GXutil.strcmp(Z5pes_mae, BC00017_A5pes_mae[0]) != 0 ) || ( GXutil.strcmp(Z6pes_pai, BC00017_A6pes_pai[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"pessoa"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert011( )
   {
      beforeValidate011( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable011( ) ;
      }
      if ( AnyError == 0 )
      {
         zm011( 0) ;
         checkOptimisticConcurrency011( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm011( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert011( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00018 */
                  pr_default.execute(6, new Object[] {A2pes_nome, A3pes_data_nascimento, A4pes_sexo, A5pes_mae, A6pes_pai});
                  /* Retrieving last key number assigned */
                  /* Using cursor BC00019 */
                  pr_default.execute(7);
                  A1pes_id = BC00019_A1pes_id[0] ;
                  pr_default.close(7);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("pessoa");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load011( ) ;
         }
         endLevel011( ) ;
      }
      closeExtendedTableCursors011( ) ;
   }

   public void update011( )
   {
      beforeValidate011( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable011( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency011( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm011( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate011( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000110 */
                  pr_default.execute(8, new Object[] {A2pes_nome, A3pes_data_nascimento, A4pes_sexo, A5pes_mae, A6pes_pai, Integer.valueOf(A1pes_id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("pessoa");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"pessoa"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate011( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel011( ) ;
      }
      closeExtendedTableCursors011( ) ;
   }

   public void deferredUpdate011( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate011( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency011( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls011( ) ;
         afterConfirm011( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete011( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000111 */
               pr_default.execute(9, new Object[] {Integer.valueOf(A1pes_id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("pessoa");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucdeleted") ;
                     endTrnMsgCod = "SuccessfullyDeleted" ;
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode1 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel011( ) ;
      Gx_mode = sMode1 ;
   }

   public void onDeleteControls011( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_dtime1 = GXutil.resetTime( A3pes_data_nascimento );
         A30pes_idade = (short)(GXutil.age( GXt_dtime1, GXutil.now( ))) ;
      }
      if ( AnyError == 0 )
      {
         /* Using cursor BC000112 */
         pr_default.execute(10, new Object[] {Integer.valueOf(A1pes_id)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"lotacao"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor BC000113 */
         pr_default.execute(11, new Object[] {Integer.valueOf(A1pes_id)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"foto_pessoa"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor BC000114 */
         pr_default.execute(12, new Object[] {Integer.valueOf(A1pes_id)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"servidor_temporario"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor BC000115 */
         pr_default.execute(13, new Object[] {Integer.valueOf(A1pes_id)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"servidor_efetivo"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor BC000116 */
         pr_default.execute(14, new Object[] {Integer.valueOf(A1pes_id)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"pessoa_endereco"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
      }
   }

   public void endLevel011( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete011( ) ;
      }
      if ( AnyError == 0 )
      {
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanKeyStart011( )
   {
      /* Using cursor BC000117 */
      pr_default.execute(15, new Object[] {Integer.valueOf(A1pes_id)});
      RcdFound1 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A1pes_id = BC000117_A1pes_id[0] ;
         A2pes_nome = BC000117_A2pes_nome[0] ;
         A3pes_data_nascimento = BC000117_A3pes_data_nascimento[0] ;
         A4pes_sexo = BC000117_A4pes_sexo[0] ;
         A5pes_mae = BC000117_A5pes_mae[0] ;
         A6pes_pai = BC000117_A6pes_pai[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext011( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound1 = (short)(0) ;
      scanKeyLoad011( ) ;
   }

   public void scanKeyLoad011( )
   {
      sMode1 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A1pes_id = BC000117_A1pes_id[0] ;
         A2pes_nome = BC000117_A2pes_nome[0] ;
         A3pes_data_nascimento = BC000117_A3pes_data_nascimento[0] ;
         A4pes_sexo = BC000117_A4pes_sexo[0] ;
         A5pes_mae = BC000117_A5pes_mae[0] ;
         A6pes_pai = BC000117_A6pes_pai[0] ;
      }
      Gx_mode = sMode1 ;
   }

   public void scanKeyEnd011( )
   {
      pr_default.close(15);
   }

   public void afterConfirm011( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert011( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate011( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete011( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete011( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate011( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes011( )
   {
   }

   public void send_integrity_lvl_hashes011( )
   {
   }

   public void addRow011( )
   {
      VarsToRow1( bcpessoa) ;
   }

   public void readRow011( )
   {
      RowToVars1( bcpessoa, 1) ;
   }

   public void initializeNonKey011( )
   {
      A30pes_idade = (short)(0) ;
      A2pes_nome = "" ;
      A3pes_data_nascimento = GXutil.nullDate() ;
      A4pes_sexo = "" ;
      A5pes_mae = "" ;
      A6pes_pai = "" ;
      Z2pes_nome = "" ;
      Z3pes_data_nascimento = GXutil.nullDate() ;
      Z4pes_sexo = "" ;
      Z5pes_mae = "" ;
      Z6pes_pai = "" ;
   }

   public void initAll011( )
   {
      A1pes_id = 0 ;
      initializeNonKey011( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public boolean isIns( )
   {
      return ((GXutil.strcmp(Gx_mode, "INS")==0) ? true : false) ;
   }

   public boolean isDlt( )
   {
      return ((GXutil.strcmp(Gx_mode, "DLT")==0) ? true : false) ;
   }

   public boolean isUpd( )
   {
      return ((GXutil.strcmp(Gx_mode, "UPD")==0) ? true : false) ;
   }

   public boolean isDsp( )
   {
      return ((GXutil.strcmp(Gx_mode, "DSP")==0) ? true : false) ;
   }

   public void VarsToRow1( com.projetopratico.Sdtpessoa obj1 )
   {
      obj1.setgxTv_Sdtpessoa_Mode( Gx_mode );
      obj1.setgxTv_Sdtpessoa_Pes_idade( A30pes_idade );
      obj1.setgxTv_Sdtpessoa_Pes_nome( A2pes_nome );
      obj1.setgxTv_Sdtpessoa_Pes_data_nascimento( A3pes_data_nascimento );
      obj1.setgxTv_Sdtpessoa_Pes_sexo( A4pes_sexo );
      obj1.setgxTv_Sdtpessoa_Pes_mae( A5pes_mae );
      obj1.setgxTv_Sdtpessoa_Pes_pai( A6pes_pai );
      obj1.setgxTv_Sdtpessoa_Pes_id( A1pes_id );
      obj1.setgxTv_Sdtpessoa_Pes_id_Z( Z1pes_id );
      obj1.setgxTv_Sdtpessoa_Pes_nome_Z( Z2pes_nome );
      obj1.setgxTv_Sdtpessoa_Pes_data_nascimento_Z( Z3pes_data_nascimento );
      obj1.setgxTv_Sdtpessoa_Pes_sexo_Z( Z4pes_sexo );
      obj1.setgxTv_Sdtpessoa_Pes_mae_Z( Z5pes_mae );
      obj1.setgxTv_Sdtpessoa_Pes_pai_Z( Z6pes_pai );
      obj1.setgxTv_Sdtpessoa_Pes_idade_Z( Z30pes_idade );
      obj1.setgxTv_Sdtpessoa_Mode( Gx_mode );
   }

   public void KeyVarsToRow1( com.projetopratico.Sdtpessoa obj1 )
   {
      obj1.setgxTv_Sdtpessoa_Pes_id( A1pes_id );
   }

   public void RowToVars1( com.projetopratico.Sdtpessoa obj1 ,
                           int forceLoad )
   {
      Gx_mode = obj1.getgxTv_Sdtpessoa_Mode() ;
      A30pes_idade = obj1.getgxTv_Sdtpessoa_Pes_idade() ;
      A2pes_nome = obj1.getgxTv_Sdtpessoa_Pes_nome() ;
      A3pes_data_nascimento = obj1.getgxTv_Sdtpessoa_Pes_data_nascimento() ;
      A4pes_sexo = obj1.getgxTv_Sdtpessoa_Pes_sexo() ;
      A5pes_mae = obj1.getgxTv_Sdtpessoa_Pes_mae() ;
      A6pes_pai = obj1.getgxTv_Sdtpessoa_Pes_pai() ;
      A1pes_id = obj1.getgxTv_Sdtpessoa_Pes_id() ;
      Z1pes_id = obj1.getgxTv_Sdtpessoa_Pes_id_Z() ;
      Z2pes_nome = obj1.getgxTv_Sdtpessoa_Pes_nome_Z() ;
      Z3pes_data_nascimento = obj1.getgxTv_Sdtpessoa_Pes_data_nascimento_Z() ;
      Z4pes_sexo = obj1.getgxTv_Sdtpessoa_Pes_sexo_Z() ;
      Z5pes_mae = obj1.getgxTv_Sdtpessoa_Pes_mae_Z() ;
      Z6pes_pai = obj1.getgxTv_Sdtpessoa_Pes_pai_Z() ;
      Z30pes_idade = obj1.getgxTv_Sdtpessoa_Pes_idade_Z() ;
      Gx_mode = obj1.getgxTv_Sdtpessoa_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A1pes_id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey011( ) ;
      scanKeyStart011( ) ;
      if ( RcdFound1 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z1pes_id = A1pes_id ;
      }
      zm011( -2) ;
      onLoadActions011( ) ;
      addRow011( ) ;
      scanKeyEnd011( ) ;
      if ( RcdFound1 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Load( )
   {
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      RowToVars1( bcpessoa, 0) ;
      scanKeyStart011( ) ;
      if ( RcdFound1 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z1pes_id = A1pes_id ;
      }
      zm011( -2) ;
      onLoadActions011( ) ;
      addRow011( ) ;
      scanKeyEnd011( ) ;
      if ( RcdFound1 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      getKey011( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert011( ) ;
      }
      else
      {
         if ( RcdFound1 == 1 )
         {
            if ( A1pes_id != Z1pes_id )
            {
               A1pes_id = Z1pes_id ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
               AnyError = (short)(1) ;
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               /* Update record */
               update011( ) ;
            }
         }
         else
         {
            if ( isDlt( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
               AnyError = (short)(1) ;
            }
            else
            {
               if ( A1pes_id != Z1pes_id )
               {
                  if ( isUpd( ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  else
                  {
                     Gx_mode = "INS" ;
                     /* Insert record */
                     insert011( ) ;
                  }
               }
               else
               {
                  if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
                  else
                  {
                     Gx_mode = "INS" ;
                     /* Insert record */
                     insert011( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
   }

   public void Save( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars1( bcpessoa, 1) ;
      saveImpl( ) ;
      VarsToRow1( bcpessoa) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars1( bcpessoa, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert011( ) ;
      afterTrn( ) ;
      VarsToRow1( bcpessoa) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void updateImpl( )
   {
      if ( isUpd( ) )
      {
         saveImpl( ) ;
         VarsToRow1( bcpessoa) ;
      }
      else
      {
         com.projetopratico.Sdtpessoa auxBC = new com.projetopratico.Sdtpessoa( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A1pes_id);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcpessoa);
            auxBC.Save();
            bcpessoa.copy(auxBC);
         }
         LclMsgLst = auxTrn.GetMessages() ;
         AnyError = (short)(auxTrn.Errors()) ;
         httpContext.GX_msglist = LclMsgLst ;
         if ( auxTrn.Errors() == 0 )
         {
            Gx_mode = auxTrn.GetMode() ;
            afterTrn( ) ;
         }
      }
   }

   public boolean Update( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars1( bcpessoa, 1) ;
      updateImpl( ) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public boolean InsertOrUpdate( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars1( bcpessoa, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert011( ) ;
      if ( AnyError == 1 )
      {
         if ( GXutil.strcmp(httpContext.GX_msglist.getItemValue((short)(1)), "DuplicatePrimaryKey") == 0 )
         {
            AnyError = (short)(0) ;
            httpContext.GX_msglist.removeAllItems();
            updateImpl( ) ;
         }
         else
         {
            VarsToRow1( bcpessoa) ;
         }
      }
      else
      {
         afterTrn( ) ;
         VarsToRow1( bcpessoa) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars1( bcpessoa, 0) ;
      getKey011( ) ;
      if ( RcdFound1 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( A1pes_id != Z1pes_id )
         {
            A1pes_id = Z1pes_id ;
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( isDlt( ) )
         {
            delete_check( ) ;
         }
         else
         {
            Gx_mode = "UPD" ;
            update_check( ) ;
         }
      }
      else
      {
         if ( A1pes_id != Z1pes_id )
         {
            Gx_mode = "INS" ;
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
               AnyError = (short)(1) ;
            }
            else
            {
               Gx_mode = "INS" ;
               insert_check( ) ;
            }
         }
      }
      Application.rollbackDataStores(context, remoteHandle, pr_default, "pessoa_bc");
      VarsToRow1( bcpessoa) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public int Errors( )
   {
      if ( AnyError == 0 )
      {
         return 0 ;
      }
      return 1 ;
   }

   public com.genexus.internet.MsgList GetMessages( )
   {
      return LclMsgLst ;
   }

   public String GetMode( )
   {
      Gx_mode = bcpessoa.getgxTv_Sdtpessoa_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcpessoa.setgxTv_Sdtpessoa_Mode( Gx_mode );
   }

   public void SetSDT( com.projetopratico.Sdtpessoa sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcpessoa )
      {
         bcpessoa = sdt ;
         if ( GXutil.strcmp(bcpessoa.getgxTv_Sdtpessoa_Mode(), "") == 0 )
         {
            bcpessoa.setgxTv_Sdtpessoa_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow1( bcpessoa) ;
         }
         else
         {
            RowToVars1( bcpessoa, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcpessoa.getgxTv_Sdtpessoa_Mode(), "") == 0 )
         {
            bcpessoa.setgxTv_Sdtpessoa_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars1( bcpessoa, 1) ;
   }

   public void ForceCommitOnExit( )
   {
   }

   public Sdtpessoa getpessoa_BC( )
   {
      return bcpessoa ;
   }


   public void webExecute( )
   {
   }

   public boolean isMasterPage( )
   {
      return false;
   }

   protected void createObjects( )
   {
   }

   protected void Process( )
   {
   }

   protected void cleanup( )
   {
      super.cleanup();
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gx_mode = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z2pes_nome = "" ;
      A2pes_nome = "" ;
      Z3pes_data_nascimento = GXutil.nullDate() ;
      A3pes_data_nascimento = GXutil.nullDate() ;
      Z4pes_sexo = "" ;
      A4pes_sexo = "" ;
      Z5pes_mae = "" ;
      A5pes_mae = "" ;
      Z6pes_pai = "" ;
      A6pes_pai = "" ;
      BC00014_A1pes_id = new int[1] ;
      BC00014_A2pes_nome = new String[] {""} ;
      BC00014_A3pes_data_nascimento = new java.util.Date[] {GXutil.nullDate()} ;
      BC00014_A4pes_sexo = new String[] {""} ;
      BC00014_A5pes_mae = new String[] {""} ;
      BC00014_A6pes_pai = new String[] {""} ;
      BC00015_A1pes_id = new int[1] ;
      BC00016_A1pes_id = new int[1] ;
      BC00016_A2pes_nome = new String[] {""} ;
      BC00016_A3pes_data_nascimento = new java.util.Date[] {GXutil.nullDate()} ;
      BC00016_A4pes_sexo = new String[] {""} ;
      BC00016_A5pes_mae = new String[] {""} ;
      BC00016_A6pes_pai = new String[] {""} ;
      sMode1 = "" ;
      BC00017_A1pes_id = new int[1] ;
      BC00017_A2pes_nome = new String[] {""} ;
      BC00017_A3pes_data_nascimento = new java.util.Date[] {GXutil.nullDate()} ;
      BC00017_A4pes_sexo = new String[] {""} ;
      BC00017_A5pes_mae = new String[] {""} ;
      BC00017_A6pes_pai = new String[] {""} ;
      BC00019_A1pes_id = new int[1] ;
      GXt_dtime1 = GXutil.resetTime( GXutil.nullDate() );
      BC000112_A25lot_id = new int[1] ;
      BC000113_A10fp_id = new int[1] ;
      BC000114_A1pes_id = new int[1] ;
      BC000114_A22st_data_admissao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000114_A23st_data_demissao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000115_A1pes_id = new int[1] ;
      BC000115_A24se_matricula = new String[] {""} ;
      BC000116_A1pes_id = new int[1] ;
      BC000116_A17end_id = new int[1] ;
      BC000117_A1pes_id = new int[1] ;
      BC000117_A2pes_nome = new String[] {""} ;
      BC000117_A3pes_data_nascimento = new java.util.Date[] {GXutil.nullDate()} ;
      BC000117_A4pes_sexo = new String[] {""} ;
      BC000117_A5pes_mae = new String[] {""} ;
      BC000117_A6pes_pai = new String[] {""} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pessoa_bc__default(),
         new Object[] {
             new Object[] {
            BC00012_A1pes_id, BC00012_A2pes_nome, BC00012_A3pes_data_nascimento, BC00012_A4pes_sexo, BC00012_A5pes_mae, BC00012_A6pes_pai
            }
            , new Object[] {
            BC00013_A1pes_id, BC00013_A2pes_nome, BC00013_A3pes_data_nascimento, BC00013_A4pes_sexo, BC00013_A5pes_mae, BC00013_A6pes_pai
            }
            , new Object[] {
            BC00014_A1pes_id, BC00014_A2pes_nome, BC00014_A3pes_data_nascimento, BC00014_A4pes_sexo, BC00014_A5pes_mae, BC00014_A6pes_pai
            }
            , new Object[] {
            BC00015_A1pes_id
            }
            , new Object[] {
            BC00016_A1pes_id, BC00016_A2pes_nome, BC00016_A3pes_data_nascimento, BC00016_A4pes_sexo, BC00016_A5pes_mae, BC00016_A6pes_pai
            }
            , new Object[] {
            BC00017_A1pes_id, BC00017_A2pes_nome, BC00017_A3pes_data_nascimento, BC00017_A4pes_sexo, BC00017_A5pes_mae, BC00017_A6pes_pai
            }
            , new Object[] {
            }
            , new Object[] {
            BC00019_A1pes_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000112_A25lot_id
            }
            , new Object[] {
            BC000113_A10fp_id
            }
            , new Object[] {
            BC000114_A1pes_id, BC000114_A22st_data_admissao, BC000114_A23st_data_demissao
            }
            , new Object[] {
            BC000115_A1pes_id, BC000115_A24se_matricula
            }
            , new Object[] {
            BC000116_A1pes_id, BC000116_A17end_id
            }
            , new Object[] {
            BC000117_A1pes_id, BC000117_A2pes_nome, BC000117_A3pes_data_nascimento, BC000117_A4pes_sexo, BC000117_A5pes_mae, BC000117_A6pes_pai
            }
         }
      );
      /* Execute Start event if defined. */
      standaloneNotModal( ) ;
   }

   private short AnyError ;
   private short Z30pes_idade ;
   private short A30pes_idade ;
   private short RcdFound1 ;
   private int trnEnded ;
   private int Z1pes_id ;
   private int A1pes_id ;
   private int GX_JID ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1 ;
   private java.util.Date GXt_dtime1 ;
   private java.util.Date Z3pes_data_nascimento ;
   private java.util.Date A3pes_data_nascimento ;
   private String Z2pes_nome ;
   private String A2pes_nome ;
   private String Z4pes_sexo ;
   private String A4pes_sexo ;
   private String Z5pes_mae ;
   private String A5pes_mae ;
   private String Z6pes_pai ;
   private String A6pes_pai ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private int[] BC00014_A1pes_id ;
   private String[] BC00014_A2pes_nome ;
   private java.util.Date[] BC00014_A3pes_data_nascimento ;
   private String[] BC00014_A4pes_sexo ;
   private String[] BC00014_A5pes_mae ;
   private String[] BC00014_A6pes_pai ;
   private int[] BC00015_A1pes_id ;
   private int[] BC00016_A1pes_id ;
   private String[] BC00016_A2pes_nome ;
   private java.util.Date[] BC00016_A3pes_data_nascimento ;
   private String[] BC00016_A4pes_sexo ;
   private String[] BC00016_A5pes_mae ;
   private String[] BC00016_A6pes_pai ;
   private int[] BC00017_A1pes_id ;
   private String[] BC00017_A2pes_nome ;
   private java.util.Date[] BC00017_A3pes_data_nascimento ;
   private String[] BC00017_A4pes_sexo ;
   private String[] BC00017_A5pes_mae ;
   private String[] BC00017_A6pes_pai ;
   private int[] BC00019_A1pes_id ;
   private int[] BC000112_A25lot_id ;
   private int[] BC000113_A10fp_id ;
   private int[] BC000114_A1pes_id ;
   private java.util.Date[] BC000114_A22st_data_admissao ;
   private java.util.Date[] BC000114_A23st_data_demissao ;
   private int[] BC000115_A1pes_id ;
   private String[] BC000115_A24se_matricula ;
   private int[] BC000116_A1pes_id ;
   private int[] BC000116_A17end_id ;
   private int[] BC000117_A1pes_id ;
   private String[] BC000117_A2pes_nome ;
   private java.util.Date[] BC000117_A3pes_data_nascimento ;
   private String[] BC000117_A4pes_sexo ;
   private String[] BC000117_A5pes_mae ;
   private String[] BC000117_A6pes_pai ;
   private com.projetopratico.Sdtpessoa bcpessoa ;
   private int[] BC00012_A1pes_id ;
   private String[] BC00012_A2pes_nome ;
   private java.util.Date[] BC00012_A3pes_data_nascimento ;
   private String[] BC00012_A4pes_sexo ;
   private String[] BC00012_A5pes_mae ;
   private String[] BC00012_A6pes_pai ;
   private int[] BC00013_A1pes_id ;
   private String[] BC00013_A2pes_nome ;
   private java.util.Date[] BC00013_A3pes_data_nascimento ;
   private String[] BC00013_A4pes_sexo ;
   private String[] BC00013_A5pes_mae ;
   private String[] BC00013_A6pes_pai ;
}

final  class pessoa_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00012", "SELECT pes_id, pes_nome, pes_data_nascimento, pes_sexo, pes_mae, pes_pai FROM pessoa WHERE pes_id = ?  FOR UPDATE OF pessoa",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00013", "SELECT pes_id, pes_nome, pes_data_nascimento, pes_sexo, pes_mae, pes_pai FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00014", "SELECT TM1.pes_id, TM1.pes_nome, TM1.pes_data_nascimento, TM1.pes_sexo, TM1.pes_mae, TM1.pes_pai FROM pessoa TM1 WHERE TM1.pes_id = ? ORDER BY TM1.pes_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00015", "SELECT pes_id FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00016", "SELECT pes_id, pes_nome, pes_data_nascimento, pes_sexo, pes_mae, pes_pai FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00017", "SELECT pes_id, pes_nome, pes_data_nascimento, pes_sexo, pes_mae, pes_pai FROM pessoa WHERE pes_id = ?  FOR UPDATE OF pessoa",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC00018", "SAVEPOINT gxupdate;INSERT INTO pessoa(pes_nome, pes_data_nascimento, pes_sexo, pes_mae, pes_pai) VALUES(?, ?, ?, ?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC00019", "SELECT currval('pes_id') ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000110", "SAVEPOINT gxupdate;UPDATE pessoa SET pes_nome=?, pes_data_nascimento=?, pes_sexo=?, pes_mae=?, pes_pai=?  WHERE pes_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("BC000111", "SAVEPOINT gxupdate;DELETE FROM pessoa  WHERE pes_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC000112", "SELECT lot_id FROM lotacao WHERE pes_id = ?  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000113", "SELECT fp_id FROM foto_pessoa WHERE pes_id = ?  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000114", "SELECT pes_id, st_data_admissao, st_data_demissao FROM servidor_temporario WHERE pes_id = ?  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000115", "SELECT pes_id, se_matricula FROM servidor_efetivo WHERE pes_id = ?  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000116", "SELECT pes_id, end_id FROM pessoa_endereco WHERE pes_id = ?  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000117", "SELECT TM1.pes_id, TM1.pes_nome, TM1.pes_data_nascimento, TM1.pes_sexo, TM1.pes_mae, TM1.pes_pai FROM pessoa TM1 WHERE TM1.pes_id = ? ORDER BY TM1.pes_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 10 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 12 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 13 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               return;
            case 14 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 15 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 4 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 5 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 200, false);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setVarchar(3, (String)parms[2], 9, false);
               stmt.setVarchar(4, (String)parms[3], 200, false);
               stmt.setVarchar(5, (String)parms[4], 200, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 200, false);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setVarchar(3, (String)parms[2], 9, false);
               stmt.setVarchar(4, (String)parms[3], 200, false);
               stmt.setVarchar(5, (String)parms[4], 200, false);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 13 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 14 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 15 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

