package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class Sdtendereco extends GxSilentTrnSdt
{
   public Sdtendereco( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(Sdtendereco.class));
   }

   public Sdtendereco( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle, context, "Sdtendereco");
      initialize( remoteHandle) ;
   }

   public Sdtendereco( int remoteHandle ,
                       StructSdtendereco struct )
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

   public void Load( int AV17end_id )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {Integer.valueOf(AV17end_id)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"end_id", int.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "endereco");
      metadata.set("BT", "endereco");
      metadata.set("PK", "[ \"end_id\" ]");
      metadata.set("PKAssigned", "[ \"end_id\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"cid_id\" ],\"FKMap\":[  ] } ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "end_id") )
            {
               gxTv_Sdtendereco_End_id = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "end_tipo_logradouro") )
            {
               gxTv_Sdtendereco_End_tipo_logradouro = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "end_logradouro") )
            {
               gxTv_Sdtendereco_End_logradouro = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "end_numero") )
            {
               gxTv_Sdtendereco_End_numero = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "end_bairro") )
            {
               gxTv_Sdtendereco_End_bairro = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "cid_id") )
            {
               gxTv_Sdtendereco_Cid_id = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_Sdtendereco_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_Sdtendereco_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "end_id_Z") )
            {
               gxTv_Sdtendereco_End_id_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "end_tipo_logradouro_Z") )
            {
               gxTv_Sdtendereco_End_tipo_logradouro_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "end_logradouro_Z") )
            {
               gxTv_Sdtendereco_End_logradouro_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "end_numero_Z") )
            {
               gxTv_Sdtendereco_End_numero_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "end_bairro_Z") )
            {
               gxTv_Sdtendereco_End_bairro_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "cid_id_Z") )
            {
               gxTv_Sdtendereco_Cid_id_Z = (int)(getnumericvalue(oReader.getValue())) ;
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
         sName = "endereco" ;
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
      oWriter.writeElement("end_id", GXutil.trim( GXutil.str( gxTv_Sdtendereco_End_id, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("end_tipo_logradouro", gxTv_Sdtendereco_End_tipo_logradouro);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("end_logradouro", gxTv_Sdtendereco_End_logradouro);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("end_numero", GXutil.trim( GXutil.str( gxTv_Sdtendereco_End_numero, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("end_bairro", gxTv_Sdtendereco_End_bairro);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("cid_id", GXutil.trim( GXutil.str( gxTv_Sdtendereco_Cid_id, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_Sdtendereco_Mode);
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_Sdtendereco_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
         oWriter.writeElement("end_id_Z", GXutil.trim( GXutil.str( gxTv_Sdtendereco_End_id_Z, 8, 0)));
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
         oWriter.writeElement("end_tipo_logradouro_Z", gxTv_Sdtendereco_End_tipo_logradouro_Z);
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
         oWriter.writeElement("end_logradouro_Z", gxTv_Sdtendereco_End_logradouro_Z);
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
         oWriter.writeElement("end_numero_Z", GXutil.trim( GXutil.str( gxTv_Sdtendereco_End_numero_Z, 8, 0)));
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
         oWriter.writeElement("end_bairro_Z", gxTv_Sdtendereco_End_bairro_Z);
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
         oWriter.writeElement("cid_id_Z", GXutil.trim( GXutil.str( gxTv_Sdtendereco_Cid_id_Z, 8, 0)));
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
      AddObjectProperty("end_id", gxTv_Sdtendereco_End_id, false, includeNonInitialized);
      AddObjectProperty("end_tipo_logradouro", gxTv_Sdtendereco_End_tipo_logradouro, false, includeNonInitialized);
      AddObjectProperty("end_logradouro", gxTv_Sdtendereco_End_logradouro, false, includeNonInitialized);
      AddObjectProperty("end_numero", gxTv_Sdtendereco_End_numero, false, includeNonInitialized);
      AddObjectProperty("end_bairro", gxTv_Sdtendereco_End_bairro, false, includeNonInitialized);
      AddObjectProperty("cid_id", gxTv_Sdtendereco_Cid_id, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_Sdtendereco_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_Sdtendereco_Initialized, false, includeNonInitialized);
         AddObjectProperty("end_id_Z", gxTv_Sdtendereco_End_id_Z, false, includeNonInitialized);
         AddObjectProperty("end_tipo_logradouro_Z", gxTv_Sdtendereco_End_tipo_logradouro_Z, false, includeNonInitialized);
         AddObjectProperty("end_logradouro_Z", gxTv_Sdtendereco_End_logradouro_Z, false, includeNonInitialized);
         AddObjectProperty("end_numero_Z", gxTv_Sdtendereco_End_numero_Z, false, includeNonInitialized);
         AddObjectProperty("end_bairro_Z", gxTv_Sdtendereco_End_bairro_Z, false, includeNonInitialized);
         AddObjectProperty("cid_id_Z", gxTv_Sdtendereco_Cid_id_Z, false, includeNonInitialized);
      }
   }

   public void updateDirties( com.projetopratico.Sdtendereco sdt )
   {
      if ( sdt.IsDirty("end_id") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtendereco_End_id = sdt.getgxTv_Sdtendereco_End_id() ;
      }
      if ( sdt.IsDirty("end_tipo_logradouro") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtendereco_End_tipo_logradouro = sdt.getgxTv_Sdtendereco_End_tipo_logradouro() ;
      }
      if ( sdt.IsDirty("end_logradouro") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtendereco_End_logradouro = sdt.getgxTv_Sdtendereco_End_logradouro() ;
      }
      if ( sdt.IsDirty("end_numero") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtendereco_End_numero = sdt.getgxTv_Sdtendereco_End_numero() ;
      }
      if ( sdt.IsDirty("end_bairro") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtendereco_End_bairro = sdt.getgxTv_Sdtendereco_End_bairro() ;
      }
      if ( sdt.IsDirty("cid_id") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtendereco_Cid_id = sdt.getgxTv_Sdtendereco_Cid_id() ;
      }
   }

   public int getgxTv_Sdtendereco_End_id( )
   {
      return gxTv_Sdtendereco_End_id ;
   }

   public void setgxTv_Sdtendereco_End_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      if ( gxTv_Sdtendereco_End_id != value )
      {
         gxTv_Sdtendereco_Mode = "INS" ;
         this.setgxTv_Sdtendereco_End_id_Z_SetNull( );
         this.setgxTv_Sdtendereco_End_tipo_logradouro_Z_SetNull( );
         this.setgxTv_Sdtendereco_End_logradouro_Z_SetNull( );
         this.setgxTv_Sdtendereco_End_numero_Z_SetNull( );
         this.setgxTv_Sdtendereco_End_bairro_Z_SetNull( );
         this.setgxTv_Sdtendereco_Cid_id_Z_SetNull( );
      }
      SetDirty("End_id");
      gxTv_Sdtendereco_End_id = value ;
   }

   public String getgxTv_Sdtendereco_End_tipo_logradouro( )
   {
      return gxTv_Sdtendereco_End_tipo_logradouro ;
   }

   public void setgxTv_Sdtendereco_End_tipo_logradouro( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("End_tipo_logradouro");
      gxTv_Sdtendereco_End_tipo_logradouro = value ;
   }

   public String getgxTv_Sdtendereco_End_logradouro( )
   {
      return gxTv_Sdtendereco_End_logradouro ;
   }

   public void setgxTv_Sdtendereco_End_logradouro( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("End_logradouro");
      gxTv_Sdtendereco_End_logradouro = value ;
   }

   public int getgxTv_Sdtendereco_End_numero( )
   {
      return gxTv_Sdtendereco_End_numero ;
   }

   public void setgxTv_Sdtendereco_End_numero( int value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("End_numero");
      gxTv_Sdtendereco_End_numero = value ;
   }

   public String getgxTv_Sdtendereco_End_bairro( )
   {
      return gxTv_Sdtendereco_End_bairro ;
   }

   public void setgxTv_Sdtendereco_End_bairro( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("End_bairro");
      gxTv_Sdtendereco_End_bairro = value ;
   }

   public int getgxTv_Sdtendereco_Cid_id( )
   {
      return gxTv_Sdtendereco_Cid_id ;
   }

   public void setgxTv_Sdtendereco_Cid_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Cid_id");
      gxTv_Sdtendereco_Cid_id = value ;
   }

   public String getgxTv_Sdtendereco_Mode( )
   {
      return gxTv_Sdtendereco_Mode ;
   }

   public void setgxTv_Sdtendereco_Mode( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Mode");
      gxTv_Sdtendereco_Mode = value ;
   }

   public void setgxTv_Sdtendereco_Mode_SetNull( )
   {
      gxTv_Sdtendereco_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_Sdtendereco_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_Sdtendereco_Initialized( )
   {
      return gxTv_Sdtendereco_Initialized ;
   }

   public void setgxTv_Sdtendereco_Initialized( short value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_Sdtendereco_Initialized = value ;
   }

   public void setgxTv_Sdtendereco_Initialized_SetNull( )
   {
      gxTv_Sdtendereco_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_Sdtendereco_Initialized_IsNull( )
   {
      return false ;
   }

   public int getgxTv_Sdtendereco_End_id_Z( )
   {
      return gxTv_Sdtendereco_End_id_Z ;
   }

   public void setgxTv_Sdtendereco_End_id_Z( int value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("End_id_Z");
      gxTv_Sdtendereco_End_id_Z = value ;
   }

   public void setgxTv_Sdtendereco_End_id_Z_SetNull( )
   {
      gxTv_Sdtendereco_End_id_Z = 0 ;
      SetDirty("End_id_Z");
   }

   public boolean getgxTv_Sdtendereco_End_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_Sdtendereco_End_tipo_logradouro_Z( )
   {
      return gxTv_Sdtendereco_End_tipo_logradouro_Z ;
   }

   public void setgxTv_Sdtendereco_End_tipo_logradouro_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("End_tipo_logradouro_Z");
      gxTv_Sdtendereco_End_tipo_logradouro_Z = value ;
   }

   public void setgxTv_Sdtendereco_End_tipo_logradouro_Z_SetNull( )
   {
      gxTv_Sdtendereco_End_tipo_logradouro_Z = "" ;
      SetDirty("End_tipo_logradouro_Z");
   }

   public boolean getgxTv_Sdtendereco_End_tipo_logradouro_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_Sdtendereco_End_logradouro_Z( )
   {
      return gxTv_Sdtendereco_End_logradouro_Z ;
   }

   public void setgxTv_Sdtendereco_End_logradouro_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("End_logradouro_Z");
      gxTv_Sdtendereco_End_logradouro_Z = value ;
   }

   public void setgxTv_Sdtendereco_End_logradouro_Z_SetNull( )
   {
      gxTv_Sdtendereco_End_logradouro_Z = "" ;
      SetDirty("End_logradouro_Z");
   }

   public boolean getgxTv_Sdtendereco_End_logradouro_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_Sdtendereco_End_numero_Z( )
   {
      return gxTv_Sdtendereco_End_numero_Z ;
   }

   public void setgxTv_Sdtendereco_End_numero_Z( int value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("End_numero_Z");
      gxTv_Sdtendereco_End_numero_Z = value ;
   }

   public void setgxTv_Sdtendereco_End_numero_Z_SetNull( )
   {
      gxTv_Sdtendereco_End_numero_Z = 0 ;
      SetDirty("End_numero_Z");
   }

   public boolean getgxTv_Sdtendereco_End_numero_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_Sdtendereco_End_bairro_Z( )
   {
      return gxTv_Sdtendereco_End_bairro_Z ;
   }

   public void setgxTv_Sdtendereco_End_bairro_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("End_bairro_Z");
      gxTv_Sdtendereco_End_bairro_Z = value ;
   }

   public void setgxTv_Sdtendereco_End_bairro_Z_SetNull( )
   {
      gxTv_Sdtendereco_End_bairro_Z = "" ;
      SetDirty("End_bairro_Z");
   }

   public boolean getgxTv_Sdtendereco_End_bairro_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_Sdtendereco_Cid_id_Z( )
   {
      return gxTv_Sdtendereco_Cid_id_Z ;
   }

   public void setgxTv_Sdtendereco_Cid_id_Z( int value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Cid_id_Z");
      gxTv_Sdtendereco_Cid_id_Z = value ;
   }

   public void setgxTv_Sdtendereco_Cid_id_Z_SetNull( )
   {
      gxTv_Sdtendereco_Cid_id_Z = 0 ;
      SetDirty("Cid_id_Z");
   }

   public boolean getgxTv_Sdtendereco_Cid_id_Z_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      com.projetopratico.endereco_bc obj;
      obj = new com.projetopratico.endereco_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      sdtIsNull = (byte)(1) ;
      gxTv_Sdtendereco_End_tipo_logradouro = "" ;
      gxTv_Sdtendereco_End_logradouro = "" ;
      gxTv_Sdtendereco_End_bairro = "" ;
      gxTv_Sdtendereco_Mode = "" ;
      gxTv_Sdtendereco_End_tipo_logradouro_Z = "" ;
      gxTv_Sdtendereco_End_logradouro_Z = "" ;
      gxTv_Sdtendereco_End_bairro_Z = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public com.projetopratico.Sdtendereco Clone( )
   {
      com.projetopratico.Sdtendereco sdt;
      com.projetopratico.endereco_bc obj;
      sdt = (com.projetopratico.Sdtendereco)(clone()) ;
      obj = (com.projetopratico.endereco_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( com.projetopratico.StructSdtendereco struct )
   {
      if ( struct != null )
      {
         setgxTv_Sdtendereco_End_id(struct.getEnd_id());
         setgxTv_Sdtendereco_End_tipo_logradouro(struct.getEnd_tipo_logradouro());
         setgxTv_Sdtendereco_End_logradouro(struct.getEnd_logradouro());
         setgxTv_Sdtendereco_End_numero(struct.getEnd_numero());
         setgxTv_Sdtendereco_End_bairro(struct.getEnd_bairro());
         setgxTv_Sdtendereco_Cid_id(struct.getCid_id());
         setgxTv_Sdtendereco_Mode(struct.getMode());
         setgxTv_Sdtendereco_Initialized(struct.getInitialized());
         setgxTv_Sdtendereco_End_id_Z(struct.getEnd_id_Z());
         setgxTv_Sdtendereco_End_tipo_logradouro_Z(struct.getEnd_tipo_logradouro_Z());
         setgxTv_Sdtendereco_End_logradouro_Z(struct.getEnd_logradouro_Z());
         setgxTv_Sdtendereco_End_numero_Z(struct.getEnd_numero_Z());
         setgxTv_Sdtendereco_End_bairro_Z(struct.getEnd_bairro_Z());
         setgxTv_Sdtendereco_Cid_id_Z(struct.getCid_id_Z());
      }
   }

   @SuppressWarnings("unchecked")
   public com.projetopratico.StructSdtendereco getStruct( )
   {
      com.projetopratico.StructSdtendereco struct = new com.projetopratico.StructSdtendereco ();
      struct.setEnd_id(getgxTv_Sdtendereco_End_id());
      struct.setEnd_tipo_logradouro(getgxTv_Sdtendereco_End_tipo_logradouro());
      struct.setEnd_logradouro(getgxTv_Sdtendereco_End_logradouro());
      struct.setEnd_numero(getgxTv_Sdtendereco_End_numero());
      struct.setEnd_bairro(getgxTv_Sdtendereco_End_bairro());
      struct.setCid_id(getgxTv_Sdtendereco_Cid_id());
      struct.setMode(getgxTv_Sdtendereco_Mode());
      struct.setInitialized(getgxTv_Sdtendereco_Initialized());
      struct.setEnd_id_Z(getgxTv_Sdtendereco_End_id_Z());
      struct.setEnd_tipo_logradouro_Z(getgxTv_Sdtendereco_End_tipo_logradouro_Z());
      struct.setEnd_logradouro_Z(getgxTv_Sdtendereco_End_logradouro_Z());
      struct.setEnd_numero_Z(getgxTv_Sdtendereco_End_numero_Z());
      struct.setEnd_bairro_Z(getgxTv_Sdtendereco_End_bairro_Z());
      struct.setCid_id_Z(getgxTv_Sdtendereco_Cid_id_Z());
      return struct ;
   }

   private byte sdtIsNull ;
   private short gxTv_Sdtendereco_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_Sdtendereco_End_id ;
   private int gxTv_Sdtendereco_End_numero ;
   private int gxTv_Sdtendereco_Cid_id ;
   private int gxTv_Sdtendereco_End_id_Z ;
   private int gxTv_Sdtendereco_End_numero_Z ;
   private int gxTv_Sdtendereco_Cid_id_Z ;
   private String gxTv_Sdtendereco_Mode ;
   private String sTagName ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_Sdtendereco_End_tipo_logradouro ;
   private String gxTv_Sdtendereco_End_logradouro ;
   private String gxTv_Sdtendereco_End_bairro ;
   private String gxTv_Sdtendereco_End_tipo_logradouro_Z ;
   private String gxTv_Sdtendereco_End_logradouro_Z ;
   private String gxTv_Sdtendereco_End_bairro_Z ;
}

