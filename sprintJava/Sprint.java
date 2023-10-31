package sprintJava;

import java.util.Scanner;

public class Sprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[] equipes = new int[5];
		int[] design = new int[5];
		int[] quant = new int[5];
		char[] resultado = new char[5];
		int[] pont = new int[6];
		
		System.out.println("\n---------- ENTRADA PARA A COMPETIÇÃO ----------");
		//Estrutura de repetição para os números da equipe
		for(int i = 0; i < 5; i++) {
			System.out.print("Digite o número da equipe (de 11 a 99): ");
			equipes[i]=sc.nextInt();	
			while(equipes[i] < 11 || equipes[i] > 99) {
				System.out.print("Digite o número da equipe corretamente (de 11 a 99): ");
				equipes[i]=sc.nextInt();
			}
		}
		
		System.out.println("\n---------- DADOS DAS EQUIPES ----------");
		//Estrutura de repetição para os resultados/quantidades de lutas e notas de design
		for(int i = 0; i < 5; i++) {
			
			System.out.print("Digite a quantidade de lutas da equipe "+ equipes[i] + ": ");
			quant[i]=sc.nextInt();
			
			 for(int j = 0; j < quant[i]; j++) {
				System.out.print("Digite o resultado da equipe "+ equipes[i]+ ": ");
				resultado[i]=sc.next().toUpperCase().charAt(0);
				
				//Verificação dos resultados
				while(resultado[i] != 'V' && resultado[i] != 'E' && resultado[i] != 'D') {
					System.out.print("Utilize 'V' para vitória, 'E' para empate, 'D' para derrota: ");
					resultado[i]=sc.next().toUpperCase().charAt(0);
				} //Fim da verificação 
				
				//Atribuindo pontos aos resultados das lutas
				if(resultado[i] =='V') {
					pont[i]+= 5;
				} else {
					if(resultado[i] == 'E') {
						pont[i]+= 3;		
					} else {
						if(resultado[i] == 'D') {
							pont[i]+=0;		
						}
					}
				} //Fim da atribuição
			}
			
			System.out.print("Digite a nota de design da equipe "+ equipes[i]+": (de 0 a 10): ");
			design[i]=sc.nextInt();
			
			//Verificação da nota de design
			while(design[i] < 0 || design[i] > 10) {
				System.out.print("Digite a nota de 0 a 10: ");
				design[i]=sc.nextInt();
			} //Fim da verificação
			
		}
			
		for(int i = 0; i < 5; i++) {
			for(int j = i + 1; j < 5; j++) {
				if(pont[i] == pont[j]) {
					if(design[i] > design[j]) {
						pont[i] += design[i];						
					} else {
						if(design[j] > design[i]) {
							pont[j] += design[j];
						}
					}
				}
				if(pont[i] < pont[j]) {
					int temp = pont[i];
					int temp2 = equipes[i];
					pont[i] = pont[j];
					pont[j] = temp;
					equipes[i] = equipes[j];
					equipes[j] = temp2;
				} 
			}		
		}
		
		System.out.println("\n---------- RESULTADO FINAL ----------");
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Equipe: "+equipes[i] + ": Pontuação: " + pont[i]);
		}
				
	}

}
