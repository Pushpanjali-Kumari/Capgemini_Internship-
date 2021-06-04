package optionalclassexample;

import java.util.Optional;

public class OptionalClassExample {

	public static void main(String[] args) throws StringNotFoundException {
		// TODO Auto-generated method stub
		String[] str = new String[10];
		str[9] = "This is a string";
		Optional<String> emptyOp = Optional.empty();
		System.out.println(emptyOp);
		Optional<String> value = Optional.of(str[9]);
		System.out.println(value);
		System.out.println("Filtered value" + value.filter((s) -> s.equals("This is a string")));
		System.out.println(value.get());
		System.out.println("Hashcode of value=" + value.hashCode());
		System.out.println("IsValue non-empty=" + value.isPresent());
		System.out.println("Nullable in optional class=" + Optional.ofNullable(emptyOp));
		System.out.println("Nullable in optional class=" + Optional.ofNullable(value));
		System.out.println("OrElse in optional class=" + value.orElse("value is not present"));
		System.out.println(
				"OrElse in optional class=" + value.orElseThrow(() -> new StringNotFoundException("string is empty")));
		System.out.println("OrElse in optional class="
				+ emptyOp.orElseThrow(() -> new StringNotFoundException("string is empty")));
	}

}
