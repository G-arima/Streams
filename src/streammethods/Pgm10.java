package streammethods;

import java.util.Arrays;
import java.util.List;

public class Pgm10 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(
			    10, 20, 30, 40, 50, 60, 70, 80, 90
			);
		//Print only the first 5 numbers.
		Object[] num=numbers.stream().toArray();
	    for(int i=0;i<5;i++)
	    {
	    	System.out.println(num[i]);
	    }
		
	}

}
