import java.util.StringJoiner;

public class StringJoinerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	StringJoiner joinWords=new StringJoiner(",","This ","Java8");
	joinWords.add("is");
	joinWords.add("a");
	joinWords.add("string");
	joinWords.add("joiner");
	joinWords.add("added");
	joinWords.add("in");
	System.out.println(joinWords);

}

}
