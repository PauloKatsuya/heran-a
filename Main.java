public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2010, "Prata", 4);
        Moto moto = new Moto("Honda", "CB500", 2018, "Azul", true);
        Caminhao caminhao = new Caminhao("Volvo", "FH", 2019, "Branco", 18000);

        carro.ligar();
        carro.abrirPortaMalas();
        System.out.println("Carro: " + carro.getMarca() + " " + carro.getModelo());

        moto.ligar();
        moto.empinar();
        System.out.println("Moto: " + moto.getMarca() + " " + moto.getModelo());

        caminhao.ligar();
        caminhao.carregar();
        System.out.println("Caminhão: " + caminhao.getMarca() + " " + caminhao.getModelo());
    }
}
