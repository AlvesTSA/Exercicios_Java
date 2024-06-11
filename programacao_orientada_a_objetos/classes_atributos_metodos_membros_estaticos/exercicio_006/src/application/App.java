package application;

import java.util.Scanner;
import util.Calc;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calc.circumference(radius);
        double v = Calc.volume(radius);

        System.out.printf("Circumference: %.2f\n",c);
        System.out.printf("Volume: %.2f\n",v);
        System.out.printf("PI valeu: %.2f\n",Calc.PI);
        sc.close();
    }
}
