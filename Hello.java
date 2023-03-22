import java.util.Scanner;

class Hello{
    public static void main(String[] args){
        //Variáves
        Scanner entrada;
        int n;
        
        //Entrada
        entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        n = entrada.nextInt();
        entrada.close();

        //Saída
        System.out.printf("Você digitou %d \n", n);
        System.out.println("Hello World");
    }
}