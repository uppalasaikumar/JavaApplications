package com.sai.programs;

public class Palindrome {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome(1221));
	}

	public static boolean isPalindrome(int val) {
		
		int temp =val;
		int r,newVal = 0;
		while(val!=0) {
			r = val%10;
			newVal = newVal*10+r; 
			val=val/10;
			
		}
		
		return temp == newVal;
	}

}
