package com.sample;


import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;

public class WriteTxtFile {
	public static void writeTxtFile(String content,String path) {
		
		 byte data[] = content.getBytes();
		    Path p = Paths.get(path);

		    try (OutputStream out = new BufferedOutputStream(
		      Files.newOutputStream(p, CREATE, APPEND))) {
		      out.write(data, 0, data.length);
		      System.out.println("Successfully created and wrote to the file.");
		    } catch (IOException x) {
		      System.err.println(x);
		    }
		  }
	
public static void main(String[] args) {
	String id="01088000115";
	if(id.startsWith("0")) {
		Long tId=Long.parseLong(id);
		id=Long.toString(tId+1);
		id="0"+id;
		System.out.println(id);
	}else {
		Long tId=Long.parseLong(id);
		id=Long.toString(tId+1);
		System.out.println(id);
	}
	
	
	String content= "1TRANS181227DTCC070Y2K MFN CONV. BROKER0001  10210207000       0000000652    CDT 12/27/18   10:17   \r\n" + 
			"N00013105111111111111116201801203070CONVERSION BROKER                                               \r\n" + 
			"B520104438888"+id+"292192120110443000073          10443000084          13              \r\n" + 
			"B520204438888             12272018211     ";
		writeTxtFile(content, "C:/Users/salamon/Desktop/SIAC2084.018_b52_transfer");

	
			  }
			
	}

