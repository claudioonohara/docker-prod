package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTCRServidorEfetivo extends GxUserType
{
   public SdtSDTCRServidorEfetivo( )
   {
      this(  new ModelContext(SdtSDTCRServidorEfetivo.class));
   }

   public SdtSDTCRServidorEfetivo( ModelContext context )
   {
      super( context, "SdtSDTCRServidorEfetivo");
   }

   public SdtSDTCRServidorEfetivo( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTCRServidorEfetivo");
   }

   public SdtSDTCRServidorEfetivo( StructSdtSDTCRServidorEfetivo struct )
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
               gxTv_SdtSDTCRServidorEfetivo_Pes_id = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "se_matricula") )
            {
               gxTv_SdtSDTCRServidorEfetivo_Se_matricula = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_nome") )
            {
               gxTv_SdtSDTCRServidorEfetivo_Pes_nome = oReader.getValue() ;
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
                  gxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento = GXutil.nullDate() ;
                  gxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento_N = (byte)(0) ;
                  gxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
               gxTv_SdtSDTCRServidorEfetivo_Pes_sexo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_mae") )
            {
               gxTv_SdtSDTCRServidorEfetivo_Pes_mae = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_pai") )
            {
               gxTv_SdtSDTCRServidorEfetivo_Pes_pai = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_idade") )
            {
               gxTv_SdtSDTCRServidorEfetivo_Pes_idade = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "endereco") )
            {
               if ( gxTv_SdtSDTCRServidorEfetivo_Endereco == null )
               {
                  gxTv_SdtSDTCRServidorEfetivo_Endereco = new GXBaseCollection<com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem>(com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem.class, "SDTCRServidorEfetivo.enderecoItem", "ProjetoPratico", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTCRServidorEfetivo_Endereco.readxmlcollection(oReader, "endereco", "enderecoItem") ;
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
         sName = "SDTCRServidorEfetivo" ;
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
      oWriter.writeElement("pes_id", GXutil.trim( GXutil.str( gxTv_SdtSDTCRServidorEfetivo_Pes_id, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("se_matricula", gxTv_SdtSDTCRServidorEfetivo_Se_matricula);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("pes_nome", gxTv_SdtSDTCRServidorEfetivo_Pes_nome);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento)) && ( gxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento_N == 1 ) )
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
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("pes_data_nascimento", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
      }
      oWriter.writeElement("pes_sexo", gxTv_SdtSDTCRServidorEfetivo_Pes_sexo);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("pes_mae", gxTv_SdtSDTCRServidorEfetivo_Pes_mae);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("pes_pai", gxTv_SdtSDTCRServidorEfetivo_Pes_pai);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("pes_idade", GXutil.trim( GXutil.str( gxTv_SdtSDTCRServidorEfetivo_Pes_idade, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      if ( gxTv_SdtSDTCRServidorEfetivo_Endereco != null )
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
         gxTv_SdtSDTCRServidorEfetivo_Endereco.writexmlcollection(oWriter, "endereco", sNameSpace1, "enderecoItem", sNameSpace1);
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
      AddObjectProperty("pes_id", gxTv_SdtSDTCRServidorEfetivo_Pes_id, false, false);
      AddObjectProperty("se_matricula", gxTv_SdtSDTCRServidorEfetivo_Se_matricula, false, false);
      AddObjectProperty("pes_nome", gxTv_SdtSDTCRServidorEfetivo_Pes_nome, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("pes_data_nascimento", sDateCnv, false, false);
      AddObjectProperty("pes_sexo", gxTv_SdtSDTCRServidorEfetivo_Pes_sexo, false, false);
      AddObjectProperty("pes_mae", gxTv_SdtSDTCRServidorEfetivo_Pes_mae, false, false);
      AddObjectProperty("pes_pai", gxTv_SdtSDTCRServidorEfetivo_Pes_pai, false, false);
      AddObjectProperty("pes_idade", gxTv_SdtSDTCRServidorEfetivo_Pes_idade, false, false);
      if ( gxTv_SdtSDTCRServidorEfetivo_Endereco != null )
      {
         AddObjectProperty("endereco", gxTv_SdtSDTCRServidorEfetivo_Endereco, false, false);
      }
   }

   public int getgxTv_SdtSDTCRServidorEfetivo_Pes_id( )
   {
      return gxTv_SdtSDTCRServidorEfetivo_Pes_id ;
   }

   public void setgxTv_SdtSDTCRServidorEfetivo_Pes_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivo_Pes_id = value ;
   }

   public String getgxTv_SdtSDTCRServidorEfetivo_Se_matricula( )
   {
      return gxTv_SdtSDTCRServidorEfetivo_Se_matricula ;
   }

   public void setgxTv_SdtSDTCRServidorEfetivo_Se_matricula( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivo_Se_matricula = value ;
   }

   public String getgxTv_SdtSDTCRServidorEfetivo_Pes_nome( )
   {
      return gxTv_SdtSDTCRServidorEfetivo_Pes_nome ;
   }

   public void setgxTv_SdtSDTCRServidorEfetivo_Pes_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivo_Pes_nome = value ;
   }

   public java.util.Date getgxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento( )
   {
      return gxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento ;
   }

   public void setgxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento( java.util.Date value )
   {
      gxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento = value ;
   }

   public String getgxTv_SdtSDTCRServidorEfetivo_Pes_sexo( )
   {
      return gxTv_SdtSDTCRServidorEfetivo_Pes_sexo ;
   }

   public void setgxTv_SdtSDTCRServidorEfetivo_Pes_sexo( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivo_Pes_sexo = value ;
   }

   public String getgxTv_SdtSDTCRServidorEfetivo_Pes_mae( )
   {
      return gxTv_SdtSDTCRServidorEfetivo_Pes_mae ;
   }

   public void setgxTv_SdtSDTCRServidorEfetivo_Pes_mae( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivo_Pes_mae = value ;
   }

   public String getgxTv_SdtSDTCRServidorEfetivo_Pes_pai( )
   {
      return gxTv_SdtSDTCRServidorEfetivo_Pes_pai ;
   }

   public void setgxTv_SdtSDTCRServidorEfetivo_Pes_pai( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivo_Pes_pai = value ;
   }

   public short getgxTv_SdtSDTCRServidorEfetivo_Pes_idade( )
   {
      return gxTv_SdtSDTCRServidorEfetivo_Pes_idade ;
   }

   public void setgxTv_SdtSDTCRServidorEfetivo_Pes_idade( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivo_Pes_idade = value ;
   }

   public GXBaseCollection<com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem> getgxTv_SdtSDTCRServidorEfetivo_Endereco( )
   {
      if ( gxTv_SdtSDTCRServidorEfetivo_Endereco == null )
      {
         gxTv_SdtSDTCRServidorEfetivo_Endereco = new GXBaseCollection<com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem>(com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem.class, "SDTCRServidorEfetivo.enderecoItem", "ProjetoPratico", remoteHandle);
      }
      gxTv_SdtSDTCRServidorEfetivo_Endereco_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      return gxTv_SdtSDTCRServidorEfetivo_Endereco ;
   }

   public void setgxTv_SdtSDTCRServidorEfetivo_Endereco( GXBaseCollection<com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem> value )
   {
      gxTv_SdtSDTCRServidorEfetivo_Endereco_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRServidorEfetivo_Endereco = value ;
   }

   public void setgxTv_SdtSDTCRServidorEfetivo_Endereco_SetNull( )
   {
      gxTv_SdtSDTCRServidorEfetivo_Endereco_N = (byte)(1) ;
      gxTv_SdtSDTCRServidorEfetivo_Endereco = null ;
   }

   public boolean getgxTv_SdtSDTCRServidorEfetivo_Endereco_IsNull( )
   {
      if ( gxTv_SdtSDTCRServidorEfetivo_Endereco == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTCRServidorEfetivo_Endereco_N( )
   {
      return gxTv_SdtSDTCRServidorEfetivo_Endereco_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      sdtIsNull = (byte)(1) ;
      gxTv_SdtSDTCRServidorEfetivo_Se_matricula = "" ;
      gxTv_SdtSDTCRServidorEfetivo_Pes_nome = "" ;
      gxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento = GXutil.nullDate() ;
      gxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento_N = (byte)(1) ;
      gxTv_SdtSDTCRServidorEfetivo_Pes_sexo = "" ;
      gxTv_SdtSDTCRServidorEfetivo_Pes_mae = "" ;
      gxTv_SdtSDTCRServidorEfetivo_Pes_pai = "" ;
      gxTv_SdtSDTCRServidorEfetivo_Endereco_N = (byte)(1) ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public com.projetopratico.SdtSDTCRServidorEfetivo Clone( )
   {
      return (com.projetopratico.SdtSDTCRServidorEfetivo)(clone()) ;
   }

   public void setStruct( com.projetopratico.StructSdtSDTCRServidorEfetivo struct )
   {
      if ( struct != null )
      {
         setgxTv_SdtSDTCRServidorEfetivo_Pes_id(struct.getPes_id());
         setgxTv_SdtSDTCRServidorEfetivo_Se_matricula(struct.getSe_matricula());
         setgxTv_SdtSDTCRServidorEfetivo_Pes_nome(struct.getPes_nome());
         if ( struct.gxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento_N == 0 )
         {
            setgxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento(struct.getPes_data_nascimento());
         }
         setgxTv_SdtSDTCRServidorEfetivo_Pes_sexo(struct.getPes_sexo());
         setgxTv_SdtSDTCRServidorEfetivo_Pes_mae(struct.getPes_mae());
         setgxTv_SdtSDTCRServidorEfetivo_Pes_pai(struct.getPes_pai());
         setgxTv_SdtSDTCRServidorEfetivo_Pes_idade(struct.getPes_idade());
         GXBaseCollection<com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem> gxTv_SdtSDTCRServidorEfetivo_Endereco_aux = new GXBaseCollection<com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem>(com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem.class, "SDTCRServidorEfetivo.enderecoItem", "ProjetoPratico", remoteHandle);
         Vector<com.projetopratico.StructSdtSDTCRServidorEfetivo_enderecoItem> gxTv_SdtSDTCRServidorEfetivo_Endereco_aux1 = struct.getEndereco();
         if (gxTv_SdtSDTCRServidorEfetivo_Endereco_aux1 != null)
         {
            for (int i = 0; i < gxTv_SdtSDTCRServidorEfetivo_Endereco_aux1.size(); i++)
            {
               gxTv_SdtSDTCRServidorEfetivo_Endereco_aux.add(new com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem(gxTv_SdtSDTCRServidorEfetivo_Endereco_aux1.elementAt(i)));
            }
         }
         setgxTv_SdtSDTCRServidorEfetivo_Endereco(gxTv_SdtSDTCRServidorEfetivo_Endereco_aux);
      }
   }

   @SuppressWarnings("unchecked")
   public com.projetopratico.StructSdtSDTCRServidorEfetivo getStruct( )
   {
      com.projetopratico.StructSdtSDTCRServidorEfetivo struct = new com.projetopratico.StructSdtSDTCRServidorEfetivo ();
      struct.setPes_id(getgxTv_SdtSDTCRServidorEfetivo_Pes_id());
      struct.setSe_matricula(getgxTv_SdtSDTCRServidorEfetivo_Se_matricula());
      struct.setPes_nome(getgxTv_SdtSDTCRServidorEfetivo_Pes_nome());
      if ( gxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento_N == 0 )
      {
         struct.setPes_data_nascimento(getgxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento());
      }
      struct.setPes_sexo(getgxTv_SdtSDTCRServidorEfetivo_Pes_sexo());
      struct.setPes_mae(getgxTv_SdtSDTCRServidorEfetivo_Pes_mae());
      struct.setPes_pai(getgxTv_SdtSDTCRServidorEfetivo_Pes_pai());
      struct.setPes_idade(getgxTv_SdtSDTCRServidorEfetivo_Pes_idade());
      struct.setEndereco(getgxTv_SdtSDTCRServidorEfetivo_Endereco().getStruct());
      return struct ;
   }

   protected byte sdtIsNull ;
   protected byte gxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento_N ;
   protected byte gxTv_SdtSDTCRServidorEfetivo_Endereco_N ;
   protected short gxTv_SdtSDTCRServidorEfetivo_Pes_idade ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTCRServidorEfetivo_Pes_id ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTCRServidorEfetivo_Pes_data_nascimento ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTCRServidorEfetivo_Se_matricula ;
   protected String gxTv_SdtSDTCRServidorEfetivo_Pes_nome ;
   protected String gxTv_SdtSDTCRServidorEfetivo_Pes_sexo ;
   protected String gxTv_SdtSDTCRServidorEfetivo_Pes_mae ;
   protected String gxTv_SdtSDTCRServidorEfetivo_Pes_pai ;
   protected GXBaseCollection<com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem> gxTv_SdtSDTCRServidorEfetivo_Endereco=null ;
   protected GXBaseCollection<com.projetopratico.SdtSDTCRServidorEfetivo_enderecoItem> gxTv_SdtSDTCRServidorEfetivo_Endereco_aux ;
}

