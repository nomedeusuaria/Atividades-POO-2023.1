package org.example;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertTrue;

public class SistemaComercialMapTeste {
    @Test
    public void testaCadastroDeProduto(){
        SistemaComercialMap sistema = new SistemaComercialMap();
        Collection<Produto> alimentos = sistema.pesquisaProdutosDaCategoria(CategoriaProduto.ALIMENTO);
        assertTrue(alimentos.size() == 0);
        Produto produtoUm = new Produto("00", "Macarrao", 3.65f, 1, CategoriaProduto.ALIMENTO);
        sistema.cadastraProduto(produtoUm);
        assertTrue(sistema.existeProduto(produtoUm));
        alimentos = sistema.pesquisaProdutosDaCategoria(CategoriaProduto.ALIMENTO);
        assertTrue(alimentos.size() == 1);
    }


    @Test
    public void testaCadastroDeProdutoLimpeza(){
        SistemaComercialMap sistema = new SistemaComercialMap();
        Collection<Produto> produtosLimpeza = sistema.pesquisaProdutosDaCategoria(CategoriaProduto.PRODUTO_DE_LIMPEZA);
        assertTrue(produtosLimpeza.size() == 0);
        Produto produtoUm = new Produto("00", "alvejante", 3.65f, 1, CategoriaProduto.PRODUTO_DE_LIMPEZA);
        sistema.cadastraProduto(produtoUm);
        assertTrue(sistema.existeProduto(produtoUm));
        Collection<Produto> alimentos = sistema.pesquisaProdutosDaCategoria(CategoriaProduto.ALIMENTO);
        assertTrue(alimentos.size() == 0);
        assertTrue("oii", sistema.pesquisaProdutosDaCategoria(CategoriaProduto.PRODUTO_DE_LIMPEZA).size() == 1);
    }


}
