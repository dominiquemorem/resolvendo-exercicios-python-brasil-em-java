
/*
* EXERCICIO 07
* Faça um programa que leia 5 números e informe o maior número.
* */
package lacosDeRepeticao;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        int posicao = 1, num ,maior = 0;

        for(int i = 0; i < 5; i++){
            System.out.printf("Digite o %d número: ", posicao);
            num = sc.nextInt();
            array.add(num);
            posicao++;
        }

        for (int x : array){
            if(x > maior){
                maior = x;
            }
        }
        System.out.println("O maior número é: " + maior);
    }
}
