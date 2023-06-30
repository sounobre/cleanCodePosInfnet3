# Entrega 3
##### _Implementar de forma simples 2 Patterns criacionais, 1 Pattern estrutural e 1 Pattern comportamental._

 - Para rodar, baixe o código e execute LojaVirtual.java
 - O código contém os comentários dos padrões utilizados
 
- 1 Padrão Criacional: Factory Method: A interface AssinaturaFactory e a classe AssinaturaFactoryImpl foram adicionadas para criar diferentes tipos de assinaturas com base em determinadas condições. A fábrica de assinaturas (AssinaturaFactoryImpl) implementa o método criarAssinatura, que retorna a instância apropriada de Assinatura com base nos parâmetros fornecidos.

- 2 Padrão Criacional: Factory: A classe Cliente foi modificada para conter uma lista de pagamentos. Isso permite a adição de vários pagamentos para cada cliente. Além disso, a classe Pagamento foi atualizada para adicionar o pagamento à lista de pagamentos do cliente.

- 3 Padrão Estrutural: Composite: O padrão Composite não foi explicitamente adicionado neste código, mas a classe Cliente pode ser considerada um exemplo de Composite, pois contém uma lista de pagamentos.

- 4 Padrão Comportamental: Iterator: A classe ClienteIterator foi adicionada para implementar um iterador personalizado que permite percorrer os pagamentos de um cliente. O método exibirPagamentos na classe LojaVirtual utiliza o ClienteIterator para percorrer e exibir os pagamentos de cada cliente.
