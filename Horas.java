import java.util.Scanner;

class Horas{
    public static void main(String[] args){
        //Variáves
        int hora, minuto, segundo, tempo;
        Scanner entrada;

        //Entrada
        entrada = new Scanner(System.in);
        System.out.print("Hora: ");
        hora = entrada.nextInt();
        System.out.print("Minuto: ");
        minuto = entrada.nextInt();
        System.out.print("Segundo: ");
        segundo = entrada.nextInt();
        entrada.close();

        //Processamento
        tempo = hora * 3600;
        tempo = tempo + minuto * 60;
        tempo = tempo + segundo;

        //Saída
        System.out.printf("Se passaram %d segundos desde 00:00\n", tempo); 
    }
}