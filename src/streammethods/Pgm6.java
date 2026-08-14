package streammethods;

import java.util.Arrays;
import java.util.List;

public class Pgm6 {

	public static void main(String[] args)
	{
		List<String> names = Arrays.asList(
			    "Garima",
			    "Rahul",
			    "Sneha",
			    "Amit",
			    "Priya",
			    "Simran");	
		/*Find names whose length is greater than 5 and print their names in uppercase.

Expected:

GARIMA
RAHUL
SNEHA
SIMRAN

Practice:

filter()
map()
forEach()*/
		names.stream().filter(name->name.length()>5).map(name->name.toUpperCase()).forEach(name->System.out.println(name));
		

	}

}
