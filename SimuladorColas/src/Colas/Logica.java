package Colas;

import java.util.LinkedList;

public class Logica {
	
	static LinkedList<Cliente> cola = new LinkedList<Cliente>();
	
	int retorno=0;

	
	public static void agregarcliente(int nrecibos){
		cola.add(new Cliente(nrecibos));
	}
	
	
	public int atender(){
		
	
		
		
		try{
			
		
			cola.get(0).restarrecibo();
			
			if(cola.get(0).numeroderecibos==0) {
				cola.removeFirst();
				retorno=1;
			}
			else {
				cola.add(cola.get(0));
				cola.removeFirst();
				retorno=0;
			}
		

		
		}catch(Exception e){
			
		}
		
		
		return retorno;
		
	}
	
	

	
	
	

}
