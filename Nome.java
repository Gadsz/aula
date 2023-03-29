import java.util.Scanner;

class Nome{
    public static void main(String[] args){

        //Variáves
        String nome;
        Scanner entrada;
        
        //Entrada
        entrada = new Scanner(System.in);
        System.out.print("Seu nome: ");
        nome = entrada.next();
        entrada.close();

        //Saída
        System.out.printf("Boa noite, %s \n", nome);
    }
}