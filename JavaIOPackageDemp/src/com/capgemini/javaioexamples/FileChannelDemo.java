package com.capgemini.javaioexamples;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
//nio= non blocking io
public class FileChannelDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.out.println("strating file read....");
RandomAccessFile raFile=null;
try {
	 raFile=new RandomAccessFile("src/dta.txt","rw");
	FileChannel fCh=raFile.getChannel();
	System.out.println("created file channel");
	// creating bytebuffer with capacity 48 bytes
	ByteBuffer buffer= ByteBuffer.allocate(48);
	//reading data from the byte buffer
	int bytesRead=fCh.read(buffer);
	//iterating through the bytes
	while(bytesRead!=-1) {
		System.out.println("\n Read"+bytesRead);
		buffer.flip();
		
		while(buffer.hasRemaining()) {
			System.out.print((char)buffer.get());
		}
		buffer.clear();
		bytesRead=fCh.read(buffer);
	}
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}finally {
	raFile.close();
}
	}

}
