/*
* EXERCICIO O2
* Faça um programa que leia um nome de usuário e a sua senha e não aceite
* a senha igual ao nome do usuário, mostrando uma mensagem de erro e
* voltando a pedir as informações.*/
package lacosDeRepeticao;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String usuario;
        String senha;

        while (true) {
            System.out.print("\nDigite o seu usuario: ");
            usuario = sc.nextLine();
            System.out.print("Digite a sua senha: ");
            senha = sc.nextLine();

            if (!usuario.equals(senha)) break;

            System.out.print("\nUsuário igual a senha. Tente novamente!\n");
        }

        System.out.printf("\nUSUARIO E SENHA DIFERENTES: \nUsuario: %s \nSenha: %s.",usuario, senha);
    }
}
