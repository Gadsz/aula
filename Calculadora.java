import java.util.Scanner;

class Calculadora{
    public static void main(String [] args){
        //variáveis
        float a, b;
        String op;
        java.util.Scanner entrada;

        //entrada
        entrada = new Scanner(System.in);
        System.out.println("Digite a:");
        a = entrada.nextFloat();
        System.out.println("Digite b:");
        b = entrada.nextFloat();
        System.out.println("Digite a operação (+,-,* ou /):");
        op = entrada.next();
        entrada.close();

        //procesamento
        if (op.equals("+")){
            System.out.printf("%f+%f=%f\n", a, b, a+b);
        }
        if (op.equals("-")){
            System.out.printf("%f+%f=%f\n", a, b, a-b);
        }
        if (op.equals("*")){
            System.out.printf("%f+%f=%f\n", a, b, a*b);
        }
        if (op.equals("/")){
            System.out.printf("%f+%f=%f\n", a, b, a/b);
        }

        if(!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/"));
            System.out.println("Operador Inválido");
    }
}