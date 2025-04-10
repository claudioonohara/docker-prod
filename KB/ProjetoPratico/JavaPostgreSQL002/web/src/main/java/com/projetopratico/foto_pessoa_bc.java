package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class foto_pessoa_bc extends GXWebProcedure implements IGxSilentTrn
{
   public foto_pessoa_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public foto_pessoa_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( foto_pessoa_bc.class ));
   }

   public foto_pessoa_bc( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow033( ) ;
      standaloneNotModal( ) ;
      initializeNonKey033( ) ;
      standaloneModal( ) ;
      addRow033( ) ;
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
            Z10fp_id = A10fp_id ;
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

   public void confirm_030( )
   {
      beforeValidate033( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls033( ) ;
         }
         else
         {
            checkExtendedTable033( ) ;
            if ( AnyError == 0 )
            {
               zm033( 4) ;
            }
            closeExtendedTableCursors033( ) ;
         }
      }
      if ( AnyError == 0 )
      {
      }
   }

   public void zm033( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         Z11fp_data = A11fp_data ;
         Z12fp_bucket = A12fp_bucket ;
         Z13fp_hash = A13fp_hash ;
         Z1pes_id = A1pes_id ;
      }
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -3 )
      {
         Z10fp_id = A10fp_id ;
         Z11fp_data = A11fp_data ;
         Z12fp_bucket = A12fp_bucket ;
         Z13fp_hash = A13fp_hash ;
         Z31fp_foto = A31fp_foto ;
         Z40000fp_foto_GXI = A40000fp_foto_GXI ;
         Z1pes_id = A1pes_id ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load033( )
   {
      /* Using cursor BC00035 */
      pr_default.execute(3, new Object[] {Integer.valueOf(A10fp_id)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A11fp_data = BC00035_A11fp_data[0] ;
         A12fp_bucket = BC00035_A12fp_bucket[0] ;
         A13fp_hash = BC00035_A13fp_hash[0] ;
         A31fp_foto = BC00035_A31fp_foto[0] ;
         A40000fp_foto_GXI = BC00035_A40000fp_foto_GXI[0] ;
         A1pes_id = BC00035_A1pes_id[0] ;
         zm033( -3) ;
      }
      pr_default.close(3);
      onLoadActions033( ) ;
   }

   public void onLoadActions033( )
   {
   }

   public void checkExtendedTable033( )
   {
      standaloneModal( ) ;
      /* Using cursor BC00036 */
      pr_default.execute(4, new Object[] {Integer.valueOf(A1pes_id)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem("No matching 'pessoa'.", "ForeignKeyNotFound", 1, "PES_ID");
         AnyError = (short)(1) ;
      }
      pr_default.close(4);
   }

   public void closeExtendedTableCursors033( )
   {
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void getKey033( )
   {
      /* Using cursor BC00037 */
      pr_default.execute(5, new Object[] {Integer.valueOf(A10fp_id)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound3 = (short)(1) ;
      }
      else
      {
         RcdFound3 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00038 */
      pr_default.execute(6, new Object[] {Integer.valueOf(A10fp_id)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         zm033( 3) ;
         RcdFound3 = (short)(1) ;
         A10fp_id = BC00038_A10fp_id[0] ;
         A11fp_data = BC00038_A11fp_data[0] ;
         A12fp_bucket = BC00038_A12fp_bucket[0] ;
         A13fp_hash = BC00038_A13fp_hash[0] ;
         A31fp_foto = BC00038_A31fp_foto[0] ;
         A40000fp_foto_GXI = BC00038_A40000fp_foto_GXI[0] ;
         A1pes_id = BC00038_A1pes_id[0] ;
         Z10fp_id = A10fp_id ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load033( ) ;
         if ( AnyError == 1 )
         {
            RcdFound3 = (short)(0) ;
            initializeNonKey033( ) ;
         }
         Gx_mode = sMode3 ;
      }
      else
      {
         RcdFound3 = (short)(0) ;
         initializeNonKey033( ) ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode3 ;
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey033( ) ;
      if ( RcdFound3 == 0 )
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
      confirm_030( ) ;
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void checkOptimisticConcurrency033( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC00039 */
         pr_default.execute(7, new Object[] {Integer.valueOf(A10fp_id)});
         if ( (pr_default.getStatus(7) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"foto_pessoa"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(7) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z11fp_data), GXutil.resetTime(BC00039_A11fp_data[0])) ) || ( GXutil.strcmp(Z12fp_bucket, BC00039_A12fp_bucket[0]) != 0 ) || ( GXutil.strcmp(Z13fp_hash, BC00039_A13fp_hash[0]) != 0 ) || ( Z1pes_id != BC00039_A1pes_id[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"foto_pessoa"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert033( )
   {
      beforeValidate033( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable033( ) ;
      }
      if ( AnyError == 0 )
      {
         zm033( 0) ;
         checkOptimisticConcurrency033( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm033( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert033( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000310 */
                  pr_default.execute(8, new Object[] {A11fp_data, A12fp_bucket, A13fp_hash, A31fp_foto, A40000fp_foto_GXI, Integer.valueOf(A1pes_id)});
                  /* Retrieving last key number assigned */
                  /* Using cursor BC000311 */
                  pr_default.execute(9);
                  A10fp_id = BC000311_A10fp_id[0] ;
                  pr_default.close(9);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("foto_pessoa");
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
            load033( ) ;
         }
         endLevel033( ) ;
      }
      closeExtendedTableCursors033( ) ;
   }

   public void update033( )
   {
      beforeValidate033( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable033( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency033( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm033( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate033( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000312 */
                  pr_default.execute(10, new Object[] {A11fp_data, A12fp_bucket, A13fp_hash, Integer.valueOf(A1pes_id), Integer.valueOf(A10fp_id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("foto_pessoa");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"foto_pessoa"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate033( ) ;
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
         endLevel033( ) ;
      }
      closeExtendedTableCursors033( ) ;
   }

   public void deferredUpdate033( )
   {
      if ( AnyError == 0 )
      {
         /* Using cursor BC000313 */
         pr_default.execute(11, new Object[] {A31fp_foto, A40000fp_foto_GXI, Integer.valueOf(A10fp_id)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("foto_pessoa");
      }
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate033( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency033( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls033( ) ;
         afterConfirm033( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete033( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000314 */
               pr_default.execute(12, new Object[] {Integer.valueOf(A10fp_id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("foto_pessoa");
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
      sMode3 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel033( ) ;
      Gx_mode = sMode3 ;
   }

   public void onDeleteControls033( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel033( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(7);
      }
      if ( AnyError == 0 )
      {
         beforeComplete033( ) ;
      }
      if ( AnyError == 0 )
      {
         /* After transaction rules */
         if ( isIns( )  )
         {
            new com.projetopratico.pextractbucketname(remoteHandle, context).execute( A10fp_id) ;
         }
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

   public void scanKeyStart033( )
   {
      /* Using cursor BC000315 */
      pr_default.execute(13, new Object[] {Integer.valueOf(A10fp_id)});
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A10fp_id = BC000315_A10fp_id[0] ;
         A11fp_data = BC000315_A11fp_data[0] ;
         A12fp_bucket = BC000315_A12fp_bucket[0] ;
         A13fp_hash = BC000315_A13fp_hash[0] ;
         A31fp_foto = BC000315_A31fp_foto[0] ;
         A40000fp_foto_GXI = BC000315_A40000fp_foto_GXI[0] ;
         A1pes_id = BC000315_A1pes_id[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext033( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound3 = (short)(0) ;
      scanKeyLoad033( ) ;
   }

   public void scanKeyLoad033( )
   {
      sMode3 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A10fp_id = BC000315_A10fp_id[0] ;
         A11fp_data = BC000315_A11fp_data[0] ;
         A12fp_bucket = BC000315_A12fp_bucket[0] ;
         A13fp_hash = BC000315_A13fp_hash[0] ;
         A31fp_foto = BC000315_A31fp_foto[0] ;
         A40000fp_foto_GXI = BC000315_A40000fp_foto_GXI[0] ;
         A1pes_id = BC000315_A1pes_id[0] ;
      }
      Gx_mode = sMode3 ;
   }

   public void scanKeyEnd033( )
   {
      pr_default.close(13);
   }

   public void afterConfirm033( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert033( )
   {
      /* Before Insert Rules */
      if ( isIns( )  )
      {
         A11fp_data = GXutil.resetTime(GXutil.now( )) ;
      }
   }

   public void beforeUpdate033( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete033( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete033( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate033( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes033( )
   {
   }

   public void send_integrity_lvl_hashes033( )
   {
   }

   public void addRow033( )
   {
      VarsToRow3( bcfoto_pessoa) ;
   }

   public void readRow033( )
   {
      RowToVars3( bcfoto_pessoa, 1) ;
   }

   public void initializeNonKey033( )
   {
      A11fp_data = GXutil.nullDate() ;
      A1pes_id = 0 ;
      A12fp_bucket = "" ;
      A13fp_hash = "" ;
      A31fp_foto = "" ;
      A40000fp_foto_GXI = "" ;
      Z11fp_data = GXutil.nullDate() ;
      Z12fp_bucket = "" ;
      Z13fp_hash = "" ;
      Z1pes_id = 0 ;
   }

   public void initAll033( )
   {
      A10fp_id = 0 ;
      initializeNonKey033( ) ;
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

   public void VarsToRow3( com.projetopratico.Sdtfoto_pessoa obj3 )
   {
      obj3.setgxTv_Sdtfoto_pessoa_Mode( Gx_mode );
      obj3.setgxTv_Sdtfoto_pessoa_Fp_data( A11fp_data );
      obj3.setgxTv_Sdtfoto_pessoa_Pes_id( A1pes_id );
      obj3.setgxTv_Sdtfoto_pessoa_Fp_bucket( A12fp_bucket );
      obj3.setgxTv_Sdtfoto_pessoa_Fp_hash( A13fp_hash );
      obj3.setgxTv_Sdtfoto_pessoa_Fp_foto( A31fp_foto );
      obj3.setgxTv_Sdtfoto_pessoa_Fp_foto_gxi( A40000fp_foto_GXI );
      obj3.setgxTv_Sdtfoto_pessoa_Fp_id( A10fp_id );
      obj3.setgxTv_Sdtfoto_pessoa_Fp_id_Z( Z10fp_id );
      obj3.setgxTv_Sdtfoto_pessoa_Pes_id_Z( Z1pes_id );
      obj3.setgxTv_Sdtfoto_pessoa_Fp_data_Z( Z11fp_data );
      obj3.setgxTv_Sdtfoto_pessoa_Fp_bucket_Z( Z12fp_bucket );
      obj3.setgxTv_Sdtfoto_pessoa_Fp_hash_Z( Z13fp_hash );
      obj3.setgxTv_Sdtfoto_pessoa_Fp_foto_gxi_Z( Z40000fp_foto_GXI );
      obj3.setgxTv_Sdtfoto_pessoa_Mode( Gx_mode );
   }

   public void KeyVarsToRow3( com.projetopratico.Sdtfoto_pessoa obj3 )
   {
      obj3.setgxTv_Sdtfoto_pessoa_Fp_id( A10fp_id );
   }

   public void RowToVars3( com.projetopratico.Sdtfoto_pessoa obj3 ,
                           int forceLoad )
   {
      Gx_mode = obj3.getgxTv_Sdtfoto_pessoa_Mode() ;
      A11fp_data = obj3.getgxTv_Sdtfoto_pessoa_Fp_data() ;
      A1pes_id = obj3.getgxTv_Sdtfoto_pessoa_Pes_id() ;
      A12fp_bucket = obj3.getgxTv_Sdtfoto_pessoa_Fp_bucket() ;
      A13fp_hash = obj3.getgxTv_Sdtfoto_pessoa_Fp_hash() ;
      A31fp_foto = obj3.getgxTv_Sdtfoto_pessoa_Fp_foto() ;
      A40000fp_foto_GXI = obj3.getgxTv_Sdtfoto_pessoa_Fp_foto_gxi() ;
      A10fp_id = obj3.getgxTv_Sdtfoto_pessoa_Fp_id() ;
      Z10fp_id = obj3.getgxTv_Sdtfoto_pessoa_Fp_id_Z() ;
      Z1pes_id = obj3.getgxTv_Sdtfoto_pessoa_Pes_id_Z() ;
      Z11fp_data = obj3.getgxTv_Sdtfoto_pessoa_Fp_data_Z() ;
      Z12fp_bucket = obj3.getgxTv_Sdtfoto_pessoa_Fp_bucket_Z() ;
      Z13fp_hash = obj3.getgxTv_Sdtfoto_pessoa_Fp_hash_Z() ;
      Z40000fp_foto_GXI = obj3.getgxTv_Sdtfoto_pessoa_Fp_foto_gxi_Z() ;
      Gx_mode = obj3.getgxTv_Sdtfoto_pessoa_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A10fp_id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey033( ) ;
      scanKeyStart033( ) ;
      if ( RcdFound3 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z10fp_id = A10fp_id ;
      }
      zm033( -3) ;
      onLoadActions033( ) ;
      addRow033( ) ;
      scanKeyEnd033( ) ;
      if ( RcdFound3 == 0 )
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
      RowToVars3( bcfoto_pessoa, 0) ;
      scanKeyStart033( ) ;
      if ( RcdFound3 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z10fp_id = A10fp_id ;
      }
      zm033( -3) ;
      onLoadActions033( ) ;
      addRow033( ) ;
      scanKeyEnd033( ) ;
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      getKey033( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert033( ) ;
      }
      else
      {
         if ( RcdFound3 == 1 )
         {
            if ( A10fp_id != Z10fp_id )
            {
               A10fp_id = Z10fp_id ;
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
               update033( ) ;
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
               if ( A10fp_id != Z10fp_id )
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
                     insert033( ) ;
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
                     insert033( ) ;
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
      RowToVars3( bcfoto_pessoa, 1) ;
      saveImpl( ) ;
      VarsToRow3( bcfoto_pessoa) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars3( bcfoto_pessoa, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert033( ) ;
      afterTrn( ) ;
      VarsToRow3( bcfoto_pessoa) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void updateImpl( )
   {
      if ( isUpd( ) )
      {
         saveImpl( ) ;
         VarsToRow3( bcfoto_pessoa) ;
      }
      else
      {
         com.projetopratico.Sdtfoto_pessoa auxBC = new com.projetopratico.Sdtfoto_pessoa( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A10fp_id);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcfoto_pessoa);
            auxBC.Save();
            bcfoto_pessoa.copy(auxBC);
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
      RowToVars3( bcfoto_pessoa, 1) ;
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
      RowToVars3( bcfoto_pessoa, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert033( ) ;
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
            VarsToRow3( bcfoto_pessoa) ;
         }
      }
      else
      {
         afterTrn( ) ;
         VarsToRow3( bcfoto_pessoa) ;
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
      RowToVars3( bcfoto_pessoa, 0) ;
      getKey033( ) ;
      if ( RcdFound3 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( A10fp_id != Z10fp_id )
         {
            A10fp_id = Z10fp_id ;
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
         if ( A10fp_id != Z10fp_id )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "foto_pessoa_bc");
      VarsToRow3( bcfoto_pessoa) ;
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
      Gx_mode = bcfoto_pessoa.getgxTv_Sdtfoto_pessoa_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcfoto_pessoa.setgxTv_Sdtfoto_pessoa_Mode( Gx_mode );
   }

   public void SetSDT( com.projetopratico.Sdtfoto_pessoa sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcfoto_pessoa )
      {
         bcfoto_pessoa = sdt ;
         if ( GXutil.strcmp(bcfoto_pessoa.getgxTv_Sdtfoto_pessoa_Mode(), "") == 0 )
         {
            bcfoto_pessoa.setgxTv_Sdtfoto_pessoa_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow3( bcfoto_pessoa) ;
         }
         else
         {
            RowToVars3( bcfoto_pessoa, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcfoto_pessoa.getgxTv_Sdtfoto_pessoa_Mode(), "") == 0 )
         {
            bcfoto_pessoa.setgxTv_Sdtfoto_pessoa_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars3( bcfoto_pessoa, 1) ;
   }

   public void ForceCommitOnExit( )
   {
   }

   public Sdtfoto_pessoa getfoto_pessoa_BC( )
   {
      return bcfoto_pessoa ;
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
      Z11fp_data = GXutil.nullDate() ;
      A11fp_data = GXutil.nullDate() ;
      Z12fp_bucket = "" ;
      A12fp_bucket = "" ;
      Z13fp_hash = "" ;
      A13fp_hash = "" ;
      Z31fp_foto = "" ;
      A31fp_foto = "" ;
      Z40000fp_foto_GXI = "" ;
      A40000fp_foto_GXI = "" ;
      BC00035_A10fp_id = new int[1] ;
      BC00035_A11fp_data = new java.util.Date[] {GXutil.nullDate()} ;
      BC00035_A12fp_bucket = new String[] {""} ;
      BC00035_A13fp_hash = new String[] {""} ;
      BC00035_A31fp_foto = new String[] {""} ;
      BC00035_A40000fp_foto_GXI = new String[] {""} ;
      BC00035_A1pes_id = new int[1] ;
      BC00036_A1pes_id = new int[1] ;
      BC00037_A10fp_id = new int[1] ;
      BC00038_A10fp_id = new int[1] ;
      BC00038_A11fp_data = new java.util.Date[] {GXutil.nullDate()} ;
      BC00038_A12fp_bucket = new String[] {""} ;
      BC00038_A13fp_hash = new String[] {""} ;
      BC00038_A31fp_foto = new String[] {""} ;
      BC00038_A40000fp_foto_GXI = new String[] {""} ;
      BC00038_A1pes_id = new int[1] ;
      sMode3 = "" ;
      BC00039_A10fp_id = new int[1] ;
      BC00039_A11fp_data = new java.util.Date[] {GXutil.nullDate()} ;
      BC00039_A12fp_bucket = new String[] {""} ;
      BC00039_A13fp_hash = new String[] {""} ;
      BC00039_A31fp_foto = new String[] {""} ;
      BC00039_A40000fp_foto_GXI = new String[] {""} ;
      BC00039_A1pes_id = new int[1] ;
      BC000311_A10fp_id = new int[1] ;
      BC000315_A10fp_id = new int[1] ;
      BC000315_A11fp_data = new java.util.Date[] {GXutil.nullDate()} ;
      BC000315_A12fp_bucket = new String[] {""} ;
      BC000315_A13fp_hash = new String[] {""} ;
      BC000315_A31fp_foto = new String[] {""} ;
      BC000315_A40000fp_foto_GXI = new String[] {""} ;
      BC000315_A1pes_id = new int[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.foto_pessoa_bc__default(),
         new Object[] {
             new Object[] {
            BC00032_A10fp_id, BC00032_A11fp_data, BC00032_A12fp_bucket, BC00032_A13fp_hash, BC00032_A31fp_foto, BC00032_A40000fp_foto_GXI, BC00032_A1pes_id
            }
            , new Object[] {
            BC00033_A10fp_id, BC00033_A11fp_data, BC00033_A12fp_bucket, BC00033_A13fp_hash, BC00033_A31fp_foto, BC00033_A40000fp_foto_GXI, BC00033_A1pes_id
            }
            , new Object[] {
            BC00034_A1pes_id
            }
            , new Object[] {
            BC00035_A10fp_id, BC00035_A11fp_data, BC00035_A12fp_bucket, BC00035_A13fp_hash, BC00035_A31fp_foto, BC00035_A40000fp_foto_GXI, BC00035_A1pes_id
            }
            , new Object[] {
            BC00036_A1pes_id
            }
            , new Object[] {
            BC00037_A10fp_id
            }
            , new Object[] {
            BC00038_A10fp_id, BC00038_A11fp_data, BC00038_A12fp_bucket, BC00038_A13fp_hash, BC00038_A31fp_foto, BC00038_A40000fp_foto_GXI, BC00038_A1pes_id
            }
            , new Object[] {
            BC00039_A10fp_id, BC00039_A11fp_data, BC00039_A12fp_bucket, BC00039_A13fp_hash, BC00039_A31fp_foto, BC00039_A40000fp_foto_GXI, BC00039_A1pes_id
            }
            , new Object[] {
            }
            , new Object[] {
            BC000311_A10fp_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000315_A10fp_id, BC000315_A11fp_data, BC000315_A12fp_bucket, BC000315_A13fp_hash, BC000315_A31fp_foto, BC000315_A40000fp_foto_GXI, BC000315_A1pes_id
            }
         }
      );
      /* Execute Start event if defined. */
      standaloneNotModal( ) ;
   }

   private short AnyError ;
   private short RcdFound3 ;
   private int trnEnded ;
   private int Z10fp_id ;
   private int A10fp_id ;
   private int GX_JID ;
   private int Z1pes_id ;
   private int A1pes_id ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode3 ;
   private java.util.Date Z11fp_data ;
   private java.util.Date A11fp_data ;
   private String Z12fp_bucket ;
   private String A12fp_bucket ;
   private String Z13fp_hash ;
   private String A13fp_hash ;
   private String Z40000fp_foto_GXI ;
   private String A40000fp_foto_GXI ;
   private String Z31fp_foto ;
   private String A31fp_foto ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private int[] BC00035_A10fp_id ;
   private java.util.Date[] BC00035_A11fp_data ;
   private String[] BC00035_A12fp_bucket ;
   private String[] BC00035_A13fp_hash ;
   private String[] BC00035_A31fp_foto ;
   private String[] BC00035_A40000fp_foto_GXI ;
   private int[] BC00035_A1pes_id ;
   private int[] BC00036_A1pes_id ;
   private int[] BC00037_A10fp_id ;
   private int[] BC00038_A10fp_id ;
   private java.util.Date[] BC00038_A11fp_data ;
   private String[] BC00038_A12fp_bucket ;
   private String[] BC00038_A13fp_hash ;
   private String[] BC00038_A31fp_foto ;
   private String[] BC00038_A40000fp_foto_GXI ;
   private int[] BC00038_A1pes_id ;
   private int[] BC00039_A10fp_id ;
   private java.util.Date[] BC00039_A11fp_data ;
   private String[] BC00039_A12fp_bucket ;
   private String[] BC00039_A13fp_hash ;
   private String[] BC00039_A31fp_foto ;
   private String[] BC00039_A40000fp_foto_GXI ;
   private int[] BC00039_A1pes_id ;
   private int[] BC000311_A10fp_id ;
   private int[] BC000315_A10fp_id ;
   private java.util.Date[] BC000315_A11fp_data ;
   private String[] BC000315_A12fp_bucket ;
   private String[] BC000315_A13fp_hash ;
   private String[] BC000315_A31fp_foto ;
   private String[] BC000315_A40000fp_foto_GXI ;
   private int[] BC000315_A1pes_id ;
   private com.projetopratico.Sdtfoto_pessoa bcfoto_pessoa ;
   private int[] BC00032_A10fp_id ;
   private java.util.Date[] BC00032_A11fp_data ;
   private String[] BC00032_A12fp_bucket ;
   private String[] BC00032_A13fp_hash ;
   private String[] BC00032_A31fp_foto ;
   private String[] BC00032_A40000fp_foto_GXI ;
   private int[] BC00032_A1pes_id ;
   private int[] BC00033_A10fp_id ;
   private java.util.Date[] BC00033_A11fp_data ;
   private String[] BC00033_A12fp_bucket ;
   private String[] BC00033_A13fp_hash ;
   private String[] BC00033_A31fp_foto ;
   private String[] BC00033_A40000fp_foto_GXI ;
   private int[] BC00033_A1pes_id ;
   private int[] BC00034_A1pes_id ;
}

final  class foto_pessoa_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00032", "SELECT fp_id, fp_data, fp_bucket, fp_hash, fp_foto, fp_foto_GXI, pes_id FROM foto_pessoa WHERE fp_id = ?  FOR UPDATE OF foto_pessoa",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00033", "SELECT fp_id, fp_data, fp_bucket, fp_hash, fp_foto, fp_foto_GXI, pes_id FROM foto_pessoa WHERE fp_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00034", "SELECT pes_id FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00035", "SELECT TM1.fp_id, TM1.fp_data, TM1.fp_bucket, TM1.fp_hash, TM1.fp_foto, TM1.fp_foto_GXI, TM1.pes_id FROM foto_pessoa TM1 WHERE TM1.fp_id = ? ORDER BY TM1.fp_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00036", "SELECT pes_id FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00037", "SELECT fp_id FROM foto_pessoa WHERE fp_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00038", "SELECT fp_id, fp_data, fp_bucket, fp_hash, fp_foto, fp_foto_GXI, pes_id FROM foto_pessoa WHERE fp_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00039", "SELECT fp_id, fp_data, fp_bucket, fp_hash, fp_foto, fp_foto_GXI, pes_id FROM foto_pessoa WHERE fp_id = ?  FOR UPDATE OF foto_pessoa",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000310", "SAVEPOINT gxupdate;INSERT INTO foto_pessoa(fp_data, fp_bucket, fp_hash, fp_foto, fp_foto_GXI, pes_id) VALUES(?, ?, ?, ?, ?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC000311", "SELECT currval('fp_id') ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000312", "SAVEPOINT gxupdate;UPDATE foto_pessoa SET fp_data=?, fp_bucket=?, fp_hash=?, pes_id=?  WHERE fp_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("BC000313", "SAVEPOINT gxupdate;UPDATE foto_pessoa SET fp_foto=?, fp_foto_GXI=?  WHERE fp_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("BC000314", "SAVEPOINT gxupdate;DELETE FROM foto_pessoa  WHERE fp_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC000315", "SELECT TM1.fp_id, TM1.fp_data, TM1.fp_bucket, TM1.fp_hash, TM1.fp_foto, TM1.fp_foto_GXI, TM1.pes_id FROM foto_pessoa TM1 WHERE TM1.fp_id = ? ORDER BY TM1.fp_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getMultimediaFile(5, rslt.getVarchar(6));
               ((String[]) buf[5])[0] = rslt.getMultimediaUri(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getMultimediaFile(5, rslt.getVarchar(6));
               ((String[]) buf[5])[0] = rslt.getMultimediaUri(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getMultimediaFile(5, rslt.getVarchar(6));
               ((String[]) buf[5])[0] = rslt.getMultimediaUri(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getMultimediaFile(5, rslt.getVarchar(6));
               ((String[]) buf[5])[0] = rslt.getMultimediaUri(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getMultimediaFile(5, rslt.getVarchar(6));
               ((String[]) buf[5])[0] = rslt.getMultimediaUri(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 13 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getMultimediaFile(5, rslt.getVarchar(6));
               ((String[]) buf[5])[0] = rslt.getMultimediaUri(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
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
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               stmt.setVarchar(3, (String)parms[2], 150, false);
               stmt.setBLOBFile(4, (String)parms[3], true);
               stmt.setGXDbFileURI(5, (String)parms[4], (String)parms[3], 2048,"foto_pessoa","fp_foto");
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 10 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               stmt.setVarchar(3, (String)parms[2], 150, false);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 11 :
               stmt.setBLOBFile(1, (String)parms[0], true);
               stmt.setGXDbFileURI(2, (String)parms[1], (String)parms[0], 2048,"foto_pessoa","fp_foto");
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 13 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

