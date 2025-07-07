package br.edu.ifpb.ads.padroes.rpg.builder;

import br.edu.ifpb.ads.padroes.rpg.equipamentos.*;
import br.edu.ifpb.ads.padroes.rpg.model.Personagem;

public class PersonagemBuilder {
    private String nome, raca, classe;
    private int forca, inteligencia, agilidade, vida, mana;
    private Arma arma;
    private Armadura armadura;
    private String[] habilidades;

    public PersonagemBuilder comNome(String nome) { this.nome = nome; return this; }
    public PersonagemBuilder comRaca(String raca) { this.raca = raca; return this; }
    public PersonagemBuilder comClasse(String classe) { this.classe = classe; return this; }
    public PersonagemBuilder comAtributos(int f, int i, int a, int v, int m) {
        this.forca = f; this.inteligencia = i; this.agilidade = a; this.vida = v; this.mana = m; return this;
    }
    public PersonagemBuilder comEquipamentos(Arma arma, Armadura armadura) {
        this.arma = arma; this.armadura = armadura; return this;
    }
    public PersonagemBuilder comHabilidades(String[] habilidades) { this.habilidades = habilidades; return this; }

    public Personagem construir() {
        return new Personagem(nome, raca, classe, forca, inteligencia, agilidade, vida, mana, arma, armadura, habilidades);
    }
}