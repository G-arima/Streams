package filtersdemo;

import java.util.Arrays;
import java.util.List;

public class Pgm8 {

	public static void main(String[] args) {
		// Numbers Less Than 20
		List<Integer> numbers = Arrays.asList(12,65,89,20,45,18,5);
		numbers.stream().filter(num->num<20).forEach(num->System.out.println(num));
		//12,18,5

	}

}
