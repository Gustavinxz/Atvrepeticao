import java.util.Scanner;
public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String senhacerta = "1234";

        System.out.println("sua senha é:" + senhacerta);

        System.out.println("digite sua senha: ");
        String senha = scanner.nextLine();

        while (true) {
            if (senha.equals(senhacerta)) {
                System.out.println("Acesso concedido");
                break;
            } else {
                System.out.println("senha incorreta tente novamente: ");
                senha = scanner.nextLine();
            }
            

        }
        
     }
    
}
