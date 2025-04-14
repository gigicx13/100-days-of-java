public class Day5 {
    public static void main(String[] args) {
        int i;

        System.out.println("Iniciando contagem regressiva para explosão...");
        for (i = 5; i > 0; i--) {
            System.out.println("Explosão em..." + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("KABUM! A explosão aconteceu!");
    }
}

