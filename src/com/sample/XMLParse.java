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
import java.util.Date;  
public class XMLParse
{  
public static void main(String argv[])   
{  
try   
{  

File file = new File("C:/Users/salamon/Downloads/20201012154200_purchase.xml");  

DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  

DocumentBuilder db = dbf.newDocumentBuilder();  
Document doc = db.parse(file);  
doc.getDocumentElement().normalize();  

NodeList nodeList = doc.getElementsByTagName("Trade");  
// nodeList is not iterable, so we are using for loop  
for (int itr = 0; itr < nodeList.getLength(); itr++)   
{  
Node node = nodeList.item(itr);  

if (node.getNodeType() == Node.ELEMENT_NODE)   
{  
Element eElement = (Element) node;  
System.out.println("Student id: "+ eElement.getElementsByTagName("InterfaceNbr").item(0).getTextContent());  
String aString=eElement.getElementsByTagName("InterfaceNbr").item(0).getTextContent();
System.out.println(aString);

}   
}  
}   
catch (Exception e)   
{  
e.printStackTrace();  
}
Date todaysDate = new Date();
DateFormat df = new SimpleDateFormat("yyyy/MM/dd");

try
{
    
    String testDateString = df.format(todaysDate).replace("/", "");
    System.out.println(testDateString);
  
}
catch (Exception ex ){
   System.out.println(ex);
}
}

}  

