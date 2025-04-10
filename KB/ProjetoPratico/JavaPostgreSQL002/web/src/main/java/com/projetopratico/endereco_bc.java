package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class endereco_bc extends GXWebProcedure implements IGxSilentTrn
{
   public endereco_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public endereco_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( endereco_bc.class ));
   }

   public endereco_bc( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow055( ) ;
      standaloneNotModal( ) ;
      initializeNonKey055( ) ;
      standaloneModal( ) ;
      addRow055( ) ;
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

   public void confirm_050( )
   {
      beforeValidate055( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls055( ) ;
         }
         else
         {
            checkExtendedTable055( ) ;
            if ( AnyError == 0 )
            {
               zm055( 2) ;
            }
            closeExtendedTableCursors055( ) ;
         }
      }
      if ( AnyError == 0 )
      {
      }
   }

   public void zm055( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         Z18end_tipo_logradouro = A18end_tipo_logradouro ;
         Z19end_logradouro = A19end_logradouro ;
         Z20end_numero = A20end_numero ;
         Z21end_bairro = A21end_bairro ;
         Z14cid_id = A14cid_id ;
      }
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -1 )
      {
         Z17end_id = A17end_id ;
         Z18end_tipo_logradouro = A18end_tipo_logradouro ;
         Z19end_logradouro = A19end_logradouro ;
         Z20end_numero = A20end_numero ;
         Z21end_bairro = A21end_bairro ;
         Z14cid_id = A14cid_id ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load055( )
   {
      /* Using cursor BC00055 */
      pr_default.execute(3, new Object[] {Integer.valueOf(A17end_id)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A18end_tipo_logradouro = BC00055_A18end_tipo_logradouro[0] ;
         A19end_logradouro = BC00055_A19end_logradouro[0] ;
         A20end_numero = BC00055_A20end_numero[0] ;
         A21end_bairro = BC00055_A21end_bairro[0] ;
         A14cid_id = BC00055_A14cid_id[0] ;
         zm055( -1) ;
      }
      pr_default.close(3);
      onLoadActions055( ) ;
   }

   public void onLoadActions055( )
   {
   }

   public void checkExtendedTable055( )
   {
      standaloneModal( ) ;
      /* Using cursor BC00056 */
      pr_default.execute(4, new Object[] {Integer.valueOf(A14cid_id)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem("No matching 'cidade'.", "ForeignKeyNotFound", 1, "CID_ID");
         AnyError = (short)(1) ;
      }
      pr_default.close(4);
   }

   public void closeExtendedTableCursors055( )
   {
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void getKey055( )
   {
      /* Using cursor BC00057 */
      pr_default.execute(5, new Object[] {Integer.valueOf(A17end_id)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound5 = (short)(1) ;
      }
      else
      {
         RcdFound5 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00058 */
      pr_default.execute(6, new Object[] {Integer.valueOf(A17end_id)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         zm055( 1) ;
         RcdFound5 = (short)(1) ;
         A17end_id = BC00058_A17end_id[0] ;
         A18end_tipo_logradouro = BC00058_A18end_tipo_logradouro[0] ;
         A19end_logradouro = BC00058_A19end_logradouro[0] ;
         A20end_numero = BC00058_A20end_numero[0] ;
         A21end_bairro = BC00058_A21end_bairro[0] ;
         A14cid_id = BC00058_A14cid_id[0] ;
         Z17end_id = A17end_id ;
         sMode5 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load055( ) ;
         if ( AnyError == 1 )
         {
            RcdFound5 = (short)(0) ;
            initializeNonKey055( ) ;
         }
         Gx_mode = sMode5 ;
      }
      else
      {
         RcdFound5 = (short)(0) ;
         initializeNonKey055( ) ;
         sMode5 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode5 ;
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey055( ) ;
      if ( RcdFound5 == 0 )
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
      confirm_050( ) ;
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void checkOptimisticConcurrency055( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC00059 */
         pr_default.execute(7, new Object[] {Integer.valueOf(A17end_id)});
         if ( (pr_default.getStatus(7) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"endereco"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(7) == 101) || ( GXutil.strcmp(Z18end_tipo_logradouro, BC00059_A18end_tipo_logradouro[0]) != 0 ) || ( GXutil.strcmp(Z19end_logradouro, BC00059_A19end_logradouro[0]) != 0 ) || ( Z20end_numero != BC00059_A20end_numero[0] ) || ( GXutil.strcmp(Z21end_bairro, BC00059_A21end_bairro[0]) != 0 ) || ( Z14cid_id != BC00059_A14cid_id[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"endereco"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert055( )
   {
      beforeValidate055( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable055( ) ;
      }
      if ( AnyError == 0 )
      {
         zm055( 0) ;
         checkOptimisticConcurrency055( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm055( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert055( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000510 */
                  pr_default.execute(8, new Object[] {A18end_tipo_logradouro, A19end_logradouro, Integer.valueOf(A20end_numero), A21end_bairro, Integer.valueOf(A14cid_id)});
                  /* Retrieving last key number assigned */
                  /* Using cursor BC000511 */
                  pr_default.execute(9);
                  A17end_id = BC000511_A17end_id[0] ;
                  pr_default.close(9);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("endereco");
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
            load055( ) ;
         }
         endLevel055( ) ;
      }
      closeExtendedTableCursors055( ) ;
   }

   public void update055( )
   {
      beforeValidate055( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable055( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency055( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm055( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate055( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000512 */
                  pr_default.execute(10, new Object[] {A18end_tipo_logradouro, A19end_logradouro, Integer.valueOf(A20end_numero), A21end_bairro, Integer.valueOf(A14cid_id), Integer.valueOf(A17end_id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("endereco");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"endereco"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate055( ) ;
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
         endLevel055( ) ;
      }
      closeExtendedTableCursors055( ) ;
   }

   public void deferredUpdate055( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate055( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency055( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls055( ) ;
         afterConfirm055( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete055( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000513 */
               pr_default.execute(11, new Object[] {Integer.valueOf(A17end_id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("endereco");
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
      sMode5 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel055( ) ;
      Gx_mode = sMode5 ;
   }

   public void onDeleteControls055( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor BC000514 */
         pr_default.execute(12, new Object[] {Integer.valueOf(A17end_id)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"unidade_endereco"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor BC000515 */
         pr_default.execute(13, new Object[] {Integer.valueOf(A17end_id)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"pessoa_endereco"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
      }
   }

   public void endLevel055( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(7);
      }
      if ( AnyError == 0 )
      {
         beforeComplete055( ) ;
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

   public void scanKeyStart055( )
   {
      /* Using cursor BC000516 */
      pr_default.execute(14, new Object[] {Integer.valueOf(A17end_id)});
      RcdFound5 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A17end_id = BC000516_A17end_id[0] ;
         A18end_tipo_logradouro = BC000516_A18end_tipo_logradouro[0] ;
         A19end_logradouro = BC000516_A19end_logradouro[0] ;
         A20end_numero = BC000516_A20end_numero[0] ;
         A21end_bairro = BC000516_A21end_bairro[0] ;
         A14cid_id = BC000516_A14cid_id[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext055( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound5 = (short)(0) ;
      scanKeyLoad055( ) ;
   }

   public void scanKeyLoad055( )
   {
      sMode5 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A17end_id = BC000516_A17end_id[0] ;
         A18end_tipo_logradouro = BC000516_A18end_tipo_logradouro[0] ;
         A19end_logradouro = BC000516_A19end_logradouro[0] ;
         A20end_numero = BC000516_A20end_numero[0] ;
         A21end_bairro = BC000516_A21end_bairro[0] ;
         A14cid_id = BC000516_A14cid_id[0] ;
      }
      Gx_mode = sMode5 ;
   }

   public void scanKeyEnd055( )
   {
      pr_default.close(14);
   }

   public void afterConfirm055( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert055( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate055( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete055( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete055( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate055( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes055( )
   {
   }

   public void send_integrity_lvl_hashes055( )
   {
   }

   public void addRow055( )
   {
      VarsToRow5( bcendereco) ;
   }

   public void readRow055( )
   {
      RowToVars5( bcendereco, 1) ;
   }

   public void initializeNonKey055( )
   {
      A18end_tipo_logradouro = "" ;
      A19end_logradouro = "" ;
      A20end_numero = 0 ;
      A21end_bairro = "" ;
      A14cid_id = 0 ;
      Z18end_tipo_logradouro = "" ;
      Z19end_logradouro = "" ;
      Z20end_numero = 0 ;
      Z21end_bairro = "" ;
      Z14cid_id = 0 ;
   }

   public void initAll055( )
   {
      A17end_id = 0 ;
      initializeNonKey055( ) ;
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

   public void VarsToRow5( com.projetopratico.Sdtendereco obj5 )
   {
      obj5.setgxTv_Sdtendereco_Mode( Gx_mode );
      obj5.setgxTv_Sdtendereco_End_tipo_logradouro( A18end_tipo_logradouro );
      obj5.setgxTv_Sdtendereco_End_logradouro( A19end_logradouro );
      obj5.setgxTv_Sdtendereco_End_numero( A20end_numero );
      obj5.setgxTv_Sdtendereco_End_bairro( A21end_bairro );
      obj5.setgxTv_Sdtendereco_Cid_id( A14cid_id );
      obj5.setgxTv_Sdtendereco_End_id( A17end_id );
      obj5.setgxTv_Sdtendereco_End_id_Z( Z17end_id );
      obj5.setgxTv_Sdtendereco_End_tipo_logradouro_Z( Z18end_tipo_logradouro );
      obj5.setgxTv_Sdtendereco_End_logradouro_Z( Z19end_logradouro );
      obj5.setgxTv_Sdtendereco_End_numero_Z( Z20end_numero );
      obj5.setgxTv_Sdtendereco_End_bairro_Z( Z21end_bairro );
      obj5.setgxTv_Sdtendereco_Cid_id_Z( Z14cid_id );
      obj5.setgxTv_Sdtendereco_Mode( Gx_mode );
   }

   public void KeyVarsToRow5( com.projetopratico.Sdtendereco obj5 )
   {
      obj5.setgxTv_Sdtendereco_End_id( A17end_id );
   }

   public void RowToVars5( com.projetopratico.Sdtendereco obj5 ,
                           int forceLoad )
   {
      Gx_mode = obj5.getgxTv_Sdtendereco_Mode() ;
      A18end_tipo_logradouro = obj5.getgxTv_Sdtendereco_End_tipo_logradouro() ;
      A19end_logradouro = obj5.getgxTv_Sdtendereco_End_logradouro() ;
      A20end_numero = obj5.getgxTv_Sdtendereco_End_numero() ;
      A21end_bairro = obj5.getgxTv_Sdtendereco_End_bairro() ;
      A14cid_id = obj5.getgxTv_Sdtendereco_Cid_id() ;
      A17end_id = obj5.getgxTv_Sdtendereco_End_id() ;
      Z17end_id = obj5.getgxTv_Sdtendereco_End_id_Z() ;
      Z18end_tipo_logradouro = obj5.getgxTv_Sdtendereco_End_tipo_logradouro_Z() ;
      Z19end_logradouro = obj5.getgxTv_Sdtendereco_End_logradouro_Z() ;
      Z20end_numero = obj5.getgxTv_Sdtendereco_End_numero_Z() ;
      Z21end_bairro = obj5.getgxTv_Sdtendereco_End_bairro_Z() ;
      Z14cid_id = obj5.getgxTv_Sdtendereco_Cid_id_Z() ;
      Gx_mode = obj5.getgxTv_Sdtendereco_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A17end_id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey055( ) ;
      scanKeyStart055( ) ;
      if ( RcdFound5 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z17end_id = A17end_id ;
      }
      zm055( -1) ;
      onLoadActions055( ) ;
      addRow055( ) ;
      scanKeyEnd055( ) ;
      if ( RcdFound5 == 0 )
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
      RowToVars5( bcendereco, 0) ;
      scanKeyStart055( ) ;
      if ( RcdFound5 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z17end_id = A17end_id ;
      }
      zm055( -1) ;
      onLoadActions055( ) ;
      addRow055( ) ;
      scanKeyEnd055( ) ;
      if ( RcdFound5 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      getKey055( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert055( ) ;
      }
      else
      {
         if ( RcdFound5 == 1 )
         {
            if ( A17end_id != Z17end_id )
            {
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
               update055( ) ;
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
               if ( A17end_id != Z17end_id )
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
                     insert055( ) ;
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
                     insert055( ) ;
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
      RowToVars5( bcendereco, 1) ;
      saveImpl( ) ;
      VarsToRow5( bcendereco) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars5( bcendereco, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert055( ) ;
      afterTrn( ) ;
      VarsToRow5( bcendereco) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void updateImpl( )
   {
      if ( isUpd( ) )
      {
         saveImpl( ) ;
         VarsToRow5( bcendereco) ;
      }
      else
      {
         com.projetopratico.Sdtendereco auxBC = new com.projetopratico.Sdtendereco( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A17end_id);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcendereco);
            auxBC.Save();
            bcendereco.copy(auxBC);
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
      RowToVars5( bcendereco, 1) ;
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
      RowToVars5( bcendereco, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert055( ) ;
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
            VarsToRow5( bcendereco) ;
         }
      }
      else
      {
         afterTrn( ) ;
         VarsToRow5( bcendereco) ;
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
      RowToVars5( bcendereco, 0) ;
      getKey055( ) ;
      if ( RcdFound5 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( A17end_id != Z17end_id )
         {
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
         if ( A17end_id != Z17end_id )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "endereco_bc");
      VarsToRow5( bcendereco) ;
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
      Gx_mode = bcendereco.getgxTv_Sdtendereco_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcendereco.setgxTv_Sdtendereco_Mode( Gx_mode );
   }

   public void SetSDT( com.projetopratico.Sdtendereco sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcendereco )
      {
         bcendereco = sdt ;
         if ( GXutil.strcmp(bcendereco.getgxTv_Sdtendereco_Mode(), "") == 0 )
         {
            bcendereco.setgxTv_Sdtendereco_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow5( bcendereco) ;
         }
         else
         {
            RowToVars5( bcendereco, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcendereco.getgxTv_Sdtendereco_Mode(), "") == 0 )
         {
            bcendereco.setgxTv_Sdtendereco_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars5( bcendereco, 1) ;
   }

   public void ForceCommitOnExit( )
   {
   }

   public Sdtendereco getendereco_BC( )
   {
      return bcendereco ;
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
      Z18end_tipo_logradouro = "" ;
      A18end_tipo_logradouro = "" ;
      Z19end_logradouro = "" ;
      A19end_logradouro = "" ;
      Z21end_bairro = "" ;
      A21end_bairro = "" ;
      BC00055_A17end_id = new int[1] ;
      BC00055_A18end_tipo_logradouro = new String[] {""} ;
      BC00055_A19end_logradouro = new String[] {""} ;
      BC00055_A20end_numero = new int[1] ;
      BC00055_A21end_bairro = new String[] {""} ;
      BC00055_A14cid_id = new int[1] ;
      BC00056_A14cid_id = new int[1] ;
      BC00057_A17end_id = new int[1] ;
      BC00058_A17end_id = new int[1] ;
      BC00058_A18end_tipo_logradouro = new String[] {""} ;
      BC00058_A19end_logradouro = new String[] {""} ;
      BC00058_A20end_numero = new int[1] ;
      BC00058_A21end_bairro = new String[] {""} ;
      BC00058_A14cid_id = new int[1] ;
      sMode5 = "" ;
      BC00059_A17end_id = new int[1] ;
      BC00059_A18end_tipo_logradouro = new String[] {""} ;
      BC00059_A19end_logradouro = new String[] {""} ;
      BC00059_A20end_numero = new int[1] ;
      BC00059_A21end_bairro = new String[] {""} ;
      BC00059_A14cid_id = new int[1] ;
      BC000511_A17end_id = new int[1] ;
      BC000514_A7unid_id = new int[1] ;
      BC000514_A17end_id = new int[1] ;
      BC000515_A1pes_id = new int[1] ;
      BC000515_A17end_id = new int[1] ;
      BC000516_A17end_id = new int[1] ;
      BC000516_A18end_tipo_logradouro = new String[] {""} ;
      BC000516_A19end_logradouro = new String[] {""} ;
      BC000516_A20end_numero = new int[1] ;
      BC000516_A21end_bairro = new String[] {""} ;
      BC000516_A14cid_id = new int[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.endereco_bc__default(),
         new Object[] {
             new Object[] {
            BC00052_A17end_id, BC00052_A18end_tipo_logradouro, BC00052_A19end_logradouro, BC00052_A20end_numero, BC00052_A21end_bairro, BC00052_A14cid_id
            }
            , new Object[] {
            BC00053_A17end_id, BC00053_A18end_tipo_logradouro, BC00053_A19end_logradouro, BC00053_A20end_numero, BC00053_A21end_bairro, BC00053_A14cid_id
            }
            , new Object[] {
            BC00054_A14cid_id
            }
            , new Object[] {
            BC00055_A17end_id, BC00055_A18end_tipo_logradouro, BC00055_A19end_logradouro, BC00055_A20end_numero, BC00055_A21end_bairro, BC00055_A14cid_id
            }
            , new Object[] {
            BC00056_A14cid_id
            }
            , new Object[] {
            BC00057_A17end_id
            }
            , new Object[] {
            BC00058_A17end_id, BC00058_A18end_tipo_logradouro, BC00058_A19end_logradouro, BC00058_A20end_numero, BC00058_A21end_bairro, BC00058_A14cid_id
            }
            , new Object[] {
            BC00059_A17end_id, BC00059_A18end_tipo_logradouro, BC00059_A19end_logradouro, BC00059_A20end_numero, BC00059_A21end_bairro, BC00059_A14cid_id
            }
            , new Object[] {
            }
            , new Object[] {
            BC000511_A17end_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000514_A7unid_id, BC000514_A17end_id
            }
            , new Object[] {
            BC000515_A1pes_id, BC000515_A17end_id
            }
            , new Object[] {
            BC000516_A17end_id, BC000516_A18end_tipo_logradouro, BC000516_A19end_logradouro, BC000516_A20end_numero, BC000516_A21end_bairro, BC000516_A14cid_id
            }
         }
      );
      /* Execute Start event if defined. */
      standaloneNotModal( ) ;
   }

   private short AnyError ;
   private short RcdFound5 ;
   private int trnEnded ;
   private int Z17end_id ;
   private int A17end_id ;
   private int GX_JID ;
   private int Z20end_numero ;
   private int A20end_numero ;
   private int Z14cid_id ;
   private int A14cid_id ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode5 ;
   private String Z18end_tipo_logradouro ;
   private String A18end_tipo_logradouro ;
   private String Z19end_logradouro ;
   private String A19end_logradouro ;
   private String Z21end_bairro ;
   private String A21end_bairro ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private int[] BC00055_A17end_id ;
   private String[] BC00055_A18end_tipo_logradouro ;
   private String[] BC00055_A19end_logradouro ;
   private int[] BC00055_A20end_numero ;
   private String[] BC00055_A21end_bairro ;
   private int[] BC00055_A14cid_id ;
   private int[] BC00056_A14cid_id ;
   private int[] BC00057_A17end_id ;
   private int[] BC00058_A17end_id ;
   private String[] BC00058_A18end_tipo_logradouro ;
   private String[] BC00058_A19end_logradouro ;
   private int[] BC00058_A20end_numero ;
   private String[] BC00058_A21end_bairro ;
   private int[] BC00058_A14cid_id ;
   private int[] BC00059_A17end_id ;
   private String[] BC00059_A18end_tipo_logradouro ;
   private String[] BC00059_A19end_logradouro ;
   private int[] BC00059_A20end_numero ;
   private String[] BC00059_A21end_bairro ;
   private int[] BC00059_A14cid_id ;
   private int[] BC000511_A17end_id ;
   private int[] BC000514_A7unid_id ;
   private int[] BC000514_A17end_id ;
   private int[] BC000515_A1pes_id ;
   private int[] BC000515_A17end_id ;
   private int[] BC000516_A17end_id ;
   private String[] BC000516_A18end_tipo_logradouro ;
   private String[] BC000516_A19end_logradouro ;
   private int[] BC000516_A20end_numero ;
   private String[] BC000516_A21end_bairro ;
   private int[] BC000516_A14cid_id ;
   private com.projetopratico.Sdtendereco bcendereco ;
   private int[] BC00052_A17end_id ;
   private String[] BC00052_A18end_tipo_logradouro ;
   private String[] BC00052_A19end_logradouro ;
   private int[] BC00052_A20end_numero ;
   private String[] BC00052_A21end_bairro ;
   private int[] BC00052_A14cid_id ;
   private int[] BC00053_A17end_id ;
   private String[] BC00053_A18end_tipo_logradouro ;
   private String[] BC00053_A19end_logradouro ;
   private int[] BC00053_A20end_numero ;
   private String[] BC00053_A21end_bairro ;
   private int[] BC00053_A14cid_id ;
   private int[] BC00054_A14cid_id ;
}

final  class endereco_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00052", "SELECT end_id, end_tipo_logradouro, end_logradouro, end_numero, end_bairro, cid_id FROM endereco WHERE end_id = ?  FOR UPDATE OF endereco",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00053", "SELECT end_id, end_tipo_logradouro, end_logradouro, end_numero, end_bairro, cid_id FROM endereco WHERE end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00054", "SELECT cid_id FROM cidade WHERE cid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00055", "SELECT TM1.end_id, TM1.end_tipo_logradouro, TM1.end_logradouro, TM1.end_numero, TM1.end_bairro, TM1.cid_id FROM endereco TM1 WHERE TM1.end_id = ? ORDER BY TM1.end_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00056", "SELECT cid_id FROM cidade WHERE cid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00057", "SELECT end_id FROM endereco WHERE end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00058", "SELECT end_id, end_tipo_logradouro, end_logradouro, end_numero, end_bairro, cid_id FROM endereco WHERE end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00059", "SELECT end_id, end_tipo_logradouro, end_logradouro, end_numero, end_bairro, cid_id FROM endereco WHERE end_id = ?  FOR UPDATE OF endereco",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000510", "SAVEPOINT gxupdate;INSERT INTO endereco(end_tipo_logradouro, end_logradouro, end_numero, end_bairro, cid_id) VALUES(?, ?, ?, ?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC000511", "SELECT currval('end_id') ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000512", "SAVEPOINT gxupdate;UPDATE endereco SET end_tipo_logradouro=?, end_logradouro=?, end_numero=?, end_bairro=?, cid_id=?  WHERE end_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("BC000513", "SAVEPOINT gxupdate;DELETE FROM endereco  WHERE end_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC000514", "SELECT unid_id, end_id FROM unidade_endereco WHERE end_id = ?  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000515", "SELECT pes_id, end_id FROM pessoa_endereco WHERE end_id = ?  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000516", "SELECT TM1.end_id, TM1.end_tipo_logradouro, TM1.end_logradouro, TM1.end_numero, TM1.end_bairro, TM1.cid_id FROM endereco TM1 WHERE TM1.end_id = ? ORDER BY TM1.end_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 12 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 13 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 14 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
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
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 200, false);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setVarchar(4, (String)parms[3], 100, false);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 200, false);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setVarchar(4, (String)parms[3], 100, false);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
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
      }
   }

}

