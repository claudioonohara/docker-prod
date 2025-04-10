package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem extends GxUserType
{
   public SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem( )
   {
      this(  new ModelContext(SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem.class));
   }

   public SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem( ModelContext context )
   {
      super( context, "SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem");
   }

   public SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem( int remoteHandle ,
                                                                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem");
   }

   public SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem( StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "end_id") )
            {
               gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_id = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "end_logradouro") )
            {
               gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_logradouro = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "end_numero") )
            {
               gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_numero = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "end_bairro") )
            {
               gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_bairro = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "cid_id") )
            {
               gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_id = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "cid_nome") )
            {
               gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_nome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "cid_uf") )
            {
               gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_uf = oReader.getValue() ;
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
         sName = "SDTServidorEfetivoEnderecoFuncional.servidorItem.lotacaoItem.enderecoItem" ;
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
      oWriter.writeElement("end_id", GXutil.trim( GXutil.str( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_id, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("end_logradouro", gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_logradouro);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("end_numero", GXutil.trim( GXutil.str( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_numero, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("end_bairro", gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_bairro);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("cid_id", GXutil.trim( GXutil.str( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_id, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("cid_nome", gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_nome);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("cid_uf", gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_uf);
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
      AddObjectProperty("end_id", gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_id, false, false);
      AddObjectProperty("end_logradouro", gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_logradouro, false, false);
      AddObjectProperty("end_numero", gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_numero, false, false);
      AddObjectProperty("end_bairro", gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_bairro, false, false);
      AddObjectProperty("cid_id", gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_id, false, false);
      AddObjectProperty("cid_nome", gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_nome, false, false);
      AddObjectProperty("cid_uf", gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_uf, false, false);
   }

   public int getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_id( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_id ;
   }

   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_id = value ;
   }

   public String getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_logradouro( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_logradouro ;
   }

   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_logradouro( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_logradouro = value ;
   }

   public int getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_numero( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_numero ;
   }

   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_numero( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_numero = value ;
   }

   public String getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_bairro( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_bairro ;
   }

   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_bairro( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_bairro = value ;
   }

   public int getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_id( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_id ;
   }

   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_id = value ;
   }

   public String getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_nome( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_nome ;
   }

   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_nome = value ;
   }

   public String getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_uf( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_uf ;
   }

   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_uf( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_uf = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      sdtIsNull = (byte)(1) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_logradouro = "" ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_bairro = "" ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_nome = "" ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_uf = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem Clone( )
   {
      return (com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem)(clone()) ;
   }

   public void setStruct( com.projetopratico.StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem struct )
   {
      if ( struct != null )
      {
         setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_id(struct.getEnd_id());
         setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_logradouro(struct.getEnd_logradouro());
         setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_numero(struct.getEnd_numero());
         setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_bairro(struct.getEnd_bairro());
         setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_id(struct.getCid_id());
         setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_nome(struct.getCid_nome());
         setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_uf(struct.getCid_uf());
      }
   }

   @SuppressWarnings("unchecked")
   public com.projetopratico.StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem getStruct( )
   {
      com.projetopratico.StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem struct = new com.projetopratico.StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem ();
      struct.setEnd_id(getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_id());
      struct.setEnd_logradouro(getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_logradouro());
      struct.setEnd_numero(getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_numero());
      struct.setEnd_bairro(getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_bairro());
      struct.setCid_id(getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_id());
      struct.setCid_nome(getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_nome());
      struct.setCid_uf(getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_uf());
      return struct ;
   }

   protected byte sdtIsNull ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_id ;
   protected int gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_numero ;
   protected int gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_id ;
   protected String gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_uf ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_logradouro ;
   protected String gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_End_bairro ;
   protected String gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem_enderecoItem_Cid_nome ;
}

