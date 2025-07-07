package br.edu.ifpb.ads.padroes.atv2.gateway;

public class PagSeguroSDK {
    public void efetuarPagamento(double valor) {
        System.out.println("[PagSeguro] Pagamento de R$" + valor + " processado com sucesso.");
    }
}