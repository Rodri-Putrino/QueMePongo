package domain;

import java.util.List;

abstract public class CategoriaPrenda {
    private List<String> tiposDePrendas;

    boolean coincideConTipoPrenda(String unTipo) {
        return tiposDePrendas.contains(unTipo);
    }
}

public class Accesorio extends CategoriaPrenda {

}

public class ParteSuperior extends CategoriaPrenda {

}

public class ParteInferior extends CategoriaPrenda {

}

public class Calzado extends CategoriaPrenda {

}