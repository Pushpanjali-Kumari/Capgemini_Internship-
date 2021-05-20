package com.capgemini.checkexceptionexample;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// here exception is found
		try {
			//code that raised exception will be included inside try block
			int result =10/0;
		}catch(Exception e) {
			e.printStackTrace();
			//will catch the excep and handles the excep
			System.out.println("=====================");
		System.out.println("Aritmetic Exception="+e.getMessage());
		}finally {
			///will execute  in both the cases either while excep or no excep
			//file close,db close,scanner close,etc
			System.out.println("this is finally block that executes in both case");
	}
}

	public void divide() {
		// TODO Auto-generated method stub
		
	}

}
