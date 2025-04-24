import java.util.Scanner;

public class Atividade2 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero;
    int soma = 0;

   System.out.println("digite um número: ");
    numero = scanner.nextInt();

    while(numero >= 0){
        soma += numero;
        System.out.println("digite um número: ");
        numero = scanner.nextInt();
        }
    System.out.println("A soma dos números é: " + soma);
    scanner.close();
    }    
}
