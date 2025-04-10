package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTFotoPessoa extends GxUserType
{
   public SdtSDTFotoPessoa( )
   {
      this(  new ModelContext(SdtSDTFotoPessoa.class));
   }

   public SdtSDTFotoPessoa( ModelContext context )
   {
      super( context, "SdtSDTFotoPessoa");
   }

   public SdtSDTFotoPessoa( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTFotoPessoa");
   }

   public SdtSDTFotoPessoa( StructSdtSDTFotoPessoa struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "fp_id") )
            {
               gxTv_SdtSDTFotoPessoa_Fp_id = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_id") )
            {
               gxTv_SdtSDTFotoPessoa_Pes_id = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "fp_data") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTFotoPessoa_Fp_data = GXutil.nullDate() ;
                  gxTv_SdtSDTFotoPessoa_Fp_data_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTFotoPessoa_Fp_data_N = (byte)(0) ;
                  gxTv_SdtSDTFotoPessoa_Fp_data = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "fp_bucket") )
            {
               gxTv_SdtSDTFotoPessoa_Fp_bucket = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "fp_hash") )
            {
               gxTv_SdtSDTFotoPessoa_Fp_hash = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "fp_foto_link") )
            {
               gxTv_SdtSDTFotoPessoa_Fp_foto_link = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
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
         sName = "SDTFotoPessoa" ;
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
      oWriter.writeElement("fp_id", GXutil.trim( GXutil.str( gxTv_SdtSDTFotoPessoa_Fp_id, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("pes_id", GXutil.trim( GXutil.str( gxTv_SdtSDTFotoPessoa_Pes_id, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTFotoPessoa_Fp_data)) && ( gxTv_SdtSDTFotoPessoa_Fp_data_N == 1 ) )
      {
         oWriter.writeElement("fp_data", "");
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTFotoPessoa_Fp_data), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTFotoPessoa_Fp_data), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTFotoPessoa_Fp_data), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("fp_data", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
      }
      oWriter.writeElement("fp_bucket", gxTv_SdtSDTFotoPessoa_Fp_bucket);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("fp_hash", gxTv_SdtSDTFotoPessoa_Fp_hash);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("fp_foto_link", gxTv_SdtSDTFotoPessoa_Fp_foto_link);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
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
      AddObjectProperty("fp_id", gxTv_SdtSDTFotoPessoa_Fp_id, false, false);
      AddObjectProperty("pes_id", gxTv_SdtSDTFotoPessoa_Pes_id, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTFotoPessoa_Fp_data), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTFotoPessoa_Fp_data), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTFotoPessoa_Fp_data), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("fp_data", sDateCnv, false, false);
      AddObjectProperty("fp_bucket", gxTv_SdtSDTFotoPessoa_Fp_bucket, false, false);
      AddObjectProperty("fp_hash", gxTv_SdtSDTFotoPessoa_Fp_hash, false, false);
      AddObjectProperty("fp_foto_link", gxTv_SdtSDTFotoPessoa_Fp_foto_link, false, false);
   }

   public int getgxTv_SdtSDTFotoPessoa_Fp_id( )
   {
      return gxTv_SdtSDTFotoPessoa_Fp_id ;
   }

   public void setgxTv_SdtSDTFotoPessoa_Fp_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTFotoPessoa_Fp_id = value ;
   }

   public int getgxTv_SdtSDTFotoPessoa_Pes_id( )
   {
      return gxTv_SdtSDTFotoPessoa_Pes_id ;
   }

   public void setgxTv_SdtSDTFotoPessoa_Pes_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTFotoPessoa_Pes_id = value ;
   }

   public java.util.Date getgxTv_SdtSDTFotoPessoa_Fp_data( )
   {
      return gxTv_SdtSDTFotoPessoa_Fp_data ;
   }

   public void setgxTv_SdtSDTFotoPessoa_Fp_data( java.util.Date value )
   {
      gxTv_SdtSDTFotoPessoa_Fp_data_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTFotoPessoa_Fp_data = value ;
   }

   public String getgxTv_SdtSDTFotoPessoa_Fp_bucket( )
   {
      return gxTv_SdtSDTFotoPessoa_Fp_bucket ;
   }

   public void setgxTv_SdtSDTFotoPessoa_Fp_bucket( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTFotoPessoa_Fp_bucket = value ;
   }

   public String getgxTv_SdtSDTFotoPessoa_Fp_hash( )
   {
      return gxTv_SdtSDTFotoPessoa_Fp_hash ;
   }

   public void setgxTv_SdtSDTFotoPessoa_Fp_hash( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTFotoPessoa_Fp_hash = value ;
   }

   public String getgxTv_SdtSDTFotoPessoa_Fp_foto_link( )
   {
      return gxTv_SdtSDTFotoPessoa_Fp_foto_link ;
   }

   public void setgxTv_SdtSDTFotoPessoa_Fp_foto_link( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTFotoPessoa_Fp_foto_link = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      sdtIsNull = (byte)(1) ;
      gxTv_SdtSDTFotoPessoa_Fp_data = GXutil.nullDate() ;
      gxTv_SdtSDTFotoPessoa_Fp_data_N = (byte)(1) ;
      gxTv_SdtSDTFotoPessoa_Fp_bucket = "" ;
      gxTv_SdtSDTFotoPessoa_Fp_hash = "" ;
      gxTv_SdtSDTFotoPessoa_Fp_foto_link = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public com.projetopratico.SdtSDTFotoPessoa Clone( )
   {
      return (com.projetopratico.SdtSDTFotoPessoa)(clone()) ;
   }

   public void setStruct( com.projetopratico.StructSdtSDTFotoPessoa struct )
   {
      if ( struct != null )
      {
         setgxTv_SdtSDTFotoPessoa_Fp_id(struct.getFp_id());
         setgxTv_SdtSDTFotoPessoa_Pes_id(struct.getPes_id());
         if ( struct.gxTv_SdtSDTFotoPessoa_Fp_data_N == 0 )
         {
            setgxTv_SdtSDTFotoPessoa_Fp_data(struct.getFp_data());
         }
         setgxTv_SdtSDTFotoPessoa_Fp_bucket(struct.getFp_bucket());
         setgxTv_SdtSDTFotoPessoa_Fp_hash(struct.getFp_hash());
         setgxTv_SdtSDTFotoPessoa_Fp_foto_link(struct.getFp_foto_link());
      }
   }

   @SuppressWarnings("unchecked")
   public com.projetopratico.StructSdtSDTFotoPessoa getStruct( )
   {
      com.projetopratico.StructSdtSDTFotoPessoa struct = new com.projetopratico.StructSdtSDTFotoPessoa ();
      struct.setFp_id(getgxTv_SdtSDTFotoPessoa_Fp_id());
      struct.setPes_id(getgxTv_SdtSDTFotoPessoa_Pes_id());
      if ( gxTv_SdtSDTFotoPessoa_Fp_data_N == 0 )
      {
         struct.setFp_data(getgxTv_SdtSDTFotoPessoa_Fp_data());
      }
      struct.setFp_bucket(getgxTv_SdtSDTFotoPessoa_Fp_bucket());
      struct.setFp_hash(getgxTv_SdtSDTFotoPessoa_Fp_hash());
      struct.setFp_foto_link(getgxTv_SdtSDTFotoPessoa_Fp_foto_link());
      return struct ;
   }

   protected byte sdtIsNull ;
   protected byte gxTv_SdtSDTFotoPessoa_Fp_data_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTFotoPessoa_Fp_id ;
   protected int gxTv_SdtSDTFotoPessoa_Pes_id ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTFotoPessoa_Fp_data ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTFotoPessoa_Fp_bucket ;
   protected String gxTv_SdtSDTFotoPessoa_Fp_hash ;
   protected String gxTv_SdtSDTFotoPessoa_Fp_foto_link ;
}

