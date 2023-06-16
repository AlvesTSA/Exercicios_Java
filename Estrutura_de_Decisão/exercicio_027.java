/*O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
 
Até 5 Kg de File Duplo: R$ 4,90 por Kg 
Acima de 5 Kg de File Duplo: R$ 5,80 por Kg
 
Até 5 Kg de Alcatra: R$  5,90 por Kg 
Acima de 5 Kg de Alcatra: R$ 6,80 por Kg

Até 5 Kg de Picanha: R$  6,90 por Kg 
Acima de 5 Kg de Picanha: R$ 7,80 por Kg

Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, porém não há limites para a quantidade de carne por cliente. Se compra for feita no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o total da compra. Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere um cupom fiscal, contendo as informações da compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar.*/

import java.io.Console;
import java.util.Scanner;

public class exercicio_027 {
    
    public static void main(String[] args){

        int op = 0;
        int op2 = 0;
        double kilo = 0;
        double valor = 0;
        double desconto = 0;
        double valor_pago = 0;
        String tipo_carne = "";
        String tipo_pag = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tipo de carne que deseja: \n[1]-File Duplo\n[2]-Alcatra\n[3]-Picanha");
        op = scanner.nextInt();
        System.out.println("Informe a quantidade: ");
        kilo = scanner.nextDouble();

        switch (op) {
            case 1: tipo_carne = "File Duplo";

                if (kilo > 0 && kilo <= 5) {
                    
                    valor = kilo*4.90;

                }
                else{
                    
                    valor = kilo*5.80;
                }
                
                break;
            
            case 2: tipo_carne = "Alcatra";

                if (kilo > 0 && kilo <= 5) {
                    
                    valor = kilo*5.90;

                }
                else{
                    
                    valor = kilo*6.80;
                }
                
                break;
            
            case 3: tipo_carne = "Picanha";

                if (kilo > 0 && kilo <= 5) {
                    
                    valor = kilo*6.90;

                }
                else{
                    
                    valor = kilo*7.80;
                }
                
                break;
        
            default:

                System.out.println("Informe um valor valido");
                scanner.close();
                return;
        }

        System.out.println("Informe a forma de pagamento:\n[1]-Cartão tabajara\n[2]-Outro cartão");
        op2 = scanner.nextInt();
        
        switch (op2) {
            case 1: tipo_pag = "Cartao tabajara";

                desconto = valor*0.05;
                valor_pago = valor - desconto;
                
                break;

            case 2: tipo_pag = "Outro cartao";

                valor_pago = valor;
                
                break;
        
            default:

                System.out.println("Informe um valor valido");
                scanner.close();
                return;
                
        }

        System.out.println("Tipo de carne: " + tipo_carne + "\nPeso: " + kilo + "\nValor total: " + valor + "\nTipo de pagamento: " + tipo_pag + "\nDesconto: " + desconto + "\nValor a pagar: " + valor_pago);

        scanner.close();
        
    }
}
