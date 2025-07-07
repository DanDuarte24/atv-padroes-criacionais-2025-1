package br.edu.ifpb.ads.padroes.atv2.gateway.impl;

import br.edu.ifpb.ads.padroes.atv2.gateway.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.gateway.PagSeguroSDK;

public class PagSeguroGateway implements PagamentoGateway {
    private PagSeguroSDK sdk = new PagSeguroSDK();

    public void processarPagamento(double valor) {
        sdk.efetuarPagamento(valor);
    }
}