package streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Pgm22 {

	public static void main(String[] args) {
		// Question18
		List<Integer> numbers = Arrays.asList(
			    10, 15, 20, 25, 30, 35, 40
			);
		Object[] arr=numbers.stream().filter(num->num%2==0).toArray();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("*******************************");
		List<Integer> numbers1 = Arrays.asList(
			    45, 12, 89, 34, 7, 56
			);
		Optional<Integer> max=numbers1.stream().max((val1,val2)->{return val1.compareTo(val2);});
		System.out.println(max.get());
	}

}
