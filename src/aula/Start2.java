package aula;

public class Start2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroClase = 0;
		for(int i = 0;i<30;i++) {	
		Aula[] DAW = new Aula[30];
		DAW[0] = new Aula(3, 2, "DAW" + numeroClase);
		numeroClase++;
		System.out.println(DAW);

	}

}
}
