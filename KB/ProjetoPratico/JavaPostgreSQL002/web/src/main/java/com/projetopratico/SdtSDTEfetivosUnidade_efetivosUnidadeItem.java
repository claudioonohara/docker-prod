package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTEfetivosUnidade_efetivosUnidadeItem extends GxUserType
{
   public SdtSDTEfetivosUnidade_efetivosUnidadeItem( )
   {
      this(  new ModelContext(SdtSDTEfetivosUnidade_efetivosUnidadeItem.class));
   }

   public SdtSDTEfetivosUnidade_efetivosUnidadeItem( ModelContext context )
   {
      super( context, "SdtSDTEfetivosUnidade_efetivosUnidadeItem");
   }

   public SdtSDTEfetivosUnidade_efetivosUnidadeItem( int remoteHandle ,
                                                     ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTEfetivosUnidade_efetivosUnidadeItem");
   }

   public SdtSDTEfetivosUnidade_efetivosUnidadeItem( StructSdtSDTEfetivosUnidade_efetivosUnidadeItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "nome") )
            {
               gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Nome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "idade") )
            {
               gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Idade = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unidadeDeLotacao") )
            {
               gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Unidadedelotacao = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "fotografias") )
            {
               if ( gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias == null )
               {
                  gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias = new GXBaseCollection<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem>(com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem.class, "SDTEfetivosUnidade.efetivosUnidadeItem.fotografiasItem", "ProjetoPratico", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias.readxmlcollection(oReader, "fotografias", "fotografiasItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "fotografias") )
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
         sName = "SDTEfetivosUnidade.efetivosUnidadeItem" ;
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
      oWriter.writeElement("nome", gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Nome);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("idade", GXutil.trim( GXutil.str( gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Idade, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      oWriter.writeElement("unidadeDeLotacao", gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Unidadedelotacao);
      if ( GXutil.strcmp(sNameSpace, "ProjetoPratico") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ProjetoPratico");
      }
      if ( gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias != null )
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
         gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias.writexmlcollection(oWriter, "fotografias", sNameSpace1, "fotografiasItem", sNameSpace1);
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
      AddObjectProperty("nome", gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Nome, false, false);
      AddObjectProperty("idade", gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Idade, false, false);
      AddObjectProperty("unidadeDeLotacao", gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Unidadedelotacao, false, false);
      if ( gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias != null )
      {
         AddObjectProperty("fotografias", gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias, false, false);
      }
   }

   public String getgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Nome( )
   {
      return gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Nome ;
   }

   public void setgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Nome = value ;
   }

   public short getgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Idade( )
   {
      return gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Idade ;
   }

   public void setgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Idade( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Idade = value ;
   }

   public String getgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Unidadedelotacao( )
   {
      return gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Unidadedelotacao ;
   }

   public void setgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Unidadedelotacao( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Unidadedelotacao = value ;
   }

   public GXBaseCollection<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem> getgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias( )
   {
      if ( gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias == null )
      {
         gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias = new GXBaseCollection<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem>(com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem.class, "SDTEfetivosUnidade.efetivosUnidadeItem.fotografiasItem", "ProjetoPratico", remoteHandle);
      }
      gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      return gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias ;
   }

   public void setgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias( GXBaseCollection<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem> value )
   {
      gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias = value ;
   }

   public void setgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias_SetNull( )
   {
      gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias_N = (byte)(1) ;
      gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias = null ;
   }

   public boolean getgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias_IsNull( )
   {
      if ( gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias_N( )
   {
      return gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Nome = "" ;
      sdtIsNull = (byte)(1) ;
      gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Unidadedelotacao = "" ;
      gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem Clone( )
   {
      return (com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem)(clone()) ;
   }

   public void setStruct( com.projetopratico.StructSdtSDTEfetivosUnidade_efetivosUnidadeItem struct )
   {
      if ( struct != null )
      {
         setgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Nome(struct.getNome());
         setgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Idade(struct.getIdade());
         setgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Unidadedelotacao(struct.getUnidadedelotacao());
         GXBaseCollection<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem> gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias_aux = new GXBaseCollection<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem>(com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem.class, "SDTEfetivosUnidade.efetivosUnidadeItem.fotografiasItem", "ProjetoPratico", remoteHandle);
         Vector<com.projetopratico.StructSdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem> gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias_aux1 = struct.getFotografias();
         if (gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias_aux1 != null)
         {
            for (int i = 0; i < gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias_aux1.size(); i++)
            {
               gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias_aux.add(new com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem(gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias_aux1.elementAt(i)));
            }
         }
         setgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias(gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias_aux);
      }
   }

   @SuppressWarnings("unchecked")
   public com.projetopratico.StructSdtSDTEfetivosUnidade_efetivosUnidadeItem getStruct( )
   {
      com.projetopratico.StructSdtSDTEfetivosUnidade_efetivosUnidadeItem struct = new com.projetopratico.StructSdtSDTEfetivosUnidade_efetivosUnidadeItem ();
      struct.setNome(getgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Nome());
      struct.setIdade(getgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Idade());
      struct.setUnidadedelotacao(getgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Unidadedelotacao());
      struct.setFotografias(getgxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias().getStruct());
      return struct ;
   }

   protected byte sdtIsNull ;
   protected byte gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias_N ;
   protected short gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Idade ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Nome ;
   protected String gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Unidadedelotacao ;
   protected GXBaseCollection<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem> gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias=null ;
   protected GXBaseCollection<com.projetopratico.SdtSDTEfetivosUnidade_efetivosUnidadeItem_fotografiasItem> gxTv_SdtSDTEfetivosUnidade_efetivosUnidadeItem_Fotografias_aux ;
}

