package br.senai.sc.projeto01.modelo;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Produto implements Serializable {

    private int id;
    private String nome;
    private Float valor;

    public Produto(int id) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public Produto(int id, String nome, Float valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public Float getValor() {
        return valor;
    }

    @NonNull
    @Override
    public String toString() {
        return nome + " - " + "R$" + valor;
    }
}

