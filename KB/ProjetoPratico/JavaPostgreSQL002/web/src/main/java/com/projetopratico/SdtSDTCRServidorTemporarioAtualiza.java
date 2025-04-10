package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTCRServidorTemporarioAtualiza extends GxUserType
{
   public SdtSDTCRServidorTemporarioAtualiza( )
   {
      this(  new ModelContext(SdtSDTCRServidorTemporarioAtualiza.class));
   }

   public SdtSDTCRServidorTemporarioAtualiza( ModelContext context )
   {
      super( context, "SdtSDTCRServidorTemporarioAtualiza");
   }

   public SdtSDTCRServidorTemporarioAtualiza( int remoteHandle ,
                                              ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTCRServidorTemporarioAtualiza");
   }

   public SdtSDTCRServidorTemporarioAtualiza( StructSdtSDTCRServidorTemporarioAtualiza struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "st_data_admissao") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao = GXutil.nullDate() ;
                  gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao_N = (byte)(0) ;
                  gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "st_data_demissao") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao = GXutil.nullDate() ;
                  gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao_N = (byte)(0) ;
                  gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_nome") )
            {
               gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_nome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_data_nascimento") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento = GXutil.nullDate() ;
                  gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento_N = (byte)(0) ;
                  gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_sexo") )
            {
               gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_sexo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_mae") )
            {
               gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_mae = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_pai") )
            {
               gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_pai = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "endereco") )
            {
               if ( gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco == null )
               {
                  gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco = new GXBaseCollection<com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem>(com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem.class, "SDTCRServidorTemporarioAtualiza.enderecoItem", "ProjetoPratico", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco.readxmlcollection(oReader, "endereco", "enderecoItem") ;
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
         sName = "SDTCRServidorTemporarioAtualiza" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "ProjetoPratico" ;
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
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao)) && ( gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao_N == 1 ) )
      {
         oWriter.writeElement("st_data_admissao", "");
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("st_data_admissao", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao)) && ( gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao_N == 1 ) )
      {
         oWriter.writeElement("st_data_demissao", "");
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("st_data_demissao", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
      }
      oWriter.writeElement("pes_nome", gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_nome);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento)) && ( gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento_N == 1 ) )
      {
         oWriter.writeElement("pes_data_nascimento", "");
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("pes_data_nascimento", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
      }
      oWriter.writeElement("pes_sexo", gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_sexo);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("pes_mae", gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_mae);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("pes_pai", gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_pai);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      if ( gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco != null )
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
         gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco.writexmlcollection(oWriter, "endereco", sNameSpace1, "enderecoItem", sNameSpace1);
      }
      oWriter.writeEndElement();
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
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("st_data_admissao", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("st_data_demissao", sDateCnv, false, false);
      AddObjectProperty("pes_nome", gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_nome, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("pes_data_nascimento", sDateCnv, false, false);
      AddObjectProperty("pes_sexo", gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_sexo, false, false);
      AddObjectProperty("pes_mae", gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_mae, false, false);
      AddObjectProperty("pes_pai", gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_pai, false, false);
      if ( gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco != null )
      {
         AddObjectProperty("endereco", gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco, false, false);
      }
   }

   public java.util.Date getgxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao( )
   {
      return gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao ;
   }

   public void setgxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao( java.util.Date value )
   {
      gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao = value ;
   }

   public java.util.Date getgxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao( )
   {
      return gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao ;
   }

   public void setgxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao( java.util.Date value )
   {
      gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao = value ;
   }

   public String getgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_nome( )
   {
      return gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_nome ;
   }

   public void setgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_nome = value ;
   }

   public java.util.Date getgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento( )
   {
      return gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento ;
   }

   public void setgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento( java.util.Date value )
   {
      gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento = value ;
   }

   public String getgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_sexo( )
   {
      return gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_sexo ;
   }

   public void setgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_sexo( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_sexo = value ;
   }

   public String getgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_mae( )
   {
      return gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_mae ;
   }

   public void setgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_mae( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_mae = value ;
   }

   public String getgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_pai( )
   {
      return gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_pai ;
   }

   public void setgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_pai( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_pai = value ;
   }

   public GXBaseCollection<com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem> getgxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco( )
   {
      if ( gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco == null )
      {
         gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco = new GXBaseCollection<com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem>(com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem.class, "SDTCRServidorTemporarioAtualiza.enderecoItem", "ProjetoPratico", remoteHandle);
      }
      gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      return gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco ;
   }

   public void setgxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco( GXBaseCollection<com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem> value )
   {
      gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco = value ;
   }

   public void setgxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco_SetNull( )
   {
      gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco_N = (byte)(1) ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco = null ;
   }

   public boolean getgxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco_IsNull( )
   {
      if ( gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco_N( )
   {
      return gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao = GXutil.nullDate() ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao_N = (byte)(1) ;
      sdtIsNull = (byte)(1) ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao = GXutil.nullDate() ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao_N = (byte)(1) ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_nome = "" ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento = GXutil.nullDate() ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento_N = (byte)(1) ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_sexo = "" ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_mae = "" ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_pai = "" ;
      gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco_N = (byte)(1) ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public com.projetopratico.SdtSDTCRServidorTemporarioAtualiza Clone( )
   {
      return (com.projetopratico.SdtSDTCRServidorTemporarioAtualiza)(clone()) ;
   }

   public void setStruct( com.projetopratico.StructSdtSDTCRServidorTemporarioAtualiza struct )
   {
      if ( struct != null )
      {
         if ( struct.gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao_N == 0 )
         {
            setgxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao(struct.getSt_data_admissao());
         }
         if ( struct.gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao_N == 0 )
         {
            setgxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao(struct.getSt_data_demissao());
         }
         setgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_nome(struct.getPes_nome());
         if ( struct.gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento_N == 0 )
         {
            setgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento(struct.getPes_data_nascimento());
         }
         setgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_sexo(struct.getPes_sexo());
         setgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_mae(struct.getPes_mae());
         setgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_pai(struct.getPes_pai());
         GXBaseCollection<com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem> gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco_aux = new GXBaseCollection<com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem>(com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem.class, "SDTCRServidorTemporarioAtualiza.enderecoItem", "ProjetoPratico", remoteHandle);
         Vector<com.projetopratico.StructSdtSDTCRServidorTemporarioAtualiza_enderecoItem> gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco_aux1 = struct.getEndereco();
         if (gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco_aux1 != null)
         {
            for (int i = 0; i < gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco_aux1.size(); i++)
            {
               gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco_aux.add(new com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem(gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco_aux1.elementAt(i)));
            }
         }
         setgxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco(gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco_aux);
      }
   }

   @SuppressWarnings("unchecked")
   public com.projetopratico.StructSdtSDTCRServidorTemporarioAtualiza getStruct( )
   {
      com.projetopratico.StructSdtSDTCRServidorTemporarioAtualiza struct = new com.projetopratico.StructSdtSDTCRServidorTemporarioAtualiza ();
      if ( gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao_N == 0 )
      {
         struct.setSt_data_admissao(getgxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao());
      }
      if ( gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao_N == 0 )
      {
         struct.setSt_data_demissao(getgxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao());
      }
      struct.setPes_nome(getgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_nome());
      if ( gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento_N == 0 )
      {
         struct.setPes_data_nascimento(getgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento());
      }
      struct.setPes_sexo(getgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_sexo());
      struct.setPes_mae(getgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_mae());
      struct.setPes_pai(getgxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_pai());
      struct.setEndereco(getgxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao_N ;
   protected byte sdtIsNull ;
   protected byte gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao_N ;
   protected byte gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento_N ;
   protected byte gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_admissao ;
   protected java.util.Date gxTv_SdtSDTCRServidorTemporarioAtualiza_St_data_demissao ;
   protected java.util.Date gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_data_nascimento ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_nome ;
   protected String gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_sexo ;
   protected String gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_mae ;
   protected String gxTv_SdtSDTCRServidorTemporarioAtualiza_Pes_pai ;
   protected GXBaseCollection<com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem> gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco=null ;
   protected GXBaseCollection<com.projetopratico.SdtSDTCRServidorTemporarioAtualiza_enderecoItem> gxTv_SdtSDTCRServidorTemporarioAtualiza_Endereco_aux ;
}

