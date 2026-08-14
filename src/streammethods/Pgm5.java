package streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pgm5 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
		/*Using streams:

Find numbers greater than 20
Convert them into their squares
Store the result in a List*/
		List<Integer> resultOfNumbers=numbers.stream().filter(num->num>20).map(num->num*num).collect(Collectors.toList());
		System.out.println(resultOfNumbers);

	}

}
