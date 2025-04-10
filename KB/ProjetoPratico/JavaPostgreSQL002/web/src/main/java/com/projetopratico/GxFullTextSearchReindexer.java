package com.projetopratico ;
import com.projetopratico.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class GxFullTextSearchReindexer
{
   public static int Reindex( int remoteHandle )
   {
      GxSilentTrnSdt obj;
      IGxSilentTrn trn;
      boolean result;
      obj = new com.projetopratico.Sdtunidade(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new com.projetopratico.Sdtpessoa(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new com.projetopratico.Sdtfoto_pessoa(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new com.projetopratico.Sdtendereco(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new com.projetopratico.Sdtpessoa_endereco(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new com.projetopratico.Sdtservidor_temporario(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new com.projetopratico.Sdtcidade(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new com.projetopratico.Sdtservidor_efetivo(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new com.projetopratico.Sdtlotacao(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new com.projetopratico.Sdtunidade_endereco(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      return 1 ;
   }

}

