/******************************************************************************
 *  Compilation:  javac HarmonicNumber.java
 *  Execution:    java HarmonicNumber n
 *  @author  Prem
 *  @version 1.0
 *  Prints the nth harmonic number: 1/1 + 1/2 + ... + 1/n.
 * 
 *  % java HarmonicNumber 10
 *  2.9289682539682538
 *
 *  % java HarmonicNumber 10000
 *  9.787606036044348
 *
 ******************************************************************************/

//package com.profound.util;

/*importing math and scanner class for math and user input function*/
import java.lang.Math;
import java.util.Scanner;

public class HarmonicNumber
 { 
	//variables
	static int n;
	
    public static void main(String[] args)
     { 

        // command-line argument
         n = Integer.parseInt(args[0]);

        // compute 1/1 + 1/2 + 1/3 + ... + 1/n
        double sum = 0;
        for (int i = 1; i <= n; i++) 
        {
            sum += 1 / i;
        }

        // print the nth harmonic number
        System.out.println(sum);
    }

}