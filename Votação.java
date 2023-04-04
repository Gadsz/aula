import java.util.Scanner;

class Votação{
    public static void main(String[] args){
        //Variáves
        int votos;
        float total, brancos, c1, c2, c3, porc1, porc2, porc3, porcbranco;
        Scanner entrada;

        //Entrada
        entrada = new Scanner(System.in);
        System.out.print("Quantos votos teve o canditado 1: ");
        c1 = entrada.nextFloat();
        System.out.print("Quantos votos teve o canditado 2: ");
        c2 = entrada.nextFloat();
        System.out.print("Quantos votos teve o canditado 3: ");
        c3 = entrada.nextFloat();
        System.out.print("Quantos votos em brancos ou nulos: ");
        brancos = entrada.nextFloat();
        entrada.close();

        //Processamento
        total = c1 + c2 + c3 + brancos;
        porc1 = c1 * 100 / total;
        porc2 = c2 * 100 / total;
        porc3 = c3 * 100 / total;
        porcbranco = brancos * 100 / total;

        //Saída
        System.out.printf("%.2f Votaram em C1.\n%.2f Votaram em C2.\n%.2f Votaram em C3.\n%.2f Votaram em branco ou nulo\n", porc1, porc2, porc3, porcbranco);
    }
}