package flatmapdemos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo8 {

	public static void main(String[] args) {
		List<List<Integer>> numbers = Arrays.asList(
			    Arrays.asList(1, 2, 3),
			    Arrays.asList(4, 5, 6),
			    Arrays.asList(7, 8, 9)
			);
		for(List<Integer> list1:numbers)
		{
			for(int num:list1)
			{
				if(num%2==0)
				{
					System.out.println(num);
				}
			}
		}
		System.out.println("*******************");
	List<Integer> numsListResult =	numbers.stream().flatMap(nums->nums.stream().filter(evenNums->evenNums%2==0)).collect(Collectors.toList());
System.out.println(numsListResult);
	}

}
