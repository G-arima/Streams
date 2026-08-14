package flatmapdemos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo10 {

	public static void main(String[] args) {
		//Given:

			List<List<String>> names = Arrays.asList(
			    Arrays.asList("garima", "rahul"),
			    Arrays.asList("sneha", "amit"),
			    Arrays.asList("priya", "rohit")
			);
			for(List<String> name:names)
			{
				for(String str:name)
				{
					System.out.println(str.toUpperCase());
				}
			}
			System.out.println("*******************************************");
		List<String> nameListResult=	names.stream().flatMap(name->name.stream()).map(name->name.toUpperCase()).collect(Collectors.toList());
System.out.println(nameListResult);
			/*Use:

			flatMap()
			map()

			to produce:

			GARIMA
			RAHUL
			SNEHA
			AMIT
			PRIYA
			ROHIT*/
		
	}

}
