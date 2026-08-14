package streammethods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Pgm1 {
//distinct()->used to give unique data as output,count(),limit()
	public static void main(String[] args) {
		List<String> vehicleList=new ArrayList<>();
		vehicleList.add("bus");
		vehicleList.add("train");
		vehicleList.add("car");
		vehicleList.add("bus");
		vehicleList.add("activa");
		vehicleList.add("bus");
		vehicleList.add("train");
		vehicleList.add("car");
		vehicleList.add("truck");
		//distinct method
		//Using terminal operation collect
		/*List<String> distinctVehicleList=vehicleList.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctVehicleList);*/
		//Using terminal operation stream
		vehicleList.stream().distinct().forEach(distinctVehicle->System.out.println(distinctVehicle));
		//count method
		System.out.println("Count Method");
		long count=vehicleList.stream().distinct().count();
		System.out.println(count);
		System.out.println("Limit Method");
		//Limit is again a non terminal method, because it is limiting the input as per the condition and not returning anything
		List<String> limitedVehiclesList=vehicleList.stream().limit(3).collect(Collectors.toList());
		System.out.println(limitedVehiclesList);
		System.out.println("*******forEachMethod***********");
		vehicleList.stream().limit(3).forEach(limitedValue->System.out.println(limitedValue));
		
		
		
		

	}

}
