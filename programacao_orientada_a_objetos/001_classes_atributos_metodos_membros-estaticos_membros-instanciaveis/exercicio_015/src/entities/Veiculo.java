package entities;

public class Veiculo {

    public String placa;
    public String modelo;
    public int ano;
    public float quilometragem;
    public static int total_veiculos = 0;
    

    public void registrar_quilometragem(float km){

        System.out.println("\nRegistrando " + km + "...");
        quilometragem += km;

    }

    public int calcular_idade(int ano_atual){

        System.out.println("Calculando idade em " + ano_atual + "...");
        return ano_atual - ano;
    }
    
    public String toString(){

        return 
            "Veiculo: " + placa + 
            "\nModelo: " + modelo +
            "\nAno: "+ ano +
            "\nQuilometragem: "+ quilometragem + " Km";
    }
}
