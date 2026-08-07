package mapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {

	public static void main(String[] args) {
		List<String> vehicle=Arrays.asList("car","bus","train","flight","bicycle");
		//Perform operation using map method and convert each element in vehicle collection into capital letter and put it into another collection
		
		List<String> result=new ArrayList<>();
		//Without using the Streams concept
		/*for(String name:vehicle)
		{
			result.add(name.toUpperCase());
		}
		System.out.println("The result is : " +result);*/
		//With streams
		result=vehicle.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println("The result is : " +result);
		
	}

}
