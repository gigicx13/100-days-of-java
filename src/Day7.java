import java.util.Scanner;

public class Day7 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int x = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int y = scanner.nextInt();

        System.out.print("Digite um número para calcular a raiz quadrada: ");
        double z = scanner.nextDouble();

        System.out.print("Digite um número para arredondar para cima: ");
        double a = scanner.nextDouble();

        System.out.print("Digite um número para arredondar para baixo: ");
        double b = scanner.nextDouble();

        System.out.print("Digite um número negativo para saber o seu valor absoluto: ");
        double c = scanner.nextDouble();

        scanner.close();
        int maior =Math.max(x,y);
        int menor =Math.min(x,y);
        double raiz = Math.sqrt(z);
        double arredondaCima = Math.ceil(a);
        double arredondaBaixo = Math.floor(b);
        double valor = Math.abs(c);

        System.out.println("O maior numero entre " + x + " e " + y + " é: " + maior);
        System.out.println("O menor numero entre " + x + " e " + y + " é: " + menor);
        System.out.println("A raiz quadrada de " + z + " é: " + raiz);
        System.out.println("O numero " + a + " arredondado para cima é: " + arredondaCima);
        System.out.println("O numero " + b + " arredondado para baixo é: " + arredondaBaixo);
        System.out.println("O valor absoluto de " + c + " é: " + valor);


    }
}
