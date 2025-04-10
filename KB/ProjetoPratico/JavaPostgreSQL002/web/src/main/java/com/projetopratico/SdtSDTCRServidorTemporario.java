package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTCRServidorTemporario extends GxUserType
{
   public SdtSDTCRServidorTemporario( )
   {
      this(  new ModelContext(SdtSDTCRServidorTemporario.class));
   }

   public SdtSDTCRServidorTemporario( ModelContext context )
   {
      super( context, "SdtSDTCRServidorTemporario");
   }

   public SdtSDTCRServidorTemporario( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTCRServidorTemporario");
   }

   public SdtSDTCRServidorTemporario( StructSdtSDTCRServidorTemporario struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_id") )
            {
               gxTv_SdtSDTCRServidorTemporario_Pes_id = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "st_data_admissao") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTCRServidorTemporario_St_data_admissao = GXutil.nullDate() ;
                  gxTv_SdtSDTCRServidorTemporario_St_data_admissao_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTCRServidorTemporario_St_data_admissao_N = (byte)(0) ;
                  gxTv_SdtSDTCRServidorTemporario_St_data_admissao = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
                  gxTv_SdtSDTCRServidorTemporario_St_data_demissao = GXutil.nullDate() ;
                  gxTv_SdtSDTCRServidorTemporario_St_data_demissao_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTCRServidorTemporario_St_data_demissao_N = (byte)(0) ;
                  gxTv_SdtSDTCRServidorTemporario_St_data_demissao = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
               gxTv_SdtSDTCRServidorTemporario_Pes_nome = oReader.getValue() ;
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
                  gxTv_SdtSDTCRServidorTemporario_Pes_data_nascimento = GXutil.nullDate() ;
                  gxTv_SdtSDTCRServidorTemporario_Pes_data_nascimento_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTCRServidorTemporario_Pes_data_nascimento_N = (byte)(0) ;
                  gxTv_SdtSDTCRServidorTemporario_Pes_data_nascimento = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
               gxTv_SdtSDTCRServidorTemporario_Pes_sexo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_mae") )
            {
               gxTv_SdtSDTCRServidorTemporario_Pes_mae = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_pai") )
            {
               gxTv_SdtSDTCRServidorTemporario_Pes_pai = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "endereco") )
            {
               if ( gxTv_SdtSDTCRServidorTemporario_Endereco == null )
               {
                  gxTv_SdtSDTCRServidorTemporario_Endereco = new GXBaseCollection<com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem>(com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem.class, "SDTCRServidorTemporario.enderecoItem", "ProjetoPratico", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTCRServidorTemporario_Endereco.readxmlcollection(oReader, "endereco", "enderecoItem") ;
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
         sName = "SDTCRServidorTemporario" ;
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
      oWriter.writeElement("pes_id", GXutil.trim( GXutil.str( gxTv_SdtSDTCRServidorTemporario_Pes_id, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTCRServidorTemporario_St_data_admissao)) && ( gxTv_SdtSDTCRServidorTemporario_St_data_admissao_N == 1 ) )
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
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTCRServidorTemporario_St_data_admissao), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTCRServidorTemporario_St_data_admissao), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTCRServidorTemporario_St_data_admissao), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("st_data_admissao", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTCRServidorTemporario_St_data_demissao)) && ( gxTv_SdtSDTCRServidorTemporario_St_data_demissao_N == 1 ) )
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
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTCRServidorTemporario_St_data_demissao), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTCRServidorTemporario_St_data_demissao), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTCRServidorTemporario_St_data_demissao), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("st_data_demissao", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
      }
      oWriter.writeElement("pes_nome", gxTv_SdtSDTCRServidorTemporario_Pes_nome);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTCRServidorTemporario_Pes_data_nascimento)) && ( gxTv_SdtSDTCRServidorTemporario_Pes_data_nascimento_N == 1 ) )
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
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTCRServidorTemporario_Pes_data_nascimento), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTCRServidorTemporario_Pes_data_nascimento), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTCRServidorTemporario_Pes_data_nascimento), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("pes_data_nascimento", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
      }
      oWriter.writeElement("pes_sexo", gxTv_SdtSDTCRServidorTemporario_Pes_sexo);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("pes_mae", gxTv_SdtSDTCRServidorTemporario_Pes_mae);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("pes_pai", gxTv_SdtSDTCRServidorTemporario_Pes_pai);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      if ( gxTv_SdtSDTCRServidorTemporario_Endereco != null )
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
         gxTv_SdtSDTCRServidorTemporario_Endereco.writexmlcollection(oWriter, "endereco", sNameSpace1, "enderecoItem", sNameSpace1);
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
      AddObjectProperty("pes_id", gxTv_SdtSDTCRServidorTemporario_Pes_id, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTCRServidorTemporario_St_data_admissao), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTCRServidorTemporario_St_data_admissao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTCRServidorTemporario_St_data_admissao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("st_data_admissao", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTCRServidorTemporario_St_data_demissao), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTCRServidorTemporario_St_data_demissao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTCRServidorTemporario_St_data_demissao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("st_data_demissao", sDateCnv, false, false);
      AddObjectProperty("pes_nome", gxTv_SdtSDTCRServidorTemporario_Pes_nome, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTCRServidorTemporario_Pes_data_nascimento), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTCRServidorTemporario_Pes_data_nascimento), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTCRServidorTemporario_Pes_data_nascimento), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("pes_data_nascimento", sDateCnv, false, false);
      AddObjectProperty("pes_sexo", gxTv_SdtSDTCRServidorTemporario_Pes_sexo, false, false);
      AddObjectProperty("pes_mae", gxTv_SdtSDTCRServidorTemporario_Pes_mae, false, false);
      AddObjectProperty("pes_pai", gxTv_SdtSDTCRServidorTemporario_Pes_pai, false, false);
      if ( gxTv_SdtSDTCRServidorTemporario_Endereco != null )
      {
         AddObjectProperty("endereco", gxTv_SdtSDTCRServidorTemporario_Endereco, false, false);
      }
   }

   public int getgxTv_SdtSDTCRServidorTemporario_Pes_id( )
   {
      return gxTv_SdtSDTCRServidorTemporario_Pes_id ;
   }

   public void setgxTv_SdtSDTCRServidorTemporario_Pes_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorTemporario_Pes_id = value ;
   }

   public java.util.Date getgxTv_SdtSDTCRServidorTemporario_St_data_admissao( )
   {
      return gxTv_SdtSDTCRServidorTemporario_St_data_admissao ;
   }

   public void setgxTv_SdtSDTCRServidorTemporario_St_data_admissao( java.util.Date value )
   {
      gxTv_SdtSDTCRServidorTemporario_St_data_admissao_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorTemporario_St_data_admissao = value ;
   }

   public java.util.Date getgxTv_SdtSDTCRServidorTemporario_St_data_demissao( )
   {
      return gxTv_SdtSDTCRServidorTemporario_St_data_demissao ;
   }

   public void setgxTv_SdtSDTCRServidorTemporario_St_data_demissao( java.util.Date value )
   {
      gxTv_SdtSDTCRServidorTemporario_St_data_demissao_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorTemporario_St_data_demissao = value ;
   }

   public String getgxTv_SdtSDTCRServidorTemporario_Pes_nome( )
   {
      return gxTv_SdtSDTCRServidorTemporario_Pes_nome ;
   }

   public void setgxTv_SdtSDTCRServidorTemporario_Pes_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorTemporario_Pes_nome = value ;
   }

   public java.util.Date getgxTv_SdtSDTCRServidorTemporario_Pes_data_nascimento( )
   {
      return gxTv_SdtSDTCRServidorTemporario_Pes_data_nascimento ;
   }

   public void setgxTv_SdtSDTCRServidorTemporario_Pes_data_nascimento( java.util.Date value )
   {
      gxTv_SdtSDTCRServidorTemporario_Pes_data_nascimento_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorTemporario_Pes_data_nascimento = value ;
   }

   public String getgxTv_SdtSDTCRServidorTemporario_Pes_sexo( )
   {
      return gxTv_SdtSDTCRServidorTemporario_Pes_sexo ;
   }

   public void setgxTv_SdtSDTCRServidorTemporario_Pes_sexo( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorTemporario_Pes_sexo = value ;
   }

   public String getgxTv_SdtSDTCRServidorTemporario_Pes_mae( )
   {
      return gxTv_SdtSDTCRServidorTemporario_Pes_mae ;
   }

   public void setgxTv_SdtSDTCRServidorTemporario_Pes_mae( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorTemporario_Pes_mae = value ;
   }

   public String getgxTv_SdtSDTCRServidorTemporario_Pes_pai( )
   {
      return gxTv_SdtSDTCRServidorTemporario_Pes_pai ;
   }

   public void setgxTv_SdtSDTCRServidorTemporario_Pes_pai( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorTemporario_Pes_pai = value ;
   }

   public GXBaseCollection<com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem> getgxTv_SdtSDTCRServidorTemporario_Endereco( )
   {
      if ( gxTv_SdtSDTCRServidorTemporario_Endereco == null )
      {
         gxTv_SdtSDTCRServidorTemporario_Endereco = new GXBaseCollection<com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem>(com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem.class, "SDTCRServidorTemporario.enderecoItem", "ProjetoPratico", remoteHandle);
      }
      gxTv_SdtSDTCRServidorTemporario_Endereco_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      return gxTv_SdtSDTCRServidorTemporario_Endereco ;
   }

   public void setgxTv_SdtSDTCRServidorTemporario_Endereco( GXBaseCollection<com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem> value )
   {
      gxTv_SdtSDTCRServidorTemporario_Endereco_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorTemporario_Endereco = value ;
   }

   public void setgxTv_SdtSDTCRServidorTemporario_Endereco_SetNull( )
   {
      gxTv_SdtSDTCRServidorTemporario_Endereco_N = (byte)(1) ;
      gxTv_SdtSDTCRServidorTemporario_Endereco = null ;
   }

   public boolean getgxTv_SdtSDTCRServidorTemporario_Endereco_IsNull( )
   {
      if ( gxTv_SdtSDTCRServidorTemporario_Endereco == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTCRServidorTemporario_Endereco_N( )
   {
      return gxTv_SdtSDTCRServidorTemporario_Endereco_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      sdtIsNull = (byte)(1) ;
      gxTv_SdtSDTCRServidorTemporario_St_data_admissao = GXutil.nullDate() ;
      gxTv_SdtSDTCRServidorTemporario_St_data_admissao_N = (byte)(1) ;
      gxTv_SdtSDTCRServidorTemporario_St_data_demissao = GXutil.nullDate() ;
      gxTv_SdtSDTCRServidorTemporario_St_data_demissao_N = (byte)(1) ;
      gxTv_SdtSDTCRServidorTemporario_Pes_nome = "" ;
      gxTv_SdtSDTCRServidorTemporario_Pes_data_nascimento = GXutil.nullDate() ;
      gxTv_SdtSDTCRServidorTemporario_Pes_data_nascimento_N = (byte)(1) ;
      gxTv_SdtSDTCRServidorTemporario_Pes_sexo = "" ;
      gxTv_SdtSDTCRServidorTemporario_Pes_mae = "" ;
      gxTv_SdtSDTCRServidorTemporario_Pes_pai = "" ;
      gxTv_SdtSDTCRServidorTemporario_Endereco_N = (byte)(1) ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public com.projetopratico.SdtSDTCRServidorTemporario Clone( )
   {
      return (com.projetopratico.SdtSDTCRServidorTemporario)(clone()) ;
   }

   public void setStruct( com.projetopratico.StructSdtSDTCRServidorTemporario struct )
   {
      if ( struct != null )
      {
         setgxTv_SdtSDTCRServidorTemporario_Pes_id(struct.getPes_id());
         if ( struct.gxTv_SdtSDTCRServidorTemporario_St_data_admissao_N == 0 )
         {
            setgxTv_SdtSDTCRServidorTemporario_St_data_admissao(struct.getSt_data_admissao());
         }
         if ( struct.gxTv_SdtSDTCRServidorTemporario_St_data_demissao_N == 0 )
         {
            setgxTv_SdtSDTCRServidorTemporario_St_data_demissao(struct.getSt_data_demissao());
         }
         setgxTv_SdtSDTCRServidorTemporario_Pes_nome(struct.getPes_nome());
         if ( struct.gxTv_SdtSDTCRServidorTemporario_Pes_data_nascimento_N == 0 )
         {
            setgxTv_SdtSDTCRServidorTemporario_Pes_data_nascimento(struct.getPes_data_nascimento());
         }
         setgxTv_SdtSDTCRServidorTemporario_Pes_sexo(struct.getPes_sexo());
         setgxTv_SdtSDTCRServidorTemporario_Pes_mae(struct.getPes_mae());
         setgxTv_SdtSDTCRServidorTemporario_Pes_pai(struct.getPes_pai());
         GXBaseCollection<com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem> gxTv_SdtSDTCRServidorTemporario_Endereco_aux = new GXBaseCollection<com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem>(com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem.class, "SDTCRServidorTemporario.enderecoItem", "ProjetoPratico", remoteHandle);
         Vector<com.projetopratico.StructSdtSDTCRServidorTemporario_enderecoItem> gxTv_SdtSDTCRServidorTemporario_Endereco_aux1 = struct.getEndereco();
         if (gxTv_SdtSDTCRServidorTemporario_Endereco_aux1 != null)
         {
            for (int i = 0; i < gxTv_SdtSDTCRServidorTemporario_Endereco_aux1.size(); i++)
            {
               gxTv_SdtSDTCRServidorTemporario_Endereco_aux.add(new com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem(gxTv_SdtSDTCRServidorTemporario_Endereco_aux1.elementAt(i)));
            }
         }
         setgxTv_SdtSDTCRServidorTemporario_Endereco(gxTv_SdtSDTCRServidorTemporario_Endereco_aux);
      }
   }

   @SuppressWarnings("unchecked")
   public com.projetopratico.StructSdtSDTCRServidorTemporario getStruct( )
   {
      com.projetopratico.StructSdtSDTCRServidorTemporario struct = new com.projetopratico.StructSdtSDTCRServidorTemporario ();
      struct.setPes_id(getgxTv_SdtSDTCRServidorTemporario_Pes_id());
      if ( gxTv_SdtSDTCRServidorTemporario_St_data_admissao_N == 0 )
      {
         struct.setSt_data_admissao(getgxTv_SdtSDTCRServidorTemporario_St_data_admissao());
      }
      if ( gxTv_SdtSDTCRServidorTemporario_St_data_demissao_N == 0 )
      {
         struct.setSt_data_demissao(getgxTv_SdtSDTCRServidorTemporario_St_data_demissao());
      }
      struct.setPes_nome(getgxTv_SdtSDTCRServidorTemporario_Pes_nome());
      if ( gxTv_SdtSDTCRServidorTemporario_Pes_data_nascimento_N == 0 )
      {
         struct.setPes_data_nascimento(getgxTv_SdtSDTCRServidorTemporario_Pes_data_nascimento());
      }
      struct.setPes_sexo(getgxTv_SdtSDTCRServidorTemporario_Pes_sexo());
      struct.setPes_mae(getgxTv_SdtSDTCRServidorTemporario_Pes_mae());
      struct.setPes_pai(getgxTv_SdtSDTCRServidorTemporario_Pes_pai());
      struct.setEndereco(getgxTv_SdtSDTCRServidorTemporario_Endereco().getStruct());
      return struct ;
   }

   protected byte sdtIsNull ;
   protected byte gxTv_SdtSDTCRServidorTemporario_St_data_admissao_N ;
   protected byte gxTv_SdtSDTCRServidorTemporario_St_data_demissao_N ;
   protected byte gxTv_SdtSDTCRServidorTemporario_Pes_data_nascimento_N ;
   protected byte gxTv_SdtSDTCRServidorTemporario_Endereco_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTCRServidorTemporario_Pes_id ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTCRServidorTemporario_St_data_admissao ;
   protected java.util.Date gxTv_SdtSDTCRServidorTemporario_St_data_demissao ;
   protected java.util.Date gxTv_SdtSDTCRServidorTemporario_Pes_data_nascimento ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTCRServidorTemporario_Pes_nome ;
   protected String gxTv_SdtSDTCRServidorTemporario_Pes_sexo ;
   protected String gxTv_SdtSDTCRServidorTemporario_Pes_mae ;
   protected String gxTv_SdtSDTCRServidorTemporario_Pes_pai ;
   protected GXBaseCollection<com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem> gxTv_SdtSDTCRServidorTemporario_Endereco=null ;
   protected GXBaseCollection<com.projetopratico.SdtSDTCRServidorTemporario_enderecoItem> gxTv_SdtSDTCRServidorTemporario_Endereco_aux ;
}

