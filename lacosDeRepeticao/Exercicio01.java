/*
* EXERCICIO 01:
* Faça um programa que peça uma nota, entre zero e dez.
* Mostre uma mensagem caso o valor seja inválido e continue
* pedindo até que o usuário informe um valor válido.*/

package lacosDeRepeticao;

import java.util.Scanner;

        public class Exercicio01 {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                int nota;

                while (true){
                    System.out.print("\nDigite uma nota: ");
                    nota = sc.nextInt();

                    if ((nota >= 0) && (nota <= 10)) break;

                    System.out.print("Nota inválida!!");
                }
                System.out.printf("\nNota válida %d", nota);
            }
        }



