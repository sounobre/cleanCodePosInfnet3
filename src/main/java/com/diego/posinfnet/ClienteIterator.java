package com.diego.posinfnet;

import java.util.Iterator;

//Padrão Comportamental: Iterator
//A classe ClienteIterator implementa um iterador personalizado para percorrer os pagamentos de um cliente.
class ClienteIterator implements Iterator<Pagamento> {
 private Cliente cliente;
 private int index;

 public ClienteIterator(Cliente cliente) {
     this.cliente = cliente;
     this.index = 0;
 }

 @Override
 public boolean hasNext() {
     return index < cliente.getPagamentos().size();
 }

 @Override
 public Pagamento next() {
     return cliente.getPagamentos().get(index++);
 }
}
