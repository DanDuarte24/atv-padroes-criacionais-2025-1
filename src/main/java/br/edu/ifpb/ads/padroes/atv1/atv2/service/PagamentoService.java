package br.edu.ifpb.ads.padroes.atv2.service;

import br.edu.ifpb.ads.padroes.atv2.gateway.PagamentoGateway;

public class PagamentoService {
    private final PagamentoGateway gateway;

    public PagamentoService(PagamentoGateway gateway) {
        this.gateway = gateway;
    }

    public void pagar(double valor) {
        gateway.processarPagamento(valor);
    }
}