import javax.swing.JOptionPane;
import java.util.ArrayList;

public class FibonacciM3N3App {

	public static void main(String[] args) {
		
		/* Escriviu un programa que donat un numero N retorni la seq��ncia de Fibonacci fins al numero N.
		 * La seq��ncia de Fibonacci �s la s�rie de nombres: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... 
		 * El n�mero seg�ent es troba sumant els dos n�meros anteriors.
		 */
		
		
		// Demanem a l'usuari que introdueixi el n�mero pel qual vol retornar la seq��ncia de Fibonacci.
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Quants n�meros de la seq��ncia de Fibonacci vols veure?"));
		
		
		//Creem un array on anirem emmagatzemant la seq��ncia de Fibonacci que creem.
		
		ArrayList<Integer> fib = new ArrayList<Integer>(); 
		

		//Anem generant tants n�meros de la seq��ncia com hagi demanat l'usuari.
				
		String seqFib = "";		//String on imprimirem la seq��ncia de Fibonacci o el text pertinent segons el valor introdu�t
		
		if (num < 0) {		
			
			seqFib  = "El valor que has introdu�t no �s correcte";
			
		} else if (num == 0) {
			
			seqFib = "No vols veure cap valor de la seq��ncia de Fibonacci";
			
		} else if (num == 1) {		// Tractem per separat el primer i segon valors perqu� no t� valors de refer�ncia per calcular la seq��ncia
			
			seqFib = "0";
			
		} else if (num == 2) {
			
			seqFib = "0, 1";
			
		} else if (num > 3) {		// A partir de 3 valors, ja podem calcular la seq��ncia per f�rmula
			
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
		JOptionPane.showMessageDialog(null, "Els " + num + " primers valors de la seq��ncia de Fibonacci s�n:\n" + seqFib);
	}
}
