import java.util.Arrays;

public class Day13 {
    public static void main (String[] args){

        int [] numeros = {10,20,30,40,50};
        int soma = 0;

        for (int num : numeros){
            soma += num;
        }

        double media = (double) soma / numeros.length;
        System.out.println("Média dos valores: " + media);

        int[] copia = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            copia[i] = numeros[i];
        }

        System.out.println("Array original: " + Arrays.toString(numeros));
        System.out.println("Array copiado:  " + Arrays.toString(copia));
    }
}
