package domain;

import java.util.List;

public class Usuario {

    private List<Prenda> prendasValidas;

    void cargarPrenda(String tipo, CategoriaPrenda categoria, Material material, Color colorPrimario) {
        if(categoria.coincideConTipoPrenda(tipo)) {
            Prenda prenda = new Prenda(tipo, categoria, material, colorPrimario);
            prendasValidas.add(prenda);
        }
        else {
            throw new RuntimeException("El tipo de prenda no coincide con la categoria ingresada");
        }
    }

    void cargarPrenda(String tipo, CategoriaPrenda categoria, Material material, Color colorPrimario, Color colorSecundario) {
        if(categoria.coincideConTipoPrenda(tipo)) {
            Prenda prenda = new Prenda(tipo, categoria, material, colorPrimario, colorSecundario);
            prendasValidas.add(prenda);
        }
        else {
            throw new RuntimeException("El tipo de prenda no coincide con la categoria ingresada");
        }
    }

    CategoriaPrenda deQueCategoriaEs(Prenda prenda) {
        return prenda.getCategoriaPrenda();
    }
}
