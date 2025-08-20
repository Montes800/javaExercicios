/*Escreva um código onde o usuário entra com um número e seja gerado a tabuada de 1 até 10 desse número; */
import java.util.Scanner; 

public class Tabuada {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar o número digitado pelo usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt(); // Lê o número digitado e armazena na variável 'numero'

        // Exibe qual tabuada será mostrada
        System.out.println("Tabuada do " + numero + ":");

        // Loop que percorre de 1 até 10
        for (int i = 1; i <= 10; i++) {
            // Imprime a multiplicação na forma: "numero x i = resultado"
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // Fecha o Scanner para liberar recursos
        scanner.close();
    }
}
