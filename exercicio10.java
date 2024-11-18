package exerciciosSwitchCase;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        /*Crie um programa que calcule o fatorial de um número utilizando um switch case para selecionar as operações, mas para esse exercício, será necessário usar o switch case para verificar as condições.  */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro para calcular o fatorial:");
        int numero = scanner.nextInt();

        
        if (numero < 0) {
            System.out.println("Fatorial não é definido para números negativos.");
        } else {
            long fatorial = 1;
            int contador = numero;

            
            while (contador > 0) {
                switch (contador) {
                    case 1:
                        fatorial *= 1;
                        break;
                    default:
                        fatorial *= contador;
                        break;
                }
                contador--;
            }

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        scanner.close();
    }
}
