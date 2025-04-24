import java.util.Scanner;
public class Atividade6 {
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);
        int opcao;

       
 do {
            System.out.println("1 - Adicionar");
            System.out.println("2 - Remover");
            System.out.println("3 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1){
                System.out.println("Adiconado");
            } else if (opcao == 2) {
                System.out.println("Removido");
            }
    } while (opcao != 3);
    scanner.close();


  }     
}
