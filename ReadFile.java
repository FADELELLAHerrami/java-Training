package ReadFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class ReadFile {
	public static void main(String [] args) throws IOException {
		// http://textfiles.com/100/captmidn.txt
		File file =new File("C:/Users/admin/Desktop/captmidn.txt");
		Scanner scan =new Scanner(file);
		
		String contentFile="";
		
//		while(scan.hasNextLine()) {
//			System.out.println(scan.nextLine());
//		}==>afficher le contenu de fichier
		while(scan.hasNextLine()) {
			contentFile=contentFile.concat(scan.nextLine()+"\n");
		}// ==> copie le contenu de file dans contentFile
		System.out.println(contentFile);
		FileWriter write=new FileWriter("C:/Users/admin/Desktop/newFile.txt");//==> Créer un fichier new newFile
		write.write(contentFile);
		write.close();
		System.out.println("errami");
		System.out.println(write);
		System.out.println("errami");
		
	}
}
