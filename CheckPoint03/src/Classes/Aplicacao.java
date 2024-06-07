package Classes;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        List<Obra> obras = new LinkedList<>();
        obras.add(new Pintura(1, LocalDate.of(2024, 06, 06),"José"
                , "Castro Alves", "Tipo J" ));
        obras.add(new Pintura(2, LocalDate.of(2024, 05, 02)
                , "Joseph", "Colégio Objetivo", "Tipo A"));
        obras.add(new Pintura(3, LocalDate.of(2024, 04, 01)
                , "Jotaro", "Colégio Raimon", "Tipo B"));
        obras.add(new Escultura(4, LocalDate.of(2024, 03, 06), "João Banana", "Tipo J"));
        obras.add(new Escultura(4, LocalDate.of(2024, 02, 02), "Karen Melancia", "Tipo C"));
        obras.add(new Escultura(4, LocalDate.of(2024, 01, 07), "Pedro Abacate", "Tipo F"));

        System.out.print("Digite o Seu Nome: ");
        String nomePessoa = sc.next();
        System.out.print("Digite o seu email: ");
        String email = sc.next();
        System.out.print("Digite seu telefone: ");
        String telefone = sc.next();

        System.out.println("Escolha a obra que mais gostou: ");
        for(int i = 0; i < obras.size(); i++){
            System.out.println((i + 1) + ". " + obras.get(i));
        }
        int escolhaObra = sc.nextInt();
        sc.nextLine();

        Obra obraEscolhida = obras.get(escolhaObra - 1);
        Voto voto = new Voto(nomePessoa, email, telefone);
        System.out.println("Voto Registrado: " + voto);
        System.out.println("Você votou na Obra: " + obraEscolhida);
    }
}
