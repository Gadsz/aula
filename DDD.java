import java.util.Scanner;

public class DDD {
    public static void main(String [] args){
        
        //variáveis
        String sigla;
        Scanner entrada;

        //entrada
        entrada = new Scanner(System.in);
        System.out.println("Digite a sigla do Estado: ");
        sigla = entrada.next();
        entrada.close();
        
        //processamento e saída
        switch(sigla){
            case "GO":
                System.out.println("Código 52, Góias, Centro Oeste");
                break;
            case "MT":
                System.out.println("Código 51, Mato Grosso, Centro Oeste");
                break;
            case "MS":
                System.out.println("Código 50, Mato Grosso do Sul, Centro Oeste");
                break;
            case "MG":
                System.out.println("Código 31, Minas Gerais, Sudeste");
                break;
            case "ES":
                System.out.println("Código 32, Espírito Santo, Sudeste");
                break;
            case "RJ":
                System.out.println("Código 33, Rio de Janeiro, Sudeste");
                break;
            case "SP":
                System.out.println("Código 35, São Paulo, Sudeste");
                break;
            case "PR":
                System.out.println("Código 41, Paraná, Sul");
                break;
            case "SC":
                System.out.println("Código 41, Santa Catarina, Sul");
                break;
            case "RS":
                System.out.println("Código 43, Rio Grande do Sul, Sul");
                break;
            default:
                System.out.println("Estado não está presente no banco de dados, contatar administrador");
        }
    }
}