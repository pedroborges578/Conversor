import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Calculadora ===");
        System.out.println("Operacoes: + - * /");
        System.out.println("Digite 'sair' para fechar");
        System.out.println("===================\n");

        while (true) {
            System.out.print("Num 1: ");
            String entrada = sc.next();

            if (entrada.equals("sair")) break;

            double n1 = Double.parseDouble(entrada);

            System.out.print("Operacao: ");
            String op = sc.next();

            System.out.print("Num 2: ");
            double n2 = sc.nextDouble();

            double resultado = 0;

            switch (op) {
                case "+": resultado = n1 + n2; break;
                case "-": resultado = n1 - n2; break;
                case "*": resultado = n1 * n2; break;
                case "/":
                    if (n2 == 0) {
                        System.out.println("Erro: divisao por zero\n");
                        continue;
                    }
                    resultado = n1 / n2;
                    break;
                default:
                    System.out.println("Operacao invalida\n");
                    continue;
            }

            if (resultado == (int) resultado)
                System.out.println("= " + (int) resultado + "\n");
            else
                System.out.println("= " + resultado + "\n");
        }

        System.out.println("Fechando...");
        sc.close();
    }
}