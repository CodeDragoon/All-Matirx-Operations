

package allmatrixcaculation;

/**
 *
 * @author Rishabh
 */
public class MatrixMultiplication {
    
   
    public double[][] multiply(double[][] x,double[][] y,int p,int q,int r){
        
        double R[][]=new double[p][r];
        double sm=0;
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                for(int k=0;k<r;k++){
                    
                  sm=sm+x[i][k]*y[k][j];  
                }
                R[i][j]=sm;
                sm=0;
            }
            
            
        }
        
        return R;
        
    }
  
    
}
