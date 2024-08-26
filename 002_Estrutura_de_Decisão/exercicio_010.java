/* Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso. */

import java.util.Scanner;

public class exercicio_010 {
    
    public static void main(String[] args){

        char turno;
        String entrada;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual turno vocÊ estuda ?\nDigite a letra correspondente\nM-matutino\nV-Vespertino\nN-Noturno");
        entrada = scanner.next();
        turno = entrada.charAt(0);

        switch (turno) {
            case 'M':
                
                System.out.print("BOM DIA !");

                break;
            
            case 'V':
                
                System.out.print("BOA TARDE !");

                break;

            case 'N':
                
                System.out.print("BOA NOITE !");

                break;
        
            default:

                System.out.println("Valor inválido !");

                break;

        }

        scanner.close();

    }
}
