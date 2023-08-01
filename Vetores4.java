import java.util.Scanner;

public class Vetores4 {
    public static void main(String[] args) {
        int[] valores = {0, 0, 0, 0, 0}; 
        int n = 5, soma, i;

        float media;
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com 5 valores");
        for (i = 0; i < n; i++) {
            valores[i] = sc.nextInt();
        }
        sc.close();




        soma = valores[0] + valores[1] + valores[2] + valores[3] + valores[4] + valores[5];
        media = (float) soma/n;

        System.out.println(media);
        System.out.println("== Acima ou igual à media ==");

        if (valores[0]>= media) {
            System.out.println(valores[0]);
        }
        if (valores[1]>= media) {
            System.out.println(valores[1]);
        }
        if (valores[2]>= media) {
            System.out.println(valores[2]);
        }
        if (valores[3]>= media) {
            System.out.println(valores[3]);
        }
        if (valores[4]>= media) {
            System.out.println(valores[4]);
        }
    }
}
