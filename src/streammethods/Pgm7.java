package streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pgm7 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(
			    10, 20, 10, 30, 20, 40, 30, 50, 10
			);
		//Remove duplicate numbers, keep only the numbers greater than 20, and store the result in a List.
		List<Integer> uniqueNumbers=numbers.stream().filter(num->num>20).distinct().collect(Collectors.toList());
System.out.println(uniqueNumbers);
	}

}
