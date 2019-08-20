package br.com.frw;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe sua turma: ");
        String turma = leitor.nextLine();


        System.out.println("Informe a nota da primeira prova: ");
        Double prova1 = leitor.nextDouble();
        leitor = new Scanner(System.in);

        System.out.println("Informe a nota da segunda prova: ");
        Double prova2 = leitor.nextDouble();
        leitor = new Scanner(System.in);

        System.out.println("Informe a nota total de exercicios: ");
        Double exercicios = leitor.nextDouble();
        leitor = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = leitor.nextLine();
        leitor = new Scanner(System.in);

        Double total = prova1+(prova2*2)+exercicios;



        System.out.println("Nome: " + nome);
        System.out.println("Turma: "+turma);
        if(total >=100){
            System.out.println("Total das notas: 100");
        }else {
            System.out.println("Total das notas: " + total);
        }

        if (total >= 60){
            System.out.println("Aprovado!!");
        }else if(total >=50 && total <=59){
            System.out.println("Recuperação - Prova 1");
        }else if(total >=40 && total <=49){
            System.out.println("Recuperação - Prova 2");
        }else{
            System.out.println("Reprovado");
        }

    }
}
