public class Day6 {
    public static void main (String[] args) {
        String textoNumero = "13";
        int numeroInteiro = Integer.parseInt(textoNumero);

        String textoDecimal =  "13.33";
        float numeroFloat =  Float.parseFloat(textoDecimal);

        int idade = 13;
        String idadeTexto1 = String.valueOf(idade);

        String idadeTexto2 = Integer.toString(idade);

        System.out.println("String para int: " + numeroInteiro);
        System.out.println("String para float: " + numeroFloat);
        System.out.println("int para String (valueOf): " + idadeTexto1);
        System.out.println("int para String (toString): " + idadeTexto2);
    }
}
