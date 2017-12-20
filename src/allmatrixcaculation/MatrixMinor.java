/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package allmatrixcaculation;

/**
 *
 * @author Rishabh
 */
public class MatrixMinor {
      public double minor(double x[][],int o,int y,int z)throws ArrayIndexOutOfBoundsException{
       /**
        * o-order
        * x & y are the indices of the element
        */
          Determinant del=new Determinant();
        
        double R[][]=new double[o-1][o-1];//x is of order 1 higher
       int r=0,c=0;
        int a=0,b;
        
           while(a<o){
            b=0;c=0;
                
                        while(b<o){
                            if(!((a==y)||(b==z))){
                                R[r][c]=x[a][b];
                               
                                c++;
                                }//if ends here
                            b++;
                        }//while ends here
              
                        if(a!=y){
                        r++;
                          }
            
            a++;
        }
           
           System.out.println("The intermediate Matrix minor  is as follow");
        for(int i=0;i<o-1;i++){
            for(int j=0;j<o-1;j++){
                System.out.print(R[i][j]+"  ");
            }
                System.out.println();
        }
        
      return del.delta(R,o-1);
       
    } 
}
