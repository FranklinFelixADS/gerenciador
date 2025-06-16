package com.pdp.gerenciador.factory_method;

import com.pdp.gerenciador.abstract_product.Relatorio;
import com.pdp.gerenciador.concrete_product.RelatorioPDF;

public class RelatorioPDFFactory extends RelatorioFactory {
    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioPDF();
    }
}
