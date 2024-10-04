/*
* EXERCICIO 04
* Faça um Programa que leia um vetor de 10 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.
* */

package listas;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            char[] vetor = new char[10];
            int consoante = 0;

            System.out.print("\nDigite uma palavra com 10 caracteres: ");
            String palavra = sc.nextLine();


            if (palavra.length() != 10) {
                System.out.println("A palavra deve conter exatamente 10 caracteres.");
                return;
            }


            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = palavra.charAt(i);
            }


            System.out.print("Consoantes: ");
            for (char i : vetor) {
                char c = Character.toLowerCase(vetor[i]);
                if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && Character.isLetter(c)) {
                    System.out.print(vetor[i] + " ");
                    consoante++;
                }
            }

            System.out.printf("\nQuantidade de consoantes: %d%n", consoante);
        }
    }

