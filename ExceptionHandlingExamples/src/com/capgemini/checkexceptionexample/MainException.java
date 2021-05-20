package com.capgemini.checkexceptionexample;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MainException{
	
public static void main(String[]args) throws IOException, FileNotFoundException {
	ReadingAFile raf= new ReadingAFile();
	raf.readFile();
	Division div=new Division();
	div.divide();
		}
}
