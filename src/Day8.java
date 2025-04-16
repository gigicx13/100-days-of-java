import java.util.Scanner;

public class Day8 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para verificar se é par ou impar: ");
        int x = scanner.nextInt();

        if( x % 2 == 0 ){
            System.out.println("O numero é par!");
        }
        else {
            System.out.println("O numero é impar! ");
        }

        System.out.println("Digite três numero para verificar qual o maior entre eles:  ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if( a > b && a > c){
            System.out.println("O numero maior é: " + a);
        }
        else if (b > c){
            System.out.println("O numero maior é: " + b);
        }
        else{
            System.out.println("O numero maior é: " + c);
        }

    }
}
