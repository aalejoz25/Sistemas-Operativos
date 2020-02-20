package Colas;

public class Cliente {
	
	int numeroderecibos;
	int estado;
	
	

	
	public Cliente(int numrecibos){
		
		numeroderecibos=numrecibos;
		

		
	}
	
	public void restarrecibo() {
	
		
		if(numeroderecibos>=3) {
		numeroderecibos=numeroderecibos-3;
		}
		else {
			numeroderecibos=0;
		}
	}
	
	
	

}
