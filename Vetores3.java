import java.util.Scanner;

public class Vetores3 {
    public static void main(String[] args) {
        int[] valores = {0, 0, 0, 0, 0}; 
        int n = 5, soma;

        float media;
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com 5 valores");
        valores[0] = sc.nextInt();
        valores[1] = sc.nextInt();
        valores[2] = sc.nextInt();
        valores[3] = sc.nextInt();
        valores[4] = sc.nextInt();
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
