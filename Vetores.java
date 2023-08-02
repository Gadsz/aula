import java.util.Scanner;

public class Vetores {
    public static void exercicio03(){
        //variaveis
        int[] valores = {0,0,0,0,0,0,0,0,0,0};
        int n = 10, i, x;
        Scanner entrada = new Scanner(System.in);

        //Entrada
        System.out.println("Entre com 10 valores: ");
        for(i=0;i<n;i++){
            x = entrada.nextInt();
            if(x<0){
                valores[i] = 0;
            }   else {
               valores [i] =x;
            }
        }   
        System.out.println("Os valores informados foram: ");
        for(i=0;i<n;i++){
            System.out.println(valores[i]);
        }
    }
    public static void main(String[] args){
        exercicio03();
    }
}