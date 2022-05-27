package poo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		// variáveis
		double peso, altura, imc;
		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		System.out.println("Cálculo do IMC");
		// entrada
		System.out.println("Digite seu peso: ");
		peso = teclado.nextDouble();
		System.out.println("Digite sua altura: ");
		altura = teclado.nextDouble();
		// processamento
		imc = peso / (altura * altura);
		// saída
		System.out.println("Seu IMC é: " + formatador.format(imc));
		teclado.close();
		// Classificação
		if (imc < 18.5) {
			System.out.println("Você está abaixo do peso");
		} else if (imc < 25) {
			System.out.println("Você está no seu peso ideal");
		} else if (imc < 30) {
			System.out.println("Levemente acima do seu peso ideal");
		} else if (imc < 35) {
			System.out.println("Obsidade grau I");
		} else if (imc < 40) {
			System.out.println("Obsidade grau II (severa)");
		} else {
			System.out.println("Obesidade grau III (morbida");
		}
	}

}
