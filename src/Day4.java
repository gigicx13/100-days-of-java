import java.util.Scanner;

public class Day4 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Insira outro numero: ");
        int num2 = scanner.nextInt();

        System.out.println("***Operações Basicas** " + (num1 + num2));
        System.out.println("A soma dos numeros é: " + (num1 + num2));
        System.out.println("A divisão  dos numeros é: " + (num1 / num2));
        System.out.println("A multiplicação dos numeros é: " + (num1 + num2));
        System.out.println("A subtração dos numeros é: " + (num1 + num2));

    }

}
