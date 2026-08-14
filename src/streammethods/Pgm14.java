package streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Pgm14 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(
			    45, 12, 89, 34, 7, 56, 23
			);
		Optional<Integer> max=numbers.stream().max((val1,val2)->{return val1.compareTo(val2);});
System.out.println(max.get());
	}

}
