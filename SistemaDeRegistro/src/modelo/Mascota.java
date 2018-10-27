package modelo;

public class Mascota {

	public static int EMBRA=1;
	
	public static int MACH0=2;
	
	
	
	
	


	public static int PERRO=3;
	
	public static int GATO=4;
	
	
	
	private Mascota siguiente;
	
	private String name;
	
	private String fechaNacimiento;
	
	private int genero;
	
	private int  tipo;	
	
	public Mascota(String name, String fechaNacimiento, int genero, int tipo) {
		this.name=name;
		this.fechaNacimiento=fechaNacimiento;
		this.genero=genero;
		this.tipo=tipo;
		
		
	}
	
	
	
	public void mostrar() {
		int contador=0;
		if(siguiente==null) {
			System.out.println("Esta vacia");
		}else {
			
			Mascota actual=siguiente;
			while(actual!=null) {
				contador++;
				System.out.println("Mascota actual es:" + contador +" Nombre mascota"+actual.getName() +"\n");
				
				actual= actual.getSiguiente();
			}
			
			
			
		}
	
	}
	
	
	
	
	
	public Mascota getSiguiente() {
		return siguiente;
	}


	public void setSiguiente(Mascota siguiente) {
		this.siguiente = siguiente;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}





	public int getGenero() {
		return genero;
	}





	public void setGenero(int genero) {
		this.genero = genero;
	}





	public int getTipo() {
		return tipo;
	}





	public void setTipo(int tipo) {
		this.tipo = tipo;
	}




	

	
	
}
