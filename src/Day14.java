import java.util.Arrays;

public class Day14{
    public static void main(String[] args) {
        int[][] matriz = {
                {23, 45, 78, 12},
                {56, 90, 34, 67},
                {89, 21, 43, 76}
        };


        int[] maxLinhas = maxPorLinha(matriz);
        System.out.println("Máximos por linha: " + Arrays.toString(maxLinhas));


        int[] maxColunas = maxPorColuna(matriz);
        System.out.println("Máximos por coluna: " + Arrays.toString(maxColunas));


        int[][] transposta = transporMatriz(matriz);
        System.out.println("Matriz transposta:");
        for (int[] linha : transposta) {
            System.out.println(Arrays.toString(linha));
        }
    }


    public static int[] maxPorLinha(int[][] matriz) {
        int[] maximos = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            int max = matriz[i][0];
            for (int j = 1; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                }
            }
            maximos[i] = max;
        }
        return maximos;
    }


    public static int[] maxPorColuna(int[][] matriz) {
        int colunas = matriz[0].length;
        int[] maximos = new int[colunas];

        for (int j = 0; j < colunas; j++) {
            int max = matriz[0][j];
            for (int i = 1; i < matriz.length; i++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                }
            }
            maximos[j] = max;
        }
        return maximos;
    }


    public static int[][] transporMatriz(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int[][] transposta = new int[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        return transposta;
    }
}