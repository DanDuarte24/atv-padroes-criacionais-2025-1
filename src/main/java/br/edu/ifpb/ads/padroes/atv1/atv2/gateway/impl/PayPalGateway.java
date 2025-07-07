package br.edu.ifpb.ads.padroes.atv2.gateway.impl;

import br.edu.ifpb.ads.padroes.atv2.gateway.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.gateway.PayPalSDK;

public class PayPalGateway implements PagamentoGateway {
    private PayPalSDK sdk = new PayPalSDK();

    public void processarPagamento(double valor) {
        sdk.sendPayment(valor);
    }
}