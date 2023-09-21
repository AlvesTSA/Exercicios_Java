/*12. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:

Tabuada de 5: 

5 X 1 = 5 

5 X 2 = 10

...

5 X 10 = 50

*/

import java.util.Scanner;

public class exercicio_012 {
    
    public static void main(String[] args){

        int num1 = 0;
        int num2 = 0;
        int resultado = 0;

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("Informe a tabuada que deseja ver: ");
            num1 = scanner.nextInt();

            switch (num1) {
                case 1:
                    
                    System.out.println("Tabuada do " + num1 + " : ");

                    for(int i = 0; i < 10; i++){
                        
                        num2++;
                        resultado = num1*num2;
                        System.out.println(num1 + " x " + num2 + " = " + resultado);
                    }
                    break;
                
                case 2:
                    
                    System.out.println("Tabuada do " + num1 + " : ");

                    for(int i = 0; i < 10; i++){
                        
                        num2++;
                        resultado = num1*num2;
                        System.out.println(num1 + " x " + num2 + " = " + resultado);
                    }
                    break;
                
                case 3:
                    
                    System.out.println("Tabuada do " + num1 + " : ");

                    for(int i = 0; i < 10; i++){
                        
                        num2++;
                        resultado = num1*num2;
                        System.out.println(num1 + " x " + num2 + " = " + resultado);
                    }
                    break;
                
                case 4:
                    
                    System.out.println("Tabuada do " + num1 + " : ");

                    for(int i = 0; i < 10; i++){
                        
                        num2++;
                        resultado = num1*num2;
                        System.out.println(num1 + " x " + num2 + " = " + resultado);
                    }
                    break;
                
                case 5:
                    
                    System.out.println("Tabuada do " + num1 + " : ");

                    for(int i = 0; i < 10; i++){
                        
                        num2++;
                        resultado = num1*num2;
                        System.out.println(num1 + " x " + num2 + " = " + resultado);
                    }
                    break;
                
                case 6:
                    
                    System.out.println("Tabuada do " + num1 + " : ");

                    for(int i = 0; i < 10; i++){
                        
                        num2++;
                        resultado = num1*num2;
                        System.out.println(num1 + " x " + num2 + " = " + resultado);
                    }
                    break;
                
                case 7:
                    
                    System.out.println("Tabuada do " + num1 + " : ");

                    for(int i = 0; i < 10; i++){
                        
                        num2++;
                        resultado = num1*num2;
                        System.out.println(num1 + " x " + num2 + " = " + resultado);
                    }
                    break;
                
                case 8:
                    
                    System.out.println("Tabuada do " + num1 + " : ");

                    for(int i = 0; i < 10; i++){
                        
                        num2++;
                        resultado = num1*num2;
                        System.out.println(num1 + " x " + num2 + " = " + resultado);
                    }
                    break;
                
                case 9:
                    
                    System.out.println("Tabuada do " + num1 + " : ");

                    for(int i = 0; i < 10; i++){
                        
                        num2++;
                        resultado = num1*num2;
                        System.out.println(num1 + " x " + num2 + " = " + resultado);
                    }
                    break;
                
                case 10:
                    
                    System.out.println("Tabuada do " + num1 + " : ");

                    for(int i = 0; i < 10; i++){
                        
                        num2++;
                        resultado = num1*num2;
                        System.out.println(num1 + " x " + num2 + " = " + resultado);
                    }
                    break;
            
                default:

                    System.out.println("error: escolha uma tabuada de 1 a 10");

                    break;
            }

        }while(num1 < 1 || num1 > 10);

        scanner.close();
    }
}
