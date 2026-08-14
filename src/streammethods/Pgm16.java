package streammethods;

import java.util.Arrays;
import java.util.List;

public class Pgm16 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(
			    10, 20, 10, 30, 20, 40, 50, 30, 60
			);
		//10,20,30,40,50,60
		long cnt=numbers.stream().distinct().count();
		System.out.println(cnt);

	}

}
