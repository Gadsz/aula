import java.util.Scanner;

//Aula sobre if e if else do dia 18 de Abril, 2023
class AulaIDADE {
    public static void main(String[] args) {
    int idade;
    Scanner entrada;

//entrada
    entrada = new Scanner(System.in);
    System.out.println("Digite sua idade");
    idade = entrada.nextInt();
    entrada.close();

//processamento e saída
    System.out.printf("Parabéns! Você tem %d anos \n", idade);
    
    if(idade>=18)
    {
        System.out.println("Você é maior de idade");
    }

    }
}