import java.util.Scanner;

public class Poligonos {
    public static void main(String[] args){
        int a;
        Scanner entrada;

        //entrada
        entrada = new Scanner(System.in);
        System.out.println("Digite o número de lados:");
        a = entrada.nextInt();
        entrada.close();

        //processamento e saída
        if(a <=2){
            System.out.println("Não é um polígono meu parceiro");
        }
        if(a >=6){
            System.out.println("É um polígono não identificado meu parceiro");
        }
        if(a=3){
            System.out.println("Caramba é um triângulo mesmo");
        }
        if(a=4){
            System.out.println("Caramba é um quadrado mesmo");
        }
        if(a=5){
            System.out.println("Caramba é um pentágono mesmo");
        }
    }
}
