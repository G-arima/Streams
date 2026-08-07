package filtersdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pgm6 {

	public static void main(String[] args) {
		// Print only the odd numbers
		List<Integer> numbers = Arrays.asList(5,8,11,14,17,20);
		List<Integer> oddNumbersList=new ArrayList();
		oddNumbersList=numbers.stream().filter(num->num%2!=0).collect(Collectors.toList());
		System.out.println(oddNumbersList);
		
		
		

	}

}
