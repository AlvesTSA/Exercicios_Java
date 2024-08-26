package application;

import java.util.Scanner;

import entities.Student;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student st = new Student();

        System.out.println("Informe seu nome e as tres notas:\n");
        st.name = sc.nextLine();
        
        for(int i = 0;i < 3;i++){

            double note = sc.nextDouble();
            st.calculateGrade(note);
        }
        
        System.out.println(st);

        sc.close();
    }
}
