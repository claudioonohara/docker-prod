package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTEfetivosUnidade extends GxUserType
{
   public SdtSDTEfetivosUnidade( )
   {
      this(  new ModelContext(SdtSDTEfetivosUnidade.class));
   }

   public SdtSDTEfetivosUnidade( ModelContext context )
   {
      super( context, "SdtSDTEfetivosUnidade");
   }

   public SdtSDTEfetivosUnidade( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTEfetivosUnidade");
   }

   public SdtSDTEfetivosUnidade( StructSdtSDTEfetivosUnidade struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "PaginaAtual") )
            {
               gxTv_SdtSDTEfetivosUnidade_Paginaatual = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NroPorPagina") )
            {
               gxTv_SdtSDTEfetivosUnidade_Nroporpagina = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotalItens") )
            {
               gxTv_SdtSDTEfetivosUnidade_Totalitens = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotalPaginas") )
            {
               gxTv_SdtSDTEfetivosUnidade_Totalpaginas = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "efetivosUnidade") )
            {
               if ( gxTv_SdtSDTEfetivosUnidade_Efetivosunidade == null )
               {
                  gxTv_SdtSDTEfetivosUnidade_Efetivosunidade = new GXBaseCollection<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem>(com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem.class, "SDTEfetivosUnidade.efetivosUnidadeItem", "ProjetoPratico", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTEfetivosUnidade_Efetivosunidade.readxmlcollection(oReader, "efetivosUnidade", "efetivosUnidadeItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "efetivosUnidade") )
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
         sName = "SDTEfetivosUnidade" ;
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
      oWriter.writeElement("PaginaAtual", GXutil.trim( GXutil.str( gxTv_SdtSDTEfetivosUnidade_Paginaatual, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("NroPorPagina", GXutil.trim( GXutil.str( gxTv_SdtSDTEfetivosUnidade_Nroporpagina, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("TotalItens", GXutil.trim( GXutil.str( gxTv_SdtSDTEfetivosUnidade_Totalitens, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("TotalPaginas", GXutil.trim( GXutil.str( gxTv_SdtSDTEfetivosUnidade_Totalpaginas, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      if ( gxTv_SdtSDTEfetivosUnidade_Efetivosunidade != null )
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
         gxTv_SdtSDTEfetivosUnidade_Efetivosunidade.writexmlcollection(oWriter, "efetivosUnidade", sNameSpace1, "efetivosUnidadeItem", sNameSpace1);
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
      AddObjectProperty("PaginaAtual", gxTv_SdtSDTEfetivosUnidade_Paginaatual, false, false);
      AddObjectProperty("NroPorPagina", gxTv_SdtSDTEfetivosUnidade_Nroporpagina, false, false);
      AddObjectProperty("TotalItens", gxTv_SdtSDTEfetivosUnidade_Totalitens, false, false);
      AddObjectProperty("TotalPaginas", gxTv_SdtSDTEfetivosUnidade_Totalpaginas, false, false);
      if ( gxTv_SdtSDTEfetivosUnidade_Efetivosunidade != null )
      {
         AddObjectProperty("efetivosUnidade", gxTv_SdtSDTEfetivosUnidade_Efetivosunidade, false, false);
      }
   }

   public int getgxTv_SdtSDTEfetivosUnidade_Paginaatual( )
   {
      return gxTv_SdtSDTEfetivosUnidade_Paginaatual ;
   }

   public void setgxTv_SdtSDTEfetivosUnidade_Paginaatual( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTEfetivosUnidade_Paginaatual = value ;
   }

   public int getgxTv_SdtSDTEfetivosUnidade_Nroporpagina( )
   {
      return gxTv_SdtSDTEfetivosUnidade_Nroporpagina ;
   }

   public void setgxTv_SdtSDTEfetivosUnidade_Nroporpagina( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTEfetivosUnidade_Nroporpagina = value ;
   }

   public int getgxTv_SdtSDTEfetivosUnidade_Totalitens( )
   {
      return gxTv_SdtSDTEfetivosUnidade_Totalitens ;
   }

   public void setgxTv_SdtSDTEfetivosUnidade_Totalitens( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTEfetivosUnidade_Totalitens = value ;
   }

   public int getgxTv_SdtSDTEfetivosUnidade_Totalpaginas( )
   {
      return gxTv_SdtSDTEfetivosUnidade_Totalpaginas ;
   }

   public void setgxTv_SdtSDTEfetivosUnidade_Totalpaginas( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTEfetivosUnidade_Totalpaginas = value ;
   }

   public GXBaseCollection<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem> getgxTv_SdtSDTEfetivosUnidade_Efetivosunidade( )
   {
      if ( gxTv_SdtSDTEfetivosUnidade_Efetivosunidade == null )
      {
         gxTv_SdtSDTEfetivosUnidade_Efetivosunidade = new GXBaseCollection<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem>(com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem.class, "SDTEfetivosUnidade.efetivosUnidadeItem", "ProjetoPratico", remoteHandle);
      }
      gxTv_SdtSDTEfetivosUnidade_Efetivosunidade_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      return gxTv_SdtSDTEfetivosUnidade_Efetivosunidade ;
   }

   public void setgxTv_SdtSDTEfetivosUnidade_Efetivosunidade( GXBaseCollection<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem> value )
   {
      gxTv_SdtSDTEfetivosUnidade_Efetivosunidade_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTEfetivosUnidade_Efetivosunidade = value ;
   }

   public void setgxTv_SdtSDTEfetivosUnidade_Efetivosunidade_SetNull( )
   {
      gxTv_SdtSDTEfetivosUnidade_Efetivosunidade_N = (byte)(1) ;
      gxTv_SdtSDTEfetivosUnidade_Efetivosunidade = null ;
   }

   public boolean getgxTv_SdtSDTEfetivosUnidade_Efetivosunidade_IsNull( )
   {
      if ( gxTv_SdtSDTEfetivosUnidade_Efetivosunidade == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTEfetivosUnidade_Efetivosunidade_N( )
   {
      return gxTv_SdtSDTEfetivosUnidade_Efetivosunidade_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      sdtIsNull = (byte)(1) ;
      gxTv_SdtSDTEfetivosUnidade_Efetivosunidade_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public com.projetopratico.SdtSDTEfetivosUnidade Clone( )
   {
      return (com.projetopratico.SdtSDTEfetivosUnidade)(clone()) ;
   }

   public void setStruct( com.projetopratico.StructSdtSDTEfetivosUnidade struct )
   {
      if ( struct != null )
      {
         setgxTv_SdtSDTEfetivosUnidade_Paginaatual(struct.getPaginaatual());
         setgxTv_SdtSDTEfetivosUnidade_Nroporpagina(struct.getNroporpagina());
         setgxTv_SdtSDTEfetivosUnidade_Totalitens(struct.getTotalitens());
         setgxTv_SdtSDTEfetivosUnidade_Totalpaginas(struct.getTotalpaginas());
         GXBaseCollection<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem> gxTv_SdtSDTEfetivosUnidade_Efetivosunidade_aux = new GXBaseCollection<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem>(com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem.class, "SDTEfetivosUnidade.efetivosUnidadeItem", "ProjetoPratico", remoteHandle);
         Vector<com.projetopratico.StructSdtSDTEfetivosUnidade_efetivosUnidadeItem> gxTv_SdtSDTEfetivosUnidade_Efetivosunidade_aux1 = struct.getEfetivosunidade();
         if (gxTv_SdtSDTEfetivosUnidade_Efetivosunidade_aux1 != null)
         {
            for (int i = 0; i < gxTv_SdtSDTEfetivosUnidade_Efetivosunidade_aux1.size(); i++)
            {
               gxTv_SdtSDTEfetivosUnidade_Efetivosunidade_aux.add(new com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem(gxTv_SdtSDTEfetivosUnidade_Efetivosunidade_aux1.elementAt(i)));
            }
         }
         setgxTv_SdtSDTEfetivosUnidade_Efetivosunidade(gxTv_SdtSDTEfetivosUnidade_Efetivosunidade_aux);
      }
   }

   @SuppressWarnings("unchecked")
   public com.projetopratico.StructSdtSDTEfetivosUnidade getStruct( )
   {
      com.projetopratico.StructSdtSDTEfetivosUnidade struct = new com.projetopratico.StructSdtSDTEfetivosUnidade ();
      struct.setPaginaatual(getgxTv_SdtSDTEfetivosUnidade_Paginaatual());
      struct.setNroporpagina(getgxTv_SdtSDTEfetivosUnidade_Nroporpagina());
      struct.setTotalitens(getgxTv_SdtSDTEfetivosUnidade_Totalitens());
      struct.setTotalpaginas(getgxTv_SdtSDTEfetivosUnidade_Totalpaginas());
      struct.setEfetivosunidade(getgxTv_SdtSDTEfetivosUnidade_Efetivosunidade().getStruct());
      return struct ;
   }

   protected byte sdtIsNull ;
   protected byte gxTv_SdtSDTEfetivosUnidade_Efetivosunidade_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTEfetivosUnidade_Paginaatual ;
   protected int gxTv_SdtSDTEfetivosUnidade_Nroporpagina ;
   protected int gxTv_SdtSDTEfetivosUnidade_Totalitens ;
   protected int gxTv_SdtSDTEfetivosUnidade_Totalpaginas ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem> gxTv_SdtSDTEfetivosUnidade_Efetivosunidade=null ;
   protected GXBaseCollection<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem> gxTv_SdtSDTEfetivosUnidade_Efetivosunidade_aux ;
}

