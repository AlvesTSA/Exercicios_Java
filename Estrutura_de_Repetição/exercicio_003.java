/*3. Faça um programa que leia e valide as seguintes informações:

Nome: maior que 3 caracteres; 

Idade: entre 0 e 150; 

Salário: maior que zero;

Sexo: 'f' ou 'm';

Estado Civil: 's', 'c', 'v', 'd';

 */

import java.util.Scanner;

public class exercicio_003 {
    
    public static void main(String[] args) {
        
        String nome = "";
        int idade = 0;
        float salario = 0;
        char sexo = ' ';
        char estado_civil = ' ';

        Scanner scanner = new Scanner(System.in);

        //validação do nome

        do{

            System.out.println("Informe seu nome: ");
            nome = scanner.nextLine();
            /*O método scanner.next() lê apenas uma única palavra. Se o nome contiver mais de uma palavra, somente a primeira palavra será atribuída à variável nome. Para ler toda a linha, incluindo espaços, é necessário utilizar o método scanner.nextLine() em vez de scanner.next(). */

            if(nome.length() < 4){

                System.out.println("Erro: o nome deve ter pelo menos mais de três letras");
            }
        }while(nome.length() < 4);

        //validação da idade 
        do{

            System.out.println("Informe sua idade: ");
            idade = scanner.nextInt();

            if(idade > 150 || idade < 0){

                System.out.println("Erro: idade invalida");
            }
        }while(idade > 150 || idade < 0);

        //validação salario
        do{

            System.out.println("Informe seu salario: ");
            salario = scanner.nextFloat();

            if(salario <= 0){

                System.out.println("Erro: salario invalido");
            }
        }while(salario <= 0);

        //validação do sexo
        do{

            System.out.println("Informe seu sexo: ");
            String entrada = scanner.next();
            sexo = entrada.charAt(0);

            if(sexo != 'm' && sexo != 'f'){

                System.out.println("Erro: sexo invalido");
            }

        }while(sexo != 'm' && sexo != 'f');

        //validação do estado civil

        do{

            System.out.println("Informe seu estado civil: ");
            String entrada2 = scanner.next();
            estado_civil = entrada2.charAt(0);

            if(estado_civil != 's' && estado_civil != 'c' && estado_civil != 'd' && estado_civil != 'v' ){

                System.out.println("Erro: estado civil invalido");
            }
        }while(estado_civil != 's' && estado_civil != 'c' && estado_civil != 'd' && estado_civil != 'v');

        scanner.close();
    }
}
