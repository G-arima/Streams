package mapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {

	public static void main(String[] args) {
		List<Integer> numbersList=Arrays.asList(2,3,4,5);
		//Scenario is to read every element in source collection, multiply every element by 3 and then store the result into the target collection
		List<Integer> finalResult=new ArrayList<>();
		//without streams
		/*for(int num:numbersList)
		{
			finalResult.add(num*3);
		}*/
		//System.out.println(finalResult);
		//With streams
		finalResult=numbersList.stream().map(num->num*3).collect(Collectors.toList());
		System.out.println(finalResult);
		
	}

}
