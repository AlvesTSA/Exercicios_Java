/*14. Utilizando listas faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:

"Telefonou para a vítima?" 

"Esteve no local do crime?" 

"Mora perto da vítima?"

"Devia para a vítima?"

"Já trabalhou com a vítima?"

O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".*/

import java.util.Scanner;

public class exercicio_014 {
    
    public static void main(String[] args){

        String[] resposta = new String[5];
        int s = 0;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Responda as perguntas com s para sim e n para nao\n");
        System.out.println("Telefonou para a vítima?");
        resposta[0] = scanner.next();
        System.out.println("Esteve no local do crime?");
        resposta[1] = scanner.next();
        System.out.println("Mora perto da vítima?");
        resposta[2] = scanner.next();
        System.out.println("Devia para a vítima?");
        resposta[3] = scanner.next();
        System.out.println("Já trabalhou com a vítima?");
        resposta[4] = scanner.next();

        for (int i = 0; i < resposta.length; i++) {
            
            if (resposta[i] .equals("s") || resposta[i] .equals("S") ){
                
                s++;
            }
        }

        if (s == 2) {
            
            System.out.println("Suspeita");
        }
        else if (s > 2 && s < 5) {

            System.out.println("Cumplice");
        }
        else if (s == 5) {

            System.out.println("Assassino");
        }
        else{

            System.out.println("Inocente");
        }

        scanner.close();
    }
}
