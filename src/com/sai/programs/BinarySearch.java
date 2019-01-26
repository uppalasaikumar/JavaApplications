package com.sai.programs;

public class BinarySearch {

	public static void main(String[] args) {
		 int[] arr = new int[] {1,3,5,7,9,13,14,16};
		 
		 System.out.println(serach(arr,16));

	}

	private static int serach(int[] arr, int find) {
		return binarySearch(arr,find,0,arr.length-1);
		
	}

	private static int binarySearch(int[] arr, int find, int low, int high) {
		
		int mid = (low+high)/2; //3 -- 5
		System.out.println("mid : " +mid );
		if(arr[mid] == find) {
			return mid; 
		}
		
		else if( find > arr[mid]) {
			return binarySearch(arr, find, mid+1, high);	//4,7
		}
		else if(find< arr[mid]){
			return 	binarySearch(arr, find, low, mid-1);
		}
		
		return -1;
		
		
	}

}
