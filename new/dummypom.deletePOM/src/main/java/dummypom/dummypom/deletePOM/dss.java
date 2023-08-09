package dummypom.dummypom.deletePOM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class dss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("myList");
		 List<String> myList = new ArrayList<>();
	        myList.add("mango");
	        myList.add("orange");
	        myList.add("Grapes");
	        System.out.println(myList);
	        for (String fruit : myList)
	            System.out.println(fruit);
	        
	        Map<Integer, String> myMap = new HashMap<>();
	        myMap.put(100, "Amit");
	        myMap.put(101, "Vijay");
	        myMap.put(102, "Rahul");
	        System.out.println(myMap);
	        for (Map.Entry<Integer, String> entry : myMap.entrySet()) {
	            System.out.println(entry.getKey() + " " + entry.getValue());
	        }

	}

}
