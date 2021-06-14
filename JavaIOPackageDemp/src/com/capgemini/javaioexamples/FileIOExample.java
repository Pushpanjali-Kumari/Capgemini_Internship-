package com.capgemini.javaioexamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileOutputStream fout= new FileOutputStream("D:\\sample\\fileone.txt");
	String str="MY name is Pushpanjali";
	byte b[]=str.getBytes();
	fout.write(b);
	
	
	fout.close();
	System.out.println("file created successfully");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
// reading data from the above file
try {
	FileInputStream finput= new FileInputStream("D:\\sample\\filetwo.txt");
	int ch;
	while((ch=finput.read())!=-1) {
		System.out.println((char)ch);
	}
}catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
}
	}

}
