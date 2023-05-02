/*Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido. */

import java.util.Scanner;

public class exercicio_003 {
    
    public static void main(String[] args){

        char letra;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma letra de acordo com a descrição\nF - Feminino\nM - Masculino");
        /*o método nextChar() para ler a entrada do usuário, não existe na classe Scanner, e por isso, o código não será compilado. Para corrigir, pode-se utilizar o método next() para ler a entrada como uma string e então pegar o primeiro caractere dessa string usando o método charAt(0) */
        String entrada = scanner.next();  
        letra = entrada.charAt(0);

        if (letra == 'M') {
            
            System.out.print("Sexo masculino");
        }
        else if(letra == 'F'){

            System.out.print("Sexo feminino");
        }
        else{

            System.out.print("Sexo inválido");

        }

        scanner.close();

    }
}
