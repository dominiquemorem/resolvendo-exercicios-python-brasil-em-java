/*
 * EXERCICIO 05:
 * Altere o programa anterior permitindo ao usuário informar
 * as populações e as taxas de crescimento iniciais. Valide a entrada
 * e permita repetir a operação.
 *
 * EXERCICIO 04:
 *
 * Supondo que a população de um país A seja da ordem de 80000 habitantes
 * com uma taxa anual de crescimento de 3% e que a população de B seja 200000
 * habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule
 * e escreva o número de anos necessários para que a população do país A ultrapasse
 * ou iguale a população do país B, mantidas as taxas de crescimento.
 */

package lacosDeRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            double popA, popB, ano = 0, crescA, crescB;

            System.out.print("\nDigite o número da população A: ");
            popA = sc.nextInt();

            System.out.print("\nDigite o número da população B: ");
            popB = sc.nextInt();

            System.out.print("\nDigite a taxa de crescimento da população A: ");
            crescA = sc.nextDouble();

            System.out.print("\nDigite a taxa de crescimento da população B: ");
            crescB = sc.nextDouble();


            while(popB > popA){
                popA += popA * (crescA / 100);
                popB += popB * (crescB / 100);
                ano++;
            }
            System.out.printf("\nA cidade A obteve população igual ou superior a cidade B %f anos depois \n", ano);
            sc.close();
        }
    }

