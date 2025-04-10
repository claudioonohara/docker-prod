package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class lotacao_bc extends GXWebProcedure implements IGxSilentTrn
{
   public lotacao_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public lotacao_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( lotacao_bc.class ));
   }

   public lotacao_bc( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow097( ) ;
      standaloneNotModal( ) ;
      initializeNonKey097( ) ;
      standaloneModal( ) ;
      addRow097( ) ;
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
            Z25lot_id = A25lot_id ;
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

   public void confirm_090( )
   {
      beforeValidate097( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls097( ) ;
         }
         else
         {
            checkExtendedTable097( ) ;
            if ( AnyError == 0 )
            {
               zm097( 2) ;
               zm097( 3) ;
            }
            closeExtendedTableCursors097( ) ;
         }
      }
      if ( AnyError == 0 )
      {
      }
   }

   public void zm097( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         Z26lot_data_lotacao = A26lot_data_lotacao ;
         Z27lot_data_remocao = A27lot_data_remocao ;
         Z28lot_portaria = A28lot_portaria ;
         Z1pes_id = A1pes_id ;
         Z7unid_id = A7unid_id ;
      }
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
      }
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -1 )
      {
         Z25lot_id = A25lot_id ;
         Z26lot_data_lotacao = A26lot_data_lotacao ;
         Z27lot_data_remocao = A27lot_data_remocao ;
         Z28lot_portaria = A28lot_portaria ;
         Z1pes_id = A1pes_id ;
         Z7unid_id = A7unid_id ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load097( )
   {
      /* Using cursor BC00096 */
      pr_default.execute(4, new Object[] {Integer.valueOf(A25lot_id)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A26lot_data_lotacao = BC00096_A26lot_data_lotacao[0] ;
         A27lot_data_remocao = BC00096_A27lot_data_remocao[0] ;
         A28lot_portaria = BC00096_A28lot_portaria[0] ;
         A1pes_id = BC00096_A1pes_id[0] ;
         A7unid_id = BC00096_A7unid_id[0] ;
         zm097( -1) ;
      }
      pr_default.close(4);
      onLoadActions097( ) ;
   }

   public void onLoadActions097( )
   {
   }

   public void checkExtendedTable097( )
   {
      standaloneModal( ) ;
      /* Using cursor BC00097 */
      pr_default.execute(5, new Object[] {Integer.valueOf(A1pes_id)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem("No matching 'pessoa'.", "ForeignKeyNotFound", 1, "PES_ID");
         AnyError = (short)(1) ;
      }
      pr_default.close(5);
      /* Using cursor BC00098 */
      pr_default.execute(6, new Object[] {Integer.valueOf(A7unid_id)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem("No matching 'unidade'.", "ForeignKeyNotFound", 1, "UNID_ID");
         AnyError = (short)(1) ;
      }
      pr_default.close(6);
   }

   public void closeExtendedTableCursors097( )
   {
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void getKey097( )
   {
      /* Using cursor BC00099 */
      pr_default.execute(7, new Object[] {Integer.valueOf(A25lot_id)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound7 = (short)(1) ;
      }
      else
      {
         RcdFound7 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000910 */
      pr_default.execute(8, new Object[] {Integer.valueOf(A25lot_id)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         zm097( 1) ;
         RcdFound7 = (short)(1) ;
         A25lot_id = BC000910_A25lot_id[0] ;
         A26lot_data_lotacao = BC000910_A26lot_data_lotacao[0] ;
         A27lot_data_remocao = BC000910_A27lot_data_remocao[0] ;
         A28lot_portaria = BC000910_A28lot_portaria[0] ;
         A1pes_id = BC000910_A1pes_id[0] ;
         A7unid_id = BC000910_A7unid_id[0] ;
         Z25lot_id = A25lot_id ;
         sMode7 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load097( ) ;
         if ( AnyError == 1 )
         {
            RcdFound7 = (short)(0) ;
            initializeNonKey097( ) ;
         }
         Gx_mode = sMode7 ;
      }
      else
      {
         RcdFound7 = (short)(0) ;
         initializeNonKey097( ) ;
         sMode7 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode7 ;
      }
      pr_default.close(8);
   }

   public void getEqualNoModal( )
   {
      getKey097( ) ;
      if ( RcdFound7 == 0 )
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
      confirm_090( ) ;
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void checkOptimisticConcurrency097( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC000911 */
         pr_default.execute(9, new Object[] {Integer.valueOf(A25lot_id)});
         if ( (pr_default.getStatus(9) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"lotacao"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(9) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z26lot_data_lotacao), GXutil.resetTime(BC000911_A26lot_data_lotacao[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z27lot_data_remocao), GXutil.resetTime(BC000911_A27lot_data_remocao[0])) ) || ( GXutil.strcmp(Z28lot_portaria, BC000911_A28lot_portaria[0]) != 0 ) || ( Z1pes_id != BC000911_A1pes_id[0] ) || ( Z7unid_id != BC000911_A7unid_id[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"lotacao"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert097( )
   {
      beforeValidate097( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable097( ) ;
      }
      if ( AnyError == 0 )
      {
         zm097( 0) ;
         checkOptimisticConcurrency097( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm097( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert097( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000912 */
                  pr_default.execute(10, new Object[] {A26lot_data_lotacao, A27lot_data_remocao, A28lot_portaria, Integer.valueOf(A1pes_id), Integer.valueOf(A7unid_id)});
                  /* Retrieving last key number assigned */
                  /* Using cursor BC000913 */
                  pr_default.execute(11);
                  A25lot_id = BC000913_A25lot_id[0] ;
                  pr_default.close(11);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("lotacao");
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
            load097( ) ;
         }
         endLevel097( ) ;
      }
      closeExtendedTableCursors097( ) ;
   }

   public void update097( )
   {
      beforeValidate097( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable097( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency097( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm097( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate097( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000914 */
                  pr_default.execute(12, new Object[] {A26lot_data_lotacao, A27lot_data_remocao, A28lot_portaria, Integer.valueOf(A1pes_id), Integer.valueOf(A7unid_id), Integer.valueOf(A25lot_id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("lotacao");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"lotacao"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate097( ) ;
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
         endLevel097( ) ;
      }
      closeExtendedTableCursors097( ) ;
   }

   public void deferredUpdate097( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate097( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency097( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls097( ) ;
         afterConfirm097( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete097( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000915 */
               pr_default.execute(13, new Object[] {Integer.valueOf(A25lot_id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("lotacao");
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
      sMode7 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel097( ) ;
      Gx_mode = sMode7 ;
   }

   public void onDeleteControls097( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel097( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(9);
      }
      if ( AnyError == 0 )
      {
         beforeComplete097( ) ;
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

   public void scanKeyStart097( )
   {
      /* Using cursor BC000916 */
      pr_default.execute(14, new Object[] {Integer.valueOf(A25lot_id)});
      RcdFound7 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A25lot_id = BC000916_A25lot_id[0] ;
         A26lot_data_lotacao = BC000916_A26lot_data_lotacao[0] ;
         A27lot_data_remocao = BC000916_A27lot_data_remocao[0] ;
         A28lot_portaria = BC000916_A28lot_portaria[0] ;
         A1pes_id = BC000916_A1pes_id[0] ;
         A7unid_id = BC000916_A7unid_id[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext097( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound7 = (short)(0) ;
      scanKeyLoad097( ) ;
   }

   public void scanKeyLoad097( )
   {
      sMode7 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A25lot_id = BC000916_A25lot_id[0] ;
         A26lot_data_lotacao = BC000916_A26lot_data_lotacao[0] ;
         A27lot_data_remocao = BC000916_A27lot_data_remocao[0] ;
         A28lot_portaria = BC000916_A28lot_portaria[0] ;
         A1pes_id = BC000916_A1pes_id[0] ;
         A7unid_id = BC000916_A7unid_id[0] ;
      }
      Gx_mode = sMode7 ;
   }

   public void scanKeyEnd097( )
   {
      pr_default.close(14);
   }

   public void afterConfirm097( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert097( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate097( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete097( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete097( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate097( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes097( )
   {
   }

   public void send_integrity_lvl_hashes097( )
   {
   }

   public void addRow097( )
   {
      VarsToRow7( bclotacao) ;
   }

   public void readRow097( )
   {
      RowToVars7( bclotacao, 1) ;
   }

   public void initializeNonKey097( )
   {
      A1pes_id = 0 ;
      A7unid_id = 0 ;
      A26lot_data_lotacao = GXutil.nullDate() ;
      A27lot_data_remocao = GXutil.nullDate() ;
      A28lot_portaria = "" ;
      Z26lot_data_lotacao = GXutil.nullDate() ;
      Z27lot_data_remocao = GXutil.nullDate() ;
      Z28lot_portaria = "" ;
      Z1pes_id = 0 ;
      Z7unid_id = 0 ;
   }

   public void initAll097( )
   {
      A25lot_id = 0 ;
      initializeNonKey097( ) ;
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

   public void VarsToRow7( com.projetopratico.Sdtlotacao obj7 )
   {
      obj7.setgxTv_Sdtlotacao_Mode( Gx_mode );
      obj7.setgxTv_Sdtlotacao_Pes_id( A1pes_id );
      obj7.setgxTv_Sdtlotacao_Unid_id( A7unid_id );
      obj7.setgxTv_Sdtlotacao_Lot_data_lotacao( A26lot_data_lotacao );
      obj7.setgxTv_Sdtlotacao_Lot_data_remocao( A27lot_data_remocao );
      obj7.setgxTv_Sdtlotacao_Lot_portaria( A28lot_portaria );
      obj7.setgxTv_Sdtlotacao_Lot_id( A25lot_id );
      obj7.setgxTv_Sdtlotacao_Lot_id_Z( Z25lot_id );
      obj7.setgxTv_Sdtlotacao_Pes_id_Z( Z1pes_id );
      obj7.setgxTv_Sdtlotacao_Unid_id_Z( Z7unid_id );
      obj7.setgxTv_Sdtlotacao_Lot_data_lotacao_Z( Z26lot_data_lotacao );
      obj7.setgxTv_Sdtlotacao_Lot_data_remocao_Z( Z27lot_data_remocao );
      obj7.setgxTv_Sdtlotacao_Lot_portaria_Z( Z28lot_portaria );
      obj7.setgxTv_Sdtlotacao_Mode( Gx_mode );
   }

   public void KeyVarsToRow7( com.projetopratico.Sdtlotacao obj7 )
   {
      obj7.setgxTv_Sdtlotacao_Lot_id( A25lot_id );
   }

   public void RowToVars7( com.projetopratico.Sdtlotacao obj7 ,
                           int forceLoad )
   {
      Gx_mode = obj7.getgxTv_Sdtlotacao_Mode() ;
      A1pes_id = obj7.getgxTv_Sdtlotacao_Pes_id() ;
      A7unid_id = obj7.getgxTv_Sdtlotacao_Unid_id() ;
      A26lot_data_lotacao = obj7.getgxTv_Sdtlotacao_Lot_data_lotacao() ;
      A27lot_data_remocao = obj7.getgxTv_Sdtlotacao_Lot_data_remocao() ;
      A28lot_portaria = obj7.getgxTv_Sdtlotacao_Lot_portaria() ;
      A25lot_id = obj7.getgxTv_Sdtlotacao_Lot_id() ;
      Z25lot_id = obj7.getgxTv_Sdtlotacao_Lot_id_Z() ;
      Z1pes_id = obj7.getgxTv_Sdtlotacao_Pes_id_Z() ;
      Z7unid_id = obj7.getgxTv_Sdtlotacao_Unid_id_Z() ;
      Z26lot_data_lotacao = obj7.getgxTv_Sdtlotacao_Lot_data_lotacao_Z() ;
      Z27lot_data_remocao = obj7.getgxTv_Sdtlotacao_Lot_data_remocao_Z() ;
      Z28lot_portaria = obj7.getgxTv_Sdtlotacao_Lot_portaria_Z() ;
      Gx_mode = obj7.getgxTv_Sdtlotacao_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A25lot_id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey097( ) ;
      scanKeyStart097( ) ;
      if ( RcdFound7 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z25lot_id = A25lot_id ;
      }
      zm097( -1) ;
      onLoadActions097( ) ;
      addRow097( ) ;
      scanKeyEnd097( ) ;
      if ( RcdFound7 == 0 )
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
      RowToVars7( bclotacao, 0) ;
      scanKeyStart097( ) ;
      if ( RcdFound7 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z25lot_id = A25lot_id ;
      }
      zm097( -1) ;
      onLoadActions097( ) ;
      addRow097( ) ;
      scanKeyEnd097( ) ;
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      getKey097( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert097( ) ;
      }
      else
      {
         if ( RcdFound7 == 1 )
         {
            if ( A25lot_id != Z25lot_id )
            {
               A25lot_id = Z25lot_id ;
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
               update097( ) ;
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
               if ( A25lot_id != Z25lot_id )
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
                     insert097( ) ;
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
                     insert097( ) ;
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
      RowToVars7( bclotacao, 1) ;
      saveImpl( ) ;
      VarsToRow7( bclotacao) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars7( bclotacao, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert097( ) ;
      afterTrn( ) ;
      VarsToRow7( bclotacao) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void updateImpl( )
   {
      if ( isUpd( ) )
      {
         saveImpl( ) ;
         VarsToRow7( bclotacao) ;
      }
      else
      {
         com.projetopratico.Sdtlotacao auxBC = new com.projetopratico.Sdtlotacao( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A25lot_id);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bclotacao);
            auxBC.Save();
            bclotacao.copy(auxBC);
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
      RowToVars7( bclotacao, 1) ;
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
      RowToVars7( bclotacao, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert097( ) ;
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
            VarsToRow7( bclotacao) ;
         }
      }
      else
      {
         afterTrn( ) ;
         VarsToRow7( bclotacao) ;
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
      RowToVars7( bclotacao, 0) ;
      getKey097( ) ;
      if ( RcdFound7 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( A25lot_id != Z25lot_id )
         {
            A25lot_id = Z25lot_id ;
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
         if ( A25lot_id != Z25lot_id )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "lotacao_bc");
      VarsToRow7( bclotacao) ;
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
      Gx_mode = bclotacao.getgxTv_Sdtlotacao_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bclotacao.setgxTv_Sdtlotacao_Mode( Gx_mode );
   }

   public void SetSDT( com.projetopratico.Sdtlotacao sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bclotacao )
      {
         bclotacao = sdt ;
         if ( GXutil.strcmp(bclotacao.getgxTv_Sdtlotacao_Mode(), "") == 0 )
         {
            bclotacao.setgxTv_Sdtlotacao_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow7( bclotacao) ;
         }
         else
         {
            RowToVars7( bclotacao, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bclotacao.getgxTv_Sdtlotacao_Mode(), "") == 0 )
         {
            bclotacao.setgxTv_Sdtlotacao_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars7( bclotacao, 1) ;
   }

   public void ForceCommitOnExit( )
   {
   }

   public Sdtlotacao getlotacao_BC( )
   {
      return bclotacao ;
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
      Z26lot_data_lotacao = GXutil.nullDate() ;
      A26lot_data_lotacao = GXutil.nullDate() ;
      Z27lot_data_remocao = GXutil.nullDate() ;
      A27lot_data_remocao = GXutil.nullDate() ;
      Z28lot_portaria = "" ;
      A28lot_portaria = "" ;
      BC00096_A25lot_id = new int[1] ;
      BC00096_A26lot_data_lotacao = new java.util.Date[] {GXutil.nullDate()} ;
      BC00096_A27lot_data_remocao = new java.util.Date[] {GXutil.nullDate()} ;
      BC00096_A28lot_portaria = new String[] {""} ;
      BC00096_A1pes_id = new int[1] ;
      BC00096_A7unid_id = new int[1] ;
      BC00097_A1pes_id = new int[1] ;
      BC00098_A7unid_id = new int[1] ;
      BC00099_A25lot_id = new int[1] ;
      BC000910_A25lot_id = new int[1] ;
      BC000910_A26lot_data_lotacao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000910_A27lot_data_remocao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000910_A28lot_portaria = new String[] {""} ;
      BC000910_A1pes_id = new int[1] ;
      BC000910_A7unid_id = new int[1] ;
      sMode7 = "" ;
      BC000911_A25lot_id = new int[1] ;
      BC000911_A26lot_data_lotacao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000911_A27lot_data_remocao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000911_A28lot_portaria = new String[] {""} ;
      BC000911_A1pes_id = new int[1] ;
      BC000911_A7unid_id = new int[1] ;
      BC000913_A25lot_id = new int[1] ;
      BC000916_A25lot_id = new int[1] ;
      BC000916_A26lot_data_lotacao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000916_A27lot_data_remocao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000916_A28lot_portaria = new String[] {""} ;
      BC000916_A1pes_id = new int[1] ;
      BC000916_A7unid_id = new int[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.lotacao_bc__default(),
         new Object[] {
             new Object[] {
            BC00092_A25lot_id, BC00092_A26lot_data_lotacao, BC00092_A27lot_data_remocao, BC00092_A28lot_portaria, BC00092_A1pes_id, BC00092_A7unid_id
            }
            , new Object[] {
            BC00093_A25lot_id, BC00093_A26lot_data_lotacao, BC00093_A27lot_data_remocao, BC00093_A28lot_portaria, BC00093_A1pes_id, BC00093_A7unid_id
            }
            , new Object[] {
            BC00094_A1pes_id
            }
            , new Object[] {
            BC00095_A7unid_id
            }
            , new Object[] {
            BC00096_A25lot_id, BC00096_A26lot_data_lotacao, BC00096_A27lot_data_remocao, BC00096_A28lot_portaria, BC00096_A1pes_id, BC00096_A7unid_id
            }
            , new Object[] {
            BC00097_A1pes_id
            }
            , new Object[] {
            BC00098_A7unid_id
            }
            , new Object[] {
            BC00099_A25lot_id
            }
            , new Object[] {
            BC000910_A25lot_id, BC000910_A26lot_data_lotacao, BC000910_A27lot_data_remocao, BC000910_A28lot_portaria, BC000910_A1pes_id, BC000910_A7unid_id
            }
            , new Object[] {
            BC000911_A25lot_id, BC000911_A26lot_data_lotacao, BC000911_A27lot_data_remocao, BC000911_A28lot_portaria, BC000911_A1pes_id, BC000911_A7unid_id
            }
            , new Object[] {
            }
            , new Object[] {
            BC000913_A25lot_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000916_A25lot_id, BC000916_A26lot_data_lotacao, BC000916_A27lot_data_remocao, BC000916_A28lot_portaria, BC000916_A1pes_id, BC000916_A7unid_id
            }
         }
      );
      /* Execute Start event if defined. */
      standaloneNotModal( ) ;
   }

   private short AnyError ;
   private short RcdFound7 ;
   private int trnEnded ;
   private int Z25lot_id ;
   private int A25lot_id ;
   private int GX_JID ;
   private int Z1pes_id ;
   private int A1pes_id ;
   private int Z7unid_id ;
   private int A7unid_id ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode7 ;
   private java.util.Date Z26lot_data_lotacao ;
   private java.util.Date A26lot_data_lotacao ;
   private java.util.Date Z27lot_data_remocao ;
   private java.util.Date A27lot_data_remocao ;
   private String Z28lot_portaria ;
   private String A28lot_portaria ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private int[] BC00096_A25lot_id ;
   private java.util.Date[] BC00096_A26lot_data_lotacao ;
   private java.util.Date[] BC00096_A27lot_data_remocao ;
   private String[] BC00096_A28lot_portaria ;
   private int[] BC00096_A1pes_id ;
   private int[] BC00096_A7unid_id ;
   private int[] BC00097_A1pes_id ;
   private int[] BC00098_A7unid_id ;
   private int[] BC00099_A25lot_id ;
   private int[] BC000910_A25lot_id ;
   private java.util.Date[] BC000910_A26lot_data_lotacao ;
   private java.util.Date[] BC000910_A27lot_data_remocao ;
   private String[] BC000910_A28lot_portaria ;
   private int[] BC000910_A1pes_id ;
   private int[] BC000910_A7unid_id ;
   private int[] BC000911_A25lot_id ;
   private java.util.Date[] BC000911_A26lot_data_lotacao ;
   private java.util.Date[] BC000911_A27lot_data_remocao ;
   private String[] BC000911_A28lot_portaria ;
   private int[] BC000911_A1pes_id ;
   private int[] BC000911_A7unid_id ;
   private int[] BC000913_A25lot_id ;
   private int[] BC000916_A25lot_id ;
   private java.util.Date[] BC000916_A26lot_data_lotacao ;
   private java.util.Date[] BC000916_A27lot_data_remocao ;
   private String[] BC000916_A28lot_portaria ;
   private int[] BC000916_A1pes_id ;
   private int[] BC000916_A7unid_id ;
   private com.projetopratico.Sdtlotacao bclotacao ;
   private int[] BC00092_A25lot_id ;
   private java.util.Date[] BC00092_A26lot_data_lotacao ;
   private java.util.Date[] BC00092_A27lot_data_remocao ;
   private String[] BC00092_A28lot_portaria ;
   private int[] BC00092_A1pes_id ;
   private int[] BC00092_A7unid_id ;
   private int[] BC00093_A25lot_id ;
   private java.util.Date[] BC00093_A26lot_data_lotacao ;
   private java.util.Date[] BC00093_A27lot_data_remocao ;
   private String[] BC00093_A28lot_portaria ;
   private int[] BC00093_A1pes_id ;
   private int[] BC00093_A7unid_id ;
   private int[] BC00094_A1pes_id ;
   private int[] BC00095_A7unid_id ;
}

final  class lotacao_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00092", "SELECT lot_id, lot_data_lotacao, lot_data_remocao, lot_portaria, pes_id, unid_id FROM lotacao WHERE lot_id = ?  FOR UPDATE OF lotacao",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00093", "SELECT lot_id, lot_data_lotacao, lot_data_remocao, lot_portaria, pes_id, unid_id FROM lotacao WHERE lot_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00094", "SELECT pes_id FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00095", "SELECT unid_id FROM unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00096", "SELECT TM1.lot_id, TM1.lot_data_lotacao, TM1.lot_data_remocao, TM1.lot_portaria, TM1.pes_id, TM1.unid_id FROM lotacao TM1 WHERE TM1.lot_id = ? ORDER BY TM1.lot_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00097", "SELECT pes_id FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00098", "SELECT unid_id FROM unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00099", "SELECT lot_id FROM lotacao WHERE lot_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000910", "SELECT lot_id, lot_data_lotacao, lot_data_remocao, lot_portaria, pes_id, unid_id FROM lotacao WHERE lot_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000911", "SELECT lot_id, lot_data_lotacao, lot_data_remocao, lot_portaria, pes_id, unid_id FROM lotacao WHERE lot_id = ?  FOR UPDATE OF lotacao",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000912", "SAVEPOINT gxupdate;INSERT INTO lotacao(lot_data_lotacao, lot_data_remocao, lot_portaria, pes_id, unid_id) VALUES(?, ?, ?, ?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC000913", "SELECT currval('lot_id') ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000914", "SAVEPOINT gxupdate;UPDATE lotacao SET lot_data_lotacao=?, lot_data_remocao=?, lot_portaria=?, pes_id=?, unid_id=?  WHERE lot_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("BC000915", "SAVEPOINT gxupdate;DELETE FROM lotacao  WHERE lot_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC000916", "SELECT TM1.lot_id, TM1.lot_data_lotacao, TM1.lot_data_remocao, TM1.lot_portaria, TM1.pes_id, TM1.unid_id FROM lotacao TM1 WHERE TM1.lot_id = ? ORDER BY TM1.lot_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 14 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 10 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setVarchar(3, (String)parms[2], 100, false);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 12 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setVarchar(3, (String)parms[2], 100, false);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 13 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 14 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

