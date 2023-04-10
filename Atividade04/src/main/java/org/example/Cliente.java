package org.example;

public abstract class Cliente {

    private String name;
    private String adress;
    private String email;

    public abstract String getId();

    public Cliente (String name, String adress, String email){
        this.name = name;
        this.adress = adress;
        this.email = email;
    }

    public Cliente(){

    }

    @Override
    public String toString(){
        return "";
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
