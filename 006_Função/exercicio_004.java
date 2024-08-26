/*4. Faça uma função que recebe por parâmetro o raio de uma esfera e calcula o seu volume (v = 4/3.P .R3).*/

import java.util.Scanner;

public class exercicio_004
{
    public static void main(String[] args){

        double r,v = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o raio da esfera: ");
        r = scan.nextInt();

        v = calc_vol(r);
       
        System.out.printf("Volume da esfera: %.2f",v);
        scan.close();
    }

    static double calc_vol(double r){
        
        double pi = 3.14159265358979323846;
        double v = (4.0/3.0)*pi*r*r*r;

        return v;
    }
}