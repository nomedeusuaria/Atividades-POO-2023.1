package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SistemaComercialMap {
    private Map<String, Cliente> clientes;
    private Map<String, Produto> produtos;

    public SistemaComercialMap(){
        this.clientes = new HashMap<String, Cliente>();
        this.produtos = new HashMap<String, Produto>();
    }

    public boolean existeProduto(Produto produto){
        return this.produtos.containsKey(produto.getCode());
    }

    public Produto pesquisaProduto(String codigoProduto) throws ProdutoNaoExisteException{
        if (this.produtos.containsKey(codigoProduto)){
            return this.produtos.get(codigoProduto);
        }
        throw new ProdutoNaoExisteException("Produto: " + codigoProduto + "não cadastrado");
    }

    public boolean cadastraProduto(Produto produto){
        if(existeProduto(produto)){
            return false;
        } else {
            this.produtos.put(produto.getCode(), produto);
            return true;
        }
    }

    public boolean existeCliente(Cliente cliente){
        return this.clientes.containsKey(cliente.getId());
    }

    public Cliente pesquisaCliente(String id) throws ClienteNaoExisteException{
        if(this.clientes.containsKey(id)){
            return this.clientes.get(id);
        }
        throw new ClienteNaoExisteException("Cliente não existe");
    }

    public Collection<Produto> pesquisaProdutosDaCategoria(CategoriaProduto categoria){
        Collection<Produto> produtos1 = new ArrayList<Produto>();
        for (var produtosPorCategoria_:this.produtos.entrySet()) {
            Produto produtosPorCategoria = produtosPorCategoria_.getValue();
            if(produtosPorCategoria.getCategoria().equals(categoria)){
                produtos1.add(produtosPorCategoria);
            }
        }
        return produtos1;
    }
}