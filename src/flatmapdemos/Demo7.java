package flatmapdemos;

import java.util.Arrays;
import java.util.List;

public class Demo7 {

	public static void main(String[] args) {
		List<List<String>> names = Arrays.asList(
			    Arrays.asList("Garima", "Rahul"),
			    Arrays.asList("Sneha", "Amit"),
			    Arrays.asList("Priya", "Rohit")
			);
		for(List<String> list1:names)
		{
			for(String name:list1)
			{
				if(name.length()>5)
				{
					System.out.println(name);
				}
			}
		}

			//Use flatMap() and filter() to print only names whose length is greater than 5.
names.stream().flatMap(name->name.stream()).filter(name->name.length()>5).forEach(name->System.out.println(name));
	}

}
