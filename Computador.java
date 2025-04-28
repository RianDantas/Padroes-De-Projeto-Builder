public class Computador {
    String cpu;
    String ram;
    String armazenamento;
    String gpu;
    String fonte;
    String so;

    private Computador(Builder builder){
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.armazenamento = builder.armazenamento;
        this.gpu = builder.gpu;
        this.fonte = builder.fonte;
        this.so = builder.so;
    }

    public static class Builder{
        private String cpu;
        private String ram;
        private String armazenamento;
        private String gpu;
        private String fonte;
        private String so;


        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public String getCpu() {
            return cpu;
        }

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public String getRam() {
            return ram;
        }

        public Builder setArmazenamento(String armazenamento) {
            this.armazenamento = armazenamento;
            return this;
        }

        public String getArmazenamento() {
            return armazenamento;
        }

        public Builder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public String getGpu() {
            return gpu;
        }

        public Builder setFonte(String fonte) {
            this.fonte = fonte;
            return this;
        }

        public String getFonte() {
            return fonte;
        }

        public Builder setSo(String so) {
            this.so = so;
            return this;
        }

        public String getSo() {
            return so;
        }

        public Computador build(){
            return new Computador(this);
        }
    }
}
