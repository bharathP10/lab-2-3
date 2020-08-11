
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
public class electricitybill {
     public static void main(String[] args) {
        
        electricitycharge obj=new electricitycharge();
        Scanner a=new Scanner(System.in);
        System.out.println("Enter Consumer name and number:");
        obj.name=a.next();
        obj.consumernum=a.nextInt();
        System.out.println("Enter previous month reading :");
        obj.previousnum=a.nextDouble();
        System.out.println("Enter current  month reading :");
        obj.currentnum=a.nextDouble();
        System.out.println("The consumer details are:.........");
        System.out.println("Name="+obj.name);
        System.out.println("Consumer No."+obj.consumernum);
        obj.u=obj.currentnum-obj.previousnum;
        System.out.println("Actual Current Reading"+obj.u);
      
        System.out.println("Enter type of EB connection:if Domestic pess->d commercial press->c");
        obj.type(obj.u);
     
}
}
       
        
                     
  class electricitycharge
{
     int consumernum;
     String name;
     double previousnum;
     double currentnum;
     double u;
     
     public double domestic(double unit)
     {
          if (unit<=100)
          {
               unit=unit*1.50;
               return unit;
               
          }
          else if(unit>101 && unit<=200)
          {
                unit=unit*3;
                return unit;
          }
          else if(unit >201 && unit<=500)
          {
               unit=unit*4.50;
               return unit;
               
                       
          }
          else
          {
               unit=unit*7;
               return unit;
               
          }
     }
     public double commercial(double unit)
     {
      
          
          if (unit<=100)
          {
               unit=unit*2.50;
               return unit;
               
          }
          else if(unit>101 && unit<=200)
          {
                unit=unit*5;
                return unit;
          }
          else if(unit >201 && unit<=500)
          {
               unit=unit*6.50;
               return unit;
               
                       
          }
          else
          {
               unit=unit*9;
               return unit;
               
          }
     }
     public void type(double unit){
            electricitycharge obj=new electricitycharge();
             Scanner a=new Scanner(System.in);
              char type=a.next().charAt(0);    
             if(type=='d'){
        
               System.out.println(obj.domestic(unit));
     }
            else if(type=='c'){
                
                System.out.println(obj.commercial(unit));
            }
             else
            {
                System.out.println("enter valid type");
            }
    
  }
  }
       
             

     
 


                     
           
         
        
        
        
        
        
        
        
        
        
        
 

    

