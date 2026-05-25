import java.util.Scanner;

public class Conversor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Conversor de Peso ===");
        System.out.println("1 - kg para g");
        System.out.println("2 - g para kg");
        System.out.println("3 - kg para libra");
        System.out.println("4 - libra para kg");
        System.out.println("5 - kg para onca");
        System.out.println("6 - onca para kg");
        System.out.println("========================\n");

        while (true) {
            System.out.print("Opcao (0 pra sair): ");
            int opcao = sc.nextInt();

            if (opcao == 0) break;

            System.out.print("Valor: ");
            double valor = sc.nextDouble();
            double resultado = 0;

            switch (opcao) {
                case 1: resultado = valor * 1000; break;
                case 2: resultado = valor / 1000; break;
                case 3: resultado = valor * 2.20462; break;
                case 4: resultado = valor / 2.20462; break;
                case 5: resultado = valor * 35.274; break;
                case 6: resultado = valor / 35.274; break;
                default:
                    System.out.println("Opcao invalida\n");
                    continue;
            }

            System.out.printf("= %.4f\n\n", resultado);
        }

        System.out.println("Fechando...");
        sc.close();
    }
}import java.util.Scanner;

public class Conversor {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;

        do {
            System.out.println("------ Conversor de Peso ------");
            System.out.println("1 - Quilograma para Grama");
            System.out.println("2 - Grama para Quilograma");
            System.out.println("3 - Quilograma para Libra");
            System.out.println("4 - Libra para Quilograma");
            System.out.println("5 - Quilograma para Onca");
            System.out.println("6 - Onca para Quilograma");
            System.out.println("0 - Sair");
            System.out.println("-------------------------------");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();

            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            }

            System.out.print("Digite o valor: ");
            double valor = sc.nextDouble();

            double resultado = converter(opcao, valor);

            if (resultado == -1) {
                System.out.println("Opcao invalida!");
            } else {
                System.out.printf("Resultado: %.3f\n", resultado);
            }

            System.out.println();

        } while (opcao != 0);

        sc.close();
    }

    static double converter(int opcao, double valor) {
        switch (opcao) {
            case 1: return valor * 1000;
            case 2: return valor / 1000;
            case 3: return valor * 2.20462;
            case 4: return valor / 2.20462;
            case 5: return valor * 35.274;
            case 6: return valor / 35.274;
            default: return -1;
            
        }
    }
}