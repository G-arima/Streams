package mapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo6 {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Ram","Shyam","Amit","Sita","Sonu","Ravi");
		List<String> finalNamesList=new ArrayList<String>();
		finalNamesList=names.stream().filter(name->name.startsWith("S")).map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println(finalNamesList);

	}

}
