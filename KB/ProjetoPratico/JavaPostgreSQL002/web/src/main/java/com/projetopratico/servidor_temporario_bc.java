package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class servidor_temporario_bc extends GXWebProcedure implements IGxSilentTrn
{
   public servidor_temporario_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public servidor_temporario_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( servidor_temporario_bc.class ));
   }

   public servidor_temporario_bc( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow0710( ) ;
      standaloneNotModal( ) ;
      initializeNonKey0710( ) ;
      standaloneModal( ) ;
      addRow0710( ) ;
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
            Z22st_data_admissao = A22st_data_admissao ;
            Z23st_data_demissao = A23st_data_demissao ;
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

   public void confirm_070( )
   {
      beforeValidate0710( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls0710( ) ;
         }
         else
         {
            checkExtendedTable0710( ) ;
            if ( AnyError == 0 )
            {
               zm0710( 2) ;
            }
            closeExtendedTableCursors0710( ) ;
         }
      }
      if ( AnyError == 0 )
      {
      }
   }

   public void zm0710( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
      }
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -1 )
      {
         Z22st_data_admissao = A22st_data_admissao ;
         Z23st_data_demissao = A23st_data_demissao ;
         Z1pes_id = A1pes_id ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0710( )
   {
      /* Using cursor BC00075 */
      pr_default.execute(3, new Object[] {Integer.valueOf(A1pes_id), A22st_data_admissao, A23st_data_demissao});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound10 = (short)(1) ;
         zm0710( -1) ;
      }
      pr_default.close(3);
      onLoadActions0710( ) ;
   }

   public void onLoadActions0710( )
   {
   }

   public void checkExtendedTable0710( )
   {
      standaloneModal( ) ;
      /* Using cursor BC00076 */
      pr_default.execute(4, new Object[] {Integer.valueOf(A1pes_id)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem("No matching 'pessoa'.", "ForeignKeyNotFound", 1, "PES_ID");
         AnyError = (short)(1) ;
      }
      pr_default.close(4);
   }

   public void closeExtendedTableCursors0710( )
   {
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void getKey0710( )
   {
      /* Using cursor BC00077 */
      pr_default.execute(5, new Object[] {Integer.valueOf(A1pes_id), A22st_data_admissao, A23st_data_demissao});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound10 = (short)(1) ;
      }
      else
      {
         RcdFound10 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00078 */
      pr_default.execute(6, new Object[] {Integer.valueOf(A1pes_id), A22st_data_admissao, A23st_data_demissao});
      if ( (pr_default.getStatus(6) != 101) )
      {
         zm0710( 1) ;
         RcdFound10 = (short)(1) ;
         A22st_data_admissao = BC00078_A22st_data_admissao[0] ;
         A23st_data_demissao = BC00078_A23st_data_demissao[0] ;
         A1pes_id = BC00078_A1pes_id[0] ;
         Z1pes_id = A1pes_id ;
         Z22st_data_admissao = A22st_data_admissao ;
         Z23st_data_demissao = A23st_data_demissao ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0710( ) ;
         if ( AnyError == 1 )
         {
            RcdFound10 = (short)(0) ;
            initializeNonKey0710( ) ;
         }
         Gx_mode = sMode10 ;
      }
      else
      {
         RcdFound10 = (short)(0) ;
         initializeNonKey0710( ) ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode10 ;
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey0710( ) ;
      if ( RcdFound10 == 0 )
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
      confirm_070( ) ;
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void checkOptimisticConcurrency0710( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC00079 */
         pr_default.execute(7, new Object[] {Integer.valueOf(A1pes_id), A22st_data_admissao, A23st_data_demissao});
         if ( (pr_default.getStatus(7) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"servidor_temporario"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(7) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"servidor_temporario"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0710( )
   {
      beforeValidate0710( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0710( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0710( 0) ;
         checkOptimisticConcurrency0710( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0710( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0710( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000710 */
                  pr_default.execute(8, new Object[] {A22st_data_admissao, A23st_data_demissao, Integer.valueOf(A1pes_id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("servidor_temporario");
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
            load0710( ) ;
         }
         endLevel0710( ) ;
      }
      closeExtendedTableCursors0710( ) ;
   }

   public void update0710( )
   {
      beforeValidate0710( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0710( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0710( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0710( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0710( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table servidor_temporario */
                  deferredUpdate0710( ) ;
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
         endLevel0710( ) ;
      }
      closeExtendedTableCursors0710( ) ;
   }

   public void deferredUpdate0710( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0710( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0710( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0710( ) ;
         afterConfirm0710( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0710( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000711 */
               pr_default.execute(9, new Object[] {Integer.valueOf(A1pes_id), A22st_data_admissao, A23st_data_demissao});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("servidor_temporario");
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
      sMode10 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0710( ) ;
      Gx_mode = sMode10 ;
   }

   public void onDeleteControls0710( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel0710( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(7);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0710( ) ;
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

   public void scanKeyStart0710( )
   {
      /* Using cursor BC000712 */
      pr_default.execute(10, new Object[] {Integer.valueOf(A1pes_id), A22st_data_admissao, A23st_data_demissao});
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A22st_data_admissao = BC000712_A22st_data_admissao[0] ;
         A23st_data_demissao = BC000712_A23st_data_demissao[0] ;
         A1pes_id = BC000712_A1pes_id[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0710( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound10 = (short)(0) ;
      scanKeyLoad0710( ) ;
   }

   public void scanKeyLoad0710( )
   {
      sMode10 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A22st_data_admissao = BC000712_A22st_data_admissao[0] ;
         A23st_data_demissao = BC000712_A23st_data_demissao[0] ;
         A1pes_id = BC000712_A1pes_id[0] ;
      }
      Gx_mode = sMode10 ;
   }

   public void scanKeyEnd0710( )
   {
      pr_default.close(10);
   }

   public void afterConfirm0710( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0710( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0710( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0710( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0710( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0710( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0710( )
   {
   }

   public void send_integrity_lvl_hashes0710( )
   {
   }

   public void addRow0710( )
   {
      VarsToRow10( bcservidor_temporario) ;
   }

   public void readRow0710( )
   {
      RowToVars10( bcservidor_temporario, 1) ;
   }

   public void initializeNonKey0710( )
   {
   }

   public void initAll0710( )
   {
      A1pes_id = 0 ;
      A22st_data_admissao = GXutil.nullDate() ;
      A23st_data_demissao = GXutil.nullDate() ;
      initializeNonKey0710( ) ;
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

   public void VarsToRow10( com.projetopratico.Sdtservidor_temporario obj10 )
   {
      obj10.setgxTv_Sdtservidor_temporario_Mode( Gx_mode );
      obj10.setgxTv_Sdtservidor_temporario_Pes_id( A1pes_id );
      obj10.setgxTv_Sdtservidor_temporario_St_data_admissao( A22st_data_admissao );
      obj10.setgxTv_Sdtservidor_temporario_St_data_demissao( A23st_data_demissao );
      obj10.setgxTv_Sdtservidor_temporario_Pes_id_Z( Z1pes_id );
      obj10.setgxTv_Sdtservidor_temporario_St_data_admissao_Z( Z22st_data_admissao );
      obj10.setgxTv_Sdtservidor_temporario_St_data_demissao_Z( Z23st_data_demissao );
      obj10.setgxTv_Sdtservidor_temporario_Mode( Gx_mode );
   }

   public void KeyVarsToRow10( com.projetopratico.Sdtservidor_temporario obj10 )
   {
      obj10.setgxTv_Sdtservidor_temporario_Pes_id( A1pes_id );
      obj10.setgxTv_Sdtservidor_temporario_St_data_admissao( A22st_data_admissao );
      obj10.setgxTv_Sdtservidor_temporario_St_data_demissao( A23st_data_demissao );
   }

   public void RowToVars10( com.projetopratico.Sdtservidor_temporario obj10 ,
                            int forceLoad )
   {
      Gx_mode = obj10.getgxTv_Sdtservidor_temporario_Mode() ;
      A1pes_id = obj10.getgxTv_Sdtservidor_temporario_Pes_id() ;
      A22st_data_admissao = obj10.getgxTv_Sdtservidor_temporario_St_data_admissao() ;
      A23st_data_demissao = obj10.getgxTv_Sdtservidor_temporario_St_data_demissao() ;
      Z1pes_id = obj10.getgxTv_Sdtservidor_temporario_Pes_id_Z() ;
      Z22st_data_admissao = obj10.getgxTv_Sdtservidor_temporario_St_data_admissao_Z() ;
      Z23st_data_demissao = obj10.getgxTv_Sdtservidor_temporario_St_data_demissao_Z() ;
      Gx_mode = obj10.getgxTv_Sdtservidor_temporario_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A1pes_id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      A22st_data_admissao = (java.util.Date)getParm(obj,1) ;
      A23st_data_demissao = (java.util.Date)getParm(obj,2) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0710( ) ;
      scanKeyStart0710( ) ;
      if ( RcdFound10 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000713 */
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
         Z22st_data_admissao = A22st_data_admissao ;
         Z23st_data_demissao = A23st_data_demissao ;
      }
      zm0710( -1) ;
      onLoadActions0710( ) ;
      addRow0710( ) ;
      scanKeyEnd0710( ) ;
      if ( RcdFound10 == 0 )
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
      RowToVars10( bcservidor_temporario, 0) ;
      scanKeyStart0710( ) ;
      if ( RcdFound10 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000714 */
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
         Z22st_data_admissao = A22st_data_admissao ;
         Z23st_data_demissao = A23st_data_demissao ;
      }
      zm0710( -1) ;
      onLoadActions0710( ) ;
      addRow0710( ) ;
      scanKeyEnd0710( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      getKey0710( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert0710( ) ;
      }
      else
      {
         if ( RcdFound10 == 1 )
         {
            if ( ( A1pes_id != Z1pes_id ) || !( GXutil.dateCompare(GXutil.resetTime(A22st_data_admissao), GXutil.resetTime(Z22st_data_admissao)) ) || !( GXutil.dateCompare(GXutil.resetTime(A23st_data_demissao), GXutil.resetTime(Z23st_data_demissao)) ) )
            {
               A1pes_id = Z1pes_id ;
               A22st_data_admissao = Z22st_data_admissao ;
               A23st_data_demissao = Z23st_data_demissao ;
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
               update0710( ) ;
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
               if ( ( A1pes_id != Z1pes_id ) || !( GXutil.dateCompare(GXutil.resetTime(A22st_data_admissao), GXutil.resetTime(Z22st_data_admissao)) ) || !( GXutil.dateCompare(GXutil.resetTime(A23st_data_demissao), GXutil.resetTime(Z23st_data_demissao)) ) )
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
                     insert0710( ) ;
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
                     insert0710( ) ;
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
      RowToVars10( bcservidor_temporario, 1) ;
      saveImpl( ) ;
      VarsToRow10( bcservidor_temporario) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars10( bcservidor_temporario, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert0710( ) ;
      afterTrn( ) ;
      VarsToRow10( bcservidor_temporario) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void updateImpl( )
   {
      if ( isUpd( ) )
      {
         saveImpl( ) ;
         VarsToRow10( bcservidor_temporario) ;
      }
      else
      {
         com.projetopratico.Sdtservidor_temporario auxBC = new com.projetopratico.Sdtservidor_temporario( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A1pes_id, A22st_data_admissao, A23st_data_demissao);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcservidor_temporario);
            auxBC.Save();
            bcservidor_temporario.copy(auxBC);
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
      RowToVars10( bcservidor_temporario, 1) ;
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
      RowToVars10( bcservidor_temporario, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert0710( ) ;
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
            VarsToRow10( bcservidor_temporario) ;
         }
      }
      else
      {
         afterTrn( ) ;
         VarsToRow10( bcservidor_temporario) ;
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
      RowToVars10( bcservidor_temporario, 0) ;
      getKey0710( ) ;
      if ( RcdFound10 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A1pes_id != Z1pes_id ) || !( GXutil.dateCompare(GXutil.resetTime(A22st_data_admissao), GXutil.resetTime(Z22st_data_admissao)) ) || !( GXutil.dateCompare(GXutil.resetTime(A23st_data_demissao), GXutil.resetTime(Z23st_data_demissao)) ) )
         {
            A1pes_id = Z1pes_id ;
            A22st_data_admissao = Z22st_data_admissao ;
            A23st_data_demissao = Z23st_data_demissao ;
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
         if ( ( A1pes_id != Z1pes_id ) || !( GXutil.dateCompare(GXutil.resetTime(A22st_data_admissao), GXutil.resetTime(Z22st_data_admissao)) ) || !( GXutil.dateCompare(GXutil.resetTime(A23st_data_demissao), GXutil.resetTime(Z23st_data_demissao)) ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "servidor_temporario_bc");
      VarsToRow10( bcservidor_temporario) ;
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
      Gx_mode = bcservidor_temporario.getgxTv_Sdtservidor_temporario_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcservidor_temporario.setgxTv_Sdtservidor_temporario_Mode( Gx_mode );
   }

   public void SetSDT( com.projetopratico.Sdtservidor_temporario sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcservidor_temporario )
      {
         bcservidor_temporario = sdt ;
         if ( GXutil.strcmp(bcservidor_temporario.getgxTv_Sdtservidor_temporario_Mode(), "") == 0 )
         {
            bcservidor_temporario.setgxTv_Sdtservidor_temporario_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow10( bcservidor_temporario) ;
         }
         else
         {
            RowToVars10( bcservidor_temporario, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcservidor_temporario.getgxTv_Sdtservidor_temporario_Mode(), "") == 0 )
         {
            bcservidor_temporario.setgxTv_Sdtservidor_temporario_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars10( bcservidor_temporario, 1) ;
   }

   public void ForceCommitOnExit( )
   {
   }

   public Sdtservidor_temporario getservidor_temporario_BC( )
   {
      return bcservidor_temporario ;
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
      Z22st_data_admissao = GXutil.nullDate() ;
      A22st_data_admissao = GXutil.nullDate() ;
      Z23st_data_demissao = GXutil.nullDate() ;
      A23st_data_demissao = GXutil.nullDate() ;
      BC00075_A22st_data_admissao = new java.util.Date[] {GXutil.nullDate()} ;
      BC00075_A23st_data_demissao = new java.util.Date[] {GXutil.nullDate()} ;
      BC00075_A1pes_id = new int[1] ;
      BC00076_A1pes_id = new int[1] ;
      BC00077_A1pes_id = new int[1] ;
      BC00077_A22st_data_admissao = new java.util.Date[] {GXutil.nullDate()} ;
      BC00077_A23st_data_demissao = new java.util.Date[] {GXutil.nullDate()} ;
      BC00078_A22st_data_admissao = new java.util.Date[] {GXutil.nullDate()} ;
      BC00078_A23st_data_demissao = new java.util.Date[] {GXutil.nullDate()} ;
      BC00078_A1pes_id = new int[1] ;
      sMode10 = "" ;
      BC00079_A22st_data_admissao = new java.util.Date[] {GXutil.nullDate()} ;
      BC00079_A23st_data_demissao = new java.util.Date[] {GXutil.nullDate()} ;
      BC00079_A1pes_id = new int[1] ;
      BC000712_A22st_data_admissao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000712_A23st_data_demissao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000712_A1pes_id = new int[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC000713_A1pes_id = new int[1] ;
      BC000714_A1pes_id = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.servidor_temporario_bc__default(),
         new Object[] {
             new Object[] {
            BC00072_A22st_data_admissao, BC00072_A23st_data_demissao, BC00072_A1pes_id
            }
            , new Object[] {
            BC00073_A22st_data_admissao, BC00073_A23st_data_demissao, BC00073_A1pes_id
            }
            , new Object[] {
            BC00074_A1pes_id
            }
            , new Object[] {
            BC00075_A22st_data_admissao, BC00075_A23st_data_demissao, BC00075_A1pes_id
            }
            , new Object[] {
            BC00076_A1pes_id
            }
            , new Object[] {
            BC00077_A1pes_id, BC00077_A22st_data_admissao, BC00077_A23st_data_demissao
            }
            , new Object[] {
            BC00078_A22st_data_admissao, BC00078_A23st_data_demissao, BC00078_A1pes_id
            }
            , new Object[] {
            BC00079_A22st_data_admissao, BC00079_A23st_data_demissao, BC00079_A1pes_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000712_A22st_data_admissao, BC000712_A23st_data_demissao, BC000712_A1pes_id
            }
            , new Object[] {
            BC000713_A1pes_id
            }
            , new Object[] {
            BC000714_A1pes_id
            }
         }
      );
      /* Execute Start event if defined. */
      standaloneNotModal( ) ;
   }

   private short AnyError ;
   private short RcdFound10 ;
   private int trnEnded ;
   private int Z1pes_id ;
   private int A1pes_id ;
   private int GX_JID ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode10 ;
   private java.util.Date Z22st_data_admissao ;
   private java.util.Date A22st_data_admissao ;
   private java.util.Date Z23st_data_demissao ;
   private java.util.Date A23st_data_demissao ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] BC00075_A22st_data_admissao ;
   private java.util.Date[] BC00075_A23st_data_demissao ;
   private int[] BC00075_A1pes_id ;
   private int[] BC00076_A1pes_id ;
   private int[] BC00077_A1pes_id ;
   private java.util.Date[] BC00077_A22st_data_admissao ;
   private java.util.Date[] BC00077_A23st_data_demissao ;
   private java.util.Date[] BC00078_A22st_data_admissao ;
   private java.util.Date[] BC00078_A23st_data_demissao ;
   private int[] BC00078_A1pes_id ;
   private java.util.Date[] BC00079_A22st_data_admissao ;
   private java.util.Date[] BC00079_A23st_data_demissao ;
   private int[] BC00079_A1pes_id ;
   private java.util.Date[] BC000712_A22st_data_admissao ;
   private java.util.Date[] BC000712_A23st_data_demissao ;
   private int[] BC000712_A1pes_id ;
   private com.projetopratico.Sdtservidor_temporario bcservidor_temporario ;
   private int[] BC000713_A1pes_id ;
   private int[] BC000714_A1pes_id ;
   private java.util.Date[] BC00072_A22st_data_admissao ;
   private java.util.Date[] BC00072_A23st_data_demissao ;
   private int[] BC00072_A1pes_id ;
   private java.util.Date[] BC00073_A22st_data_admissao ;
   private java.util.Date[] BC00073_A23st_data_demissao ;
   private int[] BC00073_A1pes_id ;
   private int[] BC00074_A1pes_id ;
}

final  class servidor_temporario_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00072", "SELECT st_data_admissao, st_data_demissao, pes_id FROM servidor_temporario WHERE pes_id = ? AND st_data_admissao = ? AND st_data_demissao = ?  FOR UPDATE OF servidor_temporario",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00073", "SELECT st_data_admissao, st_data_demissao, pes_id FROM servidor_temporario WHERE pes_id = ? AND st_data_admissao = ? AND st_data_demissao = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00074", "SELECT pes_id FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00075", "SELECT TM1.st_data_admissao, TM1.st_data_demissao, TM1.pes_id FROM servidor_temporario TM1 WHERE TM1.pes_id = ? and TM1.st_data_admissao = ? and TM1.st_data_demissao = ? ORDER BY TM1.pes_id, TM1.st_data_admissao, TM1.st_data_demissao ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00076", "SELECT pes_id FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00077", "SELECT pes_id, st_data_admissao, st_data_demissao FROM servidor_temporario WHERE pes_id = ? AND st_data_admissao = ? AND st_data_demissao = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00078", "SELECT st_data_admissao, st_data_demissao, pes_id FROM servidor_temporario WHERE pes_id = ? AND st_data_admissao = ? AND st_data_demissao = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00079", "SELECT st_data_admissao, st_data_demissao, pes_id FROM servidor_temporario WHERE pes_id = ? AND st_data_admissao = ? AND st_data_demissao = ?  FOR UPDATE OF servidor_temporario",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000710", "SAVEPOINT gxupdate;INSERT INTO servidor_temporario(st_data_admissao, st_data_demissao, pes_id) VALUES(?, ?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("BC000711", "SAVEPOINT gxupdate;DELETE FROM servidor_temporario  WHERE pes_id = ? AND st_data_admissao = ? AND st_data_demissao = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC000712", "SELECT TM1.st_data_admissao, TM1.st_data_demissao, TM1.pes_id FROM servidor_temporario TM1 WHERE TM1.pes_id = ? and TM1.st_data_admissao = ? and TM1.st_data_demissao = ? ORDER BY TM1.pes_id, TM1.st_data_admissao, TM1.st_data_demissao ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000713", "SELECT pes_id FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000714", "SELECT pes_id FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 6 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 7 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 10 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 4 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 5 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 6 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 8 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
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

