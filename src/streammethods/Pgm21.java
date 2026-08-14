package streammethods;

import java.util.Arrays;
import java.util.List;

public class Pgm21 {

	public static void main(String[] args) {
		//Question19
		List<Integer> numbers = Arrays.asList(
			    10, 20, 10, 30, 20, 40, 30, 50
			);
		Object[] arr=numbers.stream().distinct().toArray();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
