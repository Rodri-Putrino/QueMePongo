package domain;

public class Prenda {

    private String tipo;
    private Color color;
    private Color colorSecundario;
    private Material material;
    private CategoriaPrenda categoriaPrenda;

    public Prenda(String tipo, CategoriaPrenda categoriaPrenda, Material material, Color color) {
        this.tipo = tipo;
        this.color = color;
        this.material = material;
        this.categoriaPrenda = categoriaPrenda;
    }

    public Prenda(String tipo, CategoriaPrenda categoriaPrenda, Material material, Color color, Color colorSecundario) {
        this.tipo = tipo;
        this.color = color;
        this.colorSecundario = colorSecundario;
        this.material = material;
        this.categoriaPrenda = categoriaPrenda;
    }

    public CategoriaPrenda getCategoriaPrenda() {
        return categoriaPrenda;
    }

}
