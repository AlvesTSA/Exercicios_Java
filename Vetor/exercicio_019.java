/*19. As Organizações Tabajara resolveram dar um abono aos seus colaboradores em reconhecimento ao bom resultado alcançado durante o ano que passou. Para isto contratou você para desenvolver a aplicação que servirá como uma projeção de quanto será gasto com o pagamento deste abono. Após reuniões envolvendo a diretoria executiva, a diretoria financeira e os representantes do sindicato laboral, chegou-se a seguinte forma de cálculo: a.Cada funcionário receberá o equivalente a 20% do seu salário bruto de dezembro; a.O piso do abono será de 100 reais, isto é, aqueles funcionários cujo salário for muito baixo, recebem este valor mínimo; Neste momento, não se deve ter nenhuma preocupação com colaboradores com tempo menor de casa, descontos, impostos ou outras particularidades. Seu programa deverá permitir a digitação do salário de um número indefinido (desconhecido) de salários. Um valor de salário igual a 0 (zero) encerra a digitação. Após a entrada de todos os dados o programa deverá calcular o valor do abono concedido a cada colaborador, de acordo com a regra definida acima. Ao final, o programa deverá apresentar: O salário de cada funcionário, juntamente com o valor do abono; O número total de funcionário processados; O valor total a ser gasto com o pagamento do abono; O número de funcionário que receberá o valor mínimo de 100 reais; O maior valor pago como abono; A tela abaixo é um exemplo de execução do programa, apenas para fins ilustrativos. Os valores podem mudar a cada execução do programa.

Projeção de Gastos com Abono
============================ 
Salário: 1000
Salário: 300
Salário: 500
Salário: 100
Salário: 4500
Salário: 0

Salário    - Abono

R$ 1000.00 - R$  200.00
R$  300.00 - R$  100.00
R$  500.00 - R$  100.00
R$  100.00 - R$  100.00
R$ 4500.00 - R$  900.00

Foram processados 5 colaboradores
Total gasto com abonos: R$ 1400.00
Valor mínimo pago a 3 colaboradores
Maior valor de abono pago: R$ 900.00*/ 

import java.util.Scanner;

public class exercicio_019 {
    
    public static void main(String[] args){

        float[] salario = new float[100];
        float[] abono = new float[100];
        int count1 = 0;
        int count2 = 0;
        float total = 0;
        float maior_abono = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Projeçao de Gastos com Abono\n============================");

        for (int i = 0; i < 100; i++){
            
            System.out.print("Salario: ");
            salario[i] = scanner.nextFloat();

            if (salario[i] == 0){
                break;
            }

            count1++;
        }

        for (int i = 0; i < count1; i++){
            
            abono[i] = salario[i] * 0.20F;

            if (abono[i] <= 100){
                            
                abono[i] = 100;
                count2++;
            }

            total += abono[i]; 
        }

        maior_abono = abono[0];

        for (int i = 0; i < count1 ; i++){
            
            if (abono[i] > maior_abono){
                
                maior_abono = abono[i];
            }
        }

        System.out.println("Salário    - Abono");

        for (int i = 0; i < count1; i++){

            System.out.println("R$ " + salario[i] + " -  R$" + abono[i]);
        }
        
        System.out.println("Foram processados " + count1 + " colaboradores");
        System.out.println("Total gasto com abonos: R$ " + total);
        System.out.println("Valor mínimo pago a " +  count2 + " colaboradores");
        System.out.println("Maior valor de abono pago: R$ " + maior_abono);

        scanner.close();
    }
}
