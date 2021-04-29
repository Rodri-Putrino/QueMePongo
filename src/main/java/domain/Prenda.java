package domain;

import domain.exceptions.PrendaInvalidaException;

public class Prenda {

  private TipoPrenda tipoDePrenda;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;

  public Prenda(TipoPrenda tipoDePrenda, Material material, Color colorPrimario, Color colorSecundario) {
    if (tipoDePrenda == null) {
      throw new PrendaInvalidaException("falta el tipo de prenda");
    }
    if (material == null) {
      throw new PrendaInvalidaException("falta el material");
    }
    if (colorPrimario == null) {
      throw new PrendaInvalidaException(("falta el color primario"));
    }

    this.tipoDePrenda = tipoDePrenda;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }

  public CategoriaPrenda getCategoriaPrenda() {
    return tipoDePrenda.getCategoria();
  }
}