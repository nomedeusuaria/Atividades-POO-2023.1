package org.example;

public class ClientePF extends Cliente{
    private String CPF;

    public ClientePF(String name, String adress, String email, String CPF){
        super(name, adress, email);
        this.CPF = CPF;
    }
    @Override
    public String getId(){
        return "CPF: " + this.CPF;
    }
}
