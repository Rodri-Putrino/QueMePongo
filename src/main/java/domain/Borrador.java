package domain;

import domain.exceptions.PrendaInvalidaException;

public class Borrador {
  TipoPrenda tipoDePrenda;
  Material material;
  TramaDeLaTela tramaDeLaTela;
  TramaDeLaTela tramaDefault;
  Color colorPrimario;
  Color colorSecundario;

  public void setTipoPrenda(TipoPrenda tipoDePrenda) {
    validarTipoDePrenda(tipoDePrenda);
    this.tipoDePrenda = tipoDePrenda;
  }

  public void setMaterial(Material material) {
    validarMaterialConsistenteConTipoDePrenda(material);
    this.material = material;
  }

  public void setTramaDeLaTela(TramaDeLaTela tramaDeLaTela) {
    validarTrama(tramaDeLaTela);
  }

  public void setTramaDefault(TramaDeLaTela tramaDefault) {
    this.tramaDefault = tramaDefault;
  }

  public void setColorPrimario(Color colorPrimario) {
    validarColorPrimario(colorPrimario);
    this.colorPrimario = colorPrimario;
  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public Prenda construirPrenda() {
    validarPrenda();
    return new Prenda(tipoDePrenda, material, tramaDeLaTela, colorPrimario, colorSecundario);
  }

  private void validarPrenda() {
    validarTipoDePrenda(this.tipoDePrenda);
    validarMaterialConsistenteConTipoDePrenda(this.material);
    validarTrama(this.tramaDeLaTela);
    validarColorPrimario(this.colorPrimario);
  }

  private void validarTipoDePrenda(TipoPrenda tipoDePrenda) {
    if (tipoDePrenda == null) {
      throw new PrendaInvalidaException("falta el tipo de prenda");
    }
  }

  private void validarMaterialConsistenteConTipoDePrenda(Material material) {
    if (!tipoDePrenda.admiteMaterial(material)) {
      throw new PrendaInvalidaException("Un/a " + tipoDePrenda + "no puede ser de " + material);
    }
  }

  private void validarTrama(TramaDeLaTela tramaDeLaTela) {
    if (tramaDeLaTela == null) {
      this.tramaDeLaTela = tramaDefault;
    } else {
      this.tramaDeLaTela = tramaDeLaTela;
    }
  }

  private void validarColorPrimario(Color colorPrimario) {
    if (colorPrimario == null) {
      throw new PrendaInvalidaException("falta el color primario");
    }
  }
}
