import java.util.Scanner;

public class Day9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua porcentagem de acerto para saber sua nota: " );
        int porcentagemNota= scanner.nextInt();

        int nota = porcentagemNota / 10;

        switch (nota){
            case 10:
            case 9:
                System.out.println("Sua nota é A!" );
            break;

            case 8:
                System.out.println("Sua nota é b!" );
            break;
            case 7:
                System.out.println("Sua nota é C!");
                break;
            case 6:
                System.out.println("Sua nota é D!");
                break;
            default:
                System.out.println("Sua nota é F!");

        }
    }
}

