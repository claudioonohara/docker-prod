package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTServidorEfetivoEnderecoFuncional extends GxUserType
{
   public SdtSDTServidorEfetivoEnderecoFuncional( )
   {
      this(  new ModelContext(SdtSDTServidorEfetivoEnderecoFuncional.class));
   }

   public SdtSDTServidorEfetivoEnderecoFuncional( ModelContext context )
   {
      super( context, "SdtSDTServidorEfetivoEnderecoFuncional");
   }

   public SdtSDTServidorEfetivoEnderecoFuncional( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTServidorEfetivoEnderecoFuncional");
   }

   public SdtSDTServidorEfetivoEnderecoFuncional( StructSdtSDTServidorEfetivoEnderecoFuncional struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "servidor") )
            {
               if ( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor == null )
               {
                  gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor = new GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem>(com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem.class, "SDTServidorEfetivoEnderecoFuncional.servidorItem", "ProjetoPratico", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor.readxmlcollection(oReader, "servidor", "servidorItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "servidor") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PaginaAtual") )
            {
               gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Paginaatual = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotalPaginas") )
            {
               gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalpaginas = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotalItens") )
            {
               gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalitens = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NroPorPagina") )
            {
               gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Nroporpagina = (int)(getnumericvalue(oReader.getValue())) ;
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
         sName = "SDTServidorEfetivoEnderecoFuncional" ;
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
      if ( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor != null )
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
         gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor.writexmlcollection(oWriter, "servidor", sNameSpace1, "servidorItem", sNameSpace1);
      }
      oWriter.writeElement("PaginaAtual", GXutil.trim( GXutil.str( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Paginaatual, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("TotalPaginas", GXutil.trim( GXutil.str( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalpaginas, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("TotalItens", GXutil.trim( GXutil.str( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalitens, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("NroPorPagina", GXutil.trim( GXutil.str( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Nroporpagina, 8, 0)));
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
      if ( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor != null )
      {
         AddObjectProperty("servidor", gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor, false, false);
      }
      AddObjectProperty("PaginaAtual", gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Paginaatual, false, false);
      AddObjectProperty("TotalPaginas", gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalpaginas, false, false);
      AddObjectProperty("TotalItens", gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalitens, false, false);
      AddObjectProperty("NroPorPagina", gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Nroporpagina, false, false);
   }

   public GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem> getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor( )
   {
      if ( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor == null )
      {
         gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor = new GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem>(com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem.class, "SDTServidorEfetivoEnderecoFuncional.servidorItem", "ProjetoPratico", remoteHandle);
      }
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor ;
   }

   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor( GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem> value )
   {
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor = value ;
   }

   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor_SetNull( )
   {
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor_N = (byte)(1) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor = null ;
   }

   public boolean getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor_IsNull( )
   {
      if ( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor_N( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor_N ;
   }

   public int getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Paginaatual( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Paginaatual ;
   }

   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Paginaatual( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Paginaatual = value ;
   }

   public int getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalpaginas( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalpaginas ;
   }

   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalpaginas( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalpaginas = value ;
   }

   public int getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalitens( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalitens ;
   }

   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalitens( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalitens = value ;
   }

   public int getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Nroporpagina( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Nroporpagina ;
   }

   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Nroporpagina( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Nroporpagina = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor_N = (byte)(1) ;
      sdtIsNull = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional Clone( )
   {
      return (com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional)(clone()) ;
   }

   public void setStruct( com.projetopratico.StructSdtSDTServidorEfetivoEnderecoFuncional struct )
   {
      if ( struct != null )
      {
         GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem> gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor_aux = new GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem>(com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem.class, "SDTServidorEfetivoEnderecoFuncional.servidorItem", "ProjetoPratico", remoteHandle);
         Vector<com.projetopratico.StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem> gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor_aux1 = struct.getServidor();
         if (gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor_aux1 != null)
         {
            for (int i = 0; i < gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor_aux1.size(); i++)
            {
               gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor_aux.add(new com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem(gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor_aux1.elementAt(i)));
            }
         }
         setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor(gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor_aux);
         setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Paginaatual(struct.getPaginaatual());
         setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalpaginas(struct.getTotalpaginas());
         setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalitens(struct.getTotalitens());
         setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Nroporpagina(struct.getNroporpagina());
      }
   }

   @SuppressWarnings("unchecked")
   public com.projetopratico.StructSdtSDTServidorEfetivoEnderecoFuncional getStruct( )
   {
      com.projetopratico.StructSdtSDTServidorEfetivoEnderecoFuncional struct = new com.projetopratico.StructSdtSDTServidorEfetivoEnderecoFuncional ();
      struct.setServidor(getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor().getStruct());
      struct.setPaginaatual(getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Paginaatual());
      struct.setTotalpaginas(getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalpaginas());
      struct.setTotalitens(getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalitens());
      struct.setNroporpagina(getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_Nroporpagina());
      return struct ;
   }

   protected byte gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor_N ;
   protected byte sdtIsNull ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Paginaatual ;
   protected int gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalpaginas ;
   protected int gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Totalitens ;
   protected int gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Nroporpagina ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem> gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor=null ;
   protected GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem> gxTv_SdtSDTServidorEfetivoEnderecoFuncional_Servidor_aux ;
}

