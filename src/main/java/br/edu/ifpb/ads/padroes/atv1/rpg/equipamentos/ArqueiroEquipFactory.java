package br.edu.ifpb.ads.padroes.rpg.equipamentos;

public class ArqueiroEquipFactory implements EquipamentoFactory {
    public Arma criarArma() {
        return new Arma("Arco Élfico", 20, "Arco");
    }
    public Armadura criarArmadura() {
        return new Armadura("Armadura de Couro", 12, "Média");
    }
}