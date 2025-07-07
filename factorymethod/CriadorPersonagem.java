package br.edu.ifpb.ads.padroes.rpg.factorymethod;

import br.edu.ifpb.ads.padroes.rpg.model.Personagem;

public interface CriadorPersonagem {
    Personagem criar(String nome, String classe);
}