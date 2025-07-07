package br.edu.ifpb.ads.padroes.rpg.equipamentos;

public class MagoEquipFactory implements EquipamentoFactory {
    public Arma criarArma() {
        return new Arma("Cajado Mágico", 15, "Cajado");
    }
    public Armadura criarArmadura() {
        return new Armadura("Vestes Mágicas", 8, "Leve");
    }
}