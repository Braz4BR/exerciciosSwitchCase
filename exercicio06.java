package exerciciosSwitchCase;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        /*
         * Crie um programa onde o usuário escolhe uma bebida pelo número:
         * Café
         * Chá
         * Suco
         * Refrigerante Use switch case para exibir a bebida escolhida.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha a bebida:: ");
        System.out.println("1 - Café");
        System.out.println("2 - Chá");
        System.out.println("3 - Suco");
        System.out.println("4 - Refrigerante");

        int escolha = scan.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("CAFÉ");
                System.out.println("Escolha entre os sabores");
                System.out.println("1 - Café com leite");
                System.out.println("2 - Café preto");
                System.out.println("3 - Café com açúcar");
                int escolhaCafe = scan.nextInt();

                switch (escolhaCafe) {
                    case 1:
                        System.out.println("Café com leite");
                        break;
                    case 2:
                        System.out.println("Café preto");
                        break;
                    case 3:
                        System.out.println("Café com açúcar");
                        break;

                    default:
                        System.out.println("ERROR");
                        break;
                }
                break;

            case 2:
                System.out.println("CHÁ");
                System.out.println("Escolha entre os sabores");
                System.out.println("1 - Chá mate");
                System.out.println("2 - Chá preto");
                System.out.println("3 - Chá ingles");
                int escolhaCha = scan.nextInt();

                switch (escolhaCha) {
                    case 1:
                        System.out.println("Chá mate");
                        break;
                    case 2:
                        System.out.println("Chá preto");
                        break;
                    case 3:
                        System.out.println("Chá ingles");
                        break;

                    default:
                        System.out.println("ERROR");
                        break;
                }

                break;
            case 3:
                System.out.println("SUCO");
                System.out.println("Escolha entre os sabores");
                System.out.println("1 - Suco de uva");
                System.out.println("2 - Suco de laranja");
                System.out.println("3 - Suco de maça");
                int escolhaSuco = scan.nextInt();

                switch (escolhaSuco) {
                    case 1:
                        System.out.println("Suco de uva");
                        break;
                    case 2:
                        System.out.println("Suco de laranja");
                        break;
                    case 3:
                        System.out.println("Suco de maça");
                        break;

                    default:
                        System.out.println("ERROR");
                        break;
                }
                break;
            case 4:
                System.out.println("REFRI");
                System.out.println("Escolha entre os sabores");
                System.out.println("1 - Colca-Cola");
                System.out.println("2 - Soda");
                System.out.println("3 - Sprite");
                int escolhaRefri = scan.nextInt();

                switch (escolhaRefri) {
                    case 1:
                        System.out.println("Colca-Cola");
                        break;
                    case 2:
                        System.out.println("Soda");
                        break;
                    case 3:
                        System.out.println("Sprite");
                        break;

                    default:
                        System.out.println("ERROR");
                        break;
                }

                break;

            default:
                System.out.println("Valor fora do cardápio..");
                break;
        }

        scan.close();
    }
}
