package br.edu.ifpb.ads.padroes.atv2.gateway;

public class PayPalSDK {
    public void sendPayment(double amount) {
        System.out.println("[PayPal] Pagamento de R$" + amount + " processado com sucesso.");
    }
}