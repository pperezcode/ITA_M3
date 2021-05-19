import java.util.ArrayList;
import java.util.Collections;

public class NomsCiutatsM3N1F3App {

	public static void main(String[] args) {
		
		// Partim de les 6 ciutats de l'exercici M3N1F1, emmagatzemades en variables 
		
		String ciutat1 = "Berlin";
		String ciutat2 = "Madrid";
		String ciutat3 = "Lisboa";
		String ciutat4 = "Barcelona";
		String ciutat5 = "Roma";
		String ciutat6 = "Napoles";
		
		
		// Cambiem les vocals “a” dels noms de les ciutats pel número 4, i guardem els noms modificats en un nou array.
				
		ArrayList<String> arrayCiutatModificades = new ArrayList<String>();		// Creem l'array
		
		arrayCiutatModificades.add(ciutat1.replace('a', '4'));	// Afegim les ciutats a l'array amb la modificació de 'a' per '4'
		arrayCiutatModificades.add(ciutat2.replace('a', '4'));
		arrayCiutatModificades.add(ciutat3.replace('a', '4'));
		arrayCiutatModificades.add(ciutat4.replace('a', '4'));
		arrayCiutatModificades.add(ciutat5.replace('a', '4'));
		arrayCiutatModificades.add(ciutat6.replace('a', '4'));	
		
		// Mostrar per consola l’array modificat i ordenat per ordre alfabètic.
		
		Collections.sort(arrayCiutatModificades);		// Ordenem l'arrayCiutats per ordre alfabètic
		
		System.out.println("Ciutats modificades per ordre alfabètic:");

		for (String ciutats : arrayCiutatModificades) {		// Imprimim les ciutats contingudes a l'array, una a cada línia
		      System.out.println(ciutats);
		}

	}

}
