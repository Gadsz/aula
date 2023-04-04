import java.util.Scanner;

class Votação{
    public static void main(String[] args){
        //Variáves
        int valor, votos;
        Scanner entrada;

        //Entrada
        entrada = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        votos = entrada.nextInt();
        entrada.close();

        //Processamento
        cubo = valor * valor * valor;

        //Saída
        System.out.printf("Valor: %d.\n", cubo); 
    }
}