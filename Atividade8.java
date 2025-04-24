import java.util.Scanner;
public class Atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somanotas = 0;
        int quantidadenotas = 0;
        String resposta;


        do{
            System.out.println("Digite uma nota: ");
            double nota = scanner.nextDouble();

            somanotas += nota;
            quantidadenotas++;

            System.out.println("Deseja inserir outra nota: (S/N): ");
            resposta = scanner.next();
        } while (resposta.equalsIgnoreCase("s"));

            double media = somanotas / quantidadenotas;
            System.out.println("A media das notas é : " + media);

            scanner.close();
    }
}
