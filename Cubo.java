import java.util.Scanner;

class Cubo{
    public static void main(String[] args){
        //Variáves
        int valor, cubo;
        Scanner entrada;

        //Entrada
        entrada = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        valor = entrada.nextInt();
        entrada.close();

        //Processamento
        cubo = valor * valor * valor;

        //Saída
        System.out.printf("Valor: %d.\n", cubo); 
    }
}