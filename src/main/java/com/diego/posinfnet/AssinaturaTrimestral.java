package com.diego.posinfnet;

import java.math.BigDecimal;
import java.time.LocalDate;

class AssinaturaTrimestral extends Assinatura {
    public AssinaturaTrimestral(BigDecimal mensalidade, LocalDate begin, LocalDate end, Cliente cliente) {
        super(mensalidade, begin, end, cliente);
    }

    @Override
    public BigDecimal calcularTaxa() {
        BigDecimal valorTotalPago = getValorPago();
        return valorTotalPago.multiply(BigDecimal.valueOf(0.05));
    }

}