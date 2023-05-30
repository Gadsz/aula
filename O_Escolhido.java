import java.util.Scanner;

public class O_Escolhido {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int n, maior_matricula=0, matricula;
        float nota, maior_nota=(float)-1.0;
        
        n = entrada.nextInt();
        
        while(n>0){
            matricula = entrada.nextInt();
            nota = entrada.nextFloat();
            
            if(nota > maior_nota){
                maior_nota = nota;
                maior_matricula = matricula;
            }
            
            n--;
        }
        entrada.close();
    }
 
}