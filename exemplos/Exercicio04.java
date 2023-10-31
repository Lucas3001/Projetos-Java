import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		double peso=0,altura=0;
		int contador=0,idade=0,somaIdade=0,quant50=0,quantIdade=0,quantAzul=0,quantRuiva=0;
		char corOlho,corCabelo;
		Scanner entrada = new Scanner(System.in);
		
		for(int i=0;i<10;i++){
			System.out.print("Digite sua idade:");
			idade=entrada.nextInt();
			System.out.print("Digite sua altura:");
			altura=entrada.nextDouble();
			System.out.print("Digite seu peso:");
			peso=entrada.nextDouble();
			System.out.print("Digite a cor dos seus olhos:");
			corOlho=entrada.next().toUpperCase().charAt(0);
			while(corOlho=='a');				
				
			}
			
		}


	}

}
