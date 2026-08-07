package filtersdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pgm11 {

	public static void main(String[] args) {
		// Salary greater than 50000
		List<Integer> salary = Arrays.asList(
		        25000,
		        50000,
		        70000,
		        90000,
		        35000);
//70000,90000
		List<Integer> result=salary.stream().filter(sal->sal>50000).collect(Collectors.toList());
		System.out.println("The salary greater than 50000 is below : " +result);
	}

}
