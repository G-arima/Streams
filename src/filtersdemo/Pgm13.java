package filtersdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pgm13 {

	public static void main(String[] args) {
		//Multiples of 5
		List<Integer> numbers = Arrays.asList(
        7,
        10,
        15,
        18,
        25,
        31);
		List<Integer> result=numbers.stream().filter(num->num%5==0).collect(Collectors.toList());
		System.out.println("The output is : " +result);
	}

}
