/*Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50. */

public class exercicio_009 {
    
    public static void main(String[] args){

        int num = 0;
        int i = 0;
        double resto = 0;

        for(i = 0; i < 50; i++ ){
            
            num ++;
            resto = num % 2;
        
            if(resto != 0 && num > 1 && num < 50){

                System.out.print(num + " ");
            }
        }

        return;
    }
}
