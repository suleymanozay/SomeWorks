package com.sample;

import java.util.ArrayList;
import java.util.List;

public class QuestionAnswer {
	
	public static int sumOfElements(List<Integer> list){//Q1 
		int  sum= 0;
		
		 for(int i=0; i<list.size(); i++) {
				sum+=list.get(i);
		}
			
			return sum;
		}
		
	public static List<Integer> indexOfEvenNum(List<Integer> list){//Q2
	 List<Integer> returnIndex= new ArrayList<Integer>();// CREATE A NEW LIST
	 for(int i=0; i<list.size(); i++) {
		 if((list.get(i))%2==0) {//EVEN OR NOT
			 returnIndex.add(i);// IF EVEN ADD LIST
			 	 
		 }
	 }
		
		return returnIndex;
	}
	
	public static String whichOneIsMore(List<Integer> list){//Q3
		String status= "";
		int countEven=0;
		 int countOdd=0;
		 for(int i=0; i<list.size(); i++) {
			 if((list.get(i))%2==0) {// cift sayi ise
				 countEven+=1;// SUM OF EVENS NUM ADD 1
			 }else {// IF ODD
				 countOdd+=1;// SUM OF ODD NUM ADD 1
			 }
		 }
		 if (countEven>countOdd) {
			 status="Even";
		}else if(countEven<countOdd) {
			status="Odd";
		}else {
			status="Even and Odd";
		}
			
			return status;
		}
		
	  public static List<String> longestWords(List<String> words) {//Q4
	      List<String> list = new ArrayList<String>();// CREATE NEW LIST
	        int longest_length = 0;
	        for (String str : words) {
	            int length = str.length();// COMPARE LIST LENGTH
	            if (length > longest_length) {
	                longest_length = length;
	                list.clear();
	            }
	            if (length == longest_length) {
	                list.add(str);// FIRST STEP
	            }
	        }
	        return list;
	    }
	  
	  public static List<String> startsWithVowels(List<String> words) {//Q5
		  List<String> list = new ArrayList<String>();
	           for (int i = 0; i < words.size(); i++) {
	        	   String element=words.get(i).toLowerCase();//FIRST LETTER LOWER
	        	  char ch=element.charAt(0);
	        	  
	        	   if(ch=='a' || ch=='e' ||ch== 'i' ||ch== 'o' || ch=='u') {
	        		   list.add(element);
					}
	      }
	           return list;
	  }
	  
	public static void main(String[] args) {
		 List<Integer> a= new ArrayList<Integer>();//FOR Q1-Q2-Q3s
		 a.add(1);
		 a.add(5);
		 a.add(7);
		 a.add(4);
		 List<String > words = new ArrayList<String>();//FOR Q4-Q5
		 words.add("dog");
		 words.add("superduper");
		 words.add("hello");
		 words.add("country");
		 words.add("traffic");
		 words.add("elephants");
		 words.add("octopus");
				
		 System.out.println(a);
		 System.out.println(sumOfElements(a));//TESTQ1
		 System.out.println(indexOfEvenNum(a));//TESTQ2
		 System.out.println(whichOneIsMore(a));//TESTQ3
		 System.out.println(longestWords(words));//TESTQ4
		 System.out.println(startsWithVowels(words));//TESTQ5
		 
		 
			
		}
		 
	}
	

