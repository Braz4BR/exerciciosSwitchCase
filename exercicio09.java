package exerciciosSwitchCase;

import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        /*
         * Crie um programa que leia a classificação etária de um filme e mostre a faixa
         * etária permitida. As classificações são:
         * G (Livre)
         * PG (Maior de 10 anos)
         * PG-13 (Maior de 13 anos)
         * R (Maior de 18 anos)
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Descubra se esse filme é recomendado para você!");
        System.out.println("Escolha a classificação do filme:\n[G]\n[PG]\n[PG-13]\n[R]");
        String classificacao = scan.nextLine();

        switch (classificacao) {
            case "G":
                System.out.println("Faixa erária permitida: LIVRE");
                break;
            case "PG":
                System.out.println("Faixa erária permitida: MAIOR QUE 10 ANOS");
                break;
            case "PG-13":
                System.out.println("Faixa erária permitida: MAIOR DE 13 ANOS");
                break;
            case "R":
                System.out.println("Faixa erária permitida: MAIOR QUE 18 ANOS");
                break;

            default:
                System.out.println("ERROR");
                break;
        }

        scan.close();
    }
}
