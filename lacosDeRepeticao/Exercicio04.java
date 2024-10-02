/*
* EXERCICIO 04:
*
* Supondo que a população de um país A seja da ordem de 80000 habitantes
* com uma taxa anual de crescimento de 3% e que a população de B seja 200000
* habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule
* e escreva o número de anos necessários para que a população do país A ultrapasse
* ou iguale a população do país B, mantidas as taxas de crescimento.*/

package lacosDeRepeticao;

public class Exercicio04 {

    public static void main(String[] args) {


        double popA = 80000, popB = 200000, ano = 0, crescA = 0.03, crescB = 0.015;


        while(popB > popA){
            popA += popA * crescA;
            popB += popB * crescB;
            ano++;
        }
        System.out.printf("\nA cidade A obteve população igual ou superior a cidade B %f anos depois\n", ano);
    }
}
