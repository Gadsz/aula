import java.io.IOException;
import java.util.Scanner;

public class VetoresBeeCrowd {
 
    public static void main(String[] args) throws IOException {
 
        int n = 100, i;
        float[] A = new float[n];

        Scanner entrada = new Scanner(System.in);

        //Entrada
        for(i=0;i<n;i++){
            A[i] = entrada.nextFloat();
        }
        entrada.close();

        //Processamento e saída

        for(i=0;i<n;i++){
            if(A[i] <= 10.f){
            System.out.printf("A[%d] = %.1f\n", i, A[i]);
            }
        }
    }
}