import java.util.Scanner;

public class Day10 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo ");
        int n = scanner.nextInt();
        int soma = 0;

        // Soma com FOR
        for (int i = 0 ; i <= n ; i++ ) {
            soma += i;
        }
        System.out.println("Soma com for: " + soma);

        // Soma com WHILE
        int somaWhile = 0;
        int i = 1;
        while (i <= n) {
            somaWhile += i;
            i++;
        }
        System.out.println("Soma com while: " + somaWhile);

        // Soma com DO-WHILE
        int somaDoWhile = 0;
        int j = 1;
        do {
            somaDoWhile += j;
            j++;
        } while (j <= n);
        System.out.println("Soma com do-while: " + somaDoWhile);

        scanner.close();
    }
}
