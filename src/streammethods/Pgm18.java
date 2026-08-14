package streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Pgm18 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(
			    10, 20, 30, 40, 50
			);
		Optional<Integer> addition=numbers.stream().reduce((value,combinedValue)->{return combinedValue+value;});
System.out.println(addition.get());
	}

}
