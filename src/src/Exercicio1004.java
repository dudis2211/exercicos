/*
Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação
à variável PROD. A seguir mostre a variável PROD com mensagem correspondente.

Entrada
O arquivo de entrada contém 2 valores inteiros.

Saída
Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo, com um espaço em branco antes e depois
da igualdade. Não esqueça de imprimir o fim de linha após o produto, caso contrário seu programa apresentará
a mensagem: “Presentation Error”.

Exemplos de Entrada	    Exemplos de Saída
3                       PROD = 27
9

-30                     PROD = -300
10

0                       PROD = 0
9

 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1004 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();

        int PROD = (v1 * v2);

        System.out.printf("PROD = %d", PROD);
    }
}
