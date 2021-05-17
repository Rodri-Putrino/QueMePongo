package domain;

public class Borrador {
  TipoPrenda tipoPrenda;
  Material material;
  TramaDeLaTela tramaDeLaTela;
  TramaDeLaTela tramaDefault;
  Color colorPrimario;
  Color colorSecundario;

  public void setTipoPrenda(TipoPrenda tipoPrenda) {
    this.tipoPrenda = tipoPrenda;
  }

  public void setMaterial(Material material) {
    this.material = material;
  }

  public void setTramaDeLaTela(TramaDeLaTela tramaDeLaTela) {
    this.tramaDeLaTela = tramaDeLaTela;
  }

  public void setTramaDefault(TramaDeLaTela tramaDefault) {
    this.tramaDefault = tramaDefault;
  }

  public void setColorPrimario(Color colorPrimario) {
    this.colorPrimario = colorPrimario;
  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public Prenda construirPrenda() {
    return new Prenda(tipoPrenda, material, tramaDeLaTela, colorPrimario, colorSecundario);
  }
}
