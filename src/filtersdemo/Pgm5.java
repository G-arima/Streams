package filtersdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pgm5 {

	public static void main(String[] args) {
		//Print only the even numbers
		List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35);
		List<Integer> evenNumbersList=new ArrayList();
		evenNumbersList=numbers.stream().filter(num->num%2==0).collect(Collectors.toList());
System.out.println(evenNumbersList);
	}

}
