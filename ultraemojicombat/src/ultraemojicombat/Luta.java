package ultraemojicombat;

public class Luta {
//ATRIBUTOS
private Lutador desafiado;
private Lutador desafiante;
private int roudns;
private boolean aprovada;

//METODOS
public void marcarluta(Lutador l1, Lutador l2) {
	if(l1.getCategoria() == l2.getCategoria() && l1 != l2) {
		this.aprovada = true;
		this.desafiado =l1;
		this.desafiante = l2;
	}
	else {
		this.aprovada = false;
		this.desafiado = null;
		this.desafiante = null;
	}
}
public void lutar() {
	if (this.aprovada = true) {
       this.desafiado.apresentar();
       
	}
	
}

// GET E SETERS
public Lutador getDesafiado() {
	return desafiado;
}
public void setDesafiado(Lutador desafiado) {
	this.desafiado = desafiado;
}
public Lutador getDesafiante() {
	return desafiante;
}
public void setDesafiante(Lutador desafiante) {
	this.desafiante = desafiante;
}
public int getRoudns() {
	return roudns;
}
public void setRoudns(int roudns) {
	this.roudns = roudns;
}
public boolean isAprovada() {
	return aprovada;
}
public void setAprovada(boolean aprovada) {
	this.aprovada = aprovada;
}
		

}
