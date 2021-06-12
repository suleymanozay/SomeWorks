package com.sample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TrimDateFormat {
	public static void main(String[] args) {
		Date todaysDate = new Date();
	    SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	    String date="";
	      
	       try
	       {
	    	   
	           date = df.format(todaysDate).trim().replace("/", "");
	           date=date.replace(":", "");
	           date=date.replace(" ", "");
	           System.out.println(date);
	           
	         
	       }
	       catch (Exception ex ){
	          System.out.println(ex);
	       }
	      
	}
	}


