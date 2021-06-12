package com.sample;
// 3,-6, 12, 4 ,20 , ???
import java.util.ArrayList;

public class FindNextTerm {
	public static void nextTerm(){
		ArrayList<Integer> series=new ArrayList<Integer>();
		series.add(0, 3);
		int index=1;
		int element;
		
		for (int i = 9; i >4; i--) {
			element=series.get(index-1)-i;
			 series.add(index, element);
			index++;
			element=series.get(index-1)+(i*2);
			 series.add(index, element);
			index++;
		}
			
		System.out.println(series);
		
	}
	
public static void main(String[] args) {
	nextTerm();
	
	
}
}
