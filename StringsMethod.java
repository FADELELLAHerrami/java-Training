package JavaFast;

public class StringsMethod {
	
	/**
	 * @param args
	 */
	public static void main(String []args) {
		String name="ERRAMI Fadel Ellah";
		System.out.println("name:" + name);//==> name :  ERRAMI Fadel Ellah
		System.out.println(name.length());//==> 18
		System.out.println(name.toUpperCase());// ==> ERRAMI FADEL ELLAH
		System.out.println(name.toLowerCase());// ==> errami fadel ellah
		System.out.println(name.charAt(0));//==> E
		System.out.println(name.substring(0,10));// ==> ERRAMI Fad
		System.out.println(name.hashCode());
	}
}
