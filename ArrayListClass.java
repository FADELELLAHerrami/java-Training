package ArrayListPackage;

import java.util.ArrayList;

public class ArrayListClass {
	public static void main (String []args) {
		String[] fruits =new String[3];//les tableux ont toujour un nombre d'élément précis
		fruits[0]="Mango";
		fruits[1]="Apple";
		fruits[2]="Strawberry";
		System.out.println(fruits[1]);// ==> Apple
		ArrayList fruitList = new ArrayList();
		fruitList.add("Mango");
		fruitList.add("Apple");
		fruitList.add("Strawberry");
		System.out.println(fruitList);// ==> [Mango, Apple, strawberry]
		fruitList.add("Watermelon");
		fruitList.remove("Strawberry");
		System.out.println(fruitList);// ==> [Mango, Apple, Watermelon]
		
		fruitList.clear();// Supprimer tous les les éléments
		System.out.println(fruitList);// ==> []
		
		System.out.println(fruitList.contains("Rasberry"));// ==> []
	}
}
