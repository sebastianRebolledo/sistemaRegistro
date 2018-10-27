package modelo;

public class ClubMascotas {

	
	private Due�o primerDue�o;
	
	private Due�o ultimoDue�o;
	
	int contador;
	
	
	public int getContador() {
		return contador;
	}






	public void setContador(int contador) {
		this.contador = contador;
	}






	public ClubMascotas() {
		
	}
	
	
	
	
	
	
	public Due�o getPrimerDue�o() {
		return primerDue�o;
	}


	public void setPrimerDue�o(Due�o primerDue�o) {
		this.primerDue�o = primerDue�o;
	}


	public Due�o getUltimoDue�o() {
		return ultimoDue�o;
	}


	public void setUltimoDue�o(Due�o ultimoDue�o) {
		this.ultimoDue�o = ultimoDue�o;
	}


	
	
	
//	public void registrarDue�o(String cedula,String name, String lastName,String fechaNacimiento) {
//		
//		
//		//Caso base
//		if (primerDue�o==null) {
//			Due�o duenho = Due�o(cedula,name, lastName,fechaNacimiento);
//		}
//		
//		
//	}

	







	public void registrarDue�o(String cedula,String name, String lastName,String fechaNacimiento) {
		
		if(primerDue�o==null) {
			primerDue�o = new Due�o(cedula,name,lastName,fechaNacimiento) ;
			ultimoDue�o=primerDue�o;
		}
		
		else {
			Due�o nuevoDue�o= new Due�o(cedula,name,lastName,fechaNacimiento);
			boolean encontro=false;
			
			Due�o actual = primerDue�o;
			
			while(actual.getSiguiente()!=null) {
				
				if(nuevoDue�o.compareTo(actual)>0) {
					actual = actual.getSiguiente();
				}else {
					nuevoDue�o.setSiguiente(actual);
					nuevoDue�o.setAnterior(actual.getAnterior());
					//condicional aqui, tercera linea
					actual.getAnterior().setSiguiente(nuevoDue�o);
					actual.setAnterior(nuevoDue�o);
				}
				
				
			}
			
			
		}
		
		
		
		

		
	}
	
	
	
	
	public void registrarDue�o2(String cedula,String name, String lastName,String fechaNacimiento) {
		
		if(primerDue�o==null) {
			primerDue�o = new Due�o(cedula,name,lastName,fechaNacimiento) ;
//			ultimoDue�o=primerDue�o;
		}
		
		else {
			
	
			Due�o nuevoDue�o= new Due�o(cedula,name,lastName,fechaNacimiento);
			boolean enlazo=false;
			Due�o actual = primerDue�o;
			
			while(actual!=null&&!enlazo) {
				
				if(nuevoDue�o.compareTo(actual)>0) {
					if(actual.getSiguiente()==null) {
						nuevoDue�o.setAnterior(actual);
						actual.setSiguiente(nuevoDue�o);
						
enlazo=true;
					}else {
						actual = actual.getSiguiente();
					}	
				}
				else {
					if(actual.getAnterior()==null) {
						actual.setAnterior(nuevoDue�o);

						nuevoDue�o.setSiguiente(actual);

						enlazo=true;
					}else {
						nuevoDue�o.setSiguiente(actual);
						nuevoDue�o.setAnterior(actual.getAnterior());
						//condicional aqui, tercera linea
						actual.getAnterior().setSiguiente(nuevoDue�o);
						actual.setAnterior(nuevoDue�o);
						enlazo=true;
					}
					
				}
				
				
			}
			
			
		}
		
		
		
		contador++;

		
	}
	
	
	
	
	
	public void eliminarDue�o(String cedula) {
		Due�o actual= buscarDue�o(cedula);
		
		
		if(actual==null) {
			System.out.println("No exsite el due�o");
		}else {
			if(actual.getAnterior()==null) {
//				Due�o siguiente=actual.getSiguiente();
//				siguiente.setAnterior(null);
//				actual.setSiguiente(null);
//				primerDue�o=siguiente;	
				primerDue�o=actual.getSiguiente();
//				actual.setSiguiente(null);
//				actual.setAnterior(null);
			}else if(actual.getSiguiente()==null) {
				Due�o anterior= actual.getAnterior();
				anterior.setSiguiente(null);
				actual.setAnterior(null);
			}else {
				
				Due�o siguiente= actual.getSiguiente();
				siguiente.setAnterior(actual.getAnterior());
				actual.getAnterior().setSiguiente(siguiente);
				actual.setSiguiente(null);
				actual.setAnterior(null);
			}
		}
		
	}
	
	
	
	
	
	
	
	public Due�o buscarDue�o(String cedula) {
		
		Due�o due�oEncontrado=null;
		Due�o actual=primerDue�o;
		boolean encontro=false;
		while(actual!=null&&!encontro) {
			if(actual.getCedula().compareTo(cedula)==0) {
				encontro=true;
				due�oEncontrado=actual;
			}else {
				actual=actual.getSiguiente();
			}
			
		}
		
		return due�oEncontrado ;
		
		
	}
	
	
	
//	public void eliminarDue�o(String cedula) {
//		
//		if(primerDue�o==null) {
//			/// tira excepcion
//		}else if(cedula.compareTo(primerDue�o.getCedula())==0) {
//			primerDue�o=primerDue�o.getSiguiente();
//		}else {
//			
//		}
		
//	}
	
	public void buscarDue�o() {
		
	}
	
	
	
	public void mostrar() {
		
		if(primerDue�o==null) {
			System.out.println("Esta vacia");
		}else {
			
			Due�o actual=primerDue�o;
			while(actual!=null) {
				System.out.println(actual.getCedula() +"\n");
				actual= actual.getSiguiente();
			}
			
			
			
		}
	
	}
	
	
	public void msotrarMascotas() {
		int contado=0;
		
		if(primerDue�o==null) {
			System.out.println("Esta vacia");
		}else {
			
		Due�o actual=primerDue�o;
		if(actual.getPrimeraMascosta()==null) {
			System.out.println("No hay mascotas");
		}else {
			
			
		}
		}
		
	}
	
}




