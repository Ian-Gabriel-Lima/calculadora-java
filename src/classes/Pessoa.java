package classes;

import interfaces.Entityinterface;

public class Pessoa implements Entityinterface {
    String nome;


    public Pessoa(String nome) {
        this.nome = nome;
    }

    @Override
    public void save() {
        System.out.println("Salvando pessoa...");
    }
}
