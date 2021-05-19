import javax.swing.JOptionPane;

public class NotaMitjanaM3N2App {

	public static void main(String[] args) {

		// Crea un array bidimensional capaç de guardar 3 notes de 5 alumnes. 
		
		double[][] notes = new double [5][3];
		
		
		/*Omple l’array amb un bucle demanant els valors per pantalla (nota entre 0 i 10), 
		 * has d’identificar per pantalla quan és una agrupació d’un alumne nou.*/
		
		for (int i = 0; i < notes.length; i++) {
			int numAlumne = i + 1;
			
			JOptionPane.showMessageDialog(null, "ENTRADA DE NOTES DE L'ALUMNE " + numAlumne + ".\nEl programa només accepta notes entre 0 i 10!");
			
			for (int j = 0; j < notes[i].length; j++) {
				notes[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Introdueix la nota " + (j + 1) + " de l'alumne " + numAlumne + ":"));
				
				if (notes[i][j] < 0 || notes[i][j] > 10) {
					JOptionPane.showMessageDialog(null, "El valor introduït és erroni. torna-ho a intentar");	// Ens assegurem que la nota està entre 0 i 10
					j--;
				}				
			}
		}
		
		
		//Recorre l'array, fes la mitjana aritmètica de les 3 notes i indica si l'alumne ha aprovat o suspès
				
		for (int i = 0; i < notes.length; i ++) {
			double suma = 0;
			for (int j = 0; j < notes[i].length; j++) {
				suma += notes[i][j];		// Primer calculem la suma de les 3 notes
			}
			
			double mitja = suma / notes[i].length;		// Calculem la mitjana aritmètica
			
			if (mitja >= 5) {		// Imprimim la mitja i diem si ha aprovat o suspès
				System.out.println("L'alumne " + (i + 1) + " ha aprovat amb un " + String.format("%.2f", mitja));
			} else {
				System.out.println("L'alumne " + (i + 1) + " ha suspès amb un " + String.format("%.2f", mitja));
			}
		}
		
	}

}
