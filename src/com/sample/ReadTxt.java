package com.sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReadTxt {
	
	
	
	
	public static List<String> readTxtFileList(String filePath, String specificWord, int beginIndex, int endIndex) throws IOException {
		List<String> list = new ArrayList<String>();
		File file = new File(filePath);
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		String line;
		while ((line = br.readLine()) != null) {
			if (line.contains(specificWord)) {
				list.add(line.substring(beginIndex, endIndex));
			}
		}

		br.close();
		return list;

	}
	  public static void main(String[] args) throws Exception {

		  
		  List<String> list=readTxtFileList("C:\\Users\\salamon\\Desktop\\New Text Document.txt","work",2,23);
		  System.out.println(list);
		  String aString="aa";
		  System.out.println(aString.isEmpty());
		  
	}

	  }
