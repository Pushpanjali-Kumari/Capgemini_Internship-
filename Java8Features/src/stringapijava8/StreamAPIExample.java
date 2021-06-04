package stringapijava8;

import java.util.ArrayList;
import java.util.List;

public class StreamAPIExample {

	public static List<String> getPlaces() {
		// TODO Auto-generated method stub
		List<String>countriesPlaces= new ArrayList<String>();
		//list of countries
		countriesPlaces.add("Nepal,Kathmandu");
		countriesPlaces.add("Orissa,Puri");
		countriesPlaces.add("Nepal,Pokhara");
		countriesPlaces.add("Kolkata,NewTown");
		countriesPlaces.add("USA,New york");
		countriesPlaces.add("Africa,Nigeria");
		
		return countriesPlaces;
	}
	public static void main(String[] args) {
		List<String>area= getPlaces();
		System.out.println("places from Nepal:");
		area
		.stream()
		.filter((p)->p.startsWith("Nepal"))
		.map((p)->p.toUpperCase())
		.sorted()
		.forEach((p)->System.out.println(p));
		
		long countPlaces=area.stream().filter((s)->s.endsWith("a")).count();
		System.out.println(countPlaces);
		
	
	}
}
