import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Registro de Informações");
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite seu ano de nascimento:");
        int anoNascimento = scanner.nextInt();
        System.out.print("Digite seu peso:");
        double peso = scanner.nextDouble();

        System.out.println("Suas informações:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Ano de Nascimento: " + anoNascimento);
        System.out.println("Peso" + peso);

    }

}
