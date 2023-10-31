import java.util.Scanner;

public class Exercício05 {

	public static void main(String[] args) {

		int num=0,numMaior=0,numMenor=0;
		Scanner entrada = new Scanner(System.in);
		
		for(int i=0;i<5;i++){
			System.out.print("Digite um número:");
			num=entrada.nextInt();
			
			if(i==0){
				numMaior=num;
				numMenor=num;
			}
			
			if(num>numMaior){
				numMaior=num;
			}
			if(num<numMenor){
				numMenor=num;
			}
		}//fecha for
		System.out.println("Número maior:"+numMaior);
		System.out.println("Número menor:"+numMenor);

	}
}
