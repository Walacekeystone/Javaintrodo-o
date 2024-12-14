package ultraemojicombat;

public class Lutador {
    //ATRIBUTOS
	private String nome , nacionalidade , categoria;
	private int idade;
	private float altura, peso;
	private int vitorias , derrotas , empates;
	//METODOS PÚBLICOS
	public void apresentar() {
		System.out.println("===============================================");
		System.out.println(" Apresento a vocês o lutador " + this.getNome());
	    System.out.println("Diretamente do(a) " + this.getNacionalidade());
	    System.out.println("Ele veio para arrbentar! com " + this.getIdade() + " Anos!!!");
	    System.out.println("Com um peso de " + this.getPeso() + " Kg e com " + this.getAltura() + " de altura!!!");
	    System.out.println(this.getVitorias() + " Vitorias!");
	    System.out.println(this.getDerrotas() + " Derrotas e");
	    System.out.println(this.getEmpates()  + " Empates!");
	}
	public void status() {
  System.out.println(this.getNome() + " é um peso " + this.getCategoria());
    System.out.println("Ganhou " + this.getVitorias() + " vezes");
	System.out.println("Perdeu " + this.getDerrotas() + " vezes");
	System.out.println(this.getEmpates() + " empates! ");
	}
	public void ganharLuta() {
		 this.vitorias = this.vitorias+1;
	}

	public void perderLuta() {
		 this.derrotas = this.derrotas +1;
	}
	public void empatarLuta() {
		this.empates = this.empates +1;
	}
	public Lutador(String no, String na, int id, float al, float pe, int vi, int de,
			int em) {
		super();
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso(pe);
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;	
	}
	
	//GET E SET
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria() {
	if(this.peso <52.2) 
	{
		this.categoria = "Inválido";
		
	}
	else if (this.peso <= 70.3) 
	{
		this.categoria = "leve";
	}
	else if (this.peso <=83.9){
		this.categoria = "médio";
	}
	else if(this.peso <= 120.2) {
		this.categoria = "pesado";
	
	}
	else {
		this.categoria = "Invalido";
	}
	
	
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	this.setCategoria();
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	// METODOS ESPECIAIS
	
	
	
	
	
	
	
}
