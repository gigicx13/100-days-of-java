public class Day12 {
    public static void main(String[] args) {

        //StringBuffer
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println("Resultado com StringBuffer: " + sbf);

        // StringBuilder
        StringBuilder sbd = new StringBuilder("Hello");
        sbd.append(" World");
        System.out.println("Resultado com StringBuilder: " + sbd);
    }
}
