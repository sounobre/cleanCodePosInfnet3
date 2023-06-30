package com.diego.posinfnet;

import java.math.BigDecimal;
import java.time.LocalDate;

//Padrão Criacional: Factory Method
//A interface AssinaturaFactory define um método para criar uma nova instância de Assinatura.
interface AssinaturaFactory {
 Assinatura criarAssinatura(BigDecimal mensalidade, LocalDate begin, LocalDate end, Cliente cliente);
}
