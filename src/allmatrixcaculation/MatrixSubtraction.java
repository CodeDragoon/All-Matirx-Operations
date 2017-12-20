

package allmatrixcaculation;

/**
 *
 * @author Rishabh
 */
public class MatrixSubtraction {
    
       
    public double[][] subtract(double x[][],double y[][],int r,int c){
        double z[][]=new double[r][c];
        for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            z[i][j]=x[i][j]-y[i][j];
        }
    }
        return z;
    }
 
    
}
