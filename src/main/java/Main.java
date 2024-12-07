public class Main {
  public static void main(String[] args) {
    System.out.println("Iniciando sistema...");

    Carro carro = new Carro("Hyundai", "HB20", 2022);

    System.out.println(carro.info());
    System.out.println("contagem de carros: " + Carro.quantidadeDeCarros());
    Carro carro2 = new Carro("Volkswagen", "Golf", 2001);

    System.out.println(carro2.info());
    System.out.println("contagem de carros: " + Carro.quantidadeDeCarros());

    System.out.println("Finalizando sistema...");
  }
}
