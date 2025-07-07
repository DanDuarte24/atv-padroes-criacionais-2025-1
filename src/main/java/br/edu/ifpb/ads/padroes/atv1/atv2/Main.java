package br.edu.ifpb.ads.padroes.atv2;

import br.edu.ifpb.ads.padroes.atv2.gateway.impl.PayPalGateway;
import br.edu.ifpb.ads.padroes.atv2.gateway.impl.StripeGateway;
import br.edu.ifpb.ads.padroes.atv2.gateway.impl.PagSeguroGateway;
import br.edu.ifpb.ads.padroes.atv2.service.PagamentoService;
import com.google.inject.*;

public class Main {
    public static void main(String[] args) {
        Injector paypalInjector = Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {
                bind(br.edu.ifpb.ads.padroes.atv2.gateway.PagamentoGateway.class).to(PayPalGateway.class);
            }
        });
        PagamentoService servicoPaypal = paypalInjector.getInstance(PagamentoService.class);
        servicoPaypal.pagar(100.00);

        Injector stripeInjector = Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {
                bind(br.edu.ifpb.ads.padroes.atv2.gateway.PagamentoGateway.class).to(StripeGateway.class);
            }
        });
        PagamentoService servicoStripe = stripeInjector.getInstance(PagamentoService.class);
        servicoStripe.pagar(200.00);

        Injector pagseguroInjector = Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {
                bind(br.edu.ifpb.ads.padroes.atv2.gateway.PagamentoGateway.class).to(PagSeguroGateway.class);
            }
        });
        PagamentoService servicoPagSeguro = pagseguroInjector.getInstance(PagamentoService.class);
        servicoPagSeguro.pagar(300.00);
    }
}