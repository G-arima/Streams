package streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pgm12 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList(
			    "Java",
			    "Python",
			    "Java",
			    "Selenium",
			    "Cucumber",
			    "Python",
			    "TestNG",
			    "Maven"
			);
		//Find the first 4 unique technologies and store them in a List.
		//Java,Python,Selenium,Cucumber
		List<String> distinctTechnologies=names.stream().distinct().limit(4).collect(Collectors.toList());
System.out.println(distinctTechnologies);
	}

}
