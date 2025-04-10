package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class unidade_endereco_bc extends GXWebProcedure implements IGxSilentTrn
{
   public unidade_endereco_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public unidade_endereco_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( unidade_endereco_bc.class ));
   }

   public unidade_endereco_bc( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow0A8( ) ;
      standaloneNotModal( ) ;
      initializeNonKey0A8( ) ;
      standaloneModal( ) ;
      addRow0A8( ) ;
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
            Z7unid_id = A7unid_id ;
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

   public void confirm_0A0( )
   {
      beforeValidate0A8( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls0A8( ) ;
         }
         else
         {
            checkExtendedTable0A8( ) ;
            if ( AnyError == 0 )
            {
               zm0A8( 2) ;
               zm0A8( 3) ;
            }
            closeExtendedTableCursors0A8( ) ;
         }
      }
      if ( AnyError == 0 )
      {
      }
   }

   public void zm0A8( int GX_JID )
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
         Z7unid_id = A7unid_id ;
         Z17end_id = A17end_id ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0A8( )
   {
      /* Using cursor BC000A6 */
      pr_default.execute(4, new Object[] {Integer.valueOf(A7unid_id), Integer.valueOf(A17end_id)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound8 = (short)(1) ;
         zm0A8( -1) ;
      }
      pr_default.close(4);
      onLoadActions0A8( ) ;
   }

   public void onLoadActions0A8( )
   {
   }

   public void checkExtendedTable0A8( )
   {
      standaloneModal( ) ;
      /* Using cursor BC000A7 */
      pr_default.execute(5, new Object[] {Integer.valueOf(A7unid_id)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem("No matching 'unidade'.", "ForeignKeyNotFound", 1, "UNID_ID");
         AnyError = (short)(1) ;
      }
      pr_default.close(5);
      /* Using cursor BC000A8 */
      pr_default.execute(6, new Object[] {Integer.valueOf(A17end_id)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem("No matching 'endereco'.", "ForeignKeyNotFound", 1, "END_ID");
         AnyError = (short)(1) ;
      }
      pr_default.close(6);
   }

   public void closeExtendedTableCursors0A8( )
   {
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void getKey0A8( )
   {
      /* Using cursor BC000A9 */
      pr_default.execute(7, new Object[] {Integer.valueOf(A7unid_id), Integer.valueOf(A17end_id)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound8 = (short)(1) ;
      }
      else
      {
         RcdFound8 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000A10 */
      pr_default.execute(8, new Object[] {Integer.valueOf(A7unid_id), Integer.valueOf(A17end_id)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         zm0A8( 1) ;
         RcdFound8 = (short)(1) ;
         A7unid_id = BC000A10_A7unid_id[0] ;
         A17end_id = BC000A10_A17end_id[0] ;
         Z7unid_id = A7unid_id ;
         Z17end_id = A17end_id ;
         sMode8 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0A8( ) ;
         if ( AnyError == 1 )
         {
            RcdFound8 = (short)(0) ;
            initializeNonKey0A8( ) ;
         }
         Gx_mode = sMode8 ;
      }
      else
      {
         RcdFound8 = (short)(0) ;
         initializeNonKey0A8( ) ;
         sMode8 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode8 ;
      }
      pr_default.close(8);
   }

   public void getEqualNoModal( )
   {
      getKey0A8( ) ;
      if ( RcdFound8 == 0 )
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
      confirm_0A0( ) ;
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void checkOptimisticConcurrency0A8( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC000A11 */
         pr_default.execute(9, new Object[] {Integer.valueOf(A7unid_id), Integer.valueOf(A17end_id)});
         if ( (pr_default.getStatus(9) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"unidade_endereco"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(9) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"unidade_endereco"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0A8( )
   {
      beforeValidate0A8( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0A8( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0A8( 0) ;
         checkOptimisticConcurrency0A8( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0A8( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0A8( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000A12 */
                  pr_default.execute(10, new Object[] {Integer.valueOf(A7unid_id), Integer.valueOf(A17end_id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("unidade_endereco");
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
            load0A8( ) ;
         }
         endLevel0A8( ) ;
      }
      closeExtendedTableCursors0A8( ) ;
   }

   public void update0A8( )
   {
      beforeValidate0A8( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0A8( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0A8( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0A8( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0A8( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table unidade_endereco */
                  deferredUpdate0A8( ) ;
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
         endLevel0A8( ) ;
      }
      closeExtendedTableCursors0A8( ) ;
   }

   public void deferredUpdate0A8( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0A8( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0A8( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0A8( ) ;
         afterConfirm0A8( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0A8( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000A13 */
               pr_default.execute(11, new Object[] {Integer.valueOf(A7unid_id), Integer.valueOf(A17end_id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("unidade_endereco");
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
      sMode8 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0A8( ) ;
      Gx_mode = sMode8 ;
   }

   public void onDeleteControls0A8( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel0A8( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(9);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0A8( ) ;
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

   public void scanKeyStart0A8( )
   {
      /* Using cursor BC000A14 */
      pr_default.execute(12, new Object[] {Integer.valueOf(A7unid_id), Integer.valueOf(A17end_id)});
      RcdFound8 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound8 = (short)(1) ;
         A7unid_id = BC000A14_A7unid_id[0] ;
         A17end_id = BC000A14_A17end_id[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0A8( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound8 = (short)(0) ;
      scanKeyLoad0A8( ) ;
   }

   public void scanKeyLoad0A8( )
   {
      sMode8 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound8 = (short)(1) ;
         A7unid_id = BC000A14_A7unid_id[0] ;
         A17end_id = BC000A14_A17end_id[0] ;
      }
      Gx_mode = sMode8 ;
   }

   public void scanKeyEnd0A8( )
   {
      pr_default.close(12);
   }

   public void afterConfirm0A8( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0A8( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0A8( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0A8( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0A8( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0A8( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0A8( )
   {
   }

   public void send_integrity_lvl_hashes0A8( )
   {
   }

   public void addRow0A8( )
   {
      VarsToRow8( bcunidade_endereco) ;
   }

   public void readRow0A8( )
   {
      RowToVars8( bcunidade_endereco, 1) ;
   }

   public void initializeNonKey0A8( )
   {
   }

   public void initAll0A8( )
   {
      A7unid_id = 0 ;
      A17end_id = 0 ;
      initializeNonKey0A8( ) ;
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

   public void VarsToRow8( com.projetopratico.Sdtunidade_endereco obj8 )
   {
      obj8.setgxTv_Sdtunidade_endereco_Mode( Gx_mode );
      obj8.setgxTv_Sdtunidade_endereco_Unid_id( A7unid_id );
      obj8.setgxTv_Sdtunidade_endereco_End_id( A17end_id );
      obj8.setgxTv_Sdtunidade_endereco_Unid_id_Z( Z7unid_id );
      obj8.setgxTv_Sdtunidade_endereco_End_id_Z( Z17end_id );
      obj8.setgxTv_Sdtunidade_endereco_Mode( Gx_mode );
   }

   public void KeyVarsToRow8( com.projetopratico.Sdtunidade_endereco obj8 )
   {
      obj8.setgxTv_Sdtunidade_endereco_Unid_id( A7unid_id );
      obj8.setgxTv_Sdtunidade_endereco_End_id( A17end_id );
   }

   public void RowToVars8( com.projetopratico.Sdtunidade_endereco obj8 ,
                           int forceLoad )
   {
      Gx_mode = obj8.getgxTv_Sdtunidade_endereco_Mode() ;
      A7unid_id = obj8.getgxTv_Sdtunidade_endereco_Unid_id() ;
      A17end_id = obj8.getgxTv_Sdtunidade_endereco_End_id() ;
      Z7unid_id = obj8.getgxTv_Sdtunidade_endereco_Unid_id_Z() ;
      Z17end_id = obj8.getgxTv_Sdtunidade_endereco_End_id_Z() ;
      Gx_mode = obj8.getgxTv_Sdtunidade_endereco_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A7unid_id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      A17end_id = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0A8( ) ;
      scanKeyStart0A8( ) ;
      if ( RcdFound8 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000A15 */
         pr_default.execute(13, new Object[] {Integer.valueOf(A7unid_id)});
         if ( (pr_default.getStatus(13) == 101) )
         {
            httpContext.GX_msglist.addItem("No matching 'unidade'.", "ForeignKeyNotFound", 1, "UNID_ID");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor BC000A16 */
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
         Z7unid_id = A7unid_id ;
         Z17end_id = A17end_id ;
      }
      zm0A8( -1) ;
      onLoadActions0A8( ) ;
      addRow0A8( ) ;
      scanKeyEnd0A8( ) ;
      if ( RcdFound8 == 0 )
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
      RowToVars8( bcunidade_endereco, 0) ;
      scanKeyStart0A8( ) ;
      if ( RcdFound8 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000A17 */
         pr_default.execute(15, new Object[] {Integer.valueOf(A7unid_id)});
         if ( (pr_default.getStatus(15) == 101) )
         {
            httpContext.GX_msglist.addItem("No matching 'unidade'.", "ForeignKeyNotFound", 1, "UNID_ID");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor BC000A18 */
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
         Z7unid_id = A7unid_id ;
         Z17end_id = A17end_id ;
      }
      zm0A8( -1) ;
      onLoadActions0A8( ) ;
      addRow0A8( ) ;
      scanKeyEnd0A8( ) ;
      if ( RcdFound8 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      getKey0A8( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert0A8( ) ;
      }
      else
      {
         if ( RcdFound8 == 1 )
         {
            if ( ( A7unid_id != Z7unid_id ) || ( A17end_id != Z17end_id ) )
            {
               A7unid_id = Z7unid_id ;
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
               update0A8( ) ;
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
               if ( ( A7unid_id != Z7unid_id ) || ( A17end_id != Z17end_id ) )
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
                     insert0A8( ) ;
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
                     insert0A8( ) ;
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
      RowToVars8( bcunidade_endereco, 1) ;
      saveImpl( ) ;
      VarsToRow8( bcunidade_endereco) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars8( bcunidade_endereco, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert0A8( ) ;
      afterTrn( ) ;
      VarsToRow8( bcunidade_endereco) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void updateImpl( )
   {
      if ( isUpd( ) )
      {
         saveImpl( ) ;
         VarsToRow8( bcunidade_endereco) ;
      }
      else
      {
         com.projetopratico.Sdtunidade_endereco auxBC = new com.projetopratico.Sdtunidade_endereco( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A7unid_id, A17end_id);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcunidade_endereco);
            auxBC.Save();
            bcunidade_endereco.copy(auxBC);
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
      RowToVars8( bcunidade_endereco, 1) ;
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
      RowToVars8( bcunidade_endereco, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert0A8( ) ;
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
            VarsToRow8( bcunidade_endereco) ;
         }
      }
      else
      {
         afterTrn( ) ;
         VarsToRow8( bcunidade_endereco) ;
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
      RowToVars8( bcunidade_endereco, 0) ;
      getKey0A8( ) ;
      if ( RcdFound8 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A7unid_id != Z7unid_id ) || ( A17end_id != Z17end_id ) )
         {
            A7unid_id = Z7unid_id ;
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
         if ( ( A7unid_id != Z7unid_id ) || ( A17end_id != Z17end_id ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "unidade_endereco_bc");
      VarsToRow8( bcunidade_endereco) ;
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
      Gx_mode = bcunidade_endereco.getgxTv_Sdtunidade_endereco_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcunidade_endereco.setgxTv_Sdtunidade_endereco_Mode( Gx_mode );
   }

   public void SetSDT( com.projetopratico.Sdtunidade_endereco sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcunidade_endereco )
      {
         bcunidade_endereco = sdt ;
         if ( GXutil.strcmp(bcunidade_endereco.getgxTv_Sdtunidade_endereco_Mode(), "") == 0 )
         {
            bcunidade_endereco.setgxTv_Sdtunidade_endereco_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow8( bcunidade_endereco) ;
         }
         else
         {
            RowToVars8( bcunidade_endereco, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcunidade_endereco.getgxTv_Sdtunidade_endereco_Mode(), "") == 0 )
         {
            bcunidade_endereco.setgxTv_Sdtunidade_endereco_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars8( bcunidade_endereco, 1) ;
   }

   public void ForceCommitOnExit( )
   {
   }

   public Sdtunidade_endereco getunidade_endereco_BC( )
   {
      return bcunidade_endereco ;
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
      BC000A6_A7unid_id = new int[1] ;
      BC000A6_A17end_id = new int[1] ;
      BC000A7_A7unid_id = new int[1] ;
      BC000A8_A17end_id = new int[1] ;
      BC000A9_A7unid_id = new int[1] ;
      BC000A9_A17end_id = new int[1] ;
      BC000A10_A7unid_id = new int[1] ;
      BC000A10_A17end_id = new int[1] ;
      sMode8 = "" ;
      BC000A11_A7unid_id = new int[1] ;
      BC000A11_A17end_id = new int[1] ;
      BC000A14_A7unid_id = new int[1] ;
      BC000A14_A17end_id = new int[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC000A15_A7unid_id = new int[1] ;
      BC000A16_A17end_id = new int[1] ;
      BC000A17_A7unid_id = new int[1] ;
      BC000A18_A17end_id = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.unidade_endereco_bc__default(),
         new Object[] {
             new Object[] {
            BC000A2_A7unid_id, BC000A2_A17end_id
            }
            , new Object[] {
            BC000A3_A7unid_id, BC000A3_A17end_id
            }
            , new Object[] {
            BC000A4_A7unid_id
            }
            , new Object[] {
            BC000A5_A17end_id
            }
            , new Object[] {
            BC000A6_A7unid_id, BC000A6_A17end_id
            }
            , new Object[] {
            BC000A7_A7unid_id
            }
            , new Object[] {
            BC000A8_A17end_id
            }
            , new Object[] {
            BC000A9_A7unid_id, BC000A9_A17end_id
            }
            , new Object[] {
            BC000A10_A7unid_id, BC000A10_A17end_id
            }
            , new Object[] {
            BC000A11_A7unid_id, BC000A11_A17end_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000A14_A7unid_id, BC000A14_A17end_id
            }
            , new Object[] {
            BC000A15_A7unid_id
            }
            , new Object[] {
            BC000A16_A17end_id
            }
            , new Object[] {
            BC000A17_A7unid_id
            }
            , new Object[] {
            BC000A18_A17end_id
            }
         }
      );
      /* Execute Start event if defined. */
      standaloneNotModal( ) ;
   }

   private short AnyError ;
   private short RcdFound8 ;
   private int trnEnded ;
   private int Z7unid_id ;
   private int A7unid_id ;
   private int Z17end_id ;
   private int A17end_id ;
   private int GX_JID ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode8 ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private int[] BC000A6_A7unid_id ;
   private int[] BC000A6_A17end_id ;
   private int[] BC000A7_A7unid_id ;
   private int[] BC000A8_A17end_id ;
   private int[] BC000A9_A7unid_id ;
   private int[] BC000A9_A17end_id ;
   private int[] BC000A10_A7unid_id ;
   private int[] BC000A10_A17end_id ;
   private int[] BC000A11_A7unid_id ;
   private int[] BC000A11_A17end_id ;
   private int[] BC000A14_A7unid_id ;
   private int[] BC000A14_A17end_id ;
   private com.projetopratico.Sdtunidade_endereco bcunidade_endereco ;
   private int[] BC000A15_A7unid_id ;
   private int[] BC000A16_A17end_id ;
   private int[] BC000A17_A7unid_id ;
   private int[] BC000A18_A17end_id ;
   private int[] BC000A2_A7unid_id ;
   private int[] BC000A2_A17end_id ;
   private int[] BC000A3_A7unid_id ;
   private int[] BC000A3_A17end_id ;
   private int[] BC000A4_A7unid_id ;
   private int[] BC000A5_A17end_id ;
}

final  class unidade_endereco_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000A2", "SELECT unid_id, end_id FROM unidade_endereco WHERE unid_id = ? AND end_id = ?  FOR UPDATE OF unidade_endereco",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000A3", "SELECT unid_id, end_id FROM unidade_endereco WHERE unid_id = ? AND end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000A4", "SELECT unid_id FROM unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000A5", "SELECT end_id FROM endereco WHERE end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000A6", "SELECT TM1.unid_id, TM1.end_id FROM unidade_endereco TM1 WHERE TM1.unid_id = ? and TM1.end_id = ? ORDER BY TM1.unid_id, TM1.end_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000A7", "SELECT unid_id FROM unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000A8", "SELECT end_id FROM endereco WHERE end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000A9", "SELECT unid_id, end_id FROM unidade_endereco WHERE unid_id = ? AND end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000A10", "SELECT unid_id, end_id FROM unidade_endereco WHERE unid_id = ? AND end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000A11", "SELECT unid_id, end_id FROM unidade_endereco WHERE unid_id = ? AND end_id = ?  FOR UPDATE OF unidade_endereco",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000A12", "SAVEPOINT gxupdate;INSERT INTO unidade_endereco(unid_id, end_id) VALUES(?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("BC000A13", "SAVEPOINT gxupdate;DELETE FROM unidade_endereco  WHERE unid_id = ? AND end_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC000A14", "SELECT TM1.unid_id, TM1.end_id FROM unidade_endereco TM1 WHERE TM1.unid_id = ? and TM1.end_id = ? ORDER BY TM1.unid_id, TM1.end_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000A15", "SELECT unid_id FROM unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000A16", "SELECT end_id FROM endereco WHERE end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000A17", "SELECT unid_id FROM unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000A18", "SELECT end_id FROM endereco WHERE end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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

