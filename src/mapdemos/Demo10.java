package mapdemos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo10 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList(
			    "garima",
			    "rahul",
			    "sneha",
			    "amit",
			    "priya"
			);
		/*List<Character> result=names.stream().map(name->name.toUpperCase()).map(name->name.length()).map(name->name.toString().charAt(0)).collect(Collectors.toList());
System.out.println(result);*/
	List<String> finalResult=	names.stream().map(name->name.toUpperCase()+"-"+name.length()+"-"+name.charAt(0)).collect(Collectors.toList());
	System.out.println(finalResult);
	}

}
