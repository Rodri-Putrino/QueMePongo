package domain;

public class Prenda {

  private TipoPrenda tipoDePrenda;
  private Material material;
  private TramaDeLaTela tramaDeLaTela;
  private Color colorPrimario;
  private Color colorSecundario;

  public Prenda(TipoPrenda tipoDePrenda, Material material, TramaDeLaTela tramaDeLaTela, Color colorPrimario, Color colorSecundario) {
    this.tipoDePrenda = tipoDePrenda;
    this.material = material;
    this.tramaDeLaTela = tramaDeLaTela;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }

  public CategoriaPrenda getCategoriaPrenda() {
    return tipoDePrenda.getCategoria();
  }

}