/*2. Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações. */

import java.util.Scanner;

public class exercicio_002 {
    
    public static void main(String[] args) {
        
        String nome = "";
        String senha = "";

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Informe o nome: ");
            nome = scanner.next();
            System.out.println("Informe a senha: ");
            senha = scanner.next();

            if(nome.equals(senha)){

                System.out.println("ERRO: o nome deve ser diferente da senha");
            }

        }while(nome.equals(senha));
        
        System.out.println("Nome e senha validados com sucesso");

        scanner.close();
    }
}
