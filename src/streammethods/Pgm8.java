package streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pgm8 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList(
			    "Java",
			    "Python",
			    "Java",
			    "Selenium",
			    "Python",
			    "Java",
			    "Cucumber"
			);
		//Remove duplicate names and print the unique names.
		List<String> resultNames=names.stream().distinct().collect(Collectors.toList());
		System.out.println(resultNames);

	}

}
