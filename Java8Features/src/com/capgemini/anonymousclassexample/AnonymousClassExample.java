package com.capgemini.anonymousclassexample;

public class AnonymousClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Shape() {
			int height = 20;

			@Override
			void area() {
				// TODO Auto-generated method stub
				System.out.println("shape area=" + (length * height));
			}

			@Override
			void perimeter() {
				// TODO Auto-generated method stub
				System.out.println("shape perimeter");
				System.out.println("length=" + length);
			}
		};
		s.area();
		s.perimeter();
		Vehicle v = new Vehicle() {
			int cost = 3200000;

			@Override
			public void costOfVehicle() {
				// TODO Auto-generated method stub
				System.out.println("cost of vehicle=" + cost);
			}

			@Override
			public void TypeOfVehicle() {
				// TODO Auto-generated method stub
				System.out.println("type of vehicle");
			}

		};
		v.costOfVehicle();
		v.TypeOfVehicle();
	}
}