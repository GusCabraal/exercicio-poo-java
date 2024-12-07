public class Main {
  public static void main(String[] args) {
    System.out.println("Iniciando sistema...");

    Carro carro = new Carro("Hyundai", "HB20", 2022);

    System.out.println(carro.info());
    System.out.println("Finalizando sistema...");
  }
}
