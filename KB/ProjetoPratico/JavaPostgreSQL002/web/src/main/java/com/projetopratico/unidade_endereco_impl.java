package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class unidade_endereco_impl extends GXDataArea
{
   public void initenv( )
   {
      if ( GxWebError != 0 )
      {
         return  ;
      }
   }

   public void inittrn( )
   {
      initialize_properties( ) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      gxfirstwebparm_bkp = gxfirstwebparm ;
      gxfirstwebparm = httpContext.DecryptAjaxCall( gxfirstwebparm) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      if ( GXutil.strcmp(gxfirstwebparm, "dyncall") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         dyncall( httpContext.GetNextPar( )) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_2") == 0 )
      {
         A7unid_id = (int)(GXutil.lval( httpContext.GetPar( "unid_id"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7unid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7unid_id), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A7unid_id) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A17end_id = (int)(GXutil.lval( httpContext.GetPar( "end_id"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A17end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A17end_id), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A17end_id) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxEvt") == 0 )
      {
         httpContext.setAjaxEventMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetNextPar( ) ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetNextPar( ) ;
      }
      else
      {
         if ( ! httpContext.IsValidAjaxCall( false) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = gxfirstwebparm_bkp ;
      }
      if ( toggleJsOutput )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_web_controls( ) ;
      if ( toggleJsOutput )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
      if ( ! httpContext.isSpaRequest( ) )
      {
         if ( httpContext.exposeMetadata( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 18_0_10-184260", (short)(0)) ;
         }
      }
      Form.getMeta().addItem("description", "unidade_endereco", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtunid_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("ProjetoPratico", true);
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public unidade_endereco_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public unidade_endereco_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( unidade_endereco_impl.class ));
   }

   public unidade_endereco_impl( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void webExecute( )
   {
      initenv( ) ;
      inittrn( ) ;
      if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
      {
         MasterPageObj= createMasterPage(remoteHandle, "com.projetopratico.general.ui.masterunanimosidebar");
         MasterPageObj.setDataArea(this,false);
         validateSpaRequest();
         MasterPageObj.webExecute();
         if ( ( GxWebError == 0 ) && httpContext.isAjaxRequest( ) )
         {
            httpContext.enableOutput();
            if ( ! httpContext.isAjaxRequest( ) )
            {
               httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
            }
            if ( ! httpContext.willRedirect( ) )
            {
               addString( httpContext.getJSONResponse( )) ;
            }
            else
            {
               if ( httpContext.isAjaxRequest( ) )
               {
                  httpContext.disableOutput();
               }
               renderHtmlHeaders( ) ;
               httpContext.redirect( httpContext.wjLoc );
               httpContext.dispatchAjaxCommands();
            }
         }
      }
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
   }

   public void fix_multi_value_controls( )
   {
   }

   public void draw( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! com.projetopratico.GxWebStd.gx_redirect( httpContext) )
      {
         disable_std_buttons( ) ;
         enableDisable( ) ;
         set_caption( ) ;
         /* Form start */
         drawControls( ) ;
         fix_multi_value_controls( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void drawControls( )
   {
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "start", "top", " "+"data-gx-base-lib=\"none\""+" "+"data-abstract-form"+" ", "", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "Table", "start", "top", "", "", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, divTitlecontainer_Internalname, 1, 0, "px", 0, "px", "title-container", "start", "top", "", "", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
      /* Text block */
      com.projetopratico.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "unidade_endereco", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "heading-01", 0, "", 1, 1, 0, (short)(0), "HLP_unidade_endereco.htm");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
      ClassString = "ErrorViewer" ;
      StyleString = "" ;
      com.projetopratico.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, divFormcontainer_Internalname, 1, 0, "px", 0, "px", "form-container", "start", "top", "", "", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, divToolbarcell_Internalname, 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3 form__toolbar-cell", "start", "top", "", "", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "start", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "btn-group", "start", "top", "", "", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "Button button-auxiliary ico__arrow-first" ;
      StyleString = "" ;
      com.projetopratico.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_unidade_endereco.htm");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "Button button-auxiliary ico__arrow-prev" ;
      StyleString = "" ;
      com.projetopratico.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_unidade_endereco.htm");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "Button button-auxiliary ico__arrow-next" ;
      StyleString = "" ;
      com.projetopratico.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_unidade_endereco.htm");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "Button button-auxiliary ico__arrow-last" ;
      StyleString = "" ;
      com.projetopratico.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_unidade_endereco.htm");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "Button button-secondary" ;
      StyleString = "" ;
      com.projetopratico.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Select", bttBtn_select_Jsonclick, 5, "Select", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_unidade_endereco.htm");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__cell-advanced", "start", "top", "", "", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtunid_id_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.projetopratico.GxWebStd.gx_label_element( httpContext, edtunid_id_Internalname, "unid_id", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      com.projetopratico.GxWebStd.gx_single_line_edit( httpContext, edtunid_id_Internalname, GXutil.ltrim( localUtil.ntoc( A7unid_id, (byte)(8), (byte)(0), ".", "")), GXutil.ltrim( ((edtunid_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7unid_id), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7unid_id), "ZZZZZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtunid_id_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtunid_id_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_unidade_endereco.htm");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__cell", "start", "top", "", "", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtend_id_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.projetopratico.GxWebStd.gx_label_element( httpContext, edtend_id_Internalname, "end_id", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      com.projetopratico.GxWebStd.gx_single_line_edit( httpContext, edtend_id_Internalname, GXutil.ltrim( localUtil.ntoc( A17end_id, (byte)(8), (byte)(0), ".", "")), GXutil.ltrim( ((edtend_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A17end_id), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A17end_id), "ZZZZZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtend_id_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtend_id_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_unidade_endereco.htm");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__actions--fixed", "end", "Middle", "", "", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group", "start", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      ClassString = "Button button-primary" ;
      StyleString = "" ;
      com.projetopratico.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirm", bttBtn_enter_Jsonclick, 5, "Confirm", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_unidade_endereco.htm");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "Button button-tertiary" ;
      StyleString = "" ;
      com.projetopratico.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancel", bttBtn_cancel_Jsonclick, 1, "Cancel", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_unidade_endereco.htm");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      ClassString = "Button button-tertiary" ;
      StyleString = "" ;
      com.projetopratico.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Delete", bttBtn_delete_Jsonclick, 5, "Delete", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_unidade_endereco.htm");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "end", "Middle", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
   }

   public void userMain( )
   {
      standaloneStartup( ) ;
   }

   public void userMainFullajax( )
   {
      initenv( ) ;
      inittrn( ) ;
      userMain( ) ;
      draw( ) ;
      sendCloseFormHiddens( ) ;
   }

   public void standaloneStartup( )
   {
      standaloneStartupServer( ) ;
      disable_std_buttons( ) ;
      enableDisable( ) ;
      process( ) ;
   }

   public void standaloneStartupServer( )
   {
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Z7unid_id = (int)(localUtil.ctol( httpContext.cgiGet( "Z7unid_id"), ".", ",")) ;
         Z17end_id = (int)(localUtil.ctol( httpContext.cgiGet( "Z17end_id"), ".", ",")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtunid_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtunid_id_Internalname), ".", ",") > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "UNID_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtunid_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7unid_id = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A7unid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7unid_id), 8, 0));
         }
         else
         {
            A7unid_id = (int)(localUtil.ctol( httpContext.cgiGet( edtunid_id_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7unid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7unid_id), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtend_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtend_id_Internalname), ".", ",") > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "END_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtend_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A17end_id = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A17end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A17end_id), 8, 0));
         }
         else
         {
            A17end_id = (int)(localUtil.ctol( httpContext.cgiGet( edtend_id_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A17end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A17end_id), 8, 0));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         standaloneNotModal( ) ;
      }
      else
      {
         standaloneNotModal( ) ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") == 0 )
         {
            Gx_mode = "DSP" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            A7unid_id = (int)(GXutil.lval( httpContext.GetPar( "unid_id"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7unid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7unid_id), 8, 0));
            A17end_id = (int)(GXutil.lval( httpContext.GetPar( "end_id"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A17end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A17end_id), 8, 0));
            getEqualNoModal( ) ;
            Gx_mode = "DSP" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            disable_std_buttons_dsp( ) ;
            standaloneModal( ) ;
         }
         else
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            standaloneModal( ) ;
         }
      }
   }

   public void process( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read Transaction buttons. */
         sEvt = httpContext.cgiGet( "_EventName") ;
         EvtGridId = httpContext.cgiGet( "_EventGridId") ;
         EvtRowId = httpContext.cgiGet( "_EventRowId") ;
         if ( GXutil.len( sEvt) > 0 )
         {
            sEvtType = GXutil.left( sEvt, 1) ;
            sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
            if ( GXutil.strcmp(sEvtType, "M") != 0 )
            {
               if ( GXutil.strcmp(sEvtType, "E") == 0 )
               {
                  sEvtType = GXutil.right( sEvt, 1) ;
                  if ( GXutil.strcmp(sEvtType, ".") == 0 )
                  {
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                     if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_enter( ) ;
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_first( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "PREVIOUS") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_previous( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_next( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_last( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "SELECT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_select( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "DELETE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_delete( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        afterkeyloadscreen( ) ;
                     }
                  }
                  else
                  {
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
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
            /* Clear variables for new insertion. */
            initAll0A8( ) ;
            standaloneNotModal( ) ;
            standaloneModal( ) ;
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

   public void disable_std_buttons( )
   {
      if ( isIns( ) )
      {
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
   }

   public void disable_std_buttons_dsp( )
   {
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      bttBtn_first_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_first_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_first_Visible), 5, 0), true);
      bttBtn_previous_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_previous_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_previous_Visible), 5, 0), true);
      bttBtn_next_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_next_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_next_Visible), 5, 0), true);
      bttBtn_last_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_last_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_last_Visible), 5, 0), true);
      bttBtn_select_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_select_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_select_Visible), 5, 0), true);
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      if ( isDsp( ) )
      {
         bttBtn_enter_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Visible), 5, 0), true);
      }
      disableAttributes0A8( ) ;
   }

   public void set_caption( )
   {
      if ( ( IsConfirmed == 1 ) && ( AnyError == 0 ) )
      {
         if ( isDlt( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_confdelete"), 0, "", true);
         }
         else
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_mustconfirm"), 0, "", true);
         }
      }
   }

   public void resetCaption0A0( )
   {
   }

   public void zm0A8( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
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
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_delete_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtn_enter_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_enter_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      }
   }

   public void load0A8( )
   {
      /* Using cursor T000A6 */
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
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T000A4 */
      pr_default.execute(2, new Object[] {Integer.valueOf(A7unid_id)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("No matching 'unidade'.", "ForeignKeyNotFound", 1, "UNID_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtunid_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      /* Using cursor T000A5 */
      pr_default.execute(3, new Object[] {Integer.valueOf(A17end_id)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem("No matching 'endereco'.", "ForeignKeyNotFound", 1, "END_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtend_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
   }

   public void closeExtendedTableCursors0A8( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( int A7unid_id )
   {
      /* Using cursor T000A7 */
      pr_default.execute(5, new Object[] {Integer.valueOf(A7unid_id)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem("No matching 'unidade'.", "ForeignKeyNotFound", 1, "UNID_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtunid_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      com.projetopratico.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void gxload_3( int A17end_id )
   {
      /* Using cursor T000A8 */
      pr_default.execute(6, new Object[] {Integer.valueOf(A17end_id)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem("No matching 'endereco'.", "ForeignKeyNotFound", 1, "END_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtend_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      com.projetopratico.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey0A8( )
   {
      /* Using cursor T000A9 */
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
      /* Using cursor T000A3 */
      pr_default.execute(1, new Object[] {Integer.valueOf(A7unid_id), Integer.valueOf(A17end_id)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0A8( 1) ;
         RcdFound8 = (short)(1) ;
         A7unid_id = T000A3_A7unid_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7unid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7unid_id), 8, 0));
         A17end_id = T000A3_A17end_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A17end_id), 8, 0));
         Z7unid_id = A7unid_id ;
         Z17end_id = A17end_id ;
         sMode8 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0A8( ) ;
         if ( AnyError == 1 )
         {
            RcdFound8 = (short)(0) ;
            initializeNonKey0A8( ) ;
         }
         Gx_mode = sMode8 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound8 = (short)(0) ;
         initializeNonKey0A8( ) ;
         sMode8 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode8 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0A8( ) ;
      if ( RcdFound8 == 0 )
      {
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound8 = (short)(0) ;
      /* Using cursor T000A10 */
      pr_default.execute(8, new Object[] {Integer.valueOf(A7unid_id), Integer.valueOf(A7unid_id), Integer.valueOf(A17end_id)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T000A10_A7unid_id[0] < A7unid_id ) || ( T000A10_A7unid_id[0] == A7unid_id ) && ( T000A10_A17end_id[0] < A17end_id ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T000A10_A7unid_id[0] > A7unid_id ) || ( T000A10_A7unid_id[0] == A7unid_id ) && ( T000A10_A17end_id[0] > A17end_id ) ) )
         {
            A7unid_id = T000A10_A7unid_id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7unid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7unid_id), 8, 0));
            A17end_id = T000A10_A17end_id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A17end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A17end_id), 8, 0));
            RcdFound8 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound8 = (short)(0) ;
      /* Using cursor T000A11 */
      pr_default.execute(9, new Object[] {Integer.valueOf(A7unid_id), Integer.valueOf(A7unid_id), Integer.valueOf(A17end_id)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T000A11_A7unid_id[0] > A7unid_id ) || ( T000A11_A7unid_id[0] == A7unid_id ) && ( T000A11_A17end_id[0] > A17end_id ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T000A11_A7unid_id[0] < A7unid_id ) || ( T000A11_A7unid_id[0] == A7unid_id ) && ( T000A11_A17end_id[0] < A17end_id ) ) )
         {
            A7unid_id = T000A11_A7unid_id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7unid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7unid_id), 8, 0));
            A17end_id = T000A11_A17end_id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A17end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A17end_id), 8, 0));
            RcdFound8 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0A8( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtunid_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0A8( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound8 == 1 )
         {
            if ( ( A7unid_id != Z7unid_id ) || ( A17end_id != Z17end_id ) )
            {
               A7unid_id = Z7unid_id ;
               httpContext.ajax_rsp_assign_attri("", false, "A7unid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7unid_id), 8, 0));
               A17end_id = Z17end_id ;
               httpContext.ajax_rsp_assign_attri("", false, "A17end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A17end_id), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "UNID_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtunid_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtunid_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update0A8( ) ;
               GX_FocusControl = edtunid_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( A7unid_id != Z7unid_id ) || ( A17end_id != Z17end_id ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtunid_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0A8( ) ;
               if ( AnyError == 1 )
               {
                  GX_FocusControl = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "UNID_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtunid_id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtunid_id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0A8( ) ;
                  if ( AnyError == 1 )
                  {
                     GX_FocusControl = "" ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
      }
      afterTrn( ) ;
   }

   public void btn_delete( )
   {
      if ( ( A7unid_id != Z7unid_id ) || ( A17end_id != Z17end_id ) )
      {
         A7unid_id = Z7unid_id ;
         httpContext.ajax_rsp_assign_attri("", false, "A7unid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7unid_id), 8, 0));
         A17end_id = Z17end_id ;
         httpContext.ajax_rsp_assign_attri("", false, "A17end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A17end_id), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "UNID_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtunid_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtunid_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         getByPrimaryKey( ) ;
      }
      CloseOpenCursors();
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      if ( RcdFound8 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "UNID_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtunid_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart0A8( ) ;
      if ( RcdFound8 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd0A8( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      move_previous( ) ;
      if ( RcdFound8 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_next( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      move_next( ) ;
      if ( RcdFound8 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart0A8( ) ;
      if ( RcdFound8 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound8 != 0 )
         {
            scanNext0A8( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd0A8( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0A8( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T000A2 */
         pr_default.execute(0, new Object[] {Integer.valueOf(A7unid_id), Integer.valueOf(A17end_id)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"unidade_endereco"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) )
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
                  /* Using cursor T000A12 */
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
                        resetCaption0A0( ) ;
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
                        resetCaption0A0( ) ;
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
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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
               /* Using cursor T000A13 */
               pr_default.execute(11, new Object[] {Integer.valueOf(A7unid_id), Integer.valueOf(A17end_id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("unidade_endereco");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound8 == 0 )
                     {
                        initAll0A8( ) ;
                        Gx_mode = "INS" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     else
                     {
                        getByPrimaryKey( ) ;
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucdeleted") ;
                     endTrnMsgCod = "SuccessfullyDeleted" ;
                     resetCaption0A0( ) ;
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
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0A8( ) ;
      Gx_mode = sMode8 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0A8( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "unidade_endereco");
         if ( AnyError == 0 )
         {
            confirmValues0A0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "unidade_endereco");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0A8( )
   {
      /* Using cursor T000A14 */
      pr_default.execute(12);
      RcdFound8 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound8 = (short)(1) ;
         A7unid_id = T000A14_A7unid_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7unid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7unid_id), 8, 0));
         A17end_id = T000A14_A17end_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A17end_id), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0A8( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound8 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound8 = (short)(1) ;
         A7unid_id = T000A14_A7unid_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7unid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7unid_id), 8, 0));
         A17end_id = T000A14_A17end_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A17end_id), 8, 0));
      }
   }

   public void scanEnd0A8( )
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
      edtunid_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtunid_id_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtunid_id_Enabled), 5, 0), true);
      edtend_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtend_id_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtend_id_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes0A8( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0A0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      com.projetopratico.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( Form.getCaption()) ;
      httpContext.writeTextNL( "</title>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      MasterPageObj.master_styles();
      httpContext.CloseStyles();
      if ( ( ( httpContext.getBrowserType( ) == 1 ) || ( httpContext.getBrowserType( ) == 5 ) ) && ( GXutil.strcmp(httpContext.getBrowserVersion( ), "7.0") == 0 ) )
      {
         httpContext.AddJavascriptSource("json2.js", "?"+httpContext.getBuildNumber( 1023100), false, true);
      }
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 1023100), false, true);
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 1023100), false, true);
      httpContext.AddJavascriptSource("gxcfg.js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
      httpContext.writeText( "<body ") ;
      if ( GXutil.strcmp(httpContext.getLanguageProperty( "rtl"), "true") == 0 )
      {
         httpContext.writeText( " dir=\"rtl\" ") ;
      }
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      bodyStyle += "-moz-opacity:0;opacity:0;" ;
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle += " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.projetopratico.unidade_endereco", new String[] {}, new String[] {}) +"\">") ;
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<div style=\"height:0;overflow:hidden\"><input type=\"submit\" title=\"submit\"  disabled></div>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "Z7unid_id", GXutil.ltrim( localUtil.ntoc( Z7unid_id, (byte)(8), (byte)(0), ".", "")));
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "Z17end_id", GXutil.ltrim( localUtil.ntoc( Z17end_id, (byte)(8), (byte)(0), ".", "")));
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ".", "")));
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ".", "")));
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", GX_FocusControl);
      httpContext.SendAjaxEncryptionKey();
      sendSecurityToken(sPrefix);
      httpContext.SendComponentObjects();
      httpContext.SendServerCommands();
      httpContext.SendState();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      httpContext.writeTextNL( "</form>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      include_jscripts( ) ;
   }

   public byte executeStartEvent( )
   {
      standaloneStartup( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      return gxajaxcallmode ;
   }

   public void renderHtmlContent( )
   {
      httpContext.writeText( "<div") ;
      com.projetopratico.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
      httpContext.writeText( ">") ;
      draw( ) ;
      httpContext.writeText( "</div>") ;
   }

   public void dispatchEvents( )
   {
      process( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("com.projetopratico.unidade_endereco", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "unidade_endereco" ;
   }

   public String getPgmdesc( )
   {
      return "unidade_endereco" ;
   }

   public void initializeNonKey0A8( )
   {
   }

   public void initAll0A8( )
   {
      A7unid_id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7unid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7unid_id), 8, 0));
      A17end_id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A17end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A17end_id), 8, 0));
      initializeNonKey0A8( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2025491825735", true, true);
         idxLst = (int)(idxLst+1) ;
      }
      if ( ! outputEnabled )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.eng.js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
      httpContext.AddJavascriptSource("unidade_endereco.js", "?2025491825735", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTitle_Internalname = "TITLE" ;
      divTitlecontainer_Internalname = "TITLECONTAINER" ;
      bttBtn_first_Internalname = "BTN_FIRST" ;
      bttBtn_previous_Internalname = "BTN_PREVIOUS" ;
      bttBtn_next_Internalname = "BTN_NEXT" ;
      bttBtn_last_Internalname = "BTN_LAST" ;
      bttBtn_select_Internalname = "BTN_SELECT" ;
      divToolbarcell_Internalname = "TOOLBARCELL" ;
      edtunid_id_Internalname = "UNID_ID" ;
      edtend_id_Internalname = "END_ID" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      httpContext.setDefaultTheme("ProjetoPratico", true);
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "unidade_endereco" );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtend_id_Jsonclick = "" ;
      edtend_id_Enabled = 1 ;
      edtunid_id_Jsonclick = "" ;
      edtunid_id_Enabled = 1 ;
      bttBtn_select_Visible = 1 ;
      bttBtn_last_Visible = 1 ;
      bttBtn_next_Visible = 1 ;
      bttBtn_previous_Visible = 1 ;
      bttBtn_first_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T000A15 */
      pr_default.execute(13, new Object[] {Integer.valueOf(A7unid_id)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem("No matching 'unidade'.", "ForeignKeyNotFound", 1, "UNID_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtunid_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(13);
      /* Using cursor T000A16 */
      pr_default.execute(14, new Object[] {Integer.valueOf(A17end_id)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem("No matching 'endereco'.", "ForeignKeyNotFound", 1, "END_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtend_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(14);
      if ( AnyError == 0 )
      {
         GX_FocusControl = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
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

   public void valid_Unid_id( )
   {
      /* Using cursor T000A15 */
      pr_default.execute(13, new Object[] {Integer.valueOf(A7unid_id)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem("No matching 'unidade'.", "ForeignKeyNotFound", 1, "UNID_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtunid_id_Internalname ;
      }
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_End_id( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T000A16 */
      pr_default.execute(14, new Object[] {Integer.valueOf(A17end_id)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem("No matching 'endereco'.", "ForeignKeyNotFound", 1, "END_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtend_id_Internalname ;
      }
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "Z7unid_id", GXutil.ltrim( localUtil.ntoc( Z7unid_id, (byte)(8), (byte)(0), ".", "")));
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "Z17end_id", GXutil.ltrim( localUtil.ntoc( Z17end_id, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_UNID_ID","{handler:'valid_Unid_id',iparms:[{av:'A7unid_id',fld:'UNID_ID',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_UNID_ID",",oparms:[]}");
      setEventMetadata("VALID_END_ID","{handler:'valid_End_id',iparms:[{av:'A7unid_id',fld:'UNID_ID',pic:'ZZZZZZZ9'},{av:'A17end_id',fld:'END_ID',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_END_ID",",oparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z7unid_id'},{av:'Z17end_id'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      super.cleanup();
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
      pr_default.close(13);
      pr_default.close(14);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      lblTitle_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtn_first_Jsonclick = "" ;
      bttBtn_previous_Jsonclick = "" ;
      bttBtn_next_Jsonclick = "" ;
      bttBtn_last_Jsonclick = "" ;
      bttBtn_select_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gx_mode = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      T000A6_A7unid_id = new int[1] ;
      T000A6_A17end_id = new int[1] ;
      T000A4_A7unid_id = new int[1] ;
      T000A5_A17end_id = new int[1] ;
      T000A7_A7unid_id = new int[1] ;
      T000A8_A17end_id = new int[1] ;
      T000A9_A7unid_id = new int[1] ;
      T000A9_A17end_id = new int[1] ;
      T000A3_A7unid_id = new int[1] ;
      T000A3_A17end_id = new int[1] ;
      sMode8 = "" ;
      T000A10_A7unid_id = new int[1] ;
      T000A10_A17end_id = new int[1] ;
      T000A11_A7unid_id = new int[1] ;
      T000A11_A17end_id = new int[1] ;
      T000A2_A7unid_id = new int[1] ;
      T000A2_A17end_id = new int[1] ;
      T000A14_A7unid_id = new int[1] ;
      T000A14_A17end_id = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T000A15_A7unid_id = new int[1] ;
      T000A16_A17end_id = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.unidade_endereco__default(),
         new Object[] {
             new Object[] {
            T000A2_A7unid_id, T000A2_A17end_id
            }
            , new Object[] {
            T000A3_A7unid_id, T000A3_A17end_id
            }
            , new Object[] {
            T000A4_A7unid_id
            }
            , new Object[] {
            T000A5_A17end_id
            }
            , new Object[] {
            T000A6_A7unid_id, T000A6_A17end_id
            }
            , new Object[] {
            T000A7_A7unid_id
            }
            , new Object[] {
            T000A8_A17end_id
            }
            , new Object[] {
            T000A9_A7unid_id, T000A9_A17end_id
            }
            , new Object[] {
            T000A10_A7unid_id, T000A10_A17end_id
            }
            , new Object[] {
            T000A11_A7unid_id, T000A11_A17end_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000A14_A7unid_id, T000A14_A17end_id
            }
            , new Object[] {
            T000A15_A7unid_id
            }
            , new Object[] {
            T000A16_A17end_id
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short AnyError ;
   private short IsModified ;
   private short IsConfirmed ;
   private short RcdFound8 ;
   private int Z7unid_id ;
   private int Z17end_id ;
   private int A7unid_id ;
   private int A17end_id ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtunid_id_Enabled ;
   private int edtend_id_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ7unid_id ;
   private int ZZ17end_id ;
   private String sPrefix ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtunid_id_Internalname ;
   private String divMaintable_Internalname ;
   private String divTitlecontainer_Internalname ;
   private String lblTitle_Internalname ;
   private String lblTitle_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divFormcontainer_Internalname ;
   private String divToolbarcell_Internalname ;
   private String TempTags ;
   private String bttBtn_first_Internalname ;
   private String bttBtn_first_Jsonclick ;
   private String bttBtn_previous_Internalname ;
   private String bttBtn_previous_Jsonclick ;
   private String bttBtn_next_Internalname ;
   private String bttBtn_next_Jsonclick ;
   private String bttBtn_last_Internalname ;
   private String bttBtn_last_Jsonclick ;
   private String bttBtn_select_Internalname ;
   private String bttBtn_select_Jsonclick ;
   private String edtunid_id_Jsonclick ;
   private String edtend_id_Internalname ;
   private String edtend_id_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String Gx_mode ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode8 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private com.genexus.webpanels.GXWebForm Form ;
   private IDataStoreProvider pr_default ;
   private int[] T000A6_A7unid_id ;
   private int[] T000A6_A17end_id ;
   private int[] T000A4_A7unid_id ;
   private int[] T000A5_A17end_id ;
   private int[] T000A7_A7unid_id ;
   private int[] T000A8_A17end_id ;
   private int[] T000A9_A7unid_id ;
   private int[] T000A9_A17end_id ;
   private int[] T000A3_A7unid_id ;
   private int[] T000A3_A17end_id ;
   private int[] T000A10_A7unid_id ;
   private int[] T000A10_A17end_id ;
   private int[] T000A11_A7unid_id ;
   private int[] T000A11_A17end_id ;
   private int[] T000A2_A7unid_id ;
   private int[] T000A2_A17end_id ;
   private int[] T000A14_A7unid_id ;
   private int[] T000A14_A17end_id ;
   private int[] T000A15_A7unid_id ;
   private int[] T000A16_A17end_id ;
}

final  class unidade_endereco__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000A2", "SELECT unid_id, end_id FROM unidade_endereco WHERE unid_id = ? AND end_id = ?  FOR UPDATE OF unidade_endereco NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000A3", "SELECT unid_id, end_id FROM unidade_endereco WHERE unid_id = ? AND end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000A4", "SELECT unid_id FROM unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000A5", "SELECT end_id FROM endereco WHERE end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000A6", "SELECT TM1.unid_id, TM1.end_id FROM unidade_endereco TM1 WHERE TM1.unid_id = ? and TM1.end_id = ? ORDER BY TM1.unid_id, TM1.end_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000A7", "SELECT unid_id FROM unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000A8", "SELECT end_id FROM endereco WHERE end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000A9", "SELECT unid_id, end_id FROM unidade_endereco WHERE unid_id = ? AND end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000A10", "SELECT unid_id, end_id FROM unidade_endereco WHERE ( unid_id > ? or unid_id = ? and end_id > ?) ORDER BY unid_id, end_id  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000A11", "SELECT unid_id, end_id FROM unidade_endereco WHERE ( unid_id < ? or unid_id = ? and end_id < ?) ORDER BY unid_id DESC, end_id DESC  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T000A12", "SAVEPOINT gxupdate;INSERT INTO unidade_endereco(unid_id, end_id) VALUES(?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000A13", "SAVEPOINT gxupdate;DELETE FROM unidade_endereco  WHERE unid_id = ? AND end_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("T000A14", "SELECT unid_id, end_id FROM unidade_endereco ORDER BY unid_id, end_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000A15", "SELECT unid_id FROM unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000A16", "SELECT end_id FROM endereco WHERE end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
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

