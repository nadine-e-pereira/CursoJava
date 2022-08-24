/* Variáveis, Operadores Lógicos e classe Scanner */

/* 1. Faça um Programa que mostre a mensagem "Alo mundo" na tela.
*/

public class Exercicio1 {
	
	public static void main (String[]args) {
		
		System.out.println("Alô, Mundo!");

	}
}

/* 2. Faça um Programa que peça um número e então mostre a mensagem 
* O número informado foi [número].
*/

import java.util.Scanner;

public class Exercicio2 {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Infome um número: ");
		int numeroInformado = scan.nextInt();
		System.out.println("O número informado é: " + numeroInformado);
		
	}
}


/* 3. Faça um Programa que peça dois números e imprima a soma.
*/

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		int primeiroNumero=scan.nextInt();
		
		System.out.println("Informe o segundo número: ");
		int segundoNumero =scan.nextInt();
		
		int resultado = primeiroNumero + segundoNumero;
		System.out.println("A soma dos números é: " + resultado);

	}
}


/* 4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
*/

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		// media ponderada = soma dos valores das entradas + divisão pela qtd de entradas
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota: ");
		int primeiraNota = scan.nextInt();
		
		System.out.println("Informe a segunda nota: ");
		int segundaNota = scan.nextInt();
		
		System.out.println("Informe a terceira nota: ");
		int terceiraNota = scan.nextInt();
		
		System.out.println("Informe a quarta nota: ");
		int quartaNota = scan.nextInt();
		
		int resultado = primeiraNota + segundaNota + terceiraNota + quartaNota/4;
		System.out.println("Sua média é: " + resultado);
		
		if (resultado <70) {
			System.out.println("Você está de recuperação.");

		}
	}
}

/* 5. Faça um Programa que converta metros para centímetros.
*/

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[]args) {

		// 1 m == 100 cm
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor em centímetros: ");
		double valorCentimetros = scan.nextDouble();
		
		double valorMetros = valorCentimetros/100;
		System.out.println("o valor em metros é: " + valorMetros);
		
	}
}

/* 6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
*/

import java.util.Scanner;
import java.lang.Math;

public class Exercicio6 {

	public static void main(String[] args) {

		// C = 2.pi.r
		// d = 2.r

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o raio do círculo: ");
		double raioCirculo = scan.nextDouble();
		
		double diametro = raioCirculo*raioCirculo;
		System.out.println("O diametro é: " + diametro);
		
	}
}

/* 7. Faça um Programa que calcule a área de um quadrado, em seguida 
* mostre o dobro desta área para o usuário.
*/

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		// A = b.h
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor da base do quadrado: ");
		int base = scan.nextInt();
		
		System.out.println("Informe o valor da altura do quadrado: " );
		int altura = scan.nextInt();
		
		int area = base*altura;
		System.out.println("A área do quadrado é: " + area );
		
		int dobroArea = area*2;
		System.out.println("O dobro da área é: " + dobroArea);

	}
}

/* 8. Faça um Programa que pergunte quanto você ganha por hora e o número de horas
* trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
*/

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe quanto você ganha por hora: ");
		double salarioHoras = scan.nextDouble();
		
		System.out.println("Informe quantas horas voê trabalha por mês: ");
		int horasTrabalhadas = scan.nextInt();
		
		double salarioMensal = salarioHoras*horasTrabalhadas;
		
		System.out.println("Você ganha R$" + salarioMensal + "por mês.");	
		
	}
}

/* 9. Faça um Programa que peça a temperatura em graus Farenheit, 
* transforme e mostre a temperatura em graus Celsius.
*/

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		// C = (5 * (F-32) / 9)	
		// C = (F - 32) / 1.8

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Farenheit: ");
		double temperaturaFarenheit = scan.nextDouble();
		
		double temperaturaCelcius = (temperaturaFarenheit-32)/1.8;
		System.out.println("O resultado em Celcius é: " + temperaturaCelcius);

	}
}

