package com.diego.posinfnet;

import java.math.BigDecimal;
import java.time.LocalDate;

//Padrão Criacional: Factory
//A classe AssinaturaFactoryImpl implementa a interface AssinaturaFactory e é responsável por criar as diferentes instâncias de Assinatura.
class AssinaturaFactoryImpl implements AssinaturaFactory {
 @Override
 public Assinatura criarAssinatura(BigDecimal mensalidade, LocalDate begin, LocalDate end, Cliente cliente) {
     if (end == null) {
         // Cria uma instância de AssinaturaAnual se a data de término for nula
         return new AssinaturaAnual(mensalidade, begin, cliente);
     } else {
         // Cria uma instância de AssinaturaTrimestral se a data de término for anterior a três meses a partir da data atual
         if (end.isBefore(LocalDate.now().minusMonths(3))) {
             return new AssinaturaTrimestral(mensalidade, begin, end, cliente);
         } else {
             // Cria uma instância de AssinaturaSemestral caso contrário
             return new AssinaturaSemestral(mensalidade, begin, end, cliente);
         }
     }
 }
}
