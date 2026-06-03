package br.unifor.unimeds.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Medicamento {
    @Id
    private Integer id;
    private String nome;
    private Double preco;

    public Medicamento() {
    }

    public Medicamento(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
}
