/*Problem-4: Get the total count of number listed in the dictionary which is multiple of [1,2,3,4,5,6,7,8,9]
  (examples)
  input: [1,2,8,9,12,46,76,82,15,20,30]
  Output: 
    {1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}
*/


package com.tandemloop.test;

import java.util.*;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter numbers separated by comma: ");
		String s = scanner.nextLine();
        String[] arr = s.trim().split(","); 	//give input -> Enter numbers seperated by comma:1,2,8,9,12,46,76,82,15,20,30

        List<Integer> input = new ArrayList<>();
        for (String inputList : arr) {
            input.add(Integer.parseInt(inputList));
        }

		
		Map<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
		for(int i=1;i<=9;i++) {
				map.put(i,0);
		}
		
		for(int num:input) {
			for(int i=1;i<=9;i++) {
				if(num%i==0) {
					map.put(i, map.get(i)+1);
				}
			}
		}
		
		System.out.println(map);
	}

}
