package streammethods;

import java.util.Arrays;
import java.util.List;

public class Pgm4 {

	public static void main(String[] args) {
		// ToArrayMethod
		List<String> str=Arrays.asList("A","B","C","1","2","3");
		Object arr[]=str.stream().toArray();
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
