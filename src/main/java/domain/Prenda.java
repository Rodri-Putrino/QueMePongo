package domain;

import domain.exceptions.PrendaInvalidaException;

public class Prenda {

  private TipoPrenda tipoDePrenda;
  private Material material;
  private TramaDeLaTela tramaDeLaTela;
  private Color colorPrimario;
  private Color colorSecundario;

  public Prenda(TipoPrenda tipoDePrenda, Material material, TramaDeLaTela tramaDeLaTela, Color colorPrimario, Color colorSecundario) {
    validarPrenda(tipoDePrenda, material, tramaDeLaTela, colorPrimario);
    this.tipoDePrenda = tipoDePrenda;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }

  private void validarPrenda(TipoPrenda tipoDePrenda, Material material, TramaDeLaTela tramaDeLaTela, Color colorPrimario) {
    if (tipoDePrenda == null) {
      throw new PrendaInvalidaException("falta el tipo de prenda");
    }
    if (material == null) {
      throw new PrendaInvalidaException("falta el material");
    }
    if (tramaDeLaTela == null) {
      this.tramaDeLaTela = TramaDeLaTela.LISA;
    } else {
      this.tramaDeLaTela = tramaDeLaTela;
    }
    if (colorPrimario == null) {
      throw new PrendaInvalidaException("falta el color primario");
    }
    if (!tipoDePrenda.admiteMaterial(material)) {
      throw new PrendaInvalidaException("Un/a " + tipoDePrenda + "no puede ser de " + material);
    }
  }

  public CategoriaPrenda getCategoriaPrenda() {
    return tipoDePrenda.getCategoria();
  }

  public void crearPrenda() {

  }
}