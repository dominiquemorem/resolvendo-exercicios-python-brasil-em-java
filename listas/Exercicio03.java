/*
* EXERCICIO 03
* Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
* */

package listas;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> listaNotas = new ArrayList<>();
        double nota, media = 0, somatorio = 0;

        for (int i = 1; i <= 4; i++){
            System.out.printf("Digite a %d nota: ", i);
            nota = sc.nextDouble();
            listaNotas.add(nota);
            somatorio += nota;
        }

        System.out.print("\nSOBRE AS NOTAS: ");
        System.out.print("\nAs notas são: " + listaNotas);
        System.out.printf("\nA média é: %.2f \n", somatorio/4);
    }
}
