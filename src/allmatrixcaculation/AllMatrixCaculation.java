
package allmatrixcaculation;
import java.io.*;
/**
 *This is basically a project that is going to perform many of the matrix
 * related operations.Matrices are pretty cool butt there is lot of calculations
 * in it that makes it many times troublesome.
 * 
 * So,what we gonna do is that we are gonna perform the following basic operations
 * 1-Addition
 * 2-Subtraction
 * 3-Multiplication
 * 4-Minors
 * 5-CoFactors
 * 6-Adjoint
 * 7-Rank 
 * 8-Inverse
 * 9-Solving Simultaneous equation
 * 
 * @author Rishabh
 */
public class AllMatrixCaculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
              
        BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Select one of the following operations");
          System.out.println("1-Addition of Matrices");
            System.out.println("2-Subtraction of matrices");
              System.out.println("3-Multiplication of Matrices"); 
              System.out.println("4-Minor");
              System.out.println("5-Cofactor"); 
              System.out.println("6-Determinant");
              System.out.println("7-Adjoint of matrix");
                    System.out.println("8-Rank of matrix");
                      System.out.println("9-Inverse of a matrix");
                        System.out.println("10-Solution of simultaneous equations");
                        
                        
             switch(Integer.parseInt(Br.readLine())){
                 
           case 1:{  
                          System.out.println("Enter the order \n no of rows=");
                          int row,col;
                          row=Integer.parseInt(Br.readLine());
                          System.out.println("no of columns=");
                          col=Integer.parseInt(Br.readLine());
                          double A[][]=new double[row][col];
                          System.out.println("Enter the Matrix 1");
                          for(int i=0;i<row;i++){
                         System.out.println("Enter Row "+i);
                     for(int j=0;j<col;j++){
                         A[i][j]=Double.parseDouble(Br.readLine());
                        }
                     
                      }
                          
                      System.out.println("Enter the Matrix 2");
                                                     
                          double B[][]=new double[row][col];
                          for(int i=0;i<row;i++){
                        System.out.println("Enter Row"+i);
                      for(int j=0;j<col;j++){
                         B[i][j]=Double.parseDouble(Br.readLine());
                        }
                     
                      }
                          
                     
                     

                             MatrixAddition ma=new MatrixAddition();
                             double R[][]=ma.add(A,B,row,col);

                            for(int i=0;i<row;i++){
                     
                                                      
                               for(int j=0;j<col;j++){
                                   System.out.print(A[i][j]+"  ");
                               }
                              
                               if(i==((row)/2))
                               System.out.print("   -   ");
                               else
                               System.out.print("       ");
                                  
                               
                               
                                for(int j=0;j<col;j++)
                                   System.out.print(B[i][j]+"  ");
                               
                                if(i==((row)/2))
                               System.out.print("   =   ");
                               else
                               System.out.print("       ");
                             
                         
                                   for(int j=0;j<col;j++){
                                    System.out.print(R[i][j]+"  ");
                         
                                     }
                                System.out.println();   
                            } //outer for          
                        
                            break;
                         }//first switch case ends here
                 
      case 2:     { 
                           System.out.println("Enter the order \n no of rows=");
                          int row,col;
                          row=Integer.parseInt(Br.readLine());
                          System.out.println("no of columns=");
                          col=Integer.parseInt(Br.readLine());
                          double A[][]=new double[row][col];
                           System.out.println("Enter the Matrix 1");
                           
                          for(int i=0;i<row;i++){
                     System.out.println("Enter row"+i);
                     for(int j=0;j<col;j++){
                         A[i][j]=Double.parseDouble(Br.readLine());
                        }
                     
                      }
                          
                      System.out.println("Enter the Matrix 2");
                                                     
                          double B[][]=new double[row][col];
                          for(int i=0;i<row;i++){
                       System.out.println("Enter Row"+i);
                      for(int j=0;j<col;j++){
                         B[i][j]=Double.parseDouble(Br.readLine());
                        }
                     
                      }
                          
                     
                     
                     
                     MatrixSubtraction ms=new MatrixSubtraction();
                     double R[][]=ms.subtract(A,B,row,col);
                     
                           for(int i=0;i<row;i++){
                     
                               for(int j=0;j<col;j++){
                                   System.out.print(A[i][j]+"  ");
                               }
                              
                               if(i==((row)/2))
                               System.out.print("   -   ");
                               else
                               System.out.print("       ");
                                  
                               
                               
                                for(int j=0;j<col;j++)
                                   System.out.print(B[i][j]+"  ");
                               
                                if(i==((row)/2))
                               System.out.print("   =   ");
                               else
                               System.out.print("       ");
                             
                              
                                for(int j=0;j<col;j++){
                                    System.out.print(R[i][j]+"  ");
                         
                                     }
                                System.out.println();   
                            } //outer for          
                        
                       break;
                     }//second switch case ends here
      case 3:{
                 System.out.println("Enter the order of first Matrix");
                 int r1,c1,c2;
                 r1=Integer.parseInt(Br.readLine());
                 c1=Integer.parseInt(Br.readLine());
                 System.out.println("Enter the number of columns for other matrix");
                 c2=Integer.parseInt(Br.readLine());
                  double A[][]=new double[r1][c1];
                  double B[][]=new double[c1][c2];
                 System.out.println("Enter first matrix");
                 for(int i=0;i<r1;i++){
                     System.out.println("Enter the row "+i);
                     for(int j=0;j<r1;j++){
                         A[i][j]=Double.parseDouble(Br.readLine());
                         
                     }
                 }
                 System.out.println("Enter the Second matrix");
                  for(int i=0;i<c1;i++){
                     System.out.println("Enter the row "+i);
                     for(int j=0;j<c2;j++){
                         B[i][j]=Double.parseDouble(Br.readLine());
                         
                     }
                 }
                  
                  MatrixMultiplication mm=new MatrixMultiplication();
                  double R[][]=mm.multiply(A, B, r1, c1, c2);
                
                  int row=(r1>c1)?r1:c1;
          
                  for(int a=0;a<row;a++){
                      
                      for(int b=0;b<c1&&a<r1;b++){
                          System.out.print(A[a][b]+"   ");
                      }
                      System.out.print("       ");
                      for(int c=0;c<c2&&a<c1;c++){
                          System.out.print(B[a][c]+"   ");
                      }
                      if(a==row/2)
                          System.out.print("   *   ");
                      else 
                          System.out.print("       ");
                      
                      for(int d=0;d<c2 && a<r1;d++){
                          System.out.print(R[a][d]+"   ");
                      }
                      System.out.println();     
                  }//the a-for ends
          
          
                   break;       }//switch case 3 ends here;
      
      case 4:{    int r,a,b;
                 System.out.println("Enter the order");
                 r=Integer.parseInt(Br.readLine());
                 double A[][]=new double[r][r];
                 System.out.println("Enter the matrix");
                 for(int i=0;i<r;i++){
                     System.out.println("Enter row "+i);
                     for(int j=0;j<r;j++){
                         A[i][j]=Double.parseDouble(Br.readLine());
                     }
                 }
                 System.out.println("enter the index of element");
                a=Integer.parseInt(Br.readLine());
                b=Integer.parseInt(Br.readLine());
                MatrixMinor mm=new MatrixMinor();
             
               double R=mm.minor(A,r,a,b);
          System.out.println("the minor is "+R);
              break;
          
      }//switch case 4 ends here
      case 5:{    int r,a,b;
                 System.out.println("Enter the order");
                 r=Integer.parseInt(Br.readLine());
                 double A[][]=new double[r][r];
                 System.out.println("Enter the matrix");
                 for(int i=0;i<r;i++){
                     System.out.println("Enter row "+i);
                     for(int j=0;j<r;j++){
                         A[i][j]=Double.parseDouble(Br.readLine());
                     }
                 }
                 System.out.println("enter the index of element");
                a=Integer.parseInt(Br.readLine());
                b=Integer.parseInt(Br.readLine());
                 MatrixCofactor mc=new MatrixCofactor();
                double R=mc.cofactor(A,r,a,b);
          System.out.println("the cofactor is "+R);
          break;
      }//switch case 5 ends here
      case 6:{
           int o,a,b;
                 System.out.println("Enter the order");
                 o=Integer.parseInt(Br.readLine());
                 double A[][]=new double[o][o];
                 System.out.println("Enter the matrix");
                
                 
                 for(int i=0;i<o;i++){
                     System.out.println("Enter row "+i);
                     for(int j=0;j<o;j++){
                         A[i][j]=Double.parseDouble(Br.readLine());
                     }
                 }
                
                 
                 Determinant d=new Determinant();
                 double delta=d.delta(A, o);
                
                   for(int i=0;i<o;i++){
                     
                     for(int j=0;j<o;j++){
                        System.out.print(A[i][j]+"  ");
                     }
                     System.out.println();
                 }
                   System.out.println("\n\n\n");
               
                 System.out.println("The determinant of the above matrix is  "+delta);
          break;
      }
                    
      case 7:{    int o,a,b;
                 System.out.println("Enter the order");
                 o=Integer.parseInt(Br.readLine());
                 double A[][]=new double[o][o];
                 System.out.println("Enter the matrix");
                 for(int i=0;i<o;i++){
                     System.out.println("Enter row "+i);
                     for(int j=0;j<o;j++){
                         A[i][j]=Double.parseDouble(Br.readLine());
                     }
                 }
                MatrixAdjoint ma=new MatrixAdjoint();
                double R[][]=ma.adjoint(A, o);
                
                  for(int i=0;i<o;i++){
                    
                     for(int j=0;j<o;j++){
                     System.out.println(R[i][j]);    
                     }
                 }
                  break;
         }//switch case 6 ends here
      
      case 8:{
            
      }//switch case 7 ends here
      }//switch block ends here 
          
        
    }//main ends here
}//class ends here
    

