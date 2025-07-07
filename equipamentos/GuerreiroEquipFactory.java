package br.edu.ifpb.ads.padroes.rpg.equipamentos;

public class GuerreiroEquipFactory implements EquipamentoFactory {
    public Arma criarArma() {
        return new Arma("Espada de Ferro", 25, "Espada");
    }
    public Armadura criarArmadura() {
        return new Armadura("Armadura de Placas", 20, "Pesada");
    }
}