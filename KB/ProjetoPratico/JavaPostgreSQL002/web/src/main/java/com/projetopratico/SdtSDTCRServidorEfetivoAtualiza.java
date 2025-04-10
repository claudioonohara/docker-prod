package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTCRServidorEfetivoAtualiza extends GxUserType
{
   public SdtSDTCRServidorEfetivoAtualiza( )
   {
      this(  new ModelContext(SdtSDTCRServidorEfetivoAtualiza.class));
   }

   public SdtSDTCRServidorEfetivoAtualiza( ModelContext context )
   {
      super( context, "SdtSDTCRServidorEfetivoAtualiza");
   }

   public SdtSDTCRServidorEfetivoAtualiza( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTCRServidorEfetivoAtualiza");
   }

   public SdtSDTCRServidorEfetivoAtualiza( StructSdtSDTCRServidorEfetivoAtualiza struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "se_matricula") )
            {
               gxTv_SdtSDTCRServidorEfetivoAtualiza_Se_matricula = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_nome") )
            {
               gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_nome = oReader.getValue() ;
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
                  gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento = GXutil.nullDate() ;
                  gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento_N = (byte)(0) ;
                  gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
               gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_sexo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_mae") )
            {
               gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_mae = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_pai") )
            {
               gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_pai = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_idade") )
            {
               gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_idade = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "endereco") )
            {
               if ( gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco == null )
               {
                  gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco = new GXBaseCollection<com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem>(com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem.class, "SDTCRServidorEfetivoAtualiza.enderecoItem", "ProjetoPratico", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco.readxmlcollection(oReader, "endereco", "enderecoItem") ;
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
         sName = "SDTCRServidorEfetivoAtualiza" ;
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
      oWriter.writeElement("se_matricula", gxTv_SdtSDTCRServidorEfetivoAtualiza_Se_matricula);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("pes_nome", gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_nome);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento)) && ( gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento_N == 1 ) )
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
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("pes_data_nascimento", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
      }
      oWriter.writeElement("pes_sexo", gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_sexo);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("pes_mae", gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_mae);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("pes_pai", gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_pai);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("pes_idade", GXutil.trim( GXutil.str( gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_idade, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      if ( gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco != null )
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
         gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco.writexmlcollection(oWriter, "endereco", sNameSpace1, "enderecoItem", sNameSpace1);
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
      AddObjectProperty("se_matricula", gxTv_SdtSDTCRServidorEfetivoAtualiza_Se_matricula, false, false);
      AddObjectProperty("pes_nome", gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_nome, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("pes_data_nascimento", sDateCnv, false, false);
      AddObjectProperty("pes_sexo", gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_sexo, false, false);
      AddObjectProperty("pes_mae", gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_mae, false, false);
      AddObjectProperty("pes_pai", gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_pai, false, false);
      AddObjectProperty("pes_idade", gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_idade, false, false);
      if ( gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco != null )
      {
         AddObjectProperty("endereco", gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco, false, false);
      }
   }

   public String getgxTv_SdtSDTCRServidorEfetivoAtualiza_Se_matricula( )
   {
      return gxTv_SdtSDTCRServidorEfetivoAtualiza_Se_matricula ;
   }

   public void setgxTv_SdtSDTCRServidorEfetivoAtualiza_Se_matricula( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Se_matricula = value ;
   }

   public String getgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_nome( )
   {
      return gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_nome ;
   }

   public void setgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_nome = value ;
   }

   public java.util.Date getgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento( )
   {
      return gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento ;
   }

   public void setgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento( java.util.Date value )
   {
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento = value ;
   }

   public String getgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_sexo( )
   {
      return gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_sexo ;
   }

   public void setgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_sexo( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_sexo = value ;
   }

   public String getgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_mae( )
   {
      return gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_mae ;
   }

   public void setgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_mae( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_mae = value ;
   }

   public String getgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_pai( )
   {
      return gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_pai ;
   }

   public void setgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_pai( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_pai = value ;
   }

   public short getgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_idade( )
   {
      return gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_idade ;
   }

   public void setgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_idade( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_idade = value ;
   }

   public GXBaseCollection<com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem> getgxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco( )
   {
      if ( gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco == null )
      {
         gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco = new GXBaseCollection<com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem>(com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem.class, "SDTCRServidorEfetivoAtualiza.enderecoItem", "ProjetoPratico", remoteHandle);
      }
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      return gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco ;
   }

   public void setgxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco( GXBaseCollection<com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem> value )
   {
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco = value ;
   }

   public void setgxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco_SetNull( )
   {
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco_N = (byte)(1) ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco = null ;
   }

   public boolean getgxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco_IsNull( )
   {
      if ( gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco_N( )
   {
      return gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Se_matricula = "" ;
      sdtIsNull = (byte)(1) ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_nome = "" ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento = GXutil.nullDate() ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento_N = (byte)(1) ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_sexo = "" ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_mae = "" ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_pai = "" ;
      gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco_N = (byte)(1) ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public com.projetopratico.SdtSDTCRServidorEfetivoAtualiza Clone( )
   {
      return (com.projetopratico.SdtSDTCRServidorEfetivoAtualiza)(clone()) ;
   }

   public void setStruct( com.projetopratico.StructSdtSDTCRServidorEfetivoAtualiza struct )
   {
      if ( struct != null )
      {
         setgxTv_SdtSDTCRServidorEfetivoAtualiza_Se_matricula(struct.getSe_matricula());
         setgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_nome(struct.getPes_nome());
         if ( struct.gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento_N == 0 )
         {
            setgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento(struct.getPes_data_nascimento());
         }
         setgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_sexo(struct.getPes_sexo());
         setgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_mae(struct.getPes_mae());
         setgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_pai(struct.getPes_pai());
         setgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_idade(struct.getPes_idade());
         GXBaseCollection<com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem> gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco_aux = new GXBaseCollection<com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem>(com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem.class, "SDTCRServidorEfetivoAtualiza.enderecoItem", "ProjetoPratico", remoteHandle);
         Vector<com.projetopratico.StructSdtSDTCRServidorEfetivoAtualiza_enderecoItem> gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco_aux1 = struct.getEndereco();
         if (gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco_aux1 != null)
         {
            for (int i = 0; i < gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco_aux1.size(); i++)
            {
               gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco_aux.add(new com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem(gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco_aux1.elementAt(i)));
            }
         }
         setgxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco(gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco_aux);
      }
   }

   @SuppressWarnings("unchecked")
   public com.projetopratico.StructSdtSDTCRServidorEfetivoAtualiza getStruct( )
   {
      com.projetopratico.StructSdtSDTCRServidorEfetivoAtualiza struct = new com.projetopratico.StructSdtSDTCRServidorEfetivoAtualiza ();
      struct.setSe_matricula(getgxTv_SdtSDTCRServidorEfetivoAtualiza_Se_matricula());
      struct.setPes_nome(getgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_nome());
      if ( gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento_N == 0 )
      {
         struct.setPes_data_nascimento(getgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento());
      }
      struct.setPes_sexo(getgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_sexo());
      struct.setPes_mae(getgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_mae());
      struct.setPes_pai(getgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_pai());
      struct.setPes_idade(getgxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_idade());
      struct.setEndereco(getgxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco().getStruct());
      return struct ;
   }

   protected byte sdtIsNull ;
   protected byte gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento_N ;
   protected byte gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco_N ;
   protected short gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_idade ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_data_nascimento ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTCRServidorEfetivoAtualiza_Se_matricula ;
   protected String gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_nome ;
   protected String gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_sexo ;
   protected String gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_mae ;
   protected String gxTv_SdtSDTCRServidorEfetivoAtualiza_Pes_pai ;
   protected GXBaseCollection<com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem> gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco=null ;
   protected GXBaseCollection<com.projetopratico.SdtSDTCRServidorEfetivoAtualiza_enderecoItem> gxTv_SdtSDTCRServidorEfetivoAtualiza_Endereco_aux ;
}

