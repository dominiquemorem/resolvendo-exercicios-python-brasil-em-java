/*
*EXERCICIO 09
* Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
* */
package lacosDeRepeticao;

import java.util.ArrayList;

public class Exercicio09 {

    public static void main(String[] args) {


    ArrayList<Integer> array = new ArrayList<>();

    for(int i = 1; i <= 50; i++){
        if (i % 2 != 0) {
            array.add(i);
        }
    }
        System.out.println("\nNÚMEROS IMPARES DE 1 A 50:");
        System.out.println(array);
    }
}
