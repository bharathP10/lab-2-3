
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BHARATH sharan
 */
import java.util.Scanner;
public class triangle {
    public static void main(String[] arg) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the 1st side of a TRIANGLE");
        trianglecheck.First=obj.nextDouble();      
        System.out.println("Enter the 2nd side of a TRIANGLE");
        trianglecheck.Second=obj.nextDouble();       
        System.out.println("Enter the 3rd side of a TRIANGLE");                
        trianglecheck.Third=obj.nextDouble();
        trianglecheck.check();
       
    
}
}
class trianglecheck
{
     static double  First,Second,Third;
     
     static double triangular(double a,double b,double c)
     {
          if(a<b+c && b<a+c && c<a+b)
          {
                return 1;
          }
          else
          {
               return 0;
          }
     }
     
     static void check(){
          double  t= trianglecheck.triangular(trianglecheck.First,trianglecheck. Second,trianglecheck. Third);
        if(t==1)
        {
             System.out.println("YES!!! TRianGLE can be formed");
             
        }
        else
                {
                     System.out.println("OhOoo!!! TRianGLE cannot be not formed");
                     
                }
        
        }
     }
         



    

