import java.util.Scanner;

class atividade2{
    public static void main(String[] args){

        //Variáves
        int dias, km;
        float valor;
        Scanner entrada;
        
        //Entrada
        entrada = new Scanner(System.in);
        System.out.print("Dias alugado: ");
        dias = entrada.nextInt();
        System.out.print("Km rodado: ");
        km = entrada.nextInt();
        entrada.close();

        //Processamento
        valor = km * (float) 0.15;

        //Saída
        System.out.printf("Valor final: R$ %f\n", valor);
        //System.out.printf("Quantos dias ficou com o veículo?, %s \n", dia);
        //System.out.printf("Qual o preço total a pagar?, %.2f \n", km_rodado);
    }
}