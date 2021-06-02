package com.capgemini;

import java.util.Scanner;

import com.capgemini.service.VegetableManager;

public class VegetableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VegetableManager vm=new VegetableManager();
		Scanner ip= new Scanner(System.in);
		char choice = 'y';
		while (choice == 'y') {
			System.out.println("Enter the choice");
			System.out.println("enter 'c' to create veg list");
			System.out.println("enter 'r' to display veg list");
			System.out.println("enter 'u' to update veg list");
			System.out.println("enter 'd' to delete veg");
			System.out.println("enter 's' to sort veg list");
			
			
			char ch = ip.next().trim().charAt(0);
			switch (ch) {
			case 'c':
				vm.createVegetable();
				break;
	
			case 'r':
				 vm.read();
					break;
			case 'u':
				vm.update();
				break;
			case 'd':
				 vm.delete();
					break;
			case 's':
				vm.sort();
				vm.sortVegetableUsingName();
				vm.sortVegetableUsingVegetableId();
				vm.sortVegetableUsingVegetablePrice();
				break;
			default:
				System.out.println("enter again..");
				break;
			}// switch
			System.out.println("Do you want to continue?");
			choice = ip.next().trim().charAt(0);
		} // while
	}
	}


