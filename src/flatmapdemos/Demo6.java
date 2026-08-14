package flatmapdemos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo6 {

	public static void main(String[] args) {
		List<List<Integer>> numbers = Arrays.asList(
			    Arrays.asList(1, 2, 3),
			    Arrays.asList(4, 5),
			    Arrays.asList(6, 7)
			);
		
		for(List<Integer> l1:numbers)
		{
			for(int num:l1)
			{
				System.out.println(num);
			}
		}

			/*Use flatMap() to produce:

			[1, 2, 3, 4, 5, 6, 7]*/
		
		List<Integer> result=numbers.stream().flatMap(nums->nums.stream()).collect(Collectors.toList());
		System.out.println(result);
	}

}
