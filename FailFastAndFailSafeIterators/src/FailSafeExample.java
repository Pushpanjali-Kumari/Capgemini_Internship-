import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashMap<Integer,String>names=new HashMap<Integer,String>();
		names.put(1,"Rama");
		names.put(2,"Rama1");
		names.put(3,"Ramaji");
		names.put(4,"Ram");
		names.put(5,"Ramaaa");
		try {
			//printing the values of arraylist
			System.out.println("Names in the array list:");
			Iterator<String>itr=names.values().iterator();//fail fast iterator
			while(itr.hasNext()) {
				System.out.println(itr.next());
				System.out.println("adding an element in between the iteration");
				names.put(6,"Krishna");
			}
		}catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}finally {
			System.out.println("finally block");
		}
		
		//using ConcurrentHashMap to avoid ConcurrentModificationException
		ConcurrentHashMap<Integer,String>names1=new ConcurrentHashMap<Integer,String>();
		names1.put(1,"Rama");
		names1.put(2,"Rama1");
		names1.put(3,"Ramaji");
		names1.put(4,"Ram");
		names1.put(5,"Ramaaa");
		try {
			//printing the values of HashMap
			//doesnt not copy means it works on hashmap doesn't clone
			System.out.println("Names in the array list:");
			Iterator<String>itr=names1.values().iterator();//fail safe iterator
			while(itr.hasNext()) {
				System.out.println(itr.next());
				System.out.println("adding an element in between the iteration");
				names1.put(6,"Krishna");
			}
		}catch(Exception e) {
			System.out.println(e);
			//e.printStackTrace();
		}finally {
			System.out.println("finally block");
		}
	 }
	}

