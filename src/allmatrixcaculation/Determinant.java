

package allmatrixcaculation;

/**
 *
 * @author Rishabh
 */
public class Determinant {
    
    public double delta(double A[][],int o){
        MatrixCofactor  mc=new MatrixCofactor();
       int a=0;
       double sum=0;
       if(o==1)
           return A[0][0];
       
       else if(o==2){
            return A[0][0]*A[1][1]-A[0][1]*A[1][0];
        }
        else{
            while(a<o){
               sum=sum+A[0][a]*mc.cofactor(A,o,0,a);
               a++;
            }
             return sum;
        }
    }
    
}
