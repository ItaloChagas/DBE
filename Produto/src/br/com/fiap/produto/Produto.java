package br.com.fiap.produto;

public class Produto{

	TipoProduto tipo;
	
	public Produto getNosso(int tipo) {
		if(tipo == 1) {
			
			this.tipo = TipoProduto.CAMISA;
			
			return this;
		}
		
		if(tipo == 3) {
			this.tipo = TipoProduto.VIDEOGAME;
			
			return this;		}
		
		if(tipo == 4) {
			this.tipo = TipoProduto.TELEFONE;
			
			return this;
		}
		
		return this; 
		
	}
	
}
