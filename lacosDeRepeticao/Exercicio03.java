/*
EXERCÍCIO 03:
Faça um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd';*/

package lacosDeRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        char sexo;
        char estadoCivil;

        do{
            System.out.print("\nDigite o seu nome: ");
            nome = sc.nextLine();
        }while(nome.length() <= 3);

        do{
            System.out.print("\nDigite a sua idade: ");
            idade = sc.nextInt();
        }while((idade < 0) || (idade > 150));

        do{
            System.out.print("\nDigite o seu salário: ");
            salario = sc.nextDouble();
        }while(salario < 1);

        do{
            System.out.print("\nDigite o seu sexo: ");
            sexo = sc.next().charAt(0);
        }while((sexo != 'm') && (sexo != 'f'));

        do{
            System.out.print("\nDigite o seu estado civil: ");
            estadoCivil = sc.next().charAt(0);
        }while((estadoCivil != 's') && (estadoCivil != 'c') && (estadoCivil != 'd') && (estadoCivil != 'v'));

        System.out.print("\n\nFICHA DA PESSOA: ");
        System.out.printf("\n\nNome: %s\nIdade: %d\nSalário: %.2f\nSexo: %c\nEstado Civil: %c", nome, idade, salario, sexo, estadoCivil);

        sc.close();
    }
}
