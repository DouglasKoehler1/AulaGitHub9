import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Exercios de laço de repetição //

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("Os números pares entre 0 e " + numero + " são:");
        for (int i = 0; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}

