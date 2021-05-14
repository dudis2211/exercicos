/*

 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        double resultado = ((nota1 * 2.0) + (nota2 * 3.0) + (nota3 * 5.0)) / 10;

        System.out.printf("MEDIA = %.1f%n", resultado);

        scanner.close();
    }
}
