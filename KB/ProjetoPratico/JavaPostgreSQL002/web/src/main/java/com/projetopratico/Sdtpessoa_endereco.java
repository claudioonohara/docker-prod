package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class Sdtpessoa_endereco extends GxSilentTrnSdt
{
   public Sdtpessoa_endereco( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(Sdtpessoa_endereco.class));
   }

   public Sdtpessoa_endereco( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle, context, "Sdtpessoa_endereco");
      initialize( remoteHandle) ;
   }

   public Sdtpessoa_endereco( int remoteHandle ,
                              StructSdtpessoa_endereco struct )
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

   public void Load( int AV1pes_id ,
                     int AV17end_id )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {Integer.valueOf(AV1pes_id),Integer.valueOf(AV17end_id)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"pes_id", int.class}, new Object[]{"end_id", int.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "pessoa_endereco");
      metadata.set("BT", "pessoa_endereco");
      metadata.set("PK", "[ \"pes_id\",\"end_id\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"end_id\" ],\"FKMap\":[  ] },{ \"FK\":[ \"pes_id\" ],\"FKMap\":[  ] } ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_id") )
            {
               gxTv_Sdtpessoa_endereco_Pes_id = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "end_id") )
            {
               gxTv_Sdtpessoa_endereco_End_id = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_Sdtpessoa_endereco_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_Sdtpessoa_endereco_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_id_Z") )
            {
               gxTv_Sdtpessoa_endereco_Pes_id_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "end_id_Z") )
            {
               gxTv_Sdtpessoa_endereco_End_id_Z = (int)(getnumericvalue(oReader.getValue())) ;
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
         sName = "pessoa_endereco" ;
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
      oWriter.writeElement("pes_id", GXutil.trim( GXutil.str( gxTv_Sdtpessoa_endereco_Pes_id, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("end_id", GXutil.trim( GXutil.str( gxTv_Sdtpessoa_endereco_End_id, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_Sdtpessoa_endereco_Mode);
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_Sdtpessoa_endereco_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
         oWriter.writeElement("pes_id_Z", GXutil.trim( GXutil.str( gxTv_Sdtpessoa_endereco_Pes_id_Z, 8, 0)));
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
         oWriter.writeElement("end_id_Z", GXutil.trim( GXutil.str( gxTv_Sdtpessoa_endereco_End_id_Z, 8, 0)));
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
      AddObjectProperty("pes_id", gxTv_Sdtpessoa_endereco_Pes_id, false, includeNonInitialized);
      AddObjectProperty("end_id", gxTv_Sdtpessoa_endereco_End_id, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_Sdtpessoa_endereco_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_Sdtpessoa_endereco_Initialized, false, includeNonInitialized);
         AddObjectProperty("pes_id_Z", gxTv_Sdtpessoa_endereco_Pes_id_Z, false, includeNonInitialized);
         AddObjectProperty("end_id_Z", gxTv_Sdtpessoa_endereco_End_id_Z, false, includeNonInitialized);
      }
   }

   public void updateDirties( com.projetopratico.Sdtpessoa_endereco sdt )
   {
      if ( sdt.IsDirty("pes_id") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtpessoa_endereco_Pes_id = sdt.getgxTv_Sdtpessoa_endereco_Pes_id() ;
      }
      if ( sdt.IsDirty("end_id") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtpessoa_endereco_End_id = sdt.getgxTv_Sdtpessoa_endereco_End_id() ;
      }
   }

   public int getgxTv_Sdtpessoa_endereco_Pes_id( )
   {
      return gxTv_Sdtpessoa_endereco_Pes_id ;
   }

   public void setgxTv_Sdtpessoa_endereco_Pes_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      if ( gxTv_Sdtpessoa_endereco_Pes_id != value )
      {
         gxTv_Sdtpessoa_endereco_Mode = "INS" ;
         this.setgxTv_Sdtpessoa_endereco_Pes_id_Z_SetNull( );
         this.setgxTv_Sdtpessoa_endereco_End_id_Z_SetNull( );
      }
      SetDirty("Pes_id");
      gxTv_Sdtpessoa_endereco_Pes_id = value ;
   }

   public int getgxTv_Sdtpessoa_endereco_End_id( )
   {
      return gxTv_Sdtpessoa_endereco_End_id ;
   }

   public void setgxTv_Sdtpessoa_endereco_End_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      if ( gxTv_Sdtpessoa_endereco_End_id != value )
      {
         gxTv_Sdtpessoa_endereco_Mode = "INS" ;
         this.setgxTv_Sdtpessoa_endereco_Pes_id_Z_SetNull( );
         this.setgxTv_Sdtpessoa_endereco_End_id_Z_SetNull( );
      }
      SetDirty("End_id");
      gxTv_Sdtpessoa_endereco_End_id = value ;
   }

   public String getgxTv_Sdtpessoa_endereco_Mode( )
   {
      return gxTv_Sdtpessoa_endereco_Mode ;
   }

   public void setgxTv_Sdtpessoa_endereco_Mode( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Mode");
      gxTv_Sdtpessoa_endereco_Mode = value ;
   }

   public void setgxTv_Sdtpessoa_endereco_Mode_SetNull( )
   {
      gxTv_Sdtpessoa_endereco_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_Sdtpessoa_endereco_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_Sdtpessoa_endereco_Initialized( )
   {
      return gxTv_Sdtpessoa_endereco_Initialized ;
   }

   public void setgxTv_Sdtpessoa_endereco_Initialized( short value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_Sdtpessoa_endereco_Initialized = value ;
   }

   public void setgxTv_Sdtpessoa_endereco_Initialized_SetNull( )
   {
      gxTv_Sdtpessoa_endereco_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_Sdtpessoa_endereco_Initialized_IsNull( )
   {
      return false ;
   }

   public int getgxTv_Sdtpessoa_endereco_Pes_id_Z( )
   {
      return gxTv_Sdtpessoa_endereco_Pes_id_Z ;
   }

   public void setgxTv_Sdtpessoa_endereco_Pes_id_Z( int value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Pes_id_Z");
      gxTv_Sdtpessoa_endereco_Pes_id_Z = value ;
   }

   public void setgxTv_Sdtpessoa_endereco_Pes_id_Z_SetNull( )
   {
      gxTv_Sdtpessoa_endereco_Pes_id_Z = 0 ;
      SetDirty("Pes_id_Z");
   }

   public boolean getgxTv_Sdtpessoa_endereco_Pes_id_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_Sdtpessoa_endereco_End_id_Z( )
   {
      return gxTv_Sdtpessoa_endereco_End_id_Z ;
   }

   public void setgxTv_Sdtpessoa_endereco_End_id_Z( int value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("End_id_Z");
      gxTv_Sdtpessoa_endereco_End_id_Z = value ;
   }

   public void setgxTv_Sdtpessoa_endereco_End_id_Z_SetNull( )
   {
      gxTv_Sdtpessoa_endereco_End_id_Z = 0 ;
      SetDirty("End_id_Z");
   }

   public boolean getgxTv_Sdtpessoa_endereco_End_id_Z_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      com.projetopratico.pessoa_endereco_bc obj;
      obj = new com.projetopratico.pessoa_endereco_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      sdtIsNull = (byte)(1) ;
      gxTv_Sdtpessoa_endereco_Mode = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public com.projetopratico.Sdtpessoa_endereco Clone( )
   {
      com.projetopratico.Sdtpessoa_endereco sdt;
      com.projetopratico.pessoa_endereco_bc obj;
      sdt = (com.projetopratico.Sdtpessoa_endereco)(clone()) ;
      obj = (com.projetopratico.pessoa_endereco_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( com.projetopratico.StructSdtpessoa_endereco struct )
   {
      if ( struct != null )
      {
         setgxTv_Sdtpessoa_endereco_Pes_id(struct.getPes_id());
         setgxTv_Sdtpessoa_endereco_End_id(struct.getEnd_id());
         setgxTv_Sdtpessoa_endereco_Mode(struct.getMode());
         setgxTv_Sdtpessoa_endereco_Initialized(struct.getInitialized());
         setgxTv_Sdtpessoa_endereco_Pes_id_Z(struct.getPes_id_Z());
         setgxTv_Sdtpessoa_endereco_End_id_Z(struct.getEnd_id_Z());
      }
   }

   @SuppressWarnings("unchecked")
   public com.projetopratico.StructSdtpessoa_endereco getStruct( )
   {
      com.projetopratico.StructSdtpessoa_endereco struct = new com.projetopratico.StructSdtpessoa_endereco ();
      struct.setPes_id(getgxTv_Sdtpessoa_endereco_Pes_id());
      struct.setEnd_id(getgxTv_Sdtpessoa_endereco_End_id());
      struct.setMode(getgxTv_Sdtpessoa_endereco_Mode());
      struct.setInitialized(getgxTv_Sdtpessoa_endereco_Initialized());
      struct.setPes_id_Z(getgxTv_Sdtpessoa_endereco_Pes_id_Z());
      struct.setEnd_id_Z(getgxTv_Sdtpessoa_endereco_End_id_Z());
      return struct ;
   }

   private byte sdtIsNull ;
   private short gxTv_Sdtpessoa_endereco_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_Sdtpessoa_endereco_Pes_id ;
   private int gxTv_Sdtpessoa_endereco_End_id ;
   private int gxTv_Sdtpessoa_endereco_Pes_id_Z ;
   private int gxTv_Sdtpessoa_endereco_End_id_Z ;
   private String gxTv_Sdtpessoa_endereco_Mode ;
   private String sTagName ;
   private boolean readElement ;
   private boolean formatError ;
}