/* 10. Faça um Programa que peça a temperatura em graus Celsius, 
* transforme e mostre em graus Farenheit.
*/

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		// F = (C*1.8) + 32

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Celcius: ");
		double temperaturaCelcius = scan.nextDouble();
		
		double temperaturaFarenheit = temperaturaCelcius*1.8+32;
		System.out.println("O resultado em Farenheit é: " + temperaturaFarenheit);
	}
}

/*11. Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
* a. o produto do dobro do primeiro com metade do segundo.
* b. a soma do triplo do primeiro com o terceiro.
* c. o terceiro elevado ao cubo.
*/

import java.util.Scanner;
import java.lang.Math;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

			System.out.println("Informe dois número inteiros: ");
			int primeiroNumero = scan.nextInt();
			int segundoNumero = scan.nextInt();
			
			System.out.println("Informe um número real: ");
			double terceiroNumero = scan.nextDouble();
			
			int resultado1 = (primeiroNumero*2)*(segundoNumero/2);
			double resultado2 = (primeiroNumero*3)+terceiroNumero;
			double resultado3 = Math.pow(terceiroNumero,3);
			
			System.out.println("Os resultados são: " + resultado1 + resultado2 + resultado3);
		
	}
}

/* 12. Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que
* calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
*/

import java.util.Scanner;

public class Exercicio12 {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com sua altura: ");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7*altura)-58;
		System.out.println("O peso ideal é: " + pesoIdeal);
	}
}

/* 13. Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um
* algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
* Para homens: (72.7h) *– 58
* a. Para mulheres*:* (62.1h) - 44.7 (h = altura)
* b. Peça o peso da pessoa e informe se ela está dentro, acima ou
* abaixo do peso.
*/

import java.util.Scanner;

public class Exercicio13 {
	public static void main (String [] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com sua altura: ");
		double altura = scan.nextDouble();
		
		System.out.println("Informe seu sexo (M/F): ");
		String sexo = scan.next();
		
		switch (sexo) {
		
		case "M", "m": {
			
			double pesoIdealH = (72.7*altura)-58;
			System.out.println("O peso ideal é: " + pesoIdealH);
		} break;
		case "F", "f": {
			double pesoIdealF = (62.1*altura)-44.7;
			System.out.println("O peso ideal é: " + pesoIdealF);
		} break;
			
		}
	}
}

/* 14. João Papo-de-Pescador, homem de bem, comprou um microcomputador para
* controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes
* maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50
* quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você
* faça um programa que leia a variável peso (peso de peixes) e verifique se há excesso.
* Se houver, gravar na variável excesso e na variável multa o valor da multa que João
* deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.
*/

import java.util.Scanner;

public class Exercicio14 {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o peso do peixe: ");
		double peso = scan.nextDouble();
		
		double pesoLimite = 50;
		double multa = (peso - pesoLimite)*4;
		if (peso > pesoLimite) {
			System.out.println("Você terá deverá pagar R$" + multa );
		}else {
			System.out.println("Peso dentro do estabelecido.");
			
		}
	}
}

/* 15. Faça um Programa que pergunte quanto você ganha por hora e o número de horas
* trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o
* sindicato, faça um programa que nos dê:
* - salário bruto.
* a. quanto pagou ao INSS.
* b. quanto pagou ao sindicato.
* c. o salário líquido.
* d. calcule os descontos e o salário líquido, conforme a tabela abaixo:
* - Salário Bruto : R$ - IR (11%) : R$ - INSS
* (8%) : R$ - Sindicato ( 5%) : R$ = Salário
* Liquido : R$
* Obs.: Salário Bruto - Descontos = Salário Líquido.
*/

import java.util.Scanner;

public class Exercicio15 {

	public static void main (String[] args) {

		Scanner scan = new Scanner(System.in);
	
		System.out.println("Informe quanto você ganha por hora: ");
		double salarioHoras = scan.nextDouble();
		System.out.println("Informe quantas horas você trabalha por mês: ");
		int horasTrabalhadas = scan.nextInt();
		
		double salarioBruto = salarioHoras*horasTrabalhadas;
		double inss = (salarioBruto/100)*8;
		double sindicato = (salarioBruto/100)*5;
		double ir = (salarioBruto/100)*11;
		double totalDescontos = inss + sindicato + ir;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Você ganha bruto R$" + salarioBruto);
		System.out.println("Você ganha bruto R$" + salarioLiquido);
		
	}
}

