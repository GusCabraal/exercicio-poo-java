public class Carro {
  private String marca;
  private String modelo;
  private int ano;
  static  int contador = 0;
  public Carro (String marca, String modelo, int ano){
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    Carro.contador += 1;
  }

  public String info() {
    return "Marca: %s, Modelo: %s, Ano: %d".formatted(
        this.marca, this.modelo, this.ano
    );
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }
  static int quantidadeDeCarros() {
    return Carro.contador;
  }
}
