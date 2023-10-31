package sprintJava;

import java.util.Scanner;

public class Sprint4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[] equipes = new int[5];
		int[] design = new int[5];
		int[] resultado = new int[5];
		int[] vencedores = new int[5];
		
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
			System.out.print("Digite a nota de design da equipe "+ equipes[i]+": (de 0 a 10): ");
			design[i]=sc.nextInt();
			//Verificação da nota de design
			while(design[i] < 0 || design[i] > 10) {
				System.out.print("Digite a nota de 0 a 10: ");
				design[i]=sc.nextInt();
			} //Fim da verificação							
		}
		
		System.out.println("\n---------- COMBATES ----------");
		
		for(int i = 0; i < 5; i++) {
			for(int j = i + 1; j < 5; j++) {
				resultado[i] = (int) (Math.random()*10) + 1;
				resultado[j] = (int) (Math.random()*10) + 1;
				System.out.print("\n" + "Equipe " + equipes[i] + ": " + resultado[i] + " pontos" + " VS " + "Equipe " 
				+ equipes[j] + ": " + resultado[j] + " pontos");	
				//Checando por empates
				if(resultado[i] == resultado[j]) {
					if(design[i] > design[j]) {
						resultado[i] += 1;						
					} else {
						if(design[j] > design[i]) {
							resultado[j] += 1;
						}
					}
				}
				//Checando quem foi o vencedor
				if(resultado[i] > resultado[j]) {
					System.out.println("\n" + "Equipe " + equipes[i] + " Vencedora");
					vencedores[i]++;
				} else {
					System.out.println("\n" + "Equipe " + equipes[j] + " Vencedora");
					vencedores[j]++;
				}
			}
		}
		
		//3 melhores participantes
		
		System.out.println("\n---------- FASE FINAL ----------");
		
		int[] maioresIndices = new int[4];
		
		for(int i = 0; i < 3; i++) {
			int maiorIndice = -1;
			int maiorVitoria = -1;
			for(int j  = 0 ; j < 5; j++) {
				if(vencedores[j] > maiorVitoria) {
					maiorVitoria = vencedores[j];
					maiorIndice = j;
				} else if(vencedores[i] > maiorVitoria) {
					maiorVitoria = vencedores[i];
					maiorIndice = i;
				}
			}
			maioresIndices[i] = maiorIndice;		
			System.out.println("Equipe " + equipes[maiorIndice]);
			vencedores[maiorIndice] = -1;
		}
		
		
		for(int i = 0; i < 3; i++) {
			resultado[i] = (int) (Math.random()*2) + 1;
			resultado[i + 1] = (int) (Math.random()*2) + 1;
			int melhorIndice = 0;
			int melhorVitoria = 0;
			for(int j  = 0 ; j < 5; j++) {
				if(vencedores[j] > melhorVitoria) {
					melhorVitoria = vencedores[j];
					melhorIndice = j;
				} else if(vencedores[i] > melhorVitoria) {
					melhorVitoria = vencedores[i];
					melhorIndice = i;
				}
			}
			//Não repetir equipes
			if(i == 2) {
				equipes[maioresIndices[i + 1]] = equipes[maioresIndices[0]];
				equipes[maioresIndices[i]] = equipes[maioresIndices[2]];
			}
			
			System.out.print("\n" + "Equipe " + equipes[maioresIndices[i]] + ": " + resultado[i] + " pontos" + " VS " + "Equipe " 
					+ equipes[maioresIndices[i + 1]] + ": " + resultado[i + 1] + " pontos");	
			vencedores[melhorIndice] = 0;
			
			//Empates
			if(resultado[i] == resultado[i + 1]) {
				if(design[i] > design[maioresIndices[i + 1]]) {
					vencedores[i] += 1;
				} else {
					if(design[maioresIndices[i + 1]] > design[i]) {
						vencedores[i + 1] += 1;
					}
				}
			}
			//Vitórias
			if(resultado[i] >= 2) {
				vencedores[i]++;
			} else if(resultado[i + 1] >= 2){
				vencedores[i + 1]++;
			} 
		}
		
		System.out.println("");//Separar/dar espaço no console
		
		System.out.println("\n---------- EQUIPE CAMPEÃ ----------");
		
		for(int i = 0; i < 3; i++) {
			if(vencedores[i] > vencedores[i + 1]) {
				System.out.println("\n" + "Equipe " + equipes[maioresIndices[i]] + " Vencedora");	
				break;
			} else if(vencedores[i] < vencedores[i + 1]){
				System.out.println("\n" + "Equipe " + equipes[maioresIndices[i + 1]] + " Vencedora");		
				break;
			}
		}
		
	}

}
