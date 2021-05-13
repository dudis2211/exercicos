import java.util.Locale;
import java.util.Scanner;

public class Exercicio1002 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double n = 3.14159;
        double raio = scanner.nextDouble();
        double area = (n*(raio*raio));

        System.out.printf("A=%.4f", area);




        scanner.close();
    }
}
