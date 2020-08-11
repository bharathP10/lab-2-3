
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
public class circle {
    
    public static void main(String[] ar) {
        
        circleRA a1=new circleRA();
        System.out.println(" >>DEFAULT CONSTRUCTOR <<");
        System.out.println("The radius is "+a1.radius);
        System.out.println("The colour is "+a1.colour);
        
        double RA;
        RA=a1.getradius();
        circleRA obj2=new circleRA(RA);
        System.out.println(">>PARAMETRIZED CONSTRUCTOR <<");
        System.out.println("The radius is "+obj2.radius);
        System.out.println("The area is "+obj2.getarea(RA));
    
}
}
class circleRA
{
      double r;
      double radius;
      String colour;
      circleRA(double r )
      {
           radius=r;
            
      }
      circleRA()
      {
           radius=1.5;
           colour="RED";
      }
      public double getradius()
      {
            double r;
            Scanner obj=new Scanner(System.in);
            System.out.println("Enter radius");
            r=obj.nextDouble();
            return r;
      }
      double getarea(double r)
      {
          double rad=r*r*3.14;
           return rad;
           
       }
}