package streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Pgm19 {

	public static void main(String[] args) {
		//Question15 
		/*List<Integer> numbers = Arrays.asList(
			    2, 3, 4, 5
			);
		//Find the product of all numbers using streams.
		//120
		/// 
		Object[] arr=numbers.stream().toArray();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i*(i+1)]);
		}*/
		List<Integer> numbers = Arrays.asList(
			    10, 20, 10, 30, 40, 20, 50, 60, 30, 70, 80, 40, 90
			);
		/*Keep numbers greater than 20, remove duplicates, take only the first 5 numbers, and find the maximum number.

		Expected output:

		70*/
		Optional<Integer> max=numbers.stream().filter(num->num>20).distinct().limit(5).max((val1,val2)->{return val1.compareTo(val2);});
System.out.println(max.get());
	}

}
