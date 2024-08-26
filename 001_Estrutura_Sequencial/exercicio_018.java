/*Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos). */

import java.util.Scanner;

public class exercicio_018 {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho do arquivo: ");
        float mb = scanner.nextFloat();
        System.out.print("Informe a velocidade do link: ");
        float mbps = scanner.nextFloat();
       
        float t = mb/mbps;

        System.out.println("Tempo de dowloading: " + t + "min");;

        scanner.close();

    }
}
