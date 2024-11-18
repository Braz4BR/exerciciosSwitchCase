package exerciciosSwitchCase;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        /*
         * Implemente uma calculadora simples que calcula o imposto baseado na faixa
         * salarial do usuário. As faixas são:
         * Até R$1.500,00: Imposto de 5%
         * De R$1.501,00 a R$3.000,00: Imposto de 10%
         * Acima de R$3.000,00: Imposto de 15%
         * Peça o valor do salário e calcule o imposto.
         */

        Scanner scan = new Scanner(System.in);

        float impostoSalario = 0;
        int caso = 0;

        System.out.println("Entre com o seu salário");
        float salario = scan.nextFloat();

        if (salario <= 1500) {
            impostoSalario = salario * 0.05f;
            caso = 1;
        } else if (salario > 1500 && salario <= 3000) {
            impostoSalario = salario * 0.10f;
            caso = 2;
        } else if (salario > 3000) {
            impostoSalario = salario * 0.15f;
            caso = 3;
        } else {

        }

        switch (caso) {
            case 1:
                System.out.println("Salário" + salario);
                System.out.println("faixa 0.05 de imposto");
                System.out.println("Imposto de R$" + impostoSalario);
                break;
            case 2:
                System.out.println("Salário" + salario);
                System.out.println("faixa 0.10 de imposto");
                System.out.println("Imposto de R$" + impostoSalario);
                break;
            case 3:
                System.out.println("Salário" + salario);
                System.out.println("faixa 0.15 de imposto");
                System.out.println("Imposto de R$" + impostoSalario);
                break;
            default:
                System.out.println("ERROR");
                break;
        }

        scan.close();
    }
}
