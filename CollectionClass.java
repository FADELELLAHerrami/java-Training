/*
 En java ,on trouve trois types des collections qui l'emportent dans la bibiothéque java.util:
 (import java.util.*;) 
 et les collections sont des objets qui regroupeent et gérent plusieurs objets
 # LIST : sont des tableaux a extensibles à volonté
 	1.ArrayList : (import java.util.ArrayList;)
 		==>pas de limite de taille // Possibilité de stocker tout les types de donnée
 		==> Création d'un arrayList : 
 		 	ArrayList ArrayListName = new ArrayList();
 		 ==>Ajouetr un élément dans un ArrayList
 		 	ArrayListName.add(value);
 		 ==>La taille d'une liste
 		 	System.out.println(ArrayListName.size());
 		 ==> Récupération d'une valeur d'un arrayList
 		   	System.out.println(ArrayListName.get(IndiceValeur))
 		 ==> Ajouetr une valeur à la liste en utilisant sa clé
 		 	ArrayListName.add(Clé ,valeur);
 		 ==> supprimer un élément par sa clé dans un ArrayList
 		 	ArrayListName.remove(clé);//La clé doit être de type primitive (int)
 		 ==>Supprimer une valeur dans un ArrayList
 		 	ArrayListName.remove(Valeur);//La valeur doit être de type objet
 		 ==> Supprimer tout les élément d'un ArrayList
 		 	ArrayListName.removeAll();
 		 ==> Remplacer un objet par un autre en utulisant son indice
 		 	ArrayListName.set(indice,la nouvelle valeur);
 		 ==> Checker si un ArrayList est vide ou nom
 		 	ArrayList.isEmpty();//cette foncionne retourne true si ArrayList est vide et false si non
 		 ==> checker si un objet éxiste
 		 	ArrayList.contains(objet);// la fonction retourne true si l'objet éxiste et false si nom
 		 ==> L'interface Iterator : 
 		 	Cette inteface nous permerr de parcourir une collection 
 		 	hesNext() : retourne true si l'itérateur contient un autre élément
 		 	next() : retourne l'élément suivant de l'térateur 
 		 	remove() : supprime l'élément par next .
 		 	ListIterator <Integer> li= ArrayListName.ListIterator(); //Déclaration d'un iterator
  	2.LinkedList ( Liste chainée )
  		LinkedList est pareil au ArrayList sauf que en LinkedList on peut ajouter une valeur à la fin ou au début de la
  		liste (addFirst() et et addLast() est exactement comme add()) et aussi on peut parcourir linkedList par Iterator
 		==> Convertir un tableau en une liste 
 			List<Integer> li=Arrays.asList(NomTableau);
 		==> ou sans création de tableau
 			List<Integer> li = Arrays.asList(2,4,77,8,6,55,20,7);
 		==> ou
 			List<Integer> li = List.of(1,4,78,52,974,42,01,48,74,65);
 	3.Vector 
 # SET : Collection qui n'accepte pas les doublant
 		==> Caractéristiques :
 			* Utilisation d'une table de hashage
 			* Possibilité de la parcourit avec un objet Iterator
 			* Possibilté d'extraire dans cette objet un tabkeau d'objet 
  	1.HashSet
 	2.LinkedHashSet
 	3.TreeSet
 # MAP : collection qui exige une clé pour chaque élément
  	1.HashTable : * Fonctionne avec un couple (clé ,valeur)
  				  * Elle utilise une table de hashage 
  				  * Elle n'accepte pas la valeur null
  				  * La clé doit être unique
  				  * Pour le parcourir on utilise l'objet Enumeration
  			==>Tester si une Hashtable est vide
  				HashTableNom.isEmpty();// Retourne true si Hashtable est vide est false si non
  			==>Tester si on une valeur éxiste : 
  				HashTableNom.contains(ValeurAchercher);
  			==>Tester si une clé éxiste 
  				HashtableNom.containsKey();// retourne true si la clé existe , et false si nom
  			==>retourne les éléments d'une Hashtable
  				HashtableNom.elemants();
  			==>retourne les clées d'une Hashtable
  				HashtableNom.Keys();
 	2.HashMap// La difference entre hashtable() et hashMap() est que la première n'accepte pas la valeur null et la deuximè accepte 
 				la valeur null, et pour parcourir hashMap() ,on utilise l'objet Set
 	3.TreeMap
 	4.WaekHashMap
#Queue : collection qui gére une file d'attente (FIFO : first in first out)
 
 
 
  */
package CollectionPackage;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeSet;
import java.util.Hashtable;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Set;

