package com.sample;



public class Pair {
	public static void main(String[] args) {
		int[] a= {0,1,2,3,4,5,6,7};
		int num;
		
		for (int i=0; i<a.length;i++) {
			num=7-a[i];
			for (int j = 0; j < a.length; j++) {
				if(num==a[j]) {
					System.out.println(a[i]+"+" + a[j] +" equals 7");
				}
				
			}
			
		}
	}
	
	

}
