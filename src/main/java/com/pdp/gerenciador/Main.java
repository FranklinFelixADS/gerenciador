package com.pdp.gerenciador;

import com.pdp.gerenciador.abstract_product.Relatorio;
import com.pdp.gerenciador.factory_method.*;
import com.pdp.gerenciador.http.HttpRequest;

public class Main {
    public static void main(String[] args) {
        executarExemploFactoryMethod();
        executarExemploBuilder();
    }

    private static void executarExemploFactoryMethod() {
        System.out.println("=== Factory Method: Relatórios ===");

        RelatorioFactory pdfFactory = new RelatorioPDFFactory();
        Relatorio relatorioPDF = pdfFactory.criarRelatorio();
        relatorioPDF.gerar();

        RelatorioFactory htmlFactory = new RelatorioHTMLFactory();
        Relatorio relatorioHTML = htmlFactory.criarRelatorio();
        relatorioHTML.gerar();

        RelatorioFactory jsonFactory = new RelatorioJSONFactory();
        Relatorio relatorioJSON = jsonFactory.criarRelatorio();
        relatorioJSON.gerar();
    }

    private static void executarExemploBuilder() {
        System.out.println("\n=== Builder: Requisições HTTP ===");

        HttpRequest req1 = new HttpRequest.Builder()
            .url("https://exemplo.restaurante.com/pedidos")
            .timeout(3000)
            .auth("Bearer abc123")
            .addHeader("Accept", "application/json")
            .build();

        HttpRequest req2 = new HttpRequest.Builder()
            .url("https://exemplo.restaurante.com/cardapio")
            .addHeader("Cache-Control", "no-cache")
            .build();

        System.out.println(req1);
        System.out.println(req2);
    }
}
