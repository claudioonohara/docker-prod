package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class Sdtfoto_pessoa extends GxSilentTrnSdt
{
   public Sdtfoto_pessoa( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(Sdtfoto_pessoa.class));
   }

   public Sdtfoto_pessoa( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle, context, "Sdtfoto_pessoa");
      initialize( remoteHandle) ;
   }

   public Sdtfoto_pessoa( int remoteHandle ,
                          StructSdtfoto_pessoa struct )
   {
      this(remoteHandle);
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

   public void Load( int AV10fp_id )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {Integer.valueOf(AV10fp_id)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"fp_id", int.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "foto_pessoa");
      metadata.set("BT", "foto_pessoa");
      metadata.set("PK", "[ \"fp_id\" ]");
      metadata.set("PKAssigned", "[ \"fp_id\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"pes_id\" ],\"FKMap\":[  ] } ]");
      metadata.set("AllowInsert", "True");
      metadata.set("AllowUpdate", "True");
      metadata.set("AllowDelete", "True");
      return metadata ;
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
               gxTv_Sdtfoto_pessoa_Fp_id = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_id") )
            {
               gxTv_Sdtfoto_pessoa_Pes_id = (int)(getnumericvalue(oReader.getValue())) ;
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
                  gxTv_Sdtfoto_pessoa_Fp_data = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_Sdtfoto_pessoa_Fp_data = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
               gxTv_Sdtfoto_pessoa_Fp_bucket = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "fp_hash") )
            {
               gxTv_Sdtfoto_pessoa_Fp_hash = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "fp_foto") )
            {
               gxTv_Sdtfoto_pessoa_Fp_foto = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "fp_foto_GXI") )
            {
               gxTv_Sdtfoto_pessoa_Fp_foto_gxi = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_Sdtfoto_pessoa_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_Sdtfoto_pessoa_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "fp_id_Z") )
            {
               gxTv_Sdtfoto_pessoa_Fp_id_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_id_Z") )
            {
               gxTv_Sdtfoto_pessoa_Pes_id_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "fp_data_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_Sdtfoto_pessoa_Fp_data_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_Sdtfoto_pessoa_Fp_data_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "fp_bucket_Z") )
            {
               gxTv_Sdtfoto_pessoa_Fp_bucket_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "fp_hash_Z") )
            {
               gxTv_Sdtfoto_pessoa_Fp_hash_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "fp_foto_GXI_Z") )
            {
               gxTv_Sdtfoto_pessoa_Fp_foto_gxi_Z = oReader.getValue() ;
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
         sName = "foto_pessoa" ;
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
      oWriter.writeElement("fp_id", GXutil.trim( GXutil.str( gxTv_Sdtfoto_pessoa_Fp_id, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("pes_id", GXutil.trim( GXutil.str( gxTv_Sdtfoto_pessoa_Pes_id, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_Sdtfoto_pessoa_Fp_data), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_Sdtfoto_pessoa_Fp_data), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_Sdtfoto_pessoa_Fp_data), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("fp_data", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("fp_bucket", gxTv_Sdtfoto_pessoa_Fp_bucket);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("fp_hash", gxTv_Sdtfoto_pessoa_Fp_hash);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("fp_foto", gxTv_Sdtfoto_pessoa_Fp_foto);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("fp_foto_GXI", gxTv_Sdtfoto_pessoa_Fp_foto_gxi);
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
         oWriter.writeElement("Mode", gxTv_Sdtfoto_pessoa_Mode);
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_Sdtfoto_pessoa_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
         oWriter.writeElement("fp_id_Z", GXutil.trim( GXutil.str( gxTv_Sdtfoto_pessoa_Fp_id_Z, 8, 0)));
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
         oWriter.writeElement("pes_id_Z", GXutil.trim( GXutil.str( gxTv_Sdtfoto_pessoa_Pes_id_Z, 8, 0)));
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_Sdtfoto_pessoa_Fp_data_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_Sdtfoto_pessoa_Fp_data_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_Sdtfoto_pessoa_Fp_data_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("fp_data_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
         oWriter.writeElement("fp_bucket_Z", gxTv_Sdtfoto_pessoa_Fp_bucket_Z);
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
         oWriter.writeElement("fp_hash_Z", gxTv_Sdtfoto_pessoa_Fp_hash_Z);
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
         oWriter.writeElement("fp_foto_GXI_Z", gxTv_Sdtfoto_pessoa_Fp_foto_gxi_Z);
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
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
      AddObjectProperty("fp_id", gxTv_Sdtfoto_pessoa_Fp_id, false, includeNonInitialized);
      AddObjectProperty("pes_id", gxTv_Sdtfoto_pessoa_Pes_id, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_Sdtfoto_pessoa_Fp_data), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_Sdtfoto_pessoa_Fp_data), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_Sdtfoto_pessoa_Fp_data), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("fp_data", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("fp_bucket", gxTv_Sdtfoto_pessoa_Fp_bucket, false, includeNonInitialized);
      AddObjectProperty("fp_hash", gxTv_Sdtfoto_pessoa_Fp_hash, false, includeNonInitialized);
      AddObjectProperty("fp_foto", gxTv_Sdtfoto_pessoa_Fp_foto, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("fp_foto_GXI", gxTv_Sdtfoto_pessoa_Fp_foto_gxi, false, includeNonInitialized);
         AddObjectProperty("Mode", gxTv_Sdtfoto_pessoa_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_Sdtfoto_pessoa_Initialized, false, includeNonInitialized);
         AddObjectProperty("fp_id_Z", gxTv_Sdtfoto_pessoa_Fp_id_Z, false, includeNonInitialized);
         AddObjectProperty("pes_id_Z", gxTv_Sdtfoto_pessoa_Pes_id_Z, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_Sdtfoto_pessoa_Fp_data_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_Sdtfoto_pessoa_Fp_data_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_Sdtfoto_pessoa_Fp_data_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("fp_data_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("fp_bucket_Z", gxTv_Sdtfoto_pessoa_Fp_bucket_Z, false, includeNonInitialized);
         AddObjectProperty("fp_hash_Z", gxTv_Sdtfoto_pessoa_Fp_hash_Z, false, includeNonInitialized);
         AddObjectProperty("fp_foto_GXI_Z", gxTv_Sdtfoto_pessoa_Fp_foto_gxi_Z, false, includeNonInitialized);
      }
   }

   public void updateDirties( com.projetopratico.Sdtfoto_pessoa sdt )
   {
      if ( sdt.IsDirty("fp_id") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtfoto_pessoa_Fp_id = sdt.getgxTv_Sdtfoto_pessoa_Fp_id() ;
      }
      if ( sdt.IsDirty("pes_id") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtfoto_pessoa_Pes_id = sdt.getgxTv_Sdtfoto_pessoa_Pes_id() ;
      }
      if ( sdt.IsDirty("fp_data") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtfoto_pessoa_Fp_data = sdt.getgxTv_Sdtfoto_pessoa_Fp_data() ;
      }
      if ( sdt.IsDirty("fp_bucket") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtfoto_pessoa_Fp_bucket = sdt.getgxTv_Sdtfoto_pessoa_Fp_bucket() ;
      }
      if ( sdt.IsDirty("fp_hash") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtfoto_pessoa_Fp_hash = sdt.getgxTv_Sdtfoto_pessoa_Fp_hash() ;
      }
      if ( sdt.IsDirty("fp_foto") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtfoto_pessoa_Fp_foto = sdt.getgxTv_Sdtfoto_pessoa_Fp_foto() ;
      }
      if ( sdt.IsDirty("fp_foto") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtfoto_pessoa_Fp_foto_gxi = sdt.getgxTv_Sdtfoto_pessoa_Fp_foto_gxi() ;
      }
   }

   public int getgxTv_Sdtfoto_pessoa_Fp_id( )
   {
      return gxTv_Sdtfoto_pessoa_Fp_id ;
   }

   public void setgxTv_Sdtfoto_pessoa_Fp_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      if ( gxTv_Sdtfoto_pessoa_Fp_id != value )
      {
         gxTv_Sdtfoto_pessoa_Mode = "INS" ;
         this.setgxTv_Sdtfoto_pessoa_Fp_id_Z_SetNull( );
         this.setgxTv_Sdtfoto_pessoa_Pes_id_Z_SetNull( );
         this.setgxTv_Sdtfoto_pessoa_Fp_data_Z_SetNull( );
         this.setgxTv_Sdtfoto_pessoa_Fp_bucket_Z_SetNull( );
         this.setgxTv_Sdtfoto_pessoa_Fp_hash_Z_SetNull( );
         this.setgxTv_Sdtfoto_pessoa_Fp_foto_gxi_Z_SetNull( );
      }
      SetDirty("Fp_id");
      gxTv_Sdtfoto_pessoa_Fp_id = value ;
   }

   public int getgxTv_Sdtfoto_pessoa_Pes_id( )
   {
      return gxTv_Sdtfoto_pessoa_Pes_id ;
   }

   public void setgxTv_Sdtfoto_pessoa_Pes_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Pes_id");
      gxTv_Sdtfoto_pessoa_Pes_id = value ;
   }

   public java.util.Date getgxTv_Sdtfoto_pessoa_Fp_data( )
   {
      return gxTv_Sdtfoto_pessoa_Fp_data ;
   }

   public void setgxTv_Sdtfoto_pessoa_Fp_data( java.util.Date value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Fp_data");
      gxTv_Sdtfoto_pessoa_Fp_data = value ;
   }

   public String getgxTv_Sdtfoto_pessoa_Fp_bucket( )
   {
      return gxTv_Sdtfoto_pessoa_Fp_bucket ;
   }

   public void setgxTv_Sdtfoto_pessoa_Fp_bucket( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Fp_bucket");
      gxTv_Sdtfoto_pessoa_Fp_bucket = value ;
   }

   public String getgxTv_Sdtfoto_pessoa_Fp_hash( )
   {
      return gxTv_Sdtfoto_pessoa_Fp_hash ;
   }

   public void setgxTv_Sdtfoto_pessoa_Fp_hash( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Fp_hash");
      gxTv_Sdtfoto_pessoa_Fp_hash = value ;
   }

   @GxUpload
   public String getgxTv_Sdtfoto_pessoa_Fp_foto( )
   {
      return gxTv_Sdtfoto_pessoa_Fp_foto ;
   }

   public void setgxTv_Sdtfoto_pessoa_Fp_foto( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Fp_foto");
      gxTv_Sdtfoto_pessoa_Fp_foto = value ;
   }

   public String getgxTv_Sdtfoto_pessoa_Fp_foto_gxi( )
   {
      return gxTv_Sdtfoto_pessoa_Fp_foto_gxi ;
   }

   public void setgxTv_Sdtfoto_pessoa_Fp_foto_gxi( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Fp_foto_gxi");
      gxTv_Sdtfoto_pessoa_Fp_foto_gxi = value ;
   }

   public String getgxTv_Sdtfoto_pessoa_Mode( )
   {
      return gxTv_Sdtfoto_pessoa_Mode ;
   }

   public void setgxTv_Sdtfoto_pessoa_Mode( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Mode");
      gxTv_Sdtfoto_pessoa_Mode = value ;
   }

   public void setgxTv_Sdtfoto_pessoa_Mode_SetNull( )
   {
      gxTv_Sdtfoto_pessoa_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_Sdtfoto_pessoa_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_Sdtfoto_pessoa_Initialized( )
   {
      return gxTv_Sdtfoto_pessoa_Initialized ;
   }

   public void setgxTv_Sdtfoto_pessoa_Initialized( short value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_Sdtfoto_pessoa_Initialized = value ;
   }

   public void setgxTv_Sdtfoto_pessoa_Initialized_SetNull( )
   {
      gxTv_Sdtfoto_pessoa_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_Sdtfoto_pessoa_Initialized_IsNull( )
   {
      return false ;
   }

   public int getgxTv_Sdtfoto_pessoa_Fp_id_Z( )
   {
      return gxTv_Sdtfoto_pessoa_Fp_id_Z ;
   }

   public void setgxTv_Sdtfoto_pessoa_Fp_id_Z( int value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Fp_id_Z");
      gxTv_Sdtfoto_pessoa_Fp_id_Z = value ;
   }

   public void setgxTv_Sdtfoto_pessoa_Fp_id_Z_SetNull( )
   {
      gxTv_Sdtfoto_pessoa_Fp_id_Z = 0 ;
      SetDirty("Fp_id_Z");
   }

   public boolean getgxTv_Sdtfoto_pessoa_Fp_id_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_Sdtfoto_pessoa_Pes_id_Z( )
   {
      return gxTv_Sdtfoto_pessoa_Pes_id_Z ;
   }

   public void setgxTv_Sdtfoto_pessoa_Pes_id_Z( int value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Pes_id_Z");
      gxTv_Sdtfoto_pessoa_Pes_id_Z = value ;
   }

   public void setgxTv_Sdtfoto_pessoa_Pes_id_Z_SetNull( )
   {
      gxTv_Sdtfoto_pessoa_Pes_id_Z = 0 ;
      SetDirty("Pes_id_Z");
   }

   public boolean getgxTv_Sdtfoto_pessoa_Pes_id_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_Sdtfoto_pessoa_Fp_data_Z( )
   {
      return gxTv_Sdtfoto_pessoa_Fp_data_Z ;
   }

   public void setgxTv_Sdtfoto_pessoa_Fp_data_Z( java.util.Date value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Fp_data_Z");
      gxTv_Sdtfoto_pessoa_Fp_data_Z = value ;
   }

   public void setgxTv_Sdtfoto_pessoa_Fp_data_Z_SetNull( )
   {
      gxTv_Sdtfoto_pessoa_Fp_data_Z = GXutil.nullDate() ;
      SetDirty("Fp_data_Z");
   }

   public boolean getgxTv_Sdtfoto_pessoa_Fp_data_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_Sdtfoto_pessoa_Fp_bucket_Z( )
   {
      return gxTv_Sdtfoto_pessoa_Fp_bucket_Z ;
   }

   public void setgxTv_Sdtfoto_pessoa_Fp_bucket_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Fp_bucket_Z");
      gxTv_Sdtfoto_pessoa_Fp_bucket_Z = value ;
   }

   public void setgxTv_Sdtfoto_pessoa_Fp_bucket_Z_SetNull( )
   {
      gxTv_Sdtfoto_pessoa_Fp_bucket_Z = "" ;
      SetDirty("Fp_bucket_Z");
   }

   public boolean getgxTv_Sdtfoto_pessoa_Fp_bucket_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_Sdtfoto_pessoa_Fp_hash_Z( )
   {
      return gxTv_Sdtfoto_pessoa_Fp_hash_Z ;
   }

   public void setgxTv_Sdtfoto_pessoa_Fp_hash_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Fp_hash_Z");
      gxTv_Sdtfoto_pessoa_Fp_hash_Z = value ;
   }

   public void setgxTv_Sdtfoto_pessoa_Fp_hash_Z_SetNull( )
   {
      gxTv_Sdtfoto_pessoa_Fp_hash_Z = "" ;
      SetDirty("Fp_hash_Z");
   }

   public boolean getgxTv_Sdtfoto_pessoa_Fp_hash_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_Sdtfoto_pessoa_Fp_foto_gxi_Z( )
   {
      return gxTv_Sdtfoto_pessoa_Fp_foto_gxi_Z ;
   }

   public void setgxTv_Sdtfoto_pessoa_Fp_foto_gxi_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Fp_foto_gxi_Z");
      gxTv_Sdtfoto_pessoa_Fp_foto_gxi_Z = value ;
   }

   public void setgxTv_Sdtfoto_pessoa_Fp_foto_gxi_Z_SetNull( )
   {
      gxTv_Sdtfoto_pessoa_Fp_foto_gxi_Z = "" ;
      SetDirty("Fp_foto_gxi_Z");
   }

   public boolean getgxTv_Sdtfoto_pessoa_Fp_foto_gxi_Z_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      com.projetopratico.foto_pessoa_bc obj;
      obj = new com.projetopratico.foto_pessoa_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      sdtIsNull = (byte)(1) ;
      gxTv_Sdtfoto_pessoa_Fp_data = GXutil.nullDate() ;
      gxTv_Sdtfoto_pessoa_Fp_bucket = "" ;
      gxTv_Sdtfoto_pessoa_Fp_hash = "" ;
      gxTv_Sdtfoto_pessoa_Fp_foto = "" ;
      gxTv_Sdtfoto_pessoa_Fp_foto_gxi = "" ;
      gxTv_Sdtfoto_pessoa_Mode = "" ;
      gxTv_Sdtfoto_pessoa_Fp_data_Z = GXutil.nullDate() ;
      gxTv_Sdtfoto_pessoa_Fp_bucket_Z = "" ;
      gxTv_Sdtfoto_pessoa_Fp_hash_Z = "" ;
      gxTv_Sdtfoto_pessoa_Fp_foto_gxi_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public com.projetopratico.Sdtfoto_pessoa Clone( )
   {
      com.projetopratico.Sdtfoto_pessoa sdt;
      com.projetopratico.foto_pessoa_bc obj;
      sdt = (com.projetopratico.Sdtfoto_pessoa)(clone()) ;
      obj = (com.projetopratico.foto_pessoa_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( com.projetopratico.StructSdtfoto_pessoa struct )
   {
      if ( struct != null )
      {
         setgxTv_Sdtfoto_pessoa_Fp_id(struct.getFp_id());
         setgxTv_Sdtfoto_pessoa_Pes_id(struct.getPes_id());
         setgxTv_Sdtfoto_pessoa_Fp_data(struct.getFp_data());
         setgxTv_Sdtfoto_pessoa_Fp_bucket(struct.getFp_bucket());
         setgxTv_Sdtfoto_pessoa_Fp_hash(struct.getFp_hash());
         setgxTv_Sdtfoto_pessoa_Fp_foto(struct.getFp_foto());
         setgxTv_Sdtfoto_pessoa_Fp_foto_gxi(struct.getFp_foto_gxi());
         setgxTv_Sdtfoto_pessoa_Mode(struct.getMode());
         setgxTv_Sdtfoto_pessoa_Initialized(struct.getInitialized());
         setgxTv_Sdtfoto_pessoa_Fp_id_Z(struct.getFp_id_Z());
         setgxTv_Sdtfoto_pessoa_Pes_id_Z(struct.getPes_id_Z());
         setgxTv_Sdtfoto_pessoa_Fp_data_Z(struct.getFp_data_Z());
         setgxTv_Sdtfoto_pessoa_Fp_bucket_Z(struct.getFp_bucket_Z());
         setgxTv_Sdtfoto_pessoa_Fp_hash_Z(struct.getFp_hash_Z());
         setgxTv_Sdtfoto_pessoa_Fp_foto_gxi_Z(struct.getFp_foto_gxi_Z());
      }
   }

   @SuppressWarnings("unchecked")
   public com.projetopratico.StructSdtfoto_pessoa getStruct( )
   {
      com.projetopratico.StructSdtfoto_pessoa struct = new com.projetopratico.StructSdtfoto_pessoa ();
      struct.setFp_id(getgxTv_Sdtfoto_pessoa_Fp_id());
      struct.setPes_id(getgxTv_Sdtfoto_pessoa_Pes_id());
      struct.setFp_data(getgxTv_Sdtfoto_pessoa_Fp_data());
      struct.setFp_bucket(getgxTv_Sdtfoto_pessoa_Fp_bucket());
      struct.setFp_hash(getgxTv_Sdtfoto_pessoa_Fp_hash());
      struct.setFp_foto(getgxTv_Sdtfoto_pessoa_Fp_foto());
      struct.setFp_foto_gxi(getgxTv_Sdtfoto_pessoa_Fp_foto_gxi());
      struct.setMode(getgxTv_Sdtfoto_pessoa_Mode());
      struct.setInitialized(getgxTv_Sdtfoto_pessoa_Initialized());
      struct.setFp_id_Z(getgxTv_Sdtfoto_pessoa_Fp_id_Z());
      struct.setPes_id_Z(getgxTv_Sdtfoto_pessoa_Pes_id_Z());
      struct.setFp_data_Z(getgxTv_Sdtfoto_pessoa_Fp_data_Z());
      struct.setFp_bucket_Z(getgxTv_Sdtfoto_pessoa_Fp_bucket_Z());
      struct.setFp_hash_Z(getgxTv_Sdtfoto_pessoa_Fp_hash_Z());
      struct.setFp_foto_gxi_Z(getgxTv_Sdtfoto_pessoa_Fp_foto_gxi_Z());
      return struct ;
   }

   private byte sdtIsNull ;
   private short gxTv_Sdtfoto_pessoa_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_Sdtfoto_pessoa_Fp_id ;
   private int gxTv_Sdtfoto_pessoa_Pes_id ;
   private int gxTv_Sdtfoto_pessoa_Fp_id_Z ;
   private int gxTv_Sdtfoto_pessoa_Pes_id_Z ;
   private String gxTv_Sdtfoto_pessoa_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_Sdtfoto_pessoa_Fp_data ;
   private java.util.Date gxTv_Sdtfoto_pessoa_Fp_data_Z ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_Sdtfoto_pessoa_Fp_bucket ;
   private String gxTv_Sdtfoto_pessoa_Fp_hash ;
   private String gxTv_Sdtfoto_pessoa_Fp_foto_gxi ;
   private String gxTv_Sdtfoto_pessoa_Fp_bucket_Z ;
   private String gxTv_Sdtfoto_pessoa_Fp_hash_Z ;
   private String gxTv_Sdtfoto_pessoa_Fp_foto_gxi_Z ;
   private String gxTv_Sdtfoto_pessoa_Fp_foto ;
}

