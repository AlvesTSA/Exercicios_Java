/*Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do imposto de Renda, INSS, Sindicato e que o FGTS corresponde a 11% do salário bruto, mas não é descontado (é a empresa que deposita). O salário líquido corresponde ao salário bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
 
Desconto do IR; 

Salário Bruto ate R$900,00 (inclusive) – Isento; 

Salário Bruto de R$ 1500, 00 (inclusive) – desconto de 5%;

Salario bruto até R$ 2500,00 (Inclusive) – desconto de 10%;
  
Salário bruto acima de 2500 – Desconto de 20%.

Imprima na tela as informações dispostas conforme o exemplo abaixo.
  
Salário bruto: R$ 

Desconto IR: R$ 
 
Desconto INSS (10%): R$
 
Desconto Sindicato (3%): R$  
 
FGTS (11%) 
  
Desconto total: R$ 
  
Salário líquido: R$ 
*/

import java.util.Scanner;

public class exercicio_012 {

    public static void main(String[] args){

        double ganho_hora = 0;
        double hora_mes = 0;
        double salario_bruto = 0;
        double salario_liquido = 0;
        double desconto_IR = 0;
        double desconto_INSS = 0;
        double desconto_Sind = 0;
        double fgts = 0;
        double desconto_total = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe quanto você ganha por hora: ");
        ganho_hora = scanner.nextDouble();
        System.out.print("Informe quantas horas você trabalhou no mês:");
        hora_mes = scanner.nextDouble();

        salario_bruto = ganho_hora*hora_mes;

        if (salario_bruto <= 900 && salario_bruto > 0){

        desconto_INSS = salario_bruto*0.1;
        desconto_Sind = salario_bruto*0.03;
        desconto_total = desconto_IR + desconto_INSS + desconto_Sind;
        salario_liquido = salario_bruto - desconto_total;
        fgts = salario_bruto*0.11;

        System.out.println("Salário bruto: R$ " + salario_bruto + "\nDesconto IR (0 porcento): R$" + desconto_IR + "\nDesconto INSS (10 porcento): R$ " + desconto_INSS + "\nDesconto Sindicato (3 porcento): R$ " + desconto_Sind + "\nFGTS (11 porcento): R$ " + fgts + "\nDesconto total: R$ " + desconto_total + "\nSalário líquido: R$ " + salario_liquido);

        }
        else if (salario_bruto > 900 && salario_bruto <= 1500){

            desconto_IR = salario_bruto*0.05;
            desconto_INSS = salario_bruto*0.1;
            desconto_Sind = salario_bruto*0.03;
            desconto_total = desconto_IR + desconto_INSS + desconto_Sind;
            salario_liquido = salario_bruto - desconto_total;
            fgts = salario_bruto*0.11;

            System.out.println("Salário bruto: R$ " + salario_bruto + "\nDesconto IR (5 porcento): R$" + desconto_IR + "\nDesconto INSS (10 porcento): R$ " + desconto_INSS + "\nDesconto Sindicato (3 porcento): R$ " + desconto_Sind + "\nFGTS (11 porcento): R$ " + fgts + "\nDesconto total: R$ " + desconto_total + "\nSalário líquido: R$ " + salario_liquido);

        }
        else if (salario_bruto > 1500 && salario_bruto <= 2500){

            desconto_IR = salario_bruto*0.1;
            desconto_INSS = salario_bruto*0.1;
            desconto_Sind = salario_bruto*0.03;
            desconto_total = desconto_IR + desconto_INSS + desconto_Sind;
            salario_liquido = salario_bruto - desconto_total;
            fgts = salario_bruto*0.11;

            System.out.println("Salário bruto: R$ " + salario_bruto + "\nDesconto IR (10 porcento): R$" + desconto_IR + "\nDesconto INSS (10 porcento): R$ " + desconto_INSS + "\nDesconto Sindicato (3 porcento): R$ " + desconto_Sind + "\nFGTS (11 porcento): R$ " + fgts + "\nDesconto total: R$ " + desconto_total + "\nSalário líquido: R$ " + salario_liquido);

        }
        else if (salario_bruto > 2500){

            desconto_IR = salario_bruto*0.2;
            desconto_INSS = salario_bruto*0.1;
            desconto_Sind = salario_bruto*0.03;
            desconto_total = desconto_IR + desconto_INSS + desconto_Sind;
            salario_liquido = salario_bruto - desconto_total;
            fgts = salario_bruto*0.11;

            System.out.println("Salário bruto: R$ " + salario_bruto + "\nDesconto IR (20 porcento): R$" + desconto_IR + "\nDesconto INSS (10 porcento): R$ " + desconto_INSS + "\nDesconto Sindicato (3 porcento): R$ " + desconto_Sind + "\nFGTS (11 porcento): R$ " + fgts + "\nDesconto total: R$ " + desconto_total + "\nSalário líquido: R$ " + salario_liquido);
        }
        else{

            System.out.println("Informe um valor válido !");
        }

        scanner.close();
    }
    
}
