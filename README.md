# ArrayList vs. LinkedList

## O que São:

Ambas são tipos de listas que permitem armazenar elementos em sequência e na ordem em que são adicionados.
São parte da interface List em Java e são redimensionáveis, ou seja, podem crescer ou encolher conforme elementos são adicionados ou removidos.

## Como Funcionam Internamente:

- ArrayList:
Usa um array dinâmico (como uma "fila" de cadeiras que pode crescer) para armazenar os elementos.
Quando o array enche, ele cria um novo array maior e copia os elementos para lá.
- LinkedList:
Usa uma lista duplamente encadeada (como uma "corrente" onde cada elo sabe o anterior e o próximo).
Cada elemento é um nó que contém o valor e ponteiros para o nó anterior e o próximo.

## Quando Usar Cada Uma:

- ArrayList:
Melhor para acessar elementos por índice (como pegar um item específico rapidamente), pois é como acessar uma posição em um array.
Boa para adicionar elementos no final da lista.
Não é tão boa para inserções e remoções no meio, pois precisa mover os elementos para ajustar.
- LinkedList:
Melhor para adicionar ou remover elementos no início ou no meio, pois só ajusta os ponteiros.
Acessar um elemento específico é mais lento, pois precisa "caminhar" pelos nós para chegar até lá.

## Performance:

- ArrayList:
Acesso rápido por índice: O(1) (instantâneo).
Inserções e remoções no meio são mais lentas: O(n) (reorganiza elementos).
- LinkedList:
Inserções e remoções rápidas em qualquer posição: O(1) (só ajusta ponteiros).
Acesso por índice é lento: O(n) (precisa percorrer a lista).

## Uso de Memória:

- ArrayList:
Pode desperdiçar memória se o array interno for maior que o necessário.
Não tem ponteiros adicionais, o que torna o uso de memória por elemento mais eficiente.
- LinkedList:
Cada elemento (nó) usa mais memória porque armazena dados e dois ponteiros (para o anterior e o próximo nó).

## Resumo:

- Use ArrayList quando precisar de acesso rápido por índice e adições no final da lista.
- Use LinkedList quando precisar fazer muitas inserções ou remoções no início ou no meio da lista.
