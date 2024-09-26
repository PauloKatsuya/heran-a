class Caminhao extends Veiculo {
    private int capacidadeDeCarga;

    public Caminhao(String marca, String modelo, int ano, String cor, int capacidadeDeCarga) {
        super(marca, modelo, ano, cor);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public void carregar() {
        System.out.println("Carregando...");
    }

    public int getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(int capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }
}
