
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
public class sigmoid {
    public static void main(String[] args) {         
        Scanner ab=new Scanner(System.in);
        System.out.println("Enter 'x' value to perform Sigmoid Function");       
        staticmethod.x=ab.nextDouble();
        double a;        
        a=staticmethod.sigmoid(staticmethod.x);
        System.out.println(a);
    
}
}

class staticmethod
        {
             static double x;
             
             static double sigmoid(double a)
             {
                 double op=(1/(1-Math.exp(-x)));
                   return op ;
             }
        }