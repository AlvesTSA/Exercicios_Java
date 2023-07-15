/*6. Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. Depois modifique o programa para que ele mostre os números um ao lado do outro. */


public class exercicio_006 {
    
    public static void main(String[] args){

        int num = 0;

        for(num = 1; num <= 20; num++){

            System.out.println(num + "\n");
        }
        for(num = 1; num <= 20; num++){

            System.out.print(num + "  ");
        }

        return;

    }
}
