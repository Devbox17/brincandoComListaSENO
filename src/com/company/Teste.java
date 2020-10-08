package com.company;

import java.util.Scanner;

public class Teste {

    static Scanner scanner = new Scanner(System.in);

    static void menu() {
        System.out.println("Olá abiguinho seja bem vindo, a esse app de perguntinhas!");
        scanner.nextLine();
        System.out.println("É bem simples jogar!");
        scanner.nextLine();
        System.out.println("Vai aparecer as perguntas, e você deve escolher uma resposta");
        System.out.println("dentre as 4 possíveis, de acordo com o número de cada resposta.");
        scanner.nextLine();
        System.out.println("\nEntendeu? Então bora!");
        scanner.nextLine();

        System.out.println("\n\n-------- 1° Pergunta --------");
        System.out.println("\n    Irmã Mafe é gente boa?");
        System.out.println("\n1 - Sim       2 - Não\n3 - Talvez    4 - Ela tem um ASUS");
        System.out.print("\nDigite o número da opção: ");
        int op = scanner.nextInt();

        while (op != 5) {
            switch (op) {
                case 1:
                    System.out.println("\nVerdade ela é gente boa!\n\n");
                    scanner.nextLine();
                    menu();
                    break;

                case 2:
                    System.out.println("\nMentira, ela é gente boa, seu fresco(a)!\n\n");
                    scanner.nextLine();
                    menu();
                    break;

                case 3:
                    System.out.println("\nTalvez seja mesmo!\n\n");
                    scanner.nextLine();
                    menu();
                    break;

                case 4:
                    System.out.println("\nEssa resposta não faz sentido, mas é ASUS!! Então tá valendo.\n\n");
                    scanner.nextLine();
                    menu();
                    break;
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
