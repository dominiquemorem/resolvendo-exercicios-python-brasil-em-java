/*
* EXERCICIO 08
* Faça um programa que leia 5 números e informe a soma e a média dos números.
* */
package lacosDeRepeticao;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int posNum = 1;
        double num, soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.printf("\nDigite o %d numero: ", posNum);
            num = sc.nextInt();
            soma += num;
            posNum++;
        }
        double media = soma / 5;
        System.out.printf("\nA soma total é %.2f e a média é %.2f", soma,media);
    }
}
