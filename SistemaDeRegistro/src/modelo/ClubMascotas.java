package modelo;

public class ClubMascotas {

	
	private Dueño primerDueño;
	
	private Dueño ultimoDueño;
	
	int contador;
	
	
	public int getContador() {
		return contador;
	}






	public void setContador(int contador) {
		this.contador = contador;
	}






	public ClubMascotas() {
		
	}
	
	
	
	
	
	
	public Dueño getPrimerDueño() {
		return primerDueño;
	}


	public void setPrimerDueño(Dueño primerDueño) {
		this.primerDueño = primerDueño;
	}


	public Dueño getUltimoDueño() {
		return ultimoDueño;
	}


	public void setUltimoDueño(Dueño ultimoDueño) {
		this.ultimoDueño = ultimoDueño;
	}


	
	
	
//	public void registrarDueño(String cedula,String name, String lastName,String fechaNacimiento) {
//		
//		
//		//Caso base
//		if (primerDueño==null) {
//			Dueño duenho = Dueño(cedula,name, lastName,fechaNacimiento);
//		}
//		
//		
//	}

	







	public void registrarDueño(String cedula,String name, String lastName,String fechaNacimiento) {
		
		if(primerDueño==null) {
			primerDueño = new Dueño(cedula,name,lastName,fechaNacimiento) ;
			ultimoDueño=primerDueño;
		}
		
		else {
			Dueño nuevoDueño= new Dueño(cedula,name,lastName,fechaNacimiento);
			boolean encontro=false;
			
			Dueño actual = primerDueño;
			
			while(actual.getSiguiente()!=null) {
				
				if(nuevoDueño.compareTo(actual)>0) {
					actual = actual.getSiguiente();
				}else {
					nuevoDueño.setSiguiente(actual);
					nuevoDueño.setAnterior(actual.getAnterior());
					//condicional aqui, tercera linea
					actual.getAnterior().setSiguiente(nuevoDueño);
					actual.setAnterior(nuevoDueño);
				}
				
				
			}
			
			
		}
		
		
		
		

		
	}
	
	
	
	
	public void registrarDueño2(String cedula,String name, String lastName,String fechaNacimiento) {
		
		if(primerDueño==null) {
			primerDueño = new Dueño(cedula,name,lastName,fechaNacimiento) ;
//			ultimoDueño=primerDueño;
		}
		
		else {
			
	
			Dueño nuevoDueño= new Dueño(cedula,name,lastName,fechaNacimiento);
			boolean enlazo=false;
			Dueño actual = primerDueño;
			
			while(actual!=null&&!enlazo) {
				
				if(nuevoDueño.compareTo(actual)>0) {
					if(actual.getSiguiente()==null) {
						nuevoDueño.setAnterior(actual);
						actual.setSiguiente(nuevoDueño);
						
enlazo=true;
					}else {
						actual = actual.getSiguiente();
					}	
				}
				else {
					if(actual.getAnterior()==null) {
						actual.setAnterior(nuevoDueño);

						nuevoDueño.setSiguiente(actual);

						enlazo=true;
					}else {
						nuevoDueño.setSiguiente(actual);
						nuevoDueño.setAnterior(actual.getAnterior());
						//condicional aqui, tercera linea
						actual.getAnterior().setSiguiente(nuevoDueño);
						actual.setAnterior(nuevoDueño);
						enlazo=true;
					}
					
				}
				
				
			}
			
			
		}
		
		
		
		contador++;

		
	}
	
	
	
	
	
	public void eliminarDueño(String cedula) {
		Dueño actual= buscarDueño(cedula);
		
		
		if(actual==null) {
			System.out.println("No exsite el dueño");
		}else {
			if(actual.getAnterior()==null) {
//				Dueño siguiente=actual.getSiguiente();
//				siguiente.setAnterior(null);
//				actual.setSiguiente(null);
//				primerDueño=siguiente;	
				primerDueño=actual.getSiguiente();
//				actual.setSiguiente(null);
//				actual.setAnterior(null);
			}else if(actual.getSiguiente()==null) {
				Dueño anterior= actual.getAnterior();
				anterior.setSiguiente(null);
				actual.setAnterior(null);
			}else {
				
				Dueño siguiente= actual.getSiguiente();
				siguiente.setAnterior(actual.getAnterior());
				actual.getAnterior().setSiguiente(siguiente);
				actual.setSiguiente(null);
				actual.setAnterior(null);
			}
		}
		
	}
	
	
	
	
	
	
	
	public Dueño buscarDueño(String cedula) {
		
		Dueño dueñoEncontrado=null;
		Dueño actual=primerDueño;
		boolean encontro=false;
		while(actual!=null&&!encontro) {
			if(actual.getCedula().compareTo(cedula)==0) {
				encontro=true;
				dueñoEncontrado=actual;
			}else {
				actual=actual.getSiguiente();
			}
			
		}
		
		return dueñoEncontrado ;
		
		
	}
	
	
	
//	public void eliminarDueño(String cedula) {
//		
//		if(primerDueño==null) {
//			/// tira excepcion
//		}else if(cedula.compareTo(primerDueño.getCedula())==0) {
//			primerDueño=primerDueño.getSiguiente();
//		}else {
//			
//		}
		
//	}
	
	public void buscarDueño() {
		
	}
	
	
	
	public void mostrar() {
		
		if(primerDueño==null) {
			System.out.println("Esta vacia");
		}else {
			
			Dueño actual=primerDueño;
			while(actual!=null) {
				System.out.println(actual.getCedula() +"\n");
				actual= actual.getSiguiente();
			}
			
			
			
		}
	
	}
	
	
	public void msotrarMascotas() {
		int contado=0;
		
		if(primerDueño==null) {
			System.out.println("Esta vacia");
		}else {
			
		Dueño actual=primerDueño;
		if(actual.getPrimeraMascosta()==null) {
			System.out.println("No hay mascotas");
		}else {
			
			
		}
		}
		
	}
	
}




