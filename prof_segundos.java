import java.util.Scanner;

class prof_segundos{
    public static void main(String[] args){
        //Variáves
        int hora, minuto, segundo, tempo;
        Scanner entrada;

        //Entrada
        entrada = new Scanner(System.in);
        System.out.print("Quantos segundos se passaram desde 00:00: ");
        tempo = entrada.nextInt();
        entrada.close();


        //Processamento
        //hora = tempo / 3600;
        //minuto = tempo % 3600 / 60;
        //segundo = tempo % 60;
        
        //hora = tempo / 3600;
        //tempo = tempo % 3600;
        //minuto = tempo / 60 ;
        //tempo = tempo % 60;
        //segundo = tempo;

        //CORRIGIR ESSE EMBAIXO
        hora = tempo / 3600;
        tempo = tempo - hora * 3600;
        minuto = tempo / 60 ;
        tempo = tempo - minuto * 60;
        segundo = tempo;

        //Saída
        //System.out.printf("Tempo   : %d\n", tempo);
        System.out.printf("Hora    : %d\n", hora);
        System.out.printf("Minuto  : %d\n", minuto);
        System.out.printf("Segundo : %d\n", segundo);

    }
}