//CLASSE MODELO CARRO
package poo;

import java.util.Random;

public class Carro {
	
	int ano;
	String cor;
	
	public Carro() {
		Random gerador = new Random();
		int chassi = gerador.nextInt(1000);
		System.out.println("Chassi: " + chassi);
	}
	
	public Carro(int ano, String cor){
		this.ano = ano;
		this.cor = cor;
	}
	 
	void ligar() {
		System.out.println("engine ON");
	}
	
	void desligar () {
		System.out.println("engine OFF");
	}
	
	void acelerar () {
		System.out.println("vrummmmmmmmm");
	}
}

//OBJETO FUSCA 
package poo;

public class Fusca {

	public static void main(String[] args) {
		Carro fusca = new Carro();
		fusca.ano = 1968;
		fusca.cor = "Azul";
		System.out.println("Carro: Fusca");
		System.out.println("Ano: " + fusca.ano);
		System.out.println("Ano: " + fusca.cor);
		fusca.ligar();
		fusca.acelerar();
		fusca.desligar();
	}

}


//CLASSE MODELO AVIÃO, HERDANDO OS ATRIBUTOS E MÉTODOS DA CLASSE CARRO
package poo;

public class Aviao extends Carro{
	
	double envergadura;
	
	void aterrizar() {
		System.out.println("----____");
	}
	
	void acelerar() {
		System.out.println("Decolar___----32");
	}
}


//OBJETO CESSNA HERDANDO AS ATRIBUIÇÕES DA CLASSE MODELO CARRO, PORÉM COM O MÉTODO ACELARAR COM UMA OUTRA ATRIBUIÇÃO
package poo;

public class Cesna {

	public static void main(String[] args) {
		Aviao cesna = new Aviao();
		cesna.ano = 2015;
		cesna.cor = "Branco";
		cesna.envergadura = 11;
		System.out.println("Avião: Cesna");
		System.out.println("Ano: " + cesna.ano);
		System.out.println("Cor: " + cesna.cor);
		System.out.println("Envergadura: " + cesna.envergadura + "m");
		cesna.ligar();
		cesna.acelerar();
	}
}
