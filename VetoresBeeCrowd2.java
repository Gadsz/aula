import java.io.IOException;
import java.util.Scanner;

public class VetoresBeeCrowd {
 
    public static void main(String[] args) throws IOException {
 
        int n, i;
        int menor_valor, menor_pos;
        int[] x;

        Scanner entrada = new Scanner(System.in);

        //Entrada
        n = entrada.nextInt();
        x = new int[n];
        for(i=0;i<n;i++){
            x[i] = entrada.nextInt();
        }
        entrada.close();

        menor_valor = x[0];
        menor_pos = 0;

        //Processamento e saída

        for(i=0;i<x.length;i++){
            if(x[i] < menor_valor){
                menor_valor = x[i];
                menor_pos = i;
            }
        }

        //Menor valor: -5
        //Posicao: 4
        System.out.println("Menor valor: " + menor_valor);
        System.out.println("Posicao: " + menor_pos);
    }
}