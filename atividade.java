import java.util.Scanner;

class atividade{
    public static void main(String[] args){

        //Variáves
        String nome;
        int idade;
        float altura;
        Scanner entrada;
        
        //Entrada
        entrada = new Scanner(System.in);
        System.out.print("Seu nome: ");
        nome = entrada.next();
        System.out.print("Sua idade: ");
        idade = entrada.nextInt();
        System.out.print("Sua altura: ");
        altura = entrada.nextFloat();
        entrada.close();

        //Saída

        //System.out.printf("Boa noite, %s \n", nome);
        //System.out.printf("Qual sua idade?, %d \n", idade);
        //System.out.printf("Qual sua altura?, %.2f \n", altura);

        System.out.printf("Boa noite, %s \n Qual sua idade? %d \n Qual sua altura? %.2f \n", nome, idade, altura);

    }
}