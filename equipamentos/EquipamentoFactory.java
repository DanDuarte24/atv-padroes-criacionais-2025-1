package br.edu.ifpb.ads.padroes.rpg.equipamentos;

public interface EquipamentoFactory {
    Arma criarArma();
    Armadura criarArmadura();
}