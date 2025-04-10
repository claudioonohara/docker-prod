package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class Sdtunidade_endereco extends GxSilentTrnSdt
{
   public Sdtunidade_endereco( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(Sdtunidade_endereco.class));
   }

   public Sdtunidade_endereco( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle, context, "Sdtunidade_endereco");
      initialize( remoteHandle) ;
   }

   public Sdtunidade_endereco( int remoteHandle ,
                               StructSdtunidade_endereco struct )
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

   public void Load( int AV7unid_id ,
                     int AV17end_id )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {Integer.valueOf(AV7unid_id),Integer.valueOf(AV17end_id)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"unid_id", int.class}, new Object[]{"end_id", int.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "unidade_endereco");
      metadata.set("BT", "unidade_endereco");
      metadata.set("PK", "[ \"unid_id\",\"end_id\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"end_id\" ],\"FKMap\":[  ] },{ \"FK\":[ \"unid_id\" ],\"FKMap\":[  ] } ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_id") )
            {
               gxTv_Sdtunidade_endereco_Unid_id = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "end_id") )
            {
               gxTv_Sdtunidade_endereco_End_id = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_Sdtunidade_endereco_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_Sdtunidade_endereco_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_id_Z") )
            {
               gxTv_Sdtunidade_endereco_Unid_id_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "end_id_Z") )
            {
               gxTv_Sdtunidade_endereco_End_id_Z = (int)(getnumericvalue(oReader.getValue())) ;
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
         sName = "unidade_endereco" ;
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
      oWriter.writeElement("unid_id", GXutil.trim( GXutil.str( gxTv_Sdtunidade_endereco_Unid_id, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("end_id", GXutil.trim( GXutil.str( gxTv_Sdtunidade_endereco_End_id, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_Sdtunidade_endereco_Mode);
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_Sdtunidade_endereco_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
         oWriter.writeElement("unid_id_Z", GXutil.trim( GXutil.str( gxTv_Sdtunidade_endereco_Unid_id_Z, 8, 0)));
         if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ProjetoPratico");
         }
         oWriter.writeElement("end_id_Z", GXutil.trim( GXutil.str( gxTv_Sdtunidade_endereco_End_id_Z, 8, 0)));
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
      AddObjectProperty("unid_id", gxTv_Sdtunidade_endereco_Unid_id, false, includeNonInitialized);
      AddObjectProperty("end_id", gxTv_Sdtunidade_endereco_End_id, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_Sdtunidade_endereco_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_Sdtunidade_endereco_Initialized, false, includeNonInitialized);
         AddObjectProperty("unid_id_Z", gxTv_Sdtunidade_endereco_Unid_id_Z, false, includeNonInitialized);
         AddObjectProperty("end_id_Z", gxTv_Sdtunidade_endereco_End_id_Z, false, includeNonInitialized);
      }
   }

   public void updateDirties( com.projetopratico.Sdtunidade_endereco sdt )
   {
      if ( sdt.IsDirty("unid_id") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtunidade_endereco_Unid_id = sdt.getgxTv_Sdtunidade_endereco_Unid_id() ;
      }
      if ( sdt.IsDirty("end_id") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtunidade_endereco_End_id = sdt.getgxTv_Sdtunidade_endereco_End_id() ;
      }
   }

   public int getgxTv_Sdtunidade_endereco_Unid_id( )
   {
      return gxTv_Sdtunidade_endereco_Unid_id ;
   }

   public void setgxTv_Sdtunidade_endereco_Unid_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      if ( gxTv_Sdtunidade_endereco_Unid_id != value )
      {
         gxTv_Sdtunidade_endereco_Mode = "INS" ;
         this.setgxTv_Sdtunidade_endereco_Unid_id_Z_SetNull( );
         this.setgxTv_Sdtunidade_endereco_End_id_Z_SetNull( );
      }
      SetDirty("Unid_id");
      gxTv_Sdtunidade_endereco_Unid_id = value ;
   }

   public int getgxTv_Sdtunidade_endereco_End_id( )
   {
      return gxTv_Sdtunidade_endereco_End_id ;
   }

   public void setgxTv_Sdtunidade_endereco_End_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      if ( gxTv_Sdtunidade_endereco_End_id != value )
      {
         gxTv_Sdtunidade_endereco_Mode = "INS" ;
         this.setgxTv_Sdtunidade_endereco_Unid_id_Z_SetNull( );
         this.setgxTv_Sdtunidade_endereco_End_id_Z_SetNull( );
      }
      SetDirty("End_id");
      gxTv_Sdtunidade_endereco_End_id = value ;
   }

   public String getgxTv_Sdtunidade_endereco_Mode( )
   {
      return gxTv_Sdtunidade_endereco_Mode ;
   }

   public void setgxTv_Sdtunidade_endereco_Mode( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Mode");
      gxTv_Sdtunidade_endereco_Mode = value ;
   }

   public void setgxTv_Sdtunidade_endereco_Mode_SetNull( )
   {
      gxTv_Sdtunidade_endereco_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_Sdtunidade_endereco_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_Sdtunidade_endereco_Initialized( )
   {
      return gxTv_Sdtunidade_endereco_Initialized ;
   }

   public void setgxTv_Sdtunidade_endereco_Initialized( short value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_Sdtunidade_endereco_Initialized = value ;
   }

   public void setgxTv_Sdtunidade_endereco_Initialized_SetNull( )
   {
      gxTv_Sdtunidade_endereco_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_Sdtunidade_endereco_Initialized_IsNull( )
   {
      return false ;
   }

   public int getgxTv_Sdtunidade_endereco_Unid_id_Z( )
   {
      return gxTv_Sdtunidade_endereco_Unid_id_Z ;
   }

   public void setgxTv_Sdtunidade_endereco_Unid_id_Z( int value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Unid_id_Z");
      gxTv_Sdtunidade_endereco_Unid_id_Z = value ;
   }

   public void setgxTv_Sdtunidade_endereco_Unid_id_Z_SetNull( )
   {
      gxTv_Sdtunidade_endereco_Unid_id_Z = 0 ;
      SetDirty("Unid_id_Z");
   }

   public boolean getgxTv_Sdtunidade_endereco_Unid_id_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_Sdtunidade_endereco_End_id_Z( )
   {
      return gxTv_Sdtunidade_endereco_End_id_Z ;
   }

   public void setgxTv_Sdtunidade_endereco_End_id_Z( int value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("End_id_Z");
      gxTv_Sdtunidade_endereco_End_id_Z = value ;
   }

   public void setgxTv_Sdtunidade_endereco_End_id_Z_SetNull( )
   {
      gxTv_Sdtunidade_endereco_End_id_Z = 0 ;
      SetDirty("End_id_Z");
   }

   public boolean getgxTv_Sdtunidade_endereco_End_id_Z_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      com.projetopratico.unidade_endereco_bc obj;
      obj = new com.projetopratico.unidade_endereco_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      sdtIsNull = (byte)(1) ;
      gxTv_Sdtunidade_endereco_Mode = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public com.projetopratico.Sdtunidade_endereco Clone( )
   {
      com.projetopratico.Sdtunidade_endereco sdt;
      com.projetopratico.unidade_endereco_bc obj;
      sdt = (com.projetopratico.Sdtunidade_endereco)(clone()) ;
      obj = (com.projetopratico.unidade_endereco_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( com.projetopratico.StructSdtunidade_endereco struct )
   {
      if ( struct != null )
      {
         setgxTv_Sdtunidade_endereco_Unid_id(struct.getUnid_id());
         setgxTv_Sdtunidade_endereco_End_id(struct.getEnd_id());
         setgxTv_Sdtunidade_endereco_Mode(struct.getMode());
         setgxTv_Sdtunidade_endereco_Initialized(struct.getInitialized());
         setgxTv_Sdtunidade_endereco_Unid_id_Z(struct.getUnid_id_Z());
         setgxTv_Sdtunidade_endereco_End_id_Z(struct.getEnd_id_Z());
      }
   }

   @SuppressWarnings("unchecked")
   public com.projetopratico.StructSdtunidade_endereco getStruct( )
   {
      com.projetopratico.StructSdtunidade_endereco struct = new com.projetopratico.StructSdtunidade_endereco ();
      struct.setUnid_id(getgxTv_Sdtunidade_endereco_Unid_id());
      struct.setEnd_id(getgxTv_Sdtunidade_endereco_End_id());
      struct.setMode(getgxTv_Sdtunidade_endereco_Mode());
      struct.setInitialized(getgxTv_Sdtunidade_endereco_Initialized());
      struct.setUnid_id_Z(getgxTv_Sdtunidade_endereco_Unid_id_Z());
      struct.setEnd_id_Z(getgxTv_Sdtunidade_endereco_End_id_Z());
      return struct ;
   }

   private byte sdtIsNull ;
   private short gxTv_Sdtunidade_endereco_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_Sdtunidade_endereco_Unid_id ;
   private int gxTv_Sdtunidade_endereco_End_id ;
   private int gxTv_Sdtunidade_endereco_Unid_id_Z ;
   private int gxTv_Sdtunidade_endereco_End_id_Z ;
   private String gxTv_Sdtunidade_endereco_Mode ;
   private String sTagName ;
   private boolean readElement ;
   private boolean formatError ;
}

