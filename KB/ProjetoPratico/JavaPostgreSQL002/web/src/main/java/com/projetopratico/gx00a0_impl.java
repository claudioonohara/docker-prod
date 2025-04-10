package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class gx00a0_impl extends GXDataArea
{
   public gx00a0_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx00a0_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx00a0_impl.class ));
   }

   public gx00a0_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "ppes_id") ;
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxEvt") == 0 )
         {
            httpContext.setAjaxEventMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "ppes_id") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "ppes_id") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            gxnrgrid1_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid1") == 0 )
         {
            gxgrgrid1_refresh_invoke( ) ;
            return  ;
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
         if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            AV9ppes_id = (int)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9ppes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9ppes_id), 8, 0));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV10pst_data_admissao = localUtil.parseDateParm( httpContext.GetPar( "pst_data_admissao")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10pst_data_admissao", localUtil.format(AV10pst_data_admissao, "99/99/9999"));
               AV11pst_data_demissao = localUtil.parseDateParm( httpContext.GetPar( "pst_data_demissao")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11pst_data_demissao", localUtil.format(AV11pst_data_demissao, "99/99/9999"));
            }
         }
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgrid1_newrow_invoke( )
   {
      nRC_GXsfl_44 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_44"))) ;
      nGXsfl_44_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_44_idx"))) ;
      sGXsfl_44_idx = httpContext.GetPar( "sGXsfl_44_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public void gxgrgrid1_refresh_invoke( )
   {
      subGrid1_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid1_Rows"))) ;
      AV6cpes_id = (int)(GXutil.lval( httpContext.GetPar( "cpes_id"))) ;
      AV7cst_data_admissao = localUtil.parseDateParm( httpContext.GetPar( "cst_data_admissao")) ;
      AV8cst_data_demissao = localUtil.parseDateParm( httpContext.GetPar( "cst_data_demissao")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid1_refresh( subGrid1_Rows, AV6cpes_id, AV7cst_data_admissao, AV8cst_data_demissao) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid1_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         MasterPageObj= createMasterPage(remoteHandle, "com.projetopratico.general.ui.masterprompt");
         MasterPageObj.setDataArea(this,true);
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

   public byte executeStartEvent( )
   {
      pa0T2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start0T2( ) ;
      }
      return gxajaxcallmode ;
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
      if ( nGXWrapped != 1 )
      {
         MasterPageObj.master_styles();
      }
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 1023100), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 1023100), false, true);
      httpContext.AddJavascriptSource("calendar-en.js", "?"+httpContext.getBuildNumber( 1023100), false, true);
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
      if ( nGXWrapped == 0 )
      {
         bodyStyle += "-moz-opacity:0;opacity:0;" ;
      }
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle += " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.projetopratico.gx00a0", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV9ppes_id,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV10pst_data_admissao)),GXutil.URLEncode(GXutil.formatDateParm(AV11pst_data_demissao))}, new String[] {"ppes_id","pst_data_admissao","pst_data_demissao"}) +"\">") ;
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
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "GXH_vCPES_ID", GXutil.ltrim( localUtil.ntoc( AV6cpes_id, (byte)(8), (byte)(0), ".", "")));
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "GXH_vCST_DATA_ADMISSAO", localUtil.format(AV7cst_data_admissao, "99/99/9999"));
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "GXH_vCST_DATA_DEMISSAO", localUtil.format(AV8cst_data_demissao, "99/99/9999"));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_44", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_44, (byte)(8), (byte)(0), ".", "")));
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "vPPES_ID", GXutil.ltrim( localUtil.ntoc( AV9ppes_id, (byte)(8), (byte)(0), ".", "")));
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "vPST_DATA_ADMISSAO", localUtil.dtoc( AV10pst_data_admissao, 0, "/"));
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "vPST_DATA_DEMISSAO", localUtil.dtoc( AV11pst_data_demissao, 0, "/"));
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "PES_IDFILTERCONTAINER_Class", GXutil.rtrim( divPes_idfiltercontainer_Class));
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", "notset");
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

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         com.projetopratico.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we0T2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt0T2( ) ;
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
      return formatLink("com.projetopratico.gx00a0", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV9ppes_id,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV10pst_data_admissao)),GXutil.URLEncode(GXutil.formatDateParm(AV11pst_data_demissao))}, new String[] {"ppes_id","pst_data_admissao","pst_data_demissao"})  ;
   }

   public String getPgmname( )
   {
      return "Gx00A0" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List servidor_temporario" ;
   }

   public void wb0T0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( nGXWrapped == 1 )
         {
            renderHtmlHeaders( ) ;
            renderHtmlOpenForm( ) ;
         }
         com.projetopratico.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", "", "false");
         /* Div Control */
         com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "start", "top", " "+"data-gx-base-lib=\"none\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         com.projetopratico.GxWebStd.gx_div_start( httpContext, divMain_Internalname, 1, 0, "px", 0, "px", "ContainerFluid PromptContainer", "start", "top", "", "", "div");
         /* Div Control */
         com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 PromptAdvancedBarCell", "start", "top", "", "", "div");
         /* Div Control */
         com.projetopratico.GxWebStd.gx_div_start( httpContext, divAdvancedcontainer_Internalname, 1, 0, "px", 0, "px", divAdvancedcontainer_Class, "start", "top", "", "", "div");
         /* Div Control */
         com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
         /* Div Control */
         com.projetopratico.GxWebStd.gx_div_start( httpContext, divPes_idfiltercontainer_Internalname, 1, 0, "px", 0, "px", divPes_idfiltercontainer_Class, "start", "top", "", "", "div");
         /* Div Control */
         com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
         /* Text block */
         com.projetopratico.GxWebStd.gx_label_ctrl( httpContext, lblLblpes_idfilter_Internalname, "pes_id", "", "", lblLblpes_idfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e110t1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx00A0.htm");
         com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         /* Div Control */
         com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "start", "top", "", "", "div");
         /* Div Control */
         com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "start", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.projetopratico.GxWebStd.gx_label_element( httpContext, edtavCpes_id_Internalname, "pes_id", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_44_idx + "',0)\"" ;
         com.projetopratico.GxWebStd.gx_single_line_edit( httpContext, edtavCpes_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cpes_id, (byte)(8), (byte)(0), ".", "")), GXutil.ltrim( ((edtavCpes_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6cpes_id), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV6cpes_id), "ZZZZZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCpes_id_Jsonclick, 0, "Attribute", "", "", "", "", edtavCpes_id_Visible, edtavCpes_id_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_Gx00A0.htm");
         com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
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
         com.projetopratico.GxWebStd.gx_div_start( httpContext, divSt_data_admissaofiltercontainer_Internalname, 1, 0, "px", 0, "px", "AdvancedContainerItem AdvancedContainerItemExpanded", "start", "top", "", "", "div");
         /* Div Control */
         com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
         /* Text block */
         com.projetopratico.GxWebStd.gx_label_ctrl( httpContext, lblLblst_data_admissaofilter_Internalname, "st_data_admissao", "", "", lblLblst_data_admissaofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "WWAdvancedLabel WWDateFilterLabel", 0, "", 1, 1, 0, (short)(1), "HLP_Gx00A0.htm");
         com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         /* Div Control */
         com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "start", "top", "", "", "div");
         /* Div Control */
         com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "start", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.projetopratico.GxWebStd.gx_label_element( httpContext, edtavCst_data_admissao_Internalname, "st_data_admissao", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_44_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCst_data_admissao_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.projetopratico.GxWebStd.gx_single_line_edit( httpContext, edtavCst_data_admissao_Internalname, localUtil.format(AV7cst_data_admissao, "99/99/9999"), localUtil.format( AV7cst_data_admissao, "99/99/9999"), TempTags+" onchange=\""+"gx.date.valid_date(this, 10,'MDY',0,12,'eng',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'MDY',0,12,'eng',false,0);"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCst_data_admissao_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavCst_data_admissao_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_Gx00A0.htm");
         httpContext.writeTextNL( "</div>") ;
         com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
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
         com.projetopratico.GxWebStd.gx_div_start( httpContext, divSt_data_demissaofiltercontainer_Internalname, 1, 0, "px", 0, "px", "AdvancedContainerItem AdvancedContainerItemExpanded", "start", "top", "", "", "div");
         /* Div Control */
         com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
         /* Text block */
         com.projetopratico.GxWebStd.gx_label_ctrl( httpContext, lblLblst_data_demissaofilter_Internalname, "st_data_demissao", "", "", lblLblst_data_demissaofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "WWAdvancedLabel WWDateFilterLabel", 0, "", 1, 1, 0, (short)(1), "HLP_Gx00A0.htm");
         com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         /* Div Control */
         com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "start", "top", "", "", "div");
         /* Div Control */
         com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "start", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.projetopratico.GxWebStd.gx_label_element( httpContext, edtavCst_data_demissao_Internalname, "st_data_demissao", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_44_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCst_data_demissao_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.projetopratico.GxWebStd.gx_single_line_edit( httpContext, edtavCst_data_demissao_Internalname, localUtil.format(AV8cst_data_demissao, "99/99/9999"), localUtil.format( AV8cst_data_demissao, "99/99/9999"), TempTags+" onchange=\""+"gx.date.valid_date(this, 10,'MDY',0,12,'eng',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'MDY',0,12,'eng',false,0);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCst_data_demissao_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavCst_data_demissao_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_Gx00A0.htm");
         httpContext.writeTextNL( "</div>") ;
         com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         /* Div Control */
         com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 WWGridCell", "start", "top", "", "", "div");
         /* Div Control */
         com.projetopratico.GxWebStd.gx_div_start( httpContext, divGridtable_Internalname, 1, 0, "px", 0, "px", "Table", "start", "top", "", "", "div");
         /* Div Control */
         com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-sm hidden-md hidden-lg ToggleCell", "start", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         ClassString = bttBtntoggle_Class ;
         StyleString = "" ;
         com.projetopratico.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 44, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e120t1_client"+"'", TempTags, "", 2, "HLP_Gx00A0.htm");
         com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         /* Div Control */
         com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         startgridcontrol44( ) ;
      }
      if ( wbEnd == 44 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_44 = (int)(nGXsfl_44_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Grid1Container.AddObjectProperty("GRID1_nEOF", GRID1_nEOF);
            Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container, subGrid1_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
            }
         }
         com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         /* Div Control */
         com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.projetopratico.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.projetopratico.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 44, 2, 0)+","+"null"+");", "Cancel", bttBtn_cancel_Jsonclick, 1, "Cancel", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx00A0.htm");
         com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.projetopratico.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      }
      if ( wbEnd == 44 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Grid1Container.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               Grid1Container.AddObjectProperty("GRID1_nEOF", GRID1_nEOF);
               Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container, subGrid1_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start0T2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         if ( httpContext.exposeMetadata( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 18_0_10-184260", (short)(0)) ;
         }
      }
      Form.getMeta().addItem("description", "Selection List servidor_temporario", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup0T0( ) ;
   }

   public void ws0T2( )
   {
      start0T2( ) ;
      evt0T2( ) ;
   }

   public void evt0T2( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
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
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* No code required for Cancel button. It is implemented as the Reset button. */
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRID1PAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRID1PAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid1_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid1_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid1_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid1_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 4), "LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) )
                        {
                           nGXsfl_44_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_442( ) ;
                           AV5LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV13Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV5LinkSelection))), !bGXsfl_44_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV5LinkSelection), true);
                           A1pes_id = (int)(localUtil.ctol( httpContext.cgiGet( edtpes_id_Internalname), ".", ",")) ;
                           A22st_data_admissao = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtst_data_admissao_Internalname), 0)) ;
                           A23st_data_demissao = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtst_data_demissao_Internalname), 0)) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e130T2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e140T2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Cpes_id Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCPES_ID"), ".", ",") != AV6cpes_id )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cst_data_admissao Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCST_DATA_ADMISSAO"), 0), AV7cst_data_admissao) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cst_data_demissao Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCST_DATA_DEMISSAO"), 0), AV8cst_data_demissao) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e150T2 ();
                                    }
                                    dynload_actions( ) ;
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                              }
                           }
                           else
                           {
                           }
                        }
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we0T2( )
   {
      if ( ! com.projetopratico.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.projetopratico.GxWebStd.gx_redirect( httpContext) )
         {
            if ( nGXWrapped == 1 )
            {
               renderHtmlCloseForm( ) ;
            }
         }
      }
   }

   public void pa0T2( )
   {
      if ( nDonePA == 0 )
      {
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
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( )
   {
      com.projetopratico.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_442( ) ;
      while ( nGXsfl_44_idx <= nRC_GXsfl_44 )
      {
         sendrow_442( ) ;
         nGXsfl_44_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_44_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_44_idx+1) ;
         sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_442( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  int AV6cpes_id ,
                                  java.util.Date AV7cst_data_admissao ,
                                  java.util.Date AV8cst_data_demissao )
   {
      initialize_formulas( ) ;
      com.projetopratico.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRID1_nCurrentRecord = 0 ;
      rf0T2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "gxhash_PES_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A1pes_id), "ZZZZZZZ9")));
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "PES_ID", GXutil.ltrim( localUtil.ntoc( A1pes_id, (byte)(8), (byte)(0), ".", "")));
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "gxhash_ST_DATA_ADMISSAO", getSecureSignedToken( "", A22st_data_admissao));
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "ST_DATA_ADMISSAO", localUtil.format(A22st_data_admissao, "99/99/9999"));
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "gxhash_ST_DATA_DEMISSAO", getSecureSignedToken( "", A23st_data_demissao));
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "ST_DATA_DEMISSAO", localUtil.format(A23st_data_demissao, "99/99/9999"));
   }

   public void clear_multi_value_controls( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         dynload_actions( ) ;
         before_start_formulas( ) ;
      }
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf0T2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
   }

   public void rf0T2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(44) ;
      nGXsfl_44_idx = 1 ;
      sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_442( ) ;
      bGXsfl_44_Refreshing = true ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "PromptGrid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.setPageSize( subgrid1_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_442( ) ;
         GXPagingFrom2 = (int)(GRID1_nFirstRecordOnPage) ;
         GXPagingTo2 = (int)(subgrid1_fnc_recordsperpage( )+1) ;
         /* Using cursor H000T2 */
         pr_default.execute(0, new Object[] {Integer.valueOf(AV6cpes_id), AV7cst_data_admissao, AV8cst_data_demissao, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2)});
         nGXsfl_44_idx = 1 ;
         sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_442( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( GRID1_nCurrentRecord < subgrid1_fnc_recordsperpage( ) ) ) )
         {
            A23st_data_demissao = H000T2_A23st_data_demissao[0] ;
            A22st_data_admissao = H000T2_A22st_data_admissao[0] ;
            A1pes_id = H000T2_A1pes_id[0] ;
            /* Execute user event: Load */
            e140T2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(44) ;
         wb0T0( ) ;
      }
      bGXsfl_44_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes0T2( )
   {
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "gxhash_PES_ID"+"_"+sGXsfl_44_idx, getSecureSignedToken( sGXsfl_44_idx, localUtil.format( DecimalUtil.doubleToDec(A1pes_id), "ZZZZZZZ9")));
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "gxhash_ST_DATA_ADMISSAO"+"_"+sGXsfl_44_idx, getSecureSignedToken( sGXsfl_44_idx, A22st_data_admissao));
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "gxhash_ST_DATA_DEMISSAO"+"_"+sGXsfl_44_idx, getSecureSignedToken( sGXsfl_44_idx, A23st_data_demissao));
   }

   public int subgrid1_fnc_pagecount( )
   {
      GRID1_nRecordCount = subgrid1_fnc_recordcount( ) ;
      if ( ((int)((GRID1_nRecordCount) % (subgrid1_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( DecimalUtil.decToDouble(DecimalUtil.doubleToDec(GRID1_nRecordCount).divide(DecimalUtil.doubleToDec(subgrid1_fnc_recordsperpage( )), java.math.MathContext.DECIMAL128)))) ;
      }
      return (int)(GXutil.Int( DecimalUtil.decToDouble(DecimalUtil.doubleToDec(GRID1_nRecordCount).divide(DecimalUtil.doubleToDec(subgrid1_fnc_recordsperpage( )), java.math.MathContext.DECIMAL128)))+1) ;
   }

   public int subgrid1_fnc_recordcount( )
   {
      /* Using cursor H000T3 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV6cpes_id), AV7cst_data_admissao, AV8cst_data_demissao});
      GRID1_nRecordCount = H000T3_AGRID1_nRecordCount[0] ;
      pr_default.close(1);
      return (int)(GRID1_nRecordCount) ;
   }

   public int subgrid1_fnc_recordsperpage( )
   {
      return 10*1 ;
   }

   public int subgrid1_fnc_currentpage( )
   {
      return (int)(GXutil.Int( DecimalUtil.decToDouble(DecimalUtil.doubleToDec(GRID1_nFirstRecordOnPage).divide(DecimalUtil.doubleToDec(subgrid1_fnc_recordsperpage( )), java.math.MathContext.DECIMAL128)))+1) ;
   }

   public short subgrid1_firstpage( )
   {
      GRID1_nFirstRecordOnPage = 0 ;
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cpes_id, AV7cst_data_admissao, AV8cst_data_demissao) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid1_nextpage( )
   {
      GRID1_nRecordCount = subgrid1_fnc_recordcount( ) ;
      if ( ( GRID1_nRecordCount >= subgrid1_fnc_recordsperpage( ) ) && ( GRID1_nEOF == 0 ) )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage+subgrid1_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cpes_id, AV7cst_data_admissao, AV8cst_data_demissao) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID1_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid1_previouspage( )
   {
      if ( GRID1_nFirstRecordOnPage >= subgrid1_fnc_recordsperpage( ) )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage-subgrid1_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cpes_id, AV7cst_data_admissao, AV8cst_data_demissao) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid1_lastpage( )
   {
      GRID1_nRecordCount = subgrid1_fnc_recordcount( ) ;
      if ( GRID1_nRecordCount > subgrid1_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRID1_nRecordCount) % (subgrid1_fnc_recordsperpage( )))) == 0 )
         {
            GRID1_nFirstRecordOnPage = (long)(GRID1_nRecordCount-subgrid1_fnc_recordsperpage( )) ;
         }
         else
         {
            GRID1_nFirstRecordOnPage = (long)(GRID1_nRecordCount-((int)((GRID1_nRecordCount) % (subgrid1_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cpes_id, AV7cst_data_admissao, AV8cst_data_demissao) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid1_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(subgrid1_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      com.projetopratico.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cpes_id, AV7cst_data_admissao, AV8cst_data_demissao) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      edtpes_id_Enabled = 0 ;
      edtst_data_admissao_Enabled = 0 ;
      edtst_data_demissao_Enabled = 0 ;
      fix_multi_value_controls( ) ;
   }

   public void strup0T0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e130T2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_44 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_44"), ".", ",")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCpes_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCpes_id_Internalname), ".", ",") > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCPES_ID");
            GX_FocusControl = edtavCpes_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cpes_id = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cpes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6cpes_id), 8, 0));
         }
         else
         {
            AV6cpes_id = (int)(localUtil.ctol( httpContext.cgiGet( edtavCpes_id_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cpes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6cpes_id), 8, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavCst_data_admissao_Internalname), (byte)(2)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vCST_DATA_ADMISSAO");
            GX_FocusControl = edtavCst_data_admissao_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7cst_data_admissao = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cst_data_admissao", localUtil.format(AV7cst_data_admissao, "99/99/9999"));
         }
         else
         {
            AV7cst_data_admissao = localUtil.ctod( httpContext.cgiGet( edtavCst_data_admissao_Internalname), 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cst_data_admissao", localUtil.format(AV7cst_data_admissao, "99/99/9999"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavCst_data_demissao_Internalname), (byte)(2)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vCST_DATA_DEMISSAO");
            GX_FocusControl = edtavCst_data_demissao_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8cst_data_demissao = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cst_data_demissao", localUtil.format(AV8cst_data_demissao, "99/99/9999"));
         }
         else
         {
            AV8cst_data_demissao = localUtil.ctod( httpContext.cgiGet( edtavCst_data_demissao_Internalname), 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cst_data_demissao", localUtil.format(AV8cst_data_demissao, "99/99/9999"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCPES_ID"), ".", ",") != AV6cpes_id )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vCST_DATA_ADMISSAO"), 2)), GXutil.resetTime(AV7cst_data_admissao)) ) )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vCST_DATA_DEMISSAO"), 2)), GXutil.resetTime(AV8cst_data_demissao)) ) )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e130T2 ();
      if (returnInSub) return;
   }

   public void e130T2( )
   {
      /* Start Routine */
      returnInSub = false ;
      Form.setCaption( GXutil.format( "Selection List %1", "servidor_temporario", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV12ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e140T2( )
   {
      /* Load Routine */
      returnInSub = false ;
      edtavLinkselection_gximage = "selectRow" ;
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavLinkselection_Internalname, AV5LinkSelection);
      AV13Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      sendrow_442( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_44_Refreshing )
      {
         httpContext.doAjaxLoad(44, Grid1Row);
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e150T2 ();
      if (returnInSub) return;
   }

   public void e150T2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV9ppes_id = A1pes_id ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9ppes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9ppes_id), 8, 0));
      AV10pst_data_admissao = A22st_data_admissao ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10pst_data_admissao", localUtil.format(AV10pst_data_admissao, "99/99/9999"));
      AV11pst_data_demissao = A23st_data_demissao ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11pst_data_demissao", localUtil.format(AV11pst_data_demissao, "99/99/9999"));
      httpContext.setWebReturnParms(new Object[] {Integer.valueOf(AV9ppes_id),localUtil.format( AV10pst_data_admissao, "99/99/9999"),localUtil.format( AV11pst_data_demissao, "99/99/9999")});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV9ppes_id","AV10pst_data_admissao","AV11pst_data_demissao"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV9ppes_id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9ppes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9ppes_id), 8, 0));
      AV10pst_data_admissao = (java.util.Date)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10pst_data_admissao", localUtil.format(AV10pst_data_admissao, "99/99/9999"));
      AV11pst_data_demissao = (java.util.Date)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11pst_data_demissao", localUtil.format(AV11pst_data_demissao, "99/99/9999"));
   }

   public String getresponse( String sGXDynURL )
   {
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa0T2( ) ;
      ws0T2( ) ;
      we0T2( ) ;
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
      httpContext.setWrapped(false);
      httpContext.GX_msglist = BackMsgLst ;
      String response = "";
      try
      {
         response = ((java.io.ByteArrayOutputStream) httpContext.getOutputStream()).toString("UTF8");
      }
      catch (java.io.UnsupportedEncodingException e)
      {
         Application.printWarning(e.getMessage(), e);
      }
      finally
      {
         httpContext.closeOutputStream();
      }
      return response;
   }

   public void responsestatic( String sGXDynURL )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202549183261", true, true);
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
      httpContext.AddJavascriptSource("gx00a0.js", "?202549183261", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_442( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_44_idx ;
      edtpes_id_Internalname = "PES_ID_"+sGXsfl_44_idx ;
      edtst_data_admissao_Internalname = "ST_DATA_ADMISSAO_"+sGXsfl_44_idx ;
      edtst_data_demissao_Internalname = "ST_DATA_DEMISSAO_"+sGXsfl_44_idx ;
   }

   public void subsflControlProps_fel_442( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_44_fel_idx ;
      edtpes_id_Internalname = "PES_ID_"+sGXsfl_44_fel_idx ;
      edtst_data_admissao_Internalname = "ST_DATA_ADMISSAO_"+sGXsfl_44_fel_idx ;
      edtst_data_demissao_Internalname = "ST_DATA_DEMISSAO_"+sGXsfl_44_fel_idx ;
   }

   public void sendrow_442( )
   {
      sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_442( ) ;
      wb0T0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_44_idx <= subgrid1_fnc_recordsperpage( ) * 1 ) )
      {
         Grid1Row = GXWebRow.GetNew(context,Grid1Container) ;
         if ( subGrid1_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid1_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
         }
         else if ( subGrid1_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid1_Backstyle = (byte)(0) ;
            subGrid1_Backcolor = subGrid1_Allbackcolor ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Uniform" ;
            }
         }
         else if ( subGrid1_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid1_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
            subGrid1_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid1_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid1_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_44_idx) % (2))) == 0 )
            {
               subGrid1_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Even" ;
               }
            }
            else
            {
               subGrid1_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Odd" ;
               }
            }
         }
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"PromptGrid"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_44_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1pes_id, (byte)(8), (byte)(0), ".", "")))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( localUtil.format(A22st_data_admissao, "99/99/9999"))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( localUtil.format(A23st_data_demissao, "99/99/9999"))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link, !bGXsfl_44_Refreshing);
         ClassString = "SelectionAttribute" + " " + ((GXutil.strcmp(edtavLinkselection_gximage, "")==0) ? "" : "GX_Image_"+edtavLinkselection_gximage+"_Class") ;
         StyleString = "" ;
         AV5LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV5LinkSelection)==0)&&(GXutil.strcmp("", AV13Linkselection_GXI)==0))||!(GXutil.strcmp("", AV5LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV13Linkselection_GXI : httpContext.getResourceRelative(AV5LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),Integer.valueOf(-1),Integer.valueOf(1),"","",Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"","",StyleString,ClassString,"WWActionColumn","","","","","","",Integer.valueOf(1),Boolean.valueOf(AV5LinkSelection_IsBlob),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"end"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtpes_id_Internalname,GXutil.ltrim( localUtil.ntoc( A1pes_id, (byte)(8), (byte)(0), ".", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1pes_id), "ZZZZZZZ9"))," dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtpes_id_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn OptionalColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","end",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"end"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtst_data_admissao_Internalname,localUtil.format(A22st_data_admissao, "99/99/9999"),localUtil.format( A22st_data_admissao, "99/99/9999"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtst_data_admissao_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","end",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"end"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtst_data_demissao_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1pes_id, (byte)(8), (byte)(0), ".", "")))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( localUtil.format(A22st_data_admissao, "99/99/9999"))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( localUtil.format(A23st_data_demissao, "99/99/9999"))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtst_data_demissao_Internalname, "Link", edtst_data_demissao_Link, !bGXsfl_44_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtst_data_demissao_Internalname,localUtil.format(A23st_data_demissao, "99/99/9999"),localUtil.format( A23st_data_demissao, "99/99/9999"),"","'"+""+"'"+",false,"+"'"+""+"'",edtst_data_demissao_Link,"","","",edtst_data_demissao_Jsonclick,Integer.valueOf(0),"DescriptionAttribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","end",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes0T2( ) ;
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_44_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_44_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_44_idx+1) ;
         sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_442( ) ;
      }
      /* End function sendrow_442 */
   }

   public void startgridcontrol44( )
   {
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"44\">") ;
         sStyleString = "" ;
         com.projetopratico.GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "PromptGrid", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGrid1_Backcolorstyle == 0 )
         {
            subGrid1_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGrid1_Class) > 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Title" ;
            }
         }
         else
         {
            subGrid1_Titlebackstyle = (byte)(1) ;
            if ( subGrid1_Backcolorstyle == 1 )
            {
               subGrid1_Titlebackcolor = subGrid1_Allbackcolor ;
               if ( GXutil.len( subGrid1_Class) > 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGrid1_Class) > 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"SelectionAttribute"+" "+((GXutil.strcmp(edtavLinkselection_gximage, "")==0) ? "" : "GX_Image_"+edtavLinkselection_gximage+"_Class")+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"end"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "pes_id") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"end"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "st_data_admissao") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"end"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "st_data_demissao") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Grid1Container.AddObjectProperty("GridName", "Grid1");
      }
      else
      {
         if ( isAjaxCallMode( ) )
         {
            Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
         }
         else
         {
            Grid1Container.Clear();
         }
         Grid1Container.SetWrapped(nGXWrapped);
         Grid1Container.AddObjectProperty("GridName", "Grid1");
         Grid1Container.AddObjectProperty("Header", subGrid1_Header);
         Grid1Container.AddObjectProperty("Class", "PromptGrid");
         Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("CmpContext", "");
         Grid1Container.AddObjectProperty("InMasterPage", "false");
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV5LinkSelection));
         Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtavLinkselection_Link));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", WebUtils.htmlEncode( GXutil.ltrim( localUtil.ntoc( A1pes_id, (byte)(8), (byte)(0), ".", ""))));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", WebUtils.htmlEncode( localUtil.format(A22st_data_admissao, "99/99/9999")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", WebUtils.htmlEncode( localUtil.format(A23st_data_demissao, "99/99/9999")));
         Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtst_data_demissao_Link));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      lblLblpes_idfilter_Internalname = "LBLPES_IDFILTER" ;
      edtavCpes_id_Internalname = "vCPES_ID" ;
      divPes_idfiltercontainer_Internalname = "PES_IDFILTERCONTAINER" ;
      lblLblst_data_admissaofilter_Internalname = "LBLST_DATA_ADMISSAOFILTER" ;
      edtavCst_data_admissao_Internalname = "vCST_DATA_ADMISSAO" ;
      divSt_data_admissaofiltercontainer_Internalname = "ST_DATA_ADMISSAOFILTERCONTAINER" ;
      lblLblst_data_demissaofilter_Internalname = "LBLST_DATA_DEMISSAOFILTER" ;
      edtavCst_data_demissao_Internalname = "vCST_DATA_DEMISSAO" ;
      divSt_data_demissaofiltercontainer_Internalname = "ST_DATA_DEMISSAOFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtpes_id_Internalname = "PES_ID" ;
      edtst_data_admissao_Internalname = "ST_DATA_ADMISSAO" ;
      edtst_data_demissao_Internalname = "ST_DATA_DEMISSAO" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      divGridtable_Internalname = "GRIDTABLE" ;
      divMain_Internalname = "MAIN" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
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
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      subGrid1_Header = "" ;
      edtst_data_demissao_Jsonclick = "" ;
      edtst_data_demissao_Link = "" ;
      edtst_data_admissao_Jsonclick = "" ;
      edtpes_id_Jsonclick = "" ;
      edtavLinkselection_gximage = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtst_data_demissao_Enabled = 0 ;
      edtst_data_admissao_Enabled = 0 ;
      edtpes_id_Enabled = 0 ;
      edtavCst_data_demissao_Jsonclick = "" ;
      edtavCst_data_demissao_Enabled = 1 ;
      edtavCst_data_admissao_Jsonclick = "" ;
      edtavCst_data_admissao_Enabled = 1 ;
      edtavCpes_id_Jsonclick = "" ;
      edtavCpes_id_Enabled = 1 ;
      edtavCpes_id_Visible = 1 ;
      divPes_idfiltercontainer_Class = "AdvancedContainerItem AdvancedContainerItemExpanded" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List servidor_temporario" );
      subGrid1_Rows = 10 ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cpes_id',fld:'vCPES_ID',pic:'ZZZZZZZ9'},{av:'AV7cst_data_admissao',fld:'vCST_DATA_ADMISSAO',pic:''},{av:'AV8cst_data_demissao',fld:'vCST_DATA_DEMISSAO',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e120T1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]");
      setEventMetadata("'TOGGLE'",",oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLPES_IDFILTER.CLICK","{handler:'e110T1',iparms:[{av:'divPes_idfiltercontainer_Class',ctrl:'PES_IDFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLPES_IDFILTER.CLICK",",oparms:[{av:'divPes_idfiltercontainer_Class',ctrl:'PES_IDFILTERCONTAINER',prop:'Class'},{av:'edtavCpes_id_Visible',ctrl:'vCPES_ID',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e150T2',iparms:[{av:'A1pes_id',fld:'PES_ID',pic:'ZZZZZZZ9',hsh:true},{av:'A22st_data_admissao',fld:'ST_DATA_ADMISSAO',pic:'',hsh:true},{av:'A23st_data_demissao',fld:'ST_DATA_DEMISSAO',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV9ppes_id',fld:'vPPES_ID',pic:'ZZZZZZZ9'},{av:'AV10pst_data_admissao',fld:'vPST_DATA_ADMISSAO',pic:''},{av:'AV11pst_data_demissao',fld:'vPST_DATA_DEMISSAO',pic:''}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cpes_id',fld:'vCPES_ID',pic:'ZZZZZZZ9'},{av:'AV7cst_data_admissao',fld:'vCST_DATA_ADMISSAO',pic:''},{av:'AV8cst_data_demissao',fld:'vCST_DATA_DEMISSAO',pic:''}]");
      setEventMetadata("GRID1_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cpes_id',fld:'vCPES_ID',pic:'ZZZZZZZ9'},{av:'AV7cst_data_admissao',fld:'vCST_DATA_ADMISSAO',pic:''},{av:'AV8cst_data_demissao',fld:'vCST_DATA_DEMISSAO',pic:''}]");
      setEventMetadata("GRID1_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cpes_id',fld:'vCPES_ID',pic:'ZZZZZZZ9'},{av:'AV7cst_data_admissao',fld:'vCST_DATA_ADMISSAO',pic:''},{av:'AV8cst_data_demissao',fld:'vCST_DATA_DEMISSAO',pic:''}]");
      setEventMetadata("GRID1_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cpes_id',fld:'vCPES_ID',pic:'ZZZZZZZ9'},{av:'AV7cst_data_admissao',fld:'vCST_DATA_ADMISSAO',pic:''},{av:'AV8cst_data_demissao',fld:'vCST_DATA_DEMISSAO',pic:''}]");
      setEventMetadata("GRID1_LASTPAGE",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_St_data_demissao',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV10pst_data_admissao = GXutil.nullDate() ;
      AV11pst_data_demissao = GXutil.nullDate() ;
      AV7cst_data_admissao = GXutil.nullDate() ;
      AV8cst_data_demissao = GXutil.nullDate() ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblpes_idfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblst_data_admissaofilter_Jsonclick = "" ;
      lblLblst_data_demissaofilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV5LinkSelection = "" ;
      AV13Linkselection_GXI = "" ;
      A22st_data_admissao = GXutil.nullDate() ;
      A23st_data_demissao = GXutil.nullDate() ;
      H000T2_A23st_data_demissao = new java.util.Date[] {GXutil.nullDate()} ;
      H000T2_A22st_data_admissao = new java.util.Date[] {GXutil.nullDate()} ;
      H000T2_A1pes_id = new int[1] ;
      H000T3_AGRID1_nRecordCount = new long[1] ;
      AV12ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid1_Linesclass = "" ;
      sImgUrl = "" ;
      ROClassString = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.gx00a0__default(),
         new Object[] {
             new Object[] {
            H000T2_A23st_data_demissao, H000T2_A22st_data_admissao, H000T2_A1pes_id
            }
            , new Object[] {
            H000T3_AGRID1_nRecordCount
            }
         }
      );
      /* GeneXus formulas. */
   }

   private byte GRID1_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private int nRC_GXsfl_44 ;
   private int subGrid1_Rows ;
   private int AV9ppes_id ;
   private int nGXsfl_44_idx=1 ;
   private int AV6cpes_id ;
   private int edtavCpes_id_Enabled ;
   private int edtavCpes_id_Visible ;
   private int edtavCst_data_admissao_Enabled ;
   private int edtavCst_data_demissao_Enabled ;
   private int A1pes_id ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int edtpes_id_Enabled ;
   private int edtst_data_admissao_Enabled ;
   private int edtst_data_demissao_Enabled ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divPes_idfiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_44_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divPes_idfiltercontainer_Internalname ;
   private String lblLblpes_idfilter_Internalname ;
   private String lblLblpes_idfilter_Jsonclick ;
   private String edtavCpes_id_Internalname ;
   private String TempTags ;
   private String edtavCpes_id_Jsonclick ;
   private String divSt_data_admissaofiltercontainer_Internalname ;
   private String lblLblst_data_admissaofilter_Internalname ;
   private String lblLblst_data_admissaofilter_Jsonclick ;
   private String edtavCst_data_admissao_Internalname ;
   private String edtavCst_data_admissao_Jsonclick ;
   private String divSt_data_demissaofiltercontainer_Internalname ;
   private String lblLblst_data_demissaofilter_Internalname ;
   private String lblLblst_data_demissaofilter_Jsonclick ;
   private String edtavCst_data_demissao_Internalname ;
   private String edtavCst_data_demissao_Jsonclick ;
   private String divGridtable_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtntoggle_Internalname ;
   private String bttBtntoggle_Jsonclick ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtpes_id_Internalname ;
   private String edtst_data_admissao_Internalname ;
   private String edtst_data_demissao_Internalname ;
   private String AV12ADVANCED_LABEL_TEMPLATE ;
   private String edtavLinkselection_gximage ;
   private String sGXsfl_44_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String edtavLinkselection_Link ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtpes_id_Jsonclick ;
   private String edtst_data_admissao_Jsonclick ;
   private String edtst_data_demissao_Link ;
   private String edtst_data_demissao_Jsonclick ;
   private String subGrid1_Header ;
   private java.util.Date AV10pst_data_admissao ;
   private java.util.Date AV11pst_data_demissao ;
   private java.util.Date AV7cst_data_admissao ;
   private java.util.Date AV8cst_data_demissao ;
   private java.util.Date A22st_data_admissao ;
   private java.util.Date A23st_data_demissao ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_44_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV13Linkselection_GXI ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXWebForm Form ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] H000T2_A23st_data_demissao ;
   private java.util.Date[] H000T2_A22st_data_admissao ;
   private int[] H000T2_A1pes_id ;
   private long[] H000T3_AGRID1_nRecordCount ;
}

final  class gx00a0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000T2", "SELECT st_data_demissao, st_data_admissao, pes_id FROM servidor_temporario WHERE pes_id >= ? and st_data_admissao >= ? and st_data_demissao >= ? ORDER BY pes_id, st_data_admissao, st_data_demissao  OFFSET ? LIMIT CASE WHEN ? > 0 THEN ? ELSE 1e9 END",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H000T3", "SELECT COUNT(*) FROM servidor_temporario WHERE pes_id >= ? and st_data_admissao >= ? and st_data_demissao >= ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[0])[0] = rslt.getLong(1);
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
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
      }
   }

}

