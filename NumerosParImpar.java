/* Escreva um código que o usuário entre com um primeiro número, um 
segundo número maior que o primeiro e escolha entre a opção par e impar, com isso o 
código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de 
números informados, incluindo os números informados e em ordem decrescente;
*/

import java.util.Scanner;

public class NumerosParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do primeiro número
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        // Entrada do segundo número (deve ser maior que o primeiro)
        System.out.print("Digite o segundo número (maior que o primeiro): ");
        int num2 = scanner.nextInt();

        // Verificação: o segundo número precisa ser maior que o primeiro
        if (num2 <= num1) {
            System.out.println("Erro: o segundo número deve ser maior que o primeiro.");
            scanner.close();
            return; // Encerra o programa
        }

        // Entrada da escolha (par ou ímpar)
        System.out.print("Você deseja ver os números 'par' ou 'impar'? ");
        String escolha = scanner.next().toLowerCase(); // Converte para minúsculo para evitar erros

        System.out.println("\nResultado (em ordem decrescente):");

        // Laço para percorrer os números do segundo até o primeiro (decrescente)
        for (int i = num2; i >= num1; i--) {
            if (escolha.equals("par") && i % 2 == 0) { 
                // Se a escolha for "par" e o número for divisível por 2
                System.out.print(i + " ");
            } else if (escolha.equals("impar") && i % 2 != 0) { 
                // Se a escolha for "impar" e o número não for divisível por 2
                System.out.print(i + " ");
            }
        }

        scanner.close(); // Fecha o scanner
    }
}
