package pres;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

import Dao.IDoa;
import metier.IMetier;

public class Pres {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("config.txt"));
		
		String daoClassName = sc.nextLine();
		Class cdao = Class.forName(daoClassName);
		System.out.println(daoClassName);
		IDoa dao =(IDoa) cdao.newInstance();
		
		String metierClassName = sc.nextLine();
		System.out.println(metierClassName);
		Class cmetier = Class.forName(metierClassName);
		IMetier metier = (IMetier) cmetier.newInstance();
		
		Method m = cmetier.getMethod("setDao", IDoa.class);
		m.invoke(metier, dao);
		
		System.out.println(metier.calcul());
		
		
	}
	
	
}
