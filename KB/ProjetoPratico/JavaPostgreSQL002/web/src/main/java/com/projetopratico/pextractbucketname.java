package com.projetopratico ;
import com.projetopratico.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pextractbucketname extends GXProcedure
{
   public pextractbucketname( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pextractbucketname.class ), "" );
   }

   public pextractbucketname( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( int aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( int aP0 )
   {
      pextractbucketname.this.AV13fp_id = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      /* Using cursor P00192 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV13fp_id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10fp_id = P00192_A10fp_id[0] ;
         A40000fp_foto_GXI = P00192_A40000fp_foto_GXI[0] ;
         A12fp_bucket = P00192_A12fp_bucket[0] ;
         A13fp_hash = P00192_A13fp_hash[0] ;
         AV9url = A40000fp_foto_GXI ;
         /* Execute user subroutine: 'EXTRACTBUCKETNAME' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'EXTRACTHASH' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         A12fp_bucket = AV10bucket_name ;
         A13fp_hash = AV14bucket_hash ;
         /* Using cursor P00193 */
         pr_default.execute(1, new Object[] {A12fp_bucket, A13fp_hash, Integer.valueOf(A10fp_id)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("foto_pessoa");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      Application.commitDataStores(context, remoteHandle, pr_default, "pextractbucketname");
      cleanup();
   }

   public void S111( )
   {
      /* 'EXTRACTBUCKETNAME' Routine */
      returnInSub = false ;
      AV16posicaoInicialBucket = (short)(GXutil.strSearch( AV9url, "/", 8)+1) ;
      AV19posicaoFinalBucket = (short)(GXutil.strSearch( AV9url, "/", AV16posicaoInicialBucket)) ;
      AV20bucketNameLength = (short)(AV19posicaoFinalBucket-AV16posicaoInicialBucket) ;
      AV10bucket_name = GXutil.substring( AV9url, AV16posicaoInicialBucket, AV20bucketNameLength) ;
   }

   public void S121( )
   {
      /* 'EXTRACTHASH' Routine */
      returnInSub = false ;
      AV14bucket_hash = GXutil.substring( AV9url, GXutil.strSearchRev( AV9url, "/", -1)+1, GXutil.len( AV9url)) ;
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pextractbucketname");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      P00192_A10fp_id = new int[1] ;
      P00192_A40000fp_foto_GXI = new String[] {""} ;
      P00192_A12fp_bucket = new String[] {""} ;
      P00192_A13fp_hash = new String[] {""} ;
      A40000fp_foto_GXI = "" ;
      A12fp_bucket = "" ;
      A13fp_hash = "" ;
      AV9url = "" ;
      AV10bucket_name = "" ;
      AV14bucket_hash = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.projetopratico.pextractbucketname__default(),
         new Object[] {
             new Object[] {
            P00192_A10fp_id, P00192_A40000fp_foto_GXI, P00192_A12fp_bucket, P00192_A13fp_hash
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
   }

   private short AV16posicaoInicialBucket ;
   private short AV19posicaoFinalBucket ;
   private short AV20bucketNameLength ;
   private int AV13fp_id ;
   private int A10fp_id ;
   private boolean returnInSub ;
   private String A40000fp_foto_GXI ;
   private String A12fp_bucket ;
   private String A13fp_hash ;
   private String AV9url ;
   private String AV10bucket_name ;
   private String AV14bucket_hash ;
   private IDataStoreProvider pr_default ;
   private int[] P00192_A10fp_id ;
   private String[] P00192_A40000fp_foto_GXI ;
   private String[] P00192_A12fp_bucket ;
   private String[] P00192_A13fp_hash ;
}

final  class pextractbucketname__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00192", "SELECT fp_id, fp_foto_GXI, fp_bucket, fp_hash FROM foto_pessoa WHERE fp_id = ? ORDER BY fp_id  FOR UPDATE OF foto_pessoa",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00193", "SAVEPOINT gxupdate;UPDATE foto_pessoa SET fp_bucket=?, fp_hash=?  WHERE fp_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK + GX_MASKLOOPLOCK)
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getMultimediaUri(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 150, false);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

