import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        int[] vetor = vetorAleatorio();

        Thread t1 = new ThreadVetor(vetor, 1);
        Thread t2 = new ThreadVetor(vetor, 2);

        t1.start();
        t2.start();

    }
    private static int[] vetorAleatorio() {
        Random random = new Random();

        int[]vetor = new int[100000];
        System.out.println("Matriz: ");
        for (int i = 0; i < 100000; i++) {
                vetor[i] = random.nextInt(100);
        }
        return vetor;
    }
}
