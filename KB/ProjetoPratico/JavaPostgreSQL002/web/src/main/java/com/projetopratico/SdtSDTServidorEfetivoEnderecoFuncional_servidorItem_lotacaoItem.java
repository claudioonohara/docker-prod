package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem extends GxUserType
{
   public SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem( )
   {
      this(  new ModelContext(SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem.class));
   }

   public SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem( ModelContext context )
   {
      super( context, "SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem");
   }

   public SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem( int remoteHandle ,
                                                                           ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem");
   }

   public SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem( StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem struct )
   {
      this();
      setStruct(struct);
   }

   private static java.util.HashMap mapper = new java.util.HashMap();
   static
   {
   }

   public String getJsonMap( String value )
   {
      return (String) mapper.get(value);
   }

   public short readxml( com.genexus.xml.XMLReader oReader ,
                         String sName )
   {
      short GXSoapError = 1;
      formatError = false ;
      sTagName = oReader.getName() ;
      if ( oReader.getIsSimple() == 0 )
      {
         GXSoapError = oReader.read() ;
         nOutParmCount = (short)(0) ;
         while ( ( ( GXutil.strcmp(oReader.getName(), sTagName) != 0 ) || ( oReader.getNodeType() == 1 ) ) && ( GXSoapError > 0 ) )
         {
            readOk = (short)(0) ;
            readElement = false ;
            if ( GXutil.strcmp2( oReader.getLocalName(), "lot_id") )
            {
               gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_id = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "lot_data_lotacao") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao = GXutil.nullDate() ;
                  gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao_N = (byte)(0) ;
                  gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "lot_data_remocao") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao = GXutil.nullDate() ;
                  gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao_N = (byte)(0) ;
                  gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_id") )
            {
               gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_id = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_nome") )
            {
               gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_nome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_sigla") )
            {
               gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_sigla = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "endereco") )
            {
               if ( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco == null )
               {
                  gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco = new GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem>(com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem.class, "SDTServidorEfetivoEnderecoFuncional.servidorItem.lotacaoItem.enderecoItem", "ProjetoPratico", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco.readxmlcollection(oReader, "endereco", "enderecoItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "endereco") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( ! readElement )
            {
               readOk = (short)(1) ;
               GXSoapError = oReader.read() ;
            }
            nOutParmCount = (short)(nOutParmCount+1) ;
            if ( ( readOk == 0 ) || formatError )
            {
               context.globals.sSOAPErrMsg += "Error reading " + sTagName + GXutil.newLine( ) ;
               context.globals.sSOAPErrMsg += "Message: " + oReader.readRawXML() ;
               GXSoapError = (short)(nOutParmCount*-1) ;
            }
         }
      }
      return GXSoapError ;
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace )
   {
      writexml(oWriter, sName, sNameSpace, true);
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace ,
                         boolean sIncludeState )
   {
      if ( (GXutil.strcmp("", sName)==0) )
      {
         sName = "SDTServidorEfetivoEnderecoFuncional.servidorItem.lotacaoItem" ;
      }
      oWriter.writeStartElement(sName);
      if ( GXutil.strcmp(GXutil.left( sNameSpace, 10), "[*:nosend]") != 0 )
      {
         oWriter.writeAttribute("xmlns", sNameSpace);
      }
      else
      {
         sNameSpace = GXutil.right( sNameSpace, GXutil.len( sNameSpace)-10) ;
      }
      oWriter.writeElement("lot_id", GXutil.trim( GXutil.str( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_id, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao)) && ( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao_N == 1 ) )
      {
         oWriter.writeElement("lot_data_lotacao", "");
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("lot_data_lotacao", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao)) && ( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao_N == 1 ) )
      {
         oWriter.writeElement("lot_data_remocao", "");
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("lot_data_remocao", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
      }
      oWriter.writeElement("unid_id", GXutil.trim( GXutil.str( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_id, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("unid_nome", gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_nome);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("unid_sigla", gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_sigla);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      if ( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco != null )
      {
         String sNameSpace1;
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "ProjetoPratico" ;
         }
         else
         {
            sNameSpace1 = "ProjetoPratico" ;
         }
         gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco.writexmlcollection(oWriter, "endereco", sNameSpace1, "enderecoItem", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public long getnumericvalue( String value )
   {
      if ( GXutil.notNumeric( value) )
      {
         formatError = true ;
      }
      return GXutil.lval( value) ;
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      tojson( includeState, true) ;
   }

   public void tojson( boolean includeState ,
                       boolean includeNonInitialized )
   {
      AddObjectProperty("lot_id", gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_id, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("lot_data_lotacao", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("lot_data_remocao", sDateCnv, false, false);
      AddObjectProperty("unid_id", gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_id, false, false);
      AddObjectProperty("unid_nome", gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_nome, false, false);
      AddObjectProperty("unid_sigla", gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_sigla, false, false);
      if ( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco != null )
      {
         AddObjectProperty("endereco", gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco, false, false);
      }
   }

   public int getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_id( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_id ;
   }

   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_id = value ;
   }

   public java.util.Date getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao ;
   }

   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao( java.util.Date value )
   {
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao = value ;
   }

   public java.util.Date getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao ;
   }

   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao( java.util.Date value )
   {
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao = value ;
   }

   public int getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_id( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_id ;
   }

   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_id = value ;
   }

   public String getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_nome( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_nome ;
   }

   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_nome = value ;
   }

   public String getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_sigla( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_sigla ;
   }

   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_sigla( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_sigla = value ;
   }

   public GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem> getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco( )
   {
      if ( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco == null )
      {
         gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco = new GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem>(com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem.class, "SDTServidorEfetivoEnderecoFuncional.servidorItem.lotacaoItem.enderecoItem", "ProjetoPratico", remoteHandle);
      }
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco ;
   }

   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco( GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem> value )
   {
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco = value ;
   }

   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco_SetNull( )
   {
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco_N = (byte)(1) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco = null ;
   }

   public boolean getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco_IsNull( )
   {
      if ( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco_N( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      sdtIsNull = (byte)(1) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao = GXutil.nullDate() ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao_N = (byte)(1) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao = GXutil.nullDate() ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao_N = (byte)(1) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_nome = "" ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_sigla = "" ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco_N = (byte)(1) ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem Clone( )
   {
      return (com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem)(clone()) ;
   }

   public void setStruct( com.projetopratico.StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem struct )
   {
      if ( struct != null )
      {
         setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_id(struct.getLot_id());
         if ( struct.gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao_N == 0 )
         {
            setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao(struct.getLot_data_lotacao());
         }
         if ( struct.gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao_N == 0 )
         {
            setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao(struct.getLot_data_remocao());
         }
         setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_id(struct.getUnid_id());
         setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_nome(struct.getUnid_nome());
         setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_sigla(struct.getUnid_sigla());
         GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem> gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco_aux = new GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem>(com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem.class, "SDTServidorEfetivoEnderecoFuncional.servidorItem.lotacaoItem.enderecoItem", "ProjetoPratico", remoteHandle);
         Vector<com.projetopratico.StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem> gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco_aux1 = struct.getEndereco();
         if (gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco_aux1 != null)
         {
            for (int i = 0; i < gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco_aux1.size(); i++)
            {
               gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco_aux.add(new com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem(gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco_aux1.elementAt(i)));
            }
         }
         setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco(gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco_aux);
      }
   }

   @SuppressWarnings("unchecked")
   public com.projetopratico.StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem getStruct( )
   {
      com.projetopratico.StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem struct = new com.projetopratico.StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem ();
      struct.setLot_id(getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_id());
      if ( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao_N == 0 )
      {
         struct.setLot_data_lotacao(getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao());
      }
      if ( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao_N == 0 )
      {
         struct.setLot_data_remocao(getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao());
      }
      struct.setUnid_id(getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_id());
      struct.setUnid_nome(getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_nome());
      struct.setUnid_sigla(getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_sigla());
      struct.setEndereco(getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco().getStruct());
      return struct ;
   }

   protected byte sdtIsNull ;
   protected byte gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao_N ;
   protected byte gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao_N ;
   protected byte gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_id ;
   protected int gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_id ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_lotacao ;
   protected java.util.Date gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Lot_data_remocao ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_nome ;
   protected String gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Unid_sigla ;
   protected GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem> gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco=null ;
   protected GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem> gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_Endereco_aux ;
}

