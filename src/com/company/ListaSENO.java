package com.company;

import java.util.Scanner;

public class ListaSENO {
    static Scanner scanner = new Scanner(System.in);
    private Elemento inicio;
    private Elemento fim;
    private Elemento aux;
    private Elemento anterior;
    private int tamanho;

    ListaSENO() {
        inicio = null;
        fim = null;
        aux = null;
        anterior = null;
        tamanho = 0;
    }

    void inserirInicio() {
        System.out.printf("Valor: ");
        int valor = scanner.nextInt();

        Elemento novo = new Elemento();
        novo.valor = valor;

        if (inicio == null) {
            inicio = novo;
            fim = novo;
            novo.prox = null;
        } else {
            novo.prox = inicio;
            inicio = novo;
        }
        tamanho++;
    }

    void inserirFim() {
        System.out.printf("Valor: ");
        int valor = scanner.nextInt();

        Elemento novo = new Elemento();
        novo.valor = valor;

        if (inicio == null) {
            inicio = novo;
            fim = novo;
            novo.prox = null;
        } else {
            fim.prox = novo;
            fim = novo;
            fim.prox = null;
        }
        tamanho++;
    }

    void retiraElemento() {
        System.out.printf("Valor: ");
        int valor = scanner.nextInt();

        aux = inicio;
        anterior = null;

        while (aux != null) {
            if (aux.valor == valor) {
                if (aux == inicio) {
                    inicio = aux.prox;
                    aux = inicio;
                    tamanho--;
                } else if (aux == fim) {
                    anterior.prox = null;
                    fim = anterior;
                    aux = null;
                    tamanho--;
                } else {
                    anterior.prox = aux.prox;
                    aux = aux.prox;
                    tamanho--;
                }
            } else {
                anterior = aux;
                aux = aux.prox;
            }
        }
        System.out.println("Elemento retirado!");
    }

    void mostrarLista() {
        aux = inicio;

        if (inicio == null) {
            System.out.println("Não existe nenhum elemento na lista!");
            scanner.nextLine();
        }
        else {
            while (aux != null) {
                System.out.printf("%d\n", aux.valor);
                aux = aux.prox;
            }
            System.out.println();
            scanner.nextLine();
        }
    }

    void menu() {
        int op;

        do {
            System.out.println("1 - Inserir Inicio");
            System.out.println("2 - Inserir Fim");
            System.out.println("3 - Retirar elemento");
            System.out.println("4 - mostrar elementos");
            System.out.println("5 - sair");
            System.out.print("Opção: ");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    inserirInicio();
                    break;

                case 2:
                    inserirFim();
                    break;

                case 3:
                    retiraElemento();
                    break;

                case 4:
                    mostrarLista();
                    break;
            }
        } while (op != 5);
    }

}
