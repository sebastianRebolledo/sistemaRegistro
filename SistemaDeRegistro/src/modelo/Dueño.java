package modelo;

import java.io.Serializable;

public class Dueño implements Comparable<Dueño>,Serializable{

	
	private String name;
	private String cedula;
	private String apellido;
	
	private String fechaNacimiento;
	private Mascota primeraMascosta;
	
	private  Dueño siguiente;
	private Dueño anterior;
	
	private int contador;
	
	
	
	





	public Dueño(String name,String apellido,String cedula,String fechaNacimiento) {
		this.name=name;
		this.cedula=cedula;
		this.apellido=apellido;
		this.fechaNacimiento=fechaNacimiento;
		
	}


	
	public int getContador() {
		return contador;
	}



	public void setContador(int contador) {
		this.contador = contador;
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCedula() {
		return cedula;
	}



	public void setCedula(String cedula) {
		this.cedula = cedula;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getFechaNacimiento() {
		return fechaNacimiento;
	}



	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}



	public Dueño getSiguiente() {
		return siguiente;
	}



	public void setSiguiente(Dueño siguiente) {
		this.siguiente = siguiente;
	}



	public Dueño getAnterior() {
		return anterior;
	}



	public void setAnterior(Dueño anterior) {
		this.anterior = anterior;
	}



	
	
	
	
	public Mascota getPrimeraMascosta() {
		return primeraMascosta;
	}



	public void setPrimeraMascosta(Mascota primeraMascosta) {
		this.primeraMascosta = primeraMascosta;
	}
	
	
	
	
	
	@Override
	public int compareTo(Dueño d1) {
		int resultado=0;
		if(this.cedula.compareTo(d1.getCedula())>0) {
			resultado=1;
		}else if(this.cedula.compareTo(d1.getCedula())<0){
			return -1;
		}
		return resultado;
	}
	
	
	
	
	public void agregarMascota(Mascota nuevaMascota) {
		
	
		if(primeraMascosta==null) {
			primeraMascosta=nuevaMascota;
			contador++;
		}
		else {
			
			Mascota actual= primeraMascosta;
			Boolean enlazo=false;
			
			while(actual!=null &&!enlazo) {
				
				if(actual.getSiguiente()==null) {
					actual.setSiguiente(nuevaMascota);
					enlazo=true;
					contador++;
				}else {
					actual=actual.getSiguiente();
					
				}
				
			}
			
		}
		
	}
	
	
	
	
	
	public void eliminarMascota(String nombre) {
		

		Mascota buscado= buscarMascota(nombre);
		Mascota actual=primeraMascosta;
		Mascota anterior=null;
		
		if(buscado==null) {
			System.out.println("No exite");
		}else {
			
			if(actual==buscado) {
				actual=actual.getSiguiente();
			}else {
				boolean elimino=false;
				while(actual!=null &&!elimino) {
					
					
					if(actual==buscado) {
						if(anterior!=null&& actual.getSiguiente()!=null) {
							anterior.setSiguiente(actual.getSiguiente());
							actual.setSiguiente(null);
						}else {
							anterior.setSiguiente(null);
							
						}
					}else {
						anterior=actual;
						actual=actual.getSiguiente();
					}
				}
				
				
				
			}
			
		}
		
		
		
	}
	
	
	
	
	public Mascota buscarMascota(String nombre) {
		Mascota mascotaBuscada=null;
		boolean encontro=false;
		
		Mascota actual=primeraMascosta;
		
		while(actual!=null&&!encontro) {
			if(actual.getName().compareTo(nombre)>0) {
				encontro=true;
				mascotaBuscada=actual;
			}else {
			actual=actual.getSiguiente();
				
			}
		}
		
		
		return mascotaBuscada;
	}
	
	
	

	
	public void mostrarMascota() {
		int contador=0;
		if(primeraMascosta==null) {
			System.out.println("Esta vacia");
		}else {
			
			Mascota actual=primeraMascosta;
			while(actual!=null) {
				contador++;
				System.out.println("Mascota actual es:" + contador +" Nombre mascota"+actual.getName() +"\n");
				
				actual= actual.getSiguiente();
			}
			
			
			
		}
	
	}
	
	

	
}
