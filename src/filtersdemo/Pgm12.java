package filtersdemo;

import java.util.Arrays;
import java.util.List;

public class Pgm12 {

	public static void main(String[] args) {
		//Find all the positive numbers
		List<Integer> list = Arrays.asList(
		        -5,
		        10,
		        -8,
		        20,
		        30,
		        -2);
		//10,20,30
		list.stream().filter(num->num>0).forEach(System.out::println);

	}

}
