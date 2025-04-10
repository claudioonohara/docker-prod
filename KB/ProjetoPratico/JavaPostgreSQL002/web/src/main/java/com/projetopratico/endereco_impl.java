package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class endereco_impl extends GXDataArea
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
         A14cid_id = (int)(GXutil.lval( httpContext.GetPar( "cid_id"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14cid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14cid_id), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A14cid_id) ;
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
      Form.getMeta().addItem("description", "endereco", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtend_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("ProjetoPratico", true);
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public endereco_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public endereco_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( endereco_impl.class ));
   }

   public endereco_impl( int remoteHandle ,
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
      com.projetopratico.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "endereco", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "heading-01", 0, "", 1, 1, 0, (short)(0), "HLP_endereco.htm");
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
      com.projetopratico.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_endereco.htm");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "Button button-auxiliary ico__arrow-prev" ;
      StyleString = "" ;
      com.projetopratico.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_endereco.htm");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "Button button-auxiliary ico__arrow-next" ;
      StyleString = "" ;
      com.projetopratico.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_endereco.htm");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "Button button-auxiliary ico__arrow-last" ;
      StyleString = "" ;
      com.projetopratico.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_endereco.htm");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "Button button-secondary" ;
      StyleString = "" ;
      com.projetopratico.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Select", bttBtn_select_Jsonclick, 5, "Select", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_endereco.htm");
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
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtend_id_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.projetopratico.GxWebStd.gx_label_element( httpContext, edtend_id_Internalname, "end_id", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      com.projetopratico.GxWebStd.gx_single_line_edit( httpContext, edtend_id_Internalname, GXutil.ltrim( localUtil.ntoc( A17end_id, (byte)(8), (byte)(0), ".", "")), GXutil.ltrim( ((edtend_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A17end_id), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A17end_id), "ZZZZZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtend_id_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtend_id_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_endereco.htm");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__cell", "start", "top", "", "", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtend_tipo_logradouro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.projetopratico.GxWebStd.gx_label_element( httpContext, edtend_tipo_logradouro_Internalname, "end_tipo_logradouro", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      com.projetopratico.GxWebStd.gx_single_line_edit( httpContext, edtend_tipo_logradouro_Internalname, A18end_tipo_logradouro, GXutil.rtrim( localUtil.format( A18end_tipo_logradouro, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtend_tipo_logradouro_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtend_tipo_logradouro_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "start", true, "", "HLP_endereco.htm");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__cell", "start", "top", "", "", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtend_logradouro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.projetopratico.GxWebStd.gx_label_element( httpContext, edtend_logradouro_Internalname, "end_logradouro", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      com.projetopratico.GxWebStd.gx_html_textarea( httpContext, edtend_logradouro_Internalname, A19end_logradouro, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", (short)(0), 1, edtend_logradouro_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "", "HLP_endereco.htm");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__cell", "start", "top", "", "", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtend_numero_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.projetopratico.GxWebStd.gx_label_element( httpContext, edtend_numero_Internalname, "end_numero", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      com.projetopratico.GxWebStd.gx_single_line_edit( httpContext, edtend_numero_Internalname, GXutil.ltrim( localUtil.ntoc( A20end_numero, (byte)(8), (byte)(0), ".", "")), GXutil.ltrim( ((edtend_numero_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A20end_numero), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A20end_numero), "ZZZZZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtend_numero_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtend_numero_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_endereco.htm");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__cell", "start", "top", "", "", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtend_bairro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.projetopratico.GxWebStd.gx_label_element( httpContext, edtend_bairro_Internalname, "end_bairro", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      com.projetopratico.GxWebStd.gx_single_line_edit( httpContext, edtend_bairro_Internalname, A21end_bairro, GXutil.rtrim( localUtil.format( A21end_bairro, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtend_bairro_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtend_bairro_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "start", true, "", "HLP_endereco.htm");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__cell", "start", "top", "", "", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtcid_id_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.projetopratico.GxWebStd.gx_label_element( httpContext, edtcid_id_Internalname, "cid_id", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      com.projetopratico.GxWebStd.gx_single_line_edit( httpContext, edtcid_id_Internalname, GXutil.ltrim( localUtil.ntoc( A14cid_id, (byte)(8), (byte)(0), ".", "")), GXutil.ltrim( ((edtcid_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14cid_id), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14cid_id), "ZZZZZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtcid_id_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtcid_id_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_endereco.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "Button button-primary" ;
      StyleString = "" ;
      com.projetopratico.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirm", bttBtn_enter_Jsonclick, 5, "Confirm", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_endereco.htm");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "Button button-tertiary" ;
      StyleString = "" ;
      com.projetopratico.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancel", bttBtn_cancel_Jsonclick, 1, "Cancel", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_endereco.htm");
      com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "Button button-tertiary" ;
      StyleString = "" ;
      com.projetopratico.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Delete", bttBtn_delete_Jsonclick, 5, "Delete", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_endereco.htm");
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
         Z17end_id = (int)(localUtil.ctol( httpContext.cgiGet( "Z17end_id"), ".", ",")) ;
         Z18end_tipo_logradouro = httpContext.cgiGet( "Z18end_tipo_logradouro") ;
         Z19end_logradouro = httpContext.cgiGet( "Z19end_logradouro") ;
         Z20end_numero = (int)(localUtil.ctol( httpContext.cgiGet( "Z20end_numero"), ".", ",")) ;
         Z21end_bairro = httpContext.cgiGet( "Z21end_bairro") ;
         Z14cid_id = (int)(localUtil.ctol( httpContext.cgiGet( "Z14cid_id"), ".", ",")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
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
         A18end_tipo_logradouro = httpContext.cgiGet( edtend_tipo_logradouro_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A18end_tipo_logradouro", A18end_tipo_logradouro);
         A19end_logradouro = httpContext.cgiGet( edtend_logradouro_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A19end_logradouro", A19end_logradouro);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtend_numero_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtend_numero_Internalname), ".", ",") > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "END_NUMERO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtend_numero_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A20end_numero = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A20end_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A20end_numero), 8, 0));
         }
         else
         {
            A20end_numero = (int)(localUtil.ctol( httpContext.cgiGet( edtend_numero_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A20end_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A20end_numero), 8, 0));
         }
         A21end_bairro = httpContext.cgiGet( edtend_bairro_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A21end_bairro", A21end_bairro);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtcid_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtcid_id_Internalname), ".", ",") > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CID_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtcid_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14cid_id = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14cid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14cid_id), 8, 0));
         }
         else
         {
            A14cid_id = (int)(localUtil.ctol( httpContext.cgiGet( edtcid_id_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14cid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14cid_id), 8, 0));
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
            initAll055( ) ;
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
      disableAttributes055( ) ;
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

   public void resetCaption050( )
   {
   }

   public void zm055( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z18end_tipo_logradouro = T00053_A18end_tipo_logradouro[0] ;
            Z19end_logradouro = T00053_A19end_logradouro[0] ;
            Z20end_numero = T00053_A20end_numero[0] ;
            Z21end_bairro = T00053_A21end_bairro[0] ;
            Z14cid_id = T00053_A14cid_id[0] ;
         }
         else
         {
            Z18end_tipo_logradouro = A18end_tipo_logradouro ;
            Z19end_logradouro = A19end_logradouro ;
            Z20end_numero = A20end_numero ;
            Z21end_bairro = A21end_bairro ;
            Z14cid_id = A14cid_id ;
         }
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

   public void load055( )
   {
      /* Using cursor T00055 */
      pr_default.execute(3, new Object[] {Integer.valueOf(A17end_id)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A18end_tipo_logradouro = T00055_A18end_tipo_logradouro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A18end_tipo_logradouro", A18end_tipo_logradouro);
         A19end_logradouro = T00055_A19end_logradouro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A19end_logradouro", A19end_logradouro);
         A20end_numero = T00055_A20end_numero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A20end_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A20end_numero), 8, 0));
         A21end_bairro = T00055_A21end_bairro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A21end_bairro", A21end_bairro);
         A14cid_id = T00055_A14cid_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14cid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14cid_id), 8, 0));
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
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00054 */
      pr_default.execute(2, new Object[] {Integer.valueOf(A14cid_id)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("No matching 'cidade'.", "ForeignKeyNotFound", 1, "CID_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtcid_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursors055( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( int A14cid_id )
   {
      /* Using cursor T00056 */
      pr_default.execute(4, new Object[] {Integer.valueOf(A14cid_id)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem("No matching 'cidade'.", "ForeignKeyNotFound", 1, "CID_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtcid_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      com.projetopratico.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(4) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(4);
   }

   public void getKey055( )
   {
      /* Using cursor T00057 */
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
      /* Using cursor T00053 */
      pr_default.execute(1, new Object[] {Integer.valueOf(A17end_id)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm055( 1) ;
         RcdFound5 = (short)(1) ;
         A17end_id = T00053_A17end_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A17end_id), 8, 0));
         A18end_tipo_logradouro = T00053_A18end_tipo_logradouro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A18end_tipo_logradouro", A18end_tipo_logradouro);
         A19end_logradouro = T00053_A19end_logradouro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A19end_logradouro", A19end_logradouro);
         A20end_numero = T00053_A20end_numero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A20end_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A20end_numero), 8, 0));
         A21end_bairro = T00053_A21end_bairro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A21end_bairro", A21end_bairro);
         A14cid_id = T00053_A14cid_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14cid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14cid_id), 8, 0));
         Z17end_id = A17end_id ;
         sMode5 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load055( ) ;
         if ( AnyError == 1 )
         {
            RcdFound5 = (short)(0) ;
            initializeNonKey055( ) ;
         }
         Gx_mode = sMode5 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound5 = (short)(0) ;
         initializeNonKey055( ) ;
         sMode5 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode5 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey055( ) ;
      if ( RcdFound5 == 0 )
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
      RcdFound5 = (short)(0) ;
      /* Using cursor T00058 */
      pr_default.execute(6, new Object[] {Integer.valueOf(A17end_id)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T00058_A17end_id[0] < A17end_id ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T00058_A17end_id[0] > A17end_id ) ) )
         {
            A17end_id = T00058_A17end_id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A17end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A17end_id), 8, 0));
            RcdFound5 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound5 = (short)(0) ;
      /* Using cursor T00059 */
      pr_default.execute(7, new Object[] {Integer.valueOf(A17end_id)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T00059_A17end_id[0] > A17end_id ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T00059_A17end_id[0] < A17end_id ) ) )
         {
            A17end_id = T00059_A17end_id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A17end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A17end_id), 8, 0));
            RcdFound5 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey055( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtend_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert055( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound5 == 1 )
         {
            if ( A17end_id != Z17end_id )
            {
               A17end_id = Z17end_id ;
               httpContext.ajax_rsp_assign_attri("", false, "A17end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A17end_id), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "END_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtend_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtend_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update055( ) ;
               GX_FocusControl = edtend_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A17end_id != Z17end_id )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtend_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert055( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "END_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtend_id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtend_id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert055( ) ;
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
      if ( A17end_id != Z17end_id )
      {
         A17end_id = Z17end_id ;
         httpContext.ajax_rsp_assign_attri("", false, "A17end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A17end_id), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "END_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtend_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtend_id_Internalname ;
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
      if ( RcdFound5 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "END_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtend_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtend_tipo_logradouro_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart055( ) ;
      if ( RcdFound5 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtend_tipo_logradouro_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd055( ) ;
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
      if ( RcdFound5 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtend_tipo_logradouro_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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
      if ( RcdFound5 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtend_tipo_logradouro_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart055( ) ;
      if ( RcdFound5 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound5 != 0 )
         {
            scanNext055( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtend_tipo_logradouro_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd055( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency055( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00052 */
         pr_default.execute(0, new Object[] {Integer.valueOf(A17end_id)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"endereco"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z18end_tipo_logradouro, T00052_A18end_tipo_logradouro[0]) != 0 ) || ( GXutil.strcmp(Z19end_logradouro, T00052_A19end_logradouro[0]) != 0 ) || ( Z20end_numero != T00052_A20end_numero[0] ) || ( GXutil.strcmp(Z21end_bairro, T00052_A21end_bairro[0]) != 0 ) || ( Z14cid_id != T00052_A14cid_id[0] ) )
         {
            if ( GXutil.strcmp(Z18end_tipo_logradouro, T00052_A18end_tipo_logradouro[0]) != 0 )
            {
               GXutil.writeLogln("endereco:[seudo value changed for attri]"+"end_tipo_logradouro");
               GXutil.writeLogRaw("Old: ",Z18end_tipo_logradouro);
               GXutil.writeLogRaw("Current: ",T00052_A18end_tipo_logradouro[0]);
            }
            if ( GXutil.strcmp(Z19end_logradouro, T00052_A19end_logradouro[0]) != 0 )
            {
               GXutil.writeLogln("endereco:[seudo value changed for attri]"+"end_logradouro");
               GXutil.writeLogRaw("Old: ",Z19end_logradouro);
               GXutil.writeLogRaw("Current: ",T00052_A19end_logradouro[0]);
            }
            if ( Z20end_numero != T00052_A20end_numero[0] )
            {
               GXutil.writeLogln("endereco:[seudo value changed for attri]"+"end_numero");
               GXutil.writeLogRaw("Old: ",Z20end_numero);
               GXutil.writeLogRaw("Current: ",T00052_A20end_numero[0]);
            }
            if ( GXutil.strcmp(Z21end_bairro, T00052_A21end_bairro[0]) != 0 )
            {
               GXutil.writeLogln("endereco:[seudo value changed for attri]"+"end_bairro");
               GXutil.writeLogRaw("Old: ",Z21end_bairro);
               GXutil.writeLogRaw("Current: ",T00052_A21end_bairro[0]);
            }
            if ( Z14cid_id != T00052_A14cid_id[0] )
            {
               GXutil.writeLogln("endereco:[seudo value changed for attri]"+"cid_id");
               GXutil.writeLogRaw("Old: ",Z14cid_id);
               GXutil.writeLogRaw("Current: ",T00052_A14cid_id[0]);
            }
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
                  /* Using cursor T000510 */
                  pr_default.execute(8, new Object[] {A18end_tipo_logradouro, A19end_logradouro, Integer.valueOf(A20end_numero), A21end_bairro, Integer.valueOf(A14cid_id)});
                  /* Retrieving last key number assigned */
                  /* Using cursor T000511 */
                  pr_default.execute(9);
                  A17end_id = T000511_A17end_id[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A17end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A17end_id), 8, 0));
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
                        resetCaption050( ) ;
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
                  /* Using cursor T000512 */
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
                        resetCaption050( ) ;
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
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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
               /* Using cursor T000513 */
               pr_default.execute(11, new Object[] {Integer.valueOf(A17end_id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("endereco");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound5 == 0 )
                     {
                        initAll055( ) ;
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
                     resetCaption050( ) ;
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
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel055( ) ;
      Gx_mode = sMode5 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls055( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T000514 */
         pr_default.execute(12, new Object[] {Integer.valueOf(A17end_id)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"unidade_endereco"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T000515 */
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
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete055( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "endereco");
         if ( AnyError == 0 )
         {
            confirmValues050( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "endereco");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart055( )
   {
      /* Using cursor T000516 */
      pr_default.execute(14);
      RcdFound5 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A17end_id = T000516_A17end_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A17end_id), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext055( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound5 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A17end_id = T000516_A17end_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A17end_id), 8, 0));
      }
   }

   public void scanEnd055( )
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
      edtend_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtend_id_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtend_id_Enabled), 5, 0), true);
      edtend_tipo_logradouro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtend_tipo_logradouro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtend_tipo_logradouro_Enabled), 5, 0), true);
      edtend_logradouro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtend_logradouro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtend_logradouro_Enabled), 5, 0), true);
      edtend_numero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtend_numero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtend_numero_Enabled), 5, 0), true);
      edtend_bairro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtend_bairro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtend_bairro_Enabled), 5, 0), true);
      edtcid_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtcid_id_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtcid_id_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes055( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues050( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.projetopratico.endereco", new String[] {}, new String[] {}) +"\">") ;
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
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "Z17end_id", GXutil.ltrim( localUtil.ntoc( Z17end_id, (byte)(8), (byte)(0), ".", "")));
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "Z18end_tipo_logradouro", Z18end_tipo_logradouro);
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "Z19end_logradouro", Z19end_logradouro);
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "Z20end_numero", GXutil.ltrim( localUtil.ntoc( Z20end_numero, (byte)(8), (byte)(0), ".", "")));
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "Z21end_bairro", Z21end_bairro);
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "Z14cid_id", GXutil.ltrim( localUtil.ntoc( Z14cid_id, (byte)(8), (byte)(0), ".", "")));
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
      return formatLink("com.projetopratico.endereco", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "endereco" ;
   }

   public String getPgmdesc( )
   {
      return "endereco" ;
   }

   public void initializeNonKey055( )
   {
      A18end_tipo_logradouro = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A18end_tipo_logradouro", A18end_tipo_logradouro);
      A19end_logradouro = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A19end_logradouro", A19end_logradouro);
      A20end_numero = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A20end_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A20end_numero), 8, 0));
      A21end_bairro = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A21end_bairro", A21end_bairro);
      A14cid_id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14cid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14cid_id), 8, 0));
      Z18end_tipo_logradouro = "" ;
      Z19end_logradouro = "" ;
      Z20end_numero = 0 ;
      Z21end_bairro = "" ;
      Z14cid_id = 0 ;
   }

   public void initAll055( )
   {
      A17end_id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A17end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A17end_id), 8, 0));
      initializeNonKey055( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2025491825271", true, true);
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
      httpContext.AddJavascriptSource("endereco.js", "?2025491825271", false, true);
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
      edtend_id_Internalname = "END_ID" ;
      edtend_tipo_logradouro_Internalname = "END_TIPO_LOGRADOURO" ;
      edtend_logradouro_Internalname = "END_LOGRADOURO" ;
      edtend_numero_Internalname = "END_NUMERO" ;
      edtend_bairro_Internalname = "END_BAIRRO" ;
      edtcid_id_Internalname = "CID_ID" ;
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
      Form.setCaption( "endereco" );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtcid_id_Jsonclick = "" ;
      edtcid_id_Enabled = 1 ;
      edtend_bairro_Jsonclick = "" ;
      edtend_bairro_Enabled = 1 ;
      edtend_numero_Jsonclick = "" ;
      edtend_numero_Enabled = 1 ;
      edtend_logradouro_Enabled = 1 ;
      edtend_tipo_logradouro_Jsonclick = "" ;
      edtend_tipo_logradouro_Enabled = 1 ;
      edtend_id_Jsonclick = "" ;
      edtend_id_Enabled = 1 ;
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
      GX_FocusControl = edtend_tipo_logradouro_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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

   public void valid_End_id( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A18end_tipo_logradouro", A18end_tipo_logradouro);
      httpContext.ajax_rsp_assign_attri("", false, "A19end_logradouro", A19end_logradouro);
      httpContext.ajax_rsp_assign_attri("", false, "A20end_numero", GXutil.ltrim( localUtil.ntoc( A20end_numero, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A21end_bairro", A21end_bairro);
      httpContext.ajax_rsp_assign_attri("", false, "A14cid_id", GXutil.ltrim( localUtil.ntoc( A14cid_id, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "Z17end_id", GXutil.ltrim( localUtil.ntoc( Z17end_id, (byte)(8), (byte)(0), ".", "")));
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "Z18end_tipo_logradouro", Z18end_tipo_logradouro);
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "Z19end_logradouro", Z19end_logradouro);
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "Z20end_numero", GXutil.ltrim( localUtil.ntoc( Z20end_numero, (byte)(8), (byte)(0), ".", "")));
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "Z21end_bairro", Z21end_bairro);
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "Z14cid_id", GXutil.ltrim( localUtil.ntoc( Z14cid_id, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Cid_id( )
   {
      /* Using cursor T000517 */
      pr_default.execute(15, new Object[] {Integer.valueOf(A14cid_id)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem("No matching 'cidade'.", "ForeignKeyNotFound", 1, "CID_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtcid_id_Internalname ;
      }
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
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
      setEventMetadata("VALID_END_ID","{handler:'valid_End_id',iparms:[{av:'A17end_id',fld:'END_ID',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_END_ID",",oparms:[{av:'A18end_tipo_logradouro',fld:'END_TIPO_LOGRADOURO',pic:''},{av:'A19end_logradouro',fld:'END_LOGRADOURO',pic:''},{av:'A20end_numero',fld:'END_NUMERO',pic:'ZZZZZZZ9'},{av:'A21end_bairro',fld:'END_BAIRRO',pic:''},{av:'A14cid_id',fld:'CID_ID',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z17end_id'},{av:'Z18end_tipo_logradouro'},{av:'Z19end_logradouro'},{av:'Z20end_numero'},{av:'Z21end_bairro'},{av:'Z14cid_id'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_CID_ID","{handler:'valid_Cid_id',iparms:[{av:'A14cid_id',fld:'CID_ID',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_CID_ID",",oparms:[]}");
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
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z18end_tipo_logradouro = "" ;
      Z19end_logradouro = "" ;
      Z21end_bairro = "" ;
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
      A18end_tipo_logradouro = "" ;
      A19end_logradouro = "" ;
      A21end_bairro = "" ;
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
      T00055_A17end_id = new int[1] ;
      T00055_A18end_tipo_logradouro = new String[] {""} ;
      T00055_A19end_logradouro = new String[] {""} ;
      T00055_A20end_numero = new int[1] ;
      T00055_A21end_bairro = new String[] {""} ;
      T00055_A14cid_id = new int[1] ;
      T00054_A14cid_id = new int[1] ;
      T00056_A14cid_id = new int[1] ;
      T00057_A17end_id = new int[1] ;
      T00053_A17end_id = new int[1] ;
      T00053_A18end_tipo_logradouro = new String[] {""} ;
      T00053_A19end_logradouro = new String[] {""} ;
      T00053_A20end_numero = new int[1] ;
      T00053_A21end_bairro = new String[] {""} ;
      T00053_A14cid_id = new int[1] ;
      sMode5 = "" ;
      T00058_A17end_id = new int[1] ;
      T00059_A17end_id = new int[1] ;
      T00052_A17end_id = new int[1] ;
      T00052_A18end_tipo_logradouro = new String[] {""} ;
      T00052_A19end_logradouro = new String[] {""} ;
      T00052_A20end_numero = new int[1] ;
      T00052_A21end_bairro = new String[] {""} ;
      T00052_A14cid_id = new int[1] ;
      T000511_A17end_id = new int[1] ;
      T000514_A7unid_id = new int[1] ;
      T000514_A17end_id = new int[1] ;
      T000515_A1pes_id = new int[1] ;
      T000515_A17end_id = new int[1] ;
      T000516_A17end_id = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ18end_tipo_logradouro = "" ;
      ZZ19end_logradouro = "" ;
      ZZ21end_bairro = "" ;
      T000517_A14cid_id = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.endereco__default(),
         new Object[] {
             new Object[] {
            T00052_A17end_id, T00052_A18end_tipo_logradouro, T00052_A19end_logradouro, T00052_A20end_numero, T00052_A21end_bairro, T00052_A14cid_id
            }
            , new Object[] {
            T00053_A17end_id, T00053_A18end_tipo_logradouro, T00053_A19end_logradouro, T00053_A20end_numero, T00053_A21end_bairro, T00053_A14cid_id
            }
            , new Object[] {
            T00054_A14cid_id
            }
            , new Object[] {
            T00055_A17end_id, T00055_A18end_tipo_logradouro, T00055_A19end_logradouro, T00055_A20end_numero, T00055_A21end_bairro, T00055_A14cid_id
            }
            , new Object[] {
            T00056_A14cid_id
            }
            , new Object[] {
            T00057_A17end_id
            }
            , new Object[] {
            T00058_A17end_id
            }
            , new Object[] {
            T00059_A17end_id
            }
            , new Object[] {
            }
            , new Object[] {
            T000511_A17end_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000514_A7unid_id, T000514_A17end_id
            }
            , new Object[] {
            T000515_A1pes_id, T000515_A17end_id
            }
            , new Object[] {
            T000516_A17end_id
            }
            , new Object[] {
            T000517_A14cid_id
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
   private short RcdFound5 ;
   private int Z17end_id ;
   private int Z20end_numero ;
   private int Z14cid_id ;
   private int A14cid_id ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int A17end_id ;
   private int edtend_id_Enabled ;
   private int edtend_tipo_logradouro_Enabled ;
   private int edtend_logradouro_Enabled ;
   private int A20end_numero ;
   private int edtend_numero_Enabled ;
   private int edtend_bairro_Enabled ;
   private int edtcid_id_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ17end_id ;
   private int ZZ20end_numero ;
   private int ZZ14cid_id ;
   private String sPrefix ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtend_id_Internalname ;
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
   private String edtend_id_Jsonclick ;
   private String edtend_tipo_logradouro_Internalname ;
   private String edtend_tipo_logradouro_Jsonclick ;
   private String edtend_logradouro_Internalname ;
   private String edtend_numero_Internalname ;
   private String edtend_numero_Jsonclick ;
   private String edtend_bairro_Internalname ;
   private String edtend_bairro_Jsonclick ;
   private String edtcid_id_Internalname ;
   private String edtcid_id_Jsonclick ;
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
   private String sMode5 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private String Z18end_tipo_logradouro ;
   private String Z19end_logradouro ;
   private String Z21end_bairro ;
   private String A18end_tipo_logradouro ;
   private String A19end_logradouro ;
   private String A21end_bairro ;
   private String ZZ18end_tipo_logradouro ;
   private String ZZ19end_logradouro ;
   private String ZZ21end_bairro ;
   private com.genexus.webpanels.GXWebForm Form ;
   private IDataStoreProvider pr_default ;
   private int[] T00055_A17end_id ;
   private String[] T00055_A18end_tipo_logradouro ;
   private String[] T00055_A19end_logradouro ;
   private int[] T00055_A20end_numero ;
   private String[] T00055_A21end_bairro ;
   private int[] T00055_A14cid_id ;
   private int[] T00054_A14cid_id ;
   private int[] T00056_A14cid_id ;
   private int[] T00057_A17end_id ;
   private int[] T00053_A17end_id ;
   private String[] T00053_A18end_tipo_logradouro ;
   private String[] T00053_A19end_logradouro ;
   private int[] T00053_A20end_numero ;
   private String[] T00053_A21end_bairro ;
   private int[] T00053_A14cid_id ;
   private int[] T00058_A17end_id ;
   private int[] T00059_A17end_id ;
   private int[] T00052_A17end_id ;
   private String[] T00052_A18end_tipo_logradouro ;
   private String[] T00052_A19end_logradouro ;
   private int[] T00052_A20end_numero ;
   private String[] T00052_A21end_bairro ;
   private int[] T00052_A14cid_id ;
   private int[] T000511_A17end_id ;
   private int[] T000514_A7unid_id ;
   private int[] T000514_A17end_id ;
   private int[] T000515_A1pes_id ;
   private int[] T000515_A17end_id ;
   private int[] T000516_A17end_id ;
   private int[] T000517_A14cid_id ;
}

final  class endereco__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00052", "SELECT end_id, end_tipo_logradouro, end_logradouro, end_numero, end_bairro, cid_id FROM endereco WHERE end_id = ?  FOR UPDATE OF endereco NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00053", "SELECT end_id, end_tipo_logradouro, end_logradouro, end_numero, end_bairro, cid_id FROM endereco WHERE end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00054", "SELECT cid_id FROM cidade WHERE cid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00055", "SELECT TM1.end_id, TM1.end_tipo_logradouro, TM1.end_logradouro, TM1.end_numero, TM1.end_bairro, TM1.cid_id FROM endereco TM1 WHERE TM1.end_id = ? ORDER BY TM1.end_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00056", "SELECT cid_id FROM cidade WHERE cid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00057", "SELECT end_id FROM endereco WHERE end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00058", "SELECT end_id FROM endereco WHERE ( end_id > ?) ORDER BY end_id  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00059", "SELECT end_id FROM endereco WHERE ( end_id < ?) ORDER BY end_id DESC  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T000510", "SAVEPOINT gxupdate;INSERT INTO endereco(end_tipo_logradouro, end_logradouro, end_numero, end_bairro, cid_id) VALUES(?, ?, ?, ?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("T000511", "SELECT currval('end_id') ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T000512", "SAVEPOINT gxupdate;UPDATE endereco SET end_tipo_logradouro=?, end_logradouro=?, end_numero=?, end_bairro=?, cid_id=?  WHERE end_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000513", "SAVEPOINT gxupdate;DELETE FROM endereco  WHERE end_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("T000514", "SELECT unid_id, end_id FROM unidade_endereco WHERE end_id = ?  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000515", "SELECT pes_id, end_id FROM pessoa_endereco WHERE end_id = ?  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000516", "SELECT end_id FROM endereco ORDER BY end_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000517", "SELECT cid_id FROM cidade WHERE cid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
               return;
            case 15 :
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
            case 15 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

