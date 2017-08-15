/****************************************
   program:based on wind velocity count windchill
   Authur: Prem
   Version:1.0
   Date:11/08/17
  *****************************************/
  //package com.profound.util;

//Math class for inclusion of math built in functions
import java.lang.Math;
import java.util.Scanner;

public class Wind
{
       //variables 
       static float tempreture,velocity;
       //Temp variable
       static float temp;
    public static void main(String[] args) 
    {  
        Scanner in=new Scanner(System.in);
      
        System.out.println("Enter tempreture in fareinheit:");
		
        tempreture=in.nextFloat();
       
        System.out.println("Enter velocity in miles:");
		
        velocity=in.nextFloat();
		
        //store pow of velocity
        temp=(float)Math.pow(velocity,0.16);
      
        double windChill=(float)(35.74)+(0.6215*tempreture)+(0.4275*tempreture-35.75)*temp;
        // result
		
        System.out.println("Windchill:"+windChill);
    }
}