/*
* EXERCICIO 02:
* Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.
* */

package listas;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    ArrayList<Double> lista = new ArrayList<>();
    double num;

    for(int i = 1; i <= 10; i++){
        System.out.printf("Digite o %d número: ", i);
        num = sc.nextDouble();
        lista.add(num);
        }
        Collections.reverse(lista);
        // System.out.println("\n\n" + lista);
    DecimalFormat df = new DecimalFormat("#.00");

    int count = 0;
    System.out.print("\nLISTAGEM FINAL: ");
    for (double x : lista){

        System.out.print(df.format(x));
        count++; // Incrementa o contador
        if (count < lista.size()) { // Verifica se não é o último elemento
            System.out.print(" , ");
        }
    }
    }

}
