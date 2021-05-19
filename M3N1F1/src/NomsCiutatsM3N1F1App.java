import java.util.Scanner;

public class NomsCiutatsM3N1F1App {

	public static void main(String[] args) {
		
		// Crea sis variables tipus string buides. 
		String ciutat1 = "";
		String ciutat2 = "";
		String ciutat3 = "";
		String ciutat4 = "";
		String ciutat5 = "";
		String ciutat6 = "";

		// Demana per consola que s’introdueixin els noms.  
		
		Scanner text = new Scanner(System.in);
		System.out.println("Introdueix 6 noms de ciutats (Berlin, Madrid, Lisboa, Barcelona, Roma, Napoles)");
		
		
		// Introdueix els següents noms de ciutats (Berlin, Madrid, Lisboa, Barcelona, Roma, Napoles) per teclat. 
		
		ciutat1 = text.nextLine();	// Cada línia introduïda l'emmagatzemarà a la variable corresponent
		ciutat2 = text.nextLine();
		ciutat3 = text.nextLine();
		ciutat4 = text.nextLine();
		ciutat5 = text.nextLine();
		ciutat6 = text.nextLine();

		
		// Mostra per consola el nom de les 6 ciutats. 
		
		System.out.println("\nLes 6 ciutats introduïdes són:\n" + ciutat1 + ", " + ciutat2 + ", " + ciutat3 + ", " + ciutat4 + ", " + ciutat5 + ", " + ciutat6);
				
	}
}
