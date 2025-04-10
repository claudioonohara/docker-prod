package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pessoa_endereco_bc extends GXWebProcedure implements IGxSilentTrn
{
   public pessoa_endereco_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public pessoa_endereco_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pessoa_endereco_bc.class ));
   }

   public pessoa_endereco_bc( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow066( ) ;
      standaloneNotModal( ) ;
      initializeNonKey066( ) ;
      standaloneModal( ) ;
      addRow066( ) ;
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
            Z17end_id = A17end_id ;
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

   public void confirm_060( )
   {
      beforeValidate066( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls066( ) ;
         }
         else
         {
            checkExtendedTable066( ) ;
            if ( AnyError == 0 )
            {
               zm066( 2) ;
               zm066( 3) ;
            }
            closeExtendedTableCursors066( ) ;
         }
      }
      if ( AnyError == 0 )
      {
      }
   }

   public void zm066( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
      }
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
      }
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -1 )
      {
         Z1pes_id = A1pes_id ;
         Z17end_id = A17end_id ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load066( )
   {
      /* Using cursor BC00066 */
      pr_default.execute(4, new Object[] {Integer.valueOf(A1pes_id), Integer.valueOf(A17end_id)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound6 = (short)(1) ;
         zm066( -1) ;
      }
      pr_default.close(4);
      onLoadActions066( ) ;
   }

   public void onLoadActions066( )
   {
   }

   public void checkExtendedTable066( )
   {
      standaloneModal( ) ;
      /* Using cursor BC00067 */
      pr_default.execute(5, new Object[] {Integer.valueOf(A1pes_id)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem("No matching 'pessoa'.", "ForeignKeyNotFound", 1, "PES_ID");
         AnyError = (short)(1) ;
      }
      pr_default.close(5);
      /* Using cursor BC00068 */
      pr_default.execute(6, new Object[] {Integer.valueOf(A17end_id)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem("No matching 'endereco'.", "ForeignKeyNotFound", 1, "END_ID");
         AnyError = (short)(1) ;
      }
      pr_default.close(6);
   }

   public void closeExtendedTableCursors066( )
   {
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void getKey066( )
   {
      /* Using cursor BC00069 */
      pr_default.execute(7, new Object[] {Integer.valueOf(A1pes_id), Integer.valueOf(A17end_id)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound6 = (short)(1) ;
      }
      else
      {
         RcdFound6 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000610 */
      pr_default.execute(8, new Object[] {Integer.valueOf(A1pes_id), Integer.valueOf(A17end_id)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         zm066( 1) ;
         RcdFound6 = (short)(1) ;
         A1pes_id = BC000610_A1pes_id[0] ;
         A17end_id = BC000610_A17end_id[0] ;
         Z1pes_id = A1pes_id ;
         Z17end_id = A17end_id ;
         sMode6 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load066( ) ;
         if ( AnyError == 1 )
         {
            RcdFound6 = (short)(0) ;
            initializeNonKey066( ) ;
         }
         Gx_mode = sMode6 ;
      }
      else
      {
         RcdFound6 = (short)(0) ;
         initializeNonKey066( ) ;
         sMode6 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode6 ;
      }
      pr_default.close(8);
   }

   public void getEqualNoModal( )
   {
      getKey066( ) ;
      if ( RcdFound6 == 0 )
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
      confirm_060( ) ;
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void checkOptimisticConcurrency066( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC000611 */
         pr_default.execute(9, new Object[] {Integer.valueOf(A1pes_id), Integer.valueOf(A17end_id)});
         if ( (pr_default.getStatus(9) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"pessoa_endereco"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(9) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"pessoa_endereco"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert066( )
   {
      beforeValidate066( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable066( ) ;
      }
      if ( AnyError == 0 )
      {
         zm066( 0) ;
         checkOptimisticConcurrency066( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm066( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert066( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000612 */
                  pr_default.execute(10, new Object[] {Integer.valueOf(A1pes_id), Integer.valueOf(A17end_id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("pessoa_endereco");
                  if ( (pr_default.getStatus(10) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
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
            load066( ) ;
         }
         endLevel066( ) ;
      }
      closeExtendedTableCursors066( ) ;
   }

   public void update066( )
   {
      beforeValidate066( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable066( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency066( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm066( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate066( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table pessoa_endereco */
                  deferredUpdate066( ) ;
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
         endLevel066( ) ;
      }
      closeExtendedTableCursors066( ) ;
   }

   public void deferredUpdate066( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate066( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency066( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls066( ) ;
         afterConfirm066( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete066( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000613 */
               pr_default.execute(11, new Object[] {Integer.valueOf(A1pes_id), Integer.valueOf(A17end_id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("pessoa_endereco");
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
      sMode6 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel066( ) ;
      Gx_mode = sMode6 ;
   }

   public void onDeleteControls066( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel066( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(9);
      }
      if ( AnyError == 0 )
      {
         beforeComplete066( ) ;
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

   public void scanKeyStart066( )
   {
      /* Using cursor BC000614 */
      pr_default.execute(12, new Object[] {Integer.valueOf(A1pes_id), Integer.valueOf(A17end_id)});
      RcdFound6 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound6 = (short)(1) ;
         A1pes_id = BC000614_A1pes_id[0] ;
         A17end_id = BC000614_A17end_id[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext066( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound6 = (short)(0) ;
      scanKeyLoad066( ) ;
   }

   public void scanKeyLoad066( )
   {
      sMode6 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound6 = (short)(1) ;
         A1pes_id = BC000614_A1pes_id[0] ;
         A17end_id = BC000614_A17end_id[0] ;
      }
      Gx_mode = sMode6 ;
   }

   public void scanKeyEnd066( )
   {
      pr_default.close(12);
   }

   public void afterConfirm066( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert066( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate066( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete066( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete066( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate066( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes066( )
   {
   }

   public void send_integrity_lvl_hashes066( )
   {
   }

   public void addRow066( )
   {
      VarsToRow6( bcpessoa_endereco) ;
   }

   public void readRow066( )
   {
      RowToVars6( bcpessoa_endereco, 1) ;
   }

   public void initializeNonKey066( )
   {
   }

   public void initAll066( )
   {
      A1pes_id = 0 ;
      A17end_id = 0 ;
      initializeNonKey066( ) ;
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

   public void VarsToRow6( com.projetopratico.Sdtpessoa_endereco obj6 )
   {
      obj6.setgxTv_Sdtpessoa_endereco_Mode( Gx_mode );
      obj6.setgxTv_Sdtpessoa_endereco_Pes_id( A1pes_id );
      obj6.setgxTv_Sdtpessoa_endereco_End_id( A17end_id );
      obj6.setgxTv_Sdtpessoa_endereco_Pes_id_Z( Z1pes_id );
      obj6.setgxTv_Sdtpessoa_endereco_End_id_Z( Z17end_id );
      obj6.setgxTv_Sdtpessoa_endereco_Mode( Gx_mode );
   }

   public void KeyVarsToRow6( com.projetopratico.Sdtpessoa_endereco obj6 )
   {
      obj6.setgxTv_Sdtpessoa_endereco_Pes_id( A1pes_id );
      obj6.setgxTv_Sdtpessoa_endereco_End_id( A17end_id );
   }

   public void RowToVars6( com.projetopratico.Sdtpessoa_endereco obj6 ,
                           int forceLoad )
   {
      Gx_mode = obj6.getgxTv_Sdtpessoa_endereco_Mode() ;
      A1pes_id = obj6.getgxTv_Sdtpessoa_endereco_Pes_id() ;
      A17end_id = obj6.getgxTv_Sdtpessoa_endereco_End_id() ;
      Z1pes_id = obj6.getgxTv_Sdtpessoa_endereco_Pes_id_Z() ;
      Z17end_id = obj6.getgxTv_Sdtpessoa_endereco_End_id_Z() ;
      Gx_mode = obj6.getgxTv_Sdtpessoa_endereco_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A1pes_id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      A17end_id = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey066( ) ;
      scanKeyStart066( ) ;
      if ( RcdFound6 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000615 */
         pr_default.execute(13, new Object[] {Integer.valueOf(A1pes_id)});
         if ( (pr_default.getStatus(13) == 101) )
         {
            httpContext.GX_msglist.addItem("No matching 'pessoa'.", "ForeignKeyNotFound", 1, "PES_ID");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor BC000616 */
         pr_default.execute(14, new Object[] {Integer.valueOf(A17end_id)});
         if ( (pr_default.getStatus(14) == 101) )
         {
            httpContext.GX_msglist.addItem("No matching 'endereco'.", "ForeignKeyNotFound", 1, "END_ID");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z1pes_id = A1pes_id ;
         Z17end_id = A17end_id ;
      }
      zm066( -1) ;
      onLoadActions066( ) ;
      addRow066( ) ;
      scanKeyEnd066( ) ;
      if ( RcdFound6 == 0 )
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
      RowToVars6( bcpessoa_endereco, 0) ;
      scanKeyStart066( ) ;
      if ( RcdFound6 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000617 */
         pr_default.execute(15, new Object[] {Integer.valueOf(A1pes_id)});
         if ( (pr_default.getStatus(15) == 101) )
         {
            httpContext.GX_msglist.addItem("No matching 'pessoa'.", "ForeignKeyNotFound", 1, "PES_ID");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor BC000618 */
         pr_default.execute(16, new Object[] {Integer.valueOf(A17end_id)});
         if ( (pr_default.getStatus(16) == 101) )
         {
            httpContext.GX_msglist.addItem("No matching 'endereco'.", "ForeignKeyNotFound", 1, "END_ID");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z1pes_id = A1pes_id ;
         Z17end_id = A17end_id ;
      }
      zm066( -1) ;
      onLoadActions066( ) ;
      addRow066( ) ;
      scanKeyEnd066( ) ;
      if ( RcdFound6 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      getKey066( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert066( ) ;
      }
      else
      {
         if ( RcdFound6 == 1 )
         {
            if ( ( A1pes_id != Z1pes_id ) || ( A17end_id != Z17end_id ) )
            {
               A1pes_id = Z1pes_id ;
               A17end_id = Z17end_id ;
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
               update066( ) ;
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
               if ( ( A1pes_id != Z1pes_id ) || ( A17end_id != Z17end_id ) )
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
                     insert066( ) ;
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
                     insert066( ) ;
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
      RowToVars6( bcpessoa_endereco, 1) ;
      saveImpl( ) ;
      VarsToRow6( bcpessoa_endereco) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars6( bcpessoa_endereco, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert066( ) ;
      afterTrn( ) ;
      VarsToRow6( bcpessoa_endereco) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void updateImpl( )
   {
      if ( isUpd( ) )
      {
         saveImpl( ) ;
         VarsToRow6( bcpessoa_endereco) ;
      }
      else
      {
         com.projetopratico.Sdtpessoa_endereco auxBC = new com.projetopratico.Sdtpessoa_endereco( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A1pes_id, A17end_id);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcpessoa_endereco);
            auxBC.Save();
            bcpessoa_endereco.copy(auxBC);
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
      RowToVars6( bcpessoa_endereco, 1) ;
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
      RowToVars6( bcpessoa_endereco, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert066( ) ;
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
            VarsToRow6( bcpessoa_endereco) ;
         }
      }
      else
      {
         afterTrn( ) ;
         VarsToRow6( bcpessoa_endereco) ;
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
      RowToVars6( bcpessoa_endereco, 0) ;
      getKey066( ) ;
      if ( RcdFound6 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A1pes_id != Z1pes_id ) || ( A17end_id != Z17end_id ) )
         {
            A1pes_id = Z1pes_id ;
            A17end_id = Z17end_id ;
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
         if ( ( A1pes_id != Z1pes_id ) || ( A17end_id != Z17end_id ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "pessoa_endereco_bc");
      VarsToRow6( bcpessoa_endereco) ;
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
      Gx_mode = bcpessoa_endereco.getgxTv_Sdtpessoa_endereco_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcpessoa_endereco.setgxTv_Sdtpessoa_endereco_Mode( Gx_mode );
   }

   public void SetSDT( com.projetopratico.Sdtpessoa_endereco sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcpessoa_endereco )
      {
         bcpessoa_endereco = sdt ;
         if ( GXutil.strcmp(bcpessoa_endereco.getgxTv_Sdtpessoa_endereco_Mode(), "") == 0 )
         {
            bcpessoa_endereco.setgxTv_Sdtpessoa_endereco_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow6( bcpessoa_endereco) ;
         }
         else
         {
            RowToVars6( bcpessoa_endereco, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcpessoa_endereco.getgxTv_Sdtpessoa_endereco_Mode(), "") == 0 )
         {
            bcpessoa_endereco.setgxTv_Sdtpessoa_endereco_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars6( bcpessoa_endereco, 1) ;
   }

   public void ForceCommitOnExit( )
   {
   }

   public Sdtpessoa_endereco getpessoa_endereco_BC( )
   {
      return bcpessoa_endereco ;
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
      BC00066_A1pes_id = new int[1] ;
      BC00066_A17end_id = new int[1] ;
      BC00067_A1pes_id = new int[1] ;
      BC00068_A17end_id = new int[1] ;
      BC00069_A1pes_id = new int[1] ;
      BC00069_A17end_id = new int[1] ;
      BC000610_A1pes_id = new int[1] ;
      BC000610_A17end_id = new int[1] ;
      sMode6 = "" ;
      BC000611_A1pes_id = new int[1] ;
      BC000611_A17end_id = new int[1] ;
      BC000614_A1pes_id = new int[1] ;
      BC000614_A17end_id = new int[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC000615_A1pes_id = new int[1] ;
      BC000616_A17end_id = new int[1] ;
      BC000617_A1pes_id = new int[1] ;
      BC000618_A17end_id = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pessoa_endereco_bc__default(),
         new Object[] {
             new Object[] {
            BC00062_A1pes_id, BC00062_A17end_id
            }
            , new Object[] {
            BC00063_A1pes_id, BC00063_A17end_id
            }
            , new Object[] {
            BC00064_A1pes_id
            }
            , new Object[] {
            BC00065_A17end_id
            }
            , new Object[] {
            BC00066_A1pes_id, BC00066_A17end_id
            }
            , new Object[] {
            BC00067_A1pes_id
            }
            , new Object[] {
            BC00068_A17end_id
            }
            , new Object[] {
            BC00069_A1pes_id, BC00069_A17end_id
            }
            , new Object[] {
            BC000610_A1pes_id, BC000610_A17end_id
            }
            , new Object[] {
            BC000611_A1pes_id, BC000611_A17end_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000614_A1pes_id, BC000614_A17end_id
            }
            , new Object[] {
            BC000615_A1pes_id
            }
            , new Object[] {
            BC000616_A17end_id
            }
            , new Object[] {
            BC000617_A1pes_id
            }
            , new Object[] {
            BC000618_A17end_id
            }
         }
      );
      /* Execute Start event if defined. */
      standaloneNotModal( ) ;
   }

   private short AnyError ;
   private short RcdFound6 ;
   private int trnEnded ;
   private int Z1pes_id ;
   private int A1pes_id ;
   private int Z17end_id ;
   private int A17end_id ;
   private int GX_JID ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode6 ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private int[] BC00066_A1pes_id ;
   private int[] BC00066_A17end_id ;
   private int[] BC00067_A1pes_id ;
   private int[] BC00068_A17end_id ;
   private int[] BC00069_A1pes_id ;
   private int[] BC00069_A17end_id ;
   private int[] BC000610_A1pes_id ;
   private int[] BC000610_A17end_id ;
   private int[] BC000611_A1pes_id ;
   private int[] BC000611_A17end_id ;
   private int[] BC000614_A1pes_id ;
   private int[] BC000614_A17end_id ;
   private com.projetopratico.Sdtpessoa_endereco bcpessoa_endereco ;
   private int[] BC000615_A1pes_id ;
   private int[] BC000616_A17end_id ;
   private int[] BC000617_A1pes_id ;
   private int[] BC000618_A17end_id ;
   private int[] BC00062_A1pes_id ;
   private int[] BC00062_A17end_id ;
   private int[] BC00063_A1pes_id ;
   private int[] BC00063_A17end_id ;
   private int[] BC00064_A1pes_id ;
   private int[] BC00065_A17end_id ;
}

final  class pessoa_endereco_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00062", "SELECT pes_id, end_id FROM pessoa_endereco WHERE pes_id = ? AND end_id = ?  FOR UPDATE OF pessoa_endereco",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00063", "SELECT pes_id, end_id FROM pessoa_endereco WHERE pes_id = ? AND end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00064", "SELECT pes_id FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00065", "SELECT end_id FROM endereco WHERE end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00066", "SELECT TM1.pes_id, TM1.end_id FROM pessoa_endereco TM1 WHERE TM1.pes_id = ? and TM1.end_id = ? ORDER BY TM1.pes_id, TM1.end_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00067", "SELECT pes_id FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00068", "SELECT end_id FROM endereco WHERE end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00069", "SELECT pes_id, end_id FROM pessoa_endereco WHERE pes_id = ? AND end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000610", "SELECT pes_id, end_id FROM pessoa_endereco WHERE pes_id = ? AND end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000611", "SELECT pes_id, end_id FROM pessoa_endereco WHERE pes_id = ? AND end_id = ?  FOR UPDATE OF pessoa_endereco",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000612", "SAVEPOINT gxupdate;INSERT INTO pessoa_endereco(pes_id, end_id) VALUES(?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("BC000613", "SAVEPOINT gxupdate;DELETE FROM pessoa_endereco  WHERE pes_id = ? AND end_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC000614", "SELECT TM1.pes_id, TM1.end_id FROM pessoa_endereco TM1 WHERE TM1.pes_id = ? and TM1.end_id = ? ORDER BY TM1.pes_id, TM1.end_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000615", "SELECT pes_id FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000616", "SELECT end_id FROM endereco WHERE end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000617", "SELECT pes_id FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000618", "SELECT end_id FROM endereco WHERE end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 12 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 13 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 14 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 15 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 16 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 4 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 6 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
            case 16 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

