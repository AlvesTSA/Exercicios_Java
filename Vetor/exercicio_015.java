/*15. Faça um programa que leia um número indeterminado de valores, correspondentes a notas, encerrando a entrada de dados quando for informado um valor igual a -1 (que não deve ser armazenado). Após esta entrada de dados, faça:

 a. Mostre a quantidade de valores que foram lidos; 

 b. Exiba todos os valores na ordem em que foram informados, um ao lado do outro; 

 c. Exiba todos os valores na ordem inversa à que foram informados, um abaixo do outro;

 d. Calcule e mostre a soma dos valores;
 
 e. Calcule e mostre a média dos valores;

 f. Calcule e mostre a quantidade de valores acima da média calculada;

 g. Calcule e mostre a quantidade de valores abaixo de sete;

 h. Encerre o programa com uma mensagem;

*/

import java.util.Scanner;

public class exercicio_015 {

    public static void main(String[] args) {
        
        float[] notas = new float[100];
        int count1 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe as notas e digite -1 para finalizar:");

        for (int i = 0; i < notas.length; i++) {
            
            System.out.println("Informe a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextFloat();

            if (notas[i] == -1) {
                break;
            }

            count1++;
        }

        //a. Mostre a quantidade de valores que foram lidos;

        System.out.println("Quantidade de valores lidos: " + count1);

        //b. Exiba todos os valores na ordem em que foram informados, um ao lado do outro;
        System.out.print("Valores lidos: ");
        for (int i = 0; i < count1; i++) {
            
            System.out.print(notas[i] + " ");
        }

        //c. Exiba todos os valores na ordem inversa à que foram informados, um abaixo do outro;
        System.out.println("\nValores lidos na ordem inversa: ");
        for (int i = count1 - 1; i >= 0; i--) {
            
            System.out.println(notas[i]);
        }
        
        //d. Calcule e mostre a soma dos valores;
        float soma = 0;
        for (int i = 0; i < count1; i++) {
            
            soma += notas[i];
        }
        System.out.println("Soma: " + soma);

        //e. Calcule e mostre a média dos valores;
        float media = 0;
        media = soma / count1;
        System.out.println("Media: " + media);

        //f. Calcule e mostre a quantidade de valores acima da média calculada;
        int count2 = 0;
        for (int i = 0; i < count1; i++) {
            
            if (notas[i] > media) {
                count2++;
            }
        }
        System.out.println("Quantidade de valores acima da media: " + count2);

        //g. Calcule e mostre a quantidade de valores abaixo de sete;
        int count3 = 0;
        for (int i = 0; i < count1; i++) {
            
            if (notas[i] < 7.0) {
                count3++;
            }
        }
        System.out.println("Quantidade de valores abaixo de 7: " + count3);

        //h. Encerre o programa com uma mensagem;

        System.out.println("Obrigado pela participacao");

        scanner.close();
    }    
}