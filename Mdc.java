import java.util.Scanner;

public class Mdc {
    public static void main(String[] args){
        //variáveis
        int a, b, i, mdc=0;
        Scanner entrada = new Scanner(System.in);

        //entrada
        System.out.println("Entre com dois valores:");
        a = entrada.nextInt();
        b = entrada.nextInt();
        entrada.close();

        //processamento
        i = 1;
        while(i<= a && i<= b){
                    System.out.println(i);
                    if(a%i == 0 && b%i == 0){
                        mdc = i;
                    }
                i++;
        }

        //saída
        System.out.printf("MDC (%d, %d) = %d\n", a, b, mdc);
    }
}