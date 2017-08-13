/**************************************************************
* Program : RollDie
* Author: Prem*
* Date :  
**************************************************************/



package com.profound.util;

import java.lang.Math;
import java.util.Scanner;

public class RollDie 
{
    static int result,trials;
    static int one=0;
    static int two=0;
    static int three=0;
    static int four=0;
    static int five=0;
    static int six=0;

	public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        trials=in.nextInt();
	while(trials>0)
	{
		result=(int)((Math.random()*6)+1);
        if(result==1)
        one++;
        else if(result==2)
        two++;
        else if(result==3)
        three++;
        else if(result==4)
        four++;
        else if(result==5)
        five++;
        else
        six++;
	trials--;
	}
	int array[]={one,two,three,four,five,six};
        int greatest=array[0];
        for(int i=0;i<5;i++)
        {
 
           if(array[i]>greatest)
            {
                greatest=array[i];
            }
        }
        System.out.println("The side which come maximum is:"+greatest);
    }
}




