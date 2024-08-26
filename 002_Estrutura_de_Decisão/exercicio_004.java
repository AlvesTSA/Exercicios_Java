/*. Faça um Programa que verifique se uma letra digitada é vogal ou consoante. */

import java.util.Scanner;

public class exercicio_004 {

    public static void main(String[] args){

        char letra;
        String entrada;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma letra: ");
        entrada = scanner.next();
        letra = entrada.charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' ||  letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {

            System.out.print("VOGAL");

        }
        else{

            System.out.print("CONSOANTE");
        }

        scanner.close();

    }
    
}
