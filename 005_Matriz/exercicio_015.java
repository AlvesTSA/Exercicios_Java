/*15. Crie uma agenda que armazena, código da pessoa, número do telefone, idade. Sua agenda deve possibilitar:

(1) – inserir um contato
(2) – Remover um contato
(3) – Editar um contato
(4) – buscar um contato pelo Código.*/

import java.util.Scanner;

public class exercicio_015 {
    
    public static void main(String[] args) {
        
        final int max_pessoas = 100;
        final int n_campo = 3;
        String[][] pessoas = new String[max_pessoas][n_campo];
        int op = 0;
        int op_1 = 0;
        int count_pessoas = 0;
        String codigo = "";
        int fim = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < max_pessoas; i++)
        {
            for (int j = 0; j < n_campo; j++)
            {
                pessoas[i][j] = "";
            }
        }

        for (int w = 0; w < max_pessoas; w++)
        {
            do
            {
                System.out.print("Escolha uma opcao a seguir.\n\n(1)  inserir um contato\n(2)  Remover um contato\n(3)  Editar umcontato\n(4)  buscar um contato pelo Codigo\n(5)  Mostrar lista\n");
                op = scanner.nextInt();

                switch (op)
                {
                    case 1: //(1) – inserir um contato
                        
                        for (int i = 0; i < max_pessoas; i++)
                        {
                            
                            System.out.print("Informe o codigo da pessoa: ");
                            pessoas[i][0] = scanner.next();
                            System.out.print("Informe o numero de telefone da pessoa: ");
                            pessoas[i][1] = scanner.next();
                            System.out.print("Informe q idade da pessoa: ");
                            pessoas[i][2] = scanner.next();
                            System.out.print("Deseja inserir mais uma pessoa ? Digite 0 para 'nao' e 1 para 'sim': ");
                            fim = scanner.nextInt();

                            count_pessoas++;

                            if (fim == 0)
                            {
                                break;
                            }
                        }
                        break;

                    case 2: //(2) – Remover um contato
                        codigo = "";
                        System.out.print("Informe o codigo da pessoa que deseja remover: ");
                        codigo = scanner.next();

                        for (int i = 0; i < max_pessoas; i++)
                        {
                            if (pessoas[i][0].equals(codigo))
                            {
                                int posicao_remover = i;

                                for (int j = posicao_remover; j < max_pessoas - 1; j++)
                                {
                                    pessoas[j][0] = pessoas[j+1][0];
                                    pessoas[j][1] = pessoas[j+1][1];
                                    pessoas[j][2] = pessoas[j+1][2]; 
                                }
                                System.out.println("Contato removido com sucesso.");
                                count_pessoas--; // Decrementa o contador de pessoas
                                break; // Sai do loop após remover o contato
                            }
                        }
                        break;

                    case 3: //(3) – Editar um contato
                        codigo = "";
                        System.out.print("Informe o codigo da pessoa que deseja editar: ");
                        codigo = scanner.next();

                        for (int i = 0; i < max_pessoas; i++)
                        {
                            if (pessoas[i][0].equals(codigo))
                            {
                                System.out.print("Informe qual campo deseja editar\n\n(1) Codigo\n(2) Telefone\n(3) Idade ");
                                op_1 = scanner.nextInt();

                                switch (op_1)
                                {
                                    case 1:
                                        System.out.print("Informe o novo codigo da pessoa: ");
                                        pessoas[i][0] = scanner.next();
                                        break;
                                    case 2:
                                        System.out.print("Informe o novo numero de telefone da pessoa: ");
                                        pessoas[i][1] = scanner.next();
                                        break;
                                    case 3:
                                        System.out.print("Informe a nova idade da pessoa: ");
                                        pessoas[i][2] = scanner.next();
                                        break;
                                    default:
                                        System.out.println("Valor invalido.");
                                        break;
                                }
                                System.out.println("Contato editado com sucesso.");
                                break; 
                            }
                        }
                        break;

                    case 4: //(4) – buscar um contato pelo Código
                        
                        codigo = "";
                        System.out.print("Informe o codigo da pessoa que deseja buscar: ");
                        codigo = scanner.next();

                        for (int i = 0; i < max_pessoas; i++){
                        
                            if (pessoas[i][0].equals(codigo))
                            {
                                System.out.println(pessoas[i][0] + "\n" + pessoas[i][1] + "\n" + pessoas[i][2]);
                            }
                        }

                        break;

                    case 5: //(5) – Mostrar lista

                        for (int i = 0; i < count_pessoas; i++){
                        
                            System.out.println("codigo da pessoa: "+pessoas[i][0]);
                            System.out.println("telefone: "+pessoas[i][1]);
                            System.out.println("idade: "+pessoas[i][2]);
                        }
                        break;

                    default:
                        System.out.println("Erro: escolha entre 1 a 4.");
                        break;
                }

            } while (op > 5 || op < 1);

            System.out.print("Deseja realizar mais alguma operacao ? Digite 0 para 'nao' e 1 para 'sim': ");
            fim = scanner.nextInt();

            if (fim == 0){
                
                break;
            }
        }
        scanner.close();
    }
}
