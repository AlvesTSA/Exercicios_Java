/* Um posto está vendendo combustíveis com a seguinte tabela de descontos:
Álcool:
 
Até 20 litros: desconto de 3% por litro;
Acima de 20 litros: Desconto de 5% por litro.

Gasolina:

Até 20 litros: desconto de 4% por litro
Acima de 20 litros, desconto de 6% por litro

Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool. G-gasolina), calcule e imprima o valor a ser pago pelo cliente.*/

import java.util.Scanner;

public class exercicio_023 {
    
    public static void main(String[] args){

        char op;
        String entrada;
        double litro = 0;
        double preco_litro = 0;
        double desconto = 0;
        double valor = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe quantos litros deseja");
        litro = scanner.nextDouble();
        System.out.println("Informe o cmbustível\n[A]-Alcool\n[G]-Gasolina");
        entrada = scanner.next();
        op = entrada.charAt(0);

        switch (op) {

            case 'A':

                if(litro > 0 && litro <= 20){

                    preco_litro = 4;
                    desconto = preco_litro*0.03;
                    preco_litro = preco_litro - desconto;
                    valor = preco_litro*litro; 

                }
                else{

                    preco_litro = 4;
                    desconto = preco_litro*0.05;
                    preco_litro = preco_litro - desconto;
                    valor = preco_litro*litro;
                }
                
                break;

            case 'G':

                if(litro > 0 && litro <= 20){

                    preco_litro = 5;
                    desconto = preco_litro*0.04;
                    preco_litro = preco_litro - desconto;
                    valor = preco_litro*litro;

                }
                else{

                    preco_litro = 5;
                    desconto = preco_litro*0.06;
                    preco_litro = preco_litro - desconto;
                    valor = preco_litro*litro;
                    
                }
                
                break;
        
            default:

                System.out.println("Informe um valor valido");

                scanner.close();
                return;
                

        }

        System.out.println("Valor a ser pago: " + valor);

        scanner.close();

    }
}
