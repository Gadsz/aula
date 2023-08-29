class Cartao{
    String nome, numero, bandeira;
    int cvv;
    int vencimento_mes, vencimento_ano;
}

public class Main{
    public static void main(String[] args) {

        //variáveis
        Cartao cliente_1 = new Cartao();
        Scanner entrada = new Scanner(System.in);

        //entrada
        System.out.println("=== NOVO SISTEMA DA AMAZON ===");
        System.out.println("Dados do cartão");
        System.out.printf("Nome: ");
        cliente_1.nome = entrada.NextLine();
        System.out.printf("Numero do cartao: ");
        cliente_1.numero = entrada.NextLine();
        System.out.printf("Bandeira: ");
        cliente_1.numero = entrada.NextLine();
        System.out.printf("Mes e ano do vencimento: (separados por espaço)");
        cliente_1.numero = entrada.NextLine();
        cliente_1.numero = entrada.NextLine();
        System.out.printf("Código de verificacao: ");
        cliente_1.cvv = entrada.NextInt();

        System.out.println("Nome:       "+cliente_1.nome);
        System.out.println("Numero:     "+cliente_1.numero);
        System.out.println("Bandeira:   "+cliente_1.bandeira);
        System.out.println("Vencimento: "+cliente_1.vencimento_mes+"/"+cliente_1.vencimento_ano);
        System.out.println("CVV:        "+cliente_1.cvv);
    }
}