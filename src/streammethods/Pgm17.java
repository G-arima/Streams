package streammethods;

import java.util.Arrays;
import java.util.List;

public class Pgm17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList(
			    "Garima",
			    "Rahul",
			    "Sneha",
			    "Amit",
			    "Priya",
			    "Simran"
			);
		long cnt=names.stream().filter(name->name.length()>5).count();
System.out.println(cnt);
//To be continued from question 14
	}

}
