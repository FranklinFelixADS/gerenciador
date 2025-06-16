package com.pdp.gerenciador.factory_method;

import com.pdp.gerenciador.abstract_product.Relatorio;
import com.pdp.gerenciador.concrete_product.RelatorioJSON;

public class RelatorioJSONFactory extends RelatorioFactory {
    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioJSON();
    }
}
