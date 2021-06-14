package com.capgemini.javaioexamples;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedIOExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fout = null;
		FileInputStream fin=null;
		BufferedInputStream bin=null;
		try {
		
	fout= new FileOutputStream("D:\\sample\\filetwo.txt");
		BufferedOutputStream bouput=new BufferedOutputStream(fout);
		String newstr="Hello! how are you? Hope you are well..";
		byte b[]= newstr.getBytes();
		bouput.write(b);
		System.out.println("Successfully return data from buffer to file");
		bouput.flush();
			bouput.close();
		}catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			try {
				fout.close();
			}catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}//finally close
		try {
			fin= new FileInputStream("D:\\sample\\filetwo.txt");
			bin= new BufferedInputStream(fin);
			int ch;
			while((ch=bin.read())!=-1) {
				System.out.println((char)ch);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				bin.close();
				fin.close();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		}
			
	}

}
