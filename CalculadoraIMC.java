/*Escreva um código onde o usuário entra com sua altura e peso, seja feito o cálculo do seu IMC(IMC = peso/(altura * altura)) e seja exibido a mensagem de acordo com o resultado:

Se for menor ou igual a 18,5 "Abaixo do peso";
se por entre 18,6 e 24,9 “Peso ideal”;
Se for entre 25,0 e 29,9 "Levemente acima do peso";
Se entre 30,0 e 34,9 “Obesidade Grau I”;
Se for entre 35,0 e 39,9 “Obesidade Grau II (Severa)”;
Se for maior ou igual a 40,0 “Obesidade III (Mórbida)”;
 */

import java.util.Scanner; 

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria o objeto Scanner para capturar entradas

        // Solicita os dados ao usuário
        System.out.print("Digite sua altura em metros (ex: 1.75): ");
        double altura = scanner.nextDouble(); // Lê a altura digitada

        System.out.print("Digite seu peso em kg (ex: 70.5): ");
        double peso = scanner.nextDouble(); // Lê o peso digitado

        // Calcula o IMC
        double imc = peso / (altura * altura);

        // Exibe o valor do IMC com duas casas decimais
        System.out.printf("Seu IMC é: %.2f\n", imc);

        // Estrutura condicional para verificar em qual faixa o IMC se enquadra
        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade Grau II (Severa)");
        } else if (imc >= 40.0) {
            System.out.println("Obesidade Grau III (Mórbida)");
        }

        // Fecha o Scanner para liberar recursos
        scanner.close();
    }
}
