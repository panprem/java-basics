package com.profound.util;
import java.lang.Math;
public class CoinFlip
{
	public static void main(String []args)
	{
		int trails;
		int head=0;
		int tail=0;
		int i;
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
