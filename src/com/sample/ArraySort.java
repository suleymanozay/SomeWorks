package com.sample;



public class ArraySort {

	public static void main(String[] args) {
		
	
		int[] arr = { 1, 4, 99, 2, 5, -3, 6, 2, -49, 52 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-(i+1); j++) {
				if (arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
				
			}
			
		}

		for (int i : arr) {

			System.out.println(i);

		}
	}
}