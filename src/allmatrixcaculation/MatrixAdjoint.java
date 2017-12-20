

package allmatrixcaculation;

public class MatrixAdjoint {
    
    public double[][] adjoint(double mat[][],int order){
        
         MatrixCofactor mc=new MatrixCofactor();
                 double Adj[][]=new double[order][order];
                 for(int i=0;i<order;i++){
                     for(int j=0;j<order;j++){
                         Adj[i][j]=mc.cofactor(mat,order,j,i);
                     }
                 }
                 return Adj;
    }
}
