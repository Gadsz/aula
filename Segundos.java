import java.util.Scanner;

class Segundos{
    public static void main(String[] args){
        //Variáves
        int hora, tempo;
        Scanner entrada;

        //Entrada
        entrada = new Scanner(System.in);
        System.out.print("Tempo: ");
        tempo = entrada.nextInt();
        entrada.close();


        //Processamento
        hora = tempo/3600;

        //Saída
        System.out.printf("Hora: %d\n", hora); 
    }
}