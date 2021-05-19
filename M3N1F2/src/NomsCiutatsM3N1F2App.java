import java.util.ArrayList;		// Per crear l'array
import java.util.Collections;	// Per ordenar l'array per ordre alfabètic
// Podem substituir les 2 línies anteriors per una sola, on l'asterisc inclou tots els paquets de java.util: import java.util.*;

public class NomsCiutatsM3N1F2App {

	public static void main(String[] args) {
		
		// Partim de les 6 ciutats de l'exercici anterior, emmagatzemades en variables 
		String ciutat1 = "Berlin";
		String ciutat2 = "Madrid";
		String ciutat3 = "Lisboa";
		String ciutat4 = "Barcelona";
		String ciutat5 = "Roma";
		String ciutat6 = "Napoles";

		
		// Emmagatzamem les variables en un array (arrayCiutats)
		
		ArrayList<String> arrayCiutats = new ArrayList<String>(); 
		
		arrayCiutats.add(ciutat1);	// Afegim les ciutats a l'array
		arrayCiutats.add(ciutat2);
		arrayCiutats.add(ciutat3);
		arrayCiutats.add(ciutat4);
		arrayCiutats.add(ciutat5);
		arrayCiutats.add(ciutat6);
		
		// Mostrar per consola el nom de les ciutats ordenades per ordre alfabètic
		
		Collections.sort(arrayCiutats);		// Ordenem l'arrayCiutats per ordre alfabètic

		System.out.println("Ciutats per ordre alfabètic:");

		for (String ciutats : arrayCiutats) {		// Imprimim les ciutats contingudes a l'array, una a cada línia
		      System.out.println(ciutats);
		    }
	
	}

}
