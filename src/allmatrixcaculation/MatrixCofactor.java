

package allmatrixcaculation;


public class MatrixCofactor {
public double cofactor(double A[][],int order,int row,int col){
    MatrixMinor mm=new MatrixMinor();
    
           
    
     return mm.minor(A,order,row,col)*Math.pow(-1,row+col);

}

}  
