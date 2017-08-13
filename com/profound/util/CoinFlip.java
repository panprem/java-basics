package com.profound.util;
import java.lang.Math;
public class CoinFlip
{
	/*declaring variables*/
	static	int trails;
        static   int head=0;
        static   int tail=0;
        static   int i;

	public static void main(String []args)
{
		trails=Integer.parseInt(args[0]);
		for(i=1;i<=trails;i++)
		{
		if(Math.random()<0.5)
		{
		head++;
		
		}
		else
		{
		tail++;
		
		}
	}
	System.out.println("Percentage of head:="+100*head/trails);
	System.out.println("Percentage of trails:="+100*tail/trails);
}
}
