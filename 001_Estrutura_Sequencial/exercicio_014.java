/* João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas. */

import java.util.Scanner;

public class exercicio_014 {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o peso: ");
        float peso = scanner.nextFloat();

        float peso_excedente = peso - 50;
        float multa = peso_excedente*4;

        System.out.println("Peso: " + peso + "Kg");
        System.out.println("Peso excedente: " + peso_excedente + "Kg");
        System.out.println("Multa R$: " + multa);

        scanner.close();

    }
}
