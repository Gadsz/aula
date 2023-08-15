class Main{
    public static void Main(String[] args) {
        int [][] matriz;
        int valor = 10;
        int i,j;
        int n_linhas = 4, n_colunas =4;

        matriz = new int[n_linhas][n_colunas];

        for(i=0;i<n_linhas;i++){
            for(j=0;j<n_colunas;j++){
                if(i==0){
                    matriz[i][j] = 1;
                }else{
                    if(i==n_linhas-1){
                        matriz[i][j] = 1;
                    }else{
                        if(j==0){
                            matriz[i][j] =1;
                        }else{
                            if(j==n_colunas-1){
                                matriz[i][j] = 1;
                            }
                        }
                    }
                }
            }
        }

        for(i=0;i<n_linhas;i++){
            for(j=0;j<n_colunas;j++){
                System.out.printf("%d", matriz[i][j]);
            }
            System.out.println();
        }
    }


}