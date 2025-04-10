package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class servidor_efetivo_bc extends GXWebProcedure implements IGxSilentTrn
{
   public servidor_efetivo_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public servidor_efetivo_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( servidor_efetivo_bc.class ));
   }

   public servidor_efetivo_bc( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow089( ) ;
      standaloneNotModal( ) ;
      initializeNonKey089( ) ;
      standaloneModal( ) ;
      addRow089( ) ;
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
            Z24se_matricula = A24se_matricula ;
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

   public void confirm_080( )
   {
      beforeValidate089( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls089( ) ;
         }
         else
         {
            checkExtendedTable089( ) ;
            if ( AnyError == 0 )
            {
               zm089( 2) ;
            }
            closeExtendedTableCursors089( ) ;
         }
      }
      if ( AnyError == 0 )
      {
      }
   }

   public void zm089( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
      }
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -1 )
      {
         Z24se_matricula = A24se_matricula ;
         Z1pes_id = A1pes_id ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load089( )
   {
      /* Using cursor BC00085 */
      pr_default.execute(3, new Object[] {Integer.valueOf(A1pes_id), A24se_matricula});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound9 = (short)(1) ;
         zm089( -1) ;
      }
      pr_default.close(3);
      onLoadActions089( ) ;
   }

   public void onLoadActions089( )
   {
   }

   public void checkExtendedTable089( )
   {
      standaloneModal( ) ;
      /* Using cursor BC00086 */
      pr_default.execute(4, new Object[] {Integer.valueOf(A1pes_id)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem("No matching 'pessoa'.", "ForeignKeyNotFound", 1, "PES_ID");
         AnyError = (short)(1) ;
      }
      pr_default.close(4);
   }

   public void closeExtendedTableCursors089( )
   {
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void getKey089( )
   {
      /* Using cursor BC00087 */
      pr_default.execute(5, new Object[] {Integer.valueOf(A1pes_id), A24se_matricula});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound9 = (short)(1) ;
      }
      else
      {
         RcdFound9 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00088 */
      pr_default.execute(6, new Object[] {Integer.valueOf(A1pes_id), A24se_matricula});
      if ( (pr_default.getStatus(6) != 101) )
      {
         zm089( 1) ;
         RcdFound9 = (short)(1) ;
         A24se_matricula = BC00088_A24se_matricula[0] ;
         A1pes_id = BC00088_A1pes_id[0] ;
         Z1pes_id = A1pes_id ;
         Z24se_matricula = A24se_matricula ;
         sMode9 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load089( ) ;
         if ( AnyError == 1 )
         {
            RcdFound9 = (short)(0) ;
            initializeNonKey089( ) ;
         }
         Gx_mode = sMode9 ;
      }
      else
      {
         RcdFound9 = (short)(0) ;
         initializeNonKey089( ) ;
         sMode9 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode9 ;
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey089( ) ;
      if ( RcdFound9 == 0 )
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
      confirm_080( ) ;
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void checkOptimisticConcurrency089( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC00089 */
         pr_default.execute(7, new Object[] {Integer.valueOf(A1pes_id), A24se_matricula});
         if ( (pr_default.getStatus(7) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"servidor_efetivo"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(7) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"servidor_efetivo"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert089( )
   {
      beforeValidate089( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable089( ) ;
      }
      if ( AnyError == 0 )
      {
         zm089( 0) ;
         checkOptimisticConcurrency089( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm089( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert089( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000810 */
                  pr_default.execute(8, new Object[] {A24se_matricula, Integer.valueOf(A1pes_id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("servidor_efetivo");
                  if ( (pr_default.getStatus(8) == 1) )
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
            load089( ) ;
         }
         endLevel089( ) ;
      }
      closeExtendedTableCursors089( ) ;
   }

   public void update089( )
   {
      beforeValidate089( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable089( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency089( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm089( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate089( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table servidor_efetivo */
                  deferredUpdate089( ) ;
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
         endLevel089( ) ;
      }
      closeExtendedTableCursors089( ) ;
   }

   public void deferredUpdate089( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate089( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency089( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls089( ) ;
         afterConfirm089( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete089( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000811 */
               pr_default.execute(9, new Object[] {Integer.valueOf(A1pes_id), A24se_matricula});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("servidor_efetivo");
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
      sMode9 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel089( ) ;
      Gx_mode = sMode9 ;
   }

   public void onDeleteControls089( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel089( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(7);
      }
      if ( AnyError == 0 )
      {
         beforeComplete089( ) ;
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

   public void scanKeyStart089( )
   {
      /* Using cursor BC000812 */
      pr_default.execute(10, new Object[] {Integer.valueOf(A1pes_id), A24se_matricula});
      RcdFound9 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A24se_matricula = BC000812_A24se_matricula[0] ;
         A1pes_id = BC000812_A1pes_id[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext089( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound9 = (short)(0) ;
      scanKeyLoad089( ) ;
   }

   public void scanKeyLoad089( )
   {
      sMode9 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A24se_matricula = BC000812_A24se_matricula[0] ;
         A1pes_id = BC000812_A1pes_id[0] ;
      }
      Gx_mode = sMode9 ;
   }

   public void scanKeyEnd089( )
   {
      pr_default.close(10);
   }

   public void afterConfirm089( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert089( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate089( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete089( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete089( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate089( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes089( )
   {
   }

   public void send_integrity_lvl_hashes089( )
   {
   }

   public void addRow089( )
   {
      VarsToRow9( bcservidor_efetivo) ;
   }

   public void readRow089( )
   {
      RowToVars9( bcservidor_efetivo, 1) ;
   }

   public void initializeNonKey089( )
   {
   }

   public void initAll089( )
   {
      A1pes_id = 0 ;
      A24se_matricula = "" ;
      initializeNonKey089( ) ;
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

   public void VarsToRow9( com.projetopratico.Sdtservidor_efetivo obj9 )
   {
      obj9.setgxTv_Sdtservidor_efetivo_Mode( Gx_mode );
      obj9.setgxTv_Sdtservidor_efetivo_Pes_id( A1pes_id );
      obj9.setgxTv_Sdtservidor_efetivo_Se_matricula( A24se_matricula );
      obj9.setgxTv_Sdtservidor_efetivo_Pes_id_Z( Z1pes_id );
      obj9.setgxTv_Sdtservidor_efetivo_Se_matricula_Z( Z24se_matricula );
      obj9.setgxTv_Sdtservidor_efetivo_Mode( Gx_mode );
   }

   public void KeyVarsToRow9( com.projetopratico.Sdtservidor_efetivo obj9 )
   {
      obj9.setgxTv_Sdtservidor_efetivo_Pes_id( A1pes_id );
      obj9.setgxTv_Sdtservidor_efetivo_Se_matricula( A24se_matricula );
   }

   public void RowToVars9( com.projetopratico.Sdtservidor_efetivo obj9 ,
                           int forceLoad )
   {
      Gx_mode = obj9.getgxTv_Sdtservidor_efetivo_Mode() ;
      A1pes_id = obj9.getgxTv_Sdtservidor_efetivo_Pes_id() ;
      A24se_matricula = obj9.getgxTv_Sdtservidor_efetivo_Se_matricula() ;
      Z1pes_id = obj9.getgxTv_Sdtservidor_efetivo_Pes_id_Z() ;
      Z24se_matricula = obj9.getgxTv_Sdtservidor_efetivo_Se_matricula_Z() ;
      Gx_mode = obj9.getgxTv_Sdtservidor_efetivo_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A1pes_id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      A24se_matricula = (String)getParm(obj,1) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey089( ) ;
      scanKeyStart089( ) ;
      if ( RcdFound9 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000813 */
         pr_default.execute(11, new Object[] {Integer.valueOf(A1pes_id)});
         if ( (pr_default.getStatus(11) == 101) )
         {
            httpContext.GX_msglist.addItem("No matching 'pessoa'.", "ForeignKeyNotFound", 1, "PES_ID");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z1pes_id = A1pes_id ;
         Z24se_matricula = A24se_matricula ;
      }
      zm089( -1) ;
      onLoadActions089( ) ;
      addRow089( ) ;
      scanKeyEnd089( ) ;
      if ( RcdFound9 == 0 )
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
      RowToVars9( bcservidor_efetivo, 0) ;
      scanKeyStart089( ) ;
      if ( RcdFound9 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000814 */
         pr_default.execute(12, new Object[] {Integer.valueOf(A1pes_id)});
         if ( (pr_default.getStatus(12) == 101) )
         {
            httpContext.GX_msglist.addItem("No matching 'pessoa'.", "ForeignKeyNotFound", 1, "PES_ID");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z1pes_id = A1pes_id ;
         Z24se_matricula = A24se_matricula ;
      }
      zm089( -1) ;
      onLoadActions089( ) ;
      addRow089( ) ;
      scanKeyEnd089( ) ;
      if ( RcdFound9 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      getKey089( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert089( ) ;
      }
      else
      {
         if ( RcdFound9 == 1 )
         {
            if ( ( A1pes_id != Z1pes_id ) || ( GXutil.strcmp(A24se_matricula, Z24se_matricula) != 0 ) )
            {
               A1pes_id = Z1pes_id ;
               A24se_matricula = Z24se_matricula ;
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
               update089( ) ;
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
               if ( ( A1pes_id != Z1pes_id ) || ( GXutil.strcmp(A24se_matricula, Z24se_matricula) != 0 ) )
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
                     insert089( ) ;
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
                     insert089( ) ;
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
      RowToVars9( bcservidor_efetivo, 1) ;
      saveImpl( ) ;
      VarsToRow9( bcservidor_efetivo) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars9( bcservidor_efetivo, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert089( ) ;
      afterTrn( ) ;
      VarsToRow9( bcservidor_efetivo) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void updateImpl( )
   {
      if ( isUpd( ) )
      {
         saveImpl( ) ;
         VarsToRow9( bcservidor_efetivo) ;
      }
      else
      {
         com.projetopratico.Sdtservidor_efetivo auxBC = new com.projetopratico.Sdtservidor_efetivo( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A1pes_id, A24se_matricula);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcservidor_efetivo);
            auxBC.Save();
            bcservidor_efetivo.copy(auxBC);
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
      RowToVars9( bcservidor_efetivo, 1) ;
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
      RowToVars9( bcservidor_efetivo, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert089( ) ;
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
            VarsToRow9( bcservidor_efetivo) ;
         }
      }
      else
      {
         afterTrn( ) ;
         VarsToRow9( bcservidor_efetivo) ;
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
      RowToVars9( bcservidor_efetivo, 0) ;
      getKey089( ) ;
      if ( RcdFound9 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A1pes_id != Z1pes_id ) || ( GXutil.strcmp(A24se_matricula, Z24se_matricula) != 0 ) )
         {
            A1pes_id = Z1pes_id ;
            A24se_matricula = Z24se_matricula ;
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
         if ( ( A1pes_id != Z1pes_id ) || ( GXutil.strcmp(A24se_matricula, Z24se_matricula) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "servidor_efetivo_bc");
      VarsToRow9( bcservidor_efetivo) ;
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
      Gx_mode = bcservidor_efetivo.getgxTv_Sdtservidor_efetivo_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcservidor_efetivo.setgxTv_Sdtservidor_efetivo_Mode( Gx_mode );
   }

   public void SetSDT( com.projetopratico.Sdtservidor_efetivo sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcservidor_efetivo )
      {
         bcservidor_efetivo = sdt ;
         if ( GXutil.strcmp(bcservidor_efetivo.getgxTv_Sdtservidor_efetivo_Mode(), "") == 0 )
         {
            bcservidor_efetivo.setgxTv_Sdtservidor_efetivo_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow9( bcservidor_efetivo) ;
         }
         else
         {
            RowToVars9( bcservidor_efetivo, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcservidor_efetivo.getgxTv_Sdtservidor_efetivo_Mode(), "") == 0 )
         {
            bcservidor_efetivo.setgxTv_Sdtservidor_efetivo_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars9( bcservidor_efetivo, 1) ;
   }

   public void ForceCommitOnExit( )
   {
   }

   public Sdtservidor_efetivo getservidor_efetivo_BC( )
   {
      return bcservidor_efetivo ;
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
      Z24se_matricula = "" ;
      A24se_matricula = "" ;
      BC00085_A24se_matricula = new String[] {""} ;
      BC00085_A1pes_id = new int[1] ;
      BC00086_A1pes_id = new int[1] ;
      BC00087_A1pes_id = new int[1] ;
      BC00087_A24se_matricula = new String[] {""} ;
      BC00088_A24se_matricula = new String[] {""} ;
      BC00088_A1pes_id = new int[1] ;
      sMode9 = "" ;
      BC00089_A24se_matricula = new String[] {""} ;
      BC00089_A1pes_id = new int[1] ;
      BC000812_A24se_matricula = new String[] {""} ;
      BC000812_A1pes_id = new int[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC000813_A1pes_id = new int[1] ;
      BC000814_A1pes_id = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.servidor_efetivo_bc__default(),
         new Object[] {
             new Object[] {
            BC00082_A24se_matricula, BC00082_A1pes_id
            }
            , new Object[] {
            BC00083_A24se_matricula, BC00083_A1pes_id
            }
            , new Object[] {
            BC00084_A1pes_id
            }
            , new Object[] {
            BC00085_A24se_matricula, BC00085_A1pes_id
            }
            , new Object[] {
            BC00086_A1pes_id
            }
            , new Object[] {
            BC00087_A1pes_id, BC00087_A24se_matricula
            }
            , new Object[] {
            BC00088_A24se_matricula, BC00088_A1pes_id
            }
            , new Object[] {
            BC00089_A24se_matricula, BC00089_A1pes_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000812_A24se_matricula, BC000812_A1pes_id
            }
            , new Object[] {
            BC000813_A1pes_id
            }
            , new Object[] {
            BC000814_A1pes_id
            }
         }
      );
      /* Execute Start event if defined. */
      standaloneNotModal( ) ;
   }

   private short AnyError ;
   private short RcdFound9 ;
   private int trnEnded ;
   private int Z1pes_id ;
   private int A1pes_id ;
   private int GX_JID ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode9 ;
   private String Z24se_matricula ;
   private String A24se_matricula ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private String[] BC00085_A24se_matricula ;
   private int[] BC00085_A1pes_id ;
   private int[] BC00086_A1pes_id ;
   private int[] BC00087_A1pes_id ;
   private String[] BC00087_A24se_matricula ;
   private String[] BC00088_A24se_matricula ;
   private int[] BC00088_A1pes_id ;
   private String[] BC00089_A24se_matricula ;
   private int[] BC00089_A1pes_id ;
   private String[] BC000812_A24se_matricula ;
   private int[] BC000812_A1pes_id ;
   private com.projetopratico.Sdtservidor_efetivo bcservidor_efetivo ;
   private int[] BC000813_A1pes_id ;
   private int[] BC000814_A1pes_id ;
   private String[] BC00082_A24se_matricula ;
   private int[] BC00082_A1pes_id ;
   private String[] BC00083_A24se_matricula ;
   private int[] BC00083_A1pes_id ;
   private int[] BC00084_A1pes_id ;
}

final  class servidor_efetivo_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00082", "SELECT se_matricula, pes_id FROM servidor_efetivo WHERE pes_id = ? AND se_matricula = ?  FOR UPDATE OF servidor_efetivo",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00083", "SELECT se_matricula, pes_id FROM servidor_efetivo WHERE pes_id = ? AND se_matricula = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00084", "SELECT pes_id FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00085", "SELECT TM1.se_matricula, TM1.pes_id FROM servidor_efetivo TM1 WHERE TM1.pes_id = ? and TM1.se_matricula = ( ?) ORDER BY TM1.pes_id, TM1.se_matricula ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00086", "SELECT pes_id FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00087", "SELECT pes_id, se_matricula FROM servidor_efetivo WHERE pes_id = ? AND se_matricula = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00088", "SELECT se_matricula, pes_id FROM servidor_efetivo WHERE pes_id = ? AND se_matricula = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00089", "SELECT se_matricula, pes_id FROM servidor_efetivo WHERE pes_id = ? AND se_matricula = ?  FOR UPDATE OF servidor_efetivo",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000810", "SAVEPOINT gxupdate;INSERT INTO servidor_efetivo(se_matricula, pes_id) VALUES(?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("BC000811", "SAVEPOINT gxupdate;DELETE FROM servidor_efetivo  WHERE pes_id = ? AND se_matricula = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC000812", "SELECT TM1.se_matricula, TM1.pes_id FROM servidor_efetivo TM1 WHERE TM1.pes_id = ? and TM1.se_matricula = ( ?) ORDER BY TM1.pes_id, TM1.se_matricula ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000813", "SELECT pes_id FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000814", "SELECT pes_id FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 12 :
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
               stmt.setVarchar(2, (String)parms[1], 20, false);
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               return;
            case 4 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 5 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               return;
            case 6 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

