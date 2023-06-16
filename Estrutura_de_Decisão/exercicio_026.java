/* Uma fruteira está vendendo frutas com a seguinte tabela de preços:

Até 5 Kg de morango: R$ 2,50 por Kg 
Acima de 5 Kg de morango: R$ 2,20 por Kg

Até 5 Kg de maçã: R$ 1,80 por Kg 
Acima de 5 Kg de maçã: R$ 1,50 por Kg

Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.*/

import java.util.Scanner;

public class exercicio_026 {
    
    public static void main(String[] args){

        double kilo_ma = 0;
        double kilo_mo = 0;
        double valor = 0;
        double valor_ma = 0;
        double valor_mo = 0;
        double kilo_total = 0;
        double desconto = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de morangos: ");
        kilo_mo = scanner.nextDouble();
        System.out.println("Informe a quantidade de maça: ");
        kilo_ma = scanner.nextDouble();

        if (kilo_mo > 0 && kilo_mo <= 5) {
            
            valor_mo = kilo_mo*2.50;
        }
        else{

            valor_mo = kilo_mo*2.20;
        }
        if (kilo_ma > 0 && kilo_ma <= 5) {
            
            valor_ma = kilo_ma*1.80;
        }
        else{

            valor_ma = kilo_ma*1.50;
        }

        kilo_total = kilo_ma + kilo_mo;
        valor = valor_ma + valor_mo;

        if (kilo_total > 8 || valor > 25) {
            
            desconto = valor*0.10;
            valor = valor - desconto;
        }
        else{

            valor = valor_ma + valor_mo;
        }

        System.out.println("Valor a pagar: " + valor);

        scanner.close();
    }
}
