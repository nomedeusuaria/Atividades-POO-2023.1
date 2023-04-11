package org.example;

public class ClientePJ extends Cliente {
    private String CNPJ;

    public ClientePJ(String name, String adress, String email, String CNPJ){
        super(name, adress, email);
        this.CNPJ = CNPJ;
    }
    public String getId() {
        return this.CNPJ;
    }
}
