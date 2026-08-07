package filtersdemo;

import java.util.Arrays;
import java.util.List;

public class Pgm14 {

	public static void main(String[] args) {
		// Find Empty Strings
		List<String> list = Arrays.asList(
		        "Java",
		        "",
		        "Selenium",
		        "",
		        "Streams");
		list.stream().filter(str->str.isEmpty()).forEach(System.out::println);

	}

}
