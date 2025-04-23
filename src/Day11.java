import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um texto qualquer: ");
        String texto = scanner.nextLine();

        // Comprimento da string
        System.out.println("\nComprimento da string: " + texto.length());

        // Maiúsculas e minúsculas
        System.out.println("Em maiúsculas: " + texto.toUpperCase());
        System.out.println("Em minúsculas: " + texto.toLowerCase());

        // Corta de espaços em branco
        System.out.println("Sem espaços nas extremidades: '" + texto.trim() + "'");

        // Extração de substring
        if (texto.length() >= 5) {
            String sub = texto.substring(0, 5);
            System.out.println("Substring dos 5 primeiros caracteres: " + sub);
        } else {
            System.out.println("Texto muito curto para extrair substring.");
        }

        // Reversão de string
        String reverso = new StringBuilder(texto).reverse().toString();
        System.out.println("Texto invertido: " + reverso);


        // Concatenação de strings
        System.out.print("Digite outro texto para concatenar: ");
        String outroTexto = scanner.nextLine();
        String concatenado = texto + " " + outroTexto;
        System.out.println("Texto concatenado: " + concatenado);

        // Comparação de strings
        System.out.println("Digite outro texto para comparar: ");
        String comparar = scanner.nextLine();
        if (texto.equals(comparar)) {
            System.out.println("As strings são iguais.");
        } else {
            System.out.println("As strings são diferentes.");
        }

        // Divisão de strings
        System.out.print("Digite um texto com vírgulas para dividir: ");
        String paraDividir = scanner.nextLine();
        String[] partes = paraDividir.split(",");
        System.out.println("Partes divididas:");
        for (String parte : partes) {
            System.out.println("- " + parte.trim());
        }

        // Pesquisa de substring
        System.out.print("Digite uma palavra para pesquisar na primeira string: ");
        String busca = scanner.nextLine();
        if (texto.contains(busca)) {
            System.out.println("A substring '" + busca + "' foi encontrada!");
        } else {
            System.out.println("A substring '" + busca + "' não foi encontrada.");
        }

        scanner.close();
    }
}
