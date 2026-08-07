package mapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo5 {

	public static void main(String[] args) {
		List<Integer> intList=Arrays.asList(10,15,20,25,30,35);
		List<Integer> finalResult=new ArrayList<Integer>();
		finalResult=intList.stream().filter(num->num>20).map(num->num*2).collect(Collectors.toList());
		System.out.println(finalResult);
		
	}

}
