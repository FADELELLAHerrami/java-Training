package HashMapPackage;

import java.util.HashMap;

public class HashMapClass {
	public static void main(String[]args) {
		int a=10;
		int b=2;
		int c=53;
		HashMap<String,Integer> happy =new HashMap<String,Integer>();
		happy.put("a", 10);
		happy.put("b", 2);
		happy.put("c", 53);
		System.out.println(happy);// ==> {a=10, b=2, c=53}
		System.out.println(happy.get("c"));// ==> 53
		System.out.println(happy.containsValue(10));// ==> true
		System.out.println(happy.containsValue("errami"));// ==> false
		
		System.out.println(happy.containsKey("z"));// ==> false
		System.out.println(happy.containsKey("a"));// ==> true
		
		System.out.println(happy.size());// ==> 3
		
		happy.replace("a", 10, 20);
		System.out.println(happy);// ==> {a=20, b=2, c=53}
		
		System.out.println(happy.keySet());
		
	}
}