/* 16. Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em
* metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro
* para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam
* R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o
* preço total.
*/

import java.util.Scanner;

public class Exercicio16 {
	
	public static void main (String[] args) {
		
		// 1L = 3m2
		// 18L = 54m2
		// uma lata de tinta cobre 54m2
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe em metros quadrados a área a ser pintada: ");
		double area = scan.nextDouble();
		
		double litro = area/3;
		double latas = litro/18;
		double precoLata = 80;
		
		
		if (area % 54 == 0) {
			System.out.println("Comprando " + Math.round(latas) + " latas de 18 L você gastará R$" + Math.round(Math.round(latas)*precoLata));
		}else if (area < 54 ){
			System.out.println("Comprando " + Math.round(latas) + " latas de 18 L você gastará R$" + Math.round(precoLata));
		}else if (area > 54 && area % 54 != 0) {
			latas++;
			System.out.println("Comprando " + Math.round(latas) + " latas de 18 L você gastará R$" + Math.round(Math.round(latas)*precoLata));
		}
	}
}

/* 17. Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em
* metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro
* para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam
* R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00. Informe ao usuário as
* quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
* - comprar apenas latas de 18 litros;
* - comprar apenas galões de 3,6 litros;
* - misturar latas e galões, de forma que o preço seja o menor. Acrescente 10% de
* folga e sempre arredonde os valores para cima, isto é, considere latas cheias.
*/

import java.util.Scanner;

public class Exercicio17 {
	
	public static void main (String[] args) {
		
		// 1L = 6m2
		// 18L = 108m2
		// uma lata de tinta cobre 54m2
		// 3.6L = 21.6m2
		// um galão de tinta cobre 21.6m2
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe em metros quadrados a área a ser pintada: ");
		double area = scan.nextDouble();
		
		double litro = area/6;
		double latas = litro/18;
		double precoLata = 80;
		double galoes = litro/3.6;
		double precoGalao = 25;
		
		if (precoLata % 5 != 0 && precoGalao % 5 !=0) {
			precoGalao = Math.round(precoGalao);
			precoLata = Math.round(precoLata);}
			
		if (area % 108 == 0) {
			System.out.println("Comprando " + Math.round(latas) + " latas de 18 L você gastará R$" + Math.round(Math.round(latas)*precoLata));
		//}else if (area < 108 ){
			//System.out.println("Comprando " + Math.round(latas) + " latas de 18 L você gastará R$" + Math.round(precoLata));
		}else if (area > 108 && area % 108 != 0) {
			latas++;
			System.out.println("Comprando " + Math.round(latas) + " latas de 18 L você gastará R$" + Math.round(Math.round(latas)*precoLata));
		}
		
		if (area % 21.6 == 0) {
			System.out.println("Comprando " + Math.round(galoes) + " galoes de 3.6 L você gastará R$" + Math.round(Math.round(galoes)*precoGalao));
		}else if (area < 21.6 ){
			System.out.println("Comprando " + Math.round(galoes) + " galoes de 3.6 L você gastará R$" + Math.round(precoGalao));
		}else if (area > 21.6 && area % 21.6 != 0) {
			galoes++;
			System.out.println("Comprando " + Math.round(galoes) + " galoes de 3.6 L você gastará R$" + Math.round(Math.round(galoes)*precoGalao));

		}
	}
}


/* 18. Faça um programa que peça o tamanho de um arquivo para download (em MB) e a
* velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado
* de download do arquivo usando este link (em minutos).
*/

import java.util.Scanner;

public class Exercicio18 {
	
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o tamanho do arquivo: ");
		double tamArquivo = scan.nextDouble();
		
		System.out.println("Entre com a velocidade da internet: ");
		double velInternet = scan.nextDouble();
		
		double tempo = tamArquivo/velInternet;
		
		System.out.println("Tempo de download: " + tempo);
		
	}
}
