import java.time.ZonedDateTime;

public class ThreadVetor extends Thread {
    private int[] vetor;
    private int num;

    public ThreadVetor(int[] vetor, int num) {
        this.vetor = vetor;
        this.num = num;
    }

    @Override
    public void run() {


        Long timeInMillisInic = ZonedDateTime.now().toInstant().toEpochMilli();
        String parouimpar;
        if (num % 2 == 0) {
            parouimpar = "par";
            for (int i = 0; i < vetor.length; i++) {

            }
        } else {
            parouimpar = "impar";

            for (int a : vetor) {

            }
        }
        Long timeInMillisFim = ZonedDateTime.now().toInstant().toEpochMilli();

        Long time = timeInMillisFim - timeInMillisInic;

        System.out.println("Thread " + parouimpar + " terminou de executar em: " + time + " segundos");
    }
}
