/*Problem-1: Create a small calculator which performs operations such as Addition, Subtraction, Multiplication and Division using class.
Calculator inputs :> ‘a’, ‘b’ and ‘type of operation’
Datatype :> ‘a’ = double, ‘b’ = double, ‘type of operation’ = string*/


package com.tandemloop.test;


import java.util.Scanner;
import java.lang.Math;
import java.lang.*;

public class Problem1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Scanner scan2=new Scanner(System.in);
		System.out.println("Enter a:");
		double a=scan.nextDouble();
		System.out.println("Enter b:");
		double b=scan.nextDouble();
		System.out.println("Enter operation to be performed type any one of this -> (add,sub,mul,div):");
		String op=scan2.nextLine();
		
		double result=0;
		
		switch(op){
		case "add":
			result=a+b;
			break;
		case "sub":
			result=a-b;
			break;
		
		case "mul":
			result=a*b;
		
		case "div":
			result=a/b;
		
		default:
			System.out.println("Wrong input");
		}
		System.out.println("Result: "+a+" "+op+" "+b+"="+result);
		
	}
	
	
}

