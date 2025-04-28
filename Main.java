class Main{
    
    public static void main(String[] args){
        Produto produto = new Produto.Builder("café", "R$25,00")
        .setCategoria("peso leve")
        .setDescricao("Sem descrição")
        .setPeso("200g")
        .build();

        
    }
}