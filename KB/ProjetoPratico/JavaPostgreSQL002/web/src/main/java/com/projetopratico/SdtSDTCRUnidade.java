package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTCRUnidade extends GxUserType
{
   public SdtSDTCRUnidade( )
   {
      this(  new ModelContext(SdtSDTCRUnidade.class));
   }

   public SdtSDTCRUnidade( ModelContext context )
   {
      super( context, "SdtSDTCRUnidade");
   }

   public SdtSDTCRUnidade( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTCRUnidade");
   }

   public SdtSDTCRUnidade( StructSdtSDTCRUnidade struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_id") )
            {
               gxTv_SdtSDTCRUnidade_Unid_id = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_nome") )
            {
               gxTv_SdtSDTCRUnidade_Unid_nome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_sigla") )
            {
               gxTv_SdtSDTCRUnidade_Unid_sigla = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "endereco") )
            {
               if ( gxTv_SdtSDTCRUnidade_Endereco == null )
               {
                  gxTv_SdtSDTCRUnidade_Endereco = new GXBaseCollection<com.projetopratico.SdtSDTCRUnidade_enderecoItem>(com.projetopratico.SdtSDTCRUnidade_enderecoItem.class, "SDTCRUnidade.enderecoItem", "ProjetoPratico", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTCRUnidade_Endereco.readxmlcollection(oReader, "endereco", "enderecoItem") ;
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
         sName = "SDTCRUnidade" ;
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
      oWriter.writeElement("unid_id", GXutil.trim( GXutil.str( gxTv_SdtSDTCRUnidade_Unid_id, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("unid_nome", gxTv_SdtSDTCRUnidade_Unid_nome);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("unid_sigla", gxTv_SdtSDTCRUnidade_Unid_sigla);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      if ( gxTv_SdtSDTCRUnidade_Endereco != null )
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
         gxTv_SdtSDTCRUnidade_Endereco.writexmlcollection(oWriter, "endereco", sNameSpace1, "enderecoItem", sNameSpace1);
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
      AddObjectProperty("unid_id", gxTv_SdtSDTCRUnidade_Unid_id, false, false);
      AddObjectProperty("unid_nome", gxTv_SdtSDTCRUnidade_Unid_nome, false, false);
      AddObjectProperty("unid_sigla", gxTv_SdtSDTCRUnidade_Unid_sigla, false, false);
      if ( gxTv_SdtSDTCRUnidade_Endereco != null )
      {
         AddObjectProperty("endereco", gxTv_SdtSDTCRUnidade_Endereco, false, false);
      }
   }

   public int getgxTv_SdtSDTCRUnidade_Unid_id( )
   {
      return gxTv_SdtSDTCRUnidade_Unid_id ;
   }

   public void setgxTv_SdtSDTCRUnidade_Unid_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRUnidade_Unid_id = value ;
   }

   public String getgxTv_SdtSDTCRUnidade_Unid_nome( )
   {
      return gxTv_SdtSDTCRUnidade_Unid_nome ;
   }

   public void setgxTv_SdtSDTCRUnidade_Unid_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRUnidade_Unid_nome = value ;
   }

   public String getgxTv_SdtSDTCRUnidade_Unid_sigla( )
   {
      return gxTv_SdtSDTCRUnidade_Unid_sigla ;
   }

   public void setgxTv_SdtSDTCRUnidade_Unid_sigla( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRUnidade_Unid_sigla = value ;
   }

   public GXBaseCollection<com.projetopratico.SdtSDTCRUnidade_enderecoItem> getgxTv_SdtSDTCRUnidade_Endereco( )
   {
      if ( gxTv_SdtSDTCRUnidade_Endereco == null )
      {
         gxTv_SdtSDTCRUnidade_Endereco = new GXBaseCollection<com.projetopratico.SdtSDTCRUnidade_enderecoItem>(com.projetopratico.SdtSDTCRUnidade_enderecoItem.class, "SDTCRUnidade.enderecoItem", "ProjetoPratico", remoteHandle);
      }
      gxTv_SdtSDTCRUnidade_Endereco_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      return gxTv_SdtSDTCRUnidade_Endereco ;
   }

   public void setgxTv_SdtSDTCRUnidade_Endereco( GXBaseCollection<com.projetopratico.SdtSDTCRUnidade_enderecoItem> value )
   {
      gxTv_SdtSDTCRUnidade_Endereco_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTCRUnidade_Endereco = value ;
   }

   public void setgxTv_SdtSDTCRUnidade_Endereco_SetNull( )
   {
      gxTv_SdtSDTCRUnidade_Endereco_N = (byte)(1) ;
      gxTv_SdtSDTCRUnidade_Endereco = null ;
   }

   public boolean getgxTv_SdtSDTCRUnidade_Endereco_IsNull( )
   {
      if ( gxTv_SdtSDTCRUnidade_Endereco == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTCRUnidade_Endereco_N( )
   {
      return gxTv_SdtSDTCRUnidade_Endereco_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      sdtIsNull = (byte)(1) ;
      gxTv_SdtSDTCRUnidade_Unid_nome = "" ;
      gxTv_SdtSDTCRUnidade_Unid_sigla = "" ;
      gxTv_SdtSDTCRUnidade_Endereco_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public com.projetopratico.SdtSDTCRUnidade Clone( )
   {
      return (com.projetopratico.SdtSDTCRUnidade)(clone()) ;
   }

   public void setStruct( com.projetopratico.StructSdtSDTCRUnidade struct )
   {
      if ( struct != null )
      {
         setgxTv_SdtSDTCRUnidade_Unid_id(struct.getUnid_id());
         setgxTv_SdtSDTCRUnidade_Unid_nome(struct.getUnid_nome());
         setgxTv_SdtSDTCRUnidade_Unid_sigla(struct.getUnid_sigla());
         GXBaseCollection<com.projetopratico.SdtSDTCRUnidade_enderecoItem> gxTv_SdtSDTCRUnidade_Endereco_aux = new GXBaseCollection<com.projetopratico.SdtSDTCRUnidade_enderecoItem>(com.projetopratico.SdtSDTCRUnidade_enderecoItem.class, "SDTCRUnidade.enderecoItem", "ProjetoPratico", remoteHandle);
         Vector<com.projetopratico.StructSdtSDTCRUnidade_enderecoItem> gxTv_SdtSDTCRUnidade_Endereco_aux1 = struct.getEndereco();
         if (gxTv_SdtSDTCRUnidade_Endereco_aux1 != null)
         {
            for (int i = 0; i < gxTv_SdtSDTCRUnidade_Endereco_aux1.size(); i++)
            {
               gxTv_SdtSDTCRUnidade_Endereco_aux.add(new com.projetopratico.SdtSDTCRUnidade_enderecoItem(gxTv_SdtSDTCRUnidade_Endereco_aux1.elementAt(i)));
            }
         }
         setgxTv_SdtSDTCRUnidade_Endereco(gxTv_SdtSDTCRUnidade_Endereco_aux);
      }
   }

   @SuppressWarnings("unchecked")
   public com.projetopratico.StructSdtSDTCRUnidade getStruct( )
   {
      com.projetopratico.StructSdtSDTCRUnidade struct = new com.projetopratico.StructSdtSDTCRUnidade ();
      struct.setUnid_id(getgxTv_SdtSDTCRUnidade_Unid_id());
      struct.setUnid_nome(getgxTv_SdtSDTCRUnidade_Unid_nome());
      struct.setUnid_sigla(getgxTv_SdtSDTCRUnidade_Unid_sigla());
      struct.setEndereco(getgxTv_SdtSDTCRUnidade_Endereco().getStruct());
      return struct ;
   }

   protected byte sdtIsNull ;
   protected byte gxTv_SdtSDTCRUnidade_Endereco_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTCRUnidade_Unid_id ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTCRUnidade_Unid_nome ;
   protected String gxTv_SdtSDTCRUnidade_Unid_sigla ;
   protected GXBaseCollection<com.projetopratico.SdtSDTCRUnidade_enderecoItem> gxTv_SdtSDTCRUnidade_Endereco=null ;
   protected GXBaseCollection<com.projetopratico.SdtSDTCRUnidade_enderecoItem> gxTv_SdtSDTCRUnidade_Endereco_aux ;
}

