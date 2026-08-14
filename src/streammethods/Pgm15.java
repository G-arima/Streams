package streammethods;

import java.util.Arrays;
import java.util.List;

public class Pgm15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(
			    10, 25, 30, 45, 50, 65, 70, 85
			);
		long nums=numbers.stream().filter(num->num>40).count();
		System.out.println(nums);
	}

}
