import java.util.Scanner;

class Hello{
    public static void main(String[] args){
        //Variáves
        Scanner entrada;
        int n;
        int antecessor, sucessor;

        //Entrada
        entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        n = entrada.nextInt();
        entrada.close();

        antecessor = n-1;
        sucessor   = n+1;

        //Saída
        //System.out.printf("Antecessor: %d \n", antecessor);
        //System.out.printf("Sucessor  : %d \n", sucessor);
        System.out.printf("Valor: %d. Antecessor: %d.Sucessor: %d.\n", n, antecessor, sucessor); 
    }
}