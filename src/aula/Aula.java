package aula;

public class Aula 
{
	private int notaBBDD1;
	private int notaPROG1;
	private String nombre;
	
	
	public Aula(int notaBBDD1, int notaPROG1, String nombre) 
	{
		this.notaBBDD1=(int)(Math.random()*11);
		this.notaPROG1=(int)(Math.random()*11);
		this.nombre=nombre;
	}
	
	public static void ordenarNotaPROG1() {
			
	}
	
	public static void ordenarNotaBBDD1() {
		
	}
	
	public static void ordenarNombre() {
		
	}


	@Override
	public String toString() {
		return "NotaBBDD1=[" + notaBBDD1 + "], NotaPROG1=[" + notaPROG1 + "], Nombre=[" + nombre + "]";
	}


	public int getNotaBBDD1() {
		return notaBBDD1;
	}


	public void setNotaBBDD1(int notaBBDD1) {
		this.notaBBDD1 = notaBBDD1;
	}


	public int getNotaPROG1() {
		return notaPROG1;
	}


	public void setNotaPROG1(int notaPROG1) {
		this.notaPROG1 = notaPROG1;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
