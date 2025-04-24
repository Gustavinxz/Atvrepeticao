public class Atividade11 {
    public static void main(String[] args) {
        int[] numeros = {4, 7, 2, 9, 1, 5, 3, 6, 8, 10};
        int soma = 0;


        
        for (int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }

        System.out.println("Soma dos elementos: " + soma);

    }
}
