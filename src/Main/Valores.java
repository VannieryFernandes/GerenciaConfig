package Main;

public class Valores implements ValoresITF{
	
	 Integer[] valores= new Integer[10];
	int posicao = 0;


	@Override
	public boolean ins(int v) {
		if(v<1 || size()==10) {
			return false;
		}
		
		for (int i = 0; i < this.valores.length; i++) {
			if (this.valores[i] == null ) {
				this.valores[i] = v;
				break;
			}
		}
		
		return true;
	 
	}

	@Override
	public int del(int i) {
	
		
		if(size()==0) {
			return -1;
		}
		int valor;
		
		if(i>=0 && i<=9) {
			if(valores[i]!=null) {
				valor = valores[i];
				valores[i]=null;
				return valor;
			}	
		}
		
		return -1;
	}

	@Override
	public int size() {
		int valor = 0;
		for (int i = 0; i < valores.length; i++) {
			if(valores[i]!=null) {
				valor+=1;
			}
		}
		
		return valor;
	}

	@Override
	public double mean() {
		if(size()==0) {
			return -1;
		}
		int valor = 0; 
		double media = 0;
		for (int i = 0; i < size(); i++) {
			valor +=valores[i];		
			
		}
		
		if(size()!=0) {
		media = valor/size();
		}
		return media;
		
	}

	@Override
	public int greater() {
		if(size()==0) {
			return -1;
		}
		int maior = 0;
		for (int i = 0; i < size(); i++) {
			if(valores[i]!=null ) {
				
				if(valores[i]>maior){
					maior = valores[i];
				}
				
			}
		}
		return maior;
	}

	@Override
	public int lower() {
		if(size()==0) {
			return -1;
		}
		int menor = greater(); 
		for (int i = 0; i <size(); i++) {
			if(valores[i]!=null) {
				if(valores[i]<menor) {
				menor = valores[i];
				}
			}
		}
		return menor;
	}
	

}
