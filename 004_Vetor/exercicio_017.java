/*17. Em uma competição de salto em distância cada atleta tem direito a cinco saltos. O resultado do atleta será determinado pela média dos cinco valores restantes. Você deve fazer um programa que receba o nome e as cinco distâncias alcançadas pelo atleta em seus saltos e depois informe o nome, os saltos e a média dos saltos. O programa deve ser encerrado quando não for informado o nome do atleta. A saída do programa deve ser conforme o exemplo abaixo:

Atleta: Rodrigo Curvêllo
Primeiro Salto: 6.5 m
Segundo Salto: 6.1 m
Terceiro Salto: 6.2 m
Quarto Salto: 5.4 m
Quinto Salto: 5.3 m


Resultado final:
Atleta: Rodrigo Curvêllo
Saltos: 6.5 - 6.1 - 6.2 - 5.4 - 5.3
Média dos saltos: 5.9 m*/

import java.util.Scanner;

public class exercicio_017 {
    
    public static void main(String[] args){

        float[] saltos = new float[5];
        float media = 0;
        String nome = "";

        Scanner scanner = new Scanner(System.in);

        while (true){
            
            System.out.print("\nAtleta: ");
            nome = scanner.nextLine();

            if (nome.equals("sair")){
                break;
            }

            System.out.print("Primeiro salto: ");
            saltos[0] = scanner.nextFloat();
            System.out.print("Segundo salto: ");
            saltos[1] = scanner.nextFloat();
            System.out.print("Terceiro salto: ");
            saltos[2] = scanner.nextFloat();
            System.out.print("Quarto salto: ");
            saltos[3] = scanner.nextFloat();
            System.out.print("Quinto salto: ");
            saltos[4] = scanner.nextFloat();
        

            media = 0;

            for (int y = 0; y < 5; y++){
                
                media += saltos[y];
            }

            media /= 5;

            System.out.println("\n\nResultado final\n");
            System.out.println("Atleta: " + nome);
            System.out.println("Saltos: " + saltos[0] + " " + saltos[1] + " " + saltos[2] + " " + saltos[3] + " " + saltos[4]);
            System.out.println("Media dos saltos: " + media + "\n\n"); 

            scanner.nextLine();

        }
        scanner.close();
    }
}
