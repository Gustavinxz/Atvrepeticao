import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   

        System.out.println("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numero; i++){
            fatorial *= 1;
        }
        
        System.out.println("Fatorial de " + numero + " é " + fatorial);


        scanner.close();
    }
}
