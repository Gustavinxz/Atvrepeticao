public class Atividade4 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int contador = 1;

        while (contador <= 10){
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
            contador++;


        }





    }
    
}
