package predicateinarraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInStudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> stdList = new ArrayList<Student>();
		stdList.add(new Student(123, "Rama"));
		stdList.add(new Student(124, "Ram"));
		stdList.add(new Student(122, "Krishna"));

		List namesStartsWithR = filterByName(stdList,(Student s) -> s.getStdName().startsWith("R"));
		System.out.println(namesStartsWithR);
	}

	private static List filterByName(List<Student> stdList, Predicate<Student>pred) {
		// TODO Auto-generated method stub
		List<Student> resultList = new ArrayList<Student>();
		for (Student s : stdList) {
			if (pred.test(s)) {
				resultList.add(s);
			}
		}
		return resultList;
	}

}
