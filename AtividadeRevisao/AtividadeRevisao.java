package AtividadeRevisaoJava.AtividadeRevisao;

import java.util.Scanner;

/**
 * AtividadeRevisao
 */
public class AtividadeRevisao {

    Scanner sc = new Scanner(System.in);


    public void exemplo1(){
        System.out.println("Informe a nota 1 do aluno");
        double nota1 = sc.nextDouble();
        System.out.println("Informe a nota 2 do aluno");
        double nota2 = sc.nextDouble();
        double media = (nota1 + nota2)/2;
        if (media>= 50) {
            System.out.println( "A média do aluno é: " + media + ". O aluno está aprovado por media");
        } else {
            System.out.println( "A média do aluno é: " + media + ". O aluno está reprovado por media");
        }
        
        System.out.println("Informe o total de aulas dadas");
        double aulas = sc.nextDouble();

        System.out.println("Informe o número de faltas do aluno");
        double faltas = sc.nextDouble();

        double x = (100*faltas)/aulas; //porcentagem de frequencia

        System.out.println( "O aluno compareceu em "+ (100 - x) + "% das aulas" );

        if (100-x >=75) {
            System.out.println("O aluno está aprovado por frequência");
        } else {
        System.out.println("O aluno está reprovado por frequência");           
        }

        if (media >=50 && (100 - x) >= 75) {
            System.out.println("O aluno está aprovado no curso!");
        }
        else if (media < 50 && (100 - x) >= 75) {
            System.out.println("O aluno não possui media alta o suficiente para ser aprovado, mas pode realizar a recuperaçao");
        } 
        else {
            System.out.println("O aluno está reprovado no curso!");
        }

        System.out.println("================================================");

    }

}