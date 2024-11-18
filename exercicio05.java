package exerciciosSwitchCase;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        /*
         * Peça ao usuário para inserir uma nota de 0 a 10 e, com base na nota, imprima
         * a
         * classificação:
         * 9 a 10: "A"
         * 7 a 8: "B"
         * 5 a 6: "C"
         * 3 a 4: "D"
         * 0 a 2: "F"
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com sua nota [0-10]");
        int nota = scan.nextInt();

        switch (nota) {
            case 9:
            case 10:
                System.out.println("A");
                break;
            case 8:
            case 7:
                System.out.println("B");
                break;
            case 6:
            case 5:
                System.out.println("C");
                break;
            case 4:
            case 3:
                System.out.println("D");
                break;
            case 2:
            case 1:
            case 0:
                System.out.println("F");
                break;

            default:
                System.out.println("ERROR");
                break;

        }
        scan.close();
    }
}
