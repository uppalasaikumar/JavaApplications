package com.sai.programs;

public class StringReverse {

	public static void main(String[] args) {
		
		String s = "Raven";
		
		char[] arr = s.toCharArray();
		char temp; 
		
		for(int i =0;i<arr.length/2;i++) {
			 temp = arr[i] ;
			 arr[i]= arr[arr.length-i-1];
			 arr[arr.length-i-1] = temp;
		}
		String reverse = "";
		for(int i =0 ; i<arr.length;i++) {
			reverse = reverse + arr[i];
		}
		
		System.out.println(reverse);
		

	}

}
