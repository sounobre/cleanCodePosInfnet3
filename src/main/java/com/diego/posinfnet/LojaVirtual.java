package com.diego.posinfnet;

import java.math.BigDecimal;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Iterator;



public class LojaVirtual {
    public static void main(String[] args) {
        // Padrão Criacional: Factory Method
        // Cria uma instância da fábrica de assinaturas
        AssinaturaFactory assinaturaFactory = new AssinaturaFactoryImpl();

        // 1. Crie alguns produtos, clientes e pagamentos
        Produto produto1 = new Produto("Música 1", Path.of("musica1.mp3"), BigDecimal.valueOf(2.99));
        Produto produto2 = new Produto("Vídeo 1", Path.of("video1.mp4"), BigDecimal.valueOf(4.99));
        Produto produto3 = new Produto("Imagem 1", Path.of("imagem1.jpg"), BigDecimal.valueOf(1.99));

        Cliente cliente1 = new Cliente("João");
        Cliente cliente2 = new Cliente("Maria");

        Assinatura assinatura1 = assinaturaFactory.criarAssinatura(BigDecimal.valueOf(99.98), LocalDate.now().minusMonths(1), null, cliente1);
        Assinatura assinatura2 = assinaturaFactory.criarAssinatura(BigDecimal.valueOf(99.98), LocalDate.now().minusMonths(2), LocalDate.now().plusMonths(4), cliente2);
        Assinatura assinatura3 = assinaturaFactory.criarAssinatura(BigDecimal.valueOf(99.98), LocalDate.now().minusMonths(3), LocalDate.now().plusMonths(2), cliente1);

        new Pagamento(Arrays.asList(produto1, produto2), LocalDate.now(), cliente1);
        new Pagamento(Arrays.asList(produto3), LocalDate.now(), cliente2);
        new Pagamento(Arrays.asList(produto1, produto3), LocalDate.now(), cliente1);

        // 2. Calcule e exiba a taxa de cada assinatura
        System.out.println("Taxa da assinatura 1: " + assinatura1.calcularTaxa());
        System.out.println("Taxa da assinatura 2: " + assinatura2.calcularTaxa());
        System.out.println("Taxa da assinatura 3: " + assinatura3.calcularTaxa());

        // 3. Exiba os pagamentos de cada cliente utilizando o padrão Comportamental: Iterator
        System.out.println("\nPagamentos do cliente 1:");
        exibirPagamentos(cliente1);

        System.out.println("\nPagamentos do cliente 2:");
        exibirPagamentos(cliente2);
    }

    // Padrão Comportamental: Iterator
    // Método para exibir os pagamentos de um cliente utilizando o ClienteIterator
    private static void exibirPagamentos(Cliente cliente) {
        Iterator<Pagamento> iterator = new ClienteIterator(cliente);
        while (iterator.hasNext()) {
            Pagamento pagamento = iterator.next();
            System.out.println("Data: " + pagamento.getDataCompra() + ", Valor: " + pagamento.calcularValorTotal());
        }
    }
}