import javax.swing.JOptionPane;
import java.util.ArrayList;

public class FibonacciM3N3App {

	public static void main(String[] args) {
		
		/* Escriviu un programa que donat un numero N retorni la seqüència de Fibonacci fins al numero N.
		 * La seqüència de Fibonacci és la sèrie de nombres: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... 
		 * El número següent es troba sumant els dos números anteriors.
		 */
		
		
		// Demanem a l'usuari que introdueixi el número pel qual vol retornar la seqüència de Fibonacci.
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Quants números de la seqüència de Fibonacci vols veure?"));
		
		
		//Creem un array on anirem emmagatzemant la seqüència de Fibonacci que creem.
		
		ArrayList<Integer> fib = new ArrayList<Integer>(); 
		

		//Anem generant tants números de la seqüència com hagi demanat l'usuari.
				
		String seqFib = "";		//String on imprimirem la seqüència de Fibonacci o el text pertinent segons el valor introduït
		
		if (num < 0) {		
			
			seqFib  = "El valor que has introduït no és correcte";
			
		} else if (num == 0) {
			
			seqFib = "No vols veure cap valor de la seqüència de Fibonacci";
			
		} else if (num == 1) {		// Tractem per separat el primer i segon valors perquè no té valors de referència per calcular la seqüència
			
			seqFib = "0";
			
		} else if (num == 2) {
			
			seqFib = "0, 1";
			
		} else if (num > 3) {		// A partir de 3 valors, ja podem calcular la seqüència per fòrmula
			
			fib.add(0);				// Primer afegim els 2 primers valors a l'array
			fib.add(1);
			
			for (int i = 2; i <= num; i++) {	// A partir del 3er valor, anem afegim progressivament a l'array
				int numFib = fib.get(i-2) + fib.get(i-1);
				fib.add(numFib);
			}
			seqFib = "0, 1";
			for (int i = 2; i < num; i++) {
				seqFib += ", " + fib.get(i);
			}
		}
		
		//Imprimim per pantalla el resultat
		JOptionPane.showMessageDialog(null, "Els " + num + " primers valors de la seqüència de Fibonacci són:\n" + seqFib);
	}
}
