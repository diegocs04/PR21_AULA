package aula;

import java.util.Arrays;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroClase = 0;
		for(int i = 0;i<30;i++) {	
		Aula DAW = new Aula(0, 0, "DAW"+ numeroClase);
		numeroClase++;
		System.out.println(DAW);

		
		}
		/*Para hacer los metodos de ordenacion necesito vectores, ya que los arrays funcionan con vectores,
		 * y me di cuenta ahora sobre la marcha haciendolo.
		 *
		 * DAW.ordenarNotaBBDD1();
		Arrays.sort();
		
		DAW.ordenarNotaPROG1();
		Arrays.sort();
		
		DAW.ordenarNombre();
		Array.sort();
		
		*/
		

	}

}
