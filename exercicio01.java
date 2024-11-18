package exerciciosSwitchCase;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        //Peça ao usuário para digitar um número de 1 a 7 e, em seguida, imprima o nome do dia correspondente (1 = "Domingo", 2 = "Segunda-feira", etc.). Use o comando switch case. 

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite  o dia da semana que quer saber: ");
        String day = scan.nextLine();

        switch (day) {
            case "1":
                System.out.println("Domingo");
                break;
        
            case "2":
            System.out.println("Segunda");
                break;
        
            case "3":
            System.out.println("Terça");
                break;
        
            case "4":
            System.out.println("Quarta");
                break;
        
            case "5":
            System.out.println("Quinta");
                break;
        
            case "6":
            System.out.println("Sexta");
                break;
        
            case "7":
            System.out.println("Sábado");
                break;

            default:
            System.out.println("Dia invalido");
                break;
        }
        scan.close();


    }
} 
