package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class Sdtservidor_efetivo extends GxSilentTrnSdt
{
   public Sdtservidor_efetivo( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(Sdtservidor_efetivo.class));
   }

   public Sdtservidor_efetivo( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle, context, "Sdtservidor_efetivo");
      initialize( remoteHandle) ;
   }

   public Sdtservidor_efetivo( int remoteHandle ,
                               StructSdtservidor_efetivo struct )
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
                     String AV24se_matricula )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {Integer.valueOf(AV1pes_id),AV24se_matricula});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"pes_id", int.class}, new Object[]{"se_matricula", String.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "servidor_efetivo");
      metadata.set("BT", "servidor_efetivo");
      metadata.set("PK", "[ \"pes_id\",\"se_matricula\" ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_id") )
            {
               gxTv_Sdtservidor_efetivo_Pes_id = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "se_matricula") )
            {
               gxTv_Sdtservidor_efetivo_Se_matricula = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_Sdtservidor_efetivo_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_Sdtservidor_efetivo_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_id_Z") )
            {
               gxTv_Sdtservidor_efetivo_Pes_id_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "se_matricula_Z") )
            {
               gxTv_Sdtservidor_efetivo_Se_matricula_Z = oReader.getValue() ;
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
         sName = "servidor_efetivo" ;
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
      oWriter.writeElement("pes_id", GXutil.trim( GXutil.str( gxTv_Sdtservidor_efetivo_Pes_id, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("se_matricula", gxTv_Sdtservidor_efetivo_Se_matricula);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_Sdtservidor_efetivo_Mode);
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_Sdtservidor_efetivo_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
         oWriter.writeElement("pes_id_Z", GXutil.trim( GXutil.str( gxTv_Sdtservidor_efetivo_Pes_id_Z, 8, 0)));
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
         oWriter.writeElement("se_matricula_Z", gxTv_Sdtservidor_efetivo_Se_matricula_Z);
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
      AddObjectProperty("pes_id", gxTv_Sdtservidor_efetivo_Pes_id, false, includeNonInitialized);
      AddObjectProperty("se_matricula", gxTv_Sdtservidor_efetivo_Se_matricula, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_Sdtservidor_efetivo_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_Sdtservidor_efetivo_Initialized, false, includeNonInitialized);
         AddObjectProperty("pes_id_Z", gxTv_Sdtservidor_efetivo_Pes_id_Z, false, includeNonInitialized);
         AddObjectProperty("se_matricula_Z", gxTv_Sdtservidor_efetivo_Se_matricula_Z, false, includeNonInitialized);
      }
   }

   public void updateDirties( com.projetopratico.Sdtservidor_efetivo sdt )
   {
      if ( sdt.IsDirty("pes_id") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtservidor_efetivo_Pes_id = sdt.getgxTv_Sdtservidor_efetivo_Pes_id() ;
      }
      if ( sdt.IsDirty("se_matricula") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtservidor_efetivo_Se_matricula = sdt.getgxTv_Sdtservidor_efetivo_Se_matricula() ;
      }
   }

   public int getgxTv_Sdtservidor_efetivo_Pes_id( )
   {
      return gxTv_Sdtservidor_efetivo_Pes_id ;
   }

   public void setgxTv_Sdtservidor_efetivo_Pes_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      if ( gxTv_Sdtservidor_efetivo_Pes_id != value )
      {
         gxTv_Sdtservidor_efetivo_Mode = "INS" ;
         this.setgxTv_Sdtservidor_efetivo_Pes_id_Z_SetNull( );
         this.setgxTv_Sdtservidor_efetivo_Se_matricula_Z_SetNull( );
      }
      SetDirty("Pes_id");
      gxTv_Sdtservidor_efetivo_Pes_id = value ;
   }

   public String getgxTv_Sdtservidor_efetivo_Se_matricula( )
   {
      return gxTv_Sdtservidor_efetivo_Se_matricula ;
   }

   public void setgxTv_Sdtservidor_efetivo_Se_matricula( String value )
   {
      sdtIsNull = (byte)(0) ;
      if ( GXutil.strcmp(gxTv_Sdtservidor_efetivo_Se_matricula, value) != 0 )
      {
         gxTv_Sdtservidor_efetivo_Mode = "INS" ;
         this.setgxTv_Sdtservidor_efetivo_Pes_id_Z_SetNull( );
         this.setgxTv_Sdtservidor_efetivo_Se_matricula_Z_SetNull( );
      }
      SetDirty("Se_matricula");
      gxTv_Sdtservidor_efetivo_Se_matricula = value ;
   }

   public String getgxTv_Sdtservidor_efetivo_Mode( )
   {
      return gxTv_Sdtservidor_efetivo_Mode ;
   }

   public void setgxTv_Sdtservidor_efetivo_Mode( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Mode");
      gxTv_Sdtservidor_efetivo_Mode = value ;
   }

   public void setgxTv_Sdtservidor_efetivo_Mode_SetNull( )
   {
      gxTv_Sdtservidor_efetivo_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_Sdtservidor_efetivo_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_Sdtservidor_efetivo_Initialized( )
   {
      return gxTv_Sdtservidor_efetivo_Initialized ;
   }

   public void setgxTv_Sdtservidor_efetivo_Initialized( short value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_Sdtservidor_efetivo_Initialized = value ;
   }

   public void setgxTv_Sdtservidor_efetivo_Initialized_SetNull( )
   {
      gxTv_Sdtservidor_efetivo_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_Sdtservidor_efetivo_Initialized_IsNull( )
   {
      return false ;
   }

   public int getgxTv_Sdtservidor_efetivo_Pes_id_Z( )
   {
      return gxTv_Sdtservidor_efetivo_Pes_id_Z ;
   }

   public void setgxTv_Sdtservidor_efetivo_Pes_id_Z( int value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Pes_id_Z");
      gxTv_Sdtservidor_efetivo_Pes_id_Z = value ;
   }

   public void setgxTv_Sdtservidor_efetivo_Pes_id_Z_SetNull( )
   {
      gxTv_Sdtservidor_efetivo_Pes_id_Z = 0 ;
      SetDirty("Pes_id_Z");
   }

   public boolean getgxTv_Sdtservidor_efetivo_Pes_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_Sdtservidor_efetivo_Se_matricula_Z( )
   {
      return gxTv_Sdtservidor_efetivo_Se_matricula_Z ;
   }

   public void setgxTv_Sdtservidor_efetivo_Se_matricula_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Se_matricula_Z");
      gxTv_Sdtservidor_efetivo_Se_matricula_Z = value ;
   }

   public void setgxTv_Sdtservidor_efetivo_Se_matricula_Z_SetNull( )
   {
      gxTv_Sdtservidor_efetivo_Se_matricula_Z = "" ;
      SetDirty("Se_matricula_Z");
   }

   public boolean getgxTv_Sdtservidor_efetivo_Se_matricula_Z_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      com.projetopratico.servidor_efetivo_bc obj;
      obj = new com.projetopratico.servidor_efetivo_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      sdtIsNull = (byte)(1) ;
      gxTv_Sdtservidor_efetivo_Se_matricula = "" ;
      gxTv_Sdtservidor_efetivo_Mode = "" ;
      gxTv_Sdtservidor_efetivo_Se_matricula_Z = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public com.projetopratico.Sdtservidor_efetivo Clone( )
   {
      com.projetopratico.Sdtservidor_efetivo sdt;
      com.projetopratico.servidor_efetivo_bc obj;
      sdt = (com.projetopratico.Sdtservidor_efetivo)(clone()) ;
      obj = (com.projetopratico.servidor_efetivo_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( com.projetopratico.StructSdtservidor_efetivo struct )
   {
      if ( struct != null )
      {
         setgxTv_Sdtservidor_efetivo_Pes_id(struct.getPes_id());
         setgxTv_Sdtservidor_efetivo_Se_matricula(struct.getSe_matricula());
         setgxTv_Sdtservidor_efetivo_Mode(struct.getMode());
         setgxTv_Sdtservidor_efetivo_Initialized(struct.getInitialized());
         setgxTv_Sdtservidor_efetivo_Pes_id_Z(struct.getPes_id_Z());
         setgxTv_Sdtservidor_efetivo_Se_matricula_Z(struct.getSe_matricula_Z());
      }
   }

   @SuppressWarnings("unchecked")
   public com.projetopratico.StructSdtservidor_efetivo getStruct( )
   {
      com.projetopratico.StructSdtservidor_efetivo struct = new com.projetopratico.StructSdtservidor_efetivo ();
      struct.setPes_id(getgxTv_Sdtservidor_efetivo_Pes_id());
      struct.setSe_matricula(getgxTv_Sdtservidor_efetivo_Se_matricula());
      struct.setMode(getgxTv_Sdtservidor_efetivo_Mode());
      struct.setInitialized(getgxTv_Sdtservidor_efetivo_Initialized());
      struct.setPes_id_Z(getgxTv_Sdtservidor_efetivo_Pes_id_Z());
      struct.setSe_matricula_Z(getgxTv_Sdtservidor_efetivo_Se_matricula_Z());
      return struct ;
   }

   private byte sdtIsNull ;
   private short gxTv_Sdtservidor_efetivo_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_Sdtservidor_efetivo_Pes_id ;
   private int gxTv_Sdtservidor_efetivo_Pes_id_Z ;
   private String gxTv_Sdtservidor_efetivo_Mode ;
   private String sTagName ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_Sdtservidor_efetivo_Se_matricula ;
   private String gxTv_Sdtservidor_efetivo_Se_matricula_Z ;
}

