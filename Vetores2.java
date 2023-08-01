import java.util.Scanner;

public class Vetores2 {
    public static void main(String[] args) {
        int v1, v2, v3, v4, v5, soma, n = 5;

        float media;
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com 5 valores");
        v1 = sc.nextInt();
        v2 = sc.nextInt();
        v3 = sc.nextInt();
        v4 = sc.nextInt();
        v5 = sc.nextInt();
        sc.close();
        soma = v1+v2+v3+v4+v5;
        media = (float) soma/n;

        System.out.println(media);
        System.out.println("== Acima ou igual à media ==");

        if (v1>= media) {
            System.out.println(v1);
        }
        if (v2>= media) {
            System.out.println(v2);
        }
        if (v3>= media) {
            System.out.println(v3);
        }
        if (v4>= media) {
            System.out.println(v4);
        }
        if (v5>= media) {
            System.out.println(v5);
        }
    }
}
