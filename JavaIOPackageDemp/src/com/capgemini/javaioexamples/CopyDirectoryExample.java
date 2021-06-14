package com.capgemini.javaioexamples;

import java.io.File;

public class CopyDirectoryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//source directory which we want to copy to new directory
		File sourceFolder= new File("D:\\something");
		//destination directory where we want to copy the file
		File destination= new File("D:\\somethingNew");
		//create a method to copy the files from one dir to another
		copyData(sourceFolder,destination);
	}

	private static void copyData(File sourceFolder, File destination) {
		// TODO Auto-generated method stub
		
	}

}
