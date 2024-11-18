package exerciciosSwitchCase;

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        /*Crie um programa que converta a temperatura de Celsius para Fahrenheit e
         * vice-versa. O usuário deve escolher a conversão:
         * 
         * Celsius para Fahrenheit
         * Fahrenheit para Celsius
         */

         Scanner scan = new Scanner(System.in);
        float tempConvertida =0;

        System.out.println("Conversora de temperatura");
        
        System.out.println("Coloque a temperatura que deseja converter");
        Float temp = scan.nextFloat();
        
        System.out.println("Deseja ir de: \n[1] - F para C \nou\n[2] - C para F");
        int escolha = scan.nextInt();

        switch (escolha) {
            case 1:
                tempConvertida = (5.0f / 9.0f) * (temp - 32);
                System.out.println(temp + "F é igual a " + tempConvertida + "C");
                break;
            case 2:
                tempConvertida = (temp * 9.0f / 5.0f) + 32;
                System.out.println(temp + "C é igual a " + tempConvertida + "F");
                break;
            default:
                break;
        }

         scan.close();
    }
}
