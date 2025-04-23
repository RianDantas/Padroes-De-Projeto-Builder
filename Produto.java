class Produto{
    String nome;
    String preco;
    String descricao;
    String peso;
    String categoria;

    private Produto(Builder builder){
        this.nome = builder.nome;
        this.preco = builder.preco;
        this.descricao = builder.descricao;
        this.peso = builder.peso;
        this.categoria = builder.categoria;
    }

    public static class Builder{
        private String nome;
        private String preco;
        private String descricao;
        private String peso;
        private String categoria;

        public  Builder(String nome, String preco){
            this.nome = nome;
            this.preco = preco;
        }

        public Builder setDescricao(String descricao){
            this.descricao = descricao;
            return this;
        }

        public Builder setPeso(String peso){
            this.peso = peso;
            return this;
        }

        public Builder setCategoria(String catagoria){
            this.categoria = catagoria;
            return this;
        }

        public Produto build(){
            return new Produto(this);
        }

    }
}