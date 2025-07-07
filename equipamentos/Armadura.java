package br.edu.ifpb.ads.padroes.rpg.equipamentos;

public class Armadura {
    private String nome;
    private int defesa;
    private String tipo;

    public Armadura(String nome, int defesa, String tipo) {
        this.nome = nome;
        this.defesa = defesa;
        this.tipo = tipo;
    }

    public String getNome() { return nome; }
}