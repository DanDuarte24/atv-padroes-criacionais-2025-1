package br.edu.ifpb.ads.padroes.rpg.factorymethod;

import br.edu.ifpb.ads.padroes.rpg.builder.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.rpg.equipamentos.*;
import br.edu.ifpb.ads.padroes.rpg.model.Personagem;

public class CriadorHumano implements CriadorPersonagem {
    public Personagem criar(String nome, String classe) {
        EquipamentoFactory equipFactory = switch (classe) {
            case "Guerreiro" -> new GuerreiroEquipFactory();
            case "Mago" -> new MagoEquipFactory();
            case "Arqueiro" -> new ArqueiroEquipFactory();
            default -> null;
        };
        if (equipFactory == null) return null;

        String[] habilidades = switch (classe) {
            case "Guerreiro" -> new String[]{"Investida", "Bloqueio"};
            case "Mago" -> new String[]{"Bola de Fogo", "Cura"};
            case "Arqueiro" -> new String[]{"Tiro Certeiro", "Chuva de Flechas"};
            default -> new String[]{};
        };

        int forca = switch (classe) {
            case "Guerreiro" -> 15;
            case "Mago" -> 6;
            case "Arqueiro" -> 10;
            default -> 0;
        };
        int inteligencia = switch (classe) {
            case "Guerreiro" -> 8;
            case "Mago" -> 18;
            case "Arqueiro" -> 12;
            default -> 0;
        };
        int agilidade = switch (classe) {
            case "Guerreiro" -> 10;
            case "Mago" -> 8;
            case "Arqueiro" -> 16;
            default -> 0;
        };
        int vida = switch (classe) {
            case "Guerreiro" -> 120;
            case "Mago" -> 80;
            case "Arqueiro" -> 100;
            default -> 0;
        };
        int mana = switch (classe) {
            case "Guerreiro" -> 30;
            case "Mago" -> 150;
            case "Arqueiro" -> 70;
            default -> 0;
        };

        return new PersonagemBuilder()
                .comNome(nome)
                .comRaca("Humano")
                .comClasse(classe)
                .comAtributos(forca, inteligencia, agilidade, vida, mana)
                .comEquipamentos(equipFactory.criarArma(), equipFactory.criarArmadura())
                .comHabilidades(habilidades)
                .construir();
    }
}