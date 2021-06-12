
package com.sample;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlReader1 {
	
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
	
	public static void main(String[] args) {
		
		String date="";
		String actAtFund="";
		String fundNbr="";
		String query="";
		String path="C:\\Users\\salamon\\Downloads\\position_share_balance.xml";
		List<String> dates=readXmlFile(path,  "PositionBalance", "BalanceDate");
		List<String> actAtFunds=readXmlFile(path,  "PositionBalance", "AcctAtFund");
		List<String> fundNbrs=readXmlFile(path,  "PositionBalance", "FundNbr");
		
		for (int i = 0; i < dates.size(); i++) {
			date=dates.get(i);
			actAtFund=actAtFunds.get(i);
			fundNbr=fundNbrs.get(i);
			query="SELECT COUNT(*) FROM POS_SHARE_BAL PSB WHERE PSB.BALANCE_DT = TO_DATE("+date+") "
					+ "AND PSB.SENT_TO_PLATF = 'N' "
					+ "AND PSB.POSITION_ID IN (SELECT P.POSITION_ID FROM POSITION P, FUN F WHERE P.FUND_ID = F.FUND_ID AND P.FIN =" +actAtFund+""
					+ "AND F.CTC_FUND =" +fundNbr+")";
			//just control
					 System.out.println(query);
			
			
		}
		
		
		
	
		

	}

}
