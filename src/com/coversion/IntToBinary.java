package com.coversion;

import java.util.Scanner;

public class IntToBinary{

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int n , m;
		String  x = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an integer to convert into binary : ");
		 n = sc.nextInt();
		 
		  while(n > 0)
	        {
	            int a = n % 2;
	            x = a + x;
	            n = n / 2;
	        }
		  System.out.println("binary code of given ineger is :"+x );
	}

}
