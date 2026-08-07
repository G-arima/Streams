package filtersdemo;

import java.util.Arrays;
import java.util.List;

public class Pgm7 {

	public static void main(String[] args) {
		// Numbers greater than 50
		List<Integer> numbers = Arrays.asList(12,65,89,20,45,99);
		numbers.stream().filter(num->num>50).forEach(num->System.out.println(num));

	}

}
