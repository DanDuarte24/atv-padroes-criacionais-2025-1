package br.edu.ifpb.ads.padroes.atv2.gateway;

public class StripeSDK {
    public void charge(double value) {
        System.out.println("[Stripe] Pagamento de R$" + value + " processado com sucesso.");
    }
}