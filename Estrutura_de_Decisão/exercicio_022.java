/* Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
“Telefonou para a vítima? “ 

“Esteve no local do crime?” 

“Mora perto da vítima? “

“Devia para a vítima? “

“Já trabalhou com a vítima? “

O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve ser classificada como “Suspeita”, entre 3 e 4 como “Cúmplice” e 5 como “Assassino“. Caso contrário, ele será classificado como “Inocente“.*/

import java.util.Scanner;

public class exercicio_022 {
    
    public static void main(String[] args){

        char resposta1;
        char resposta2 ;
        char resposta3 ;
        char resposta4 ;
        char resposta5 ;
        int contador = 0;
        String entrada1;
        String entrada2;
        String entrada3;
        String entrada4;
        String entrada5;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Responda 's' para sim e 'n' para não.\nTelefonou para a vítima?");
        entrada1 = scanner.next();
        resposta1 = entrada1.charAt(0);
        System.out.println("Esteve no local do crime?");
        entrada2 = scanner.next();
        resposta2 = entrada2.charAt(0);
        System.out.println("Mora perto da vitima?");
        entrada3 = scanner.next();
        resposta3 = entrada3.charAt(0);
        System.out.println("Devia para a vitima?");
        entrada4 = scanner.next();
        resposta4 = entrada4.charAt(0);
        System.out.println("Já trabalhou com a vitima?");
        entrada5 = scanner.next();
        resposta5 = entrada5.charAt(0);

        if(resposta1 == 's'){

            contador ++;
        }
        if(resposta2 == 's'){

            contador ++;
        }
        if(resposta3 == 's'){

            contador ++;
        }
        if(resposta4 == 's'){

            contador ++;
        }
        if(resposta5 == 's'){

            contador ++;
        }
        if(contador == 2){

            System.out.println("Suspeito");
        }
        else if(contador >= 3 && contador <= 4){

            System.out.println("Cumplice");
        }
        else if(contador == 5){

            System.out.println("Assassino");
        }
        else{

            System.out.println("Inocente");
        }

        scanner.close();

    }
}
