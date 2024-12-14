// ATRIBUTOS
public class Conta {
public int numConta;
protected String tipo;
public String dono;
private float saldo;
private boolean status;
private String mensagem;

// METODO CONSTRUTOR
public void contrutor() {
	this.saldo = 0;
	this.status = false;
}
// METODOS                                                                                                                                                  S                      s
public void estadoAtual(){
	System.out.println("--------------------------------------------------------------------------------------------------------------------------"
			+ " \nbem vindo: " + this.getDono());
	
	System.out.println(mensagem);
	System.out.println("Conta: " + this.getNumConta());
	System.out.println("Tipo de conta: " + this.getTipo());
	System.out.println("Saldo; " + this.getSaldo());
	System.out.println("Seus status: " + this.getStatus());
	
	
}

void abrirconta(String t) {
	this.setTipo(t);
	this.setStatus(true);
	if (t == "CC") {

		this.setSaldo(50); 
		this.mensagem = "Conta corrente aberta com sucesso!";
	}else if (t == "CP") {
		this.setSaldo(150); 
		this.mensagem = "Conta poupança aberta com sucesso!";
	}
}



void fecharConta() {
	if (this.getSaldo() > 0) {
		System.out.println("Conta com dinheiro?");
	}else if(saldo < 0){
		System.out.println("Conta em débito!");
	}else {
		System.out.println("fechando conta...");
	this.setStatus(false);
	
	}
}
void depositar(float v) {
	if (this.getStatus()){
	this.setSaldo(this.getSaldo() + v);
	System.out.println("Deposito realizado com suceeso no valor de " + v + " na conta de "
			+   this.getDono() + " \nSaldo: " + this.getSaldo() );
	}else {
		System.out.println("Desculpe mas sua conta está fechada, entre em contato com o banco!");
	}
}
void sacar(float v) {
	if (this.status = true) {
		if (this.saldo >= v) {
			this.saldo = this.saldo - v;
		System.out.println("Saque de: " + v  + " Realizado com sucesso!"
				+ "\nSaldo: " + this.getSaldo());
		
		}else {
			System.out.println("Saldo insuficiente para saque!!!");
		}
	
	 
	}else {
		System.out.println("Conta fechada!");
	}
}
void pagarMensal() {
		float v = 0;
		if(this.tipo == "CC") {
			v =12;
		}else if(this.tipo == "CP") {
			v = 20;
		}
	if(this.status == true) {
		if (this.saldo > v) {
			this.saldo = this.saldo - v;
		}
		else {
			System.out.println("Saldo insuficiente");
		}
			
		}
	}
//METODOS GET E SETS
public int getNumConta() {
	return numConta;
}
public void setNumConta(int numConta) {
	this.numConta = numConta;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getDono() {
	return dono;
}
public void setDono(String dono) {
	this.dono = dono;
}
public float getSaldo() {
	return saldo;
}
public void setSaldo(float saldo) {
	this.saldo = saldo;
}
public boolean getStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
public String getMensagem() {
	return mensagem;
}
public void setMensagem(String mensagem) {
	this.mensagem = mensagem;
}


}