public class CollectionClass {
	public static void main(String [] args) {
		// Exemple ArrayList
		ArrayList list =new ArrayList();
		list.add(1);
		list.add("Ahmed");
		list.add('h');
		//list.add(null);
		list.add(1.25);
		System.out.println(list);// ==> [1, Ahmed, h, null, 1.25]
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		for(Object elt:list) {
			System.out.print(elt +" ");// 1 Ahmed h 1.25 Integer
		}
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getClass().getSimpleName());
		}// On constate que le type des valeurs d'un ArrayList sont des objets
		
		int []table= {1,2,3,5,8,4,6,55,84,85,25};
		for(int number : table) {
			System.out.print(number + " ");// ==> 1 2 3 5 8 4 6 55 84 85 25 
		}
		
//		Exercice 
		/*
		 "The beauty of Quran is that you cannot change its, but it's message can change you."7

		1) demande à l’utilisateur de remplir une liste avec des nombres 
		   positifs de son choix, il s’arrête à la saisie de zéro
		2) demande à l’utilisateur de saisir une valeur à supprimer de la liste 
		   supprime la première occurrence de cette valeur de la liste 
		3) affiche la nouvelle liste (après suppression de la valeur
		   demandée)
		 */
		// Question 1 : 
		int A;
		ArrayList listNbr = new ArrayList();
		System.out.println("Veuillez saisir un nombre supérieure stricte de 0");
		Scanner sc =new Scanner(System.in);
		A = sc.nextInt();
		while(A!=0) {
			if(A>0) {
				System.out.println("Veuillez saisir un autre nombre supérieure stricte de 0");
				listNbr.add(A);
				A = sc.nextInt();
			}else if(A==0){
				break;
			}
			else
				System.out.println("Il faut saisir un nombre positif");
				System.out.println("Veuillez saisir un autre nombre supérieure stricte de 0");
				A = sc.nextInt();
		}
		for(Object alt:listNbr) {
			System.out.println(alt +" ");
		}
		// Question 2 : 
		
		int valeurAsupprimer;
		System.out.println("Saisir une valeur à supprimer :");
		valeurAsupprimer=sc.nextInt();
		listNbr.remove((Object)valeurAsupprimer);
		// Question 3 : 
		for(Object alt:listNbr) {
			System.out.println(alt +" ");
		}
		
		// Exemple HashSet
		// Declaration
		HashSet hs =new HashSet();
		hs.add("Bonjour");
		hs.add("y");
		hs.add(4);
		hs.add(1.254);
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() +" ");// ==> 4 Bonjour y 1.254
		}
		// HashSet utilise une valeur de hashage (difficile à prédire) calculée pour chaque élément
		// Cette valeur de hashaege détermine l'indice de l'élément dans un tableau conteneur 
		// Ainsi l'ordre des élément insérésn'est pas naturellement pas conservé
		// Ceci permet d'accéder à un élément avec une compléxité O(1) en temps (mais reste coûteaux en espace)
		// Pour avoir un affichage ordonné selon l'ordre d'insertion on utilise LinkedHashSet()
		//Exemple de conversion d'une SET à un tableau
		Object [] obj = hs.toArray();
		for(Object alt : obj) {
			System.out.print(alt +" ");// ==> 4 Bonjour y 1.254 
		}
		// TreeSet
		//Caractéristiques
		//Possibilité de le parcourir avec un objet iterator
		// Les éléments sont triées automatiquement
//		Exemple :
		
		TreeSet ts = new TreeSet();
		ts.add(1);
		ts.add(1);
		ts.add(2);
		ts.add(16);
		ts.add(20);
		Iterator ite = ts.iterator();
		System.out.println("");
		System.out.println("_____________________________________________");
		while(ite.hasNext()) {
			System.out.print(ite.next() + " ");
		}// ==> 1 2 16 20 
		System.out.print("        La taile de cette HashSet : "+ts.size());// 4
		// On remarque que Set n'accepte pas les doublants ,et TreeSet n'accepte qu'un seul type pour ses valeurs 
		
		
		// Exemple des HashTable()
		//Exemple :
		System.out.println("");
		System.out.println("===========================================================================");
		//Déclaration
		Hashtable ht=new Hashtable();
		//Ajout des éléments
		ht.put(1,"Pascal");
		ht.put(2,"C");
		ht.put(3,"C++");
		ht.put(4,"Java");
		Enumeration e = ht.elements();
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement() + " ");
		}
		//Exemple de HashMap()
		System.out.println("");
		System.out.println("=============================================================================");
		
		HashMap hm=new HashMap();
		hm.put(1,"8");
		hm.put(2,9);
		hm.put(3,"Ahmed");
		hm.put(4,null);
		Set s =hm.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() +" ");
		}// ==> 1=8 2=9 3=Ahmed 4=null 
		
		System.out.println("");
		System.out.println("===================================================================");
		String a="xyz";
		String b="xyz";
		//System.out.println(a==b);
		if(a.equals(b)) {
			System.out.println("true");
		}else System.out.println("false");
		
	}
	
	
	
}
