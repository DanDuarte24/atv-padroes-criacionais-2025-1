package br.edu.ifpb.ads.padroes.rpg.model;

import br.edu.ifpb.ads.padroes.rpg.equipamentos.Arma;
import br.edu.ifpb.ads.padroes.rpg.equipamentos.Armadura;

public class Personagem implements Cloneable {
    private String nome, raca, classe;
    private int forca, inteligencia, agilidade, vida, mana;
    private Arma arma;
    private Armadura armadura;
    private String[] habilidades;

    public Personagem(String nome, String raca, String classe, int forca, int inteligencia, int agilidade, int vida, int mana, Arma arma, Armadura armadura, String[] habilidades) {
        this.nome = nome;
        this.raca = raca;
        this.classe = classe;
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.agilidade = agilidade;
        this.vida = vida;
        this.mana = mana;
        this.arma = arma;
        this.armadura = armadura;
        this.habilidades = habilidades;
    }

    public Personagem clonar() {
        return new Personagem(nome, raca, classe, forca, inteligencia, agilidade, vida, mana, arma, armadura, habilidades.clone());
    }

    public String getNome() { return nome; }
    public String getRaca() { return raca; }
    public String getClasse() { return classe; }
    public Arma getArma() { return arma; }
    public Armadura getArmadura() { return armadura; }

    @Override
    public String toString() {
        return String.format("%s - %s %s (F:%d, I:%d, A:%d, V:%d, M:%d)", nome, raca, classe, forca, inteligencia, agilidade, vida, mana);
    }
}