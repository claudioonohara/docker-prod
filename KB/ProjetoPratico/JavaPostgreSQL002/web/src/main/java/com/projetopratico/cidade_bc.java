package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class cidade_bc extends GXWebProcedure implements IGxSilentTrn
{
   public cidade_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public cidade_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cidade_bc.class ));
   }

   public cidade_bc( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow044( ) ;
      standaloneNotModal( ) ;
      initializeNonKey044( ) ;
      standaloneModal( ) ;
      addRow044( ) ;
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
            Z14cid_id = A14cid_id ;
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

   public void confirm_040( )
   {
      beforeValidate044( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls044( ) ;
         }
         else
         {
            checkExtendedTable044( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors044( ) ;
         }
      }
      if ( AnyError == 0 )
      {
      }
   }

   public void zm044( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         Z15cid_nome = A15cid_nome ;
         Z16cid_uf = A16cid_uf ;
      }
      if ( GX_JID == -4 )
      {
         Z14cid_id = A14cid_id ;
         Z15cid_nome = A15cid_nome ;
         Z16cid_uf = A16cid_uf ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load044( )
   {
      /* Using cursor BC00044 */
      pr_default.execute(2, new Object[] {Integer.valueOf(A14cid_id)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound4 = (short)(1) ;
         A15cid_nome = BC00044_A15cid_nome[0] ;
         A16cid_uf = BC00044_A16cid_uf[0] ;
         zm044( -4) ;
      }
      pr_default.close(2);
      onLoadActions044( ) ;
   }

   public void onLoadActions044( )
   {
   }

   public void checkExtendedTable044( )
   {
      standaloneModal( ) ;
      if ( ( GXutil.len( A16cid_uf) > 2 ) || ( GXutil.len( A16cid_uf) <= 1 ) && ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) || ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem("UF deve ter 2 caracteres", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors044( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey044( )
   {
      /* Using cursor BC00045 */
      pr_default.execute(3, new Object[] {Integer.valueOf(A14cid_id)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound4 = (short)(1) ;
      }
      else
      {
         RcdFound4 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00046 */
      pr_default.execute(4, new Object[] {Integer.valueOf(A14cid_id)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm044( 4) ;
         RcdFound4 = (short)(1) ;
         A14cid_id = BC00046_A14cid_id[0] ;
         A15cid_nome = BC00046_A15cid_nome[0] ;
         A16cid_uf = BC00046_A16cid_uf[0] ;
         Z14cid_id = A14cid_id ;
         sMode4 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load044( ) ;
         if ( AnyError == 1 )
         {
            RcdFound4 = (short)(0) ;
            initializeNonKey044( ) ;
         }
         Gx_mode = sMode4 ;
      }
      else
      {
         RcdFound4 = (short)(0) ;
         initializeNonKey044( ) ;
         sMode4 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode4 ;
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey044( ) ;
      if ( RcdFound4 == 0 )
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
      confirm_040( ) ;
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void checkOptimisticConcurrency044( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC00047 */
         pr_default.execute(5, new Object[] {Integer.valueOf(A14cid_id)});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"cidade"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(5) == 101) || ( GXutil.strcmp(Z15cid_nome, BC00047_A15cid_nome[0]) != 0 ) || ( GXutil.strcmp(Z16cid_uf, BC00047_A16cid_uf[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"cidade"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert044( )
   {
      beforeValidate044( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable044( ) ;
      }
      if ( AnyError == 0 )
      {
         zm044( 0) ;
         checkOptimisticConcurrency044( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm044( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert044( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00048 */
                  pr_default.execute(6, new Object[] {A15cid_nome, A16cid_uf});
                  /* Retrieving last key number assigned */
                  /* Using cursor BC00049 */
                  pr_default.execute(7);
                  A14cid_id = BC00049_A14cid_id[0] ;
                  pr_default.close(7);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("cidade");
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
            load044( ) ;
         }
         endLevel044( ) ;
      }
      closeExtendedTableCursors044( ) ;
   }

   public void update044( )
   {
      beforeValidate044( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable044( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency044( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm044( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate044( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000410 */
                  pr_default.execute(8, new Object[] {A15cid_nome, A16cid_uf, Integer.valueOf(A14cid_id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("cidade");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"cidade"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate044( ) ;
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
         endLevel044( ) ;
      }
      closeExtendedTableCursors044( ) ;
   }

   public void deferredUpdate044( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate044( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency044( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls044( ) ;
         afterConfirm044( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete044( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000411 */
               pr_default.execute(9, new Object[] {Integer.valueOf(A14cid_id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("cidade");
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
      sMode4 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel044( ) ;
      Gx_mode = sMode4 ;
   }

   public void onDeleteControls044( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor BC000412 */
         pr_default.execute(10, new Object[] {Integer.valueOf(A14cid_id)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"endereco"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
      }
   }

   public void endLevel044( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete044( ) ;
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

   public void scanKeyStart044( )
   {
      /* Using cursor BC000413 */
      pr_default.execute(11, new Object[] {Integer.valueOf(A14cid_id)});
      RcdFound4 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound4 = (short)(1) ;
         A14cid_id = BC000413_A14cid_id[0] ;
         A15cid_nome = BC000413_A15cid_nome[0] ;
         A16cid_uf = BC000413_A16cid_uf[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext044( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound4 = (short)(0) ;
      scanKeyLoad044( ) ;
   }

   public void scanKeyLoad044( )
   {
      sMode4 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound4 = (short)(1) ;
         A14cid_id = BC000413_A14cid_id[0] ;
         A15cid_nome = BC000413_A15cid_nome[0] ;
         A16cid_uf = BC000413_A16cid_uf[0] ;
      }
      Gx_mode = sMode4 ;
   }

   public void scanKeyEnd044( )
   {
      pr_default.close(11);
   }

   public void afterConfirm044( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert044( )
   {
      /* Before Insert Rules */
      if ( (GXutil.strcmp("", A15cid_nome)==0) )
      {
         httpContext.GX_msglist.addItem("Nome da cidade deve ser informada.", 1, "");
         AnyError = (short)(1) ;
      }
      if ( (GXutil.strcmp("", A16cid_uf)==0) )
      {
         httpContext.GX_msglist.addItem("UF da cidade deve ser informada.", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void beforeUpdate044( )
   {
      /* Before Update Rules */
      if ( (GXutil.strcmp("", A15cid_nome)==0) )
      {
         httpContext.GX_msglist.addItem("Nome da cidade deve ser informada.", 1, "");
         AnyError = (short)(1) ;
      }
      if ( (GXutil.strcmp("", A16cid_uf)==0) )
      {
         httpContext.GX_msglist.addItem("UF da cidade deve ser informada.", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void beforeDelete044( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete044( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate044( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes044( )
   {
   }

   public void send_integrity_lvl_hashes044( )
   {
   }

   public void addRow044( )
   {
      VarsToRow4( bccidade) ;
   }

   public void readRow044( )
   {
      RowToVars4( bccidade, 1) ;
   }

   public void initializeNonKey044( )
   {
      A15cid_nome = "" ;
      A16cid_uf = "" ;
      Z15cid_nome = "" ;
      Z16cid_uf = "" ;
   }

   public void initAll044( )
   {
      A14cid_id = 0 ;
      initializeNonKey044( ) ;
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

   public void VarsToRow4( com.projetopratico.Sdtcidade obj4 )
   {
      obj4.setgxTv_Sdtcidade_Mode( Gx_mode );
      obj4.setgxTv_Sdtcidade_Cid_nome( A15cid_nome );
      obj4.setgxTv_Sdtcidade_Cid_uf( A16cid_uf );
      obj4.setgxTv_Sdtcidade_Cid_id( A14cid_id );
      obj4.setgxTv_Sdtcidade_Cid_id_Z( Z14cid_id );
      obj4.setgxTv_Sdtcidade_Cid_nome_Z( Z15cid_nome );
      obj4.setgxTv_Sdtcidade_Cid_uf_Z( Z16cid_uf );
      obj4.setgxTv_Sdtcidade_Mode( Gx_mode );
   }

   public void KeyVarsToRow4( com.projetopratico.Sdtcidade obj4 )
   {
      obj4.setgxTv_Sdtcidade_Cid_id( A14cid_id );
   }

   public void RowToVars4( com.projetopratico.Sdtcidade obj4 ,
                           int forceLoad )
   {
      Gx_mode = obj4.getgxTv_Sdtcidade_Mode() ;
      A15cid_nome = obj4.getgxTv_Sdtcidade_Cid_nome() ;
      A16cid_uf = obj4.getgxTv_Sdtcidade_Cid_uf() ;
      A14cid_id = obj4.getgxTv_Sdtcidade_Cid_id() ;
      Z14cid_id = obj4.getgxTv_Sdtcidade_Cid_id_Z() ;
      Z15cid_nome = obj4.getgxTv_Sdtcidade_Cid_nome_Z() ;
      Z16cid_uf = obj4.getgxTv_Sdtcidade_Cid_uf_Z() ;
      Gx_mode = obj4.getgxTv_Sdtcidade_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A14cid_id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey044( ) ;
      scanKeyStart044( ) ;
      if ( RcdFound4 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z14cid_id = A14cid_id ;
      }
      zm044( -4) ;
      onLoadActions044( ) ;
      addRow044( ) ;
      scanKeyEnd044( ) ;
      if ( RcdFound4 == 0 )
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
      RowToVars4( bccidade, 0) ;
      scanKeyStart044( ) ;
      if ( RcdFound4 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z14cid_id = A14cid_id ;
      }
      zm044( -4) ;
      onLoadActions044( ) ;
      addRow044( ) ;
      scanKeyEnd044( ) ;
      if ( RcdFound4 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      getKey044( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert044( ) ;
      }
      else
      {
         if ( RcdFound4 == 1 )
         {
            if ( A14cid_id != Z14cid_id )
            {
               A14cid_id = Z14cid_id ;
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
               update044( ) ;
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
               if ( A14cid_id != Z14cid_id )
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
                     insert044( ) ;
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
                     insert044( ) ;
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
      RowToVars4( bccidade, 1) ;
      saveImpl( ) ;
      VarsToRow4( bccidade) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars4( bccidade, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert044( ) ;
      afterTrn( ) ;
      VarsToRow4( bccidade) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void updateImpl( )
   {
      if ( isUpd( ) )
      {
         saveImpl( ) ;
         VarsToRow4( bccidade) ;
      }
      else
      {
         com.projetopratico.Sdtcidade auxBC = new com.projetopratico.Sdtcidade( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A14cid_id);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bccidade);
            auxBC.Save();
            bccidade.copy(auxBC);
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
      RowToVars4( bccidade, 1) ;
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
      RowToVars4( bccidade, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert044( ) ;
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
            VarsToRow4( bccidade) ;
         }
      }
      else
      {
         afterTrn( ) ;
         VarsToRow4( bccidade) ;
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
      RowToVars4( bccidade, 0) ;
      getKey044( ) ;
      if ( RcdFound4 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( A14cid_id != Z14cid_id )
         {
            A14cid_id = Z14cid_id ;
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
         if ( A14cid_id != Z14cid_id )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "cidade_bc");
      VarsToRow4( bccidade) ;
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
      Gx_mode = bccidade.getgxTv_Sdtcidade_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bccidade.setgxTv_Sdtcidade_Mode( Gx_mode );
   }

   public void SetSDT( com.projetopratico.Sdtcidade sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bccidade )
      {
         bccidade = sdt ;
         if ( GXutil.strcmp(bccidade.getgxTv_Sdtcidade_Mode(), "") == 0 )
         {
            bccidade.setgxTv_Sdtcidade_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow4( bccidade) ;
         }
         else
         {
            RowToVars4( bccidade, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bccidade.getgxTv_Sdtcidade_Mode(), "") == 0 )
         {
            bccidade.setgxTv_Sdtcidade_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars4( bccidade, 1) ;
   }

   public void ForceCommitOnExit( )
   {
   }

   public Sdtcidade getcidade_BC( )
   {
      return bccidade ;
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
      Z15cid_nome = "" ;
      A15cid_nome = "" ;
      Z16cid_uf = "" ;
      A16cid_uf = "" ;
      BC00044_A14cid_id = new int[1] ;
      BC00044_A15cid_nome = new String[] {""} ;
      BC00044_A16cid_uf = new String[] {""} ;
      BC00045_A14cid_id = new int[1] ;
      BC00046_A14cid_id = new int[1] ;
      BC00046_A15cid_nome = new String[] {""} ;
      BC00046_A16cid_uf = new String[] {""} ;
      sMode4 = "" ;
      BC00047_A14cid_id = new int[1] ;
      BC00047_A15cid_nome = new String[] {""} ;
      BC00047_A16cid_uf = new String[] {""} ;
      BC00049_A14cid_id = new int[1] ;
      BC000412_A17end_id = new int[1] ;
      BC000413_A14cid_id = new int[1] ;
      BC000413_A15cid_nome = new String[] {""} ;
      BC000413_A16cid_uf = new String[] {""} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.cidade_bc__default(),
         new Object[] {
             new Object[] {
            BC00042_A14cid_id, BC00042_A15cid_nome, BC00042_A16cid_uf
            }
            , new Object[] {
            BC00043_A14cid_id, BC00043_A15cid_nome, BC00043_A16cid_uf
            }
            , new Object[] {
            BC00044_A14cid_id, BC00044_A15cid_nome, BC00044_A16cid_uf
            }
            , new Object[] {
            BC00045_A14cid_id
            }
            , new Object[] {
            BC00046_A14cid_id, BC00046_A15cid_nome, BC00046_A16cid_uf
            }
            , new Object[] {
            BC00047_A14cid_id, BC00047_A15cid_nome, BC00047_A16cid_uf
            }
            , new Object[] {
            }
            , new Object[] {
            BC00049_A14cid_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000412_A17end_id
            }
            , new Object[] {
            BC000413_A14cid_id, BC000413_A15cid_nome, BC000413_A16cid_uf
            }
         }
      );
      /* Execute Start event if defined. */
      standaloneNotModal( ) ;
   }

   private short AnyError ;
   private short RcdFound4 ;
   private int trnEnded ;
   private int Z14cid_id ;
   private int A14cid_id ;
   private int GX_JID ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z16cid_uf ;
   private String A16cid_uf ;
   private String sMode4 ;
   private String Z15cid_nome ;
   private String A15cid_nome ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private int[] BC00044_A14cid_id ;
   private String[] BC00044_A15cid_nome ;
   private String[] BC00044_A16cid_uf ;
   private int[] BC00045_A14cid_id ;
   private int[] BC00046_A14cid_id ;
   private String[] BC00046_A15cid_nome ;
   private String[] BC00046_A16cid_uf ;
   private int[] BC00047_A14cid_id ;
   private String[] BC00047_A15cid_nome ;
   private String[] BC00047_A16cid_uf ;
   private int[] BC00049_A14cid_id ;
   private int[] BC000412_A17end_id ;
   private int[] BC000413_A14cid_id ;
   private String[] BC000413_A15cid_nome ;
   private String[] BC000413_A16cid_uf ;
   private com.projetopratico.Sdtcidade bccidade ;
   private int[] BC00042_A14cid_id ;
   private String[] BC00042_A15cid_nome ;
   private String[] BC00042_A16cid_uf ;
   private int[] BC00043_A14cid_id ;
   private String[] BC00043_A15cid_nome ;
   private String[] BC00043_A16cid_uf ;
}

final  class cidade_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00042", "SELECT cid_id, cid_nome, cid_uf FROM cidade WHERE cid_id = ?  FOR UPDATE OF cidade",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00043", "SELECT cid_id, cid_nome, cid_uf FROM cidade WHERE cid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00044", "SELECT TM1.cid_id, TM1.cid_nome, TM1.cid_uf FROM cidade TM1 WHERE TM1.cid_id = ? ORDER BY TM1.cid_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00045", "SELECT cid_id FROM cidade WHERE cid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00046", "SELECT cid_id, cid_nome, cid_uf FROM cidade WHERE cid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00047", "SELECT cid_id, cid_nome, cid_uf FROM cidade WHERE cid_id = ?  FOR UPDATE OF cidade",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC00048", "SAVEPOINT gxupdate;INSERT INTO cidade(cid_nome, cid_uf) VALUES(?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC00049", "SELECT currval('cid_id') ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000410", "SAVEPOINT gxupdate;UPDATE cidade SET cid_nome=?, cid_uf=?  WHERE cid_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("BC000411", "SAVEPOINT gxupdate;DELETE FROM cidade  WHERE cid_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC000412", "SELECT end_id FROM endereco WHERE cid_id = ?  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000413", "SELECT TM1.cid_id, TM1.cid_nome, TM1.cid_uf FROM cidade TM1 WHERE TM1.cid_id = ? ORDER BY TM1.cid_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 10 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
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
               stmt.setString(2, (String)parms[1], 2);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 200, false);
               stmt.setString(2, (String)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
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
      }
   }

}

