package mapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo2 {

	public static void main(String[] args) 
	{
		List<String> vehicle=Arrays.asList("car","bus","train","flight","bicycle");
		//Find the length of each vehicle and push it into another collection
		//Without Stream
		List<Integer> result=new ArrayList<>();
		/*for(String typeOfVehicle : vehicle)
		{
			result.add(typeOfVehicle.length());
		}
		System.out.println(result);*/
		//3,3,5,6,7
		//With Stream
		result=vehicle.stream().map(vehicleName->vehicleName.length()).collect(Collectors.toList());
		System.out.println(result);
	}

}
