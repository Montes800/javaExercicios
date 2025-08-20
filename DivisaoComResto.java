/* Escreva um código onde o usuário informa um número inicial, 
posteriormente informará outros N números, a execução do código continuará 
até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão, 
números menores que o primeiro número devem ser ignorados */

import java.util.Scanner;

public class DivisaoComResto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Usuário informa o número inicial
        System.out.print("Digite o número inicial: ");
        int numeroInicial = scanner.nextInt();

        int numero; // variável para armazenar os próximos números

        while (true) { 
            // Loop infinito que só será parado quando a condição for atendida

            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            // Ignorar números menores que o inicial
            if (numero < numeroInicial) {
                System.out.println("Número ignorado (menor que o inicial).");
                continue; // volta para o início do loop
            }

            // Verificar se a divisão tem resto
            if (numero % numeroInicial != 0) {
                System.out.println("Número " + numero + " não é divisível por " + numeroInicial + ". Encerrando programa.");
                break; // encerra o loop
            } else {
                System.out.println("Número " + numero + " é divisível por " + numeroInicial + ".");
            }
        }

        scanner.close(); // fecha o scanner
    }
}
