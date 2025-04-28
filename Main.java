class Main{
    /*
     * Crie uma classe Produto com Builder. Atributos
        sugeridos:
        – nome (obrigatório)
        – preço (obrigatório)
        – descrição (opcional)
        – peso (opcional)
        – categoria (opcional)
     */
     public static void main(String[] args){
        Produto produto = new Produto.Builder("café", "R$25,00")
        .setCategoria("peso leve")
        .setDescricao("Sem descrição")
        .setPeso("200g")
        .build();

        System.out.println("Produto:");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Descrição: " + produto.getDescricao());
        System.out.println("Peso: " + produto.getPeso());
        System.out.println("Categoria: " + produto.getCategoria());
        System.out.println("Produto criado com sucesso!");
//////////////////////////////////////////////////////////////////////////
        
        /*
         * Crie uma classe Computador com os seguintes
            atributos:
            – CPU, RAM, Armazenamento, GPU, Fonte,
            Sistema Operacional
            ● Todos devem ser configuráveis pelo Builder
            ● Crie dois objetos: um básico e um gamer
         */

        Computador.Builder computador = new Computador.Builder()
                .setCpu("Intel i5")
                .setRam("8GB")
                .setArmazenamento("1TB")
                .setGpu("NVIDIA GTX 1650")
                .setFonte("500W")
                .setSo("Windows 10");

        Computador.Builder computadorGamer = new Computador.Builder()
                .setCpu("Intel i9")
                .setRam("32GB")
                .setArmazenamento("2TB SSD")
                .setGpu("NVIDIA RTX 3080")
                .setFonte("750W")
                .setSo("Windows 11");
                
        System.out.println("\nComputador básico:");
        System.out.println("CPU: " + computador.getCpu());
        System.out.println("RAM: " + computador.getRam());
        System.out.println("Armazenamento: " + computador.getArmazenamento());
        System.out.println("GPU: " + computador.getGpu());
        System.out.println("Fonte: " + computador.getFonte());
        System.out.println("Sistema Operacional: " + computador.getSo());

        System.out.println("\nComputador gamer:");
        System.out.println("CPU: " + computadorGamer.getCpu());
        System.out.println("RAM: " + computadorGamer.getRam());
        System.out.println("Armazenamento: " + computadorGamer.getArmazenamento());
        System.out.println("GPU: " + computadorGamer.getGpu());
        System.out.println("Fonte: " + computadorGamer.getFonte());
        System.out.println("Sistema Operacional: " + computadorGamer.getSo());

    }

}