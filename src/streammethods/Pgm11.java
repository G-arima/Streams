package streammethods;

import java.util.Arrays;
import java.util.List;

public class Pgm11 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(
			    10, 20, 10, 30, 40, 20, 50, 60, 30, 70
			);
		//Find the first 3 unique numbers greater than 20 and print them.
		//30,40,50
		numbers.stream().filter(num->num>20).distinct().limit(3).forEach(num->System.out.println(num));

	}

}
