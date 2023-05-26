/*Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.*/

import java.util.Scanner;

public class exercicio_019{

    public static void main(String[] args){

        int dia = 0;
        int mes = 0;
        int ano = 0;
        boolean data = true;

        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Informe uma data dd/mm/aaaa: ");
        dia = scanner.nextInt();
        mes = scanner.nextInt();
        ano = scanner.nextInt();
        
        if (ano < 0){
            
            data = false;
    
        }
        else if(mes <= 0 || mes > 12){
    
            data = false;
    
        }
        else if(dia <= 0 || dia > 31){
    
            data = false;
    
        }
        else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30){
    
            data = false;
    
        }
        else if(mes == 2){
    
            if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
    
                if(dia > 29){
    
                    data = false;
    
                }
            }
            else{
    
                if(dia > 28){
    
                    data = false;
    
                }
            }
        }
        if(data){
    
            System.out.printf("Data: %02d/%02d/%04d", dia, mes, ano);
    
        }
        else{
    
            System.out.printf("Data inválida! Tente novamente.");
        }
    
        
        scanner.close();
    }

}