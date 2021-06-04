package stringapijava8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIExample2 {

	public static void main(String[] args) {
		Stream<Integer> intStream = Stream.of(1, 3, 4, 56, 45, 78, 64);
		intStream.forEachOrdered(val -> System.out.println(val));
		// array as stream
		Stream<Integer> arrStream = Stream.of(new Integer[] { 1, 3, 4, 56, 45, 78, 64 });
		arrStream.forEachOrdered(val -> System.out.println(val));
		// arrayList as stream
		List<Integer> values = new ArrayList<Integer>();
		for (int i = 0; i < 50; i = i + 2) {
			values.add(i);
		}
		// convert above list into stream
		Stream<Integer> arrListToStream = values.stream();
		arrListToStream.forEachOrdered(val -> System.out.println(val));
		System.out.println();
		System.out.println();
		System.out.println("random value list");

		//generate values and iterate
				Stream<Integer> generatedList = Stream.generate(()->(new Random().nextInt(100)));
				generatedList.limit(10).forEach(System.out::println);
				
				System.out.println();
				System.out.println();
				System.out.println("Collecting even numbers from the above generated list");
				List<Integer> values1=new ArrayList<Integer>();
				for(int i=1;i<20;i++) {
					values1.add(i);
				}
				Stream<Integer> generatedList1 = values1.stream();
				List<Integer> evenNumList = generatedList1.filter(i->i%2==0).collect(Collectors.toList());
				System.out.println(evenNumList);
				
				System.out.println();
				System.out.println();
				System.out.println("Collecting odd numbers from the above generated list");
				List<Integer> values2=new ArrayList<Integer>();
				for(int i=1;i<20;i++) {
					values1.add(i);
				}
				Stream<Integer> generatedList2 = values1.stream();
				Integer[] oddNumList = generatedList2.filter(i->i%2!=0).toArray(Integer[]::new);
				for(Integer i:oddNumList)
					System.out.println(i);
				
			}

}
