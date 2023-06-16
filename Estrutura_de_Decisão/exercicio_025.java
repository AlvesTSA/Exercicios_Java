/*Para doar sangue é necessário ter entre 18 e 67 anos. Faça um aplicativo que pergunte a idade de uma pessoa e diga se ela pode doar sangue ou não. Use alguns dos operadores lógicos OU (||) e E (&&).*/

import java.util.Scanner;

public class exercicio_025 {

    public static void main(String[] args){

        int idade = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        idade = scanner.nextInt();

        if (idade >= 18 && idade <= 67) {
            
            System.out.println("Doação permitida");
        }
        else{

            System.out.println("Doação não autorizada");
        }

        scanner.close();
    }
    
}
