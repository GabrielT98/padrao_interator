package org.example;

import java.util.Iterator;
public class ProdutoInfo {
    public static Integer contarTotalProdutoLoja(Loja loja) {
        int quantidade = 0;
        for (Iterator a = loja.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}