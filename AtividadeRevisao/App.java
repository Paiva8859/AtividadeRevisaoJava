package AtividadeRevisaoJava.AtividadeRevisao;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int exe = 1;

        while (exe > 0) {

        System.out.println("Qual objeto deseja executar? Para cancelar digite 0");
        exe = sc.nextInt();

        switch (exe){ 
            case 1:
                AtividadeRevisao obj1 = new AtividadeRevisao();
                obj1.exemplo1();
            break;
        
        }

        }
        sc.close();
    }
}
