package br.com.frw;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String val = "n";

        Aluno aluno;

        int aprovado = 0;
        int recu1=0;
        int recu2=0;
        int reprovado=0;

        Double maiorNotatotal = 0.0;
        Double valorMaiortotal = 0.0;

        String maiorNotaex = "";
        Double valorMaiorex= 0.0;

        boolean primeiraExecucao = true;


        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        Scanner leitor = new Scanner(System.in);

        do {

            System.out.println("Informe sua turma: ");
            String turma = leitor.nextLine();

            System.out.println("Informe a nota da primeira prova: ");
            Double prova1 = LeitorUtil.LerDouble(leitor);

            System.out.println("Informe a nota da segunda prova: ");
            Double prova2 = LeitorUtil.LerDouble(leitor);

            System.out.println("Informe a nota da terceira prova: ");
            Double prova3 = LeitorUtil.LerDouble(leitor);

            System.out.println("Informe a nota total de exercicios: ");
            Double exercicios = LeitorUtil.LerDouble(leitor);

            System.out.println("Informe seu nome: ");
            String nome = LeitorUtil.LerTexto(leitor);

            Double total = prova1 + prova2 + (prova3 * 2) + exercicios;

            aluno = new Aluno(nome, turma, prova1, prova2, prova3, exercicios, total);
            alunos.add(aluno);


            System.out.println("Nome: " + nome);
            System.out.println("Turma: " + turma);
            if (total >= 100) {
                total = 100.0;
                System.out.println("Total das notas: " + total);
            } else {
                System.out.println("Total das notas: " + total);
            }

            if (total >= 60) {
                System.out.println("Aprovado!!");
            } else if (total >= 50 && total < 60) {
                System.out.println("Recuperação - Prova 1");
            } else if (total >= 40 && total < 50) {
                System.out.println("Recuperação - Prova 2");
            } else {
                System.out.println("Reprovado");
            }

            System.out.println("Deseja continuar o programa? (s/n)");
            val = LeitorUtil.LerTexto(leitor);


        } while (!val.equals("n"));

       for(int i=0; i < alunos.size(); i++){
           if(alunos.get(i).total >= 60){
               aprovado++;
           }else if(alunos.get(i).total >= 50 && alunos.get(i).total <60){
               recu1++;
           }else if(alunos.get(i).total >= 40 && alunos.get(i).total <50){
               recu2++;
           }else{
               reprovado++;
           }

       }
        System.out.println("Aprovados - " + aprovado);

        System.out.println("Recuperação I - " + recu1);

        System.out.println("Recuperação II - " + recu2);

        System.out.println("Reprovado - " + reprovado);

        if(primeiraExecucao){
            maiorNotatotal = aluno.total;

            valorMaiortotal = aluno.total;
            primeiraExecucao = false;
        }else{
            if(aluno.total > valorMaiortotal) {

                valorMaiortotal = aluno.total;
                primeiraExecucao = false;
                System.out.println("Maior nota total é: " + valorMaiortotal + " - " + maiorNotatotal);
            }
            System.out.println("Maior nota total é: " + valorMaiortotal + " - " + maiorNotatotal);

        }






    }

}
