class Produto{
    String descricao="";
    int lote=0;
    float peso=0.0f;
}

public class RegistrosCampos{
    public static void main(String[] args) {

        //variáveis
        Produto prod_1, prod_2;
        prod_1 = new Produto();
        prod_2 = new Produto();

        prod_1.descricao = "Arroz";
        prod_1.lote = 100;
        prod_1.peso = 5f;

        prod_2.descricao = "Feijão";
        // prod_2.lote = 38;
        prod_2.peso = 1f;

        System.out.printf("Produtos: %d %s %f\n", prod_1.lote, prod_1.descricao, prod_1.peso);
        System.out.printf("Produtos: %d %s %f\n", prod_2.lote, prod_2.descricao, prod_2.peso);
        
    }
}