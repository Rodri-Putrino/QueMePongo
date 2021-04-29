package domain;

public enum TipoPrenda {

  ANTEOJOS(CategoriaPrenda.ACCESORIO),
  CAMISA(CategoriaPrenda.PARTE_SUPERIOR),
  PANTALON(CategoriaPrenda.PARTE_INFERIOR),
  ZAPATOS(CategoriaPrenda.CALZADO);

  private CategoriaPrenda categoria;

  TipoPrenda(CategoriaPrenda categoria) {
    this.categoria = categoria;
  }

  public CategoriaPrenda getCategoria(){
    return this.categoria;
  }
}
