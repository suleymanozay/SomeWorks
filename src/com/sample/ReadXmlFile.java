package com.sample;
import javax.xml.parsers.DocumentBuilderFactory;  
import javax.xml.parsers.DocumentBuilder;


import org.w3c.dom.Document;  
import org.w3c.dom.NodeList;  
import org.w3c.dom.Node;  
import org.w3c.dom.Element;  
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;  

public class ReadXmlFile {
	
	
	public static List<String>  readXmlFile(String filePath,String parentTag, String tag) {
		List<String> list = new ArrayList<String>();
		
		try {   
	 
		
		File file = new File(filePath);  
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
		
		DocumentBuilder db = dbf.newDocumentBuilder();  
		
		Document doc = db.parse(file);  
		
		doc.getDocumentElement().normalize();  
		
		
		NodeList nodeList = doc.getElementsByTagName(parentTag);  
		
		for (int i = 0; i < nodeList.getLength(); i++) {   
		
		Node node = nodeList.item(i);  
		
		if (node.getNodeType() == Node.ELEMENT_NODE) { 
		  
		Element eElement = (Element) node;  
			
		list.add(eElement.getElementsByTagName(tag).item(0).getTextContent());
		
		}  
		}  
		}   
		catch (Exception e)   
		{  
		System.out.println("File not found"); 
		}  
		return list;
	}
	
	public static String fileNameXml() {//DATE CONVERT TO STRING
		Date todaysDate = new Date();
	    DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	    String date="";
	      
	       try
	       {
	           
	    	   date = df.format(todaysDate).trim().replace("/", "");
	           date=date.replace(":", "");
	           date=date.replace(" ", "");
	           
	         
	       }
	       catch (Exception ex ){
	          System.out.println(ex);
	       }
	       return date;
	}
	
	public static List<String> filePath(String startsDate, String finishDate) {
		List<String> list = new ArrayList<String>();
		String startsDate1=startsDate.trim().replace("/", "").replace(":", "").replace(" ", "");
		String finishDate1=finishDate.trim().replace("/", "").replace(":", "").replace(" ", "");
		long start=Long.parseLong(startsDate1);
		long finish=Long.parseLong(finishDate1);
		while(start<=finish) {
			String path=Long.toString(start);
			list.add(path);
			start++;
			
		}
		return list;
	}
	
	public static String filePath(String startsDate, String finishDate,String directory,String extension) {
		String path="";
		String startsDate1=startsDate.trim().replace("/", "").replace(":", "").replace(" ", "");
		String finishDate1=finishDate.trim().replace("/", "").replace(":", "").replace(" ", "");
		long start=Long.parseLong(startsDate1);
		long finish=Long.parseLong(finishDate1);
		while(start<=finish) {
			path=directory+Long.toString(start)+extension;
			File f = new File(path); 
			if (f.exists()) {
				return path;
			}
			else {
				start++;
			}
			
			
		}
		return path;
	}

	
		
	
	public static void main(String[] args) {
	
		String path=filePath("2020/10/23/ 15:36:47", "2020/10/23/ 15:36:50", "C:/Users/salamon/Downloads/","_purchase.xml");
		System.out.println(path);
		List<String> list5=readXmlFile(path,  "Trade", "InterfaceNbr");
		System.out.println(list5);
}
	
}