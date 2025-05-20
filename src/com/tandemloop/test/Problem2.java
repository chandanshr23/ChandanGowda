/*Problem-2: With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples]

Output: (examples)
  1) input a = 1, then output : 1
  2) input a = 2, then output : 1, 3
  3) input a = 3, then output : 1, 3, 5
  4) input a = 4, then output : 1, 3, 5, 7
  .
  .
  5) input a = x, then output : 1, 3, 5, 7, .......
*/

package com.tandemloop.test;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a=scan.nextInt();
		int num=1;
		for(int i=0;i<a;i++) {
			System.out.println(num);
			num+=2;
		}
	scan.close();
	}

}
