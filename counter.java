
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
public class counter {
     public static void main(String[] args) {
       
        count a1=new count();
        Scanner obj=new Scanner(System.in);        
        System.out.println("PRESS 's' for STATIC  ");
        System.out.println(" PRESS  'n' for NON-STATIC  ");
        char option=obj.next().charAt(0);
        if(option=='s')
        {
             count.staticc();
        }
        else if(option=='n')
        {
             a1.nonstatic();
        }
     }
    
}
class count
{
      
 public static  void  staticc()
{
            Scanner obj=new Scanner(System.in);
            int i=1,count=0,a,b;            
             do{
              System.out.println("Enter the "+i+" value");
              a=obj.nextInt();
              System.out.println("The value YOU entered is ---> "+a);
              count++;
              System.out.println("If you need to enter few more numbers then PRESS '10' else\n  PRESS  your favourite one digit number");
              b= obj.nextInt();
              i++;
             }while(b==10);
             System.out.println("Total numbers entered ="+count);
  }
    void nonstatic()
     {
            Scanner obj=new Scanner(System.in);
            int i=1,count=0,a;
            int b;
            
        do{
              System.out.println("Enter the "+i+" value");
              a=obj.nextInt();
              System.out.println("The value YOU entered is ---> "+a);
              count++;
              System.out.println("If you want to enter  few more numbers then  PRESS '10'else \n PRESS  your favourite one digit number ");
              b= obj.nextInt();
              i++;
             }while(b==10);
             System.out.println("Total numbers entered ="+count);
     }
}
