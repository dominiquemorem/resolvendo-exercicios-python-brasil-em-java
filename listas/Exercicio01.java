/*
* EXERCICIO 01
* Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.
* */

package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio01 {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        int rep = 1, num;

        for(int i = 0; i < 5; i++){
            System.out.printf("\nDigite o %d número: ", rep);
            num = sc.nextInt();
            sc.nextLine();
            lista.add(num);
            rep++;
        }

        System.out.println("\nLISTA DE NÚMEROS: \n" + lista);
    }
}