import java.util.Scanner;

class Boleto{
    public static void main(String[] args){
        //Variáves
        int dia;
        float valor, juros, boleto;
        Scanner entrada;

        //Entrada
        entrada = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        valor = entrada.nextFloat();
        System.out.print("Digite os dias de atraso: ");
        dia = entrada.nextInt();
        System.out.print("Qual a porcetangem dos juros: ");
        juros = entrada.nextFloat();
        entrada.close();

        //Processamento
        boleto = valor + valor * juros/100 * dia;

        //Saída
        System.out.printf("Valor: %.2f", boleto); 
    }
}