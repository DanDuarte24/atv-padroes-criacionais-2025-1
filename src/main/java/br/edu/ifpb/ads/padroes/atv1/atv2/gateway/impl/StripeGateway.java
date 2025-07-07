package br.edu.ifpb.ads.padroes.atv2.gateway.impl;

import br.edu.ifpb.ads.padroes.atv2.gateway.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.gateway.StripeSDK;

public class StripeGateway implements PagamentoGateway {
    private StripeSDK sdk = new StripeSDK();

    public void processarPagamento(double valor) {
        sdk.charge(valor);
    }
}