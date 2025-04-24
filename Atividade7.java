import java.util.Random;
import java.util.Scanner;
public class Atividade7 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int numero = random.nextInt(20) + 1;
    int palpites;
    int tentativas = 0;

    do {
        System.out.println("Chute um número: ");
        palpites = scanner.nextInt();
        tentativas++;

        if (palpites < numero){
            System.out.println("maior");
        } else if (palpites > numero) {
            System.out.println("menor");
        } 

       }   while(palpites != numero);
        System.out.println("Acertou em " + tentativas + " tentativas. ");

        scanner.close();
             
    }
}
