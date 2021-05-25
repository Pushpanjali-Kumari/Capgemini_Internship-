package com.capgemini.collectionsexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentList {
public static void main(String[] args) {
		
		//adding Student objects in to hash set
		ArrayList<Student> stdList = new ArrayList<Student>();
		Student  std;
			Scanner sc= new Scanner(System.in);
			for(int i=0;i<3;i++) {
				System.out.println("Enter the details of Student-");
				System.out.println("Enter the Student id-");
				int id = sc.nextInt();
				System.out.println("Enter the Student Name-");
				String name = sc.next();
				stdList.add(new Student(id,name));
			}
			
			
			Iterator<Student> stuItr = stdList.iterator();
			System.out.println("Student ArrayList values using Iterator!!");
			while(stuItr.hasNext()) {
				Student st = stuItr.next();
				System.out.println(st.getStdName() + " \t\t\t " + st.getStdId());
				System.out.println();
			}
			
			Iterator<Student> stuItr2 = stdList.iterator();
			System.out.println("Enter the Student id to remove=");
			int id = sc.nextInt();
			//int index =0;
			while(stuItr2.hasNext()) {
				Student st = stuItr2.next();
				if(st.getStdId()==id) {
					stuItr2.remove();
				}
			}
			
			//Iterator<Student> stuItr1 = stdList.iterator();
			System.out.println("Enter the Student id to update=");
			int uid = sc.nextInt();
			//using forloop
			System.out.println("arrayList values using for loop=");
			for(int i=0;i<stdList.size();i++) {
				if(stdList.get(i).getStdId()==uid) {
					stdList.get(i).setStdName("Ramji");
				}
			}
			
			
			
			
			Iterator<Student> newstuItr = stdList.iterator();
			System.out.println("Student ArrayList values  using Iterator=");
			while(newstuItr.hasNext()) {
				Student st = newstuItr.next();
				System.out.println(st.getStdName() + " \t\t\t " + st.getStdId());
				System.out.println();
			}
			
	}
}