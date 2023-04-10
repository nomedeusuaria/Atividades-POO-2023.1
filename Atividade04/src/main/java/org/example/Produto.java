package org.example;

public class Produto {
    private String code;
    private String description;
    private double costValue;
    private int stockQuantity;
    private CategoriaProduto categoria;

    public Produto(String code, String description, double costValue, int stockQuantity, CategoriaProduto categoria){
        this.code = code;
        this.description = description;
        this.costValue = costValue;
        this.stockQuantity = stockQuantity;
        this.categoria = categoria;
    }

    public Produto(){

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCostValue() {
        return costValue;
    }

    public void setCostValue(double costValue) {
        this.costValue = costValue;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProduto categoria) {
        this.categoria = categoria;
    }
}
