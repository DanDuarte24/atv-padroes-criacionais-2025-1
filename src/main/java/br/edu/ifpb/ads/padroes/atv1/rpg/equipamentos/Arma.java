package br.edu.ifpb.ads.padroes.rpg.equipamentos;

public class Arma {
    private String nome;
    private int dano;
    private String tipo;

    public Arma(String nome, int dano, String tipo) {
        this.nome = nome;
        this.dano = dano;
        this.tipo = tipo;
    }

    public String getNome() { return nome; }
}