
public class NomsCiutatsM3N1F4App {

	public static void main(String[] args) {

		/*
		 * Creeu un nou array de caràcters (char array[])per cada una de les ciutats que tenim. 
		 * La mida dels nous arrays serà la llargada de cada string ( string nomCiutat.Length).
		 * Ompliu els nous arrays lletra per lletra.
		 * Mostreu per consola els nous arrays amb els noms invertits (Ex: Barcelona - anolecraB). 
		 */
		
		
		// Partim de les 6 ciutats de l'exercici M3N1F1, emmagatzemades en variables 
		
		String ciutat1 = "Berlin";
		String ciutat2 = "Madrid";
		String ciutat3 = "Lisboa";
		String ciutat4 = "Barcelona";
		String ciutat5 = "Roma";
		String ciutat6 = "Napoles";
		
		
		/* Imprimim les ciutats cridant un mètode en el qual es crearà un array per cada ciutat, que s'omplirà amb els caràcters de la
		 * ciutat, i es mostrarà per consola el nom de la ciutat, més el nom de la ciutat invertit*/
				
		System.out.println("Ciutats amb els noms invertits:");
		
		nomsInvertits(ciutat1);		// Cridem el mètode per a cadascuna de les ciutats
		nomsInvertits(ciutat2);
		nomsInvertits(ciutat3);
		nomsInvertits(ciutat4);
		nomsInvertits(ciutat5);
		nomsInvertits(ciutat6);		
	}
	

	public static void nomsInvertits(String ciutat) {	//Mètode per generar l'array i omplir-lo, i invertir el nom de ciutat
		
		// Creem els nous arrays.
		char[] charArrayCiutat1 = new char[ciutat.length()];		// La mida del nou array será la llargada de l'string (variable ciutat)
		
		for (int i = 0; i < ciutat.length(); i++) {
			charArrayCiutat1[i] = ciutat.charAt(i);					// Omplim l'array lletra per lletra
		}
		
		String nomCiutatInvertit = "";
		
		for (int i = (ciutat.length() - 1); i >= 0; i--) {			// Emmagatzemem en una variable el nom de la ciutat invertit
			nomCiutatInvertit += ciutat.charAt(i);
		}
		
		System.out.print(charArrayCiutat1);							// Imprimeixo la ciutat del dret
		System.out.print(" - " + nomCiutatInvertit + "\n");			// Imprimeixo la ciutat amb el nom invertit
		
	}
	
}
