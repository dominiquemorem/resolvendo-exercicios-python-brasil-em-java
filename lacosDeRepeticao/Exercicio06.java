
/*EXERCICIO 06
* Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro.
* Depois modifique o programa para que ele mostre os números um ao lado do outro.
* */
package lacosDeRepeticao;

import java.util.ArrayList;

public class Exercicio06 {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();

        System.out.println("\nUM ABAIXO DO OUTRO: ");
        for(int i = 1; i <= 20; i++){
            System.out.println(i);
            array.add(i);
        }
        System.out.println("\nUM AO LADO DO OUTRO: ");
        System.out.print(array);
    }
}
