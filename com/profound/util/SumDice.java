/******************************************************************************
 *  Compilation:  javac -d bin com/profound/util/SumDice.java
 *  Execution:    java -cp bin com.profound.util.SumDice
 *
 *  @author  Prem
 *  @version 1.0
 * output:
 *  The value of Dice 1 is:5
 *	The value of Dice 2 is:1
 *	The Sum of the two Dice is:6
 ******************************************************************************/
// package com.profound.util;
import java.util.Scanner;
public class SumDice
{
	// variables
		static int dice1,dice2,sum;
		
	public static void main(String [] args)
	{
		dice1=(int)(Math.random()*6)+1;
		dice2=(int)(Math.random()*6)+1;
		sum=dice1+dice2;
		System.out.println("The value of Dice 1 is:"+dice1);
		System.out.println("The value of Dice 2 is:"+dice2);
		System.out.println("The Sum of the two Dice is:"+sum);
	}
}