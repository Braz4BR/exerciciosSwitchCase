package exerciciosSwitchCase;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        /*
         * Implemente um menu de opções onde o usuário pode escolher entre 3 opções:
         * Exibir "Olá, Mundo!"
         * Exibir "Bem-vindo ao C#"
         * Sair do programa
         * Utilize switch case para executar a opção escolhida.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Exibir 'Olá, Mundo!'");
        System.out.println("2 - Exibir 'Bem-vindo ao C#'");
        System.out.println("3 - Sair do programa");
        int escolha = scan.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("Olá, Mundo!");
                break;
            case 2:
                System.out.println("Bem-vindo ao C#");
                break;
            case 3:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        scan.close();
    }
}
