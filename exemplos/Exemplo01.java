import java.util.Scanner;
import java.text.DecimalFormat;

public class Exemplo01 {

	public static void main(String[] args) {
		
      Scanner entrada = new Scanner(System.in);
      DecimalFormat numFormatado = new DecimalFormat("#0.00");
      
      int idade=0, cont=0, qtdId50=0, qtdAlt=0;
      double altura=0, peso=0, somaAltura=0,pesoMenor=0,porc=0;
      String nome;
      //for(int i=0;i<20;i++){
    	while(cont<2){
    		
    		System.out.print("Digite o nome:");
    		nome=entrada.next();
    		System.out.print("Digite a idade:");
    		idade=entrada.nextInt();
    		System.out.print("Digite o peso:");
    		peso=entrada.nextDouble();
    		System.out.print("Digite a altura:");
    		altura=entrada.nextDouble();
    		
    		cont++;
    		
    		//A)idade maior que 50 anos
    		if(idade>50){
    			qtdId50++;
    			
    		}
    	  
    		//B)media altura pessoas com idade entre 10 e 20 anos
    		if(idade>10 && idade<20){
    			//somaAltura<-somaAltura + altura
    			somaAltura+=altura;
    			qtdAlt++;
    		}
    	  //C) qtd peso menor 40
    		if(peso<40){
    			pesoMenor++;	
    		}
      }//fecha a repetição
    	//SAÍDAS
    	System.out.println("Qtd pessoas idade superior 5 anos:"+qtdId50);
    	if(qtdAlt==0){
    		System.out.println("Média das alturas:0");
    	}else{
    		System.out.println("Média das alturas:"+numFormatado.format(somaAltura/qtdAlt));
    	}
    	//C)
    	porc=(pesoMenor/2)*100;
    	System.out.println("Porcentagem de pessoas com peso"
    			+" menor 40 inferior 40:"+porc+"%");
	
		
		
		
		
		
	}

}
