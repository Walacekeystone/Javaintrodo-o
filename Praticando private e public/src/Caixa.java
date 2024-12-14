
public class Caixa {
public boolean livre;

public void disponivel(){
	if (this.livre ==true) 
	{
		System.out.println("sim como posso ajudar? ");
	}
	else 
	{
		System.out.println("desculpe mas o caixa está ocupado! ");
	}
}
public void aberto() {
	this.livre = true;
}
public void fechado() {
	this.livre = false;
}







}
