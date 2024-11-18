package exerciciosSwitchCase;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        // Crie um programa que leia dois números e um operador (+, -, *, /), e então
        // execute a operação correspondente. Se o operador for inválido, mostre uma
        // mensagem de erro.
        Scanner scan = new Scanner(System.in);

        float resposta = 0;

        System.out.println("entre com o primeiro valor que deseja calcular: ");
        float num1 = scan.nextFloat();
        System.out.println("Entre com o segundo valor que deseja calcular: ");
        float num2 = scan.nextFloat();

        scan.nextLine();

        System.out.println("Escolha a operação desejada: (+, -, *, /)");
        
        String escolha = scan.nextLine();

        switch (escolha) {
            case "+":
                resposta = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + resposta);
                break;

            case "-":
                resposta = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + resposta);
                break;

            case "*":
                resposta = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + resposta);
                break;

            case "/":
                resposta = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + resposta);
                break;

            default:
                System.out.println("ESCOLHA ERRADA!");
                break;
        }

        scan.close();
    }
}
