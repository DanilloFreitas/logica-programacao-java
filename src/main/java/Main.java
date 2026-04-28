import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("[1] - Somar [2] - Subtrair [3] - Multiplicar [4] - Dividir");

        int operacao = scanner.nextInt();

        Calculadora calculadora = new Calculadora();
        double nA, nB;
        System.out.println("Digite o primeiro numero: ");
        nA = scanner.nextDouble();
        System.out.println("Digite o segundo numero: ");
        nB = scanner.nextDouble();

        calculadora.setNumeros(nA, nB);

        switch (operacao) {
            case 1 -> System.out.println("Soma = " + calculadora.somar());
            case 2 -> System.out.println("Subtraçao = " + calculadora.subtracao());
            case 3 -> System.out.println("Multiplicaçao = " + calculadora.multiplicacao());
            case 4 -> System.out.println("Divisao = " + calculadora.divisao());
            default -> System.out.println("Opção inválida");
        }

        scanner.close();
    }
}

