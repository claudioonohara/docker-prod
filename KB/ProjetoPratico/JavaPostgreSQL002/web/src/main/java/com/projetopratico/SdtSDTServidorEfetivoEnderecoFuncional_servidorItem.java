package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTServidorEfetivoEnderecoFuncional_servidorItem extends GxUserType
{
   public SdtSDTServidorEfetivoEnderecoFuncional_servidorItem( )
   {
      this(  new ModelContext(SdtSDTServidorEfetivoEnderecoFuncional_servidorItem.class));
   }

   public SdtSDTServidorEfetivoEnderecoFuncional_servidorItem( ModelContext context )
   {
      super( context, "SdtSDTServidorEfetivoEnderecoFuncional_servidorItem");
   }

   public SdtSDTServidorEfetivoEnderecoFuncional_servidorItem( int remoteHandle ,
                                                               ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTServidorEfetivoEnderecoFuncional_servidorItem");
   }

   public SdtSDTServidorEfetivoEnderecoFuncional_servidorItem( StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_id") )
            {
               gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_id = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_nome") )
            {
               gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_nome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "se_matricula") )
            {
               gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Se_matricula = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "lotacao") )
            {
               if ( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao == null )
               {
                  gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao = new GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem>(com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem.class, "SDTServidorEfetivoEnderecoFuncional.servidorItem.lotacaoItem", "ProjetoPratico", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao.readxmlcollection(oReader, "lotacao", "lotacaoItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "lotacao") )
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
         sName = "SDTServidorEfetivoEnderecoFuncional.servidorItem" ;
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
      oWriter.writeElement("pes_id", GXutil.trim( GXutil.str( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_id, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("pes_nome", gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_nome);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("se_matricula", gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Se_matricula);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      if ( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao != null )
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
         gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao.writexmlcollection(oWriter, "lotacao", sNameSpace1, "lotacaoItem", sNameSpace1);
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
      AddObjectProperty("pes_id", gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_id, false, false);
      AddObjectProperty("pes_nome", gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_nome, false, false);
      AddObjectProperty("se_matricula", gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Se_matricula, false, false);
      if ( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao != null )
      {
         AddObjectProperty("lotacao", gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao, false, false);
      }
   }

   public int getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_id( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_id ;
   }

   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_id = value ;
   }

   public String getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_nome( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_nome ;
   }

   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_nome = value ;
   }

   public String getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Se_matricula( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Se_matricula ;
   }

   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Se_matricula( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Se_matricula = value ;
   }

   public GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem> getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao( )
   {
      if ( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao == null )
      {
         gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao = new GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem>(com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem.class, "SDTServidorEfetivoEnderecoFuncional.servidorItem.lotacaoItem", "ProjetoPratico", remoteHandle);
      }
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao ;
   }

   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao( GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem> value )
   {
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao = value ;
   }

   public void setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao_SetNull( )
   {
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao_N = (byte)(1) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao = null ;
   }

   public boolean getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao_IsNull( )
   {
      if ( gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao_N( )
   {
      return gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      sdtIsNull = (byte)(1) ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_nome = "" ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Se_matricula = "" ;
      gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem Clone( )
   {
      return (com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem)(clone()) ;
   }

   public void setStruct( com.projetopratico.StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem struct )
   {
      if ( struct != null )
      {
         setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_id(struct.getPes_id());
         setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_nome(struct.getPes_nome());
         setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Se_matricula(struct.getSe_matricula());
         GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem> gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao_aux = new GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem>(com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem.class, "SDTServidorEfetivoEnderecoFuncional.servidorItem.lotacaoItem", "ProjetoPratico", remoteHandle);
         Vector<com.projetopratico.StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem> gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao_aux1 = struct.getLotacao();
         if (gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao_aux1 != null)
         {
            for (int i = 0; i < gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao_aux1.size(); i++)
            {
               gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao_aux.add(new com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem(gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao_aux1.elementAt(i)));
            }
         }
         setgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao(gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao_aux);
      }
   }

   @SuppressWarnings("unchecked")
   public com.projetopratico.StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem getStruct( )
   {
      com.projetopratico.StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem struct = new com.projetopratico.StructSdtSDTServidorEfetivoEnderecoFuncional_servidorItem ();
      struct.setPes_id(getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_id());
      struct.setPes_nome(getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_nome());
      struct.setSe_matricula(getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Se_matricula());
      struct.setLotacao(getgxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao().getStruct());
      return struct ;
   }

   protected byte sdtIsNull ;
   protected byte gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_id ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Pes_nome ;
   protected String gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Se_matricula ;
   protected GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem> gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao=null ;
   protected GXBaseCollection<com.projetopratico.SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_lotacaoItem> gxTv_SdtSDTServidorEfetivoEnderecoFuncional_servidorItem_Lotacao_aux ;
}

