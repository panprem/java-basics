
 /****************************************
   program:car loan payment
   Authur: Prem
   Version:1.0
  
  ******************************************/

//package com.profound.util;

/*importing math and scanner class for math and user input function*/
import java.lang.Math;
import java.util.Scanner;

public class CarLoanPayment 
{
   //variable declaration 
   static  float principle,year,rate,r,payment;
   static  float time;
    public static void main(String[] args) 
    {
        //defining scanner class 
        Scanner in=new Scanner(System.in);
        //principle amount input
        principle=in.nextFloat();
    
        year=in.nextFloat();
      
        rate=in.nextFloat();
   
        time=(12*year);

        r=rate/(12*100);
       
        payment=(float)((principle*r)/(1-(Math.pow((1+r),-time))));
        //display value
        System.out.println("payment:"+payment);
    }
}
