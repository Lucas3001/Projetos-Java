package aula04;
import java.util.Scanner;
public class Exercicio04 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		int idade=0, qtdIdade50=0 ,somaIdade=0 ,qtdIdade=0 ,qtdAzul=0 ,qtdRuivoAzul=0,somaAzul=0;
		double peso=0,altura=0, mediaIdade=0, azulPorce=0;
		char corOlho,corCabelo;
		
		for(int i=0;i<4;i++) {
			System.out.print("Digite a idade:");
			idade=entrada.nextInt();
			
			System.out.print("Digite o peso:");
			peso=entrada.nextDouble();
			
			System.out.print("Digite a altura:");
			altura=entrada.nextDouble();
			
			System.out.print("Digite a cor dos olhos:");
			corOlho=entrada.next().toUpperCase().charAt(0);
			while(corOlho!='A' && corOlho!='P' && corOlho!='V' && corOlho!='C') {
				System.out.print("Digite a cor dos olhos corretamente:");
				corOlho=entrada.next().toUpperCase().charAt(0);
				
			}
			System.out.print("Digite a cor dos cabelos:");
			corCabelo=entrada.next().toUpperCase().charAt(0);
			while(corCabelo!='P' && corCabelo!='C' && corCabelo!='L' && corCabelo!='R') {
				System.out.print("Digite a cor dos cabelos corretamente:");
				corCabelo=entrada.next().toUpperCase().charAt(0);
			}
			if (idade>50 && peso<60) {
				qtdIdade50++;
			}
			if (altura<1.50) {
				qtdIdade++;
				somaIdade=somaIdade+idade;
			}
			if (corOlho=='A') {
				qtdAzul++;
				somaAzul=somaAzul+corOlho;
			}
			if (corCabelo=='R' && corOlho !='A') {
				qtdRuivoAzul++;
		    }
		}
		
		if (qtdIdade>0) {
			mediaIdade=somaIdade/4;
			System.out.println("A média de idade das pessoas com menos de 1,50m de altura é de:"+mediaIdade);	
		}else {
			System.out.println("A média de idade das pessoas com menos de 1,50m de altura é de 0:");	 
			}
		if (qtdAzul>0) {
			azulPorce=(qtdAzul/4)*100;
			System.out.println("A porcentagem de pessoas com cabelo azul é de:"+ azulPorce+"%");
		} else {
			System.out.println("A porcentagem de pessoas com cabelo azul é 0%");
		}
		System.out.println("A quantidade de pessoas com cabelo ruivo e não possuem olhos azuis é de:"+qtdRuivoAzul);
		if (qtdIdade50>0) {
			System.out.println("A quantidade de pessoas com idade superior a 50 anos e com peso inferior a 60 quilos é de:"+qtdIdade50);
		} else {
			System.out.println("A quantidade de pessoas com idade superior a 50 anos e com peso inferior a 60 quilos é 0");
		}
	}

}

