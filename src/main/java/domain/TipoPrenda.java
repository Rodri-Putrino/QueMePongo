package domain;

import java.util.Arrays;
import java.util.List;

public enum TipoPrenda {

  ANTEOJOS(CategoriaPrenda.ACCESORIO, Arrays.asList(Material.PLASTICO)),
  CAMISA(CategoriaPrenda.PARTE_SUPERIOR, Arrays.asList(Material.ALGODON)),
  PANTALON(CategoriaPrenda.PARTE_INFERIOR, Arrays.asList(Material.ALGODON)),
  ZAPATOS(CategoriaPrenda.CALZADO, Arrays.asList(Material.CUERO));

  private CategoriaPrenda categoria;
  private List<Material> materialesAdecuados;

  TipoPrenda(CategoriaPrenda categoria, List<Material> materialesAdecuados) {
    this.categoria = categoria;
    this.materialesAdecuados = materialesAdecuados;
  }

  public CategoriaPrenda getCategoria() {
    return this.categoria;
  }

  public boolean admiteMaterial(Material material) {
    return getMaterialesAdecuados().contains(material);
  }

  private List<Material> getMaterialesAdecuados() {
    return this.materialesAdecuados;
  }
}
