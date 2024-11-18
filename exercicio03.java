package exerciciosSwitchCase;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        /*
         * Crie um programa que leia a idade de uma pessoa e mostre a classificação
         * etária utilizando switch case. As classificações são:
         * 0-12 anos: "Criança"
         * 13-17 anos: "Adolescente"
         * 18-59 anos: "Adulto"
         * 60 ou mais: "Idoso"
         */
        int controle = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com sua idade e descubra sua classificação etária:");
        int idade = scan.nextInt();

        
        if (idade >= 0 && idade <= 12) {
            controle = 1;
        } else if (idade >= 13 && idade <= 17) {
            controle = 2;
        } else if (idade >= 18 && idade <= 59) {
            controle = 3;
        } else if (idade >= 60) {
            controle = 4;
        } else {
            controle = -1;
        }

        
        switch (controle) {
            case 1:
                System.out.println("Criança! Idade: " + idade);
                break;
            case 2:
                System.out.println("Adolescente! Idade: " + idade);
                break;
            case 3:
                System.out.println("Adulto! Idade: " + idade);
                break;
            case 4:
                System.out.println("Idoso! Idade: " + idade);
                break;
            default:
                System.out.println("Idade inválida!");
                break;
        }

        scan.close();
    }
}
