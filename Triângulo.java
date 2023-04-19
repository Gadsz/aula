import java.util.Scanner;

public class Triângulo {
    public static void main(String[] args){
        int a, b, c;
        Scanner entrada;

        //entrada
        entrada = new Scanner(System.in);
        System.out.println("Digite a medida do lado A:");
        a = entrada.nextInt();
        System.out.println("Digite a medida do lado B:");
        b = entrada.nextInt();
        System.out.println("Digite a medida do lado C:");
        c = entrada.nextInt();
        entrada.close();

        //processamento e saída
        if ((a>= b+c) || (b>a+c) || (c>b+a)){
            System.out.printf("Não forma um triângulo");
        }
        else System.out.printf("Pode formar um triângulo");
    }
}
