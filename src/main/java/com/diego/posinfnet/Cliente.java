package com.diego.posinfnet;

import java.util.ArrayList;
import java.util.List;

//Padrão Estrutural: Composite
//A classe Cliente representa um cliente e contém uma lista de pagamentos.
class Cliente {
 private String nome;
 private List<Pagamento> pagamentos;

 public Cliente(String nome) {
     this.nome = nome;
     this.pagamentos = new ArrayList<>();
 }

 public String getNome() {
     return nome;
 }

 public List<Pagamento> getPagamentos() {
     return pagamentos;
 }

 public void addPagamento(Pagamento pagamento) {
     pagamentos.add(pagamento);
 }
}
