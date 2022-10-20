package ExceptionJavaPackage;

public class ExceptionClass {
	public static void main(String[]args) {
		
		String[] pets= {"dog","cat","monkey"};
		try {
			System.out.println(pets[3]);
		}catch(Exception e) {
			System.out.println("An exception happened");
		}
		
		
		
		//System.out.println(pets[3]);// ==> Exception in thread "main"
		//int variable="errami";// ==> Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		
		
		// Null pointer exception java fix
//		String name= null;
//		System.out.println(name.length());// ==> Exception Cannot invoke "String.length()" because "name" is null
		// An exception is an event , which occurs during the execution of a program 
	}
}
