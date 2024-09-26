class Carro extends Veiculo {
    private int quantidadeDePortas;

    public Carro(String marca, String modelo, int ano, String cor, int quantidadeDePortas) {
        super(marca, modelo, ano, cor);
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public void abrirPortaMalas() {
        System.out.println("Abrindo o porta-malas.");
    }

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }
}
