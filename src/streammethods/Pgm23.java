package streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Pgm23 {

	public static void main(String[] args) {
		//Question15 
				/*List<Integer> numbers = Arrays.asList(
					    2, 3, 4, 5
					);
				//Find the product of all numbers using streams.
				//120
				/// 
				 */
		List<Integer> numbers = Arrays.asList(
			    2, 3, 4, 5
			);
		Optional<Integer> product=numbers.stream().reduce((val1,val2)->{return (val1*val2);});
		System.out.println(product.get());
	}

}
