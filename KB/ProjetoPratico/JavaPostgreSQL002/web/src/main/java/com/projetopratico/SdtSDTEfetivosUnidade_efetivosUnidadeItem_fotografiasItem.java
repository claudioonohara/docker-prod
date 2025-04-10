package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem extends GxUserType
{
   public SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem( )
   {
      this(  new ModelContext(SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem.class));
   }

   public SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem( ModelContext context )
   {
      super( context, "SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem");
   }

   public SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem( int remoteHandle ,
                                                                     ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem");
   }

   public SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem( StructSdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "fotografia") )
            {
               gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem_Fotografia = oReader.getValue() ;
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
         sName = "SDTEfetivosUnidade.efetivosUnidadeItem.fotografiasItem" ;
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
      oWriter.writeElement("fotografia", gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem_Fotografia);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
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
      AddObjectProperty("fotografia", gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem_Fotografia, false, false);
   }

   public String getgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem_Fotografia( )
   {
      return gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem_Fotografia ;
   }

   public void setgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem_Fotografia( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem_Fotografia = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem_Fotografia = "" ;
      sdtIsNull = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem Clone( )
   {
      return (com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem)(clone()) ;
   }

   public void setStruct( com.projetopratico.StructSdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem struct )
   {
      if ( struct != null )
      {
         setgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem_Fotografia(struct.getFotografia());
      }
   }

   @SuppressWarnings("unchecked")
   public com.projetopratico.StructSdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem getStruct( )
   {
      com.projetopratico.StructSdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem struct = new com.projetopratico.StructSdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem ();
      struct.setFotografia(getgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem_Fotografia());
      return struct ;
   }

   protected byte sdtIsNull ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem_Fotografia ;
}

